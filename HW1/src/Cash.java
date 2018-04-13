/*
 * Joshua Warren
 * CS211
 * 4/12/2018
 * HW1 Assignment
 */

// Represents an amount of money held by an investor.
public class Cash implements Asset {
	
	private double amount;   
	
	// amount of money held
	// Constructs a cash investment of the given amount.
	public Cash(double amount) {
		
		this.amount = amount;
		}
	
	// Returns this cash investment's market value, which
	// is equal to the amount of cash.
	public double getMarketValue() {
		return amount;
		}
	
	// Since cash is a fixed asset, it never has any profit.
	public double getProfit() {
		return 0.0;
		}
	
	// Sets the amount of cash invested to the given value.
	public void setAmount(double amount) {
		this.amount = amount;
		}
	
	// [jwl]Adds to the cash amount invested in this asset.
	public void deposit(double amount) {
		this.amount += amount;
		}
	
	// [jwl]Distributes some of the cash in this asset.
	public double distribute(double amount) {
		if (amount <= this.amount) {
			this.amount -= amount;
			return amount;
			}
		return 0.0;
		}
	
	// [jwl]Returns the name of the asset.
	public String toString(){
		return "Cash $" + this.amount;
		}
	
	// HW1: problem 13
	// Equals method for Cash input.
	// A Cash object is equal only when the amount of money
	// is the same.
	public boolean equals(Cash input) {
		
		return input.amount == this.amount;
	}
}