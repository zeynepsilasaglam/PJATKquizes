public class Points2 {
    public static void main(String[] args) {
        int celcius = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Type value of celcius"));
        // Fahrenheit: (30°C x 1.8)+ 32 = 86°FB)
        // Kelvin: 28°C + 273.15 = 301.15 K(there is no negative values in the Kelvin scale)
        double fahrenheit=(celcius * 1.8) + 32;
        double kelvin=celcius+273.15;
        System.out.println(kelvin < 0 ? "Fahrenheit:" + fahrenheit+"F"+"\nSomething wrong, Kelvin can not be negative!": "Fahrenheit:" + fahrenheit+"F"+"\nKelvin:"+kelvin+"K");
    }
}
