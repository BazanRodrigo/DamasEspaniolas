package beta1;
import java.applet.Applet;
import java.awt.*;
public class fichassolas extends Applet {
public void paint(Graphics g) {
Color ficharoja=new Color(231, 76, 60 );
Color fichaamarilla=new Color(241, 196, 15 );
int matriz [][]=new int [9][9];    
int ficha=1;    
     for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <=8; j++) {
                   if (i==4 || i==5) {
                //matriz[i][j]=0;
            }else{
                if (i%2==1) {
                    if (j%2==1) {
                        matriz[j][i]=ficha;
                        ficha ++;
                    } else {
                        matriz[j][i]=0;
                     }
                } if (i%2==0) {
                    if (j%2==0) {
                        matriz[j][i]=ficha;
                        ficha ++;
                    } else {
                        matriz[j][i]=0;
                    }
                }
                   }
            }
}
int c1=-95;
int c2;
     for (int i = 1; i <= 8; i++) {

        c1=c1+100;
        c2=-95;
        for (int j = 1; j <=8; j++) {
            c2=c2+100;
            if (matriz[i][j]!=0) {
                if (matriz[i][j]>0 && matriz[i][j]<=12) {
                   g.setColor(ficharoja);
                        g.fillOval(c1, c2, 90, 90);   
                }
                if (matriz[i][j]>12 && matriz[i][j]<=24) {
                      g.setColor(fichaamarilla);
                      g.fillOval(c1, c2, 90, 90);
                }
            }
        }
    }
    }
}
