import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.LinkedList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;

public class DatabaseConnection {
    public static void main(String[] args) {

        //open a connection(also needs to close)
        MongoClient client = new MongoClient();

        //connect to database
        MongoDatabase database = client.getDatabase("biblioteca_java");

        //extract collection
        MongoCollection<Document> carti = database.getCollection("carti");

        //create new doc
        Document myFirstBook = new Document("autor", "Jules Verne").
                append("titlu", "20 000 de leghe sub mari").
                append("disponibil", true);

        //save doc in db
        carti.insertOne(myFirstBook);


        //extragem doc din db si il salvam pe primul
        Document first = carti.find().first();
        System.out.println(first);

        System.out.println("Structura unui doc in Java: " + new Document());

        //update query
        carti.updateOne(eq("titlu", "20 000 de leghe sub mari"),
                new Document("$set", new Document("titlu", "20.000 de leghe sub mari")) );

//        insertBatch(100, carti);
        afiseazaContinut(carti);

        carti.deleteMany(new Document());
        if (carti.find().iterator().hasNext()) {
            System.out.println("Au ramas doc in db");
        } else {
            System.out.println("Nu a mai ramas nimic");
        }

        // inchidem conexiunea
        client.close();
    }

    private static void afiseazaContinut(MongoCollection<Document> carti) {
        FindIterable<Document> documents = carti.find();
        MongoCursor<Document> iterator = documents.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void insertBatch(int limit, MongoCollection<Document> carti) {
//        for (int i = 0; i < limit; i++) {
//            carti.insertOne(new Document("i", i));
//        }

        List<Document> documente = new LinkedList<>();
        for (int i = 0; i < limit; i++) {
            documente.add(new Document("i", i));
        }
        carti.insertMany(documente);
    }
}
