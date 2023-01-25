package hpz729_lab1;

public class Brachiosaurus extends Sauropod
{
	//Constructor
		public Brachiosaurus(String name, boolean veggies) 
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
		public String getSubType()
		{
			return "Brachiosaurus";
		}

		@Override
		public String getType(Dinosaur d) 
		{
			return d.getName() + " " + getSubType();
		
		}
}
