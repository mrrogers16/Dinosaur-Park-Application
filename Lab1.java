package hpz729_lab1;

/**
 * Lab1 is a Java class containing a main method to run your program when
 * completed. This class will not compile until you have completed the
 * requirements outlined in the lab description.
 * 
 * @author Mickey Clarke (abc123) 
 * UTSA CS 3443 
 * - Lab 1 Spring 2023
 */

public class Lab1 {

	public static void main(String[] args) {

		// create a Park object
		Park jurassicPark = new Park("Jurassic Park", 10);
		//Park myPark = new Park("Micks haven", 12);
		// All Parks contains Dinosaurs which come in different 3 types in our Jurassic
		// Park: theropods, sauropods, & stegosaurs.
		// create dinosaurs to add to the park
		Theropod blue = new Velociraptor("Blue", false); // Velociraptors are a type of Theropod, which is a type of
		Theropod delta = new Velociraptor("Delta", false); // Velociraptors are a type of Theropod, which is a type of
		Theropod echo = new Velociraptor("Echo", false); // Velociraptors are a type of Theropod, which is a type of
		Theropod rex = new Tyrannosaurus("Rex", false); // Tyrannosaurus are a type of Theropod, which is a type of
		Sauropod littleFoot = new Apatosaurus("Littlefoot", true); // Apatosaurus are a type of Sauropod, which is a
		Sauropod bob = new Brachiosaurus("Bob", true); // Brachiosaurus are a type of Sauropod, which is a type of
		Stegosaur spike = new Stegosaurus("Spike", true);

		//Theropod mick = new Velociraptor("Mickeyy", false);

		// Stegosaurus are a type of Stegosaur, which is a type of Dinosaur

		// add all dinos to the park
		jurassicPark.addDino(blue);
		jurassicPark.addDino(delta);
		jurassicPark.addDino(echo);
		jurassicPark.addDino(rex);
		jurassicPark.addDino(littleFoot);
		jurassicPark.addDino(bob);
		jurassicPark.addDino(spike);

		 //myPark.addDino(mick);

		// print the state of the park (see lab description)
		System.out.println(jurassicPark);
		 //System.out.println("\n" + myPark);
	}
}

// Fun Fact:
// Did you know? There are generally considered to be 7 types of dinos:
// theropods, sauropods, stegosaurs, ankylosaurs, ornithopods, ceratopsians, and
// pachycephalosaurs!