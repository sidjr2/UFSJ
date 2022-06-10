package Grafo;

import java.util.ArrayList;
import java.util.List;

import Instrucao.Instrucao;

public class Vertice {
    private List<Instrucao> blocoCodigo;
    private int idVertice;

    public Vertice(int id){
        this.idVertice = id;
        this.blocoCodigo = new ArrayList<Instrucao>();
    }

    public static List<Vertice> criaBlocoCodigo(List<Instrucao> Instrucoes) { 
        int id = 0;

        Vertice blocoCodigo = null;
        List<Vertice> Vertices = new ArrayList<>();

        for(Instrucao instrucao : Instrucoes){
            //percorrendo o arraylist Instrucoes
            if(instrucao.Elider()){
                //se a instrucao for um lider e bloco Codifo for diferente de null -> adiciona no Vertices o bloco de codigo
                if(blocoCodigo != null){
                    Vertices.add(blocoCodigo);
                }
                blocoCodigo = new Vertice(id++);
                blocoCodigo.insereBloco(instrucao);
            }
            else{
                blocoCodigo.insereBloco(instrucao);
            }
        }
        //instaciando o contrutor 
        Vertices.add(blocoCodigo);
        return Vertices;
    }

    private void insereBloco(Instrucao instrucao) {
        this.blocoCodigo.add(instrucao);
    }

    public int getIdVertice() {
        return idVertice;
    }

    public List<Instrucao> getBloco() {
        return blocoCodigo;
    }
    
    public void imprimeDestinoVertice() {
        for (Instrucao instrucao : blocoCodigo) {
            instrucao.getDestinoInstrucao();
        }
    }

    public void imprimeVertice(){
        for (Instrucao instrucao : blocoCodigo) {
            instrucao.imprimeInstrucao();
        }
    }
}
