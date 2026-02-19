import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[10];

        System.out.println("disordering");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * vector.length);
            System.out.println(vector[i]);
        }
        quickSort(vector,0, vector.length - 1);

        System.out.println("ordering");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    static void quickSort(int[] vect, int left, int right){
       if (left < right){
           int p = division(vect,left,right);
           quickSort(vect,left,p);
           quickSort(vect, p + 1, right);
       }
    }
    static int division(int[] vect, int left, int right){
       int mid = (int) (left + right) / 2;
       int pivot = vect[mid];
        int i = left - 1;
        int j = right + 1;
        while (true){
            do {
               i++;
            }while (vect[i] < pivot);
            do {
               j--;
            }while (vect[j] > pivot);
            if (i >= j){
                return j;
            }
            int aux = vect[i];
            vect[i] = vect[j];
            vect[j] = aux;
        }
    }
}



