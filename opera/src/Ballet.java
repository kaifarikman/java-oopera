import java.util.List;

public class Ballet extends MusicalShow {
    String choreographer;

    public Ballet(String title, int duration, Director director, List<Actor> actors, String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, director, actors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    public String toString() {
        return "балетмейстер: " + choreographer + ", " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ballet)) return false;
        Ballet that = (Ballet) o;
        return choreographer.equals(that.choreographer) && super.equals(that);
    }

    @Override
    public int hashCode() {
        int result = choreographer.hashCode();
        result = 31 * result + super.hashCode();
        return result;
    }
}
