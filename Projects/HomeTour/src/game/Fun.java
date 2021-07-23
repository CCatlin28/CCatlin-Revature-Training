package game;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Fun {

	 public void doSomething() {
		 Player p = new Player();
		 List<String> funList = new ArrayList<>();
			  funList.add("Read a Book.");
			  funList.add("Schedule a Spa Day.");
			  funList.add("Plan a picnic at the park.");
			  funList.add("Call a Friend.");
			  funList.add("Call a Family Member.");
			  Fun obj = new Fun();
	 	        System.out.println(obj.getRandomElement(funList));
	 	        p.Instructions();
	       
	    }

	    public String getRandomElement(List<String> funList)
	    {
	        Random rand = new Random();
	        return funList.get(rand.nextInt(funList.size()));
	    }
	
}
