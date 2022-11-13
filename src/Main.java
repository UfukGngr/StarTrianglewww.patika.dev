import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count=0;

        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen tek sayı giriniz:");
        count=scan.nextInt();
        if(count%2!=0){
            int halfCount=(count+1)/2;
            for (int i=1;i<=count;i++){
                if(i<=halfCount){
                    for (int j=0;j<(halfCount-(i));j++){
                        System.out.print(" ");
                    }
                    for (int k=0;k<(2*i-1);k++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }else{
                    for (int m=0;m<(i-(halfCount));m++){
                        System.out.print(" ");
                    }
                    for (int p=count*2;p>(2*i-1);p--){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            }
        }else
            System.out.println("Tek sayı girmelisiniz");
    }
}