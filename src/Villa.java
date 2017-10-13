public class Villa extends Property{
	// TODO Auto-generated method stub
	/*
	 This class contains the contents of class Villa
	*/
	int NumRooms;
	int RoomServiceCost;
	int Tax;
	
    /*
      Constructor for the Villa class, that takes seven parameters.
     */
	public Villa(int NumRooms, int RoomServiceCost, int Tax, int Rent, int NumDays, String OwnerName, String Address) {
		super(Rent, NumDays, OwnerName, Address);
		this.NumRooms = NumRooms;
        this.RoomServiceCost=RoomServiceCost;
        this.Tax=Tax;
    }
	/*
	  Mutators that do nothing
	 */
	public void SetNumRooms(int Rooms){
		NumRooms = Rooms;
	}
	public void SetName(int RoomService){
		RoomServiceCost = RoomService;
	}
	public void Tax(int DailyTax){
		Tax = DailyTax;
	}
	/*
	  Accessors
	 */
	public int GetNumRooms(){
		return NumRooms;
	}
	public int GetRoomServiceCost(){
		return RoomServiceCost;
	}
	public int GetTax(){
		return Tax;
	}
}