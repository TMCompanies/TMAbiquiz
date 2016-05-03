package model;

public enum Subject
{
	mathe("mathe", 0), deutsch("deutsch", 1), englisch("englisch", 2), franzoesisch("franzoesisch", 3), spanisch("spanisch", 4), biologie("biologie", 5), chemie("chemie", 6),
	physik("physik", 7), informatik("informatik", 8), geographie("geographie", 9), wirtschaft_und_recht("wirtschaft_und_recht", 10), religion_rk("religion_rk", 11), 
	religion_ev("religion_ev", 12),	ethik("ethik", 13), geschichte("geschichte", 14), sozialkunde("sozialkunde", 15);
	
	private String text;
	private int id;
	
	private Subject(String text, int id)
	{
		this.text = text;
		this.id = id;
	}
	
	public String toString()
	{
		return text;
	}
	
	public static Subject fromString(String text)
	{
		if(text==null)
			return null;
		
		for(Subject s : Subject.values())
		{
			if(s.text.equals(text))
				return s;
		}
	
		return null;
	}
	
	public int toId()
	{
		return id;
	}
	
	public static Subject fromId(int id)
	{	
		for(Subject s : Subject.values())
		{
			if(s.id == id)
				return s;
		}
		
		return null;
	}
}
