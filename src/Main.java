import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[8];

        for (int i=0; i < vector.length; i++){
            vector[i] = (int) (Math.random() * 8);
            System.out.println(vector[i]);
        }

        boolean find = false;

        System.out.print("qual numero vc busca?: ");
        int number = sc.nextInt();

        for (int i : vector){
           if (i == number){
               find = true;
               break;
           }
        }
        if (find){
            System.out.println("Achou o numero!");
        }
        else {
            System.out.println("Não Achou o numero!");
        }


    }
}

