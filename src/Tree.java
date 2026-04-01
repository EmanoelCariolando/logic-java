public class Tree<T extends Comparable<T>> {
    private Element<T> source;

    public Tree() {
    }

    public Tree(Element<T> source) {
        this.source = source;
    }

    public void adding(T value) {
        Element<T> newElement = new Element<T>(value);
        if (source == null) {
            this.source = newElement;
        } else {
            Element atual = this.source;

            while (true) {
                if (newElement.getValue().compareTo(source.getValue()) == -1){
                    if (atual.getLeft() != null) {
                        atual = atual.getLeft();
                    } else {
                        atual.setLeft(newElement);
                        break;
                    }
                }else {
                    if (atual.getRight() != null){
                        atual = atual.getRight();
                    }
                    else {
                        atual.setRight(newElement);
                        break;
                    }
                }
            }
        }
    }
}
