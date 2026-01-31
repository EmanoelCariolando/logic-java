import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List list = new List();
        int choose;

        do {
            showChoose();
            choose = sc.nextInt();

         switch (choose){
             case 1:
              System.out.print("Escolha um Numero Para Adicionar: ");
              list.add(sc.nextInt());
                 break;
             case 2:
                 System.out.print("Escolha uma posição para pegar o valor: ");
                 int number = sc.nextInt();
                 System.out.println("Item na posição "+ number + ": " + list.get(number));
                 break;
             case 3:
                 System.out.println("Primeiro da Lista: " + list.getFirst().getValue());
                 System.out.println("Ultimo da Lista: " + list.getEnd().getValue());
                 System.out.println("total: " + list.getTotal());
                 break;
             case 4:
                 System.out.println();
                 break;
             case 5:
                 System.out.println("Saindo do Progama... ");
                 break;

                 
             default:
                 System.out.println("Opção invalida,escolha as da tela... ");
         }
        }while (choose != 3);

    }

    public static void showChoose(){
     System.out.println("1 - Adicione a Lista ");
     System.out.println("2 - Pegar Valor Na Lista ");
     System.out.println("3 - Mostrar Info Da Lista ");
     System.out.println("4 - Delete um Valor ");
     System.out.println("5 - Sair ");
     System.out.print("Digite: ");
    }

}

