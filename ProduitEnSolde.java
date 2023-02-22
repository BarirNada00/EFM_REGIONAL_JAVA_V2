public class ProduitEnSolde extends Produit {
    private int remise;

    public ProduitEnSolde(int code, double prixOrigine, int remise) {
        super(code, prixOrigine);
        if (remise < 0 || remise > 90) {
            throw new IllegalArgumentException("La remise doit être comprise entre 0 et 90.");
        }
        this.remise = remise;
    }

    public int getRemise() {
        return remise;
    }

    public void setRemise(int remise) {
        if (remise < 0 || remise > 90) {
            throw new IllegalArgumentException("La remise doit être comprise entre 0 et 90.");
        }
        this.remise = remise;
    }

    @Override
    public double prixProduit() {
        return super.getPrixOrigine() * (1 - (double) remise / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ";" + remise;
    }
}