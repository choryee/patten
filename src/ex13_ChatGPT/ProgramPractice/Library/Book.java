package ex13_ChatGPT.ProgramPractice.Library;

public class Book {
    private String name;
    private int rentAvailableDay;

    private boolean isRented;
    private boolean isGereHave;


    Book(String name, int rentAvailableDay){
        this.name=name;
        this.rentAvailableDay=rentAvailableDay;
        isRented=false;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public int getrentAvailableDay(){
        return rentAvailableDay;
    }

    public boolean getIsRented(){
        return isRented;
    }

    public void setIsRented(boolean isRented){
        this.isRented=isRented;
    }

   public void setIsGereHave(boolean isGereHave){
        this.isGereHave=isGereHave;
   }

   public boolean getIsGereHave(){
        return isGereHave;
   }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", rentAvailableDay=" + rentAvailableDay +
                '}';
    }
}
