package kz.yerkebulan;

public class Course {
    private String courseName;
    private String instructor;
    private Student[] students;

    public Course(String courseName, String instructor, int size) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new Student[size];
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student student, int index) {
        students[index] = student;
    }

    public double courseAverageGPA() {
        double average = 0.0;

        for (Student student : students) {
            average += student.getGpa();
        }

        return average / students.length;
    }

    public Student highestCreditStudent() {
        int maxCredits = 0;
        Student maxCreditsStudent = students[0];

        for (Student student : students) {
            if (student.getCredits() > maxCredits) {
                maxCredits = student.getCredits();
                maxCreditsStudent = student;
            }
        }

        return maxCreditsStudent;
    }

    @Override
    public String toString() {
        String studentsSummary = students[0].toString();
        for (int i = 1; i < students.length; i++) {
            studentsSummary += ",";
            studentsSummary += students[i];
        }
        return "Course{" +
                "courseName='" + courseName + "'" +
                ", instructor='" + instructor + "'" +
                ", students={" + studentsSummary + "}";
    }
}
