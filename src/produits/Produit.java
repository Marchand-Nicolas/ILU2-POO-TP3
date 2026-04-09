package produits;

enum Unite {
	GRAMME("g"),
	KILOGRAMME("kg"),
	LITRE("l"),
	CENTILITRE("cl"),
	MILLILITRE("ml"),
	PAR_PIECE("piece");
	
	private final String text;

    Unite(final String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        return text;
    }
}

public abstract class Produit {
	public abstract String getNom();
	
	public abstract String decrireProduit();
}
