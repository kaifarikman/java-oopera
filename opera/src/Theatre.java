import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Петров", Gender.MALE, 180);
        Actor actor2 = new Actor("Мария", "Сидорова", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Пётр", "Кузнецов", Gender.MALE, 175);

        Director director1 = new Director("Анна", "Иванова", Gender.FEMALE, 12);
        Director director2 = new Director("Олег", "Смирнов", Gender.MALE, 8);

        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Мариус Петипа";

        Show show = new Show("Ревизор", 120, director1, new ArrayList<>());
        Opera opera = new Opera("Травиата", 150, director2, new ArrayList<>(),
                musicAuthor, "Ария Виолетты...", 24);
        Ballet ballet = new Ballet("Лебединое озеро", 140, director1, new ArrayList<>(),
                musicAuthor, "Сцена у озера...", choreographer);

        show.addActor(actor1);
        show.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println("Режиссёр спектакля \"" + show.title + "\": " + show.director);
        System.out.println("Актёры спектакля \"" + show.title + "\":");
        show.printActors();

        System.out.println("Режиссёр оперы \"" + opera.title + "\": " + opera.director);
        System.out.println("Актёры оперы \"" + opera.title + "\":");
        opera.printActors();

        System.out.println("Режиссёр балета \"" + ballet.title + "\": " + ballet.director);
        System.out.println("Актёры балета \"" + ballet.title + "\":");
        ballet.printActors();

        show.replaceActor(actor3, "Петров");
        System.out.println("Актёры спектакля \"" + show.title + "\" после замены:");
        show.printActors();

        opera.replaceActor(actor1, "Несуществующий");

        System.out.println("Либретто оперы \"" + opera.title + "\":");
        opera.printLibretto();

        System.out.println("Либретто балета \"" + ballet.title + "\":");
        ballet.printLibretto();
    }
}
