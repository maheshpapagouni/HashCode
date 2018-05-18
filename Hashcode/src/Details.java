import java.util.HashMap;
import java.util.Map;

// Driver code
class GFG 
{
	public static void main (String[] args) 
	{
		
		// creating two Objects with 
		// same state
		Student student1 = new Student("Mahesh", 01);
		Student student2 = new Student("Michel", 02);
		
		Map<Student, String> map = new HashMap<Student, String>();
		map.put(student1, "Hyderabad");
		map.put(student2, "NewYork");
		
		for(Student geek : map.keySet())
		{
			System.out.println(map.get(geek).toString());
		}

	}
}
