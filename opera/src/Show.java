import java.util.List;

public class Show {
    String title;
    int duration;
    Director director;
    List<Actor> actors;

    public Show(String title, int duration, Director director, List<Actor> actors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.actors = actors;
    }

    public void printActors() {
        for (Actor actor : actors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        for (Actor act : actors) {
            // тут по факту можно и без null, но будто бы мы работаем с актерами,
            // а какие они - нам не говорят.
            if (act != null && act.equals(actor)) {
                System.out.println("Актер " + actor + " уже добавлен");
                return;
            }
        }
        actors.add(actor);
    }

    public void replaceActor(Actor newActor, String surname) {
        for (int i = 0; i < actors.size(); ++i) {
            if (actors.get(i).surname.equals(surname)) {
                actors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surname + " не найден");
    }
}
