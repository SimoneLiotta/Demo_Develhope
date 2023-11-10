package Java1.BasiJava;

public class EsercizioCicliAvanzati2 {
    public static void main(String[] args) {
        int num = 8;
        stampaNum(num);
    }
    public static void stampaNum (int num){
        for (int i = 0;i<=num;i++){

            if (i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
