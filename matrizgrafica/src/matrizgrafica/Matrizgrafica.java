package matrizgrafica;
import java.io.*;
public class Matrizgrafica {
    int i, j;
int ficha=1;
int matriztablero[][];  
void matrizcodigo() {    
        for (i = 1; i < 9; i++) {
            for (j = 1; j < 10; j++) {
                if (i%2==0){
                    if (j%2==0){
                        matriztablero[i][j]=0;
                    }
                    else   {
                        matriztablero[i][j]=ficha;
                        ficha=ficha+1;
                    }
                }
                if (i%2==1) {
                  if (j%2==1){
                        matriztablero[i][j]=0;
                    }
                  else   {
                        matriztablero[i][j]=ficha;
                        ficha=ficha+1;
                    }  
                }
            }
            
        }
    }
void mostrarmatriz (){
    for (i = 1; i < 9; i++) {
        for (j = 0; i <9; i++) {
            System.out.println(matriztablero[i][j]);
        }
        
    }
}
public static void main(String[] args) {   
Matrizgrafica mat = new Matrizgrafica();
mat.matrizcodigo();
mat.mostrarmatriz();
}
}
