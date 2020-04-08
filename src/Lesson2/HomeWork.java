package Lesson2;

import java.util.Arrays;

public class HomeWork {

    //Метод создаёт массив из чисел 0 и 1 и инвертирует значения элементов
    static void task1(){
        int[] arr = {1, 0, 1, 0, 0, 1, 1, 0, 1, 0};
        for (int i = 0; i <10 ; i++) {
            if (arr[i] == 0){
                arr[i] = 1;
            } else arr[i] = 0;
        }
        System.out.println("task 1: " + Arrays.toString(arr));
    }

    //Метод создаёт пустой массив и заполняет его значениями 0, 3, 6, 9, 12, 15, 18, 21
    static void task2(){
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = i*3;
        }
        System.out.println("task 2: " + Arrays.toString(arr));
    }

    // Метод создаёт массив и умножает на 2 значения элементов, меньших 6
    static void task3(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i <12 ; i++) {
            if(arr[i] < 6){
                arr[i]*=2;
            }
        }
        System.out.println("task 3: " + Arrays.toString(arr));
    }

    //Метод создаёт квадратную матрицу и заполняет её диагональные элементы единицами.
    static void task4() {
        System.out.println("task 4:");
        int[][] arr = new int[5][5];
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                if(i == j){
                    arr[i][j] = 1;
                }
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }

    //Метод находит минимальное и максимальное значение в массиве
    static void task5(){
        int[] arr = {2, 5, 3, 2, 11, 4, 82, 2, -4, 8, 9, 1};
        int min = arr[0];
        int max = arr[0];
        for (int a:arr) {
            if(a < min){
                min = a;
            }
            if(a>max){
                max = a;
            }
        }
        System.out.println("task 5: min = " + min + "; max = " + max);
    }

    //Метод определяет, есть ли в массиве место, относительно которого
    //равны суммы элементов слева и справа
    static boolean task6(int[] arr){
        int sumLeft;
        int sumRight;
        for (int i = 0; i <arr.length ; i++) {
            sumLeft = 0;
            sumRight = 0;
            for (int j = 0; j <=i ; j++) {
                sumLeft += arr[j];
            }
            for (int j = i + 1; j <arr.length ; j++) {
                sumRight += arr[j];
            }
            if(sumLeft == sumRight){
                return true;
            }
        }
        return false;
    }


    //Метод смещает элементы массива на n позиций. n может быть отрицательным.
    static void task7(int[] arr, int n){
        // Переменная buffer хранит крайний элемент массива, пока все остальные смещаются.
        // После смещения этот элемент вставляется на противоположный край.
        int buffer;

        // В случае, если n больше длины массива, уменьшаем n,
        // т.к. результаты смещения эквивалентны через каждую
        // полную длину массива.
        n %= arr.length;
        // Если n превышает половину длины массива, имеет смысл сместить массив
        // в обратную сторону на число позиций arr.length - |n|. Результаты будут эквивалентны.
        // В случае с большими массивами может существенно сократить количество итераций.
        if(n>0 && n > arr.length / 2){
            n -= arr.length;
        }
        if(n<0 && n < -arr.length / 2){
            n += arr.length;
        }

        //Смещаем массив на n позиций вправо
        if(n > 0) {
            for (int i = 0; i < n; i++) {
                buffer = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = buffer;
                //System.out.println(Arrays.toString(arr));
            }
        // или влево в зависимости от знака переменной n
        } else if(n < 0) {
            for (int i = 0; i > n; i--) {
                buffer = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = buffer;
                //System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println("task 7: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        int[] arr6 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("task 6: " + task6(arr6));
        int[] arr7 = {1, 2, 3, 4, 5, 6, 7, 8};
        task7(arr7, -10);
    }
}
