package ex08;

import java.util.Scanner;


/**
 *
 * @author crist
 */
public class tesStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
         student S1 = new student();
         
        System.out.println("What is the student name?");         
        S1.name = scan.next();
        
        System.out.println("What is the Register Academic?");
        S1.registerAcademic = scan.nextInt();
        
        System.out.println("What is your Course?");
        S1.course = scan.next();
        
        S1.discipline = new String[3];
        for(int i=0; i<S1.discipline.length; i++){
         System.out.println("type your first discipline:" + i);
            S1.discipline[i] = scan.next();
            
        }
        for(int i=0; i<S1.gradeDiscipline.length; i++){
            System.out.println("Receiving grade of disciplene" + S1.discipline[i]);
            for(int j=0; j<S1.gradeDiscipline[i].length; j++){
                System.out.println("Enter with the grade " + (j+1));
                S1.gradeDiscipline[i][j] = scan.nextDouble();
                
            }
                
            
        }
        
          S1.showInformation();
          
          for(int i=0; i<S1.discipline.length; i++){
              if(S1.aproved(i)){
                  System.out.println("Discippline " + S1.discipline[1] + " - aproved");
              }else{
                  System.out.println("Discippline " + S1.discipline[1] + " - reproved");
              }
          }
        
        
        
    }
    
}
