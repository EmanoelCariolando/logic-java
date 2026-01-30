public class Node {

   private int value;
   private Node next;

   public Node(int value) {
      this.next = null;
      this.value = value;
   }
   public Node(int value, Node next) {
      this.next = next;
      this.value = value;
   }

   public Node getNext() {
      return next;
   }

   public void setNext(Node next) {
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
      return value + "";
   }
}
