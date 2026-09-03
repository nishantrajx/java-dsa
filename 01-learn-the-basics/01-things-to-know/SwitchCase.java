/*
 * A2Z DSA — #4 Switch Case
 *
 * Problem:
 * Given an integer day representing the day number of the week,
 * print the corresponding day.
 *
 * Week starts from Monday.
 *
 * 1 -> Monday
 * 2 -> Tuesday
 * 3 -> Wednesday
 * 4 -> Thursday
 * 5 -> Friday
 * 6 -> Saturday
 * 7 -> Sunday
 *
 * Any value outside 1-7 -> Invalid
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

public class SwitchCase {

    public static void whichWeekDay(int day) {

        switch (day) {
            case 1:
                System.out.print("Monday");
                break;

            case 2:
                System.out.print("Tuesday");
                break;

            case 3:
                System.out.print("Wednesday");
                break;

            case 4:
                System.out.print("Thursday");
                break;

            case 5:
                System.out.print("Friday");
                break;

            case 6:
                System.out.print("Saturday");
                break;

            case 7:
                System.out.print("Sunday");
                break;

            default:
                System.out.print("Invalid");
        }
    }

    public static void main(String[] args) {

        whichWeekDay(1);
        System.out.println();

        whichWeekDay(2);
        System.out.println();

        whichWeekDay(3);
        System.out.println();

        whichWeekDay(7);
        System.out.println();

        whichWeekDay(8);
        System.out.println();

        whichWeekDay(0);
    }
}