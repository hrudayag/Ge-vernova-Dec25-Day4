import java.util.*;
class EmpWage {
    static int WAGE_PER_HOUR = 20;
    static int FULL_DAY_HOURS = 8;

    static int PART_TIME_HOURS = 8;

    static int MAX_WORKING_DAYS = 20;

    static int MAX_WORKING_HOURS = 100;

    // UC 1: Check employee attendance using random
    static int checkAttendance() {
        return (int)(Math.random() * 3);
    }

    // UC 7: Class method to compute employee wage
    static void computeEmployeeWage() {
        int totalHours = 0;
        int totalDays = 0;
        int monthlyWage = 0;

        // UC 5 & UC 6: Calculate wages for month till 20 days or 100 hours
        while(totalDays < MAX_WORKING_DAYS && totalHours < MAX_WORKING_HOURS) {
            // UC 1: Get attendance
            int attendance = checkAttendance();
            int hoursWorked = 0;

            // UC 4: Using switch case to check attendance
            switch(attendance) {
                case 0:
                    hoursWorked = 0;
                    break;
                case 1:
                    // UC 2: Full day hours
                    hoursWorked = FULL_DAY_HOURS;
                    break;
                case 2:
                    // UC 3: Part time hours
                    hoursWorked = PART_TIME_HOURS;
                    break;
            }

            // UC 6: Check if total hours exceeds 100
            if(totalHours + hoursWorked > MAX_WORKING_HOURS) {
                hoursWorked = MAX_WORKING_HOURS - totalHours;
            }

            totalHours += hoursWorked;

            // UC 2: Calculate daily wage
            int dailyWage = hoursWorked * WAGE_PER_HOUR;
            monthlyWage += dailyWage;
            totalDays++;
        }

        System.out.println("Total Working Days: " + totalDays);
        System.out.println("Total Working Hours: " + totalHours);
        System.out.println("Total Monthly Wage: Rs." + monthlyWage);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        // UC 7: Calling class method
        computeEmployeeWage();
    }
}