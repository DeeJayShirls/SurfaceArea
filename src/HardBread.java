/*
 * Name: Dejanae Shirley
 */
public class HardBread {
	
		//declarations for HardBread
	    public double MAX_HEIGHT = 5.5;
	    public double MAX_LENGTH = 21.5; 
	    public double MAX_WIDTH = 5.3;

	    private double height;
	    private double length;
	    private double width;
	    private boolean isOliveBread;

	    //Constructor
	    HardBread(double height, double length, double width, boolean isOliveBread) {
	    this.height = height;
	    this.length = length;
	    this.width =width; 
	    }
	    //getters and setters for declarations
	    public void setHeight(double height) {
	        this.height = height;
	    }
	    public double getHeight() { 
	        return height;
	    }
	    public void setLength(double length) {
	        this.length = length;
	    }
	    public double getLength() {
	        return length;
	    }
	    public void setWidth(double width) {
	        this.width = width;
	    }
	    public double getWidth() {
	        return width;
	    }
	    public void setIsOliveBread(boolean isOliveBread) {
	        this.isOliveBread = isOliveBread;
	    }
	    public boolean getIsOliveBread() {
	        return isOliveBread;
	    }
	    public double getCalculateTotalSurfaceArea(){

	        return 2*(length * width + length * height + height * width);
	        }
	    public String toString(){//formats the Height,Length and Width to 2 decimal points
	    	String report = String.format("Height %.2f, Length %.2f, Width %.2f", height, length, width);
	        return report;
	    }
	}