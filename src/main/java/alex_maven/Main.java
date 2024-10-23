package alex_maven;


import alex_maven.input.ItemInputManager;
import alex_maven.list.ClassesList;
import alex_maven.list.WriterCSV;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {


        ClassesList classesList = new ClassesList();
        ItemInputManager itemInputManager = new ItemInputManager(classesList);
        WriterCSV writerCSV = new WriterCSV();

        itemInputManager.addItem();
        itemInputManager.addItem();

        writerCSV.writeCars(classesList.getCarList(), "CARS.csv");
        classesList.printCars();


    }
}
