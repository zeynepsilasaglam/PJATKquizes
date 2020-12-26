import java.util.Scanner;
import java.lang.Math;
public class points3 {
    public static void main(String[] args) {
        int x= Integer.parseInt(javax.swing.JOptionPane.showInputDialog("write x(int):"));
        if(x<0){ x=x*-1;}
        int fourthdigit=(x/1000)%10;
        int sum=0;
        System.out.println("number is"+fourthdigit);
        for(int j=1;j<=128;j=j*2){
            if((fourthdigit&j)==j) {
                sum+=1;
            }
        }

        System.out.println("amount of 1s is"+sum);
    }
}

