package clinicProject.database;

import clinicProject.entities.Pacient;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;

public class DatabaseAccess {
    private MongoClient client;
    private MongoDatabase database;
    private static DatabaseAccess db;

    public DatabaseAccess() {
        this.client = new MongoClient();
        this.database = client.getDatabase("Clinic");
    }

    public static DatabaseAccess getDBAccess() {
        if (db == null) {
            db = new DatabaseAccess();
        }
        return db;
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public void closeClientConnection() {
        client.close();
    }

    public Document findDocument(String entityType, String nume) {
        String collectionName = "doctori";
        if ("pacienti".equals(entityType)) {
            collectionName = "pacienti";
        }

        MongoCollection<Document> collection = database.getCollection(collectionName);
        return collection.find(new Document("nume", nume)).first();
    }

    public void update(ArrayList<Pacient> pacinti) {
        MongoCollection<Document> doctori = database.getCollection("doctori");
        doctori.updateOne();
    }

}
