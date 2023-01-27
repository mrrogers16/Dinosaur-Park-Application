package hpz729_lab1;

public class Stegosaurus extends Stegosaur 
{
	//Constructor
	public Stegosaurus(String name, boolean vegetarian) 
	{
		super(name, vegetarian);
	}

	//Stegosaur->Stegosaurus-subType: Getter
	@Override
	public String getSubType()
	{
		return "Stegosaurus";
	}
}
