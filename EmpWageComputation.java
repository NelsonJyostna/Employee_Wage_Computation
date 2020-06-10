public class EmpWageComputation {

     public static void main(String[ ] args) {
      // constants
      int IS_PART_TIME = 1 ;
      int IS_FULL_TIME = 2 ;
      int EMP_RATE_PER_HR = 20 ;

      // Computation
       double empcheck = Math.floor(Math.random( ) * 3);
      if (IS_PART_TIME == empcheck)
         {
            int empHrs = 8;
            int Salery=empHrs*EMP_RATE_PER_HR;
            System.out.println("Salery :"+Salery);
         }
      else if (IS_FULL_TIME == empcheck)
         {
          int empHrs = 4;
          int Salery=empHrs*EMP_RATE_PER_HR;
          System.out.println("Salery :"+Salery);

         }
      else
         {
            int empHrs = 0;
            int Salery=empHrs*EMP_RATE_PER_HR;
            System.out.println("Salery :"+Salery);
         }
       //int Salery=empHrs*EMP_RATE_PER_HR;
       //System.out.println("Salery :"+Salery);
    }
}
