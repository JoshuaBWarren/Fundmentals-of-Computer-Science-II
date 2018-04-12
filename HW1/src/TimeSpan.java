// Represents a time span of hours and minutes elapsed.
// Alternate implementation using only total minutes.
public class TimeSpan {
	
	private int totalMinutes;
	
	// Constructs a time span with the given interval.
	// pre: hours >= 0 && minutes >= 0
	public TimeSpan(int hours, int minutes) {
		totalMinutes = 0;
		add(hours, minutes);
	}
	
	// Adds the given interval to this time span.
	// pre: hours >= 0 && minutes >= 0
	public void add(int hours, int minutes) {
		totalMinutes += 60 * hours + minutes;
	}
	
	// Returns a String for this time span such as "6h15m".
	public String toString() {
		return (totalMinutes / 60) + "h" + (totalMinutes % 60) + "m";
	}
	
	// HW1: problem 12
	// Equals method for TimeSpan input.  
	// a TimeSpan is equal only when the hours and minutes 
	// are the same.
	public boolean equals(TimeSpan input) {
	
		return input.totalMinutes == this.totalMinutes;
	}

}
