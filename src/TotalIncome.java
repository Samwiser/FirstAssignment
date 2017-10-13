import java.util.ArrayList;
public class TotalIncome{
	// TODO Auto-generated method stub
	
public int TotallIncome(ArrayList<Apartment> apartments,ArrayList<House> houses, ArrayList<Villa> villas ){
    	int Income=0,i;
        for(i=0;i<apartments.size();i++)
        	Income+=apartments.get(i).GetNumDays()*apartments.get(i).GetRent();
        //finds income for apartment adds it to the total income
        
        for(i=0;i<houses.size();i++)
        	Income+=houses.get(i).GetNumDays()*houses.get(i).GetRent()+houses.get(i).GetClearingCost();
        //finds income for house adds it to the total income
        
        for(i=0;i<villas.size();i++)
        	Income+=(villas.get(i).GetNumDays()+villas.get(i).GetRoomServiceCost()+villas.get(i).GetTax())*villas.get(i).GetRent();
        //finds income for villa adds it to the total income
        return Income;
    }
}