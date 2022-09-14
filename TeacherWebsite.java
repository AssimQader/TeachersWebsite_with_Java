
package teacherwebsite;

public class TeacherWebsite {


    public static void main(String[] args)
    {
        selectMenue();
        System.out.println("\t---Welcom to the system---\n\n- Choose the operation number:");
        byte num = 0;
        num = new Scanner(System.in).nextByte(num);
    }

    private static void selectMenue() {
        System.out.println("\t---Welcom to the system---\n\n- Choose the operation number:");
        System.out.println("  1 to Sign up");
        System.out.println("  2 to Log In");
        System.out.println("  3 to Add Course");
        System.out.println("  4 to Delete Course");
        System.out.println("  5 to Add Lecture");
        System.out.println("  6 to Delete Lecture");
        System.out.println("  7 to Add Sheet");
        System.out.println("  8 to Delete Sheet");
    }
}
