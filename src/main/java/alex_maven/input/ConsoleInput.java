package alex_maven.input;

import alex_maven.Types.Book;
import alex_maven.Types.Korneplod;
import alex_maven.list.ClassesList;
import alex_maven.Types.Car;

import java.util.Map;
import java.util.Scanner;

//Класс для ввода пользователя с консоли
public class ConsoleInput {

    public ClassesList classesList;


    public ConsoleInput() {
        this.classesList = classesList;
    }

    public void showType() {
        System.out.println("Введи тип данных: car, book, korneplod");
    }

    public  void chooseType() {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "car" -> classesList.addCar();
            case "book" -> classesList.addBook();
            case "korneplod" -> classesList.addKorneplod();
        }
    }

}


//public class ManualFeel implements Action {
//    private final Storage storage;
//
//    public ManualFeel(Storage storage) {
//        this.storage = storage;
//    }
//
//    private void load(Map<String, String> params) throws ValidationError {
//        String type = params.get("type");
//        switch (type) {
//            case "animal" -> storage.add(AnimalMapper.fromMap(params));
//            case "barrel" -> storage.add(BarrelMapper.fromMap(params));
//            case "human" -> storage.add(HumanMapper.fromMap(params));
//        }
//    }
//
//    @Override
//    public String doing(Map<String, String> params) {
//        try {
//            this.load(params);
//        } catch (ValidationError e) {
//            return "-- Ошибка: " + e.getMessage();
//        }
//        return "";
//    }
//}