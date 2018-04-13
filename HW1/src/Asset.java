/*
 * Joshua Warren
 * CS211
 * 4/12/2018
 * HW1 Assignment
 */

// Represents financial assets that investors hold.
public interface Asset {
	
	// how much the asset is worth
	public double getMarketValue();
	
	// how much money has been made on this asset
	public double getProfit();

}