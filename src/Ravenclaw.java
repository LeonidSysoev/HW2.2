public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creative;

    public Ravenclaw(String nameOfFaculty, String studentName, int magicPower,
                     int transgressDistance, int intelligence, int wisdom, int wit, int creative) {
        super(nameOfFaculty, studentName, magicPower, transgressDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
    public int ability(){
        return intelligence + wisdom + wit + creative;
    }

    @Override
    public String toString() {
        return "Факультет - " + getNameOfFaculty() + ", студент - " + getStudentName() + ", сила магии - " + getMagicPower() +
                ", дальность трансгрессирования - " + getTransgressDistance() + ", ум - " + intelligence +
                ", мудрость - " + wisdom + ", остроумие - " + wit + ", творчество - " + creative;
    }
}
