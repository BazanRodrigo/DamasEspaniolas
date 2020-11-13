package matriztablero;
import java.applet.*;
import java.awt.*;
public class fichas1024 extends Applet {

//int matriztablero [][]= new int [9][9];
    public void paint(Graphics g) {
Color colorficha1=new Color(231, 76, 60 );
Color colorficha2=new Color(241, 196, 15 );
int posfichax1=105;
int posfichay1=5;
int posfichax2=5;
int posfichay2=505;
int i,j;
int ficha=1;
        for (i = 0; i <= 8; i++) {
        for (j = 0; j <= 8; j++) {
            if (i%2==1) {
                if (j%2==0) {
                    if (ficha<12) {
                  g.setColor(colorficha1);
                  g.fillOval(posfichax1, posfichay1, 90, 90);
                  posfichax1=posfichax1+200;    
                    }
                if (ficha>12 && ficha<24) {
                  g.setColor(colorficha2);
                  g.fillOval(posfichax2, posfichay2, 90, 90);
                  posfichax2=posfichax2+200;    
                    }    
                ficha=ficha+1;
                }
               
            }
            if (i%2==0) {
                if (ficha<=12) {
                  g.setColor(colorficha1);
                  g.fillOval(posfichax2, posfichay2, 90, 90);
                  posfichax1=posfichax1+200;    
                    }
                if (ficha>12 && ficha<24) {
                  g.setColor(colorficha2);
                  g.fillOval(posfichax2, posfichay2, 90, 90);
                  posfichax2=posfichax2+200;    
                    }    
                ficha=ficha+1;
                }
                
            }
        posfichay1=posfichay1+100;
        posfichay2=posfichay2+100;
        posfichax1=5;
        posfichax2=5;
       
        }    
            }
   
  
    }   
    

