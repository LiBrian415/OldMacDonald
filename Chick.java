class Chick implements Animal 
{     
	private String myType;
	private String mySound;
	private String mySound2;
	public Chick(String type, String sound, String sound2)
	{
		myType = type;
		mySound = sound;
		mySound2 = sound2;
	}  
	public Chick()
	{
		 myType = "unknown";         
   		 mySound = "unknown";
   		 mySound2 = "unknown";
	}
	public String getType(){return myType;}
	public String getSound(){if (Math.random()<.5) return mySound; else return mySound2;}  //your code here
}