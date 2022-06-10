#include <stdlib.h>
#include <stdio.h>

//Fornece protótipos para funções, macros, para a manipulação de datas e horários
#include <time.h>

//Inclui a biblioteca de funções para operações matemáticas
#include <math.h>

//Inclui a biblioteca de funções tempo
#include <sys/time.h>

//Inclui definições para operações de recursos XSI (Biblioteca de linux para medir o tempo real)
#include <sys/resource.h>

//Biblioteca própria para gerenciamento de arquivos
#include "arquivos.h"

//Biblioteca própria para conferir as propriedades do ponto
#include "propriedade.h"

void menu(){
  system("cls||clear");
  printf("**********************************************************\n");
  printf("\t \tBEM VINDO AO HIPERCAMPO !!!!!!!\n");
  printf("**********************************************************\n");
  printf("\t DADO O ARQUIVO DE ENTRADA FOI ENCONTRADA:\n\n");
}

int main(int argc, char **argv){
	
	//Estrutura de tempo
    struct rusage resources;//Estrutura usada para examinar o uso de recursos de um processo
  	int rc;
  	double utime, stime, total_time;//"utimes" - Define horários de acesso e modificação de arquivos
    struct timeval start, end;
    
    gettimeofday (&start, NULL);
    
	//Abertura de arquivo
    FILE *arq_saida;
    
	Ponto *pontos, *ancora;
  
    int num_pontos, *cabe;
    char *entrada, *saida;

	//Alocação dinâmica
    entrada = (char *)malloc(100000*sizeof(char));
    saida = (char *)malloc(100000*sizeof(char));
    ancora = (Ponto *)malloc(2*sizeof(Ponto));

	//Chama o menu

    menu();

	//Função para abertura de arquivos 
    Open(argc, argv, entrada, saida);

    pontos = leitura(entrada, &num_pontos, ancora);

	//Função da biblioteca para quick-sort
    qsort(pontos, num_pontos, sizeof(Ponto), verifica);

    cabe = malloc(num_pontos*sizeof(int));

    int sol = soluciona(num_pontos,cabe,pontos,ancora);

    arq_saida = fopen(saida,"w");
    fprintf(arq_saida, "Numero de pontos posiveis: %d\n",sol);

    //Liberando as memórias alocadas
    free(entrada);
    free(saida);
    free(pontos);
    free(ancora);
    free(cabe);

    //tempo
    gettimeofday (&end, NULL);

    
    if((rc = getrusage(RUSAGE_SELF, &resources)) != 0){ 
        perror("getrusage failed");
  	}

	//Tempo do usuário
    utime = (double) resources.ru_utime.tv_sec + 1.e-6 * (double) resources.ru_utime.tv_usec;

	//Tempo do sistema
    stime = (double) resources.ru_stime.tv_sec + 1.e-6 * (double) resources.ru_stime.tv_usec;
    
	total_time = utime + stime;
    
	printf("\t\t COM O TEMPO TOTAL: %.6fs\n",total_time);
    printf("\t\t COM O TEMPO DO GETTIMEOFDAY: %.6fs",(double)((end.tv_sec-start.tv_sec)*1000000L +end.tv_usec)-start.tv_usec);

    fprintf(arq_saida,"\n -> GETTIMEOFDAY:  %.f\xC2\xB5s", (double)((end.tv_sec-start.tv_sec)*1000000L +end.tv_usec)-start.tv_usec);
    fprintf(arq_saida,"\n -> USER TIME: %.6fs\n -> SYSTEM TIME:  %.6fs\n -> TOTAL TIME: %.6fs\n",utime, stime, total_time);
    fclose(arq_saida);
    
	printf("\n\n");
return 0;
}
