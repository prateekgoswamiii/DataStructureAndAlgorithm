import java.util.*;
  
  public class Grading_System{
      public static void gradingSystem(int marks){
          if(marks>90) System.out.println("excellent");
          else if(marks>80) System.out.println("good");
          else if(marks>70) System.out.println("fair");
          else if(marks>60) System.out.println("meets expectations");
          else System.out.println("below par");
      }
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
        gradingSystem(scn.nextInt());
      }
  
<<<<<<< HEAD
  }
=======
  }
>>>>>>> 6e99b6ab93356dc3970f67c9c53829672f899fbf
