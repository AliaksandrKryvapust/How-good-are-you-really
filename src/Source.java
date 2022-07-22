import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
    int [] arr = new int[] {100, 40, 34, 57, 29, 72, 57, 88};
    int value = 75;
        System.out.println(betterThanAverage(arr,value));
    }
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
       return (Arrays.stream(classPoints).sum()/classPoints.length)<yourPoints; // or Arrays.stream(classPoints).average()
    }
}
