package compratorExample;
import java.util.*;
public class CompratorExample {

	public static void main(String[] args) {
		TreeSet<Student>obj=new TreeSet<Student>(new RnoComprator());
		obj.add(new Student(101,"Amar",25000));
		obj.add(new Student(108,"Nitin",12000));
		obj.add(new Student(99,"Nitesh",30000));
		obj.add(new Student(103,"Yogesh",8000));
		for(Student o:obj)
		{
			System.out.println(o.rno+","+o.sname+" ,"+o.fees);
		}
		

	}

}
