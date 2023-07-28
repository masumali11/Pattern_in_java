import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while (i<=n){
            int space=1;
            while (space<=n-i){
                System.out.print(" ");
                space=space+1;
            }
            int j=1;
            int k=i;
            while (j<=i){
                System.out.print(k);
                k=k+1;
                j=j+1;
            }
            int a=1;
            while(a<i){
                System.out.print(k-2);
                k=k-1;
                a=a+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}
