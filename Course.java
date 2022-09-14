
package teacherwebsite;
import java.util.ArrayList;

public class Course {
  private String courseName;
  private String description;
  private ArrayList <Lecture> lecturesList;
  private ArrayList <Sheet> sheetsList;
  
  {
      lecturesList = new ArrayList();
      sheetsList = new ArrayList();
  }
 //----------------------------------------------------//
  
  //setters and getters//
  public String getCourseName(){
      return courseName;
  }
  
  public void setCourseName(String courseName){
      this.courseName = courseName;
  }
  
  public String getDescription(){
      return description;
  }
  
  public void setDescription(String description){
      this.description = description;
  }
//----------------------------------------------------//
  
  
  //add & delete lectures//
  public boolean addLec(Lecture lec){
      return lecturesList.add(lec);
  }
  
  
  //without Single Responsibility concept :(
  public boolean deleteLec(String name){
        for(int i = 0; i< lecturesList.size(); ++i){
            if(lecturesList.get(i).getLecName().equals(name))
            {
                lecturesList.remove(i);
                return true;
            }     
        }
        return false;
  }
 //----------------------------------------------------//
  
  
  //add & delete sheets//
    public boolean addsheet(Sheet sh){
      return sheetsList.add(sh);
  }
  
    
     //with Single Responsibility concept :)
    private int search(String name){
        for(Sheet sh : sheetsList)
        {
            if(sh.getSheetName().equals(name))
                return sheetsList.indexOf(sh); //return the index of the desiered sheet u want to delete.   
        }
        return -1;
  }
  
    public String deletesheet(String name){
      int result = search(name);
      if(result != -1){
          sheetsList.remove(result);
          return "Sheet is deleted\n";
      }else
          return "There is no such a sheet in the system\n";
  }
//----------------------------------------------------//

    @Override
    public String toString() {
        return "Course{" + "courseName=" + courseName + ", description=" + description + ", lecturesList=" + lecturesList + ", sheetsList=" + sheetsList + '}';
    } 
}
