package hpz729_lab1;

public class Park implements Dinosaur
{
	String name;
	int maxCapacity = 10;
	Dinosaur[] dinoList = new Dinosaur[maxCapacity];
	
	//Constructor
	public Park(String name, int max)
	{
		this.name = name;
		this.maxCapacity = max;
	}	
	public void  addDino(Dinosaur d)
	{
		Dinosaur[] newDinoList = new Dinosaur[dinoList.length + 1];
		for(int i = 0; i < dinoList.length; i++)
		{
			dinoList[i] = newDinoList[i];
			newDinoList[newDinoList.length - 1] = d;
			newDinoList = dinoList;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	@Override
	public boolean isVeggies() {
		
		return isVeggies();
	}

	
	@Override
	public String toString()
	{
		return "* " + getType() + ": " + getSubType() + "named " + getName();
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}
}
/*
Welcome to Jurassic Park!
- - - - - - - - - - - - - 
* Theropod: Velociraptor named Blue (carnivore)
* Theropod: Velociraptor named Delta (carnivore)
* Theropod: Velociraptor named Echo (carnivore)
* Theropod: Tyrannosaurus named Rex (carnivore)
* Sauropod: Apatosaurus named Littlefoot (not carnivore)
* Sauropod: Brachiosaurus named Bob (not carnivore)
* Stegosaur: Stegosaurus named Spike (not carnivore)
*/

















