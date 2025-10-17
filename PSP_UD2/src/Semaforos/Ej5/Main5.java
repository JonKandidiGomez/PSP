package Semaforos.Ej5;


public class Main5 {
    public static void main(String[] args) {

        TallerCostura taller = new TallerCostura();
        Thread cm1 = new Thread(new CostureraMangas(taller));
        Thread cm2 = new Thread(new CostureraMangas(taller));
        Thread cp = new Thread(new CostureraCuerpos(taller));
        Thread cj = new Thread(new CostureraJerseys(taller));

        cm1.setName("CostureraMangas1");
        cm2.setName("CostureraMangas2");
        cp.setName("CostureraCuerpos");
        cj.setName("CostureraJerseys");

        cm1.start();
        cm2.start();
        cp.start();
        cj.start();
    }
}
