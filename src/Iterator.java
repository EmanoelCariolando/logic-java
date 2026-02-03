public class Iterator<T> {

        private Node<T> node;

        public Iterator(Node<T> Current) {
            this.node = Current;
        }

        public boolean nextNode(){
            return node.getNext() != null;
        }

        public Node<T> nextIterator(){
            node = node.getNext();
            return node;
        }
    }

