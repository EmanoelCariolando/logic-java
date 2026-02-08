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

        int smaller, assis;
        for (int i = 0; i < vector.length; i++){
            smaller = i;
             for (int j = i+1; j < vector.length; j++){
                if (vector[j] < vector[smaller]){
                    smaller = j;
                }
              }

            assis = vector[smaller];
            vector[smaller] = vector[i];
            vector[i] = assis;

        }

        System.out.println("ordered");
        for (int i=0; i < vector.length; i++ ){
            System.out.println(vector[i]);
        }
    }
}

