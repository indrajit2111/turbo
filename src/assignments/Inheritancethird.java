package assignments;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.time.Year;
public class Inheritancethird{


	public static void main(String[] args) {
 

		Book b=new Book(1001,"abc",40);
		b.additem(6);
		System.out.println(b.getCopies());

	}

}
abstract  class item
{
	private int idno;
	private String title;
	private int copies;
	public item(int idno, String title, int copies) {
		
		this.idno = idno;
		this.title = title;
		this.copies = copies;
	}
	
abstract public void additem(int x);

 public String toString() 
{
	return "ID no:"+idno+"Title:"+title+"Copies:"+copies;
} 
 public void checkin() 
 {
	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();  
	   System.out.println(dtf.format(now)); 
 }
  public void checkout() 
  {
	  System.out.println("2021-02-5");
  }
  


public int getIdno() {
	return idno;
}


public void setIdno(int idno) {
	this.idno = idno;
}


public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}


public  int getCopies() {
	return copies;
}


public void setCopies(int copies) {
	this.copies = copies;
}
 
	 
}

abstract class writtenItem extends item
{

	private String author;
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public writtenItem(int idno, String title, int copies) {
		super(idno, title, copies);
		
	
	
		
}

}
	
class Book extends writtenItem
{
	
	public Book(int idno, String title, int copies) {
		super(idno, title, copies);
		
		
	}
	
		 public void additem(int c) 
		 {
			 int a=getCopies();
			 setCopies(a+c);
		
		 }
}

class JournalPaper extends writtenItem
{

	private Year date;
	public JournalPaper(int idno, String title, int copies,int date) 
	{
		super(idno, title, copies);
		this.date=Year.of(date);
		
	}
	public Year getDate() {
		return date;
	}
	public void setDate(Year date) {
		this.date = date;
	}
	
	//considering the logic that Journal 1 and Journal 2 together are considered as a single piece
	 public   void additem(int c) 
	 {
		 if(c%2==0) 
		 {
		 int a=getCopies();
		 setCopies(a+1);
		 }
	}
	
}


 abstract class Mediaitem
 {
	 
	 private int idno;
		private String title;
		private int copies;
		private int runtime;
		
		public Mediaitem(int idno, String title, int copies, int runtime) {
			super();
			this.idno = idno;
			this.title = title;
			this.copies = copies;
			this.runtime = runtime;
		}
		public int getIdno() {
			return idno;
		}
		public void setIdno(int idno) {
			this.idno = idno;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getCopies() {
			return copies;
		}
		public void setCopies(int copies) {
			this.copies = copies;
		}
		public int getRuntime() {
			return runtime;
		}
		public void setRuntime(int runtime) {
			this.runtime = runtime;
		}
		
		abstract void addElem(int x);
 }	
	 
 class video extends Mediaitem
 {

	 private String director;
	 private String genre;
	 private int year;
	 
	

	public video(int idno, String title, int copies, int runtime,String director,String genere,int year) {
		super(idno, title, copies, runtime);
		// TODO Auto-generated constructor stub
		this.director=director;
		this.genre=genre;
		this.year=year;
	}



	public String getDirector() {
		return director;
	}



	public void setDirector(String director) {
		this.director = director;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	@Override
	void addElem(int x) {
		// TODO Auto-generated method stub
		 int a=getCopies();
		 setCopies(a+x);
		
	}
	 
 }
 
 class Cd extends Mediaitem
 {
	 private String artist;
	 private String genre;
	 
	 public Cd(int idno, String title, int copies, int runtime,String artist,String genre) {
			super(idno, title, copies, runtime);
			this.artist=artist;
			this.genre=genre;
			// TODO Auto-generated constructor stub
		} 
	@Override
	void addElem(int x)
	{
		// TODO Auto-generated method stub
		if(x%2==0)
		{
			int a=getCopies();
			 setCopies(a+x);
		}
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
 }