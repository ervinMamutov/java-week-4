package projects.libraryOfMovies;

import java.util.*;

public class MoviesCollection {
  private final Map<String, Movie> moviesCollection;

  public MoviesCollection() {
    moviesCollection = new HashMap<>();
  }

  public void addMoviesCollection(Movie movie) {
    String title = movie.getMovieTitle();
    moviesCollection.put(title, movie);
  }

  public void showMovies() {
    showResult(moviesCollection);
  }

  public void showResult(Map<String, Movie> collection) {
    collection.forEach((title, movie) -> {
      System.out.print("Title: " + title + " Genre: " + movie.getMovieGenre() +
              " Year: " + movie.getMovieYear() + ". ");
      System.out.print("Directors are ");
      for (Director director : movie.getDirectors()) {
        System.out.print(director.toString() + ' ');
      }
      System.out.print(". ");
      System.out.print("Actors are ");
      for (Actor actor : movie.getActors()) {
        System.out.print(actor.toString() + " ");
        System.out.print(". ");
      }
      System.out.println();
    });
  }


  public void searchByGenre(String genre) {
    Map<String, Movie> genreCollection = new HashMap<>();

    Set<String> res = new HashSet<>();
    for (Map.Entry<String, Movie> e : moviesCollection.entrySet()) {
      if (Objects.equals(e.getValue().getMovieGenre(), genre))
        res.add(e.getKey());
    }
    for (String key : res) {
      genreCollection.put(key, moviesCollection.get(key));
    }

      showResult(genreCollection);
  }

  public void searchByDirector(String director) {
    Map<String, Movie> directorCollection = new HashMap<>();
    Set<String> res = new HashSet<>();
    for (Map.Entry<String, Movie> e : moviesCollection.entrySet()) {
      for (Director dir : e.getValue().getDirectors())
        if (Objects.equals(dir.getName(), director)) res.add(e.getKey());
    }
    for (String key : res) {
      directorCollection.put(key, moviesCollection.get(key));
    }
    showResult(directorCollection);
  }
}
