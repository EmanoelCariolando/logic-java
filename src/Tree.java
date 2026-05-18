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
            Element<T> atual = this.source;

            while (true) {
                if (newElement.getValue().compareTo(atual.getValue()) == -1){
                    if (atual.getLeft() != null) {
                        atual = atual.getLeft();
                    } else {
                        atual.setLeft(newElement);
                        break;
                    }
                }else  {
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

    public Element<T> getSource() {
        return source;
    }

    public void atOrder(Element<T> atual){
        if (atual != null){
            atOrder(atual.getLeft());
            System.out.println(atual.getValue());
            atOrder(atual.getRight());
        }
    }
    public void preOrder(Element<T> atual){
        if (atual != null){
            System.out.println(atual.getValue());
            preOrder(atual.getLeft());
            preOrder(atual.getRight());
        }
    }
    public void postOrder(Element<T> atual){
        if (atual != null){
            postOrder(atual.getLeft());
            postOrder(atual.getRight());
            System.out.println(atual.getValue());
        }
    }
    public boolean remove(T value){
       Element<T> actual = this.source;
       Element<T> actualFather = null;
       while (actual != null){
           if (actual.getValue().equals(value)){
               break;
           } else if (value.compareTo(actual.getValue()) == -1){
               actual = actual.getLeft();
           }
           else {
               actual = actual.getRight();
           }
       }

    }

}
