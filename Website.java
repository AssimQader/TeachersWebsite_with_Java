package teacherwebsite;
import java.util.ArrayList;

public class Website {
    private  ArrayList <Teacher> teachersList;  //declare a list of teachers variable//
    
    //block to initialize(define) the ArrayList "teachersList", this step is neseccery to avoid nullException error//
    {
        teachersList = new ArrayList();
    }
//----------------------------------------------------//
    
    
    //Sign-up Operation//
    
    //method to prevent duplicated accounts, and it is private because the user needen't to know anything about it.
    private boolean checkMail(String mail){
        for(Teacher t : teachersList){
            if(t.getEmail().equals(mail)){
                return true;
            }
        }
        return false;
    }
    
    public boolean signUp(String name, String email, String pass)
    {
        //boolean result = checkMail(email); //instead of this line, u can pass the method to if directly, as it returns true or false.
        if(checkMail(email)){
            System.out.println("This Teacher is already on the system..\n");
            return false;
        }
        else{
            Teacher t = new Teacher(name, email, pass); //create a Teacher//
            return teachersList.add(t); //add this Teacher to the ArrayList "teachersList"// 
        }
    }
//----------------------------------------------------//   
    
    
    //Login Operation//
    
    /*make the search operation at login() method in another function called search(), due to achieve
       "Single Responsibility" principle -SOLID- .. and make the method private because
    I am the only one as a developer who needs it, the user will never use i t so he does't need to see it.*/
    private boolean search(String name, String pass){
        for(Teacher t : teachersList ){
            if(t.getName().equals(name) && t.getPass().equals(pass)){
                return true;
            } 
        }  
        return false;
    }

    public String login(String name, String pass)
    {
        boolean result = search(name, pass);
        if(result == true)
            return "Hi (" + name + "), welcome to the system..\n";
        else
            return "This user is not registered on the system..\n";
    }
//----------------------------------------------------//  
    
    @Override
    public String toString() {
        return "Website {" + "teachersList=" + teachersList + '}';
    }
}
