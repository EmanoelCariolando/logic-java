import java.util.ArrayList;

public class Graph<T> {
    Vertex vertex = new Vertex();
    Edge edge = new Edge();

    public Graph(){
      this.vertex = new ArrayList<T>();
      this.edge = new ArrayList<T>();
    }
}
