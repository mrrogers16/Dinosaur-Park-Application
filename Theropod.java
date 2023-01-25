package hpz729_lab1;

public abstract class Theropod implements Dinosaur 
{
	String name; 
	boolean veggies;
	//Constructor
	public Theropod(String name, boolean veggies)
	{
		this.name = name;
		this.veggies = veggies;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public boolean isVeggies()
	{
		return veggies;
	}
	public void setVeggies(boolean veggies) 
	{
		this.veggies = veggies;
	}
	public String toString(String name)
	{
		return name;
	}
	public String getType()
	{
		
		return "Theropod: " + getSubType();
	}
	
	
	public abstract String getSubType();

	
//An abstract method getSubType(), which takes no parameters and returns a sub type of dinosaur (e.g. “Velociraptor”). This method should be called by the getType() method.

}







