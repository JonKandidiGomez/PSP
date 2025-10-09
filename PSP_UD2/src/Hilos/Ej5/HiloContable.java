package Ej5;

public class HiloContable extends Thread{

    private final double[] nums;
    private final int posInicial;
    private final int posFinal;
    private double suma;

    public HiloContable(double[] nums, int posInicial, int posFinal) {
        this.nums = nums;
        this.posInicial = posInicial;
        this.posFinal = posFinal;
    }

    public double getSuma() {
        return suma;
    }

    @Override
    public void run() {
        for(int i = posInicial; i < posFinal; i++){
            suma  += nums[i];
        }
    }

}
