package matriztablero;
import java.applet.*;
import java.awt.*;
public class ficchasamarillas extends Applet {
    public void paint(Graphics g) {
Color ficharoja=new Color(231, 76, 60 );
Color fichaamarilla=new Color(241, 196, 15 );
int i,j;
int xf1=105;
int yf1=0;
int xf2=5;
int y2=305;
int ficha=1;
for (i = 1; i <=8; i++) {
            for (j = 1; j <=8 ; j++) {
                if (i==4 || i==5 ) continue;
if (i%2==1) {
                    if (j%2==0){
                        if (ficha>0 && ficha<13) {
                        g.setColor(ficharoja);
                        g.fillOval(xf1, yf1, 100, 100);
                        xf1=xf1+200;
                        ficha=ficha+1;    
                        }
                        if (ficha>=13 && ficha<=25) {
                        g.setColor(fichaamarilla);
                        g.fillOval(xf1, yf1, 100, 100);
                        xf1=xf1+200;
                        ficha=ficha+1;    
                        }
                    }
                }
                if (i%2==0) {
                    if (j%2==1) {
                        if (ficha>0 && ficha<=12) {
                        g.setColor(ficharoja);
                        g.fillOval(xf2, yf1, 100, 100);
                        xf2=xf2+200;
                        ficha=ficha+1;    
                        }
                        if (ficha>=13 && ficha<=25) {
                        g.setColor(fichaamarilla);
                        g.fillOval(xf2, yf1, 100, 100);
                        xf2=xf2+200;
                        ficha=ficha+1;    
                        }
                    }
                    }
            }    
 yf1=yf1+100;
        xf1=105;
        y2=y2+100;
        xf2=5;
}
           
            }
    }
    


