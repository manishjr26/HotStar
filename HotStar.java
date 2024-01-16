class HotStar{
	public static void main(String[] args) {
System.out.println("\n");

		System.out.println("   \n \t\t\t==== Welcome To Disney + HotStar ==== ");
		System.out.println("\tYour Supposed to Create Account to Continue ");
		System.out.println("\tEnter your Good Name  : ");
		java.util.Scanner n=new java.util.Scanner(System.in);
		String userName=n.next();
		System.out.println("\n  Enter your emailId");
		java.util.Scanner email=new java.util.Scanner(System.in);
		String userEmailId=email.next();
		HotStar_Number ph=new HotStar_Number();
		ph.phoneNumber();
	}}

    class HotStar_Number extends HotStar
    {
		public void phoneNumber()
		{
			System.out.println("\n\tEnter your phone number");
			java.util.Scanner num=new java.util.Scanner(System.in);
			long userNumber=num.nextLong();


			int count=0;
    		long userCheck=userNumber; 
    		long userCheck2=userNumber;
    		long firstDigit = 0;

  			while(userCheck!=0) // To check if number contains 10 digit
    		{
      			count++;
      			userCheck/=10;
    		}

  			if(count==10)
    		{
              while(userNumber!=0)  // To Check Starting digit of the number
              {
                 firstDigit=Math.abs(userNumber % 10);
                 userNumber/=10;
              }

    		}else if(count!=10){  // If number does'nt contain 10 digit again the process continues by taking a 10 digit number
      				System.out.println("   ==  \nPhone Number Entered Not Valid");
      				System.out.println("  \t Enter Valid 10 digit Phone  Number Again -");
      				phoneNumber();
    		}

    		
    		if(firstDigit==9 || firstDigit==8|| firstDigit==7){
    			System.out.println("\t\t\t===========================================\t\t\t");
      				System.out.println("\n Your entered number contains 10 digits and it starts with "+firstDigit+".\nSo, its valid India Regristration Number. ");
      				System.out.println(" \t\n ==== Therefore ,Phone Number Validation Successfull. ==== \t");
      				System.out.println("      =====   HotStar Account Creation Successfull.  ======= ");
      				System.out.println("   \t\tRemember Username and Phone Number.! "); 
      				//System.out.println("\n");
      				HotStar_SubsrciptionPlans op=new HotStar_SubsrciptionPlans();
      				op.options();
      				}

    		else if(firstDigit==1 || firstDigit ==2 || firstDigit==3||firstDigit==4||firstDigit==5||firstDigit==6||firstDigit==0){
      				System.out.println(" \nEntered Number contains 10 digits but it does'nt start with\n 9 or 8 or 7 to confirm that number belongs to India Regristration.  ");
      				System.out.println("\n");
      				System.out.println("Enter Valid 10 digit Phone  Number Again -");
      				phoneNumber();
    		}

		}
		
	}

		
	class HotStar_SubsrciptionPlans extends HotStar_Number{
		public void options()
		{
			
			System.out.println("\n");
			Subscibe de=new Subscibe();
			de.subscriptionDesciption();
			System.out.println("\t You Can Choose from this 3 options for your further usage. ");
			System.out.println("\n\t1 - Free Subscription = Limited Movies \n\t2 - VIP Subscription\n\t3 - Premium Subscription");
			System.out.println("\n\tSelect anyone Subscription, if you select");
				System.out.println("\nNOTE  \n\t\t-  If you select Premium you can access all the three. \n\t\t-  If you select VIP you can access both Free and VIP Content.\n\t\t-  If you select Free only limited content.");
			System.out.println("\nEnter your choice : ");
			java.util.Scanner choice=new java.util.Scanner(System.in);
			int userSelection=choice.nextInt();
			if(userSelection==1){
				HotStar_Free free=new HotStar_Free();
				free.fee();
			}else if(userSelection==2){
				HotStar_Vip vi=new HotStar_Vip();
				vi.vip();
			}else if(userSelection==3){
				HotStar_Premium pre=new HotStar_Premium();
				pre.premium();
			}


		}

	}

class HotStar_Free extends HotStar_SubsrciptionPlans{
	public void fee(){
		System.out.println("\n");
		System.out.println("  ------------ Welcome To HotStar Free Subsciption ---------------------");
		System.out.println("Movies Available Are : ");
		System.out.println("\n");
		System.out.println("   Baahubali 2: The Conclusion\n   Singam 3\n   Judwaa 2\n   Jolly LLB 2\n   M.S. Dhoni: The Untold Story\n   kick 2");
		System.out.println("\n");
		System.out.println("Or do you wish go for VIP or Premium . Press 1 - to go  or 2 - Stay Back");
		java.util.Scanner choice1=new java.util.Scanner(System.in);
		int userSelection2=choice1.nextInt();
		if(userSelection2==1){
			HotStar_SubsrciptionPlans freeSubscribe=new HotStar_SubsrciptionPlans();
			freeSubscribe.options();
		}

	}
}



