import java.util.ArrayList;
import java.util.Scanner;

public class Input {

	private static boolean badValue=true;
	private static Scanner console=new Scanner(System.in);
	private static String userInput;
	private static String carryValue;
	
	
	private static ArrayList<String> DirectionInputs = new ArrayList<String>() {{
	    add("n");
	    add("north");
	    add("w");
	    add("west");
	    add("e");
	    add("east");
	    add("s");
	    add("south");
	}};
	private static ArrayList<String> BooleanNoInputs = new ArrayList<String>() {{
		add("n");
		add("no");
		add("naw");
		add("nope");
	}};
	
	private static ArrayList<String> BooleanYesInputs = new ArrayList<String>() {{
		add("y");
		add("yes");
		add("yeah");
		add("yee");
	}};
	
	private static ArrayList<String> ExamineAbles = new ArrayList<String>() {{
		
	}};
	
	private static ArrayList<String> Races = new ArrayList<String>() {{
		add("Dwarve");//Dwarves 
		add("Elf");//Elves
		add("Gnome");//Gnomes
		add("Half-Elf");//Half-elves
		add("Half-Orc");//Half-orcs
		add("Halfling");//Halflings
		add("Human");//Humans
		//add("");
	}};
	
	public Input(){
		ExamineAbles.sort(null);
	}
	
