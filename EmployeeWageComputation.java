import java.util.Random;
public class EmployeeWageComputation {
    // Class Constants
    public static final int IS_ABSENT = 0;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 8;
    public static final int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;
    // Class Variables
    private static int totalMonthlyWage;
    private static int totalWorkingHours;
    private static int totalWorkingDays;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        computeEmployeeWage();
    }
    // Class Method to compute employee wage
    public static void computeEmployeeWage() {
        Random random = new Random();
        totalMonthlyWage = 0;
        totalWorkingHours = 0;
        totalWorkingDays = 0;
        while (totalWorkingDays < MAX_WORKING_DAYS && totalWorkingHours < MAX_WORKING_HOURS) {
            totalWorkingDays++;
            int empType = random.nextInt(3);
            int dailyWage = 0;
            int workingHours = 0;
            switch (empType) {
                case IS_FULL_TIME:
                    workingHours = FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:
                    workingHours = PART_TIME_HOUR;
                    break;
                case IS_ABSENT:
                    workingHours = 0;
                    break;
            }
            totalWorkingHours += workingHours;
            if (totalWorkingHours > MAX_WORKING_HOURS) {
                workingHours = workingHours - (totalWorkingHours - MAX_WORKING_HOURS);
                totalWorkingHours = MAX_WORKING_HOURS;
            }
            dailyWage = WAGE_PER_HOUR * workingHours;
            totalMonthlyWage += dailyWage;
            System.out.println("Day " + totalWorkingDays + ": Working Hours = " + workingHours + ", Daily Wage = " + dailyWage);
        }
        System.out.println("\nTotal Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Monthly Wage: " + totalMonthlyWage);
    }
}