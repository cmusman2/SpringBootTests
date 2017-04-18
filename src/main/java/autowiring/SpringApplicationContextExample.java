package autowiring;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationContextExample {
	
	 // @Autowired
	//  private List<Stageclass> stages;
	  
	  //@Autowired
	  //private Customer customer;
	  
	  
	  
	  
	public static void main (String[] args) throws IOException
	  {
		new SpringApplicationContextExample();
	  }

	  public SpringApplicationContextExample() throws IOException
	  {
	    // open/read the application context file
		  try
		  {
			 
			 // System.out.println(persons.size());
			  
			  //System.out.println(customer.getAction());
			  
	       ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
           List<String> myList = (List<String>) ctx.getBean("myList");
           
           for(String s:myList)
           {
        	   System.out.println(s);
           }
           
           
           List<Stageclass> stageList = (List<Stageclass>) ctx.getBean("stages");
           
           for(Stageclass s:stageList)
           {
        	   System.out.println(s.getDodle());
           }
           
            
           
           Customer customer = (Customer) ctx.getBean("CustomerBean");
            
           System.out.println(customer.getPerson().getName());
           
           
		  }catch(Exception exp)
		  {
			  System.out.println(exp);
		  }

	  }
}
