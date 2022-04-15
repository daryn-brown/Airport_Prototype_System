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
class Customer {
  String name;
  String trn;
  String gender;
  String flightNum;
  int priority;

  public Customer() {
    Generator rng = new Generator();

    this.name = rng.generateName();
    this.trn = rng.generateTRN();
    this.gender = rng.generateGender();
    this.flightNum = rng.generateFlight();
    this.priority = rng.generatePriority();
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void setTrn(String trn){
    this.trn = trn;
  }

  public String getTrn(){
    return this.trn;
  }

  public void setGender(String gender){
    this.gender = gender;
  }

  public String getGender(){
    return this.gender;
  }

  public void setFlightNum(String flightNum){
    this.flightNum = flightNum;
  }

  public String getFlightNum(){
    return this.flightNum;
  }

  public void setPriority(int priority){
    this.priority = priority;
  }

  public int getPriority(){
    return this.priority;
  }

  public String toString() {
    return "[" + trn + ", " + name + ", " + gender + ", " + flightNum + ", " + priority + "]";
  }
}   