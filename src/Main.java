import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	PrintProperties Properties=new PrintProperties();
    	
    	ArrayList<Apartment> apartments = new ArrayList<Apartment>();//creates arrays
        ArrayList<House> houses = new ArrayList<House>();                        
        ArrayList<Villa> villas = new ArrayList<Villa>();
        /*
          call to function FillinProperties then Print Properties
         */
        FillInProperties(apartments,houses,villas); 
        
        Properties.PrintProperty(apartments,houses,villas);
	}
	//fills in arrays with predetermined values
	public static void FillInProperties(ArrayList<Apartment> apartments,ArrayList<House> houses, ArrayList<Villa> villas ){
		apartments.add(new Apartment(2,3,40,0,"Sam Smith","Main Street, Mallow"));
		apartments.add(new Apartment(2,4,50,0,"John Williams","Chapel street, Kerry"));
		apartments.add(new Apartment(1,1,20,0,"Mason Thomas","1st Street, Dublin"));
		
		houses.add(new House(3,50,60,0,"Josh French","Fern House Offaly"));
        houses.add(new House(2,50,60,0,"Peter Parker","House 4, Hillview"));
        houses.add(new House(4,70,70,0,"Janet McLaren","Church Yard"));
        
        villas.add(new Villa(3,10,20,70,0,"George Orwell","Zambia"));
        villas.add(new Villa(4,15,20,60,0,"Anthony Horowitz","Sydney"));
        villas.add(new Villa(8,20,20,50,0,"Terry Pratchet","Discworld"));
	}
}
