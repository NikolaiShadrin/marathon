package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker1 = new Picker (warehouse);
        Courier courier1 = new Courier(0,0,warehouse);

        businessProcess(picker1);
        businessProcess(courier1);

        System.out.println(picker1);
        System.out.println(courier1);


    }

    static void businessProcess(Worker worker){
        for(int i=0; i< 10000; i++){
            worker.doWork();
        }
        worker.bonus();
    }


}
