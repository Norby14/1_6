import java.util.*;
import java.util.Scanner;
class Main 
{
  public static void main(String[] args)
	{
    System.out.println("Wpisz liczbe");
		Scanner scan = new Scanner(System.in);
		int liczba;
		boolean result = true;
		liczba = scan.nextInt();
		for(int i=2; i<=liczba/2; i++)
          {
						 if(liczba<2)
          {
              result = true;
          }
              else if (liczba%i==0)
              {
                  result = false;
                  break; // bo po co sprawdzać dalej - lepiej przerwac petle
              }
          }
           
          System.out.println("Liczba " + liczba + " " + (result == true ? "jest" : "nie jest") + " liczbą pierwszą");
  }
}
    
  


