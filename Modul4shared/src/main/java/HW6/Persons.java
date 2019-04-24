package HW6;

import java.time.LocalDate;

public class Persons {
    private static String lastName;
    private static String firstName;
    private static LocalDate birthday;
    private static Persons test;


    public static void pers(String lastName, String firstName, LocalDate birthday) {
    }

    public static void sort(Persons array[]) {
        boolean bol;
        do {
            bol = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].getLastName().compareTo(array[i + 1].getLastName()) > 0) {
                    Persons temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    bol = true;
                } else if (array[i].getLastName().equals(array[i + 1].getLastName())) {
                    if (array[i].getFirstName().compareTo(array[i + 1].getFirstName()) > 0) {
                        Persons temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        bol = true;
                    }
                }
            }
        } while (bol);
    }


    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String toStrings() {
        return lastName + " " + firstName + " " + birthday;
    }

}
