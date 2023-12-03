package loop;

public class Break3 {

    public static void main(String[] args) {
        int sum = 0;

        // while문에서 사용하는 방식과 비슷하게 사용할 수 있다.
        for (int i = 1;;i++) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
        }
    }
}
