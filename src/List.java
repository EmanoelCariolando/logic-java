public class List {

    private Node first;
    private Node end;
    private int total;

    public void add(int value){
        Node newNode = new Node(value);
        if (this.first == null && this.end == null){
            this.first = newNode;
            this.end = newNode;
        }else {
            this.end.setNext(newNode);
            this.end = newNode;
        }
        total++;
    }

    public Node get(int position){
        Node atual = this.first;
     for (int i=0; i < position; i++){
        if(atual.getNext() != null){
            atual = atual.getNext();
        }
     }
     return atual;
    }


    public int delete(int e) {
        Node atual = this.first;
        Node anterior = null;

        while (atual != null) {
            if (atual.getValue() == e) {

                int value = atual.getValue();

                if (anterior == null) {
                    first = atual.getNext();
                } else {
                    anterior.setNext(atual.getNext());
                }

                total--;
                return value;
            }

            anterior = atual;
            atual = atual.getNext();
        }

        return -1;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
