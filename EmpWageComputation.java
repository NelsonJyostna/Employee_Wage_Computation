public class EmpWageComputation {

     public static void main(String[ ] args) {

      System.out.println("Welcome to Employee Wage Computation Program");

        // constants
        int IS_PART_TIME = 1 ;
        int IS_FULL_TIME = 2 ;
        int EMP_RATE_PER_HR = 20 ;
        int NUM_WORKING_DAYS = 20;
        int MAX_HRS_IN_MONTH=100;

        // Variable
        int empHrs=0;
        int totalEmpHrs=0;
        int totalWorkingDays=0;

        // Computation
         while ( totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS )
          {
             totalWorkingDays++;
             double empcheck = Math.floor(Math.random( ) * 3);
             switch ((int)empcheck)
             {
                 case 1:
                   {
                     empHrs = 8;
                     break;
                   }
                 case 2:
                   {
                     empHrs = 4;
                     break;
                   }
                default:
                  {
                    empHrs = 0;
                    break;
                  }
            }
           totalEmpHrs=totalEmpHrs+empHrs;
         }
      int totalSalery = totalEmpHrs * EMP_RATE_PER_HR;
      System.out.println("Total Salery :"+totalSalery);
    }
}

