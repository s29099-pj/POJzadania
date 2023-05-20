//zadanie 4
public class TestScores {
    private int[] scores;

    public TestScores(int[] scores) {
        this.scores = scores;
    }

    public double avergeScore() throws IllegalArgumentException {
        System.out.println("test");
        if (scores == null || scores.length == 0) {
            throw new IllegalArgumentException("Brak wyników testów.");
        }

        int sum = 0;
        for (int score : scores) {
            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Nieprawidłowy wynik testu: " + score);
            }
            sum += score;
        }

        return (double) sum / scores.length;
    }
}
