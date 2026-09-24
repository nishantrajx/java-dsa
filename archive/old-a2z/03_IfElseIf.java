/*
 * A2Z DSA — #3 If ElseIf
 *
 * Problem:
 * Given the marks of a student, print the corresponding grade.
 *
 * Rules:
 * marks >= 90 -> Grade A
 * marks >= 70 -> Grade B
 * marks >= 50 -> Grade C
 * marks >= 35 -> Grade D
 * otherwise   -> Fail
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class IfElseIf {

    public static void studentGrade(int marks) {

        if (marks >= 90) {
            System.out.print("Grade A");
        } else if (marks >= 70) {
            System.out.print("Grade B");
        } else if (marks >= 50) {
            System.out.print("Grade C");
        } else if (marks >= 35) {
            System.out.print("Grade D");
        } else {
            System.out.print("Fail");
        }
    }

    public static void main(String[] args) {

        studentGrade(95);
        System.out.println();

        studentGrade(70);
        System.out.println();

        studentGrade(50);
        System.out.println();

        studentGrade(35);
        System.out.println();

        studentGrade(14);
    }
}