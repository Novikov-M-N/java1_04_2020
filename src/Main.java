public class Main {
    public static void main(String[] args) {
        System.out.println("task3: "+task3(1,2,3,4));
        System.out.println("task4: "+task4(15,15));
        task5(-15);
        System.out.println("task6: "+task6(-2));
        task7("Чак Норрис");
        task8(1900);
    }

    //Метод по вычислению a*(b+(c/d))
    static float task3(float a, float b, float c, float d){
        return a*(b+(c/d));
    }

    //Метод определяет, лежит ли сумма двух чисел
    // в пределах от 10 до 20
    static boolean task4(int a, int b){
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    //Метод определяет, является ли аргумент положительным числом,
    //и выводит результат на печать
    static void task5(int a){
        if(a>=0){
            System.out.println("task5: Аргумент положительный");
        } else {
            System.out.println("task5: Аргумент отрицательный");
        }
    }

    //Метод возвращает true, если число отрицательное
    static boolean task6(int a){
        return a<0;
    }

    //Метод здоровается по имени
    static void task7(String name){
        System.out.println("task7: Привет, " + name + "!");
    }

    //Метод вычисляет, является ли год високосным
    //и выводит сообщение в консоль
    static void task8(int year){
        if ((year%4 == 0 && year%100 != 0) || year%400 == 0){
            System.out.println("task8: Год " + year + " високосный");
        } else System.out.println("task8: Год " + year + " не високосный");
    }
}
