package Instrucao;

import java.util.List;

import Terminal.Arquivo;

public class Instrucao {
    String tipo;
    String destino;
    String label;
    boolean lider;
    int id; 
    String operando;
    String opFont1;
    String opFont2;
    String resultadoAtribuicao;  //e  aq certto?
    

    public Instrucao(String Label, String Tipo, String Destino, String ope, String opeFont1, String opeFont2, int Id,String resultadoAtribuicao) {
        this.tipo = Tipo;
        this.destino = Destino;
        this.label = Label;
        this.operando = ope;
        this.opFont1 = opeFont1;
        this.opFont2 = opeFont2;
        this.id = Id;
        this.lider = false;
        this.resultadoAtribuicao = resultadoAtribuicao; 
        return;
    }

    public static List<Instrucao> defineLiderLista(List<Instrucao> Instrucoes) {  
        //o primeiro elemento e sempre lider 
        Instrucoes.get(0).defineLider();
        boolean proximoLider = false;

        for(Instrucao instrucao : Instrucoes){
            //percorre o arrayList Instrucao
            if(proximoLider){
                //verificando o proximo lider e definindo ele como lider 
                instrucao.defineLider();
                proximoLider = false;
            }
            if(!instrucao.getTag().isEmpty()){
                instrucao.defineLider();
            }
            if(instrucao.getTipo().equals("CONDICIONAL") || instrucao.getTipo().equals("INCONDICIONAL")){
                //SE A instrucao for condicional ou incodicional a instrucao e um lider
                proximoLider = true;
            }
        }
        
        return Instrucoes;
    }

    private void defineLider() {
        this.lider = true;
        return;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDestinoInstrucao() {
        return destino;
    }

    public String getTag() {
        return label;
    }

    public static List<Instrucao> criaInstrucao(List<Instrucao> Instrucoes, String Origem) { 
        /* *criando lista das instrucoes */
        String[] arquivo = Arquivo.lendoArquivo(Origem).split("\n");  //separa cada linha em uma posição do vetor
        String[] Comandos; // vetor com os comandos da intrucão
        int ID = 0;
        boolean label = false;
        boolean proximoOperando = false;

        for(String comando : arquivo){
            //percorrendo o arquivo depois de lido 
            String tip = ""; //condicional, incondicional ou atribuicao
            String operand = ""; //(+,-,*,/)
            String destin = ""; // destino label
            String opeFonte1 = ""; //ex: a
            String opeFonte2 = ""; //ex: b
            String caminhoTag = "";  //L2
            String resultadoAtribuicao = "";//quando voltar avisa 
            //split no vetor de Comandos
            Comandos = comando.split(" "); 
            for(String instrucao : Comandos){

                //percorrendo o vertor em busca das suas atribuicoes 
                if(instrucao.contains("L") && !label ){ 
                    caminhoTag = instrucao.replace(":", "");
                }
                else if (instrucao.equals("ifnot") || instrucao.equals("if")) {
                    // se for uma condicional if ou ifnot armazena o tipo e o proximo operando e
                    tip = "CONDICIONAL";
                    operand = instrucao;
                    proximoOperando = true;
                } else if(label){ 
                    destin = instrucao;
                    label = false; 
                } else if(proximoOperando){
                    if(opeFonte1.isEmpty()){
                        //guardando o operando fonte 1 
                        opeFonte1 = instrucao;
                        proximoOperando = false;
                    }
                    else{ //
                    //guardando operando fonte 2
                        opeFonte2 = instrucao;
                        proximoOperando = false;
                    }
                }
                else if(instrucao.equals("=") ){ // 
                    //se for uma atribuicao = 
                    tip = "ATRIBUICAO";
                    operand = instrucao;
                    proximoOperando = true;
                } 
                else if(instrucao.equals("+") || instrucao.equals("-") || instrucao.equals("*") || instrucao.equals("/") || instrucao.equals(">") || instrucao.equals("<") || instrucao.equals("!=") || instrucao.equals("==") ){
                    operand = instrucao;
                    proximoOperando = true;
                }else if(instrucao.equals("goto")){
                    if(tip.isEmpty()){
                        tip = "INCODICIONAL";
                    }
                    label = true;
                } 
                else{
                    resultadoAtribuicao =instrucao; 
                }  

            }
            //instaciando o contrutor da funcao 
            Instrucao instrucao = new Instrucao(caminhoTag, tip, destin, operand, opeFonte1, opeFonte2, ID,resultadoAtribuicao);
            Instrucoes.add(instrucao);
               
        }

        return Instrucoes;
    }
    
    public boolean Elider(){
        return lider;
    }
    public void imprimeInstrucao(){
        String texto = ": ";
        
        if(label == ""){
            texto = "";
        }
        if(tipo.equals("ATRIBUICAO")){
            System.out.println(label + texto + resultadoAtribuicao + "=" + opFont1 + opFont2);
        }else if(tipo.equals("")){
            System.out.println(label);
        }else if(tipo.equals("INCODICIONAL")){
            System.out.println("goto" + destino);
        }else{
            System.out.println(label + texto + resultadoAtribuicao+" "+ opFont1 + operando + opFont2 + "goto" + destino);
        } 
    }

    public void imprimeLider(){
        System.out.println("ID: " + (id + 1) + " LIDER: " + lider + "\n");
    }

}
