import java.util.ArrayList;
import java.util.List;

class Stock {

    private String name;
    private int quantity;
    private List<Observer> observers = new ArrayList<>();

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        notifyObservers();
    }

    public int getQuantity() {
        return quantity;
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(quantity);
        }
    }

    public String getName() {
        return name;
    }
}
