
public class Childrens extends Movie {

	private String _title;
	
	public Childrens(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	

	public String get_title() {
		return _title;
	}

	public void set_title(String _title) {
		this._title = _title;
	}
	
	@Override
	public double determineAmount(int daysRented) {
		double thisAmount = 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;
        return thisAmount;
	}
}
