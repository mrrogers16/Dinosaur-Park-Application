package hpz729_lab1;

public class Tyrannosaurus extends Theropod
{
	
	//Constructor
	public Tyrannosaurus(String name, boolean vegetarian) 
	{
		super(name, vegetarian);
	}
	//Theropod->Tyrannosaurus-subType: Getter
	@Override
	public String getSubType()
	{
		return "Tyrannosaurus";
	}

}