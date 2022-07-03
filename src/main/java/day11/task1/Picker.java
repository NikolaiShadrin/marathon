package day11.task1;

public class Picker implements Worker {
    private int salary = 0;
    private boolean isPayed ;
    private int countOfPicker;
    private Warehouse s;



    public Picker(Warehouse s){
        this.s = s;
        countOfPicker++;
    }


    @Override
    public void doWork(){
        salary = salary + 80;
        s.increasePickedOrders();
    }

    @Override
    public void bonus(){
        if(s.getCountPickedOrders()*countOfPicker<=10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }

        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        salary = salary + 50000;
        isPayed = true;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                ", countOfPicker=" + countOfPicker +
                ", s=" + s +
                '}';
    }
}
