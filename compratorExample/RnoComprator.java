package compratorExample;
import java.util.*;
public class RnoComprator implements Comparator<Student>{
	@Override
	public int compare(Student s1,Student s2)
	{
		if(s1.rno>s2.rno)
			return 1;
		else if(s1.rno<s2.rno)
			return -1;
		else
			return 0;
	}
}
