import java.util.Scanner;

public class Conditional2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int creditScore = sc.nextInt();
        double annualIncome = sc.nextDouble();
        double debtToIncomeRatio = sc.nextDouble();
        sc.nextLine();
        String loanType = sc.nextLine();
        String decision = "Rejected";
        double maxLoanAmount = 0.0;
        if (creditScore < 600 || debtToIncomeRatio > 50) {
            decision = "Rejected";
            maxLoanAmount = 0.0;
        } 
        else {
            if (creditScore >= 750) { 

                if (debtToIncomeRatio <= 30) { 

                    if (loanType.equalsIgnoreCase("Home")) {
                        decision = "Approved";
                        maxLoanAmount = annualIncome * 4;
                    }
                    else if (loanType.equalsIgnoreCase("Personal")) {
                        decision = "Approved";
                        maxLoanAmount = annualIncome * 1;
                    }
                    else if (loanType.equalsIgnoreCase("Business")) {
                        decision = "Approved";
                        maxLoanAmount = annualIncome * 3;
                    }
                } 
                else if (debtToIncomeRatio <= 40) { 
                    decision = "Needs Review";
                    maxLoanAmount = annualIncome * 3;
                }
            }
            else if (creditScore >= 700) { 

                if (debtToIncomeRatio <= 30) {
                    if (loanType.equalsIgnoreCase("Business")) {
                        decision = "Approved";
                        maxLoanAmount = annualIncome * 3;
                    }
                    else if (loanType.equalsIgnoreCase("Home")) {
                        decision = "Needs Review";
                        maxLoanAmount = annualIncome * 3;
                    }
                }
                else if (debtToIncomeRatio <= 40) {
                    decision = "Needs Review";
                    maxLoanAmount = annualIncome * 3;
                }
            }
            else if (creditScore >= 650) { 
                if (debtToIncomeRatio <= 40) {
                    if (loanType.equalsIgnoreCase("Personal")) {
                        decision = "Needs Review";
                        maxLoanAmount = annualIncome * 0.5;
                    }
                    else {
                        decision = "Needs Review";
                        maxLoanAmount = annualIncome * 3;
                    }
                }
            }
            else { 
                decision = "Rejected";
                maxLoanAmount = 0.0;
            }
        }
        System.out.println("Credit Score: " + creditScore);
        System.out.println("Annual Income: $" + annualIncome);
        System.out.println("Debt-to-Income Ratio: " + debtToIncomeRatio + "%");
        System.out.println("Loan Type: " + loanType);
        System.out.println("Decision: " + decision);
        System.out.println("Maximum Loan Amount: $" + maxLoanAmount);

        sc.close();
    }
}