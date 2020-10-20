package itmostady.lesson11.Enum.Task1;


public class App {
    public static void main(String[] args) {
        User ivan = new User("Иван Петров", Position.ДИРЕКТОР);
        Storage director = new Storage();
        director.addDirector(ivan);
        User ola = new User("Оля Сидорова", Position.БУХГАЛТЕР);
        User sasha = new User("Саша Иванов", Position.УБОРЩИК);
        Storage cleaner = new Storage();
        Storage accountant = new Storage();
        User dima = new User("Дима Козлов", Position.УБОРЩИК);
        cleaner.addCleaner(sasha);
        accountant.addAccountant(ola);
        accountant.addAccountant(dima);
        System.out.println(director);
        System.out.println(cleaner);
        System.out.println(accountant);


    }
}
