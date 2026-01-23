import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o Tamanho Da Pilha?: ");
        Pilha pilha = new Pilha(sc.nextInt());

        while (pilha.verify()){
            System.out.print("Adicione os Valores: ");
            pilha.push(sc.nextInt());
        }

        while (!pilha.isEmpty()){
            int x = pilha.pop();
            System.out.println("Numero retirado: " + x  );
        }



    }

}

