package beta2;
import java.awt.*;
public class actualizador extends java.applet.Applet implements Runnable {
    Thread runner;
    int xtab, ytab, xnewtab, ynewtab,i ,j;
    int matriz [][]=new int [9][9];
int fich=1;
    public void matrizinicial(){
        for (i = 1; i <=8; i++) {
            for (j = 1; j <=8; j++) {
                for (int i = 1; i <= 8; i++) {
            if (i==4 || i==5) continue;
            for (int j = 1; j <=8; j++) {
                if (i%2==1) {
                    if (j%2==1) {
                        matriz[i][j]=0;
                    } else {
                        matriz[i][j]=fich;
                        fich ++;
                    }
                } else {
                    if (j%2==0) {
                        matriz[i][j]=0;
                    } else {
                        matriz[i][j]=fich;
                        fich ++;
                    }
                }
            }
        }
            }
        }
    }
    public void start(){
        if (runner==null) {
            runner= new Thread(this);
            runner.start();
        }
    }
    public void run (){
       while(runner!= null){
           try {Thread.sleep(1000);}
           catch (InterruptedException e) { }
       }
       
    }
    public boolean mouseDown(Event evt,int x,int y){
    // nos da las posiciones de el clc dentro del tablero
            xtab=(-50+x)/100;
            ytab=(-20+y)/100;
            System.out.println("Posicion: "+xtab+","+ytab);
            matrizinicial();
                    for (i = 1; i <=8; i++) {
            for (j = 1; j <=8; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
            return (true);            
}
}
