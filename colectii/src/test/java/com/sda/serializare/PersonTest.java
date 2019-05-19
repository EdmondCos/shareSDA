package com.sda.serializare;

import com.sda.fisiere.IFileManipulator;
import com.sda.fisiere.ModernFileManipulator;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertNotNull;

public class PersonTest {

    private Person person = new Person("Gheorghe", 18);

    @Test
    public void testSerializare() {
        String pathAddress = PersonTest.class
                .getClassLoader()
                .getResource("person.txt")
                .getPath()
                .replace("%20", " ");

        File file = new File(pathAddress);

        try {
            FileOutputStream fileOutputStream =
                    new FileOutputStream(file);
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Declaram un obiect de tip Person care va contine obiectul citit din fisier
        Person readPerson = readPersonFromFile(file);

//        Verificam ca am reusit sa cititm ceva
        assertNotNull(readPerson);
        System.out.println(readPerson.getNume());
        System.out.println(readPerson.getVarsta());
    }

    private Person readPersonFromFile(File file) {
        Person readPerson = null;
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream =
                     new ObjectInputStream(fileInputStream)) {
//            citim din fisier un obiect pe care il castam la Person
            readPerson = (Person) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return readPerson;
    }
}

