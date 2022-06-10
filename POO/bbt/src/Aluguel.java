import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Aluguel  implements FuncoesAluguel{
  
  List<Inventario> bbt = new ArrayList<>();
  Scanner entrada = new Scanner(System.in);
  
  @Override
  public void CadastrarMaterial(String Material, String autor, String tipoMaterial, String dataLancamento, int idMaterial, int QtdMaterial){
    Inventario material = new Inventario(Material,autor,tipoMaterial,dataLancamento, idMaterial,QtdMaterial);
    
    int cad = 0;
    for(int i = 0; i< bbt.size();i++){
      if(bbt.get(i).getNomeMaterial().equals(Material)){
        System.out.printf("\n Ocorreu um Erro :(, material já esta cadastrado!!!");
        cad = 1;
      }
    }
    if(cad == 0){
      bbt.add(material);
      System.out.printf("\n Material cadastrado com Sucesso !!! :)");
    }
  }
  
  @Override
  public void ApagarMaterial(String Material){
    int apaga = 0;
    
    for(int i = 0; i < bbt.size(); i++){
      if(bbt.get(i).getNomeMaterial().equals(Material) && !bbt.get(i).Alugado){
        System.out.println("\n" + bbt.get(i).toString());
        System.out.print("DESEJA EXCLUIR ESTE MATERIAL? \n 1- SIM \n 2- NÃO \n >>>");
        apaga = 1;
        switch(entrada.nextInt()){
          case 1: 
            bbt.remove(i);
            System.out.printf("\n Material excluido com Sucesso !!! :)");

        }
      } 
      else if(bbt.get(i).getNomeMaterial().equals(Material) && bbt.get(i).Alugado){
        System.out.printf("\n Ocorreu um Erro :(, material se encontra alugado!!!");
      }
    }
    if(apaga ==0){
      System.out.printf("\n Ocorreu um Erro :(, material não se encontra cadastrado!!!");
    }
    apaga = 1;
  }
  
  @Override
  public void AlugaMaterial(String Material){
    int aluga = 0;
		for (Inventario inventario : bbt) {
			if (inventario.getNomeMaterial().equals(Material) && !inventario.Alugado) {
				System.out.println("\n" + inventario.toString());
				System.out.println("\nMaterial pode ser Alugado!");
				System.out.print("\nDeseja alugar este livro? \n 1 - Sim \n2 - Não \n >>>: ");

				switch (entrada.nextInt()) {
				case 1:
					inventario.Alugado = true;
					System.out.println("\nLivro " + inventario.getNomeMaterial() + " alugado com sucesso!");
					break;

				case 2:
					System.out.println("");
					;
				}
				aluga = 1;

			} else if (inventario.getNomeMaterial().equals(Material) && inventario.Alugado) {
				System.out.println("\nERROR! \n Material ja encontra-se alugado!");
				aluga = 1;
				inventario.Alugado = true;
			}
		}

		if (aluga == 0) {
			System.out.println("\nERROR! \n Material não encontrado!");
		}
  }
  
  @Override
  public void Devolve(String Material){
    int devolve = 0;
		for (Inventario inventario : bbt) {
			if (inventario.getNomeMaterial().equals(Material) && inventario.Alugado) {
				System.out.println("\n" + inventario.toString());
				System.out.print("\nDeseja devolver este livro? \n 1 - Sim \n2 - Não \n >>>: ");
				devolve = 1;
				switch (entrada.nextInt()) {
				case 1:
					inventario.Alugado = false;
					System.out.println("\n Material devolvido com sucesso!");
					break;
				}

			} else if (inventario.getNomeMaterial().equals(Material) && !inventario.Alugado) {
				System.out.println("\nERROR! \nLivro não alugado!");
				devolve = 1;
			}
		}

		if (devolve == 0) {
			System.out.println("\nERROR! \nLivro não encontrado!");
		}

  }
  
  @Override
  public void ImprimirTodos(){
    for(Inventario x : bbt){
      System.out.println(x.toString() + "\n");
    }
  }
  
  @Override
  public void ExibirAlugado() {
    for(Inventario inventario : this.bbt){
      if(inventario.Alugado){
        System.out.println(inventario.Alugado + "\n");
      }
    }
  }
  
  @Override
  public List<Inventario> ImpimeOrdenado(){
    Collections.sort(bbt,(Inventario1, Inventario2) -> Character.compare(Inventario1.getNomeMaterial().charAt(0),
                         Inventario2.getNomeMaterial().charAt(0)));
    for(Inventario inventario : bbt){
      System.out.println(inventario.toString() + "\n");
    }
    return bbt;
  }
}

