package Lab06;

/**
 * Class: Session
 * Description: Represents a study session of the day with duration validation.
 * Author: Voet Ravun
 * Reviewer: Mao Monin
 * Date: 30-Dec-2025
 * Version: 1.0
 */

public class Session {

    private String subjectCode;
    private int startTime; 
    private int endTime;   

    public Session(String subjectCode, int startTime, int endTime, String room) {
        setDuration(startTime, endTime);
        this.subjectCode = subjectCode;
    }

    public String getSubjectCode() { 
      return subjectCode;
    }
    public int getStartTime() { 
      return startTime; 
    }
    public int getEndTime() { 
      return endTime; 
    }

    public void setDuration(int startTime, int endTime) {
        if (startTime >= endTime) {
            throw new IllegalArgumentException("Start time must be less than end time.");
        }
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
//created Session.java and pasted the code from chat
