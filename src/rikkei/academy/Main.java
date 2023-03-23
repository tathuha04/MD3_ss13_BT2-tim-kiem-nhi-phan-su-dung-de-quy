package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        sort(arr);
        System.out.println("Dãy số được sắp xếp tăng dần: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // [1,2,3,4,5,6,7,8,9]
        System.out.println("");
        System.out.println("vị trí của phần tử có key là 5: "
                + binarySearch(arr, 0, arr.length - 1, 3));

    }

    public static int binarySearch(int[] arr, int left, int right, int value) {
        if (right >= left) {
            int middle = (left + right) / 2;
            if (arr[middle] == value) {
                return middle;
            } else if (value > arr[middle]) {
                return binarySearch(arr, middle + 1, right, value);
            } else {
                return binarySearch(arr, left, middle - 1, value);
            }
        }
        return -1;
    }

    public static void sort(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

}