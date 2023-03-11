public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;


    public Griffindor(String nameOfFaculty, String studentName, int magicPower,
                      int transgressDistance, int nobility, int honor, int bravery) {
        super(nameOfFaculty, studentName, magicPower, transgressDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int ability(){
        return nobility + honor + bravery;
    }

    @Override
    public String toString() {
        return "Факультет - " + getNameOfFaculty() + ", студент - " + getStudentName() + ", сила магии - " + getMagicPower() +
                ", дальность трансгрессирования - " + getTransgressDistance() + ", благородство - " + nobility +
                ", честь - " + honor + ", храбрость - " + bravery;
    }


}
