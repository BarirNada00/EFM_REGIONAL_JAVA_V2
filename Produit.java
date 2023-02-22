public class Produit {
    private int code;
    private double prixOrigine;

    public Produit(int code, double prixOrigine) {
        this.code = code;
        this.prixOrigine = prixOrigine;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrixOrigine() {
        return prixOrigine;
    }

    public void setPrixOrigine(double prixOrigine) {
        this.prixOrigine = prixOrigine;
    }

    public double prixProduit() {
        return prixOrigine;
    }

    @Override
    public String toString() {
        return code + ";" + prixOrigine;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) obj;
        return this.code == other.code;
    }
}