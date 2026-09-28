/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.runapplication;
  import java.util.Scanner;
public class RunApplication {

    public static void main(String[] args) {
      

        Scanner input = new Scanner(System.in);

        System.out.print("Enter console type: ");
        String consoleType = input.nextLine();

        System.out.print("Enter store name: ");
        String store = input.nextLine();

        System.out.print("Enter total amount of sales: ");
        int totalSales = input.nextInt();

        // Create ConsoleSales object
        ConsoleSales sales = new ConsoleSales(
                consoleType,
                store,
                totalSales
        );

        System.out.println("\n--- CONSOLE SALES REPORT ---");
        sales.printReport();

        input.close();
    }
}
    

