package composants;

/**
 *
 * Cette classe permet de reprÃ©senter les piÃ¨ces du jeu de modÃ¨le 0.
 *
 */
public class PieceM0 extends Piece {
    private int orientationPiece;
    /**
     * A Faire (01/05/21 Allan Ponchaut Finalisée)
     *
     * Constructeur permettant de construire une piÃ¨ce de modÃ¨le 0 et d'orientation 0.
     */
    public PieceM0() {
        // A Modifier !!!
        super(0,false,true,true,false);
        this.orientationPiece = 0;
    }

    public PieceM0(int orientationPiece) {
        super(0,false,true,true,false);
        this.orientationPiece = orientationPiece;
    }

    /**
     * A Faire (01/05/2021 Lucas Finalisée)
     *
     * MÃ©thode permettant de crÃ©er une copie de la piÃ¨ce (un nouvelle objet Java).
     * @return Une copie de la piÃ¨ce.
     */
    public Piece copy(){
        Piece piece=null;
        piece.setModelePiece(this.getModelePiece());
        piece.setOrientation(this.getOrientationPiece());
        piece.setPointsEntree(this.getPointsEntree());
        return piece;
    }
}