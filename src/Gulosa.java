public class Gulosa {

    private Vertice objetivo;
    private boolean encontrado;

    public Gulosa(Vertice objetivo) {
        this.objetivo = objetivo;
        this.encontrado = false;
    }

    public boolean isEncontrado() {
        return encontrado;
    }

    public void setEncontrado(boolean encontrado) {
        this.encontrado = encontrado;
    }

    public Vertice getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Vertice objetivo) {
        this.objetivo = objetivo;
    }

    public void buscaRecursiva(Vertice atual) {
        System.out.println("-------------");
        System.out.println("Atual: " + atual.getRotulo());
        atual.setVisitado(true);

        if (atual.getRotulo().equals(objetivo.getRotulo())) {
            this.encontrado = true;                       
            return;
        } else {
            VetorOrdenado vetor_ordenado = new VetorOrdenado(atual.getAdjacentes().size());
            for (int i = 0; i < atual.getAdjacentes().size(); i++) {
                if (!atual.getAdjacentes().get(i).getVertice().isVisitado()) {
                    atual.getAdjacentes().get(i).getVertice().setVisitado(true);
                    vetor_ordenado.insereOrdenado(atual.getAdjacentes().get(i).getVertice());
                }
            }

            vetor_ordenado.imprime();

            if (vetor_ordenado.getValores().get(0) != null) {
                this.buscaRecursiva(vetor_ordenado.getValores().get(0));
            }
        }
    }   
    
}
