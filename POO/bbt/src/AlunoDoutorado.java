import java.util.ArrayList;

public class AlunoDoutorado {
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
  
  public AlunoDoutorado(int id, int matricula, String nomeAluno, String curso,  String periododeEntrada, String email, String telefone, String endereco, String datadeNascimento){
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

  public int idAD() {
    return Id;
  }

  public void setIdAD(int id) {
    this.Id = id;
  }

  public int matriculaAD() {
    return Matricula;
  }

  public void setMatriculaAD(int matricula) {
    this.Matricula = matricula;
  }

  public String getnomeAD() {
    return NomeAluno;
  }

  public void setnomeAD(String nomeAluno) {
    this.NomeAluno = nomeAluno;
  }

  public String getCursoAD() {
    return Curso;
  }

  public void setCursoAD(String cursoAD) {
    this.Curso = cursoAD;
  }
  
  public String gePEAD() {
    return NomeAluno;
  }

  public void setPEAD(String pe) {
    this.PeriododeEntrada = pe;
  }
 
  public String getEmailAD() {
    return Email;
  }

  public void setEmailAD(String email) {
    this.Email = email;
  }

  public String getTelefoneAD() {
    return Telefone;
  }

  public void setTelefoneAD(String tel) {
    this.Telefone = tel;
  }

  public String getEnderecoAD() {
    return Endereco;
  }

  public void setEnderecoAD(String end) {
    this.Endereco = end;
  }
  
  public String getAniversaioAD() {
    return DatadeNascimento;
  }

  public void setAniversaioAD(String aniversaio) {
    this.DatadeNascimento = aniversaio;
  }
}

}
