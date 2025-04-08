// Student class
class Student {
    private int academicScore;

    public void setAcademicScore(int score) {
        academicScore = score;
    }

    public int getAcademicScore() {
        return academicScore;
    }
}

// Sports class
class Sports {
    private int sportsScore;

    public void setSportsScore(int score) {
        sportsScore = score;
    }

    public int getSportsScore() {
        return sportsScore;
    }
}

// Result class inheriting from Student and Sports
class Result extends Student {
    private Sports sports = new Sports();  // Aggregation of Sports class

    public void setSportsScore(int score) {
        sports.setSportsScore(score);
    }

    public int getSportsScore() {
        return sports.getSportsScore();
    }

    public void displayScores() {
        System.out.println("Academic Score: " + getAcademicScore());
        System.out.println("Sports Score: " + getSportsScore());
    }
}

// Main class to run the program
public class Stud {
    public static void main(String[] args) {
        Result studentResult = new Result();
        studentResult.setAcademicScore(91);
        studentResult.setSportsScore(86);
        studentResult.displayScores();
    }
}
