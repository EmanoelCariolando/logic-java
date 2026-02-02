import java.util.ArrayList;

public class comparator {
    public static void main(String[] args){
        List<Integer> myList = new List<Integer>();

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        //Vector limit

        int limit = 100000;
        long firstTime = System.currentTimeMillis();
        long lastTime;

        for (int i=0; i < limit; i++){
            vetor.add(i);
        }
        lastTime = System.currentTimeMillis();
        System.out.println("Adicionou " + limit + " elementos no vetor");
        System.out.println(lastTime - firstTime);

        //my list limit

        firstTime = System.currentTimeMillis();
        for (int i=0; i < limit; i++){
            myList.add(i);
        }
        lastTime = System.currentTimeMillis();
        System.out.println("Adicionou " + limit + " elementos no vetor");
        System.out.println(lastTime - firstTime);


    }
}
