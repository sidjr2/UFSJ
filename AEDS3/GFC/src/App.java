import java.util.ArrayList;
import java.util.List;

import Grafo.Aresta;
import Grafo.Grafo;
import Grafo.Vertice;
import Instrucao.Instrucao;

public class App {

    //Entrada com o nome do caminho do arquivo
    static String Origem = "Teste.txt"; 

    //iniciando os arrayList
    private static List<Instrucao> Instrucoes = new ArrayList<Instrucao>();
    private static List<Vertice> Vertices = new ArrayList<Vertice>();
    private static List<Aresta> Arestas = new ArrayList<Aresta>();
    private static Grafo Grafo;
    
    public static void main(String[] args) throws Exception {
        System.out.println("\n------------------------------------------------------\n\nBEM-VINDO AO GRAFO DE FLUXO DE CONTROLE:\nO ARQUIVO DE TESTE E: " + Origem);

        //CRIANDO INSTRUCAO E BLOCO DE CODIGO E DEFININDO LIDER DAS INTRUCOES
        Instrucoes = Instrucao.criaInstrucao(Instrucoes, Origem); 
        Instrucoes = Instrucao.defineLiderLista(Instrucoes);
        Vertices = Vertice.criaBlocoCodigo(Instrucoes);

        
        //SETANDO VERTICES E ARESTA AO GRAFO 
        defineAresta();
        Grafo = new Grafo(Vertices,Arestas);

        //IMPRIMINDO GRAFO CRIADO 
        Grafo.imprimeGrafo();

        //LIBERANDO MEMORIA DE INSTRUCAO  
    }

    private static void defineAresta() {
        //funcao responsavel por definir as Arestas() do Grafo
        boolean eIncodicional = true;

        for(Vertice vertice : Vertices){
            //percorrendo nossa lista de vertices
            eIncodicional = true;
            for(Instrucao instrucao : vertice.getBloco()){
                //percorre a lista de Instrucao e pega um bloco de codigo do vertice 
                if(!instrucao.getDestinoInstrucao().equals("")){
                    //Verifica se instrucao e diferente de "" caso seja percorre o arraylist() de Vertice 
                    for(Vertice conteudoVertice : Vertices){
                        //percorrendo o arraylist Vertice
                        for(Instrucao conteudoInstrucao : conteudoVertice.getBloco()){
                            //percorrer o arraylist Instrucao 
                            if(instrucao.getDestinoInstrucao().equals(conteudoInstrucao.getTag())){
                                //caso o Label do conteudo de intrucao for igual ao destino da intrucao Adicional uma Aresta
                                Arestas.add(new Aresta(vertice.getIdVertice(), conteudoVertice.getIdVertice()));
                            }
                        }
                    }

                }
                if (instrucao.getTipo().equals("INCODICIONAL")) {
                    // Verifica se o tipo e igual a INCONDICIONAl e toda funcao que tenha tipo
                    // incondicinal = true
                    eIncodicional = false; // 
                }

            }
            if (eIncodicional) {
                // caso for incodicional ele verifica se a o vertice e menos que o tamanho do
                // arraylist()
                if (vertice.getIdVertice() + 1 < Vertices.size()) {
                    // caso for menor ele adiciona a aresta entre os vertices
                    Arestas.add(new Aresta(vertice.getIdVertice(), vertice.getIdVertice() + 1));
                }
            }
        }
    }
}
