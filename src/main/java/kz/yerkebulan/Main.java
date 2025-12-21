package kz.yerkebulan;

public class Main {
    public static void main(String[] args) {
        Student yerkebulan = new Student("Yerkebulan", 0, "SE");
        yerkebulan.updateGPA(2.67);
        yerkebulan.setCredits(10);
        System.out.println(yerkebulan);

        Student yerbol = new Student("Yerbol", 1, "SE");
        yerbol.updateGPA(3.33);
        yerbol.setCredits(5);
        System.out.println(yerbol);

        Student nikita = new Student("Nikita", 2, "SE");
        nikita.updateGPA(3.0);
        nikita.setCredits(2);
        System.out.println(nikita);

        Student akmaral = new Student("Akmaral", 3, "SE");
        akmaral.updateGPA(3.67);
        akmaral.setCredits(2);
        System.out.println(akmaral);

        Student sabyr = new Student("Sabyr", 4, "SE");
        sabyr.updateGPA(4.0);
        sabyr.setCredits(0);
        System.out.println(sabyr);

        Course course = new Course("Object-Oriented Programming", "Aidana Aidynkyzy", 5);
        course.addStudent(yerkebulan, 0);
        course.addStudent(yerbol, 1);
        course.addStudent(nikita, 2);
        course.addStudent(akmaral, 3);
        course.addStudent(sabyr, 4);
        System.out.println(course);

        System.out.println("Course Average GPA: " + course.courseAverageGPA());
        System.out.println("Highest Credit Student: " + course.highestCreditStudent());

        System.out.println("Top Student: " + getTopStudent(course.getStudents()));
        System.out.println("Honors amount: " + countHonors(course.getStudents()));
        System.out.println("Total Credits: " + totalCredits(course.getStudents()));
    }

    public static Student getTopStudent(Student[] students) {
        Student topStudent = students[0];
        double maxGPA = 0.0;

        for (Student student : students) {
            if (student.getGpa() > maxGPA) {
                maxGPA = student.getGpa();
                topStudent = student;
            }
        }

        return topStudent;
    }

    public static int countHonors(Student[] students) {
        int honorsCount = 0;

        for (Student student : students) {
            honorsCount += student.isHonors() ? 1 : 0;
        }

        return honorsCount;
    }

    public static int totalCredits(Student[] students) {
        int totalCredits = 0;

        for (Student student : students) {
            totalCredits += student.getCredits();
        }

        return totalCredits;
    }
}