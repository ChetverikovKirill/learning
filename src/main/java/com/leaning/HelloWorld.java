package com.leaning;

public class HelloWorld {
    public static void main(String[] args) {
        //Задан массив из чисел, где все числа встречаются четное количество раз, и только одно число - нечетное количество раз.
        // Вычислить это число

        int[] array = {2, 2, 2, 2, 1, 3, 1};
        System.out.println(searchNumber(array));
    }

    static int searchNumber(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int check = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j])
                    check++;
            }
            if (check % 2 != 0)
                return array[i];
        }
        return -1;
    }


    public static void main9(String[] args) {
        //Метод должен посчитать разницу между минимальным и максимальным значениями элементов массива целых чисел
        int[] array = {5, 11, 2, 16, 1, 3, 100};

        System.out.println(toValue(array));
    }

    static int toValue(int[] array) {
        int minValue = array[0];
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            } else if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("max = " + maxValue);
        System.out.println("min = " + minValue);
        return maxValue - minValue;
    }

    public static void main8(String[] args) {
        //F(n) - значение n-ного числа Фибоначчи
        //Требуется реализовать методы для итеративного и рекурсивного вычисления F(n)
        //Указать алгоритмическую сложность и сложность по памяти


        fib(6); //Olog(3)
        System.out.println(fibRec(4));
    }

    static int fib(int n) {
        int f1 = 0;
        int f2 = 1;
        for (int i = 2; i <= n; i++) {
            int value = f1 + f2;
            f1 = f2;
            f2 = value;
        }
        System.out.println("value = " + f2);
        return n;

        // Olog(n)


    }

    static int fibRec(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibRec(n - 1) + fibRec(n - 2);
        }
        // Olog(n)
    }

    public static void main7(String[] args) {
        //int x = ...;
        //int y = ...;
        //Требуется поменять местами значения переменных, то что лежало в x поместить в y, и наоборот. Запрещено пользоваться буферной переменной

        int x = 2;
        int y = 3;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = x + y; // 5
        y = x - y; // 2
        x = -y + x; //3

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }

    public static void main6(String[] args) {
        System.out.println(factorial(6));
        System.out.println(factorialRec(6));
    }

    static int factorial(int n) { //n! = 1 * 2 * .. * n
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialRec(int n) {  //n! = (1 * 2 * .. * n-1) * n = (n-1)! * n
        if (n <= 1) {
            return 1;
        }
        return factorialRec(n - 1) * n;
    }


    public static void main5(String[] args) {
        int x = 5;
        int res = sum(x, 6);
        System.out.println(res);

        int c2 = 15;
        incrementAndPrint(c2);
        System.out.println(c2);
    }

    static int sum(int x, int y) { //sum[int, int] - signature
        boolean b = true;
        int result = x + y;
        if (b) {
            return result;
        } else {
            return 0;
        }
    }

    static long sum(int x, long y) {
        return x + y;
    }

    static void incrementAndPrint(int x) {
        x++;
        System.out.println(x);
    }

    public static void main4(String[] args) {
        int x = 5;
        while (x < 10) {
            System.out.println(x);
            x++;
        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int result = i * j;
                if (result % 2 == 0) {
                    continue;
                }
                System.out.println("i = " + i + " j = " + j + " result " + result);
            }
        }
    }

    public static void main3(String[] args) {


        boolean b = true;
        if (!b) {
            System.out.println("yes");
        }

        String result = b ? "yes" : "no";


        int x = 10;
        if (x > 5) {
            int y = 5;
            System.out.println("gt 5");
        } else if (x > 4) {
            System.out.println("gt 4");
        }
    }

    public static void main2(String[] args) {
        int x;
        // System.out.println(x);
        x = 10; //init
        x = 20; //assing
        System.out.println("Hello world");

        //byte, char, short, int, long
        //[-2 ^ 31; 2^31 - 1]
        x = Integer.MAX_VALUE;
        System.out.println(x);
        x++; //overflow
        System.out.println(x);

        //0000, 0001, ... 1111
        //0101 (x) - ? (10) = 0 * 2^3 + 1 * 2^2 + 0 * 2^1 + 1 * 2^0 = 6

        //float double

        boolean b1;
        boolean b2;
        boolean b3;
        //boolean result = b1 && (b2 || b3); //(b1 && b2) || (b1 && b3)
        /*
        X    Y    X and Y     X or Y    X xor Y   not X
        0    0       0          0          0       1
        0    1       0          1          1
        1    0       0          1          1       0
        1    1       1          1


        b1   b2  b3   (b2 || b3)   b1 && (b2 || b3)     b1&&b2    b1&b3     (b1 && b2) || (b1 && b3)
        0    0    0       0            0                  0         0                  0
        0    0    1       1            0
        //todo
         */
    }

}
