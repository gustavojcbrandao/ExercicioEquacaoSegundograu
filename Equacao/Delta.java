package Equacao;

public class Delta extends Equacao{

    private double valorDelta;

    //#region Encapsulamento do atributo

    public double getValorDelta() {
        return valorDelta;
    }

    public void setValorDelta(double valorDelta) {
        this.valorDelta = valorDelta;
    }

    //#endregion

    // #region Regras de Negócios

    public double calcularDelta (double a, double b, double c) {
        setValorDelta((b * b) - (4 * a * c));
        return valorDelta;
    }

    public boolean validaDelta (double delta){
        if (delta >= 0) {
            return true;
        }
        else {
            return false;
        }
    }
    //#endregion  
}
