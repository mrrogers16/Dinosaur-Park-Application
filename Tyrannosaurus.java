package hpz729_lab1;

public class Tyrannosaurus extends Theropod
{
//Constructor
	public Tyrannosaurus(String name, boolean veggies) 
	{
		super(name, veggies);
	}
	
	public String getName() {
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
		return "Theropod" + getSubType();
	}

	@Override
	public String getSubType()
	{
		return "Tyrannosaurus";
	}

}