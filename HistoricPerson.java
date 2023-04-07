package _0406_homework;

public class HistoricPerson { //HistoicPerson 클래스 만들기
	private String name;  
	private String achievement; 
	private String country;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAchievement() {
		return achievement;
	}
	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getPersonInfo(String achievement) {
		return "업적에 해당하는 인물 : [" + "이름 : " + name + ", 나라 : " + country + "]";
	}
	
	public String toString() {
		return " [이름 =" + name + ", 업적=" + achievement + ", 나라 =" + country + "]";
	}
	
	public HistoricPerson ( String name, String achievement, String country) {
		this.achievement = achievement;
		this.country = country;
		this.name = name;
	}
	
	
	
}
