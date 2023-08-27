package ex10_Refactorying_Java.Movie11;

import ex13_ChatGPT.CollectionPractice.List.List;

public class Rental {
    private Movie _movie;
    private int _dayRented;

    Rental(Movie movie, int dayRented){
        this._movie=movie;
        this._dayRented=dayRented;
    }

    public Movie get_movie() {
        return _movie;
    }

    public void set_movie(Movie _movie) {
        this._movie = _movie;
    }

    public int get_dayRented() {
        return _dayRented;
    }

    public void set_dayRented(int _dayRented) {
        this._dayRented = _dayRented;
    }

    @Override
    public String toString() {
        return ""+_movie ;
    }
}
