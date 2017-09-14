
package favouriteapps;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class FavouriteApps {

     public static void main(String[] args)
    {
        //import scanner and define variables
        Scanner Keyboard = new Scanner(System.in);
        
        //Ask for user what their 3 favourite apps are
        System.out.printf("What is your favourite app? ");
        String app1 = Keyboard.nextLine();
        
        System.out.printf("What is your second favourite app? ");
        String app2 = Keyboard.nextLine();
        
        System.out.printf("What is your third favourite app? ");
        String app3 = Keyboard.nextLine();
        
        
        //print their top 3 apps
        System.out.printf("Your favourite apps are %s, %s and %s.%n", app1, app2, app3);
        
    }
    
}
