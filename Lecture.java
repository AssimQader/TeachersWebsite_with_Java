
package teacherwebsite;

public class Lecture {
    
    private String lecName;
    private String description;
//----------------------------------------------------//
    
    //setters and getters//
    public String getLecName() {
        return lecName;
    }

    public void setLecName(String lecName) {
        this.lecName = lecName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Lecture{" + "lecName=" + lecName + ", description=" + description + '}';
    }
}
