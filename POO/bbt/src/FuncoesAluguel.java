import java.util.List;

public interface FuncoesAluguel {
  
  void CadastrarMaterial(String Material, String autor, String tipoMaterial, String dataLancamento, int idMaterial, int QtdMaterial);
  
  void ApagarMaterial(String Material);
  
  void AlugaMaterial(String Material);
  
  void Devolve(String Material);
  
  void ImprimirTodos();
  
  void ExibirAlugado();
  
  List<Inventario> ImpimeOrdenado();
}
