import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<OrderItem> items = new ArrayList<>();
    private double totalPrice;
    private Member member;

    public Order(List<OrderItem> items){
        this.items = items;
        this.orderId = orderId;
        totalPrice = 0.0;
    }

    public void addItem(Product product, int quantity){
        OrderItem item = new OrderItem(product, quantity);
        items.add(item);
    }

    public void removeItem(Product product){
        for (OrderItem item : items){
            if(item.getProduct() == product) {
                items.remove(item);
                break;
            }
        }
    }

    public double calculateTotal(){
        totalPrice = 0;

        for (OrderItem item : items) {
            totalPrice += item.getSubTotal();
        }
        return totalPrice;
    }

    public void applyMemberPoint(int point){
        if(member != null){
            double discount = (point / 100.0) * 10;
            totalPrice -= discount;
            member.addPoint(point);
        }
    }

    public double getTotal() {
        return totalPrice;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setMember(Member member){
        this.member = member;
    }
}
