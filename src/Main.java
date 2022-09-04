import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 10;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать.");
        }

        //Задача 2
        int ageUser = 8;
        if (ageUser >= 7 && ageUser < 18) {
            System.out.println("Человек ходит в школу.");
        } else if (ageUser >= 18 && ageUser < 24) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        } else if (ageUser > 24) {
            System.out.println("Человек окончил университет и может отправляться на работу.");
        }
//Задача 3
        int capacityVan = 102;
        int sittingPlace = 60;
        int ticketSold = 103;
        if (ticketSold >= sittingPlace && ticketSold < capacityVan) {
            System.out.println("Все сидячие места заняты, остались стоячие ");
        } else if (ticketSold >= capacityVan) {
            System.out.println("Все места заняты");
        } else {
            System.out.println("Сидячие и стоячие места свободны.");
        }

//Задача 1 дз3
        int ageMan = 1;
        if (ageMan >= 2 && ageMan <= 6) {
            System.out.println("Если возраст человека равен " + ageMan + " ,то ему нужно ходить в детсад.");
        } else if (ageMan >= 7 && ageMan <= 18) {
            System.out.println("Если возраст человека равен " + ageMan + " ,то ему нужно ходить в школу");
        } else if (ageMan > 18 && ageMan <= 24) {
            System.out.println("Если возраст человека равен " + ageMan + " ,то ему нужно ходить в университет.");
        } else if (ageMan > 24) {
            System.out.println("Если возраст человека равен " + ageMan + " ,то ему нужно ходить на работу.");
        }

//Задача 2 дз3
        int ageChild = 15;
        boolean adult = true;
        if (ageChild <= 5) {
            System.out.println("Ребенок не может кататься на атракционах.");
        }
        if (ageChild > 14) {
            System.out.println("Можно кататься без сопровождения взрослого");
        } else if (ageChild > 5 && ageChild <= 14 && adult) {
            System.out.println("Может кататься с сопровождением взрослого.");
        } else {
            System.out.println("Взрослого нет. Кататься нельзя.");
        }
               //Задача 3 дз3
        int one = 5;
        int two = 2;
        int free = 1;
        if (one > two && one > free) {
            System.out.println(one);
        } else if (two > one && two > free) {
            System.out.println(two);
        } else {
            System.out.println(free);
        }
    }
}