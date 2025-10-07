package projects.libraryOfMovies;

public class Director {
  private String name;

  public Director (String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return String.format(name);
  }
}
