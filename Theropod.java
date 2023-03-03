package hpz729_lab1;

public abstract class Theropod implements Dinosaur 
{
	String name; 
	boolean vegetarian;
	
	//Theropod Constructor
	public Theropod(String name, boolean vegetarian)
	{
		this.name = name;
		this.vegetarian = vegetarian;
	}
	//Theropod-name: Getter
	public String getName() 
	{
		return name;
	}
	//Theropod-name: Setter
	public void setName(String name) 
	{
		this.name = name;
	}
	//Theropod-vegetarian: Getter
	public boolean isVegetarian()
	{
		return vegetarian;
	}
	//Theropod-vegetarian: Setter
	public void setVegetarian(boolean vegetarian) 
	{
		this.vegetarian = vegetarian;
	}
	
	/*Theropod toString method. Checks boolean value and assigns appropriate carnivore status.
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
	/*Theropod-type: getter
	Returns String built by calling getSubType() 
	from subclass and appending to a string
	*/
	public String getType()
	{
		return "Theropod: " + getSubType();
	}
	//Abstract method getSubType for subclass
	public abstract String getSubType();

	

}







