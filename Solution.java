import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    ToastMasters[] t = new ToastMasters[5];        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<t.length;i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String location = sc.nextLine();
            String type = sc.nextLine();
            int NoOfEvents = sc.nextInt();
            int NoOfYears =  sc.nextInt();
            t[i] = new ToastMasters(id,location,type,NoOfEvents,NoOfYears);
        }
        sc.nextLine();
        String loc = sc.nextLine();
        System.out.println("Total Count of "+loc+" : "+specificLocationCount(t,loc));
        ToastMasters t1[] = updateType(t);    
        for(int i=0;i<t1.length;i++)
            System.out.println(t1[i].getId()+"  "+t1[i].getLocation()+"  "+t1[i].getType());
    }
    
    public static int specificLocationCount(ToastMasters[] t,String loc)
    {
        int i, count =0;
        for(i=0; i<t.length; i++)
        {
        	if(t[i].getNoOfEvents()>10 && t[i].getLocation().equalsIgnoreCase(loc))
        	{
        		count++;
        	}
        }
        return count;
    }
    
    public static ToastMasters[] updateType(ToastMasters[] t)
    {
        int count=0;
        for(int i=0;i<t.length;i++)
        {
        	if(t[i].getType().equalsIgnoreCase("member") && t[1].getNoOfEvents()>8 && t[i].getNoOfYears()>3)
        	{
        		count++;
        	}
        }
        	int j=0;
        	ToastMasters[] t1 = new ToastMasters[count];
        	for(int i=0; i<t.length; i++)
        	{
        		if(t[i].getType().equalsIgnoreCase("member") && t[1].getNoOfEvents()>8 && t[i].getNoOfYears()>3)
        		{
        			t1[j] =t[i];
        			j++;
        			t[i].setType("Host");
        		}
        	}
        	
  return t1;
        }		
}


class ToastMasters
{
    private int id;
    private String location;
    private String type;
    private int NoOfEvents;
    private int NoOfYears;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNoOfEvents() {
		return NoOfEvents;
	}
	public void setNoOfEvents(int noOfEvents) {
		NoOfEvents = noOfEvents;
	}
	public int getNoOfYears() {
		return NoOfYears;
	}
	public void setNoOfYears(int noOfYears) {
		NoOfYears = noOfYears;
	}
	public ToastMasters(int id, String location, String type, int noOfEvents, int noOfYears) 
	{
		super();
		this.id = id;
		this.location = location;
		this.type = type;
		NoOfEvents = noOfEvents;
		NoOfYears = noOfYears;
	}
    

}