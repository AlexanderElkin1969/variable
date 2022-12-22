public class Main {
    public static void main(String[] args) {
        task1_3();
        task4();
        task5();
    }
    public static void task1_3(){
        System.out.println("Задача 1");
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog+", "+cat+", "+paper);
        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println(dog+", "+cat+", "+paper);
        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(dog+", "+cat+", "+paper);
    }
    public static void task4(){
        System.out.println("Задача 2");
        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
    }
    public static void task5(){
        System.out.println("Задача 3");
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
    }
}