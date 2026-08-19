import java.util.List;

public class Opera extends MusicalShow {
    int choirSize;

    public Opera(String title, int duration, Director director,
                 List<Actor> actors, String musicAuthor,
                 String librettoText, int choirSize) {
        super(title, duration, director, actors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return super.toString() + ", хор: " + choirSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Opera)) return false;
        Opera that = (Opera) o;
        return choirSize == that.choirSize && super.equals(that);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + choirSize;
        return result;
    }
}
