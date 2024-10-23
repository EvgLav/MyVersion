package alex_maven.input;

import alex_maven.list.ClassesList;

import java.util.Scanner;

public class ItemInputManager {
    private ClassesList classesList;

    public ItemInputManager (ClassesList classesList) {
        this.classesList = classesList;
    }

    public void addItem () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбери тип для заполнения:\n" +
                "1- car,2 - book,3 - korneplod");
        int choosse = scanner.nextInt();
        scanner.nextLine();

        if (choosse == 1) {
            classesList.addCar();
        }else if (choosse == 2) {
            classesList.addBook();
        }else if (choosse == 3) {
            classesList.addKorneplod();
        } else  {
            System.out.println("Неверный ввод");
        }
    }
}
