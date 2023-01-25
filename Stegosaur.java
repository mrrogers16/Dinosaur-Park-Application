package hpz729_lab1;

public abstract class Stegosaur implements Dinosaur 
{
	String name; 
	boolean veggies;
//Constructor
	public Stegosaur(String name, boolean veggies)
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
		return "Stegosaur" + getSubType();
	}
	public abstract String getSubType();

}


