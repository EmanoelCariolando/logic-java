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

        int assistant;
        for (int i=0; i < vector.length; i++){
            for (int j= i+1; j < vector.length; j++){
                if (vector[i] > vector[j]) {
                    assistant = vector[i];
                    vector[i] = vector[j];
                    vector[j] = assistant;
                }
            }
        }
        System.out.println("vetor ordenado");
        for(int i=0; i < vector.length; i++){
            System.out.println(vector[i]);
        }
    }
}

