
package teacherwebsite;
import java.util.ArrayList;

public class Teacher {
    private String name;
    private String email;
    private String pass;
    private ArrayList <Course> coursesList;
    
     //block to initialize the ArrayList "coursesList", this step is neseccery to avoid nullException error//
    {
        coursesList = new ArrayList();
    }
    
    //parametrize const//
    public Teacher(String name, String email, String pass) {
        this.name = name;
        this.email = email;
        this.pass = pass;
    }
//----------------------------------------------------//
    
    //setters & getters//
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
//----------------------------------------------------//  
    
    
      //add & delete course//
    public boolean addCourse(Course c)
    {
        return coursesList.add(c);
        
        /* note: the returntype of the method addCourse is boolean because the built-in function add()
          in the ArrayList class return boolean value */   
    }
    
    public boolean deleteCourse(String name)
    {//forEach loop: to use it u must create an iterator(c) from the same type of the ArrayList(Course).
        for(Course c : coursesList )
        {
            if(c.getCourseName().equals(name))
            {
              coursesList.remove(c);
              return true;
            }     
        }
        return false;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name=" + name + ", email=" + email + ", pass=" + pass + ", coursesList=" + coursesList + '}';
    }
}