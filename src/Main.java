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
              System.out.println("Escolha um Numero Para Adicionar: ");
              list.add(sc.nextInt());
                 break;
             case 2:
                  System.out.println("Primeiro da Lista: " + list.getFirst().getValue());
                  System.out.println("Ultimo da Lista: " + list.getEnd().getValue());
                  System.out.println("total: " + list.getTotal());
                 break;
             case 3:
                 System.out.println("Saindo do Progama... ");
                 break;

                 
             default:
                 System.out.println("Opção invalida,escolha as da tela... ");
         }
        }while (choose != 3);

    }

    public static void showChoose(){
     System.out.println("1 - Adicione a Lista ");
     System.out.println("2 - Mostrar Info Da Lista ");
     System.out.println("3 - Sair ");
     System.out.print("Digite: ");
    }

}

