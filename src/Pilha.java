public class Pilha {

    int[] vect;
    int topo;


    public Pilha(){
        vect = new int[10];
        topo = -1;
    }

    public void push(int e){
        if(isFull()){
            throw new RuntimeException("Fila is Full");
        }
        topo++;
        vect[topo] = e;
    }

    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("Fila is Empty");
        }
      int e;
      e = vect[topo];
      topo--;
      return e;
    }

    public boolean isEmpty(){
        return topo == -1;
    }
    public boolean isFull(){
        return topo == 9;
    }
    public int top(){
        return vect[topo];
    }
}
