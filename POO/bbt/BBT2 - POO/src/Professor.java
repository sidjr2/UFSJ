import java.util.ArrayList;

public class Professor {
  String Titularizacao;
  String NomeProfessor;
  int Id;
  String Matricula;
  String Email;
  String Telefone;
  String Endereco;
  String DatadeNascimento;
  String PeriododeEntrada;
  ArrayList<String> Historico = new ArrayList<>();
  
  public Professor(int id, String matricula, String nomeProfessor, String titularizacao,  String periododeEntrada, String email, String telefone, String endereco, String datadeNascimento){
    this.Id = id;
    this.Matricula = matricula;
    this.NomeProfessor = nomeProfessor;
    this.Titularizacao = titularizacao;
    this.PeriododeEntrada = periododeEntrada;
    this.Email = email;
    this.Telefone = telefone;
    this.Endereco = endereco;
    this.DatadeNascimento = datadeNascimento;
    
  }

  public String toString(){
    return  "\n id: "+ Id +
            "\n Matricula: " + Matricula +
            "\n Nome: " + NomeProfessor + 
            "\n Titularizacao: " + Titularizacao +
            "\n Contratado Vigente Desde:" + PeriododeEntrada +
            "\n Email: " + Email +
            "\n Telefone: " + Telefone +
            "\n Endreço: " + Endereco +
            "\n Data de Nascimento: " + DatadeNascimento ;
  }

  public int idProf() {
    return Id;
  }

  public void setIdProf(int id) {
    this.Id = id;
  }

  public String matriculaProf() {
    return Matricula;
  }

  public void setMatriculaProf(String matricula) {
    this.Matricula = matricula;
  }

  public String getnomeProf() {
    return NomeProfessor;
  }

  public void setnomeProf(String NomeProfessor) {
    this.NomeProfessor = NomeProfessor;
  }

  public String getTitularizacaoProf() {
    return Titularizacao;
  }

  public void setTitularizacaoProf(String TitularizacaoProf) {
    this.Titularizacao = TitularizacaoProf;
  }
  
  public String gePEProf() {
    return NomeProfessor;
  }

  public void setPEProf(String pe) {
    this.PeriododeEntrada = pe;
  }
 
  public String getEmailProf() {
    return Email;
  }

  public void setEmailProf(String email) {
    this.Email = email;
  }

  public String getTelefoneProf() {
    return Telefone;
  }

  public void setTelefoneProf(String tel) {
    this.Telefone = tel;
  }

  public String getEnderecoProf() {
    return Endereco;
  }

  public void setEnderecoProf(String end) {
    this.Endereco = end;
  }
  
  public String getAniversaioProf() {
    return DatadeNascimento;
  }

  public void setAniversaioProf(String aniversaio) {
    this.DatadeNascimento = aniversaio;
  }
}
