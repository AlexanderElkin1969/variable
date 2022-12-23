public class Main {
    public static void main(String[] args) {
        task1_3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1_3() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 1: " + dog + ", " + cat + ", " + paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Задача 2: " + dog + ", " + cat + ", " + paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Задача 3: " + dog + ", " + cat + ", " + paper);
    }
    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Задача 6");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var weight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес двух бойцов : " + weight + "кг");
        weight = weightFirstBoxer - weightSecondBoxer;
        if (weight < 0) weight = 0 - weight;
        System.out.println("Разница в весе составляет : " + weight + "кг");
    }
    public static void task7() {
        System.out.println("Задача 7");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var weight = weightSecondBoxer-weightFirstBoxer;
        System.out.println("1 Разница в весе составляет : " + weight + "кг");
        weight = weightSecondBoxer % weightFirstBoxer;
        System.out.println("2 Разница в весе составляет : " + weight + "кг");
    }
    public static void task8() {
        System.out.println("Задача 8");
        var workingHour = 640;
        var numberЕmployees = workingHour/8;
        System.out.println("1 В компании " + numberЕmployees + " сотрудников");
        workingHour = workingHour/(numberЕmployees+94);
        System.out.println("2 С дополнительной помощью справятся за " + workingHour + " часа");
    }
}