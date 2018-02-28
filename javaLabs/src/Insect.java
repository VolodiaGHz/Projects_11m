
public class Insect {
	private String name = "NoName";
	private int numberOfLegs;
	private int numberOfWings;
	private double size;
	private static long numerocity = 20000;
    private long numberOfLayEggs=1000;
    
    
    
    public Insect() {
    	
    }
    
    public Insect(String name, int numberOfLegs, int numberOfWings, double size) {
    	setName(name);
    	setNumberOfLegs(numberOfLegs);
    	setNumberOfWings(numberOfWings);
    	setSize(size);
    }
	
    public Insect(String name, int numberOfLegs, int numberOfWings, double size,long numberOfLayEggs) {
    	setName(name);
    	setNumberOfLegs(numberOfLegs);
    	setNumberOfWings(numberOfWings);
    	setSize(size);
    	setNumberOfLayEggs(numberOfLayEggs);
    }
    public String toString() {
    	return "description of the insect:\nname:"+ getName()
    			+"\nnumberOfLegs:"  +  getNumberOfLegs()
    			+"\nnumberOfWings:" + getNumberOfWings()
    			+"\nsize:" + getSize()
    			+"\nnumberOfLayEggs:" + getNumberOfLayEggs()
    			+"\n";
    }
	public static void printStaticSum() {
    	System.out.print("The total number of certain types " + numerocity + " total\n");
    }
	public void printSum() {
        System.out.println("The total number of layed eggs from 1 " + getName() + " are " + getNumberOfLayEggs() + "\n");
}
    public void resetValues(String name, int numberOfLegs, int numberOfWings, double size,long NumberOfLayEggs) {
    	setName(name);
    	setNumberOfLegs(numberOfLegs);
    	setNumberOfWings(numberOfWings);
    	setSize(size);
    	setNumberOfLayEggs(numberOfLayEggs);
    	}
    public String getName() {
        return name;
    }
    public void setName(String name) {
    	this.name=name;
    	}
    public int getNumberOfWings() {
    	return numberOfWings;
    }
    public void setNumberOfWings(int numberOfWings){
    	this.numberOfWings=numberOfWings;
    	
    }
    public int getNumberOfLegs() {
    	return numberOfLegs;
    }
    public void setNumberOfLegs(int numberOfLegs){
        this.numberOfLegs=numberOfLegs;   	
    }    
    public double getSize() {
    	return size;
    }
    public void setSize(double size) {
    	this.size=size;
    }
    public long getNumberOfLayEggs() {
    	return numberOfLayEggs;
    }
    public void setNumberOfLayEggs(long numberOfLayEggs) {
    	numerocity-=this.numberOfLayEggs;
    	numerocity+=this.numberOfLayEggs;
    	this.numberOfLayEggs=numberOfLayEggs;
    } 
}
