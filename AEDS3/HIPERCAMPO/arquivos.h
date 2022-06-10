//ifndef = Identificador para headerfile (arquivo de cabeçalho)
#ifndef _H_ARQUIVO
#define _H_ARQUIVO

//Biblioteca própria para conferir as características do ponto
#include "propriedade.h"

float pegaX(Ponto *a);
float pegaY(Ponto *a);

//Chama a "ajuda"
void AJUDA();

//Função que abre os arquivos de dentro da própria função
int Open(int argc, char **argv, char *entrada, char *saida);


Ponto *leitura(char *entrada, int *num_pontos, Ponto *ancora);

#endif