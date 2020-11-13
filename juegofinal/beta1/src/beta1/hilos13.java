package beta1;
import java.awt.*;
import java.io.*;
public class hilos13 {
BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
int elim, nuevo, aux, bus, pos,x,i,j,cont=1 ,y, posx, posy;
boolean encontrado=false;
int matriz [][]= new int [10][10];
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
void buscar()         {
System.out.println("--------------- Busqueda de valores -----------------");            
            System.out.println("Ingresa el valor a buscar");
           // bus=Integer.parseInt(teclado.readLine);
            
            for ( i = 0; i < x; i++) {
              for (j = 0; j < y; j++) {
                if (matriz[i][j]==bus) {
                    posx=i;
                    posy=j;
                    encontrado = true;                           
                }  
            }
            }
            if(encontrado=true)
                System.out.println("el elemento "+matriz[posx][posy]+" fue encontrado en la posicion ["+posx+"] ["+posy+"]");
            else
                System.out.println("El elemento que busca no esta en la lista");
        }

void modificar()throws IOException {
        encontrado=false;
System.out.println("--------------- Modificacion de algun valor -----------------");        
        System.out.println("Introduce el número a modificar:");
        bus=Integer.parseInt(teclado.readLine());
        for ( i = 0; i < x; i++) {
            for (j = 0; j < y && !encontrado; j++) {
               if (matriz[i][j]==bus) {
                posx=i;
                posy=j;
                encontrado=true;                       
            } 
            }
            
        }
        if (encontrado==true) {
            System.out.println("Da el nuevo valor");
            nuevo=Integer.parseInt(teclado.readLine());
            matriz[posx][posy]=nuevo;                
        }
        else {
            System.out.println("El elemento no se encuentra");
        }
        System.out.println("Lista nueva con el elemento modificado");
    }
public static void main(String[] args) {
hilos13 mat = new hilos13();
mat.iniciamatriz();
mat.muestramatriz();
mat.buscar();
 }
}    