	public static String correctFor(String typeCheck,String errorCode,String playerMessage,boolean cancelReady,boolean askTwice){
		
		if(typeCheck.equals("@")){
			
			if(!playerMessage.equals("?")){
				System.out.println(playerMessage);
			}else{
				System.out.println("Please enter a string");
			}
			
			while(badValue==true){
				
				userInput=console.next();
				
				if(cancelReady==true&&userInput.equalsIgnoreCase("cancel")){
					carryValue="cancel";
					System.out.println("Cancelled");
					return userInput;
				}
				
				try{
					
					Integer.parseInt(userInput);
					if(errorCode.equals("?")){
					System.out.println("Please do not enter numbers");
					}else{
						System.out.println(errorCode);
					}
					
				}catch(Exception e){
					
					if(askTwice==true){
						System.out.println("string");
						
						if(correctFor("B","?","Are you sure you want to enter "+userInput,false,false).equals("true")){
							carryValue=userInput;
							return userInput;
						}
						
					}else{
						
					carryValue=userInput;
					return userInput;
					
					}
					
				}
			}
			
			badValue=false;
			
		}
		
        if(typeCheck.equals("#")){
        	if(!playerMessage.equals("?")){
				System.out.println(playerMessage);
			}else{
				System.out.println("Please enter a number");
			}
        	while(badValue==true){
        		userInput=console.next();
        		if(cancelReady==true&&userInput.equalsIgnoreCase("cancel")){
        			carryValue="cancel";
        			System.out.println("Cancelled");
					return userInput;
				}
				try{
					Integer.parseInt(userInput);
					if(askTwice=true&&correctFor("B","?",playerMessage,false,false).equals("true")){
					carryValue=userInput;
					return userInput;
					}
				}catch(Exception e){
					if(errorCode.equals("?")){
						System.out.println("Please enter a number");
						}else{
							System.out.println(errorCode);
						}	
				}
			}
        	badValue=false;
		}
		
        if(typeCheck.equals("B")){
        	
        	if(!playerMessage.equals("?")){
				System.out.println(playerMessage);
			}else{
				System.out.println("Please enter yes or no");
			}
        	
        	while(badValue==true){
        		
        		userInput=console.next();
        		console.nextLine();
        		
        		if(cancelReady==true&&userInput.equalsIgnoreCase("cancel")){
        			carryValue="cancel";
        			System.out.println("Cancelled");
					return userInput;
				}
					
					for(int i=0;i<BooleanYesInputs.size();i++){
					if(userInput.equalsIgnoreCase(BooleanYesInputs.get(i))){
						
						if(askTwice==true){
							System.out.println("bool");
						if(correctFor("B","?","Are you sure you want to enter "+userInput,false,false).equals("true")){
						carryValue="true";
						return "true";
						}
						}else{
							carryValue=userInput;
							return userInput;
							}
						
					}}
					
					for(int i=0;i<BooleanNoInputs.size();i++){
					if(userInput.equalsIgnoreCase(BooleanNoInputs.get(i))){
						
						if(askTwice==true){
							System.out.println("bool");
						if(correctFor("B","?","Are you sure you want to enter "+userInput,false,false).equals("true")){
						carryValue="false";
						return "false";
						}
						}else{
							carryValue=userInput;
							return userInput;
							}
						
					}}
					
					if(errorCode.equals("?")){
						
						System.out.println("Please enter yes or no");
						}else{
							System.out.println(errorCode);
						}
					
					System.out.println("UserInput: "+userInput);
					
			}
        	
        	badValue=false;
        	
		}
        
        if(typeCheck.equals("^")){
        	if(!playerMessage.equals("?")){
				System.out.println(playerMessage);
			}else{
				System.out.println("Please enter a direction");
			}
        	while(badValue==true){
        		userInput=console.next();
        		if(!userInput.equals("")){
        		if(cancelReady==true&&userInput.equalsIgnoreCase("cancel")){
        			carryValue="cancel";
        			System.out.println("Cancelled");
					return userInput;
				}
        		for(int i=0;i<DirectionInputs.size();i++){
				if(userInput.equalsIgnoreCase(DirectionInputs.get(i))){//
					if(askTwice=true){
					carryValue=DirectionInputs.get(i);
					return DirectionInputs.get(i);
					}else{
					carryValue=DirectionInputs.get(i);
					return DirectionInputs.get(i);
					}
				}}
        		if(errorCode.equals("?")){
					System.out.println("Please enter a direction");
					}else{
						System.out.println(errorCode);
				}
        	}
        	}
		}
        
        if(typeCheck.equals("E")){
        	if(!playerMessage.equals("?")){
				System.out.println(playerMessage);
			}else{
				System.out.println("Please enter a examinable");
			}
        	while(badValue==true){
        		userInput=console.nextLine();
        		if(!userInput.equals("")){
        		if(cancelReady==true&&userInput.equalsIgnoreCase("cancel")){
        			carryValue="cancel";
        			System.out.println("Cancelled");
					return userInput;
				}
        		for(int i=0;i<ExamineAbles.size();i++){
				if(userInput.equalsIgnoreCase(ExamineAbles.get(i))){//
					if(askTwice=true){
						
					carryValue=ExamineAbles.get(i);
					return ExamineAbles.get(i);
					}else{
						carryValue=ExamineAbles.get(i);
						return ExamineAbles.get(i);
					}
				}}
        		if(errorCode.equals("?")){
					System.out.println("Please enter a valid thing to examine");
					}else{
						System.out.println(errorCode);
				}
        	}
			}
		}
        
        if(typeCheck.equals("R")){
        	if(!playerMessage.equals("?")){
				System.out.println(playerMessage);
			}else{
				System.out.println("Please enter a race");
			}
        	while(badValue==true){
        		userInput=console.nextLine();
        		if(!userInput.equals("")){
        		if(cancelReady==true&&userInput.equalsIgnoreCase("cancel")){
        			carryValue="cancel";
        			System.out.println("Cancelled");
					return userInput;
				}
        		for(int i=0;i<Races.size();i++){
        			if(userInput.equalsIgnoreCase(Races.get(i))){//
        				if(askTwice=true){
    					carryValue=Races.get(i);
    					return Races.get(i);
        				}else{
        					carryValue=Races.get(i);
        					return Races.get(i);
        				}
        				}}
        		if(errorCode.equals("?")){
					System.out.println("Please enter a race");
					}else{
						System.out.println(errorCode);
				}
        	}
			}
		}
        
        return "Error correcting type invalid";
	}
	
	public static String correctFor(int a,int b,String errorCode,boolean cancelReady){
        	while(badValue==true){
        		userInput=console.next();
        		if(cancelReady==true&&userInput.equalsIgnoreCase("cancel")){
        			carryValue="cancel";
        			System.out.println("Cancelled");
					return userInput;
				}
				try{
					if(Integer.parseInt(userInput)>=a&&Integer.parseInt(userInput)<=b){
						carryValue=userInput;
						return userInput;
					}else{
						System.out.println("That number isn't between "+a+" and "+b);
					}
				}catch(Exception e){
					if(errorCode.equals("?")){
						System.out.println("Please enter a number");
						}else{
							System.out.println(errorCode);
						}
					
				}
			}
        	badValue=false;
        	return "If you're seeing this you've done something wrong";
	}
	
	public static String getCarryValue(){
		return carryValue;
	}
	
	public static void setCarryValue(){
		carryValue="north";
	}
	
	public static void clearCarryValue(){
		carryValue="cleared";
	}
	
	public static void forcedCancel(){
		carryValue="cancel";
	}
	
	public void printExamineAbles(){
		for(int i=0;i<ExamineAbles.size();i++){
			System.out.println(ExamineAbles.get(i));
		}
	}
	
}
