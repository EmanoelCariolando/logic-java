import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;

        do {
            showChoose();
            choose = sc.nextInt();

         switch (choose){
             case 1:

                 break;
             case 2:

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
     System.out.println("2 - Mostrar Lista ");
     System.out.println("3 - Sair ");
    }

}

