package beta1;
public class tableronum {
int matriz [][]=new int [8][8];    
int ficha=1;
    public void crear (){
        for (int i = 1; i <= 8; i++) {
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
    public void mostrar (){
        for (int i = 1; i <=8; i++) {
            for (int j = 1; j <=8; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
