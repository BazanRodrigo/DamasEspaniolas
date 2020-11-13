package matriztablero;
import java.applet.*;
import java.awt.*;
public class prubafichas extends Applet {
int x=0;
int y=0;
int i,j;
int ficha=1;
int matriztablero [][]= new int [9][9];
int vector[] = new int [8];
Color colorficha1=new Color(231, 76, 60 );
Color colorficha2=new Color(241, 196, 15 );
    void matriztablero (){
        for (i = 1; i < 9; i++) {
            for (j = 1; j < 9; j++) {
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
    }
    void vector (){
                for (i = 1; i <= 8; i++) {
           vector[i]=i;
        }
    }
    public void paint(Graphics g) {
        for (i = 1; i <= 8; i++) {
            if (vector.length%2==0){
                g.setColor(colorficha1);
                g.fillOval(x, y, 90, 90);   
            }
            if(vector.length%2==1){
               g.setColor(colorficha2);
                g.fillOval(x, y, 90, 90);
            }
            x=x+100;
        }
    }
}
