import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PrintProperties {
	// TODO Auto-generated method stub
	TotalIncome Income=new TotalIncome();
	
	public  void PrintProperty(ArrayList<Apartment> apartments,ArrayList<House> houses, ArrayList<Villa> villas ){
		int i;
		/*
		  creates a JOptionpane thats asks what property you want to view using a three button interface
		 */
    	Object[] options = {"Apartments",
                "House",
                "Villa"};
    		int n = JOptionPane.showOptionDialog(null,"Which Property Type do you want to see ",
    							"MyBnB",
    							JOptionPane.YES_NO_CANCEL_OPTION,
    							JOptionPane.QUESTION_MESSAGE,
    							null,
    							options,
    							options[2]); 
    		
    		if (n == JOptionPane.YES_OPTION){
    			//creates a frame layout and size for the frame allows multiple JOptionpanes to be viewed on one window
    			JFrame frame = new JFrame("MyBnB");
    	    	frame.setLayout(new GridLayout(20, 0));
    	    	frame.setSize(1000, 700);
    			
    			frame.getContentPane().add(new JOptionPane("Apartments:"));//adds a new JOptionpane to the frame
    	    	frame.getContentPane().add(new JOptionPane("Register No       Owner               Address                    Number of Days rented        Cost        StoreyNumber    Number of beds"));
    	    	
    	    	
    	    	
    	    	for(i=0;i<apartments.size();i++){
    	    		/*
    	    		  gets all the information needed to be printed each property is placed on a new JoptionPane inside the frame
    	    		 */
    	        frame.getContentPane().add(new JOptionPane(("     "+apartments.get(i).GetRegNum()+"           "+apartments.get(i).GetOwnerName()+"        "+apartments.get(i).GetAddress()+"                 "+apartments.get(i).GetNumDays()+"                                 "+apartments.get(i).GetRent()+"                              "+apartments.get(i).GetNumStoreys()+"                            "+apartments.get(i).GetNumBeds())));
    	    	}
    	        frame.getContentPane().add(new JOptionPane("Income:   €" +Income.TotallIncome(apartments,houses,villas)));
    	    	frame.setVisible(true);
    	    	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
    		}
    		//same as previous one just for Villas
    		if(n == JOptionPane.NO_OPTION){
    			JFrame frame = new JFrame("MyBnB");
    	    	frame.setLayout(new GridLayout(20, 0));
    	    	frame.setSize(1000, 700);
    	    	
    			frame.getContentPane().add(new JOptionPane("Houses:"));
    	    	frame.getContentPane().add(new JOptionPane("Register No      Owner              Address                     Number of Days rented       Cost      Number of Stories      Clearance")); 
    	      
    	        for(i=0;i<houses.size();i++){
    	        	frame.getContentPane().add(new JOptionPane("     "+houses.get(i).GetRegNum()+"              "+houses.get(i).GetOwnerName()+"           "+houses.get(i).GetAddress()+"                         "+houses.get(i).GetNumDays()+"                           "+houses.get(i).GetRent()+"                          "+houses.get(i).GetTotalNumStoreys()+"                     "+houses.get(i).GetClearingCost()));
    	        }
    	        frame.getContentPane().add(new JOptionPane("Total Income for all properties:   €" +Income.TotallIncome(apartments,houses,villas)));
    	        	frame.setVisible(true);
    	        	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    		}
    		//same as previous one just for Houses
    		if(n == JOptionPane.CANCEL_OPTION){
    			JFrame frame = new JFrame("MyBnB");
    	    	frame.setLayout(new GridLayout(20, 0));
    	    	frame.setSize(1000, 700);
    	    	
    			frame.getContentPane().add(new JOptionPane("Villas:"));
    	    	frame.getContentPane().add(new JOptionPane("Register No      Owner            Address                      Number of Days rented      Cost         Number of Stories     Number of Rooms             Tax per day"));
    	    	       
    	        for(i=0;i<villas.size();i++){
    	        	frame.getContentPane().add(new JOptionPane("     "+villas.get(i).GetRegNum()+"              "+villas.get(i).GetOwnerName()+"           "+villas.get(i).GetAddress()+"                             "+villas.get(i).GetNumDays()+"                             "+villas.get(i).GetRent()+"                            "+villas.get(i).GetNumRooms()+"                                    "+villas.get(i).GetRoomServiceCost()+"                    	                 "+villas.get(i).GetTax()));
    	        }
    	        frame.getContentPane().add(new JOptionPane("Income:   €" +Income.TotallIncome(apartments,houses,villas)));
    	        	frame.setVisible(true);
    	        	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    		}
    		
    	  
    }    
	}
	
