package ex10_Refactorying_Java.Movie11;

public class Movie {

    //title, priceCode 넣기 위한 것.
    private String _title;
    private int _priceCode;

    public static final int CHILDREN=0;
    public static final int REGULAR=1;
    public static final int NEW_RELEASE=2;

    Movie(String title, int priceCode){
        this._priceCode=priceCode;
        this._title=title;
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public int get_priceCode() {
        return _priceCode;
    }

    public void set_priceCode(int _priceCode) {
        this._priceCode = _priceCode;
    }

    @Override
    public String toString() {
        return "영화제목은 " + _title;
    }
}
