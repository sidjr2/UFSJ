#include <stdio.h>
#include <stdlib.h>

//Biblioteca própria do trabalho hipercampo
#include "propriedade.h"

//Função para verificar se "b" esta contido em "a" em relação a âncora
int verifica(const void *x, const void *y){
    int dir = ((Ponto *)x)->y;
    int esq = ((Ponto *)y)->y;
    return (dir - esq);
}

//Função que verifica se "a" é maior que "b"
int maior(int a, int b){
    if(a > b){
        return a;
    }
    else{
        return b;
    }
}

//Função de colisao entre as retas
int colisao(float cordenada0__x, float cordenada0__y, float cordenada1__x, float cordenada1__y, float cordenada2__x, float cordenada2__y, float cordenada3__x, float cordenada3__y){
    float Sol1_x,Sol1_y, Sol2_x, Sol2_y;
    float s,t;

    Sol1_x = cordenada1__x - cordenada0__x;
    Sol1_y = cordenada1__y - cordenada0__y;

    Sol2_x = cordenada3__x - cordenada2__x;
    Sol2_y = cordenada3__y - cordenada2__y;

    s = (-Sol1_y * (cordenada0__x - cordenada2__x) + Sol1_x * (cordenada0__y - cordenada2__y)) / (-Sol2_x * Sol1_y + Sol1_x * Sol2_y);
    t = ( Sol2_x * (cordenada0__y - cordenada2__y) - Sol2_y * (cordenada0__x - cordenada2__x)) / (-Sol2_x * Sol1_y + Sol1_x * Sol2_y);

    if (s >= 0 && s <= 1 && t >= 0 && t <= 1){
        return 0;//Houve colisão 
    }
    return 1;//Não houve colisão
}

//Função para varificar os pontos se tem colisão, quando retorna-se 0 -> há colisão ||  1(um) -> não há colisão
int validacao(Ponto *pontos, Ponto *ancora, int Rol_pontoA, int Rol_pontoB){
    
	//Se nao se colide, retorna 1(um) logo B esta contido dentro de A
    if(colisao(pontos[Rol_pontoA].x, pontos[Rol_pontoA].y, ancora[0].x, 0, pontos[Rol_pontoB].x, pontos[Rol_pontoB].y, ancora[1].x, 0) == 1){
        if(colisao(pontos[Rol_pontoA].x, pontos[Rol_pontoA].y, ancora[1].x, 0, pontos[Rol_pontoB].x, pontos[Rol_pontoB].y, ancora[0].x, 0) == 1){
            if(colisao(pontos[Rol_pontoA].x, pontos[Rol_pontoA].y, ancora[1].x, 0, pontos[Rol_pontoB].x, pontos[Rol_pontoB].y, ancora[0].x, 0) == 1){
                if(pontos[Rol_pontoB].y < pontos[Rol_pontoA].y){
                    return 1;
                }
            }
        } 
    }
    return 0;
}

//Função usada como contador
int soluciona(int num_pontos, int *cabe, Ponto *pontos, Ponto *ancora){
    
	int i, j, soluc = 0;
    
	for (i = 0; i < num_pontos; ++i){
        cabe[i]= 1;
        for (j = 0; j < i; ++j){
            if(validacao(pontos, ancora, i, j) == 1){
                cabe[i]= maior(cabe[i],cabe[j]+1);
            }
        }
        if(soluc < cabe[i]){
            soluc = cabe[i];
        }
        
    }
    
	printf("\t\t %d POSSIVEIS COMBINACOES\n\n", soluc);
    return soluc;
}