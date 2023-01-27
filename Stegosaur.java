package hpz729_lab1;

public abstract class Stegosaur implements Dinosaur 
{
	String name; 
	boolean vegetarian;
	//Stegosaur constructor
	public Stegosaur(String name, boolean vegetarian)
	{
		this.name = name;
		this.vegetarian = vegetarian;
	}
	//Stegosaur-name: Getter
	public String getName() 
	{
		return name;
	}
	//Stegosaur-name: Setter
	public void setName(String name) 
	{
		this.name = name;
	}
	//Stegosaur-vegetarian: Getter
	public boolean isVegetarian()
	{
		return vegetarian;
	}
	//Stegosaur-vegetarian: Getter
	public void setVeggies(boolean vegetarian) 
	{
		this.vegetarian = vegetarian;
	}
	
	//Stegosaur toString() method
	//Checks boolean value and assigns appropriate carnivore status.
	//returns String built by calling the subclasses getType() and getName() methods 
	//and appends carnivore status to vegetarian
	public String toString()
	{
		String vegetarian = null;
		if(this.vegetarian)
		{
			vegetarian = "(not carnivore)";
		}
		else
		{
			vegetarian = "(carnivore)";
		}
		
		return getType() + " named " + getName() + vegetarian;
	}
	//Theropod-type: getter
	//Returns String built by calling getSubType() from subclass 
	//and appending to a
	public String getType()
	{
		return "Stegosaur: " + getSubType();
	}
	//Abstract getSubType for subclass
	public abstract String getSubType();

}


