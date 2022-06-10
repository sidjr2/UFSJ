abstract class Aluno {
  String NomeAluno;
  String Curso;
  int Id;
  String Matricula;
  String Email;
  String Telefone;
  String Endereco;
  String DatadeNascimento;
  
  public Aluno (  int id, String matricula, String nomeAluno, String curso, String email, String telefone, String endereco, String datadeNascimento){
    this.Id = id;
    this.Matricula = matricula;
    this.NomeAluno = nomeAluno;
    this.Curso = curso;
    this.Email = email;
    this.Telefone = telefone;
    this.Endereco = endereco;
    this.DatadeNascimento = datadeNascimento;
    
  }
  public int idAG() {
    return Id;
  }

  public void setIdAG(int id) {
    this.Id = id;
  }

  public String matriculaAG() {
    return Matricula;
  }

  public void setMatriculaAG(String matricula) {
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

