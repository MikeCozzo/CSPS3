import java.util.ArrayList;


public class MusicalInstrument {
	private String name;
	private String type;
	private int numberOfKeysorStrings;
	private double prices;
	final int max = 10;
	String a = "bass";
	String b = "string";
	String c = "percussion";
	String d = "keyboard";
	String e = "woodwind";
	String f = "hsr";
	String g = "jndf";
	String h = "khr";
	String j = "grd";
	String k = "nw";
	


	
	final String UNKNOWNNAME = "UNKNOWNNAME";
	final String UNKNOWNTYPE = "UNKNOWNTYPE";
	final int UNKNOWNKEYSORSTRINGS = -1;
	final int UNKNOWNPRICE = -9;
	final int LOWERKEYSORSTRINGS = -1;
	final double LOWERPRICE = 1;
	
	
	
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public int getNumberofKeysorStrings() {
		return numberOfKeysorStrings;
	}
	public double getprices() {
		return prices;
	}
	
	public void setName(String name) {
	if (name.equals(null))
		this.name = UNKNOWNNAME;
	else if (name.equals(""))
		this.name = UNKNOWNNAME;
	else {
		this.name = name;
	}}
	
	public void setType(String type) {
		String NewAry[] = {"brass", "woodwind", "string", "percussion", "keyboard"};
		String t = type.toLowerCase();
		int len = NewAry.length;

		for (int search=0; search<=len; search++){
			if (NewAry[search].contains(t)){
				this.type = type;
			}
			else {
				this.type = "UNKNOWNTYPE";
			}
		}
	//	if (type.equals("brass")) {
	//	this.type = type;
	///	}else if (type.equals("woodwind")) {
	//	this.type = type;
	//}else if (type.equals("string")) {
///		this.type = type;
//	}else if (type.equals("percussion")) {
//		this.type = type;
//	}else if (type.equals("keyboard")) {
//		this.type = type;
	//}else {
	//	this.type = "UNKNOWNTYPE";
	}
	public void setnumberOfKeysorStrings(int number) {
		if (number > 100)
			this.numberOfKeysorStrings = UNKNOWNKEYSORSTRINGS;
		else if (number < 0)
			this.numberOfKeysorStrings = UNKNOWNKEYSORSTRINGS;
		else {
			this.numberOfKeysorStrings = number;
		}}
	
	public void setprice(int price) {
		if (price <= 0)
			this.prices = UNKNOWNPRICE;
		else if (price > 0)
			this.prices = price;
		else {
			this.prices = price;
		}}
		
	//public void setType(String type) {
	//	 this.type = type;
	//}
//	public void setNumberOfKeysorStrings(int numberOfKeysorStrings) {
	//	this.numberOfKeysorStrings = numberOfKeysorStrings;
	//}
	public MusicalInstrument() {
		getName();
		getType();
		getNumberofKeysorStrings();
		//setType(UNKNOWNTYPE);
		setName(UNKNOWNNAME);
		setnumberOfKeysorStrings(101);
	}
	public MusicalInstrument(String name, String type, int numberOfKeysorStrings) {
		this.type = type;
		this.name = name;
		this.numberOfKeysorStrings = numberOfKeysorStrings;
	}
	public MusicalInstrument(double lowerprice, int lowerkey) {
		this.prices = lowerprice;
		this.numberOfKeysorStrings = lowerkey;
		
	}

	
	public MusicalInstrument(String name, String type, int numberOfKeysorStrings, double lowerprice) {
		this.type = type;
		type = type.toLowerCase();
		this.name = name;
		name = name.toLowerCase();
		this.numberOfKeysorStrings = numberOfKeysorStrings;
		this.prices = lowerprice;
		
	}
	public MusicalInstrument mia[] = new MusicalInstrument [max];
	int fewest = Integer.MAX_VALUE;{
	for (MusicalInstrument mi : mia) {
		int keysorstrings = mi.getNumberofKeysorStrings();
		if (keysorstrings < fewest);
		fewest = keysorstrings;
		MusicalInstrument mi1 = new MusicalInstrument("guitar", "string", 6, 49.00);
		MusicalInstrument mi2 = new MusicalInstrument ("piano", "keys", 26, 100.00);
		MusicalInstrument mi3 = new MusicalInstrument ("flute", "woodwind", 0, 20.00);
		MusicalInstrument mi4 = new MusicalInstrument ("drums", "percussion", 0, 50.00);
		MusicalInstrument mi5 = new MusicalInstrument ("tuba", "brass", 0, 75.00);
		MusicalInstrument mi6 = new MusicalInstrument ("flute", "woodwind", 0, 20.00);
		MusicalInstrument mi7 = new MusicalInstrument ("flute", "woodwind", 0, 20.00);
		MusicalInstrument mi8 = new MusicalInstrument ("flute", "woodwind", 0, 20.00);
		MusicalInstrument mi9 = new MusicalInstrument ("flute", "woodwind", 0, 20.00);
		MusicalInstrument mi10 = new MusicalInstrument ("flute", "woodwind", 0, 20.00);
		
		mia[0] = mi1;
		mia[1] = mi2;
		mia[2] = mi3;
		mia[3] = mi4;
		mia[4] = mi5;
		mia[5] = mi6;
		mia[6] = mi7;
		mia[7] = mi8;
		mia[8] = mi9;
		mia[9] = mi10;
		
		for (int oh = 0; oh <= mia[]; i++) {
			
		}
		    }}
	
	//public String getName() {
//	//	return name;
//	}
	//public void setName(String name) {
//		this.name = name;
//	}
	//public String getType() {
	//	return "nfakn";
	//}
	//public void setType(String type) {
	//	this.type = type;
	//}
	//public int getNumberOfKeysorStrings() 
	//{
	//	return numberOfKeysorStrings;
	//}
//	public void setNumberOfKeysorStrings(int numberOfKeysorStrings) {
		//this.numberOfKeysorStrings = numberOfKeysorStrings;
//		MusicalInstrument myObj = new MusicalInstrument();
	}
