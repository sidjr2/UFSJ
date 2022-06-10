import java.util.ArrayList;

public class Inventario {
  private String NomeMaterial;
  private String Autor;
  private String TipoMaterial;
  private String DataLancamento;
  private int IdMaterial;
  private int qtdMaterial;
  boolean Alugado;
  ArrayList<String> Inventario = new ArrayList<>();

  public Inventario(String Material, String autor, String tipoMaterial, String dataLancamento, int idMaterial, int QtdMaterial) {
    this.NomeMaterial = Material;
    this.Autor = autor;
    this.TipoMaterial = tipoMaterial;
    this.DataLancamento = dataLancamento;
    this.IdMaterial =idMaterial;
    this.qtdMaterial = QtdMaterial;
  }
  
  public String toString(){
    return  "\n Titulo: "+ NomeMaterial +
            "\n Autor: " + Autor +
            "\n Tipo do Material: " + TipoMaterial + 
            "\n Data de Lancamento: " + DataLancamento +
            "\n Identificação: " + IdMaterial +
            "\n Numero de Exemplares: " + qtdMaterial;
  }

  public int getQtdMaterial() {
    return qtdMaterial;
  }

  public void setQtdMaterial(int QtdMaterial) {
    this.qtdMaterial = QtdMaterial;
  }

  public int getIdMaterial() {
    return IdMaterial;
  }

  public void setIdMaterial(int idMaterial) {
    this.IdMaterial = idMaterial;
  }

  public String getNomeMaterial(){
    return NomeMaterial;
  }

  public void setNomeMaterial(String NomeMaterial) {
    this.NomeMaterial = NomeMaterial;
  }
  public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		this.Autor = autor;
	}
  public String getDataLançamento() {
		return DataLancamento;
	}

	public void setDataLançamento(String dataLancamento) {
		this.DataLancamento = dataLancamento;
	}
  public String getTipo() {
		return TipoMaterial;
	}

	public void setTipo(String tipoMaterial) {
		this.TipoMaterial = tipoMaterial;
	}

}
