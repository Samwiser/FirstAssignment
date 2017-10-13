public class Apartment extends Property{//uses the contents of Property class
	// TODO Auto-generated method stub
	/*
	 This class has contents of class Apartment
	 */
	int NumStorey;
	int NumBeds;
	
    /*
      Constructor for the Apartment class.
     */
	public Apartment(int NumStoreys, int NumBeds, int Rent, int NumDays, String OwnerName, String Address) {
		super(Rent, NumDays, OwnerName, Address);
		this.NumStorey = NumStoreys;
        this.NumBeds=NumBeds;
    }
	/*
	  Mutator
	 */
	public void SetNumStoreys(int NumberofStoreys){
		NumStorey = NumberofStoreys;
	}
	public void SetNumBeds(int Beds){
		NumBeds = Beds;
	}
	/*
	  Accessors
	 */
	public int GetNumStoreys(){
		return NumStorey;
	}
	public int GetNumBeds(){
		return NumBeds;
	}
}