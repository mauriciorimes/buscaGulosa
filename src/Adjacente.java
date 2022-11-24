public class Adjacente {
    
    private Vertice vertice;
    private int custo;

    public Adjacente(Vertice vertice, int custo) {
        this.vertice = vertice;
        this.custo = custo;
    }

    public Vertice getVertice() {
        return vertice;
    }

    public void setVertice(Vertice vertice) {
        this.vertice = vertice;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }    
    
}
