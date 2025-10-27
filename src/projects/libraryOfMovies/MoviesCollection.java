package projects.libraryOfMovies;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

  public Map<String, Movie> filterMap(String word) {
    Map<String, Movie> selectMap = new HashMap<>();
    

    moviesCollection.forEach((title, movie) -> {
      boolean isMatch = Objects.equals(movie.getMovieGenre(), word);

      if (Objects.equals(movie.getMovieYear(), word)) {
        isMatch = true;
      }

      for (Director director : movie.getDirectors()) {
        if (Objects.equals(director.toString(), word)) {
          isMatch = true;
        }
      }

      for (Actor actor : movie.getActors()) {
        if (Objects.equals(actor.toString(), word)) {
          isMatch = true;
        }
      }
      if (isMatch) {
        selectMap.put(title, movie);
      }
    });
    return selectMap;
  }

  public void showResult(Map<String, Movie> collection) {
    collection.forEach((title, movie) -> {
      printResult(movie);
    });
  }

  public void printResult(Movie collection) {
    System.out.print("Title: " + collection.getMovieTitle() + " Genre: " +
            collection.getMovieGenre() + " Year: " + collection.getMovieYear() +
            ". ");
    System.out.print("Directors are ");
    for (Director director : collection.getDirectors()) {
      System.out.print(director.toString() + ' ');
    }
    System.out.print(". ");
    System.out.print("Actors are ");
    for (Actor actor : collection.getActors()) {
      System.out.print(actor.toString() + " ");
      System.out.print(". ");
    }
    System.out.println();
  }
}