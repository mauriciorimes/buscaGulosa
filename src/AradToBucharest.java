public class AradToBucharest {
    public static void main(String[] args) throws Exception {
        Grafo mapa = new Grafo();        
        Gulosa gulosa = new Gulosa(mapa.bucharest);

        gulosa.buscaRecursiva(mapa.mehadia);       
    }
}
