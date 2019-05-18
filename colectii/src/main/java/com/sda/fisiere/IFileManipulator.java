package com.sda.fisiere;

import java.util.List;

public interface IFileManipulator {

    String ABSOLUTE_PATH = "C:\\Users\\Elena The Bo$$\\Desktop\\absoluteFile.txt";
    String RELATIVE_PATH = IFileManipulator.class.getClassLoader().getResource("relativeFile.txt").getPath();

    //    reads data from file and saves in a List
    List<String> readFromFile(PathType pathType);

    //    write data from List to a different file
    void writeToFile(List<String> linesToWrite);
}
