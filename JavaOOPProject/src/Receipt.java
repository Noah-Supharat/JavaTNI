public class Receipt {
    private Order order;
    private Payment payment;

    public Receipt(Order order, Payment payment){
        this.payment = payment;
        this.order = order;
    }

    public String printReceipt(){
        String text = "";

        text += "===== RECEIPT =====\n";

        for(OrderItem item : order.getItems()){
            text += item.getProduct().getName() + " x "
                    + item.getQuantity() + " = "
                    + item.getSubTotal() + "\n";
        }

        text += "------------------\n";
        text += "Total: " + order.calculateTotal() + "\n";

        return text;
    }
}
