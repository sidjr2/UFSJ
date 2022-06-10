#include <stdio.h>
#include <stdlib.h>

//Fornece acesso à API (Interface de Programação de Aplicativo) do sistema
#include <unistd.h>
#include <string.h>

//Biblioteca própria para o gerenciamento de arquivos
#include "arquivos.h"

float pegaX(Ponto *a){
	return a->x;
}
float pegaY(Ponto *a){
    return a->y;
}

void AJUDA(){
    fprintf(stderr, "\t\t MAS ANTES  FOI ENCONTRADO UM ERRO\n\t PARA O FUNCIONAMENTO DESSE PROGRAMA DEVE TER 2\n\t      AQUIVOS, USE AS FLAG DA SEGUINTE FORMA:\n\
    -i NOME DO ARQUIVO DE CONFIGURACAO\n\
    -o NOME DO ARQIVO PARA SALVAR O RESUTADO\n");
    exit(-1);
}

//Leitura do ponto
Ponto *leitura(char *nomedaEntrada, int *num_pontos, Ponto *ancora) {
    int i;
    Ponto *pontos;

    FILE *arq_Entrada = fopen(nomedaEntrada, "r");
    fscanf(arq_Entrada, "%d %f %f\n", num_pontos, &(ancora->x), &((ancora+1)->x));
    if((*num_pontos <0)||(ancora[0].x >= ancora[1].x)||(ancora[1].x >10000)){
        printf("SUA ENTRADA DE CONFIGURACAO E UMA ENTRADA INVALIDA TENTE OUTRO ARQUIVO!\n");
        exit(0);
    }
    ancora[0].y = 0;
    ancora[1].y = 0;

    pontos = (Ponto *)malloc(*num_pontos * sizeof(Ponto));

    for(i = 0; i < *num_pontos; i++){
        fscanf(arq_Entrada, "%f %f\n", &(pontos[i].x), &(pontos[i]).y);
    }
    fclose(arq_Entrada);
    return pontos;
}

//Função recebe os arquivos e abre dada a sua instrução
int Open(int argc, char **argv, char *nomedaEntrada, char *nomedaSaida){
    int op;

	//Retorna a ajuda caso não haver arquivos
    if(argc < 5){
        AJUDA();
    }

    //Entra no while se haver arquivos corretos
    while((op = getopt(argc, argv, "i:o:")) != -1){
        switch (op) {
            case 'i':
                strcpy(nomedaEntrada, optarg);
                break;
            case 'o':
                strcpy(nomedaSaida, optarg);
                break;
            default:
                fprintf(stderr, "ERRO!, OPCAO INVALIDA OU FALTA ARQUIVO : `%c'\n", optopt);
                return -1;
                break;
        }
    }
    return EXIT_SUCCESS;
}