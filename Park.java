package hpz729_lab1;

public class Park {
	String name;
	int maxCapacity;
	Dinosaur[] dinoList = null;

	// Constructor
	public Park(String name, int max) {
		this.name = name;
		this.maxCapacity = max;
	}

	// Takes in Dinosaur object, performs null and maxCapacity checks, creates a new
	// array with size + 1, copies contents of
	// original array, copies parameter to last spot in array, re-assigns
	// newDinoList to dinoList
	public void addDino(Dinosaur d) {
		Dinosaur[] newDinoList;

		// dinoList null check, if true take dino parameter and insert it into first
		// spot in dinoList array and returns
		if (dinoList == null) {
			dinoList = new Dinosaur[1];
			dinoList[0] = d;
			return;
		}
		//if dinoList is full return
		if (dinoList.length == maxCapacity) {
			return;
		}

		// create new array of dinoList.length + 1
		newDinoList = new Dinosaur[dinoList.length + 1];
		// copy contents of original array into newDinoList
		for (int i = 0; i < dinoList.length; ++i) {
			newDinoList[i] = dinoList[i];
		}
		// insert Dinosaur parameter into end of newDinoList array
		newDinoList[newDinoList.length - 1] = d;
		// point dinoList to newDinoList
		dinoList = newDinoList;
	}

	// Name: Getter
	public String getName() {
		return name;
	}

	// Name: Setter (takes in String parameter)
	public void setName(String name) {
		this.name = name;
	}

	// Max capacity: Getter
	public int getMaxCapacity() {
		return maxCapacity;
	}

	// Max capacity: Setter
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	// toString method that calls on lower level toString() methods to build a
	// String representing park name and contents.
	@Override
	public String toString() {
		// Initial message using getName which returns the name of the park to build a
		// string.
		if (dinoList == null) {
			return "Park Empty";
		}
		String s = "Welcome to " + getName() + "!\r\n - - - - - - - - - - - - -\n";
		// Cycles through dinoList length amount of times and appends to a string until
		// complete.
		for (int i = 0; i < dinoList.length; i++) {
			s += "* " + dinoList[i].toString() + "\n";

		}

		return s;// returns appended string
	}

}
