package Equacao;

public class EqXn extends Equacao {
    private double xu;
    private double xn;
    private double xp;

    //#region Encapsulamento dos atributos

    public double getXu() {
        return xu;
    }
    public void setXu(double xu) {
        this.xu = xu;
    }
    public double getXn() {
        return xn;
    }
    public void setXn(double xn) {
        this.xn = xn;
    }
    public double getXp() {
        return xp;
    }
    public void setXp(double xp) {
        this.xp = xp;
    }
    
    //#endregion
    
    //#region Regras de Negócios
    
    public double calculaXn(double a, double b, double c) {
        setXn((-b) - Math.sqrt(((b * b) - (4 * a * c))) / (2 * a));
        return xn;
    }

    public double calculaXp(double a, double b, double c) {
        setXp((-b) + Math.sqrt(((b * b) - (4 * a * c))) / (2 * a));
        return xp;
    }

    public double calculaXu(double a, double b, double c) {
        setXu((-b) + Math.sqrt(((b * b) - (4 * a * c))) / (2 * a));
        return xu;
    }

    //#endregion
}
