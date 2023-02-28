public class Salesperson implements Comparable {
	private String firstName, lastName;
	private int totalSales;
	
        public Salesperson( String first, String last, int sales ) {
		firstName = first;
		lastName = last;
		totalSales = sales;
	}


	public String toString() {
		return lastName + ", " + firstName + ": \t" + totalSales;
	}
	

	public boolean equals( Object other ) {
		return( lastName.equals(((Salesperson)other).getLastName()) &&
		        firstName.equals(((Salesperson)other).getFirstName()));
	}


	public int compareTo(Object other) {
            Salesperson otherPerson = (Salesperson) other;

            if (totalSales > otherPerson.totalSales) {
                return -1;
            } else if (totalSales < otherPerson.totalSales) {
                return 1;
            } else {
                return lastName.compareTo(otherPerson.lastName) * -1;
            }
        }


	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getSales() {
		return totalSales;
	}
}