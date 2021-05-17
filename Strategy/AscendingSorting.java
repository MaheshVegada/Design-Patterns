package Strategy;

public class AscendingSorting implements SortingStrategy {

    @Override
    public void sort(int[] numbers) {
        int numberCount = numbers.length;
        int temp = 0;
        for (int i = 0; i < numberCount - 1; i++) {
            for (int j = i + 1; j < numberCount; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
    }
}