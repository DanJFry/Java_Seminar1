class Answerr {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        for (int j = 2; j <= 1000; j++) {
            boolean simple = false;

            for (int i = 2; i * i <= j; i++) {
                simple = (j % i == 0);
                if (simple) {
                    break;
                }
            }
            if (!simple) {
                System.out.println(j);
            }
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task2{
    public static void main(String[] args) {

        Answerr ans = new Answerr();
        ans.printPrimeNums();
    }
}