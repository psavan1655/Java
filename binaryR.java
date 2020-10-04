import java.util.Scanner;

/**
 * binaryR
 */
public class binaryR {
    public static int func(int a[], int key, int i, int j) {
        int m = (i + j) / 2;
        if (j >= i) {
            if (key == a[m]) {
                return m;
            } else if (key < a[m] && i < m) {
                return func(a, key, i, m - 1);
            } else if (key > a[m] && j > m) {
                return func(a, key, m + 1, j);
            }
             m = (i + j) / 2;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of array that you want to make:");
        int size = scan.nextInt();
        int a[] = new int[size];
        System.out.println("enter the array:");
        for (int i = 0; i < size; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("enter the new element whos index you want to search:");
        int key = scan.nextInt();
        int print = func(a, key, 0, size);
        if (print == -1) {
            System.out.println("element not found!");
        } else {
            System.out.println("index=" + print);
        }
        scan.close();

    }
}