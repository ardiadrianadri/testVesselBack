package es.test.vessel.configuration;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.WriteResultChecking;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@PropertySources(value={@PropertySource("classpath:mongodb.properties")})
@EnableMongoRepositories(Constants.REPOSITORIES)
public class AplicationContext extends RepositoryRestMvcConfiguration{
	
	@Autowired
	private Environment env;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	public UserCredentials getUserCredentials (){
		String user = env.getProperty(Constants.DB_USER);
		String passwd = env.getProperty(Constants.DB_PASSWD);
		UserCredentials userCredentials = null;
		
		if (!Constants.DEFAULT_VALUE.equals(user) && !Constants.DEFAULT_VALUE.equals(passwd)){
			userCredentials = new UserCredentials(user,passwd);
		}
		
		return userCredentials;
	}
	
	@Bean
	public Mongo getMongoConnection(){
		String host = env.getProperty(Constants.DB_HOST);
		String port = env.getProperty(Constants.DB_PORT);
		Mongo mongo = null;
		
		try {
			if (Constants.DEFAULT_VALUE.equals(port)){
				mongo = new MongoClient(host);
			} else {
				mongo = new MongoClient(host,Integer.parseInt(port));
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mongo;
	}
	
	@Bean
	public MongoDbFactory mongoDbFactory(){
		UserCredentials userCredentials = getUserCredentials();
		MongoDbFactory mongoFactory = null;
		String dbName = env.getProperty(Constants.DB_NAME);
		
		if (userCredentials != null){
			mongoFactory = new SimpleMongoDbFactory(getMongoConnection(),dbName,userCredentials);
		} else {
			mongoFactory = new SimpleMongoDbFactory(getMongoConnection(),dbName);
		}
		
		return mongoFactory;
	}
	
	@Bean
	public MongoTemplate mongoTemplate() {
		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
		mongoTemplate.setWriteResultChecking(WriteResultChecking.EXCEPTION);
		
		return mongoTemplate;
	}
}
