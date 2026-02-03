import java.util.ArrayList;

public class comparator {
    public static void main(String[] args){
        List<Integer> myList = new List<Integer>();

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        // Vector limit

        int limit = 1000;
        long firstTime = System.currentTimeMillis();
        long lastTime;

        for (int i=0; i < limit; i++){
            vetor.add(i);
        }
        lastTime = System.currentTimeMillis();
        System.out.println("Adicionou " + limit + " elementos no vetor");
        System.out.println(lastTime - firstTime);

        // my list limit

        firstTime = System.currentTimeMillis();
        for (int i=0; i < limit; i++){
            myList.add(i);
        }
        lastTime = System.currentTimeMillis();
        System.out.println("Adicionou " + limit + " elementos no vetor");
        System.out.println(lastTime - firstTime);


        // Read vector

        firstTime = System.currentTimeMillis();
        for (int i=0; i < limit; i++){
            vetor.get(i);
        }
        lastTime = System.currentTimeMillis();
        System.out.println("leu " + limit + " elementos no vetor");
        System.out.println(lastTime - firstTime);

        // Read myList

        firstTime = System.currentTimeMillis();
        for (int i=0; i < limit; i++){
            myList.get(i);
        }
        lastTime = System.currentTimeMillis();
        System.out.println("leu " + limit + " elementos na sua lista");
        System.out.println(lastTime - firstTime);

    }


}
