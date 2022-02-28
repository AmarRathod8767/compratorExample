package compratorExample;

import java.util.Comparator;

public class FeesCopratorEx implements Comparator<Student> {
	@Override
	public int compare(Student s1,Student s2)
	{
	  if(s1.fees>s2.fees)
		  return 1;
	  else if(s1.fees<s2.fees)
		  return -1;
	  else
		  return 0;
	}

}
