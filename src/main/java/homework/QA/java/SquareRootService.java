package homework.QA.java;

public class SquareRootService {

    public  int main(int number) {
        for (int i = 10; i <=99; i++) {
            if (i * i >= number) {
                return i;
            }
        }
        return 0;
    }
}
