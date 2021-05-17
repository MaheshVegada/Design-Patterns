package Strategy;

/*
 * @author Shyam Makwana
 */

public class Arranger {

    private SortingStrategy sortStrategy;

    public Arranger(SortingStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void arrange(int[] numbers) {
        sortStrategy.sort(numbers);
    }
}
