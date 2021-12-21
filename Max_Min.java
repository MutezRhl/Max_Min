/*
iki boyutlu sayısal dizisinin:
A) En büyük değeri bulan ve geri döndüren
B) En büyük ve en küçük değeri bulan ve geri döndüren
C) En büyük değeri ve bunun kaçıncı satır ve sütunda olduğunu bulup geri döndüren metodu ve java proramı. 
*/
package max_min;
import java.util.Scanner;
public class Max_Min {
    public static int[] maxBul(int[][] a){
        int x=0,y=0;
       int enb=a[0][0];
       for(int i=0;i<a.length;i++){
           for(int j=1;j<a[0].length;j++){
               if(enb<a[i][j]){
                   enb=a[i][j];
                   x=i;y=j;
               }
           }
       }
       int[] enbIndis={enb,x,y};
       return enbIndis;
    }
    
    public static int[] max_min_bul(int[][] b){
        int enb=b[0][0],enk=b[0][0];
             for(int i=0;i<b.length;i++){
                for(int j=1;j<b[0].length;j++){
                    if(enb<b[i][j]){
                        enb=b[i][j];
                    }
                    if(enk>b[i][j]){
                        enk=b[i][j];
                    }
                }
           }
             int[] maxMin={enb,enk};
             return maxMin;
    }
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Dizinin elemanlarini giriniz");
        int[][] x=new int[3][3];
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[0].length;j++){
                    x[i][j]=k.nextInt();
            }            
        }
        int[] y=new int[3];
        y=maxBul(x);
            System.out.println("En büyük sayının değeri "+y[0]+" ve sayının indisi ("+y[1]+","+y[2]+")");
        
        int[] m=new int[2];
        m=maxBul(x);
            System.out.println("En büyük sayının değeri "+m[0]+" En küçük sayının değeri "+m[1]);
        
    }
    
}
