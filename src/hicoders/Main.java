package hicoders;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(calculateTotalWage());

    }

    public static int getRandomNumber(){
        int min = 2;
        int max = 6;

        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

        return random_int;
    }

    public static String getRandomWorker(){
        String[] workers = {"lazyWorker", "childWorker", "goodWorker", "disabledWorker"};

        Random randomWorkers = new Random();

        int indexWorkers = randomWorkers.nextInt(workers.length);

        return workers[indexWorkers];
    }

    public static int calculateTotalWage(){

        Lazy lazyWorker = new Lazy();
        Child childWorker = new Child();
        Good goodWorker = new Good();
        Disabled disabledWorker = new Disabled();

        int totalWage = 0;

        for (int i = 1; i < getRandomNumber() ; i++) {

            String worker = getRandomWorker();

            switch (worker) {
                case "lazyWorker":
                    totalWage += lazyWorker.calculateWeeklyWage();
                    break;
                case "childWorker":
                    totalWage += childWorker.calculateWeeklyWage();
                    break;
                case "goodWorker":
                    totalWage += goodWorker.calculateWeeklyWage();
                    break;
                case "disabledWorker":
                    totalWage += disabledWorker.calculateWeeklyWage();
                    break;
            }
        }

        return totalWage;
    }

}

