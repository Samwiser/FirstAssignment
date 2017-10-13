public class House extends Property{
	// TODO Auto-generated method stub
	/*
	This class contains the contents of a House
	*/
	int TotalNumStoreys;
	int ClearingCost;
	
    /*
     Constructor for the House class
     */
	public House(int TotalNumStoreys, int ClearingCost, int Rent, int NumDays, String OwnerName, String Address) {
		super(Rent, NumDays, OwnerName, Address);
		this.TotalNumStoreys = TotalNumStoreys;
        this.ClearingCost=ClearingCost;
    }
	/*
	  Mutators
	 */
	public void SetTotalNumStoreys(int Storeys){
		TotalNumStoreys = Storeys;
	}
	public void SetClearingCost(int Clearing){
		ClearingCost = Clearing;
	}
	/*
	 Accessors
	 */
	public int GetTotalNumStoreys(){
		return TotalNumStoreys;
	}
	public int GetClearingCost(){
		return ClearingCost;
	}
}