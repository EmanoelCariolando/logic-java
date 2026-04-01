public class Element<T> {
    private T value;
    private Element<T> left;
    private Element<T> right;

    public Element() {

    }
    public Element(T value) {
       this.value = value;
    }

    public Element(Element<T> left, Element<T> right, T value) {
        this.left = null;
        this.right = null;
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Element<T> getLeft() {
        return left;
    }

    public void setLeft(Element<T> left) {
        this.left = left;
    }

    public Element<T> getRight() {
        return right;
    }

    public void setRight(Element<T> right) {
        this.right = right;
    }
}
