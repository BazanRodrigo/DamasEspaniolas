package fichaenmovimiento;
import java.applet.*;
import java.awt.*;
public class appletfenm extends java.applet.Applet implements Runnable {
int rval,gval,bval, j, i;
    public void run() {
int alto=300;
int ancho=300;
    for (j = 30; j <(alto-30); j+=30) {
        for (i = 5; i < (ancho-30); i+=30) {
            rval=(int)Math.floor(Math.random()*256);
            gval=(int)Math.floor(Math.random()*256);
            bval=(int)Math.floor(Math.random()*256);
        }
    }
    }
public void paint (Graphics g){
    g.fillRect(i, j, 25, 25);
    g.setColor(Color.black);
    g.drawRect(i-1, j-1, 25, 25);
    setBackground(Color.blue);
}
}
