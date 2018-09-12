
public class Regular extends Movie {

	private String _title;
	
	public Regular(String title) {
		super(title);
	}

	public String get_title() {
		return _title;
	}

	public void set_title(String _title) {
		this._title = _title;
	}

	@Override
	public double determineAmount(int daysRented) {
		double thisAmount = 2;
        if (daysRented > 2)
            thisAmount += (daysRented - 2) * 1.5;
        return thisAmount;
	}
}
