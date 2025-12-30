package Lab06;

/**
 * Class: Subject
 * Description: Represents a course in Year 2 program with validation and clear standards.
 * Author: Mao Monin
 * Reviewer: Voet Ravun
 * Date: 30-Dec-2025
 * Version: 1.0
 */

public class Subject {

    private static final int MAX_CREDITS = 6;
    private static final int MIN_CREDITS = 1;
    private String name;
    private String code;
    private int credits;
    private String department;
    private int semester;

    public Subject(String name, String code, int credits, String department, int semester) {
        validateName(name);
        validateCredits(credits);
        this.name = name;
        this.code = code;
        this.credits = credits;
        this.department = department;
        this.semester = semester;
    }

    public String getName() { 
      return name; 
    }
    public String getCode() { 
      return code; 
    }
    public int getCredits() { 
      return credits;
    }
    public String getDepartment() { 
      return department;
    }
    public int getSemester() { 
      return semester;
    }
    public void setName(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Subject name cannot be null or empty.");
        }
    }

    private void validateCredits(int credits) {
        if (credits < MIN_CREDITS || credits > MAX_CREDITS) {
            throw new IllegalArgumentException(
                "Credits must be between " + MIN_CREDITS + " and " + MAX_CREDITS + "."
            );
        }
    }
}

//I deleted and pasted the code from chat