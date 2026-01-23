public class Pilha {

    int topo;
    int[] vect;

    public Pilha(int value){
    vect = new int[value];
    topo = -1;
    }

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
        return topo == vect.length;
    }
    public boolean isEmpty(){
      return topo == -1;
    }

    public boolean verify(){
        boolean e = false;
        for(int i : vect){
            if(i == 0){
              e = true;
            }
        }
        return e;
    }



     public int top(){
      return vect[topo];
     }

}
