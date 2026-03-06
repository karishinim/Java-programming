import java.util.Scanner;

public class Conditional9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double annualRevenue = sc.nextDouble();
        sc.nextLine();
        String businessType = sc.nextLine();
        double deductibleExpenses = sc.nextDouble();
        double taxCredits = sc.nextDouble();
        double taxableIncome;
        double taxRate = 0;
        double grossTax;
        double netTax;
        double effectiveTaxRate;
        taxableIncome = annualRevenue - deductibleExpenses;
        if (businessType.equals("LLC")) {
            taxRate = 15;
        }
        else if (businessType.equals("S-Corp")) {
            taxRate = 25;
        }
        else if (businessType.equals("Partnership")) {
            taxRate = 22;
        }
        else if (businessType.equals("C-Corp")) {
            if (taxableIncome <= 1000000) {
                taxRate = 21;
            } else {
                taxRate = 28;
            }
        }
        grossTax = taxableIncome * taxRate / 100.0;
        netTax = grossTax - taxCredits;
        effectiveTaxRate = (netTax / annualRevenue) * 100;
        System.out.println("Annual Revenue: $" + annualRevenue);
        System.out.println("Business Type: " + businessType);
        System.out.println("Deductible Expenses: $" + deductibleExpenses);
        System.out.println("Tax Credits: $" + taxCredits);
        System.out.println("Taxable Income: $" + taxableIncome);
        System.out.println("Tax Rate: " + (int)taxRate + "%");
        System.out.println("Gross Tax: $" + grossTax);
        System.out.println("Net Tax After Credits: $" + netTax);
        System.out.printf("Effective Tax Rate: %.2f%%\n", effectiveTaxRate);
        sc.close();
    }
}