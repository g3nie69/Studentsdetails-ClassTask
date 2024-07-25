class Studentsdetails {
    // Fields for the class
    private String name;
    private int age;
    private String address;

    // Constructor with three parameters
    public Studentsdetails(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display the person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Method that accepts a person object and calls the displayDetails method
    public void myDetails(Studentsdetails student) {
        student.displayDetails();
    }

    // Method to print the current instance
    public void printCurrentInstance() {
        this.displayDetails();
    }

    // Main method to create an object and call the method
    public static void main(String[] args) {
        // Create an object with your details
        Studentsdetails me = new Studentsdetails("Kaguri", 23, "Lucky_Summer_626");
        
        // Use the object to call the printCurrentInstance method
        me.printCurrentInstance();
    }
}
