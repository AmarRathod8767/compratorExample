package compratorExample;

import java.util.TreeSet;

public class ComparableExam {

	public static void main(String[] args) {
		TreeSet<Student1>obj=new TreeSet<Student1>();
		obj.add(new Student1(101,"dff1",25000));
		obj.add(new Student1(103,"dff2",2500));
		obj.add(new Student1(99,"dff3",250000));
		obj.add(new Student1(105,"dff4",30000));
		for(Student1 s:obj)
		{
          System.out.println("Roll no "+s.rno+" Name "+s.name+" fees "+s.fee);
		}

	}

}
