import java.util.ArrayList;

public class Vertice {
    
    private String rotulo;
    private int dist_obj;
    private boolean visitado;
    private ArrayList<Adjacente> adjacentes;

    public ArrayList<Adjacente> getAdjacentes() {
        return adjacentes;
    }

    public void setAdjacentes(ArrayList<Adjacente> adjacentes) {
        this.adjacentes = adjacentes;
    }

    public Vertice(String rotulo, int dist_obj) {
        this.rotulo = rotulo;
        this.dist_obj = dist_obj;
        this.visitado = false;
        this.adjacentes = new ArrayList<>();
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public int getDist_obj() {
        return dist_obj;
    }

    public void setDist_obj(int dist_obj) {
        this.dist_obj = dist_obj;
    }

    public boolean isVisitado() {
        return visitado;
    }    

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public void exibiAdjacentes() {
        for (int i = 0; i < this.adjacentes.size(); i++) {
            System.out.print(" " + (i) + "-" + adjacentes.get(i).getVertice().getRotulo() + ", ");
            System.out.print(adjacentes.get(i).getVertice().getDist_obj());
        }
    }

    public void adicionaAdjacente(Adjacente v) {
        this.adjacentes.add(v);
    }

}
