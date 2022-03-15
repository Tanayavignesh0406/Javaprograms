package javaassignment;

class Date{
	int day;
	int month;
	int year;
	 int test = 5;
	
	Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return this.day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return this.month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void displayDate() {
		System.out.println(day + "/" + month + "/" + year);
	}
}
public class PrintDate {
	public static void main(String args[]) {
		Date date = new Date(4, 6, 2001);
		Date date1 = new Date(7, 7, 2001);
		date.displayDate();
		date1.displayDate();

	}
}
