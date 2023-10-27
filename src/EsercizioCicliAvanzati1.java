public class EsercizioCicliAvanzati1 {
    public static void main(String[] args) {
        int num = 6;
        stampaNum(num);
    }

    public static void stampaNum (int num){
        for (int i = 0;i<=num;i++){
            System.out.println(i);
            if (i==5) break;
        }
    }
}
