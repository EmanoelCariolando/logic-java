import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[5];

        System.out.println("disordering");
        for (int i=0; i < vector.length; i++ ){
            vector[i] = (int) (Math.random() * vector.length);
            System.out.println(vector[i]);
        }
        System.out.print("total: ");
        System.out.print(adding(0,0,vector));
    }

     private static int adding(int sum, int position, int[] vect){
     if (position < vect.length){
        sum = sum + vect[position];
        return adding(sum, position+1, vect);
     }
     else {
      return sum;
     }

    }
}

