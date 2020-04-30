package Day_1;

public class FibonachiSumm {
    public static void main(String[] args) {
        int result = 0;
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        while (f3 < 4000000){
            f3 = f1 + f2;
            f2 = f3;
            f1 = f2;
            if(f3%2 == 0){
                result =+ f3;
            }
        }
        System.out.println(result);
    }
}
