public class Edge<T> {
   private Double weight;
   private Vertex startV;
   private Vertex endV;


    public Edge(Vertex endV, Vertex startV, Double weight) {
        this.endV = endV;
        this.startV = startV;
        this.weight = weight;
    }

    public Vertex getEndV() {
        return endV;
    }

    public void setEndV(Vertex endV) {
        this.endV = endV;
    }

    public Vertex getStartV() {
        return startV;
    }

    public void setStartV(Vertex startV) {
        this.startV = startV;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
