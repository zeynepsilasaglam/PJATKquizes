public class points7solution {
        public static void main (String[]args){
        histogram.printx();
        histogram.randomx();
        histogram.fillinghistogram();
        histogram.sorthistogram();
        histogram.printsortedhistogram();
    }
    }

    //i think we can take histogram as a glob variable and x too bc we working globally just wth them
    class histogram {
        private static double[] x = new double[20];
        private static int[] histogram;

        //1)
        static void printx() {
            for (int i = 0; i < x.length; i++) {
                System.out.print(x[i] + "\t"); //just printing
                System.out.println();
            } }
            //2)
            static void randomx(){
                for (int i = 0; i < x.length; i++) {
                    x[i] = i * i * Math.random();
                }
                for (int i = 0; i < x.length; i++) {
                    System.out.print(x[i] + "\t");
                }
                System.out.println();  //we can also delete second for ie we already have print x fnc
            }
            //3)
            static void fillinghistogram(){
                int step = 3;
                int max = 0;
                int min = 0;
                for (int i = 0; i < x.length; i++) {
                    max = (int) (Math.max(x[i], max));
                    min = (int) (Math.min(x[i], min));
                }
                int[] histogram = new int[max / step + 1];

                for (int i = 0; i < histogram.length; i++) {
                    System.out.print(histogram[i] + "\t"); //again printing we can replace it
                }
                System.out.println();
                for (int i = 0; i < histogram.length; i++) {
                    for (int j = 0; j < x.length; j++) {
                        histogram[(int) (x[j] / step)]++;
                    }
                }
                for (int i = 0; i < histogram.length; i++) {
                    System.out.print(histogram[i] + "\t"); //printing we can add inside the fnc or
                    // take it separately
                }
                System.out.println();
            }

            //5)
            static void sorthistogram() {
                int z;
                for (int i = 1; i < histogram.length; i++) { //looks like sorting
                    for (int j = i; j >= 1; j--) {
                        if (histogram[j] > histogram[j - 1]) {
                            z = histogram[j];
                            histogram[j] = histogram[j - 1];
                            histogram[j - 1] = z;
                        }
                    }
                }
                for (int i = 0; i < histogram.length; i++) {
                    System.out.print(histogram[i]+"\t");
                }
                System.out.println(); // will be not needed if we take print as a separate fnc
            }

            //6)
            static void printsortedhistogram(){
                for (int i = 0; i < histogram.length && histogram[i] > 0; i++) {
                    System.out.print(histogram[i] + "\t");
                }
                System.out.println();
            }
        }



