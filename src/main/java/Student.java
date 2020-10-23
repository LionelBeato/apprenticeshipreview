public class Student {

    private static int totalNumberofStudents = 0;
    private String name;

    private final int CONST = 3;

    public Student(String name) {
        this.name = name;
        totalNumberofStudents++;
    }

    public static int getTotalNumberofStudents() {
        return totalNumberofStudents;
    }

    public String getName() {
        return name;
    }

}
