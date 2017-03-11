package yazilimGelistirme.com.medipol.odev1;


public class App 
{
    public static void main( String[] args )
    {
    	
    	float chamber = new Chamber().chamber(6, 2);

		System.out.println( "Result : " + (chamber == 3) );
    }
}
