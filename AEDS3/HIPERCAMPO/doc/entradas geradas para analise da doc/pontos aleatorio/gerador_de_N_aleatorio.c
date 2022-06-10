#include <stdio.h>
#include <stdlib.h>
#include <string.h>


void escreveArq(FILE *pf, int n);


int main(){
    FILE *pf;
    int n;
    printf("numero de linhas: ");
    scanf("%d", &n);
    pf = fopen("pontos.txt", "w");
    if(pf == NULL){
        printf("deu ruim pra abrir\n");
        return 1;
    }
    escreveArq(pf, n);
    fclose(pf);
    return 0;
}


void escreveArq(FILE *pf, int n){
    int x = rand()%100;
    int y = rand()%10000;
    if(x>y){
        int t=x;
        x = y;
        y = t;
    }
    fprintf(pf, "%d %d %d\n", n, x, y);
    for(int i=0; i<n; i++){
        x = rand()%10000;
        y = rand()%10000;
        fprintf(pf, "%d %d\n", x, y);
    }
}