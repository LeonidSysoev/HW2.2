public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String nameOfFaculty, String studentName, int magicPower,
                      int transgressDistance, int diligence, int loyalty, int honesty) {
        super(nameOfFaculty, studentName, magicPower, transgressDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public int ability(){
        return diligence + loyalty + honesty;
    }

    @Override
    public String toString() {
        return "Факультет - " + getNameOfFaculty() + ", студент - " + getStudentName() + ", сила магии - " + getMagicPower() +
                ", дальность трансгрессирования - " + getTransgressDistance() + ", трудолюбие - " + diligence +
                ", верность - " + loyalty + ", честность - " + honesty;
    }
}
