import java.util.Scanner;

public class points3_nomathpower {
    public static void main(String[] args) {
        double x= Double.parseDouble(javax.swing.JOptionPane.showInputDialog("write value of x(double):"));
        double result=0;

        int maxpower= Integer.parseInt(javax.swing.JOptionPane.showInputDialog("write maximum power of x(int):"));
        for(int i=maxpower;i!=-1;i--) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the parameter(from x in the power of max):");
            int parameter = input.nextInt();
            double powerx=1;
           for(int j=i;j!=0;j--){
               powerx=powerx*x;
           }
            result+=parameter*powerx;
        }
        System.out.println("Answer:"+result);

    }
}
