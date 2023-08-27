package ex10_Refactorying_Java.Movie11;

public class Statement {

     int sum=0;
    public  int getAmount(int priceCode, int dayRented){

       // int priceCode=0;
        int rate=0;
        int amount=0;
        int point=0;
        switch (priceCode){
            case Movie.CHILDREN : //0
                rate=3;
                amount+=rate* dayRented;
                break;
            case Movie.REGULAR: //1
                rate=5;
                amount+=rate* dayRented;
                break;
            case Movie.NEW_RELEASE: //2
                rate=10;
                amount+=rate* dayRented;
                point++;
                break;
        }//--switch
        sum+=amount;

        return sum;
    }

    public String getStatement(Customer customer){
        //System.out.println("getStatement");
        String result=customer.get_name()+"고객님의 대여기록\n";
        //result+="\t"+customer.showRentals();
        return result;
    }


}
