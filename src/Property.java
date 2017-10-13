import javax.swing.JOptionPane;
public class Property {
	// TODO Auto-generated method stub
	/*
	This class contains the contents of a Property class
	*/
    static int counter;
	int RegNum;
	String OwnerName;
	String Address;
	int Rent;
	int NumDays;
	
    /*
     Constructor for the Property class
     */
	public Property( int Rent, int NumDays, String OwnerName, String Address) {
        this.RegNum=counter++;
		this.Rent = Rent;
        this.NumDays= SetDays(NumDays);
        this.OwnerName=OwnerName;
        this.Address=Address;
    }
	/*
	  Mutators
	 */
	public void SetRegNum(int Reg){
		RegNum = Reg;
	}
	public void SetName(String Name){
		OwnerName = Name;
	}
	public void SetAddress(String Location){
		Address = Location;
	}
	public void SetRent(int Amount){
		Rent = Amount;
	}
	public int SetDays(int Days){//asks user to input days for each property
		int i;
		for(i=0; i<3; i++){
		String firstNumber = JOptionPane.showInputDialog(null,"Number of Days for Register Number " +RegNum, "Number of Days", 
		        JOptionPane.QUESTION_MESSAGE);

        NumDays += Integer.parseInt(firstNumber);
		}
        return NumDays;
	}
	/*
	  Accessors
	 */
	public int GetRegNum(){
		return RegNum;
	}
	public int GetNumDays(){
		return NumDays;
	}
	public int GetRent(){
		return Rent;
	}
	public String GetOwnerName(){
		return OwnerName;
	}
	public String GetAddress(){
		return Address;
	}
}