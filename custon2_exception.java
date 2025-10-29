class InvalidMarksException extends RuntimeException {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class custon2_exception {
    static void checkMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks should be between 0 and 100");
        } else {
            System.out.println("Valid marks: " + marks);
        }
    }

    public static void main(String[] args) {
        try {
            checkMarks(150); // invalid marks
        } catch (InvalidMarksException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Done.");
    }
}
