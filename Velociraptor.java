package hpz729_lab1;

public class Velociraptor extends Theropod
{
	//Constructor
	public Velociraptor(String name, boolean vegetarian) 
	{
		super(name, vegetarian);
	}
	//Theropod->Velociraptor-subType: Getter
	@Override
	public String getSubType()
	{
		return "Velociraptor";
	}
	
	
	


}
