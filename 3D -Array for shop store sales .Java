/*
*Name:Zalik Barasa Juma
*Reg No: J77-10594-2024
*Description: Program for 3D -Array for shop store sales 
*/
public class ShopSales {
    public static void main(String[] args) {
        // (a) Declare and initialize the 3D array
        // Dimensions: [branches][months][products]
        int[][][] sales = {
            { // Branch 1
                {10, 20, 30}, // Month 1: Product 1, 2, 3 sales
                {15, 25, 35}  // Month 2: Product 1, 2, 3 sales
            },
            { // Branch 2
                {5, 10, 15},  // Month 1: Product 1, 2, 3 sales
                {8, 16, 24}   // Month 2: Product 1, 2, 3 sales
            }
        };
        
        // (b) Print all elements using 3 nested loops
        System.out.println("SHOP SALES DATA");
        System.out.println("===============");
        
        for (int branch = 0; branch < sales.length; branch++) {
            System.out.println("\n--- BRANCH " + (branch + 1) + " ---");
            
            for (int month = 0; month < sales[branch].length; month++) {
                System.out.println("  Month " + (month + 1) + ":");
                System.out.print("    Products: ");
                
                for (int product = 0; product < sales[branch][month].length; product++) {
                    System.out.print("P" + (product + 1) + "=" + 
                                   sales[branch][month][product] + " ");
                }
                System.out.println();
            }
        }
        
        // (c) Calculate and display total sales for branch 1
        System.out.println("\n\nCALCULATING TOTAL SALES FOR BRANCH 1");
        System.out.println("=====================================");
        
        int totalBranch1 = 0;
        int branchIndex = 0; // Branch 1 is at index 0
        
        // Loop through months in branch 1
        for (int month = 0; month < sales[branchIndex].length; month++) {
            System.out.print("Month " + (month + 1) + " sales: ");
            
            // Loop through products in each month
            for (int product = 0; product < sales[branchIndex][month].length; product++) {
                System.out.print(sales[branchIndex][month][product]);
                if (product < sales[branchIndex][month].length - 1) {
                    System.out.print(" + ");
                }
                totalBranch1 += sales[branchIndex][month][product];
            }
            System.out.println();
        }
        
        System.out.println("Total sales for Branch 1: " + totalBranch1);
    }

}
