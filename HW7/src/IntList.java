/*
 * Joshua Warren
 * CS 211
 * 6/3/2018
 * Homework 7
 */
/*
This is the interface definition for the IntList data type
*/
public interface IntList {
	public int size();

	public int get(int index);

	public String toString();

	public int indexOf(int value);

	public void add(int value);

	public void add(int index, int value);

	public void remove(int index);
}
