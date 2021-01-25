public class points4 {
    public static void main(String[] args) {
        // task 1 //second option
        int x = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Type value of x"));
        int y = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Type value of y"));
        for (int i = 1; i <= x; ++i){
            for (int j = 1; j <= y; ++j){
                System.out.print((int)Math.pow(i, j) + "\t");
            }
            System.out.println();
        }
    }
}
