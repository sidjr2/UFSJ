package Grafo;

public class Aresta {
    private int idVertice; // Aresta inicio
    private int idVertice2; // Aresta Fim

    public Aresta(int idVertice, int idVertice2) {
        this.idVertice = idVertice;
        this.idVertice2 = idVertice2;
    }
    
    public int getArestaInicio() {
        return idVertice;
    }

    public int defineArestaFim() {
        return idVertice2;
    }

    public void imprimeAresta() {
        String idVerticeF; // Aresta final

        if ((idVertice2 + 1) > 0) {
            idVerticeF = "B" + Integer.toString(idVertice2 + 1);
        } else {
            idVerticeF = "Exit";
        }
        System.out.println("B" + (idVertice + 1) + " ARESTA VAI PARA (-->) " + idVerticeF);

    }
}
