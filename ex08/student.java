
package ex08;

/**
 *
 * @author crist
 */
public class student {
    
    String name;
    int registerAcademic;
    String course;
    String[] discipline;
    double [][] gradeDiscipline = new double [3][4];
  
    double totalGrade;
    
    void showInformation(){
        System.out.println("Name: " + name);
        System.out.println("R.A: " + registerAcademic);
        System.out.println("Course Name: " + course);
        
        for(int i=0; i<gradeDiscipline.length; i++){
            System.out.println("Grade of discipline " + discipline[i]); 
            for(int j=0; j<gradeDiscipline[i].length; j++){
                System.out.println(gradeDiscipline[i][j] +" ");
                System.out.println();
            }
        }
    }
    boolean aproved(int indice){
        double sum=0;
        for(int i=0; i<gradeDiscipline[indice].length; i++){
            sum += gradeDiscipline[indice][i];                   
            
        }
        double medium = sum / 4;
        
        if(medium >= 7){
            return true;
        }else{
            return false;
        }
    }
    
    
    
    
}
