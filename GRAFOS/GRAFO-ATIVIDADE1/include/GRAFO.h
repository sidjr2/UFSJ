#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct TGrafo
{
	int dir;	 											 //QUANDO FOR 0 ELE E NAO DIRECIONADO, 1 ELE E DIRECIONADO
	int qv;		  											//TOTAL DE VERTICES
	int qa;		  											//TOTAL DE ARESTA
	int **matriz; 											//MATRIZ DE ADJACENCIA ALOCADA DINAMICAMENTE
} Grafo;

Grafo *criaGrafo(int dir, int qv);				   			// CRIA GRAGO
void criaAresta(Grafo *grafo, int x, int y, int peso); 		// CRIA AS ARESTA DO GRAFO

int Aresta(Grafo *grafo); 								    // ABRE ARQUIVO
void Matriz(Grafo *grafo);									// EXIBE MATRIZ DE ADJACENCIA
void limpa(Grafo *grafo);									// LIMPA MEMORIA

void Sumario(Grafo *grafo); 								// RETORNA O NUMERO DE ARESTA, VERTICES E A DENSIDADE DO GRAFO
int Vertices(Grafo *grafo, int vertice);					// RETORNA O GRAU DO VERTICE
int *sucessores(Grafo *grafo, int vertice, int *aux);		// RETORNA O ANTECESSOR DO VERTICE
int *antecessores(Grafo *grafo, int vertice, int *aux);		// RETORNA O SUCESSOR DO VERTICE
int menu();