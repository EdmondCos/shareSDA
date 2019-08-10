package clinicProject.entities;

import clinicProject.database.DatabaseAccess;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class Doctor {

    private final DatabaseAccess db = DatabaseAccess.getDBAccess();

    private String name;
    private String expertise;
    private List<Pacient> pacients;

    public Doctor(String name, String expertise) {
        this.name = name;
        this.expertise = expertise;
        pacients = new ArrayList<>();

        //todo - la creare dr se salveaza in db
    }

    public String getName() {
        return name;
    }

    public String getExpertise() {
        return expertise;
    }

    public List<Pacient> getPacients() {
        return pacients;
    }

    public void addPatient(Pacient pacient) {
        //todo - adaugam pacient la doctor, daca nu exista in database
        Document doctor = db.findDocument("doctor", this.name);
        ArrayList<Pacient> pacients = (ArrayList<Pacient>) doctor.get("pacients");
        if (!pacients.contains(pacient)) {
            pacients.add(pacient);
            db.update(pacients);
        }

    }
}
