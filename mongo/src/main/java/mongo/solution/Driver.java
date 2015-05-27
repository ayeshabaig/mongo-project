package mongo.solution;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

public class Driver {
	public static void main(String[] args) {
		 MongoClient m =MongoConnector.getMongoClient("localhost", 27017);
	     Datastore ds = new Morphia().createDatastore(m, "dataSiftDB");
	     DataSiftQueryDefDAO dao=new DataSiftQueryDefDAO(ds);
	     DataSiftQueryDef obj1=new DataSiftQueryDef();
	     obj1.setObjectId(new ObjectId());
	     obj1.setQueryDef("query text goes here");
	     obj1.setQueryName("Qiery1");
	     obj1.setRequestGUID("GUUID1");
	     obj1.setStormPathID(1234);
	     obj1.setCsdValidated("CSD validated");
	     //System.out.println(dao.save(obj1));
	     //System.out.println(dao.findByrequestGUID("GUUID2"));
	   //  System.out.println(dao.findByObjectID(new ObjectId("5565d9d373122c46aa157039")));
	     //System.out.println(dao.findByStormPathID(1234));
	    // System.out.println(dao.delete(dao.findByObjectID(new ObjectId("5565d9d373122c46aa157039"))));
	     System.out.println(dao.findByQueryHashID("query text goes here"));
	}
}
