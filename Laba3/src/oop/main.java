package oop;

public class main {
    public static void main(String[] args) {
       /*Дано натуральне число n і масив дійсних чисел a[1..n]. Одержати новий
        масив, викинувши із заданого всі елементи, рівні максимальному
        елементу масиву.*/
        int n = 10;
        int[] a={10,20,23,7,23,12,13,14,19,23};
        int max = a[0], b = a[1] ;
        for (int i = 0; i <= n-1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        for (int i = 0; i <= n-1; i++) {
            if (a[i] != max) {
                b = a[i];
                System.out.println(b);
            }
        }
    }
}
