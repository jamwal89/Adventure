
import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter your Adventure  \n");
		Scanner ad = new Scanner(System.in);
		String adventure = ad.nextLine();


		String pageFirst = "";
		String pageSecond = "";
		String pageThird = "";
		String pageFourth = "";
		
		if (adventure .equals("Kitchen")) 

		{
			System.out.println("You may want to look in the referigator or the cabinet \n");
			pageFirst= ad.nextLine();

			if (pageFirst .equalsIgnoreCase("Referigator"))
				System.out.println("Do you want to Eat Food");
			pageSecond = ad.nextLine();
			if (pageSecond .equalsIgnoreCase("No")){
				System.out.println("You will eventually die of Starvation");
			}
			else if (pageSecond .equalsIgnoreCase("yes")){
				System.out.println("We have cake and Pizza. Choose your Dish \n");
				pageThird = ad.nextLine();
				if (pageThird .equalsIgnoreCase("Pizza")){
					System.out.println("Pepperoni or Cheese \n");
					pageFourth= ad.nextLine();
					if (pageFourth .equalsIgnoreCase("Pepperoni")){
						System.out.println("Wrong Choice, you are in trouble");
					}
					else if  (pageFourth .equalsIgnoreCase("Cheese \n")) {
						System.out.println("Good Choice , your in for the next level");
					}
				}


			}
			else if (pageThird .equalsIgnoreCase("Cake")){
				System.out.println("Choose your Cake from Chocolate or Vanilla");
				pageFourth = ad.next();
				if (pageFourth .equalsIgnoreCase("Vanilla")) {
					System.out.println("You are in for a game");
				}
				else if ( pageFourth .equalsIgnoreCase("Chocolate")) {
					System.out.println("Thats poisoned, you lost a life");;
				}
			}


		}

		else if (pageFirst .equalsIgnoreCase("Cabinet"))
			System.out.println("");



	

	else if ( adventure .equalsIgnoreCase("Upstairs")){

		System.out.println("Do you want to enter the bedroom or the bedroom at the end of the hallway");
		 pageFirst =ad.nextLine();

		if (pageFirst .equalsIgnoreCase("Bedroom")){
			System.out.println("ooo you are in with the Alien , Fight him and win");
		}
			else if (pageFirst .equalsIgnoreCase("Hallway Bedroom")){
				System.out.println("You got the Evil Beast, Runn for life");
			}

		}	
	}



}


