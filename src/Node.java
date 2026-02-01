public class Node<T> {

   private int value;
   private Node<T> next;

   public Node(int value) {
      this.next = null;
      this.value = value;
   }
   public Node(int value, Node<T> next) {
      this.next = next;
      this.value = value;
   }

   public Node<T> getNext() {
      return next;
   }

   public void setNext(Node<T> next) {
      this.next = next;
   }

   public int getValue() {
      return value;
   }

   public void setValue(int value) {
      this.value = value;
   }

   @Override
   public String toString() {
      return String.valueOf(value);
   }
}
