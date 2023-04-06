package _0404_stream;

public class Student {
	//필드
	private int sno;
	private String sName; 
	private int score; 
	private String grade;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	//3번 문제 위해 toString 만들기
	//없을 경우 주소값만 나오게 됨 
	public String toString() {
		return "Student [sno=" + sno + ", sName=" + sName + ", score=" + score + ", grade=" + grade + "]";
	}
	public Student (int sno, String sName, int score) {
		this.sno = sno;
		this.sName = sName;
		this.score = score;
		
	}
	
}
