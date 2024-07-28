package observer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> items;
    private String status;

    public Order() {
        this.items = new ArrayList<>();
        this.status = "Pending";
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void placeOrder() {
        status = "Processing";
        // Simulate processing time
        try {
            Thread.sleep(2000); // 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        status = "Completed";
    }

    public String getStatus() {
        return status;
    }

    public List<String> getItems() {
        return items;
    }
}
