package compratorExample;

public class Student1 implements Comparable<Student1> {
	 int rno;
	 String name;
	 int fee;
	public Student1(int rno, String name, int fee) {
		
		this.rno = rno;
		this.name = name;
		this.fee = fee;
	}
	public int compareTo(Student1 o)
	{
		if(o.fee>fee)
			return 1;
		else if(o.fee<fee)
			return -1;
		else
		return 0;
		
	}
}
