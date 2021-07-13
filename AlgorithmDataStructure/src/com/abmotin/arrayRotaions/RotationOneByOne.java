package com.abmotin.arrayRotaions;

public class RotationOneByOne {

    // Function to left rotate arr[] of size n by d
    void leftRotate(int arr[], int d, int n) {

        // To handle if d>=n
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);

        for (i = 0; i < g_c_d; i++) {
            // move i-th values of blocks
            temp = arr[i];
            j = i;

            while (true) {
                k = j + d;
                if (k >= n) {
                    k = k - n;
                }

                if (k == i) {
                    break;
                }

                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }

    }

    // function to print an array
    void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    // Function to get gcd of and b
    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }


    // Driver program to test above functions
    public static void main(String[] args) {
        RotationOneByOne rotate = new RotationOneByOne();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
    }

}
