public class Pilha {

  int[] vect = new int[10];
  int topo = -1;

  public void push(int e){
   if (isFull()){
       throw new RuntimeException("is Full");
   }
      topo++;
      vect[topo] = e;
  }
  public int pop(){
      if (isEmpty()){
          throw new RuntimeException("is Empty");
      }
      int e;
      e = vect[topo];
      topo--;
      return e;
  }

    public boolean isFull(){
        return topo == 9;
    }
    public boolean isEmpty(){
      return topo == -1;
     }

     public int top(){
      return vect[topo];
     }

}