class HotStar_Premium extends HotStar_Number{
	public void premium(){
		System.out.println("  ------------ Welcome To HotStar Premium Subsciption ---------------------");
		System.out.println("Movies Available Are : ");
		System.out.println("\n");
		System.out.println("   The Art of Racing in the Rain\n   We Bought a Zoo\n   Murder on the Orient Express\n   Doctor Strange in the Multiverse of Madness\n   Shang-Chi and the Legend of the Ten Rings\n   The Simpsons");
		System.out.println("\n");
		System.out.println("Do wish to watch on the generes .");
		System.out.println("1 - TvShows\n 2 - Mythology\n 3 - Sports\n 4- Animation\n 5 - SuperHeroes");
		java.util.Scanner choiceGeneres=new java.util.Scanner(System.in);
		int userGeners=choiceGeneres.nextInt();
		if(userGeners==1){
			HotStar_TvShow tshow=new HotStar_TvShow();
			tshow.tvShow();
		}else if(userGeners==2){
			HotStar_Mythology mshow=new HotStar_Mythology();
			mshow.mythology();
		}else if(userGeners==3){
			HotStar_Sports sshow=new HotStar_Sports();
			sshow.sports();
		}else if(userGeners==4){
			HotStar_Animation ashow=new HotStar_Animation();
			ashow.animation();
		}else if(userGeners==5){
			HotStar_SuperHeroes ssshow=new HotStar_SuperHeroes();
			ssshow.superHeroes();
		}


	}
}

class HotStar_Vip extends HotStar_Premium{
	public void vip(){
		System.out.println("  ------------ Welcome To HotStar VIP Subsciption ---------------------");
		System.out.println("Movies Available Are : ");
		System.out.println("\n");
		System.out.println("   Vada Chennai \n   Gaalipata\n   Black Swarn\n   Premam\n   Ford v Ferrari\n   Mulan");
		System.out.println("\n");
		System.out.println("Do wish to watch on the generes .");
		System.out.println("   1 - TvShows\n   2 - Mythology\n   3 - Sports\n ");
		java.util.Scanner choiceGeneres1=new java.util.Scanner(System.in);
		int userGeners1=choiceGeneres1.nextInt();
		if(userGeners1==1){
			HotStar_TvShow tshow1=new HotStar_TvShow();
			tshow1.tvShow();
		}else if(userGeners1==2){
			HotStar_Mythology mshow1=new HotStar_Mythology();
			mshow1.mythology();
		}else if(userGeners1==3){
			HotStar_Sports sshow1=new HotStar_Sports();
			sshow1.sports();
		}
	}
}
	class HotStar_TvShow extends HotStar_Premium{
	public void tvShow(){
		System.out.println("----------------- Welcome To Tv Shows  ------------- ");
		System.out.println("Tv Shows Available are : ");
		System.out.println("   The Freelancer (2023)\n   Aakhri Sach (2023) Thriller\n   Commando (2023) Action\n   Mathagam (2023) Thriller\n   The Trial (2023) Crime\n   Aarya (2020)");

	}}
	class HotStar_Mythology extends HotStar_Premium{
	public void mythology(){
		System.out.println("----------------- Welcome To Mythology Shows  ------------- ");
		System.out.println("Mythology Shows Available are : ");
		System.out.println("   Ramayan\n   Mahabharat\n   Hanuman\n   Lord Ganesha\n   Swami Ayappan\n   Lord Shiva");

	}}

	class HotStar_Sports extends HotStar_Premium{
		public void sports(){
			System.out.println("----------------- Welcome To Sports Domain  ------------- ");
		System.out.println(" Sports Available are : ");
		System.out.println("   Cricket\n   FootBall\n   Kabbadi\n   VolleyBall\n   ThrowBall\n   BasketBall");

		}
	}

	class HotStar_Animation extends HotStar_Premium{
		public void animation(){
			System.out.println("----------------- Welcome To Animation Generes  ------------- ");
		System.out.println("Animation Movies Available are : ");
		System.out.println("   Chota Bheem\n   Roll No.21\n   Oggy and Crocakrchoes\n   Shaun The Sheep\n   Ben 10\n   Mighty Raju");

		}
	}

	class HotStar_SuperHeroes extends HotStar_Premium{
		public void superHeroes(){
			System.out.println("----------------- Welcome To SuperHeroes Generes  ------------- ");
		System.out.println("Tv Shows Available are : ");
		System.out.println("   Thor\n   Captain America\n   Hulk\n   Black Panther\n   SuperMan\n   SpiderMan");


		}
	}


class Subscibe{
	public void subscriptionDesciption(){
		System.out.println("\n");
		System.out.println("\t\t---------------------------------------\t\t\t");
		System.out.println("\t\t====== Subscribe Now And Start Streaming ======\t\n");
		System.out.print("\t\t\t  VIP Plan ");
		System.out.print("\tPremium Plan ");
		System.out.println("\n");
		System.out.print("All Content           :\t");
		System.out.print("  Yes");
		System.out.print("\t\t  Yes");
		System.out.println("\n");
		System.out.print("Watch on TV or Laptop :\t");
		System.out.print("  Yes");
		System.out.print("\t\t  Yes");
		System.out.println("\n");
		System.out.print("Adds free movies and \nshows(except sports)  :\t");
		System.out.print("  No\t");
		System.out.print("\t  Yes");
		System.out.println("\n");
		System.out.print("Number of the devices \nthat can be logged in :\t");
		System.out.print("   2\t");
		System.out.print("\t  4");
		System.out.println("\n");
		System.out.print("Max video quality     :\t");
		System.out.print(" Full HD\t");
		System.out.print("4K 2160P");
		System.out.println("\n");
		System.out.print("Max audio quality     :\t");
		System.out.print(" Dolby Atmos ");
		System.out.print("  Dolby Atmos\n");
		System.out.println("\n");
		System.out.print("Cost                  :\t");
		System.out.print("Rs 1400-/-      ");
		System.out.print("Rs 399-/-");
		System.out.println("\n");
		System.out.print("\t\t\tper year    ");
		System.out.println("per year");
		System.out.println("\t\t-----------------------------------------\t\t\t");
		System.out.println("\n");
}
}
