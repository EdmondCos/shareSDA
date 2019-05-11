package HW6;

import java.time.LocalDate;

public class Persons {
    private String lastName;
    private String firstName;
    private LocalDate birthday;

    public Persons(String lastName, String firstName, LocalDate birthday) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
    }

    public static void sort(Persons[] array) {
        boolean bol;
        do{
            bol = false;
            for (int i = 0; i<array.length-1; i++){
                if (array[i].getBirthday().isAfter(array[i+1].getBirthday())){
                    Persons temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    bol = true;
                }
            }
        }while (bol);
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String toStrings() {
        return lastName + " " + firstName + " " + birthday;
    }

}
