import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        do{
        System.out.print("Qual o Tamanho Da Fila?: ");
        size = sc.nextInt();
        if (size <= 0){
            System.out.println("Escolha um numero acima de 0...");
        }
        } while (size <= 0);

        Fila fila = new Fila(size);

        while (!fila.isFull()){
            System.out.print("Adicione os Valores: ");
            fila.insert(sc.nextInt());
        }

        while (!fila.isEmpty()){
            int x = fila.remove();
            System.out.println("Numero retirado: " + x  );
        }







    }

}

