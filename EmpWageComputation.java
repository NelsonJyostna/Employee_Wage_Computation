public class EmpWageComputation {

     public static void main(String[ ] args) {
     // constants
      int IS_PRESENT = 1 ;
      // Computation
     double empcheck = Math.floor(Math.random() * 10 % 2);
      if (empcheck == IS_PRESENT)
      {
           int empRatePerHr=20;
           int empHrs=8;
           int Salery = empHrs*empRatePerHr;
          System.out.println("Salery : "+Salery);
      }
      else
          {
          System.out.println("Salery : 0");
          }
     }
}



