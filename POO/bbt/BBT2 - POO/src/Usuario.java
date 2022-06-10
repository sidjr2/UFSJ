import java.util.Scanner;

public class Usuario {

	Aluguel aluguel = new Aluguel();
	Reserva reserva = new Reserva();
	static Scanner scanner = new Scanner(System.in);
	static String opM;
	public static String usuario() {
		
		do{
			
			String op  = Usuario.menu();
			
			switch(op){
				case "1" :
					System.out.printf("\nBEM VINDO ALUNO DA GRADUAÇÃO\n");
					System.out.printf("\ntest\n");
					String op1 = Integer.toString(Usuario.menu3());
					if(op1 == "1"){
						System.out.printf("\nBEM VINDO A RESERVA DE MATERIAL \n");
					}
					else if(op1 == "2"){
						System.out.printf("\nBEM VINDO A ALUGUEL DE MATERIAL \n");
					}
					else if(op1 == "3"){
						System.out.printf("\nBEM VINDO A DEVOLUÇÃO DE MATERIAL \n");
					}
					else if(op1 == "4"){
						System.out.print("\nBEM VINDO AO CADASTRO DE UM NOVO USUARIO\n");
						int id = 0;
						//randomico
						id = id +1;
						System.out.print("\nDIGITE O SEU NOME:\n");
						String nomeAluno;
						nomeAluno = scanner.next();
							
						System.out.print("\nDIGITE O NUMERO DA SUA MATRICULA:\n");
						String matricula;
						matricula = scanner.next();
							
						System.out.print("\nDIGITE O SEU CURSO:\n");
						String curso;
						curso = scanner.next();
							
						System.out.print("\nDIGITE O SEU PERIODO DE ENTRADA: EX 2017/2\n");
						String periododeEntrada;
						periododeEntrada = scanner.next();

						System.out.print("\nDIGITE O SEU EMAIL:\n");
						String email;
						email = scanner.next();

						System.out.print("\nDIGITE O NUMERO DE CONTATO: ex 5532999999999\n");
						String telefone;
						telefone = scanner.next();

						System.out.print("\nDIGITE O SEU ENDERECO:\n");
						String endereco;
						endereco = scanner.next();

						System.out.print("\nDIGITE A SUA DATA DE NASCIMENTO: ex mmddaaaa\n");
						String datadeNascimento;
						datadeNascimento = scanner.next();

            AlunoGraduacao alunoGraduacao = new AlunoGraduacao(id, matricula, nomeAluno, curso, periododeEntrada, email, telefone, endereco, datadeNascimento);
						System.out.print(alunoGraduacao);
					}
					else if(op1 != "1" || op1 != "3" || op1 != "2"){
						System.out.printf("\nOPÇÃO INVALIDA\n");
					}
					else{
						System.out.printf("\nVOCE ESTA SAINDO DO PROGRAMA \nATE BREVE \n\n");
						op1 = "sair";
					}
				break;
		
				case "2": 
					String scpos = Usuario.menu2();	
					if(scpos == "1"){
						System.out.printf("BEM VINDO ALUNO DO MESTRADO");
						String op2 = Integer.toString(Usuario.menu3());
						
						if(op2 == "1"){
							System.out.printf("\nBEM VINDO A RESERVA DE MATERIAL \n");
						}
						else if(op2 == "2"){
							System.out.printf("\nBEM VINDO A ALUGUEL DE MATERIAL \n");
						}
						else if(op2 == "3"){
							System.out.printf("\nBEM VINDO A DEVOLUÇÃO DE MATERIAL \n");
						}
						else if(op2 == "4"){
							System.out.print("\nBEM VINDO AO CADASTRO DE UM NOVO USUARIO\n");
							int id = 1;
							id = id + 1;
							//randomico
							System.out.print("\nDIGITE O SEU NOME:\n");
							String nomeAluno;
							nomeAluno = scanner.next();
							
							System.out.print("\nDIGITE O NUMERO DA SUA MATRICULA:\n");
							String matricula;
							matricula = scanner.next();
							
							System.out.print("\nDIGITE O SEU CURSO:\n");
							String curso;
							curso = scanner.next();
							
							System.out.print("\nDIGITE O SEU PERIODO DE ENTRADA: EX 2017/2\n");
							String periododeEntrada;
							periododeEntrada = scanner.next();

							System.out.print("\nDIGITE O SEU EMAIL:\n");
							String email;
							email = scanner.next();

							System.out.print("\nDIGITE O NUMERO DE CONTATO: ex 5532999999999\n");
							String telefone;
							telefone = scanner.next();

							System.out.print("\nDIGITE O SEU ENDERECO:\n");
							String endereco;
							endereco = scanner.next();

							System.out.print("\nDIGITE A SUA DATA DE NASCIMENTO: ex mmddaaaa\n");
							String datadeNascimento;
							datadeNascimento = scanner.next();

              AlunoMestrado alunoMestrado = new AlunoMestrado(id, matricula, nomeAluno, curso, periododeEntrada, email, telefone, endereco, datadeNascimento);
							System.out.print(alunoMestrado);
						}
						else if(op2 != "1" || op2 != "3" || op2 != "2"){
							System.out.printf("\nOPÇÃO INVALIDA\n");
						}
						else{
							System.out.printf("\nVOCE ESTA SAINDO DO PROGRAMA \nATE BREVE \n\n");
						}
					}
					else{
						System.out.printf("BEM VINDO ALUNO DO DOUTORADO");
						String op3 = Integer.toString(Usuario.menu3());
						if(op3 == "1"){
							System.out.printf("\nBEM VINDO A RESERVA DE MATERIAL \n");
						}
						else if(op3 == "2"){
							System.out.printf("\nBEM VINDO A ALUGUEL DE MATERIAL \n");
						}
						else if(op3 == "3"){
							System.out.printf("\nBEM VINDO A DEVOLUÇÃO DE MATERIAL \n");
						}
						else if(op3 == "4"){
							System.out.print("\nBEM VINDO AO CADASTRO DE UM NOVO USUARIO\n");
							int id = 0;
							id = id +1;
							//randomico
							System.out.print("\nDIGITE O SEU NOME:\n");
							String nomeAluno;
							nomeAluno = scanner.next();
							
							System.out.print("\nDIGITE O NUMERO DA SUA MATRICULA:\n");
							String matricula;
							matricula = scanner.next();
							
							System.out.print("\nDIGITE O SEU CURSO:\n");
							String curso;
							curso = scanner.next();
							
							System.out.print("\nDIGITE O SEU PERIODO DE ENTRADA: EX 2017/2\n");
							String periododeEntrada;
							periododeEntrada = scanner.next();

							System.out.print("\nDIGITE O SEU EMAIL:\n");
							String email;
							email = scanner.next();

							System.out.print("\nDIGITE O NUMERO DE CONTATO: ex 5532999999999\n");
							String telefone;
							telefone = scanner.next();

							System.out.print("\nDIGITE O SEU ENDERECO:\n");
							String endereco;
							endereco = scanner.next();

							System.out.print("\nDIGITE A SUA DATA DE NASCIMENTO: ex mmddaaaa\n");
							String datadeNascimento;
							datadeNascimento = scanner.next();

              AlunoGraduacao alunoGraduacao = new AlunoGraduacao(id, matricula, nomeAluno, curso, periododeEntrada, email, telefone, endereco, datadeNascimento);
							System.out.print(alunoGraduacao);
						}
						else if(op3 != "1" || op3 != "3" || op3 != "2"){
							System.out.printf("\nOPÇÃO INVALIDA\n");
						}
						else{
							System.out.printf("\nVOCE ESTA SAINDO DO PROGRAMA \nATE BREVE \n\n");
						}
					}
				break;
						
				case "3": 
					System.out.printf("BEM VINDO PROFESSOR");
					String op4 = Integer.toString(Usuario.menu3());
					if(op4 == "1"){
						System.out.printf("\nBEM VINDO A RESERVA DE MATERIAL \n");
					}
					else if(op4 == "2"){
						System.out.printf("\nBEM VINDO A ALUGUEL DE MATERIAL \n");
					}
					else if(op4 == "3"){
						System.out.printf("\nBEM VINDO A DEVOLUÇÃO DE MATERIAL \n");
					}
					else if(op4 == "4"){
						System.out.print("\nBEM VINDO AO CADASTRO DE UM NOVO USUARIO\n");
						int id = 0;
						id = id +1;
						//randomico
						System.out.print("\nDIGITE O SEU NOME:\n");
						String nomeProfessor;
						nomeProfessor = scanner.next();
						
						System.out.print("\nDIGITE O NUMERO DA SUA MATRICULA:\n");
						String matricula;
						matricula = scanner.next();
						
						System.out.print("\nDIGITE A SUA TITULARIDADE:\n");
						String titularizacao;
						titularizacao = scanner.next();
						
						System.out.print("\nDIGITE O SEU PERIODO DE ENTRADA: EX 2017/2\n");
						String periododeEntrada;
						periododeEntrada = scanner.next();

						System.out.print("\nDIGITE O SEU EMAIL:\n");
						String email;
						email = scanner.next();

						System.out.print("\nDIGITE O NUMERO DE CONTATO: ex 5532999999999\n");
						String telefone;
						telefone = scanner.next();

						System.out.print("\nDIGITE O SEU ENDERECO:\n");
						String endereco;
						endereco = scanner.next();

						System.out.print("\nDIGITE A SUA DATA DE NASCIMENTO: ex mmddaaaa\n");
						String datadeNascimento;
						datadeNascimento = scanner.next();

						Professor professor = new Professor(id, matricula, nomeProfessor, titularizacao, periododeEntrada, email, telefone, endereco, datadeNascimento);
						System.out.print(professor);
					}
					else if(op4 != "1" || op4 != "3" || op4 != "2"){
						System.out.printf("\nOPÇÃO INVALIDA\n");
					}
					else{
						System.out.printf("\nVOCE ESTA SAINDO DO PROGRAMA \nATE BREVE \n\n");
					}
					break;
				default:
					System.out.printf("VOCE DIGITOU UMA OPÇÃO INVALIDA");
					break;
			}
		}while(opM != "sair");
		return opM;
	}
	private static String menu() {
		String in;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.printf("Bem vindo \n1 - Aluno de Graduacação\n2 - Aluno de Pos - Graduação\n3 - Professor\n4 - voltar\n\n>>>");
			in = entrada.next();
			while(in.equalsIgnoreCase("sair") == true){
				System.out.printf("\n\tATE BREVE\n");
        in = "sair";
			}
		}
		return in;
	}
	private static String menu2() {
		String in;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.printf("Bem vindo \n1 - Aluno de Mestrado \n2 - Aluno de Doutorado\n3 - Sair\n\n>>>");
			in = entrada.next();
			while(in.equalsIgnoreCase("sair") == true){
				System.out.printf("\n\tATE BREVE\n");
      	in = "sair";
			}
		}
		return in;
	}
	
	private static Integer menu3() {
		Integer in;
		try (Scanner sc = new Scanner(System.in)) {
				System.out.print("SEJA BEM VINDO A BBT\n\n1 - FAZER RESERVA\n2 - ALUGAR MATERIAL\n3 - DEVOLVER MATERIAL\n4 - CADASTRAR USUARIO\n0 - SAIR\n\n>>>");
				in = sc.nextInt();
				sc.nextLine();
				while(in == 0){
					System.out.printf("\n\tATE BREVE\n");
					return in;
				}
			return in;
		}
		
	}

}
