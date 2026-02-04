import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[100];

        for (int i=0; i < vector.length; i++ ){
            vector[i] = i;
            System.out.println(vector[i]);
        }

        boolean find = false;
        int total = 0;
        int start = 0;
        int end = vector.length - 1;

        System.out.print("Qual numero vc quer buscar?: ");
        int number = sc.nextInt();

        while (start <= end) {
            int mid = (int) (start + end) / 2;
            total++;
            if(vector[mid] == number){
                find = true;
                break;
            }
            else if(vector[mid] < number){
                start = mid + 1;

            }
            else{
                end = mid - 1;
            }

        }
        if (find){
            System.out.println("Achou e contou: " + total + " Vezes.");

        }
        else {
            System.out.println("Não achou");
        }


    }
}

