import java.util.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void LimpaTela(){
        if(System.getProperty("os.name").contains("Windows")){
            try{
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }catch(Exception e){
                System.out.printf(e.getMessage());
            }
        }
        else{
            try{
                Runtime.getRuntime().exec("clear");
            }
            catch(Exception e){
                System.out.printf(e.getMessage());
            }
        }
    }
    //data e hora 
    public static Date dia(int d){
        Locale myLocale = Locale.getDefault();
        Calendar dataAtual = Calendar.getInstance(myLocale);
        dataAtual.add(Calendar.DATE, d);
        return dataAtual.getTime();
    }
    public static LocalDate localdia(Date dia){
        Instant instant = dia.toInstant();
        ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
        LocalDate date = zdt.toLocalDate();
        return date;
    }
    Inventario inventario;
    static ArrayList<String> Usuarios; // deve contem uma lista de todos os alunos e professores 
    ArrayList<String> Alugados = new ArrayList<>(); // deve contem uma lista com todos os materias alugados 
    ArrayList<String> Vencidos = new ArrayList<>(); // deve contem uma lista com todos os materias vencidos 
    
    public static void main(String[] args) throws Exception {
        String nomeMaterial, autor, tipoMaterial, dataLancamento;
        int idMaterial,qtdMaterial;
        Scanner ler = new Scanner(System.in);
            String option = "op";
            Usuarios = new ArrayList<>();
            
            Aluguel bbt = new Aluguel();

            while(option.equalsIgnoreCase("sair") != true){
                System.out.printf("\n\t\t       SEJA BEM VINDO AO BBT"+
                                      "\n\tSEU SISTEMA DE GERENCIAMENTO DE ALOCAÇÃO DE LIVROS\n\n"+
                                      "\t 1 - Alugar Material\n"+
                                      "\t 2 - Devolver Material\n"+
                                      "\t 3 - Extrato Inventario\n"+
                                      "\t 4 - Cadastrar No Inventario\n" +
                                      "\t 5 - Apagar Do Inventario\n" +
                                      "\t 0 - Sair\n");
                option = ler.nextLine();
                switch(option){
                    case "1":
                        System.out.printf("\n\tALUGUEL\n");
                        System.out.printf("DIGITE O NOME DO MATERIAL:");     
                        nomeMaterial = ler.next();
                        bbt.AlugaMaterial(nomeMaterial);
                        break;
                    case "2":
                        System.out.printf("\n\tDEVOLVER MATERIAL;\n");
                        System.out.printf("DIGITE O NOME DO MATERIAL:");
                        nomeMaterial = ler.next();
                        bbt.Devolve(nomeMaterial);  
                        break;
                    case "3":
                        int opExtrato;
                        System.out.printf("\n\tEXTRATO DO INVENTARIO\n");    
                        System.out.println(" \n 1 - Imprimir Alugados"+
                                                "\n 2 - Imprimir Todos" +
                                                "\n 3 - Imprimir Ordenado\n >>>");
                        opExtrato = ler.nextInt();
                        switch(opExtrato){
                            case 1:
                                System.out.printf("\n\tEXTRATO DE MATERIAIS ALUGADO NO INVENTARIO\n");
                                bbt.ExibirAlugado();
                                break;
                            case 2:
                                System.out.printf("\n\tEXTRATO DE TODOS OS MATERIAIS NO INVENTARIO\n");
                                bbt.ImprimirTodos();
                                break;
                            case 3:
                                System.out.printf("\n\tEXTRATO DE TODOS OS MATERIAIS NO INVENTARIO ORDENADO\n");
                                bbt.ImpimeOrdenado();
                                break;
                        }        
                        break;
                    case "4":
                        int opNovoCadastro = 1;
                        Random id = new Random(19700621);
                        System.out.printf("\n\t CADASTRO DE NOVO MATERIAL;\n");
                        System.out.printf("\n\t -- PRESTE ATENÇÃO !!!--;\n");
                        System.out.printf("\n\t INSIRA O NOME DO MATERIAL:\n");
                        nomeMaterial = ler.next();
                        System.out.printf("\n\t INSIRA O NOME DO AUTOR DO MATERIAL:\n");
                        autor = ler.next();
                        System.out.printf("\n\t INSIRA O TIPO DO MATERIAL(CD,DVD,REVISTA,ETC):\n");
                        tipoMaterial = ler.next();
                        System.out.printf("\n\t INSIRA A DATA DE LANCAMENTO DO MATERIAL;\n");
                        dataLancamento = ler.next();
                        idMaterial = id.nextInt();
                        System.out.printf("\n\t INSIRA A QUANTIDADE DISPONIVEL DO MATERIAL;\n");
                        qtdMaterial = ler.nextInt();

                        bbt.CadastrarMaterial(nomeMaterial, autor, tipoMaterial, dataLancamento, idMaterial, qtdMaterial);
                        System.out.printf("\n\t DESEJA CADASTRAR UM NOME MATERIAL:\n"+
                                          "\n\t 1 - SIM"+
                                          "\n\t 2 - NÃO");
                        opNovoCadastro = ler.nextInt();
                        if(opNovoCadastro == 1){
                            opNovoCadastro = 1;
                        }
                        else if(opNovoCadastro != 1 && opNovoCadastro != 2){
                            System.out.printf("\n\t OPÇÃO INVALIDA!!\n");
                            opNovoCadastro = 2;
                        }
                        else{
                            opNovoCadastro = 2;
                        }
                        break;
                    case "5":
                        System.out.printf("\n\t APAGAR MATERIAL;\n");
                        System.out.printf("DIGITE O NOME DO MATERIAL:");
                        nomeMaterial = ler.next();
                        bbt.ApagarMaterial(nomeMaterial);
                        break;
                    case "0":
                        System.out.printf("voce esta saindo do programa");
                        System.out.printf("\n\tATE BREVE\n");
                        option = "sair";
                        break;
                    default:
                        System.out.printf("VOCE DIGITOU UMA OPÇÃO INVALIDA");
                        break;
                    }
                    //FIM DA MAIN
                }
        }         
    }