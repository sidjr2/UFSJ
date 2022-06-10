import java.util.Scanner;

public class Material {
	//private Integer qtdMaterias;
	public Material() {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.printf("MENU MATERIAL \n 1 - CD\n 2 - DVD\n 3 - REVISTA\n 4 - LIVRO\n 5 - SAIR\n>>>");
			String op =	entrada.nextLine();
			switch(op){
				case "1":
					System.out.printf("MENU CD");
					break;
				case "2":
					System.out.printf("MENU DVD");
					break;
				case "3":
					System.out.printf("MENU REVISTA");
					break;
				case "4":
					System.out.printf("MENU LIVROS");
					break;
				case "5":
					System.out.printf("ATE BREVE");
					break;
				default:
					System.out.printf("VOCE DIGITOU UMA OPÇÃO INVALIDA");
					break;
			}
		}
	}

}
