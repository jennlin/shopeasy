/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author bciavarella
 */
public class JavaFXApplication1 extends Application {
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        /*
        groceryStore TraderJoes = new groceryStore("Trader Joe's", "99 Cedar Swamp Rd, Jericho, NY 11753");
        storeItem mandarinOrange = new storeItem("Mandarin Orange", 10, 1000, 7.50, "These seedless oranges are fresh from Florida sun. Handpicked from artisan farmers, these are sure to delight!", "Organic", "Sunkissed");
        storeItem fujiApple = new storeItem("Fuji Apple", 1, 1000, 1.50, "This apples are crisp and crunchy. Enjoy them at your next picnic.", "Organic", "Junami");
        storeItem jumboEggs = new storeItem("Jumbo Eggs", 12, 1000, 8.00, "Jumbo eggs are for your favorite breakfast, perfectly paired with sausages and hash browns.", "Cageless, Free Range", "Kirkland");
        ArrayList<storeItem> items = new ArrayList<storeItem>();
        items.add(mandarinOrange);
        items.add(fujiApple);
        items.add(jumboEggs);
        TraderJoes.addStoreItem(mandarinOrange);
        TraderJoes.addStoreItem(fujiApple);
        TraderJoes.addStoreItem(jumboEggs);
        shopper Wesley = new shopper("Wesley Pergament", "wesley.pergament@jerichoapps.org", "5169988802", "wesperg", "asdfzxcv", "3 Clinton Lane, Jericho, NY 11753");
        System.out.println("Username: ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println("Password: ");
        String input2 = s.nextLine();
          while(!(input.toLowerCase().equals(Wesley.getUsername().toLowerCase())) && (input2.equals(Wesley.getPassword())))
          {
            System.out.println("Username: ");
            input = s.nextLine();
            System.out.println("Password: ");
            input2 = s.nextLine();
          }
        Wesley.newCard("123456", "Visa", "123", "03-21");
        Wesley.newPurchase("3:00");
        System.out.println("Search items in Trader Joe's: ");
        String a = s.nextLine();
        ArrayList<storeItem> result = TraderJoes.findItem(a.toLowerCase());

        System.out.println(result+ "\n" + "Enter the desired product number: ");
        int get = s.nextInt();
        Wesley.getCart().addItem(result.get(get - 1));
        System.out.print(Wesley.getCart().getTotalCost());
        
        System.out.println("Search items in Trader Joe's: ");
        String b = s.nextLine();
        ArrayList<storeItem> result2 = TraderJoes.findItem(b.toLowerCase());

        System.out.println(result2 + "\n" + "Enter the desired product number: ");
        int get2 = s.nextInt();
        Wesley.getCart().addItem(result.get(get2-1));
        System.out.print(Wesley.getCart().getTotalCost());
        */
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
