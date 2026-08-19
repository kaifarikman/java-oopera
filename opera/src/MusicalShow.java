import java.util.List;

public class MusicalShow extends Show {
    String musicAuthor;
    String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       List<Actor> actors, String musicAuthor, String librettoText) {
        super(title, duration, director, actors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println(librettoText);
    }

    @Override
    public String toString() {
        return super.toString() + ", музыка: " + musicAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MusicalShow)) return false;
        MusicalShow that = (MusicalShow) o;
        return musicAuthor.equals(that.musicAuthor) &&
                librettoText.equals(that.librettoText) &&
                super.equals(that);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + musicAuthor.hashCode();
        result = 31 * result + librettoText.hashCode();
        return result;
    }
}
