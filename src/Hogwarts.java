import java.util.Objects;

public class Hogwarts {
    private String nameOfFaculty;
    private String studentName;
    private int magicPower;
    private int transgressDistance;
    public Hogwarts(String nameOfFaculty, String studentName, int magicPower, int transgressDistance) {
        this.nameOfFaculty = nameOfFaculty;
        this.studentName = studentName;
        this.magicPower = magicPower;
        this.transgressDistance = transgressDistance;
    }

    public String getNameOfFaculty() {
        return nameOfFaculty;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressDistance() {
        return transgressDistance;
    }

    public void setNameOfFaculty(String nameOfFaculty) {
        this.nameOfFaculty = nameOfFaculty;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressDistance(int transgressDistance) {
        this.transgressDistance = transgressDistance;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hogwarts)) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return magicPower == hogwarts.magicPower && transgressDistance == hogwarts.transgressDistance && Objects.equals(nameOfFaculty, hogwarts.nameOfFaculty) && Objects.equals(studentName, hogwarts.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfFaculty, studentName, magicPower, transgressDistance);
    }



}
