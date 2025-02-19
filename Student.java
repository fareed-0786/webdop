public class Student {
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student(1, "John Doe");
        
        // Display student details
        student.displayDetails();
        
        // Update student details
        student.setId(2);
        student.setName("Jane Doe");
        
        // Display updated student details
        student.displayDetails();
    }
}
