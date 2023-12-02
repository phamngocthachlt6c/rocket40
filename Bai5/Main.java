import src.frontend.Excercise2;
import src.frontend.Question;
import src.frontend.Question1;
import src.frontend.Question2;

public class Main {
    public static void main(String[] args) {
       new Question1().doQuestion1();
    }

    public static int getMaxValue(int[] numbers) {
        int maxValue = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[] numbers) {
        int minValue = numbers[0];
        for (int i = 1;i < numbers.length - 1; i++) {
            if(numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }

    public static void doSomething() {
        System.out.print("Do 1");
        System.out.print("Do 2");
        System.out.print("Do 3");
        System.out.print("Do 4");
    }
}
