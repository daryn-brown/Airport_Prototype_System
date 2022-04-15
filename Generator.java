/*
	Norman Manley Airport Flight Processing System
	Developers: Danae Banks      [2002895]
				      Chantae Richards [2001718]
				      Daryn Brown      [2002414]
				      Prince Walker    [1802393]
	Tutor     : Rorron Clarke
	Occurence : Um2
	Date      : April 1, 2022
*/

import java.util.Random;

public class Generator {
  //list of unisex first names
  String[] firstNames = {"Charlie", "Dakota", "Sam", "Jessie", "Jamie", "Ariel", "Kai", "Aubrey", "Justice", "Carey", "Skyler"};
  //list of last names
  String[] lastNames = {"Brown", "Doe", "Williams", "Geiger", "Pittsville", "Polikarpova", "Quinn", "Lukashenko", "Reeves", "Powers", "Frankfield"};
  //list of possible genders
  String[] genders = {"Male", "Female"};

  public String generateName() {
    Random rand = new Random();
    String firstName = firstNames[rand.nextInt(firstNames.length)];//chooses a random first name
    String lastName = lastNames[rand.nextInt(lastNames.length)];//chooses a random last name
    String name =  firstName + " " + lastName;//concatenate first name and last name

    return name;
  }

  public String generateTRN() {
    Random rnd = new Random();
    int tNumber = rnd.nextInt(999999999);
    String trn = String.format("%09d", tNumber);

    return trn;
  }

  public String generateGender() {
    Random gend = new Random();
    String gender = genders[gend.nextInt(genders.length)];
    return gender;
  }

  public String generateFlight() {
    Random fNum = new Random();
    int fNumber = fNum.nextInt(9999);
    String flightNo = String.format("%04d", fNumber);

    return flightNo;
  }

  public int generatePriority() {
    Random pNum = new Random();
    int pNumber = pNum.nextInt(2);
    pNumber++; // Add 1 to the result to get a number from the required range (1-2)

    return pNumber;
  }
}


