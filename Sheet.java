
package teacherwebsite;

public class Sheet {
    private String sheetName;
    private String description;
    private int sheetNum;
//----------------------------------------------------//
    
    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSheetNum() {
        return sheetNum;
    }

    public void setSheetNum(int SheetNum) {
        this.sheetNum = sheetNum;
    }

    @Override
    public String toString() {
        return "Sheet{" + "sheetName=" + sheetName + ", description=" + description + ", sheetNum=" + sheetNum + '}';
    }
 
}
