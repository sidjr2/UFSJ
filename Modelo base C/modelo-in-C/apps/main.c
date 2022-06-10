#include "menu.h"


int main(){
    do
    {
        switch (menu())
        {
        case 1:
            printf("opcao 1");
            break;
        
        default:
            break;
        }
    } while (menu() == 0);
    

    return 0;
}