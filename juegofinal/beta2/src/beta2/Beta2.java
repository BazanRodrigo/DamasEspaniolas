package beta2;
import java.awt.*;
public class Beta2 {
public static void main(String[] args) {
int matriz [][]=new int [9][9];    
int ficha=1;
        for (int i = 1; i <= 8; i++) {
            if (i==4 || i==5) continue;
            for (int j = 1; j <=8; j++) {
                if (i%2==1) {
                    if (j%2==1) {
                        matriz[i][j]=0;
                    } else {
                        matriz[i][j]=ficha;
                        ficha ++;
                    }
                } else {
                    if (j%2==0) {
                        matriz[i][j]=0;
                    } else {
                        matriz[i][j]=ficha;
                        ficha ++;
                    }
                }
            }
        }
    
        
}
}

    

