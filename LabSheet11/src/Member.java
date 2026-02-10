public class Member extends Customer implements Rewardable{
    private String member_level;

    public Member(String name, double billAmount, String member_level){
        super(name, billAmount);
        this.member_level = member_level;
    }

    public double calculateFinalBill(){
        return getBillAmount() - (getBillAmount() * getDiscountRate());
    }

    @Override
    public double getDiscountRate() {
        if(member_level.equalsIgnoreCase("Gold")){
            return 0.15;
        } else if (member_level.equalsIgnoreCase("Premium")) {
            return 0.20;
        } return 0;
    }

    @Override
    public int collectPoints() {
        return (int)getBillAmount() / 100;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMember level: " + member_level + " (Discount: " + getDiscountRate() + ")" +
                "\nGet point: " + collectPoints() +
                "\nTotal price: " + calculateFinalBill();
    }
}

