package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private int countOfCourier = 0;
    private Warehouse s;

    public Courier(int salary, int isPayed, Warehouse s){
        this.salary = salary;
        this.s = s;
        countOfCourier++;
    }

    @Override
    public void doWork(){
        salary = salary + 100;
        s.increaseDeliveredOrders();
    }

    @Override
    public void bonus(){
        if(s.getCountDeliveredOrders()*countOfCourier<10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }

        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        salary = salary + 70000;
        isPayed = true;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                ", countOfCourier=" + countOfCourier +
                ", s=" + s +
                '}';
    }
}
