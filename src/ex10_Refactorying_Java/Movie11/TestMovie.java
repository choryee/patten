package ex10_Refactorying_Java.Movie11;

public class TestMovie {
    public static void main(String[] args) {
//        Movie movie1=new Movie("Gone with wind", 1);
//        Movie movie2=new Movie("Bodyguard", 2);

        Rental rental1=new Rental(new Movie("Gone with wind", 1), 10);
        //Rental rental2=new Rental(new Movie("Bodyguard", 0), 5);

        Customer customer1=new Customer("Brian");
        customer1.addRental(rental1);
        //customer1.addRental(rental2);

        customer1.showRentals();

        Statement statement=new Statement();
        System.out.println(statement.getAmount(rental1.get_movie().get_priceCode(),rental1.get_dayRented()));
        System.out.println(statement.getStatement(customer1));


    }
}
