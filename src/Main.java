import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Hogwarts [] hogwarts = {
                new Griffindor("Гарри Поттер", 50, 25, 33, 28, 35),
                new Griffindor("Гермиона Грейнджер", 52, 28, 34, 36, 37),
                new Griffindor("Рон Уизли", 44, 25, 38, 31, 41),
                new Slizerin("Драко Малфой", 35, 24, 29, 36, 55, 76, 52),
                new Slizerin("Грэхэм Монтегю", 73, 44, 37, 39, 43, 67, 73),
                new Slizerin("Грегори Гойл", 33, 29, 44, 47, 49, 55, 84),
                new Puffendui("Захария Смит", 29, 34, 42, 51, 63),
                new Puffendui("Седрик Диггори", 65, 77, 65, 38, 54),
                new Puffendui("Джастин Финч-Флетчли", 69, 85, 82, 73, 63),
                new Cogtevran("Чжоу Чанг", 47, 56, 48, 62, 59, 39),
                new Cogtevran("Падма Патил", 80, 44, 56, 74, 81, 44),
                new Cogtevran("Маркус Белби", 55, 49, 57, 68, 82, 57)
        };


        Griffindor potter = new Griffindor("Гарри Поттер", 50, 25, 33, 28, 35);
        System.out.println(potter.toString());

        Griffindor greindhzer = new Griffindor("Гермиона Грейнджер", 52, 28, 34, 36, 37);
        System.out.println(greindhzer.toString());

        Griffindor uithly = new Griffindor("Рон Уизли", 44, 25, 38, 31, 41);
        System.out.println(uithly.toString());

        Slizerin malfoy = new Slizerin("Драко Малфой", 35, 24, 29, 36, 55, 76, 52);
        System.out.println(malfoy.toString());

        Slizerin momtegu = new Slizerin("Грэхэм Монтегю", 73, 44, 37, 39, 43, 67, 73);
        System.out.println(momtegu.toString());

        Slizerin goil = new Slizerin("Грегори Гойл", 33, 29, 44, 47, 49, 55, 84);
        System.out.println(goil.toString());

        Puffendui smit = new Puffendui("Захария Смит", 29, 34, 42, 51, 63);
        System.out.println(smit.toString());

        Puffendui diggory = new Puffendui("Седрик Диггори", 65, 77, 65, 38, 54);
        System.out.println(diggory.toString());

        Puffendui finchFletchly = new Puffendui("Джастин Финч-Флетчли", 69, 85, 82, 73, 63);
        System.out.println(finchFletchly.toString());

        Cogtevran chang = new Cogtevran("Чжоу Чанг", 47, 56, 48, 62, 59, 39);
        System.out.println(chang.toString());

        Cogtevran patil = new Cogtevran("Падма Патил", 80, 44, 56, 74, 81, 44);
        System.out.println(patil.toString());

        Cogtevran belby = new Cogtevran("Маркус Белби", 55, 49, 57, 68, 82, 57);
        System.out.println(belby.toString());

        System.out.println("____________________________________________________________________");

        for (int i = 0; i < hogwarts.length; i++) {
            for (int j = i + 1; j < hogwarts.length - 1; j++) {
                hogwarts[i].compare(hogwarts[j]);
            }
        }

        System.out.println("____________________________________________________________________");

        Griffindor гарриПоттер = (Griffindor) hogwarts[0];
        Griffindor гермионаГрейнджер = (Griffindor) hogwarts[1];
        Griffindor pонУизли = (Griffindor) hogwarts[2];
        гарриПоттер.compare(гермионаГрейнджер);
        гарриПоттер.compare(pонУизли);
        гермионаГрейнджер.compare(pонУизли);

        System.out.println("____________________________________________________________________");

        Slizerin дракоМалфой = (Slizerin) hogwarts[3];
        Slizerin грэхэмМонтегю = (Slizerin) hogwarts[4];
        Slizerin грегориГойл = (Slizerin) hogwarts[5];
        дракоМалфой.compare(грэхэмМонтегю);
        дракоМалфой.compare(грегориГойл);
        грэхэмМонтегю.compare(грегориГойл);

        System.out.println("_____________________________________________________________________");

        Puffendui захарияСмит = (Puffendui) hogwarts[6];
        Puffendui седрикДиггори = (Puffendui) hogwarts[7];
        Puffendui джастинФинчФлетчли = (Puffendui) hogwarts[8];
        захарияСмит.compare(седрикДиггори);
        захарияСмит.compare(джастинФинчФлетчли);
        седрикДиггори.compare(джастинФинчФлетчли);

        System.out.println("____________________________________________________________________");

        Cogtevran чжоуЧанг = (Cogtevran) hogwarts[9];
        Cogtevran падмаПатил = (Cogtevran) hogwarts[10];
        Cogtevran маркусБелби = (Cogtevran) hogwarts[11];
        чжоуЧанг.compare(падмаПатил);
        чжоуЧанг.compare(маркусБелби);
        падмаПатил.compare(маркусБелби);

        System.out.println("_____________________________________________________________________");

    }

}