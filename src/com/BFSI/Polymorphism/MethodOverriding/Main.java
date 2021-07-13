package com.BFSI.Polymorphism.MethodOverriding;

public class Main {

    /*EPay Wallet is a wallet application using which users can pay various bills.
      Users can make payments only if they have enough wallet balance.
      There are two kinds of users – User and PremiumUser. PremiumUser gets reward points for every payment.
      Method Description:
       -- User
            -- User(int id, string userName, String emailId, double walletBalance)
                    Initialize the instance variables with the values passed to the constructor.
            -- makePayment(double billAmount)
                    - Make the payment by deducting the billAmount from walletBalance if and only if sufficient walletBalance is available.
                    - Return true if the payment is successful
                    - Return false if the walletBalance is insufficient
                    - Implement the appropriate getter and setter methods.
       -- PremiumUser
            -- PremiumUser(int id, string userName, String emailId, double walletBalance)
                    Initialize the instance variables with the values passed to the constructor.
            -- makePayment(double billAmount)
                    - Override the parent method to make payment as well as to credit reward points to the user.
                    - If the payment is successful, add 10% of the billAmount as rewardPoints
                    - Return true if the payment is successful, else return false
       Implement the appropriate getter and setter methods.
     */
    public static void main(String[] args) {

        User user = new User(101, "Joe", "joe@abc.com", 100);

        PremiumUser premiumUser = new PremiumUser(201, "Jill", "jill@abc.com", 300);

        PremiumUser premiumUser2 = new PremiumUser(202, "Jack", "jack@abc.com", 500);

        processPayment(user, 70);

        processPayment(premiumUser, 150);

        processPayment(premiumUser, 80);

        processPayment(premiumUser, 120);

        processPayment(premiumUser2, 150);

        processPayment(premiumUser2, 80);

        processPayment(premiumUser2, 120);

    }

    public static void processPayment(User user, double billAmount) {
        if (user.makePayment(billAmount)) {
            System.out.println("Congratulations " + user.getUserName() + ", payment of $" + billAmount + " was successful!");
        } else {
            System.out.println("Sorry " + user.getUserName() + ", you do not have enough balance to pay the bill!");
        }
        System.out.println("Your wallet balance is $" + user.getWalletBalance());

        if (user instanceof PremiumUser) {
            PremiumUser premiumUser = (PremiumUser) user;
            System.out.println("You have " + premiumUser.getRewardPoints() + " points!");
        }
        System.out.println();
    }
}
