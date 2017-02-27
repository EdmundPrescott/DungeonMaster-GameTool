import java.util.ArrayList;

public class Group {
	private ArrayList<ArrayList> Groups = new ArrayList<ArrayList>();
	private String hold;
	private int Hold;
	
	public Group(){
	 this.Groups.add(new ArrayList<String>());
	 this.Groups.get(0).add("Group 1");
	}
	
	public void addToGroup(String x,int y){
		this.Groups.get(y).add(x);
		
	}
	
	public void addGroup(){
		this.Groups.add(new ArrayList<String>());
		this.Groups.get(this.Groups.size()-1).add("Group "+(Integer.parseInt(((String) this.Groups.get(this.Groups.size()-2).get(0)).substring(6))+1));
		
		
	}
	
	public void printGroups(){
		for(int i=0;i<this.Groups.size();i++){
			//System.out.println("Group "+(i+1)+":");
			for(int j=0;j<this.Groups.get(i).size();j++){
				System.out.println(this.Groups.get(i).get(j));
			}
		}
	}
	
	public void printGroup(int x){
		for(int i=0;i<this.Groups.get(x).size();i++){
			System.out.println(this.Groups.get(x).get(i));
		}
	}
	
	public boolean groupContains(String x, int y){
			if(this.Groups.get(y).contains(x)==true){
				return true;
			}else{
				return false;
			}
		
	}
	
	public int getNumberOfGroups(){
		return this.Groups.size();
	}
	
}