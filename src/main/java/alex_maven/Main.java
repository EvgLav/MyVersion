package alex_maven;

import alex_maven.input.ConsoleInput;
import alex_maven.input.ItemInputManager;
import alex_maven.list.ClassesList;


public class Main {
    public static void main(String[] args) {


        ClassesList classesList = new ClassesList();
        ItemInputManager itemInputManager = new ItemInputManager(classesList);

        itemInputManager.addItem();
        classesList.printCars();


    }
}
