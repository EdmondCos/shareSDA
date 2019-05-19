package com.sda.fisiere;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        IFileManipulator modern = new ModernFileManipulator();
//        Citim din fisierul de pe desktop
        List<String> lines = modern.readFromFile(PathType.ABSOLUTE);
        System.out.println("Continut fisier de la path absolut (citire): ");
        printLines(lines);

//        Citim din fisierul din resources (vezi target/classes)
        List<String> relativePathFileContent = modern.readFromFile(PathType.RELATIVE);
        System.out.println("Continut fisier de la path relativ (citire): ");
        printLines(relativePathFileContent);

//        Scriem in fiseier de la path relativ
        modern.writeToFile(lines, true);
        System.out.println("Nou continut fisier de la path absolut (citire): ");
        printLines(modern.readFromFile(PathType.RELATIVE));

//        legacyFileManipulator();
    }

    private static void legacyFileManipulator() {
        IFileManipulator legacy = new LegacyFieldManipulator();
//        Citim din fisierul de pe desktop
        List<String> lines = legacy.readFromFile(PathType.ABSOLUTE);
        System.out.println("Continut fisier de la path absolut (citire): ");
        printLines(lines);

//        Citim din fisierul din resources (vezi target/classes)
        List<String> relativePathFileContent = legacy.readFromFile(PathType.RELATIVE);
        System.out.println("Continut fisier de la path relativ (citire): ");
        printLines(relativePathFileContent);

//        Scriem in fiseier de la path relativ
        legacy.writeToFile(lines, false);
        System.out.println("Nou continut fisier de la path absolut (citire): ");
        printLines(legacy.readFromFile(PathType.RELATIVE));
    }

    private static void printLines(List<String> lines) {
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
