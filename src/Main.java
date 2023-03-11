import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var r = new Random();

        Griffindor harry = new Griffindor("Гриффиндор", "Гарри Поттер", r.nextInt(101), r.nextInt(101),
                r.nextInt(101), r.nextInt(101), r.nextInt(101));
        Griffindor germiona = new Griffindor("Гриффиндор", "Гермиона Грейнджер", r.nextInt(101), r.nextInt(101),
                r.nextInt(101), r.nextInt(101), r.nextInt(101));
        Griffindor ron = new Griffindor("Гриффиндор", "Рон Уизли", r.nextInt(101), r.nextInt(101),
                r.nextInt(101), r.nextInt(101), r.nextInt(101));
        Hufflepuff zachary = new Hufflepuff("Пуффендуй", "Захария Смит", r.nextInt(101), r.nextInt(101),
                r.nextInt(101), r.nextInt(101), r.nextInt(101));
        Hufflepuff sedrik = new Hufflepuff("Пуффендуй", "Седрик Диггори", r.nextInt(101), r.nextInt(101),
                r.nextInt(101), r.nextInt(101), r.nextInt(101));
        Hufflepuff justin = new Hufflepuff("Пуффендуй", "Джастин Финч-Флетчли", r.nextInt(101), r.nextInt(101),
                r.nextInt(101), r.nextInt(101), r.nextInt(101));
        Ravenclaw joy = new Ravenclaw("Когтевран", "Чжоу Чанг", r.nextInt(101), r.nextInt(101),
                r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101));
        Ravenclaw padma = new Ravenclaw("Когтевран", "Падма Патил", r.nextInt(101), r.nextInt(101),
                r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101));
        Ravenclaw markus = new Ravenclaw("Когтевран", "Маркус Белби", r.nextInt(101), r.nextInt(101),
                r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101));
        Slytherin draco = new Slytherin("Слизерин", "Драко Малфой", r.nextInt(101), r.nextInt(101),
                r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101));
        Slytherin graham = new Slytherin("Слизерин", "Грэхэм Монтегю", r.nextInt(101), r.nextInt(101),
                r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101));
        Slytherin gregory = new Slytherin("Слизерин", "Грегори Гойл", r.nextInt(101), r.nextInt(101),
                r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101));

        System.out.println(harry);
        System.out.println(draco);
        System.out.println(germiona);
        compareStudents(harry, draco);
        compareGriffindorStudents(harry, germiona);
        compareHufflepuffStudents(sedrik, justin);
        compareRavenclawStudents(joy, padma);
        compareSlytherinStudents(graham,gregory);
    }

    public static void compareStudents(Hogwarts student_1, Hogwarts student_2) {
        if (student_1.getMagicPower() > student_2.getMagicPower()) {
            System.out.println(student_1.getStudentName() + " обладает бОльшей мощностью магии, чем " + student_2.getStudentName());
        } else {
            System.out.println(student_2.getStudentName() + " обладает бОльшей мощностью магии, чем " + student_1.getStudentName());
        }
        if (student_1.getTransgressDistance() > student_2.getTransgressDistance()) {
            System.out.println(student_1.getStudentName() + " может трансгрессировать на расстояние большее, чем " + student_2.getStudentName());
        } else {
            System.out.println(student_2.getStudentName() + " может трансгрессировать на расстояние большее, чем " + student_1.getStudentName());
        }

    }

    public static void compareGriffindorStudents(Griffindor student_1, Griffindor student_2) {
        int studentScore_1 = student_1.ability();
        int studentScore_2 = student_2.ability();
        if (studentScore_1 > studentScore_2) {
            System.out.println(student_1.getStudentName() + " лучший Грифиндорец, чем " + student_2.getStudentName());
        } else {
            System.out.println(student_2.getStudentName() + " лучший Грифиндорец, чем " + student_1.getStudentName());
        }
    }

    public static void compareHufflepuffStudents(Hufflepuff student_1, Hufflepuff student_2) {
        int studentScore_1 = student_1.ability();
        int studentScore_2 = student_2.ability();
        if (studentScore_1 > studentScore_2) {
            System.out.println(student_1.getStudentName() + " лучший Пуффендуец, чем " + student_2.getStudentName());
        } else {
            System.out.println(student_2.getStudentName() + " лучший Пуффендуец, чем " + student_1.getStudentName());
        }
    }

    public static void compareRavenclawStudents(Ravenclaw student_1, Ravenclaw student_2) {
        int studentScore_1 = student_1.ability();
        int studentScore_2 = student_2.ability();
        if (studentScore_1 > studentScore_2) {
            System.out.println(student_1.getStudentName() + " лучший Когтевранец, чем " + student_2.getStudentName());
        } else {
            System.out.println(student_2.getStudentName() + " лучший Когтевранец, чем " + student_1.getStudentName());
        }
    }

    public static void compareSlytherinStudents(Slytherin student_1, Slytherin student_2) {
        int studentScore_1 = student_1.ability();
        int studentScore_2 = student_2.ability();
        if (studentScore_1 > studentScore_2) {
            System.out.println(student_1.getStudentName() + " лучший Слизеринец, чем " + student_2.getStudentName());
        } else {
            System.out.println(student_2.getStudentName() + " лучший Слизеринец, чем " + student_1.getStudentName());
        }
    }
}

