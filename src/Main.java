import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[10];

        System.out.println("disordering");
        for (int i=0; i < vector.length; i++ ){
            vector[i] = (int) (Math.random() * vector.length);
            System.out.println(vector[i]);
        }

        int n = vector.length;

        for (int i = n / 2 - 1; i >= 0; i--){
            heapSort(vector,n,i);
        }
        System.out.println("almost ordering");
        for (int i = 0; i < vector.length; i++){
         System.out.println(vector[i] + "");
        }
        for (int j = n-1; j > 0; j--){
            int aux = vector[0];
            vector[0] = vector[j];
            vector[j] = aux;

            heapSort(vector,n,j);
        }

        System.out.println("ordering");
        for (int i = 0; i < vector.length; i++){
            System.out.println(vector[i] + "");
        }
    }
    private static void heapSort(int[] vect,int n,int i){
     int source = i;
     int left = 2*i + 1;
     int right = 2*i + 2;
     
     if (left < n && vect[left] > vect[source]){
         source = left;
     }
     if (right < n && vect[right] > vect[source]){
         source = right;
     }
     if(source != i){
         int aux = vect[i];
         vect[i] = vect[source];
         vect[source] = aux;

         heapSort(vect,n,source);
     }
    }
}

