public class EsercizioCicloFor1 {
    public static void main(String[] args) {

        int num = 6;
        System.out.println("Tabellina del " + num);
        calcolaTabellina(num);


    }
    public static int calcolaTabellina (int num) {
        int tabellina = 0;
        for (int i = 0; i < 11; i++) {

             tabellina = num * i;

            System.out.println(num + "x" + i + "=" + tabellina);
        }
        return tabellina;

    }
}
