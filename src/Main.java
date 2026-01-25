import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        do{
        System.out.print("Qual o Tamanho Da Fila?: ");
        size = sc.nextInt();
        } while (size <= 0);{
            Fila fila = new Fila(sc.nextInt());

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

}

