/* public class Baru {
    public static void main(String[] args){
        for (int i=0;i<10;i++){
            System.out.println(i+". for");
        }
        int i=0;
        while (i<10){
            System.out.println(i+". ini while");
            i++;
        }
        int x=0;
        do{
            System.out.println(x+". ini do while");
            x++;
        } while (x<10);
    }
}
*/
import java.util.Scanner;
public class Baru {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int n=input.nextInt();
        int sum=0;
        for(int i=0;i<=10*n;i+=10){
            sum+=i;
        }
        System.out.println("Jumlah deret pertama adalah = "+sum);
    }
}