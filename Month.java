/*   Created by IntelliJ IDEA.
 *   Author: Harshit K Agnihotri
 *   Date: 27/10/2020
 *   Time: 11:38 PM
 *   File: Month.java
 */
public enum Months {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);
    private final int numberOFDaysInMonth;

    public int getNumberOFDaysInMonth() {
        return numberOFDaysInMonth;
    }

    Months(int numberOFDaysInMonth) {
        this.numberOFDaysInMonth = numberOFDaysInMonth;
    }
}
