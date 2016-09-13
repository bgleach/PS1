package pkgMain;

public class Rectangle1 {

	private double Length;
	private double Width;
	public Rectangle1(double length, double width) {
		Length = length;
		Width = width;
	}
	public double getLength() {
		return Length;
	}
	public double getWidth() {
		return Width;
	}
	
	public double Area()
	{
		// TODO Implement Area() function with the correct formula
		return Length * Width;
	}	
}
