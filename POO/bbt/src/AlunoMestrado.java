import java.util.ArrayList;

public class AlunoMestrado {
  String NomeAluno;
  String Curso;
  int Id;
  int Matricula;
  String Email;
  String Telefone;
  String Endereco;
  String DatadeNascimento;
  String PeriododeEntrada;
  ArrayList<String> Historico = new ArrayList<>();
  
  public AlunoMestrado(int id, int matricula, String nomeAluno, String curso,  String periododeEntrada, String email, String telefone, String endereco, String datadeNascimento){
    this.Id = id;
    this.Matricula = matricula;
    this.NomeAluno = nomeAluno;
    this.Curso = curso;
    this.PeriododeEntrada = periododeEntrada;
    this.Email = email;
    this.Telefone = telefone;
    this.Endereco = endereco;
    this.DatadeNascimento = datadeNascimento;
    
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

  public int idAM() {
    return Id;
  }

  public void setIdAM(int id) {
    this.Id = id;
  }

  public int matriculaAM() {
    return Matricula;
  }

  public void setMatriculaAM(int matricula) {
    this.Matricula = matricula;
  }

  public String getnomeAM() {
    return NomeAluno;
  }

  public void setnomeAM(String nomeAluno) {
    this.NomeAluno = nomeAluno;
  }

  public String getCursoAM() {
    return Curso;
  }

  public void setCursoAM(String cursoAM) {
    this.Curso = cursoAM;
  }
  
  public String gePEAM() {
    return NomeAluno;
  }

  public void setPEAM(String pe) {
    this.PeriododeEntrada = pe;
  }
 
  public String getEmailAM() {
    return Email;
  }

  public void setEmailAM(String email) {
    this.Email = email;
  }

  public String getTelefoneAM() {
    return Telefone;
  }

  public void setTelefoneAM(String tel) {
    this.Telefone = tel;
  }

  public String getEnderecoAM() {
    return Endereco;
  }

  public void setEnderecoAM(String end) {
    this.Endereco = end;
  }
  
  public String getAniversaioAM() {
    return DatadeNascimento;
  }

  public void setAniversaioAM(String aniversaio) {
    this.DatadeNascimento = aniversaio;
  }
}
