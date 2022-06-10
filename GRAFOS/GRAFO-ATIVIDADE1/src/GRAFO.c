#include "GRAFO.h"

Grafo *criaGrafo(int dir, int qv){

	Grafo *grafo = (Grafo *)malloc(sizeof(Grafo));
	grafo->matriz = (int **)malloc(qv * sizeof(int *));

	grafo->dir = dir;
	grafo->qv = qv;
	grafo->qa = 0;

	for (int i = 0; i < qv; i++){

		grafo->matriz[i] = (int *)calloc(qv, sizeof(int)); //ALOCANDO A MATRIZ COM O TAMANHO 0
	}

	return grafo;
}

void criaAresta(Grafo *grafo, int x, int y, int peso){

	if (x < 0 || x >= grafo->qv){

		printf("\nVERTICE DO GRAFO :\n\tINDICE: %d NAO EXISTE OU < 0\n E O MAIOR INDICE:  %d\n", x, grafo->qv - 1);
		return;
	}
	if (y < 0 || y >= grafo->qv){

		printf("\nVERTICE DO GRAFO :\n\tINDICE: %d NAO EXISTE OU < 0\n E O MAIOR INDICE:  %d\n", y, grafo->qv - 1);
		return;
	}
	if (grafo->matriz[x][y] == 0){

		grafo->qa++;			  //FAZ A SOMA SOMENTE DAS NOVAS ARESTAS.
	}
	if (grafo->dir){

		grafo->matriz[x][y] = peso;
	}
	else{

		grafo->matriz[x][y] = peso;
		grafo->matriz[y][x] = peso;
	}
}

void Matriz(Grafo *grafo){

	printf("\n************************************** MATRIZ DE ADJACENCIA *************************************\n\n");
	printf("\n_________________________________________________________________________________________________\n");

	for (int i = 0; i < grafo->qv; i++){

		printf("|");
		for (int j = 0; j < grafo->qv; j++){

			printf("\t%d\t|", grafo->matriz[i][j]);
		}

		printf("\t");
		printf("\n");
	}

	printf("-------------------------------------------------------------------------------------------------\n\n");
}

int Aresta(Grafo *grafo){

	char entrada[200];
	int x, y, peso;

	printf("\n\n************************************* INICIO DO PROGRAMA ***********************************\n\n");
	printf("POR FAVOR DIGITE O NOME DO ARQUIVO DE ENTRADA(EX: entrada.txt): ");
	scanf("%[^\n]%*c", entrada);

	FILE *arq = fopen(entrada, "r");
	if (arq == NULL){

		printf("\nERRO NA LEITURA DO ARQUIVO.\n\n");
		return 0;
	}
	else{

		while (fscanf(arq, "%d %d %d", &x, &y, &peso) != EOF){

			criaAresta(grafo, x, y, peso);
		}
	}
	printf("LEITURA DO ARQUIVO FEITA COM SUCESSO.\n\n");
	fclose(arq);
	return 1;
}

void Sumario(Grafo *grafo){

	float vertice = grafo->qv;
	float aresta = grafo->qa;
	float densidade;

	printf("\n************************************** ESTATISTICA DO GRAFO ************************************** \n");

	if (grafo->dir){

		densidade = aresta / (vertice * (vertice - 1));
	}
	else{

		densidade = 2 * aresta/ (vertice * (vertice - 1));
	}

	printf("\n\n\t\tVERTICES: %d\n\t\tARESTAS: %d\n\t\tDENSIDADE: %.2f\n\t\t", grafo->qv, grafo->qa, densidade);
}

int Vertices(Grafo *grafo, int vertice){

	int grau = 0;
	if (grafo->dir){

		for (int i = 0; i < grafo->qv; i++){

			if (grafo->matriz[i][vertice] != 0){

				if (grafo->matriz[vertice][i] == 0){ //PULA A CONTAGEM DO GRAU DO VERTICIE TANTO INDO   VOLTANDO

					grau++;
				}
			}
		}
	}
	
	for (int i = 0; i < grafo->qv; i++){

		if (grafo->matriz[vertice][i] != 0){
		
			grau++;
		}
	}

	printf("\n\t\tO VERTICE (%d) TEM GRAU DE: %d\n\n", vertice, grau);
	return grau;
}

int *sucessores(Grafo *grafo, int vertice, int *aux){

	int *sucessor = NULL;
	*aux = 0;

	for (int i = 0; i < grafo->qv; i++){

		if (grafo->matriz[vertice][i] != 0){

			*aux = *aux + 1;
			sucessor = (int *)realloc(sucessor, (*aux) * sizeof(int));
			sucessor[(*aux) - 1] = i;
		}
	}

	return sucessor;
}
int *antecessores(Grafo *grafo, int vertice, int *aux){

	int *antecessor = NULL;
	*aux = 0;

	for (int i = 0; i < grafo->qv; i++){

		if (grafo->matriz[i][vertice] != 0){

			*aux = *aux + 1;
			antecessor = (int *)realloc(antecessor, (*aux) * sizeof(int));
			antecessor[(*aux) - 1] = i;
		}
	}

	return antecessor;
}

int menu(){

	int OP;

	printf("************************************* SEJA BEM VINDO AO GRAFO ***********************************\n");
	printf("\t\tDENTRE AS OPCAO ABAIXO SELECIONE UMA:\n\t\t\t01 - IMPRIME MATRIZ ADJACENTE DO GRAFO\n\t\t\t02 - ESTATISTICAS DO GRAFO\n\t\t\t03 - LISTA DE ANTECESSORES\n\t\t\t04 - LISTA DE SUCESSORES\n\t\t\t05 - SAIR\n\n\t\t>>>");
	scanf("%d",&OP);

	return OP;
}

void limpa(Grafo *grafo){

	printf("INICANDO A LIMPEZA DO GRAFO");

	for (int i = 0; i < grafo->qv; i++){

		free(grafo->matriz[i]);
	}

	free(grafo->matriz);
	free(grafo);

	printf("\nLIMPEZA DO GRAFO FEITA COM SUCESSO\n");
}