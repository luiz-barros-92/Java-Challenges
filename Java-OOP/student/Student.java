public class Student {
    private String name;
    private double m1, m2, m3;

    public Student(String name, double m1, double m2, double m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public double finalGrade() {
        return this.m1 + this.m2 + this.m3;       
    }

    public void output() {
        double finalNote = finalGrade();
        double difference = 60 - finalNote;
        
        if (finalNote >= 60) {
            System.out.println("FINAL GRADE = " + finalNote + "\nPASS");
        }else {
            System.out.println("FINAL GRADE = " + finalNote + "\nFAILED\nMISSING " + difference + " POINTS");
        }
    }  
}