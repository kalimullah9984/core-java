import java.util.HashMap;
import java.util.Map;



public class Salman {
	

	public static void main(String[] args) {
	Map<Integer,Klaeem> mp=new HashMap<Integer,Klaeem>();
	Klaeem b1=new Klaeem(101,"Let us C","Yashwant Kanetkar","BPB",8);
	Klaeem b2=new Klaeem(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	Klaeem b3=new Klaeem(103,"Operating System","Galvin","Wiley",6);  
  mp.put(1, b1);
  mp.put(2, b2);
  mp.put(3, b3);
  for(Map.Entry<Integer, Klaeem> entry:mp.entrySet()) {
	int key=entry.getKey();
	Klaeem b=entry.getValue();
	System.out.println(key+" "+"Detail");
	System.out.println(b.id+" "+b.name+" "+b.auther+" "+b.publisher+" "+b.salary);
  }
	}


}
