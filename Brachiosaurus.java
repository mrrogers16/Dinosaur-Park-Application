package hpz729_lab1;

public class Brachiosaurus extends Sauropod
{
	//Sauropod->Brachiosaurus: Constructor
		public Brachiosaurus(String name, boolean vegetarian) 
		{
			super(name, vegetarian);
			this.name = name;
			this.vegetarian = vegetarian;
		}
		//Sauropod->Brachiosaurus-name: Getter
		public String getName() 
		{
			return name;
		}
		//Sauropod->Brachiosaurus-name: Setter
		public void setName(String name) 
		{
			this.name = name;
		}
		//Sauropod->Brachiosaurus-vegetarian(boolean): Getter
		public boolean isVegetarian() 
		{
			return vegetarian;
		}
		//Sauropod->Brachiosaurus-vegetarian(boolean): Setter
		public void setVegetarian(boolean vegetarian) 
		{
			this.vegetarian = vegetarian;
		}
		//Sauropod->Brachiosaurus-subType: Getter
		@Override
		public String getSubType()
		{
			return "Brachiosaurus";
		}
		@Override
		public String toString() 
		{
			String vegetarian = " ";
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
}
