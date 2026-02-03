public class List<T> {

    private Node<T> first;
    private Node<T> end;
    private int total;

    public void add(int value){
        Node<T> newNode = new Node<T>(value);
        if (this.first == null && this.end == null){
            this.first = newNode;
            this.end = newNode;
        }else {
            this.end.setNext(newNode);
            this.end = newNode;
        }
        total++;
    }

    public Node<T> get(int position){
        Node<T> atual = this.first;
     for (int i=0; i < position; i++){
        if(atual.getNext() != null){
            atual = atual.getNext();
        }
     }
     return atual;
    }


    public int delete(int e) {
        Node<T> atual = this.first;
        Node<T> anterior = null;

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

    public Node<T> getEnd() {
        return end;
    }

    public void setEnd(Node<T> end) {
        this.end = end;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Iterator<T> getIterator(){
        return new Iterator<>(this.first);
    }
}
