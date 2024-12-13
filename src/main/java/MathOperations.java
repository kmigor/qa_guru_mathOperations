public class MathOperations {
    public static void main(String[] args) {
        //Арифметичеслкие операции над int и int
        int a = 20;
        int b = 30;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));

        //Арифметичеслкие операции над int и double

        int c = 10;
        double d = 4.5;

        System.out.println("c + d = " + (c + d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c / d = " + (c / d));
        System.out.println("c % d = " + (c % d));

        //Логические оператции

        String work = "Test";
        int age = 8;

        System.out.println(work.equals("Test") && age == 8);
        System.out.println(work.equals("Apple") || age >= 8);
        System.out.println(work.equals("Apple") || age <= 34);
        System.out.println(work.equals("Test") && age != 34);

        //Переполнение

        byte firstValue = 127;
        byte secondValue = 10;

        byte result = (byte) (firstValue + secondValue);
        System.out.println("Result: " + result);


    }
}
