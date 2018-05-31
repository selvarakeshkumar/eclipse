package datatype;
class datedate{
	public int day;
	public int month;
	public int year;
	public datedate() {
	
	}
	public datedate(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;}
	
public void display() {
	System.out.println(getDay()+"/"+getMonth()+"/"+getYear());
}





  public static  void main(String[] args) {
	  datedate d1=new datedate(24,9,1997);
	  d1.setDay(24);
	  d1.setMonth(9);
	  d1.setYear(1997);
	  d1.display();
	  
}}