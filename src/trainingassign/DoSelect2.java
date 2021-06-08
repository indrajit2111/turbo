package trainingassign;
import java.util.*;
class Activity{
	   public String string1;
	  public String string2;
	  public String operator;
	  public Activity(String str,String str1,String op)
	  {
	    this.string1=str;
	    this.string2=str1;
	    this.operator=op;
	  }

	  //Implement Activity class here..
	}



	class Source {
	  public String handleException(Activity a)
	  {
	    try
	    {
	      if(a.string1==null || a.string2==null)
	      {
	        throw new  NullPointerException("Null values found");
	      }
	      else if(a.operator!="+" && a.operator!="-")
	      {
	        throw new Exception("is not a valid operator");
	      }
	      else 
	      {
	        return ("No Exception Found");
	      }
	    }
	    catch (NullPointerException npe)
	    {
	      return(npe.getMessage());
	    }
	    catch (Exception e)
	    {
	      return(a.operator+" "+e.getMessage());
	    }
	  }

	  public String doOperation(Activity a)
	  {
	    switch(a.operator)
	    {
	      case "+": return a.string1+a.string2;
	      //break;
	      case "-": return(a.string1.replace(a.string2,""));
	     // break;
	      default: return "none matched";
	      
	    }
	  }
	  


public class DoSelect2 {

}}
