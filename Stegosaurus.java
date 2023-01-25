package hpz729_lab1;

public class Stegosaurus extends Stegosaur 
{
//Constructor
	public Stegosaurus(String name, boolean veggies) 
	{
		super(name, veggies);
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

	@Override
	public String getType() 
	{
		return "Stegosaur " + getSubType();
	}
	@Override
	public String getSubType()d
	{
		return "Stegosaurus";
	}
}
