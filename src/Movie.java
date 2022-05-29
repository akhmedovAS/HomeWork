/**
 * Класс, описывающий объект "Фильм"
 */
public class Movie {
    String director;
    String title;
    double duration;

    /**
     *
     * @param director Имя режиссера
     * @param title Название фильма
     * @param duration Длительность фильма
     */
    Movie(String director, String title, double duration) {
        this.director = director;
        this.title = title;
        this.duration = duration;
    }

    /**
     *
     * @param director Установить имя режиссера
     */

    public void setDirector(String director) {
        this.director = director;
    }

    /**
     *
     * @param title установить название фильма
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @param duration установить длительность фильма
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }

    /**
     *
     * @return получить имя режиссера
     */
    public String getDirector() {
        return director;
    }

    /**
     *
     * @return получить длительность фильма
     */
    public double getDuration() {
        return duration;
    }

    /**
     *
     * @return получить название фильма
     */
    public String getTitle() {
        return title;
    }
}
