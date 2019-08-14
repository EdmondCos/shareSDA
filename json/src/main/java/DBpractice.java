import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;

import static com.mongodb.client.model.Filters.eq;

public class DBpractice {
    public static void main(String[] args) {
        MongoClient client = new MongoClient();
        MongoDatabase database = client.getDatabase("bd");
        MongoCollection<Document> collection = database.getCollection("test");
        ArrayList x = new ArrayList<>();
        ArrayList xx = new ArrayList<>();
        x.add("boss");
        x.add("class");
        x.add("drop");
        x.add("also");

        xx.add("cal");
        xx.add("arc");
        xx.add("pac");
        xx.add("rac");

        Document first = new Document("nume", "Abc").append("spec", x);
        Document second = new Document("nume", "Xyz").append("spec", x);
//        collection.insertOne(second);
//        collection.insertOne(first);

//        FindIterable<Document> documents = collection.find();
//        MongoCursor<Document> iterator = documents.iterator();

        Document document = collection.find(new Document("spec","boss")).first();
//        System.out.println(document);

//        ArrayList list = (ArrayList)document.get("spec");
//        System.out.println(list);
        collection.updateOne(eq("nume", "Xyz"),
                new Document("$set", new Document("spec",xx)));
    }
}
