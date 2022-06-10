#include "GRAFO.h"
int main(){
	system("cls||clear");
	int direcionado = 0; 
	int qv = 6; 

	Grafo *grafo = criaGrafo(direcionado, qv);
	Aresta(grafo);

	int *lista;
	int aux;

	int op;
	do{
		op = menu();
		switch (op){
		case 1:
			system("cls||clear");
			Matriz(grafo);
			break;
		case 2:
			system("cls||clear");
			Sumario(grafo);
			Vertices(grafo, 1);
			break;
		case 3:
			system("cls||clear");
			printf("\n******************* INICIO DA LISTA DE ANTECESSORES ****************\n");
			printf("\n");

			lista = antecessores(grafo, 4, &aux);
			printf("\n_________________________________________________________________\n");
			printf("|\t");
			for (int i = 0; i < aux; i++){
				printf("%d\t|", lista[i]);
				printf("\t");
			}
			printf("\n-----------------------------------------------------------------\n\n");
			printf("\n");

			printf("\n******************* FIM DA LISTA DE ANTECESSORES *******************\n\n\n");

			break;
		case 4:
			system("cls||clear");
			printf("\n******************* INICIO DA LISTA DE SUCESSORES ****************\n");
			printf("\n");

			lista = sucessores(grafo, 4, &aux);
			printf("\n_________________________________________________________________\n");
			printf("|\t");
			for (int i = 0; i < aux; i++){
				printf("%d\t|", lista[i]);
				printf("\t");
			}
			printf("\n-----------------------------------------------------------------\n\n");
			printf("\n");
			printf("\n******************* FIM DA LISTA DE SUCESSORES *******************\n\n\n");

			break;
		case 5:
			system("cls||clear");
			limpa(grafo);
			printf("\n************************ FIM DO PROGRAMA  ************************\n\n\n");
			break;

		default:
			system("cls||clear");
			printf("\n\n!!!!!!!ERRO 404!!!!!\n!!!!!!OPCAO INVALIDA!!!!!\n");
			break;
		}
	}while (op != 5);

	return 0;
}
