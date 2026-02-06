import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[10];

        for (int i=0; i < vector.length; i++ ){
            vector[i] = (int) (Math.random() * vector.length);
            System.out.println(vector[i]);
        }
        int aux, j;
        for (int i=1; i < vector.length; i++){
            aux = vector[i];
            j = i - 1;
            while (j >= 0 && vector[j] > aux){
                vector[j + 1] = vector[j];
                j--;
            }
            vector[j + 1] = aux;
        }

        System.out.println("Ordem");

        for (int i=1; i < vector.length; i++){
            System.out.println(vector[i]);
        }
    }
}

