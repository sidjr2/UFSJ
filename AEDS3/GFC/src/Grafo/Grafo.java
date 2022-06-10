package Grafo;

import java.util.ArrayList;
import java.util.List;

import Instrucao.Instrucao;

public class Grafo {
    private static List<Vertice> Vertices = new ArrayList<Vertice>();
    private static List<Aresta> Arestas = new ArrayList<Aresta>();

    public Grafo(List<Vertice> vertices, List<Aresta> arestas) {
        Grafo.Vertices = vertices;
        Grafo.Arestas = arestas;
    }

    public void imprimeGrafo() {
        System.out.println("\n------------------------------------------------------\n IMPRIMINDO OS BLOCO COM OS CODIGO DE TRES ENDERECOS\n------------------------------------------------------");
        for(Vertice vertice : Vertices){
            System.out.println("\nB" + (vertice.getIdVertice()+1) + ":");{
                for(Instrucao instrucao : vertice.getBloco()){
                    instrucao.imprimeInstrucao();
                }
            }
        }
        System.out.println("\n------------------------------------------------------\nIMPRIMINDO O GRAFO DE FLUXO DE CONTROLE:\n------------------------------------------------------");
        System.out.println("\nEntry ARESTA VAI PARA (-->) B" + (Vertices.iterator().next().getIdVertice() + 1));
        for (Aresta aresta : Arestas) {

            aresta.imprimeAresta();

        }
        System.out.println("B" + (Vertices.size()) + " ARESTA VAI PARA (-->) EXIT");
        System.out.println("\n------------------------------------------------------\n");
    }

    
}
