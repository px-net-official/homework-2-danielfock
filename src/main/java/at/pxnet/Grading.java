package at.pxnet;

public final class Grading {
    private Grading() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated.");
    }

    public static boolean isFailing(Person person) {
        int[] grades = person.getGrades();

        if (grades.length < 2) {
            throw new IllegalStateException("A person must have at least two grades.");
        }

        int countFours = 0;
        for (int grade : grades) {
            if (grade == 5) {
                return true;
            }
            if (grade == 4) {
                countFours++;
            }
        }
        return countFours >= 3;
    }
}
