public class EmpWageComputation {

     public static void main(String[ ] args) {
      // constants
      int IS_PART_TIME = 1 ;
      int IS_FULL_TIME = 2 ;
      int EMP_RATE_PER_HR = 20 ;
      int TOTAL_SALERY = 0;
      int NUM_WORKING_DAYS = 20;
       // Variable
        int empHrs=0;
      // Computation
       for ( int day=1; day<=NUM_WORKING_DAYS; day++ )
         {
        double empcheck = Math.floor(Math.random( ) * 3);
        switch ((int)empcheck)
          {
            case 1:
             {
              empHrs = 8;
                //int Salery=empHrs*EMP_RATE_PER_HR;
                //System.out.println("Salery :"+Salery);
              break;
             }
           case 2:
             {
              empHrs = 4;
              //int Salery=empHrs*EMP_RATE_PER_HR;
              //System.out.println("Salery :"+Salery);
             break;
             }
           default:
            {
             empHrs = 0;
             //int Salery=empHrs*EMP_RATE_PER_HR;
             //System.out.println("Salery :"+Salery);
            break;
            }
          }
          int Salery = empHrs * EMP_RATE_PER_HR;
          TOTAL_SALERY = TOTAL_SALERY + Salery;
          System.out.println("Total Salery :"+TOTAL_SALERY);
        }
    }
}

