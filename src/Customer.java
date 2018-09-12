
import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector<Rental> _rentals = new Vector<Rental>();

    public Customer(String name) {
        _name = name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            Movie eachMovie = each.getMovie(); //<----- Extracted variable
            int daysRented = each.getDaysRented(); // Extracted variable
            double thisAmount = eachMovie.determineAmount(daysRented); // This method has been moved into polymorphed Movie classes.
            // add frequent renter points
            frequentRenterPoints ++;
            // add bonus for a two day new release rental
            if ((eachMovie instanceof NewRelease) && daysRented > 1) 
            	frequentRenterPoints ++;
            //show figures for this rental
            result += "\t" + eachMovie.getTitle()+ "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        addFooterLines(result, totalAmount, frequentRenterPoints); //<------
        return result;
    }
    
    // extracted add footer lines
    //compressed method into just a return line
    public String addFooterLines(String result, double totalAmount, int frequentRenterPoints) {
        return result + "Amount owed is " + String.valueOf(totalAmount) + "\n" + "You earned " + 
        		String.valueOf(frequentRenterPoints) + " frequent renter points";
    }
    
    
    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }
}
