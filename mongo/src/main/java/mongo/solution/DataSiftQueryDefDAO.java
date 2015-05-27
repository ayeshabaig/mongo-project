package mongo.solution;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.BasicDAO;

import com.mongodb.WriteResult;

public class DataSiftQueryDefDAO extends BasicDAO<DataSiftQueryDef, ObjectId> {
	private Datastore dataStore;
	protected DataSiftQueryDefDAO(Datastore ds) {
		super(ds);
		this.dataStore=ds;
	}
	public DataSiftQueryDef findByrequestGUID(String requestGUID){
		return dataStore.find(DataSiftQueryDef.class, "requestGUID", requestGUID).get();
	}
	public List<DataSiftQueryDef> findByStormPathID(int stormPathId){
		return dataStore.find(DataSiftQueryDef.class, "stormPathID",stormPathId).asList();
	}
	public DataSiftQueryDef findByObjectID(ObjectId objectId){
		return dataStore.get(DataSiftQueryDef.class,objectId);
	}
	public DataSiftQueryDef findByQueryHashID(String queryHashId){
		return dataStore.find(DataSiftQueryDef.class, "queryDef", queryHashId).get();
	}
	public Key<DataSiftQueryDef> save(DataSiftQueryDef dataSiftQueryDef){
		return dataStore.save(dataSiftQueryDef);
	}
	public WriteResult  delete(DataSiftQueryDef dataSiftQueryDef){
		return dataStore.delete(dataSiftQueryDef);
	}


}
