import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        Tree<Integer> tree = new Tree<Integer>();
        tree.adding(10);
        tree.adding(8);
        tree.adding(5);
        tree.adding(9);
        tree.adding(7);
        tree.adding(18);
        tree.adding(13);
        tree.adding(20);
        tree.adding(111);
        System.out.println("IN ORDER");
        tree.atOrder(tree.getSource());
        System.out.println("PRE ORDER");
        tree.preOrder(tree.getSource());
        System.out.println("POST ORDER");
        tree.postOrder(tree.getSource());

    }


}



