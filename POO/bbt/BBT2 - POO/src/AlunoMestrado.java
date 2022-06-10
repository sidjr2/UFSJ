import java.util.ArrayList;

public class AlunoMestrado extends Aluno{
 
  String PeriododeEntrada;
  ArrayList<String> Historico = new ArrayList<>();
  
  public AlunoMestrado(int id, String matricula, String nomeAluno, String curso,  String periododeEntrada, String email, String telefone, String endereco, String datadeNascimento){
    super(id, matricula, nomeAluno, curso, email, telefone, endereco, datadeNascimento);
    this.PeriododeEntrada = periododeEntrada;
    
  }
  public String toString(){
    return  "\n id: "+ Id +
            "\n Matricula: " + Matricula +
            "\n Nome: " + NomeAluno + 
            "\n Curso: " + Curso +
            "\n Periodo de Entrada: " + PeriododeEntrada +
            "\n Email: " + Email +
            "\n Telefone: " + Telefone +
            "\n Endreço: " + Endereco +
            "\n Data de Nascimento: " + DatadeNascimento ;
  }
  public String gePEAM() {
    return PeriododeEntrada;
  }

  public void setPEAM(String pe) {
    this.PeriododeEntrada = pe;
  }
 
}
