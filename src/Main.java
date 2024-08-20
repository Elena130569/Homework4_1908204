public class Main {
    public static void main(String[] args) {
        int age1 = 25;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + " , то он совершеннолетний");
        }
        if (age1 < 18) {
            System.out.println("Если возраст человека меньше 18, то он не достиг совершеннолетия и надо немного подождать");
        }
        int age2 = 12;
        if (age2 >= 18) {
            System.out.println("Если возраст человека больше 18, то он совершеннолетний");
        }
        if (age2 < 18) {
            System.out.println("Если возраст человека равен " + age2 + " , то он не достиг совершеннолетия и надо немного подождать");
        }

        int temperature1 = 0;
        if (temperature1 < 5) {
            System.out.println("На улице " + temperature1 + " градусов, холодно и надо одеть шапку");
        }
        if (temperature1 > 5) {
            System.out.println("На улице температура выше 5 градусов, можно идти без шапки");
        }
        int temperature2 = 15;
        if (temperature2 < 5) {
            System.out.println("На улице температура ниже 5 градусов, холодно и надо одеть шапку");
        }
        if (temperature2 > 5) {
            System.out.println("На улице " + temperature2 + " градусов, можно идти без шапки");
        }

        int speedCar1 = 80;
        if (speedCar1 > 60) {
            System.out.println("Если скорость " + speedCar1 + " км/ч - придется заплатить штраф");
        } else {
            System.out.println("Можно ездить спокойно");
        }

        int speedCar2 = 40;
        if (speedCar2 <= 60) {
            System.out.println("Если скорость " + speedCar2 + " км/ч - можно ездить спокойно");
        } else {
            System.out.println("Придется заплатить штраф");
        }

        int age3 = 4;
        if (age3 > 2 && age3 < 6) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в детский сад");
        }
        if (age3 > 7 && age3 < 17){
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в школу");
        }
        if (age3 >= 18 && age3 <= 24) {
            System.out.println("Если возраст человека равен " + age3 + ", то его место в университете");
        }
        if (age3 > 24) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему пора ходить на работу");
        }

        int age4 = 13;
        if (age4 > 2 && age4 < 6) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад");
        }
        if (age4 > 7 && age4 < 17){
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу");
        }
        if (age4 >= 18 && age4 <= 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то его место в университете");
        }
        if (age4 > 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему пора ходить на работу");
        }

        int age5 = 21;
        if (age5 > 2 && age5 < 6) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в детский сад");
        }
        if (age5 > 7 && age5 < 17){
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в школу");
        }
        if (age5 >= 18 && age5 <= 24) {
            System.out.println("Если возраст человека равен " + age5 + ", то его место в университете");
        }
        if (age5 > 24) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему пора ходить на работу");
        }

        int age6 = 47;
        if (age6 > 2 && age6 < 6) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить в детский сад");
        }
        if (age6 > 7 && age6 < 17){
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить в школу");
        }
        if (age6 >= 18 && age6 <= 24) {
            System.out.println("Если возраст человека равен " + age6 + ", то его место в университете");
        }
        if (age6 > 24) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему пора ходить на работу");
        }

        int ageChild1 = 3;
        if (ageChild1 < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild1 + ", то ему нельзя кататься на аттракционе");
        }
        if (ageChild1 > 5 && ageChild1 < 14){
            System.out.println("Если возраст ребенка равен " + ageChild1 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (ageChild1 > 14) {
            System.out.println("Если возраст ребенка равен " + ageChild1 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int ageChild2 = 8;
        if (ageChild2 < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild2 + ", то ему нельзя кататься на аттракционе");
        }
        if (ageChild2 > 5 && ageChild2 < 14){
            System.out.println("Если возраст ребенка равен " + ageChild2 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (ageChild2 > 14) {
            System.out.println("Если возраст ребенка равен " + ageChild2 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int ageChild3 = 16;
        if (ageChild3 < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild3 + ", то ему нельзя кататься на аттракционе");
        }
        if (ageChild3 > 5 && ageChild3 < 14){
            System.out.println("Если возраст ребенка равен " + ageChild3 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (ageChild3 > 14) {
            System.out.println("Если возраст ребенка равен " + ageChild3 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int numberPassanger1 = 80;
        if (numberPassanger1 < 102) {
            System.out.println("В вагоне есть места");
        } else {
            System.out.println("В вагоне нет мест");
        }
        if (numberPassanger1 < 102 && numberPassanger1 < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else {
            System.out.println("В вагоне нет сидячих мест");
        }

        int one = 12;
        int two = 7;
        int three = 18;
        if (three > one && three > two) {
            System.out.println(+ three + " является самым большим числом среди данных трех чисел");
        } else {
            System.out.println();
        }
        if (one > two && one > three) {
            System.out.println(+ one + " является самым большим числом среди данных трех чисел");
        } else {
            System.out.println();
        }
        if (two > one && two > three) {
            System.out.println(+ two + " является самым большим числом среди данных трех чисел");
        } else {
            System.out.println();
        }
    }
}
