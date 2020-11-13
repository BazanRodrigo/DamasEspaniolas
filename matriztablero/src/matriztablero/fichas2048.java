package matriztablero;
import java.applet.*;
import java.awt.*;
public class fichas2048 extends Applet {
Color ficharoja=new Color(231, 76, 60 );
Color fichaamarilla=new Color(241, 196, 15 );
@Override
public void paint(Graphics g) {
int i,j;
int x=105;
int y=0;
int x2;
x2 = 5;
int y2=305;
int ficha=1;
        for (i = 1; i < 9; i++) {
            for (j = 1; j < 9; j++) {
                if (i==4 || i==5) {
                    y=y+100;
        x=105;
        y2=y2+100;
        x2=5;
                } else{
                    if (i%2==1) {
                    if (j%2==0){
                        if (ficha>0 && ficha<=12) {
                        g.setColor(ficharoja);
                        g.fillOval(x, y, 100, 100);
                        x=x+200;
                        ficha=ficha+1;    
                        }
                        if (ficha>12 && ficha<25) {
                        g.setColor(fichaamarilla);
                        g.fillOval(x2, y2, 100, 100);
                        x2=x2+200;
                        ficha=ficha+1;    
                        }
                    }
                }
                if (i%2==0) {
                    if (j%2==1) {
                        if (ficha>0 && ficha<=12) {
                        g.setColor(ficharoja);
                        g.fillOval(x2, y, 100, 100);
                        x2=x2+200;
                        ficha=ficha+1;    
                        }
                        if (ficha>12 && ficha<=24) {
                        g.setColor(fichaamarilla);
                        g.fillOval(x, y2, 100, 100);
                        x=x+200;
                        ficha=ficha+1;    
                        }
                    }
                    }
            }
                }
           
        y=y+100;
        x=105;
        y2=y2+100;
        x2=5;
            }
        
       /* g.setColor(colorficha1);
        g.fillOval(x, y, 100, 100);
        g.setColor(colorficha2);
        g.fillOval(x2, y2, 100, 100);*/
    }
}
