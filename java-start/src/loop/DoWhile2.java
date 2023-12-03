package loop;

public class DoWhile2 {

    public static void main(String[] args) {
        int i = 10;

        //do를 실행하고, while 조건문을 실행 후 true이면 다시 do 실행
        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i < 3);
    }
}
