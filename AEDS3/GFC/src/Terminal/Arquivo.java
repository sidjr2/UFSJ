package Terminal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//(aq abro o arqivo )
public class Arquivo {
    public static String lendoArquivo(String Origem){
        String texto = "";
        try {
            FileReader arquivo = new FileReader(Origem);
            BufferedReader lerArquivo = new BufferedReader(arquivo);
            String line = "";
            try {
                line = lerArquivo.readLine();
                while(line != null){
                    texto += line + "\n";
                    line = lerArquivo.readLine();
                }
                arquivo.close();
                return texto;
            } catch (IOException erroArquivo) {
                System.out.println("erroArquivo: HOUVE ALGUM ERRO AO TENTAR LER O ARQUIVO!");
                return "";
            }
        } catch (IOException erroNoArquivo) {
            System.out.println("erroNoArquivo: HOUVE ALGUM ERRO AO TENTAR BUSCAR O ARQUIVO VERIFIQUE SE O ARQUIVO EXISTE!");
            return "";
        }
    }

}
