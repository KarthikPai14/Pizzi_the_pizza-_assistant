import java.util.*;
public class pizzi
{
    public static void main(String args[])
    {
        for( ; ; )
        {  
            Scanner sc =new Scanner (System.in);
            int base=0,choice=0,add=0,counter=0, counter1=0, d1=0 ,qty=0 ,tqty=0, top=0, ctr=1, drink=0, cake=0;
            int pizbas[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0}, topi[]= {0,0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0,0,0},  addon[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0};
            double sum=0,s1=0,sgst=0,cgst=0,gt=0;

            System.out.println("\f");
            System.out.println("\t\t\tWelcome to Pizza Hut\n");
            System.out.println("\t\tI am Pizzi, your pizza assistant\n");
            System.out.println("Please allow me to guide you for the best pizza   experience ever :)\n");
            System.out.println("\tYou choose we bake..............\n");

            System.out.println("\t\tWeekend Bonazana..........!!!!!!!!!!\n\tOrder above 500 and get a cashback of 50!!!!!!!!!\n\tOrder above 1000 and get a cashback of 100!!!!!!!!!\n\tOrder above 1500 and get a cashback of 150!!!!!!!!!");
            System.out.println("_________________________________________________________________________________________________________________________________________________________");

            System.out.println("Please enter the type of order\n1-Dine in\n2-Take away");
            for( ; ; )
            {
                choice=sc.nextInt();
                if(choice==1)break;
                if(choice==2)
                {sum=sum+10;System.out.println("You will be charged Rs10 extra as parcel charges");break;}
                if(choice>2)System.out.println("Invalid choice.Enter either 1 or 2");
            }

            System.out.println("_________________________________________________________________________________________________________________________________________________________");
            System.out.println("\t\tPizza base\n");
            System.out.println("\t1    ->    Normal @90");
            System.out.println("\t2    ->    Medium @100");
            System.out.println("\t3    ->    Large @110");
            System.out.println("\t4    ->    Stuffed Veg Kebab normal @120");
            System.out.println("\t5    ->    Stuffed Veg Kebab medium @130");
            System.out.println("\t6    ->    Stuffed Veg Kebab large @140");
            System.out.println("\t7    ->    Masala Chicken Sausage normal @140");
            System.out.println("\t8    ->    Masala Chicken Sausage medium @150");
            System.out.println("\t9    ->    Masala Chicken Sausage large @160");
            System.out.println("\t10   ->    Cheese Maxx normal @130");
            System.out.println("\t11   ->    Cheese Maxx medium @140");
            System.out.println("\t12   ->    Cheese Maxx large @150");
            tqty=0;
            for(int i=1;;i++)
            {
                System.out.println("Enter the number alongside to select your pizza base");
                for( ;  ; )
                {
                    base=sc.nextInt();
                    if(base>=1 && base<=12)
                        break;
                    System.out.println("Invalid no. choices are 1 to 12");
                }

                System.out.println("Enter the quantity");
                qty=sc.nextInt();
                pizbas[base] = pizbas[base] + qty;
                if(base==1)sum=sum+(qty*90);
                if(base==2)sum=sum+(qty*100);
                if(base==3)sum=sum+(qty*110);
                if(base==4)sum=sum+(qty*120);
                if(base==5)sum=sum+(qty*130);
                if(base==6)sum=sum+(qty*140);
                if(base==7)sum=sum+(qty*140);
                if(base==8)sum=sum+(qty*150);
                if(base==9)sum=sum+(qty*160);
                if(base==10)sum=sum+(qty*130);
                if(base==11)sum=sum+(qty*140);
                if(base==12)sum=sum+(qty*150);

                System.out.println("Do you want to continue to select base  \nEnter 1->\tYes\nEnter 2->\tNo");
                choice=sc.nextInt();
                tqty=tqty+qty;

                if(choice==2)break;
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\t\tToppings");
            System.out.println("\t1   ->    Double cheese @60");
            System.out.println("\t2   ->    Capsicum @40");
            System.out.println("\t3   ->    Onion @40");
            System.out.println("\t4   ->    Sweet Corn @40");
            System.out.println("\t5   ->    Chole @50");
            System.out.println("\t6   ->    Mushroom @60");
            System.out.println("\t7   ->    Paneer @60");
            System.out.println("\t8   ->    Jalapeno @70");
            System.out.println("\t9   ->    Black Olives @70");
            System.out.println("\t10  ->    Chicken Sausage @80");
            System.out.println("\t11  ->    Chicken Keema @80");
            System.out.println("\t12  ->    Chicken Pepperoni @80");
            System.out.println("\t13  ->    Chicken Tikka @80");
            System.out.println("\t14  ->    Chicken Meatball @80");
            System.out.println("\t15  ->    Chicken Hot and Chilly @80");
            ctr=1;
            while(ctr<=tqty)
            {System.out.println("Enter the number alongside to select your pizza toppings for pizza "+ctr);
                for( ;  ; )
                {top=sc.nextInt();

                    if(top>=1 && top<=15)
                        break;
                    System.out.println("Invalid no. choices are 1 to 15");
                }
                topi[top] = topi[top] + 1;
                if(top==1)sum=sum+60;
                if(top==2)sum=sum+40;
                if(top==3)sum=sum+40;
                if(top==4)sum=sum+40;
                if(top==5)sum=sum+50;
                if(top==6)sum=sum+60;
                if(top==7)sum=sum+60;
                if(top==8)sum=sum+70;
                if(top==9)sum=sum+70;
                if(top==10)sum=sum+80;
                if(top==11)sum=sum+80;
                if(top==12)sum=sum+80;
                if(top==13)sum=sum+80;
                if(top==14)sum=sum+80;
                if(top==15)sum=sum+80;
                System.out.println("Do you want to add more pizza toppings to pizza "+ctr+"\nEnter 1->\tYes\nEnter 2->\tNo");
                choice=sc.nextInt();
                if(choice==2)ctr++;}

            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Do you want an Add On\nEnter 1->\tYes\nEnter 2->\tNo");
            choice=sc.nextInt();

            if(choice==1)
            { System.out.println("\t\tAdd Ons");
                System.out.println("\t1   ->    Cheese Garlic Bread @129");
                System.out.println("\t2   ->    Spicy Supreme Garlic Bread @139");
                System.out.println("\t3   ->    Garlic Breadstix @99");
                System.out.println("\t4   ->    Cheesy Garlic Breadstix @129");
                System.out.println("\t5   ->    Spanish Tomato Pasta Veg @149");
                System.out.println("\t6   ->    Spanish Tomato Pasta Non-veg @169");
                System.out.println("\t7   ->    Spicy Baked Chicken Wings @169");
                System.out.println("\t8   ->    Tandoori Pocket Veg @89");
                System.out.println("\t9   ->    Tandoori Pocket Non-veg @109");

                for(int i=1;;i++)
                {System.out.println("Enter the number alongside to select your pizza add-on");
                    for( ;  ; )
                    {add=sc.nextInt();

                        if(add>=1 && add<=9)
                            break;
                        System.out.println("Invalid no. choices are 1 to 9");
                    }
                    System.out.println("Enter the quantity");
                    qty=sc.nextInt();
                    addon[add] = addon[add] + qty;
                    if(add==1)sum=sum+(qty*129);
                    if(add==2)sum=sum+(qty*139);
                    if(add==3)sum=sum+(qty*99);
                    if(add==4)sum=sum+(qty*129);
                    if(add==5)sum=sum+(qty*149);
                    if(add==6)sum=sum+(qty*169);
                    if(add==7)sum=sum+(qty*169);
                    if(add==8)sum=sum+(qty*89);
                    if(add==9)sum=sum+(qty*109);

                    System.out.println("Do you want to continue to add more pizza add-on\nEnter 1->\tYes\nEnter 2->\tNo");
                    choice=sc.nextInt();
                    if(choice==2)break;

                }   }

            System.out.println("Add a cool drink @40?\nEnter 1->\tYes\nEnter 2->\tNo");
            choice=sc.nextInt();
            if(choice==1)
            {System.out.println("Enter the quantity");
                qty=sc.nextInt();
                sum=sum+(qty*40);
                drink = qty;}

            System.out.println("Add a choco truffle cake/volcano @89?\nEnter 1->\tYes\nEnter 2->\tNo");
            choice=sc.nextInt();
            if(choice==1)
            {System.out.println("Enter the quantity");
                qty=sc.nextInt();
                sum=sum+(qty*89);
                cake = qty;}
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Order successful. Please wait patiently till your order arrives\nWould you like to play a game\nEnter 1->\tyes\nEnter 2->\tno");
            choice=sc.nextInt();
            counter = (int)(Math.random()*10.0);
            counter1 = 1;
            while(choice==1 && counter1 <=10)
            {
                switch(counter)   {
                    case 1: System.out.println("Where was pizza invented?\n1.Naples\n2.Paris\n3.Rome\n4.Venice");
                    choice=sc.nextInt();
                    if(choice==1) System.out.println("Correct answer");
                    else System.out.println("Incorrect answer.Correct answer is Naples");
                    break;
                    case 2: System.out.println("How many Pizza Huts are there around the world?\n1.10,139\n2.11,139\n3.11,140\n4.11,138");
                    choice=sc.nextInt();
                    if(choice==2) System.out.println("Correct answer");
                    else System.out.println("Incorrect answer.Correct answer is 11,139");
                    break;
                    case 3: System.out.println("Where was the first Indian pizza hut started?\n1.Kolkata\n2.Mumbai\n3.Delhi\n4.Bengaluru");
                    choice=sc.nextInt();
                    if(choice==4) System.out.println("Correct answer");
                    else System.out.println("Incorrect answer.Correct answer is Bengaluru");
                    break;
                    case 4: System.out.println("When do most peope eat pizza?\n1.Friday night\n2.Saturday night\n3.Sunday night\n4.Sunday afternoon");
                    choice=sc.nextInt();
                    if(choice==2) System.out.println("Correct answer");
                    else System.out.println("Incorrect answer.Correct answer is Saturday night");
                    break;
                    case 5: System.out.println("What was the original shape of the pizza?\n1.Triangle\n2.Square\n3.Rectangle\n4.Rhombus");
                    choice=sc.nextInt();
                    if(choice==2) System.out.println("Correct answer");
                    else System.out.println("Incorrect answer.Correct answer is square");
                    break;
                    case 6: System.out.println("Where is the International Pizza Expo held?\n1.Paris\n2.Naples\n3.Los Angeles\n4.Las Vegas");
                    choice=sc.nextInt();
                    if(choice==4) System.out.println("Correct answer");
                    else System.out.println("Incorrect answer.Correct answer is Las Vegas");
                    break;
                    case 7: System.out.println("Earlier, pizza was a dish for which class of the society?\n1.Lower\n2.Middle\n3.Higher\n4.None of the above");
                    choice=sc.nextInt();
                    if(choice==1) System.out.println("Correct answer");
                    else System.out.println("Incorrect answer.Correct answer is lower class");
                    break;
                    case 8: System.out.println("Which pizza topping is popular n the world?\n1.Jalapeno\n2.Sausage\n3.Pepperoni\n4.Olives");
                    choice=sc.nextInt();
                    if(choice==3) System.out.println("Correct answer");
                    else System.out.println("Incorrect answer.Correct answer is Pepperoni");
                    break;
                    case 9: System.out.println("Earlier,in which season was pizza mostly consumed?\n1.Spring\n2.Summer\n3.Autumn\n4.Winter");
                    choice=sc.nextInt();
                    if(choice==4) System.out.println("Correct answer");
                    else System.out.println("Incorrect answer.Correct answer is Winter");
                    break;
                    case 0: System.out.println("Which policy boosted woldwide pizza sales?\n1.Buy 1 get 1 free\n2.30 minutes delivery or free\n3.Free pizza if no bill is issued\n4.Free pizza on first online order  ");
                    choice=sc.nextInt();
                    if(choice==2) System.out.println("Correct answer");
                    else System.out.println("Incorrect answer.Correct answer is 30 minutes delivery or free");
                    break;
                    default : counter = 1;
                    break;}
                counter = (counter +1) % 10;
                counter1 = counter1 + 1;
                System.out.println("Press 1-> to continue\nPress 0-> to stop ");
                choice=sc.nextInt();        
            }      
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Press any key to print invoice when your order arrives");
            sc.next();
            if(sum>500)d1=50;
            if(sum>1000)d1=100;
            if(sum>1500)d1=150;
            s1=sum-d1;
            sgst=(5.0/100.0)*s1;
            cgst=(8.0/100.0)*s1;
            gt=s1+sgst+cgst;
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n**********Pizza Hut India Limited**********\n\tYour Order");
            System.out.println("--------------Pizza Base-------------");
            for(int i=1; i<=12; i++)
            {
                if(pizbas[i] > 0)
                {
                    switch(i){
                        case 1: System.out.print("Normal                       \t"); break;
                        case 2: System.out.print("Medium                       \t"); break;
                        case 3: System.out.print("Large                        \t"); break;
                        case 4: System.out.print("Stuffed Veg Kebab normal     \t"); break;  
                        case 5: System.out.print("Stuffed Veg Kebab medium     \t"); break;
                        case 6: System.out.print("Stuffed Veg Kebab large      \t"); break;
                        case 7: System.out.print("Masala Chicken Sausage normal\t"); break;
                        case 8: System.out.print("Masala Chicken Sausage medium\t"); break;
                        case 9: System.out.print("Masala Chicken Sausage large \t"); break;
                        case 10: System.out.print("Cheese Maxx normal          \t"); break;
                        case 11: System.out.print("Cheese Maxx medium          \t"); break;
                        case 12: System.out.print("Cheese Maxx large           \t"); break;
                        default: break;}
                    System.out.println(pizbas[i]);
                }
            }
            System.out.println("--------------Toppings-------------");
            for(int i=1; i<=15; i++)
            {
                if(topi[i] > 0)
                {
                    switch(i){
                        case 1: System.out.print("Double cheese                \t"); break;
                        case 2: System.out.print("Capsicum                     \t"); break;
                        case 3: System.out.print("Onion                        \t"); break;
                        case 4: System.out.print("Sweet Corn                   \t"); break;  
                        case 5: System.out.print("Chole                        \t"); break;
                        case 6: System.out.print("Mushroom                     \t"); break;
                        case 7: System.out.print("Paneer                       \t"); break;
                        case 8: System.out.print("Jalapeno                     \t"); break;
                        case 9: System.out.print("Black Olives                 \t"); break;
                        case 10: System.out.print("Chicken Sausage             \t"); break;
                        case 11: System.out.print("Chicken Keema               \t"); break;
                        case 12: System.out.print("Chicken Pepperoni           \t"); break;
                        case 13: System.out.print("Chicken Tikka               \t"); break;
                        case 14: System.out.print("Chicken Meatball            \t"); break;
                        case 15: System.out.print("Chicken Hot and Chilly      \t"); break;
                        default: break;}
                    System.out.println(topi[i]);
                }
            }    
            System.out.println("-------------Addons----------------");
            for(int i=1; i<=9; i++)
            {
                if(addon[i] > 0)
                {
                    switch(i){
                        case 1: System.out.print("Cheese Garlic Bread          \t"); break;
                        case 2: System.out.print("Spicy Supreme Garlic Bread   \t"); break;
                        case 3: System.out.print("Garlic Breadstix             \t"); break;
                        case 4: System.out.print("Cheesy Garlic Breadstix      \t"); break;  
                        case 5: System.out.print("Spanish Tomato Pasta Veg     \t"); break;
                        case 6: System.out.print("Spanish Tomato Pasta Non-veg \t"); break;
                        case 7: System.out.print("Spicy Baked Chicken Wings    \t"); break;
                        case 8: System.out.print("Tandoori Pocket Veg          \t"); break;
                        case 9: System.out.print("Tandoori Pocket Non-veg      \t"); break;
                        default: break;}
                    System.out.println(addon[i]);
                }
            }

            if(drink > 0) System.out.println("Drink                     \t"+drink);
            if(cake > 0) System.out.println("choco truffle cake/volcano\t"+cake);
            System.out.println("-----------------------------------");
            System.out.println("Amount before discount="+sum);
            System.out.println("Discount="+d1);
            System.out.println("Amount after discount="+s1);
            System.out.println("SGST @5%="+ sgst);
            System.out.println("CGST @8%="+ cgst);
            System.out.println("Total amount to be paid="+gt);
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            System.out.println("Payment method\n1->\tCash\n2->\tDebit/Credit card\n3->\tMeal voucher\n4->\tOnline transfer\n5->\tWallet");
            for(;;)
            { choice=sc.nextInt();
                if(choice==1 ){System.out.println("An employee will be at your table as soon as possible to collect your cash");break;}
                if(choice==2){System.out.println("An employee will be at your table as soon as possible with a debit/credit card machine");break;}
                if(choice==3){System.out.println("An employee will be at your table as soon as possible to collect your meal vouchers");break;}
                if(choice==4){System.out.println("Directing to payment gateway.An employee will be at your table as soon as possible to crosscheck your transaction ");break;}
                if(choice==5){System.out.println("Directing to payment gateway.An employee will be at your table as soon as possible to crosscheck your transaction ");break;}
                if(choice>5)  {System.out.println("Invalid no. choices are 1 to 5");}
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Thank you for visiting Pizza Hut. Please do visit again.\nCopy rights reserved:Karthik Pai 18/12/17");
            System.out.println("    _________________________________________________________________________________________________________________________________________________________");
            System.out.println("Next customer?  Type 1 for Yes OR 2 for No");
            int c=sc.nextInt();
            if(c==2)
            {
                System.out.println("* * * * * THANK YOU FOR AVAILING MY SERVICE * * * * *");break;

            }}}}
