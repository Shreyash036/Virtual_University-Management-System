import java.util.Scanner;

// Interface for Person
interface Person 
{
	void introduce(); // method to introduce the person
}

// Abstract class for Personnel
abstract class Personnel implements Person 
{
	private String name;
	private int age;

	public Personnel(String name, int age) 
	{
        	this.name = name;
        	this.age = age;
    	}

	public String getName() 
	{
        	return name;
    	}

	public int getAge() 
	{
        	return age;
    	}

	// Abstract method to be implemented by subclasses
    	abstract void work();
}

// Class for Professor that extends Personnel
class Professor extends Personnel 
{
	private String specialization;

	public Professor(String name, int age, String specialization) 
	{
        	super(name, age);
        	this.specialization = specialization;
    	}

	@Override
	void work() 
	{
        	System.out.println(getName() + " is teaching " + specialization);
    	}	

	@Override
 	public void introduce() 
	{
        	System.out.println("I am Professor " + getName() + " specializing in " + specialization);
    	}
}

// Class for Student that implements Person
class Student implements Person 
{
	private String name;
	private int age;
	private int id;

        public Student(String name, int age, int id)  
	{
        	this.name = name;
        	this.age = age;
        	this.id = id;
    	}

	@Override
        public void introduce() 
	{
        	System.out.println("I am Student " + name + ", age " + age + ", ID " + id);
    	}
}

// Class for Course
class Course 
{
	private String name;
	private String code;
	private Professor professor;

        public Course(String name, String code, Professor professor) 
	{
        	this.name = name;
        	this.code = code;
        	this.professor = professor;
    	}

        public void displayInfo() 
	{
        	System.out.println("Course: " + name);
        	System.out.println("Code: " + code);
        	System.out.println("Professor: " + professor.getName());
    	}
}

// Class for Classroom
class Classroom 
{
	private String location;
	private int capacity;

	public Classroom(String location, int capacity) 
	{
        	this.location = location;
        	this.capacity = capacity;
    	}

        public void displayInfo() 
	{
        	System.out.println("Location: " + location);
        	System.out.println("Capacity: " + capacity);
    	}
}

// Main class
public class VirtualUniversity 
{
	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);
        
        	// Input for Professor
        	System.out.println("Enter Professor's name:");
        	String profName = scanner.nextLine();
        	System.out.println("Enter Professor's age:");
        	int profAge = scanner.nextInt();
        	scanner.nextLine(); // Consume newline
        	System.out.println("Enter Professor's specialization:");
        	String profSpecialization = scanner.nextLine();
        	
        	// Create professor object
        	Professor prof = new Professor(profName, profAge, profSpecialization);
        	prof.introduce();
        	prof.work();
        
        	System.out.println();
        
        	// Input for Student
        	System.out.println("Enter Student's name:");
        	String studentName = scanner.nextLine();
        	System.out.println("Enter Student's age:");
        	int studentAge = scanner.nextInt();
       		scanner.nextLine(); // Consume newline
        	System.out.println("Enter Student's ID:");
        	int studentID = scanner.nextInt();
        
        	// Create student object
        	Student student = new Student(studentName, studentAge, studentID);
        	student.introduce();
		
        	System.out.println();
        	
        	// Input for Course
        	System.out.println("Enter Course name:");
        	String courseName = scanner.next();
        	System.out.println("Enter Course code:");
        	String courseCode = scanner.next();
        	
        	// Create course object
        	Course course = new Course(courseName, courseCode, prof);
        	course.displayInfo();
	
	        System.out.println();
	        
	        // Input for Classroom
	        System.out.println("Enter Classroom location:");
	        String classroomLocation = scanner.next();
	        System.out.println("Enter Classroom capacity:");
	        int classroomCapacity = scanner.nextInt();
      
	        // Create classroom object
        	Classroom classroom = new Classroom(classroomLocation, classroomCapacity);
        	classroom.displayInfo();
     
    }
}
