public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7};
        double sum = 0;
        double result = 0;

        for ( int i = 0; i < list.length; i++){
            sum +=1.0 / list[i];
            result +=sum;

        }

        double avarage = result / list.length;

        System.out.println("Dizideki sayilarin harmonik ortlamaasi : " + avarage);

    }
}
