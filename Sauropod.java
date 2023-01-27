package hpz729_lab1;

public abstract class Sauropod implements Dinosaur
{
	String name; 
	boolean vegetarian;
	
	//Sauropod Constructor
	public Sauropod(String name, boolean vegetarian)
	{
		this.name = name;
		this.vegetarian = vegetarian;
	}
	//Sauropod-name: Getter
	public String getName() 
	{
		return name;
	}
	//Sauropod-name: Setter
	public void setName(String name) 
	{
		this.name = name;
	}
	//Sauropod-vegetarian: Getter
	public boolean isVegetarian()
	{
		return vegetarian;
	}
	//Sauropod-vegetarian: Setter
	public void setVeggies(boolean vegetarian) 
	{
		this.vegetarian = vegetarian;
	}
	/*Sauropod toString method. Checks boolean value and assigns appropriate carnivore status.
	returns String built by calling the subclasses getType() and getName() methods and appends 
	carnivore status to vegetarian*/
	public String toString()
	{
		String vegetarian = "";
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
	/*Sauropod-type: getter
	Returns String built by calling getSubType() 
	from subclass and appending to a string 
	*/
	public String getType()
	{
		return "Sauropod: " + getSubType();
	}
	//Abstract getSubType for subclass
	public abstract String getSubType();
}

