package clinicProject.clinic;

import clinicProject.entities.Doctor;

public class Controller {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Alex Ionescu", "cardiologie");
        doctor.addPatient();
    }
}
