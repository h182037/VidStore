
public class NewRelease extends Movie {
	private String _title;
	
	public NewRelease(String title) {
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
		double thisAmount = daysRented * 3;
        return thisAmount;
	}
}
