//Identificador para headerfile (arquivo de cabeçalho)
#ifndef _H_PROPRIEDADE
#define _H_PROPRIEDADE

//Inclui a biblioteca de funções para operações matemáticas
#include <math.h>
#include <stdlib.h>

//Estrutura para definir o "ponto"
typedef struct Ponto{
    float x;
    float y;
}Ponto; 

//Função para validacao o ponto onde há colisão 
int validacao(Ponto *pontos, Ponto *ancora, int Rol_pontoA, int Rol_pontoB);//ROL_ significa índice ou rótulo

//Função para checar se há colisão entre as retas
int colisao(float cordenada0__x, float cordenada0__y, float cordenada1__x, float cordenada1__y, float cordenada2__x, float cordenada2__y, float cordenada3__x, float cordenada3__y);

//Função para verificar se "y" esta contido em "x" em relação a âncora
int verifica(const void *x, const void *y);

//Função que verifica se "a" é maior que "b"
int maior(int a, int b);

//Função de usada como contador
int soluciona(int num_pontos, int *dp, Ponto *pontos, Ponto *ancora);

#endif