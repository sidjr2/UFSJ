
public class Dvd {
	  private String NomeMaterial;
	  private String Autor;
	  private String TipoMaterial;
	  private String DataLancamento;
	  private int IdMaterial;
	  private int qtdMaterial;
	  boolean Alugado;
	
	  public Dvd(String Material, String autor, String tipoMaterial, String dataLancamento, int idMaterial, int QtdMaterial) {
		this.NomeMaterial = Material;
	    this.Autor = autor;
	    this.TipoMaterial = tipoMaterial;
	    this.DataLancamento = dataLancamento;
	    this.IdMaterial =idMaterial;
	    this.qtdMaterial = QtdMaterial;
	}
	  
	@Override
	public String toString(){
	   return  "\n Titulo: "+ NomeMaterial +
	            "\n Autor: " + Autor +
	            "\n Tipo do Material: " + TipoMaterial + 
	            "\n Data de Lancamento: " + DataLancamento +
	            "\n Identificação: " + IdMaterial +
	            "\n Numero de Exemplares: " + qtdMaterial +
	            "\n Alugado: " + Alugado;
	}
	  
	public String getNomeMaterial() {
		return NomeMaterial;
	}
	
	public void setNomeMaterial(String nomeMaterial) {
		NomeMaterial = nomeMaterial;
	}
	
	public String getAutor() {
		return Autor;
	}
	
	public void setAutor(String autor) {
		Autor = autor;
	}
	
	public String getTipoMaterial() {
		return TipoMaterial;
	}
	
	public void setTipoMaterial(String tipoMaterial) {
		tipoMaterial = "DVD";
		TipoMaterial = tipoMaterial;
	}
	
	public String getDataLancamento() {
		return DataLancamento;
	}
	
	public void setDataLancamento(String dataLancamento) {
		DataLancamento = dataLancamento;
	}
	
	public int getIdMaterial() {
		return IdMaterial;
	}
	
	public void setIdMaterial(int idMaterial) {
		IdMaterial = idMaterial;
	}
	
	public int getQtdMaterial() {
		return qtdMaterial;
	}
	
	public void setQtdMaterial(int qtdMaterial) {
		this.qtdMaterial = qtdMaterial;
	}

}
