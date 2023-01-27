package hpz729_lab1;

public class Apatosaurus extends Sauropod 
{
	// Constructor
	public Apatosaurus(String name, boolean vegetarian)
	{
		super(name, vegetarian);
	}

	//Sauropod->Apatosaurus-subType: Getter
	@Override
	public String getSubType() 
	{
		return "Apatosaurus";
	}

}
