public class Fila {
     int[] value;
     int first;
     int last;
     int total;

     public Fila(int value){
         this.value = new int[value];
         first = 0;
         last = 0;
         total = 0;
     }

    public void insert(int elements){
         if (isFull()){
             throw new RuntimeException("Is full");
         }
        value[last] = elements;
        last = (last + 1) % value.length;
        total++;
    }
    public int remove(){
        if (isEmpty()){
            throw new RuntimeException("Is Empty");
        }
         int elements = value[first];
         first = (first + 1) % value.length;
         total--;
         return elements;
    }

    public boolean isFull(){
        return total == value.length;
    }
    public boolean isEmpty(){
       return total == 0;
    }


}
