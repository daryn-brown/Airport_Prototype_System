
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
import java.lang.Math;

class Main {
  public static LinkedList arrivals; //LinkedList storing customer data
  public static int level1Males = 0;
  public static int level2Males = 0;
  public static int level1Females = 0;
  public static int level2Females = 0;

  public static void main(String[] args) {
    int intervals = 3; //the number of time intervals (t=0, t=1, t=2)

    arrivals = new LinkedList();

    Customer newCust = new Customer(); //Customer object initialized and first Customer generated

    System.out.println("\n******* Arrivals *******");
    for(int j = 0; j < intervals; j++) { //each loop represents a time interval      
      int arrNumber = (int) ((Math.random() * (6 - 1)) + 1);//generates a random number of arrivals between 1 and 6 for the time interval

      //adds customer arrivals to LinkedList for the current time interval
      for (int i = 0; i < arrNumber; i++) {
        arrivals.add(newCust);//add new Customer to Linked List
        newCust = new Customer();//generate new customer      
      }
      System.out.println("\ntime " + j);//print line indicating current interval 
      //print all data currently in the list
      for (int i = 0; i < arrivals.size(); i++) {
        System.out.println(arrivals.get(i));
      }
    }

    arrivals.sortList();//Sorts list using bubble sort
    System.out.println("\n******* Final Priority List *******\n");
    for (int i = 0; i < arrivals.size(); i++) {
      System.out.println(arrivals.get(i));
    }

    //loop through list and iterate report values
    for (int j = 0; j < arrivals.size(); j++) {
      Customer current = (Customer) arrivals.get(j);
      int pNum = current.getPriority();
      String gender = current.getGender();
      //checks customer category and adds to count accordingly
      if(pNum == 1 && gender == "Male"){
        level1Males++;
      } else if(pNum == 2 && gender == "Male"){
        level2Males++;
      } else if(pNum == 1 && gender == "Female"){
        level1Females++;
      } else if(pNum == 2 && gender == "Female"){
        level2Females++;
      }
    }

    //Print final report
    System.out.println("\n******* Customers Report *******\n");
    System.out.println("Number of level 1 males on each flight: " + level1Males );
    System.out.println("Number of level 2 males on each flight: " + level2Males);
    System.out.println("Number of level 1 females on each flight: " + level1Females);
    System.out.println("Number of level 2 females on each flight: " + level2Females);

    //Remove between 3 and 5 persons from the front of the list
    System.out.println("\n\n******* List Removal *******");
    int rNum = (int) ((Math.random() * (5 - 3)) + 3);//generates a random number

    //this loop removes a customer from the front of the list at each iteration
    for (int k = 0; k < rNum; k++) {
      arrivals.remove(0);//remove first node
      System.out.println("\ntime " + k + "\nCurrent State: " + (k+1) + " persons removed");
      //prints current state of the list
      for (int f = 0; f < arrivals.size(); f++) {
        System.out.println(arrivals.get(f));
      }
    }
  }
}