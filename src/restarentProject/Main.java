package restarentProject;

import java.util.Scanner;

public class Main {
	public static Scanner input= new Scanner(System.in);
	public static int choice,Quantity=1;
	public static String again;
	public static double total=0,pay;
	public static void menu()
	{
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_");
		System.out.println("|tWELCOME to Our Restarent");
		System.out.println("\tRestarent Menu :");
		System.out.println("\t1.Barger BDT $80.00");
		System.out.println("\t2.Pizza BDT $100.00");
		System.out.println("\t3 Coffe BDT $60.00");
		System.out.println("\t4 Cancle   ");
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_");
		
	}
	public static void order() {
		System.out.println("1 to Barger || 2 to Pizza || 3 to Coffe");
		System.out.println("Press you want to order");
		choice=input.nextInt();
		if(choice==1) {
			System.out.println("You choice to Barger");
			System.out.println("How many Barger to you want");
			Quantity=input.nextInt();
			total=total+(Quantity*80);
			System.out.println("You want to buy again");
			System.out.println("Press Y for [yes] and N for [no]:");
			again=input.next();
			if (again.equalsIgnoreCase("Y"))
			order();
			else {
				System.out.println("Enter payment :");
				pay=input.nextDouble();
				if(pay<total)
					System.out.println("No Need More");
				else { 
					System.out.println("total="+total);
					total=pay-total;
					System.out.println("Customer's retorn"+total+"tk");
				}
			}
		}
		if(choice==2) {
			System.out.println("You choice to Pizza");
			System.out.println("How many Pizzas to you want");
			Quantity=input.nextInt();
			total=total+(Quantity*100);
			System.out.println("You want to buy again");
			System.out.println("Press Y for [yes] and N for [no]:");
			again=input.next();
			if (again.equalsIgnoreCase("Y"))
			order();
			else {
				System.out.println("Enter payment :");
				pay=input.nextDouble();
				if(pay<total)
					System.out.println("No Need More");
				else { 
					System.out.println("total="+total);
					total=pay-total;
					System.out.println("Customer's retorn"+total+"tk");
				}
			}
		}
		if(choice==3) {
			System.out.println("You choice to Cofee");
			System.out.println("How many Cofees to you want");
			Quantity=input.nextInt();
			total=total+(Quantity*60);
			System.out.println("You want to buy again");
			System.out.println("Press Y for [yes] and N for [no]:");
			again=input.next();
			if (again.equalsIgnoreCase("Y"))
			order();
			else {
				System.out.println("Enter payment :");
				pay=input.nextDouble();
				if(pay<total)
					System.out.println("No Need More");
				else { 
					System.out.println("total="+total);
					total=pay-total;
					System.out.println("Customer's retorn"+total+"tk");
				}
			}
		}
		else if(choice==4) {
			System.exit(0);
		}
		else {
			System.out.println("Chosee a food in this order");
			order();
		}
	}
	public static void main(String[] args) {
		menu();
		order();
	}

}
