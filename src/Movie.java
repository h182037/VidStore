
public abstract class Movie {

    private String _title;
    //removed priceCode, now using instanceof
    public Movie(String title) {
        _title = title;
    }


    public String getTitle() {
        return _title;
    }

    //parameter daysrented instead of rental.
	public abstract double determineAmount(int daysRented);
    
    
}
