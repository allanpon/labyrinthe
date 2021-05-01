package composants;

/**
 *
 * Cette classe permet de reprÃ©senter les piÃ¨ces du jeu de modÃ¨le 1.
 *
 */
public class PieceM1 extends Piece {

    /**
     * A Faire (01/05/21 Allan Ponchaut Finalisée)
     *
     * Constructeur permettant de construire une piÃ¨ce de modÃ¨le 1 et d'orientation 0.
     */
    public PieceM1() {
        // A Modifier !!!
        super(1,true,false,true,false);
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