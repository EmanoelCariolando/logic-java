import java.util.ArrayList;

public class Vertex<T> {
    private T dado;
    private ArrayList<Edge<T>> arestasEntrada;
    private ArrayList<Edge<T>> arestasSaida;

    public Vertex(T value){
        this.dado = value;
        this.arestasEntrada = new ArrayList<Edge<T>>();
        this.arestasSaida = new ArrayList<Edge<T>>();
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }
    public void addArestaEntrada(Edge<T> edge){
        this.arestasEntrada.add(edge);
    }
    public void arestasSaida(Edge<T> edge){
        this.arestasEntrada.add(edge);
    }
}
