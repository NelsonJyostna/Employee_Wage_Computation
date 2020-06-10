public class EmpWageComputation {

     public static void main(String[ ] args) {
      // constants
      int IS_PART_TIME = 1 ;
      int IS_FULL_TIME = 2 ;
      int EMP_RATE_PER_HR = 20 ;

      // Computation
       double empcheck = Math.floor(Math.random( ) * 3);
        switch ((int)empcheck)
          {
            case 1:
             {
              int empHrs = 8;
                int Salery=empHrs*EMP_RATE_PER_HR;
                System.out.println("Salery :"+Salery);
              break;
             }
           case 2:
             {
              int empHrs = 4;
              int Salery=empHrs*EMP_RATE_PER_HR;
              System.out.println("Salery :"+Salery);
             break;
             }
           default:
            {
             int empHrs = 0;
             int Salery=empHrs*EMP_RATE_PER_HR;
             System.out.println("Salery :"+Salery);
            break;
            }
          }
        //int Salery = empHrs * EMP_RATE_PER_HR;
        //System.out.println("Salery :"+Salery);
    }
}


