public class EsercizioCicloFor2 {
    public static void main(String[] args) {

        int num = 13;
        int maxResult = 3;
        contaUltimiTreDiNum(num,maxResult);

    }
    public static void contaUltimiTreDiNum (int num, int maxResult){
        for (int i=num;i>num-maxResult;i--){
            System.out.println(i);
        }
    }
}
