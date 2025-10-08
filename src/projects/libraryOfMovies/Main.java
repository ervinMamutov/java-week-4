package projects.libraryOfMovies;
//Description:
//
//  Classes: `Movie`, `Actor`, `Director`
//  Store movies in a `Map<String, Movie>` (key = title)
//  Methods to add, search, and filter movies
//
//Features:
//
//  Add new movies
//  Search by genre or director
//  List all movies featuring a specific actor

public class Main {
  public static void main(String[] args) {
    Movie m1 = new Movie("title1", "genre", "2024");
    Director director1 = new Director("director1");
    Actor actor1 = new Actor("actor1");
    m1.addDirector(director1);
    m1.addActor(actor1);

    Movie m2 = new Movie("title2", "genre2", "2023");
    Director director2 = new Director("director2");
    Actor actor2 = new Actor("actor2");
    Actor actor3 = new Actor("actor3");

    m2.addDirector(director2);
    m2.addActor(actor1);
    m2.addActor(actor2);
    m2.addActor(actor3);

    MoviesCollection col1 = new MoviesCollection();
    col1.addMoviesCollection(m1);

    col1.showMovies();

    col1.addMoviesCollection(m2);
    col1.showMovies();

    System.out.println("Show2");
    col1.showResult(col1.filterMap("director1"));

    System.out.println("Show2");
    col1.showResult(col1.filterMap("actor1"));

    System.out.println("One Show2");
    col1.showResult(col1.filterMap("actor2"));

    System.out.println("One genre");
    col1.showResult(col1.filterMap("genre"));

    System.out.println("One genre");
    col1.showResult(col1.filterMap("2024"));

  }
}
