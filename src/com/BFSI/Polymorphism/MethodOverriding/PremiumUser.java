package com.BFSI.Polymorphism.MethodOverriding;

public class PremiumUser extends User{

    private int rewardPoints;

    public PremiumUser(int id, String userName, String emailId, double walletBalance) {
        super(id, userName, emailId, walletBalance);
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    @Override
    public boolean makePayment(double billAmount) {
        if(super.makePayment(billAmount))
        {
            setRewardPoints(rewardPoints+(int)(0.1*billAmount));
            return true;
        }
        return false;
    }
}
