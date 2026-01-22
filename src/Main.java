import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pilha pilha = new Pilha();
        pilha.push(10);
        pilha.push(1);
        pilha.push(2);
        pilha.push(4);
        pilha.push(5);

        pilha.top();

        while (!pilha.isEmpty()){
            int element = pilha.pop();
            System.out.println("saiu da pilha:" + element);
        }


    }

}

