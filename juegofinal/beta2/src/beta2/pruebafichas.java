package beta2;
import java.awt.*;
public class pruebafichas extends java.applet.Applet {
    Image fichar, fichan, ficharc, fichanc, cuadrob, cuadron;
    public void init(){
        fichar = getImage(getCodeBase(),"images/ficharoja.png");
        fichan = getImage(getCodeBase(),"images/fichanegra.png");
        ficharc = getImage(getCodeBase(),"images/ficharojacoronada.png");
        fichanc = getImage(getCodeBase(),"images/fichanegracoronada.png");
        cuadrob = getImage(getCodeBase(),"images/cuadrob.jpg");
        cuadron = getImage(getCodeBase(),"images/cuadron.jpg");
    }
    public void paint (Graphics g){
        int xpos = 10;
        
setBackground(Color.darkGray);
       g.drawImage(fichar, xpos, 10, this);
       xpos+=100;
        g.drawImage(fichan, xpos, 10, this);
        xpos+=100;
        g.drawImage(ficharc, xpos, 10, this);
        xpos+=100;
        g.drawImage(fichanc, xpos, 10, this);
        xpos+=100;
        g.drawImage(cuadrob, xpos, 10, this);
    }
}
