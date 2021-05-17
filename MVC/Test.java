package MVC;

public class Test {

    public static void main(String[] args) {
        Student student = getStudentFromDB();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();
        System.out.println("Update student's Roll No.");
        controller.setStudentRollNo(1);
        controller.updateView();
    }

    public static Student getStudentFromDB() {
        Student st = new Student();
        st.setName("Mahesh");
        st.setRollNo(16);
        return st;
    }
}
