public class EmpWageComputation {

     public static void main(String[ ] args) {
     // constants
      int IS_PRESENT = 1 ;
      // Computation
     double empcheck = Math.floor(Math.random() * 10 % 2);
     if (empcheck == IS_PRESENT)
        System.out.println("Employee is Present");
     else
      System.out.println("Employee is Abscent");
     }
}
