public class Main {

    // Техники тест дизайна


    // age < 18 - 10%,
    // age < 55 - 20%,
    // age < 90 - 30%
    public static void ageTest(int age) {
        if (age < 0) {
            System.out.println("Error");
        } else if (age < 18) {
            System.out.println("10%");
        } else if (age < 55) {
            System.out.println("20%");
        } else if (age < 90) {
            System.out.println("30%");
        } else if (age >= 90) {
            System.out.println("You must be dead");
        }
    }

    public static void main(String[] args) {
        // Эквивалентное разбиение
        System.out.println("Эквиваленты");
        ageTest(11);
        ageTest(30);
        ageTest(70);

        // Граничные значения
        System.out.println("Граничные значения");
        System.out.println("\n0_____");
        ageTest(-1);
        ageTest(0);
        ageTest(1);

        System.out.println("\n18_____");
        ageTest(17);
        ageTest(18);
        ageTest(19);

        System.out.println("\n55_____");
        ageTest(54);
        ageTest(55);
        ageTest(56);

        System.out.println("\n90_____");
        ageTest(89);
        ageTest(90);
        ageTest(91);
        ageTest(0);
        // Ноль - проверяем как наша программа отработает с 0 или пустотой

        // Парное тестирование
        // Какие возможны сценарии:
        //1.       Правильный логин и правильный пароль.
        //2.       Правильный логин, неправильный пароль.
        //3.       Неправильный логин, правильный пароль.
        //4.       Неправильный логин, неправильный пароль.
    }
}