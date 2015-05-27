package mongo.solution;

import java.net.UnknownHostException;

import com.mongodb.MongoClient;

public class MongoConnector {
	public static MongoClient getMongoClient(String host,int port){
		try {
			return new MongoClient(host,port);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	} 

}
