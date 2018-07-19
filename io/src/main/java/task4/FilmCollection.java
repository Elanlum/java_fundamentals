package task4;


import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class FilmCollection implements Serializable {

    private static FilmCollection filmCollection;
    private static Actor anjelina;
    private static Actor brad;

    private Map<Film, Actor> filmActorMap;
    private Set<Actor> actorSet;

    public FilmCollection(){
        this.filmActorMap = new HashMap<>();
        this.actorSet = new HashSet<>();
    }

    public void addFilm(Film film, Actor mainActor){
        if(!actorSet.contains(mainActor)){
            actorSet.add(mainActor);
        }
        filmActorMap.put(film, mainActor);
    }

    public FilmCollection uploadFilmCollection(){
        Optional<FilmCollection> optionalFilmCollection = Optional.empty();
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("filesTask4/filmCollection.out"))){
//            Optional<FilmCollection> optionalFilmCollection = Optional.of((FilmCollection) objectInputStream.readObject());
            optionalFilmCollection.of((FilmCollection) objectInputStream.readObject());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return optionalFilmCollection.orElse(new FilmCollection());
    }

    public void saveFilmCollection(){
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("filesTask4/filmCollection.out"))){
            objectOutputStream.writeObject(this);
            System.out.println(this);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Actor getActor(Film film){
        return filmActorMap.get(film);
    }

//    public static void main(String[] args) {
//
//        filmCollection = new FilmCollection();
//        anjelina = new Actor("Angelina", "Jolie", LocalDate.of(1975, Month.APRIL, 4));
//        brad = new Actor("Brad", "Pitt", LocalDate.of(1963, Month.DECEMBER, 18));
//        filmCollection.addFilm(new Film("Troy", 2004, brad), brad);
//        filmCollection.addFilm(new Film("The Tourist", 2010, anjelina), anjelina);
//        filmCollection.saveFilmCollection();
//        filmCollection.addFilm(new Film("The Tourist", 2010, anjelina), anjelina);
//        filmCollection.addFilm(new Film("Mr and Mrs Smith", 2005, brad), brad);
//        filmCollection.saveFilmCollection();
//        filmCollection.uploadFilmCollection();
//    }
}
