package projects.libraryOfMovies;

import java.util.ArrayList;
import java.util.List;

public class Movie {
  private final String title;
  private final String genre;
  private final int year;
  private final List<Director> directors;
  private final List<Actor> actors;

  public Movie(String title, String genre, int year) {
    this.title = title;
    this.genre = genre;
    this.year = year;
    directors = new ArrayList<>();
    actors = new ArrayList<>();

  }

  public String getMovieTitle() {
    return title;
  }

  public String getMovieGenre() {
    return genre;
  }

  public int getMovieYear() {
    return year;
  }

  public void addDirector(Director director) {
    directors.add(director);
  }

  public List<Director> getDirectors() {
    return directors;
  }

  public void addActor(Actor actor) {
    actors.add(actor);
  }

  public List<Actor> getActors() {
    return actors;
  }


}


