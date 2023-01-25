package hpz729_lab1;

public class Apatosaurus extends Sauropod
{
	//Constructor
		public Apatosaurus(String name, boolean veggies) 
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
			return "Apatosaurus";
		}

		@Override
		public String getType() 
		{
			return  + " " + getSubType();
		}

}
