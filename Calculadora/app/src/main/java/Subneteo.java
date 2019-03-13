public class Subneteo {
    public static void main(String[] args){
        Subneteo snt = new Subneteo();
        System.out.println(snt.ValidarRango());
    }
    public Boolean ValidarRango(int numero, int limiteInferior, int limiteSuerior) {
        return numero >= limiteInferior && numero <= limiteSuerior;

    }
}
