package matriztablero;
import java.awt.*;
public class Matriztablero {
int i;
int j;
int ficha=1;
int matriztablero [][]= new int [9][9];
void iniciamatriz (){
    for (i = 1; i < 9; i++) {
       if (i==4|i==5) continue;
        for (j = 1; j < 9; j++) {
            if (i%2==1) {
                if (j%2==0) {
                    matriztablero[i][j]=ficha;
                ficha=ficha+1;                    
                }
                if (j%2==1){
                    matriztablero[i][j]=0;
                }
                }
            if (i%2==0) {
                if (j%2==0) {
                     matriztablero[i][j]=0;
                }
                if (j%2==1){
                    matriztablero[i][j]=ficha;
                ficha=ficha+1;
                } 
            }
}
    }     
    }
void muestramatriz () {
            for ( i = 1; i < 9; i++) {
                for (j = 1; j < 9; j++) {
                    System.out.print(matriztablero[i][j]);
                    System.out.print("   ");
                }
                System.out.println("");
            }
}
void matrizgrafica (Graphics g){

int x1=100;
int x2=200;
int c1=105;     
    for (i = 1; i < 4;) {
             g.setColor(Color.red);
             g.fillRect(x1, 50, 100, 100);
             g.setColor(Color.white);
             g.fillOval(c1, 55, 90, 90);
             g.setColor(Color.blue);
             g.fillRect(x2, 50, 100, 100);
        x1=x1+200;
        x2=x2+200;
        c1=c1+200;

    for (i = 1; i < 9; i++) {
       if (i==4|i==5) continue;
        for (j = 1; j < 9; j++) {
            if (i%2==1) {
                if (j%2==1) {
                                      
                }
                else{
                    matriztablero[i][j]=0;
                }
                }
            if (i%2==0) {
                if (j%2==1) {
                     matriztablero[i][j]=0;
                }
                else {
                    matriztablero[i][j]=ficha;
                ficha=ficha+1;
                } 
            }
}
    } 
    }
}
public static void main(String[] args) {
Matriztablero mat = new Matriztablero();
mat.iniciamatriz();
mat.muestramatriz();
 }
}