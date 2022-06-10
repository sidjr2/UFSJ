import java.util.ArrayList;

public class AlunoGraduacao {
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
  
  public AlunoGraduacao(int id, int matricula, String nomeAluno, String curso,  String periododeEntrada, String email, String telefone, String endereco, String datadeNascimento){
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

  public int idAG() {
    return Id;
  }

  public void setIdAG(int id) {
    this.Id = id;
  }

  public int matriculaAG() {
    return Matricula;
  }

  public void setMatriculaAG(int matricula) {
    this.Matricula = matricula;
  }

  public String getnomeAG() {
    return NomeAluno;
  }

  public void setnomeAG(String nomeAluno) {
    this.NomeAluno = nomeAluno;
  }

  public String getCursoAG() {
    return Curso;
  }

  public void setCursoAG(String cursoAG) {
    this.Curso = cursoAG;
  }
  
  public String gePEAG() {
    return NomeAluno;
  }

  public void setPEAG(String pe) {
    this.PeriododeEntrada = pe;
  }
 
  public String getEmailAG() {
    return Email;
  }

  public void setEmailAG(String email) {
    this.Email = email;
  }

  public String getTelefoneAG() {
    return Telefone;
  }

  public void setTelefoneAG(String tel) {
    this.Telefone = tel;
  }

  public String getEnderecoAG() {
    return Endereco;
  }

  public void setEnderecoAG(String end) {
    this.Endereco = end;
  }
  
  public String getAniversaioAG() {
    return DatadeNascimento;
  }

  public void setAniversaioAG(String aniversaio) {
    this.DatadeNascimento = aniversaio;
  }
}
