package SoftwareAssignment1.SoftwareAssignment1;
import java.util.ArrayList;

import SoftwareAssignment1.SoftwareAssignment1.student;

public class module {

	private String modName;
	private String modID;
	private ArrayList<student> stud= new ArrayList<student>();
	
	public module(String modName,String ID){
		this.modName=modName;
		this.modID=ID;
		stud= new ArrayList<student>();
	}
	public String getName(String modName){
		return modName;
	}
	public String getID( String modID){
		return modID;
	}
	public void regStudent( student S){
		stud.add(S);
	} 
}