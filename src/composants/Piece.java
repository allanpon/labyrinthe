package composants;


/**
 *
 * Cette classe permet de reprÃ©senter les diffÃ©rentes piÃ¨ces du jeu.
 *
 */
abstract public class Piece {

    private int modelePiece; 		// Le modÃ¨le de la piÃ¨ce
    private int orientationPiece; 	// L'orientation de la piÃ¨ce
    private boolean[] pointsEntree; // Les points d'entrÃ©e indice 0 pour le haut, 1 pour la droite, 2 pour le bas et 3 pour la gauche.

    /**
     * A Faire (01/05/2021 Antoine Finalisée)
     *
     * Constructeur permettant de crÃ©er une piÃ¨ce d'un modÃ¨le avec l'orientation 0.
     * @param modelePiece Le modÃ¨le de la piÃ¨ce.
     * @param pointEntreeHaut Un boolÃ©en indiquant si la piÃ¨ce a un point d'entrÃ©e en haut.
     * @param pointEntreeDroite Un boolÃ©en indiquant si la piÃ¨ce a un point d'entrÃ©e Ã  droite.
     * @param pointEntreeBas Un boolÃ©en indiquant si la piÃ¨ce a un point d'entrÃ©e en bas.
     * @param pointEntreeGauche Un boolÃ©en indiquant si la piÃ¨ce a un point d'entrÃ©e Ã  gauche.
     */
    public Piece(int modelePiece,boolean pointEntreeHaut,boolean pointEntreeDroite,boolean pointEntreeBas,boolean pointEntreeGauche){

        this.modelePiece = modelePiece;
        this.pointsEntree = new boolean[4];
        pointsEntree[0] = pointEntreeHaut;
        pointsEntree[1] = pointEntreeDroite;
        pointsEntree[2] = pointEntreeBas;
        pointsEntree[3] = pointEntreeGauche;
        this.orientationPiece = 0;

    }

    /**
     * MÃ©thoide retournant un String reprÃ©sentant la piÃ¨ce.
     */
    @Override
    public String toString() {
        return "[m:"+modelePiece+"|o:"+orientationPiece+"|pe:"+pointsEntree[0]+" "+pointsEntree[1]+" "+pointsEntree[2]+" "+pointsEntree[3]+"]";
    }

    /**
     * A Faire (01/05/2021 Lucas Finalisée)
     *
     * MÃ©thode permettant de rotationner une piÃ¨ce dans le sens d'une horloge.
     */
    public void rotation(){
        if(modelePiece == 1){
            if(orientationPiece == 1){
                orientationPiece = -1;
            }
        }
        else{
            if(orientationPiece == 3){
                orientationPiece = -1;
            }
        }
        orientationPiece+= 1;
        this.setOrientation(this.orientationPiece);
    }

    // (01/05/21 Antoine Finalisée)
    public void setModelePiece(int newModelePiece) {
        this.modelePiece = newModelePiece;
    }

    // (01/05/21 Antoine Finalisée)
    public void setPointsEntree(boolean[] pointsEntree) {
        this.pointsEntree = pointsEntree;
    }

    /**
     * A Faire (01/05/2021 Allan Ponchaut Finalisée)
     *
     * MÃ©thode permettant d'orienter une piÃ¨ce vers une orientation spÃ©cifique.
     * @param orientationPiece Un entier correspondant Ã  la nouvelle orientation de la piÃ¨ce.
     */
    public void setOrientation(int orientationPiece){
        if(getModelePiece() == 0) {
            if(orientationPiece == 0) {
                this.setPointsEntree(new boolean[]{false, true, true, false});
                this.orientationPiece = 0;
            }
            else if(orientationPiece == 1) {
                this.setPointsEntree(new boolean[]{false, false, true, true});
                this.orientationPiece = 1;
            }
            else if(orientationPiece == 2) {
                this.setPointsEntree(new boolean[]{true, false, false, true});
                this.orientationPiece = 2;
            }
            else if(orientationPiece == 3) {
                this.setPointsEntree(new boolean[]{true, true, false, false});
                this.orientationPiece = 3;
            }
        }
        else if(getModelePiece() == 1) {
            if(orientationPiece == 0) {
                this.setPointsEntree(new boolean[]{true, false, true, false});
                this.orientationPiece = 0;
            }
            else if(orientationPiece == 1) {
                this.setPointsEntree(new boolean[]{false, true, false, true});
                this.orientationPiece = 1;
            }
        }
        else if(getModelePiece() == 2) {
            if(orientationPiece == 0) {
                this.setPointsEntree(new boolean[]{true, true, false, true});
                this.orientationPiece = 0;
            }
            else if(orientationPiece == 1) {
                this.setPointsEntree(new boolean[]{true, true, true, false});
                this.orientationPiece = 1;
            }
            else if(orientationPiece == 2) {
                this.setPointsEntree(new boolean[]{false, true, true, true});
                this.orientationPiece = 2;
            }
            else if(orientationPiece == 3) {
                this.setPointsEntree(new boolean[]{true, false, true, true});
                this.orientationPiece = 3;
            }
        }
    }

    /**
     * A Faire (01/05/2021 Lucas Finalisée)
     *
     * MÃ©thode retournant le modÃ¨le de la piÃ¨ce.
     * @return Un entier corrspondant au modÃ¨le de la piÃ¨ce.
     */
    public int getModelePiece() {
        return modelePiece;
    }

    /**
     * A Faire (01/05/21 Allan Ponchaut Finalisée)
     *
     * MÃ©thode retournant l'orientation de la piÃ¨ce.
     * @return un entier retournant l'orientation de la piÃ¨ce.
     */
    public int getOrientationPiece() {
        return orientationPiece;
    }

    /**
     * A Faire (01/05/21 Allan Ponchaut Finalisée)
     *
     * MÃ©thode indiquant si il existe un point d'entrÃ©e Ã  une certaine position (0: en haut, 1: Ã  droite, 2: en bas, 3: Ã  gauche).
     * @param pointEntree L'indice/la position du point d'entrÃ©e.
     * @return true si il y a un point d'entrÃ©e, sinon false.
     */
    public boolean getPointEntree(int pointEntree){
        return pointsEntree[pointEntree];
    }

    public boolean[] getPointsEntree(){
        return this.pointsEntree;
    }

    /**
     * A Faire (01/05/21 Tout le monde Finalisée)
     *
     * MÃ©thode permettant de crÃ©er un tableau contenant toutes les piÃ¨ces du jeu (les 50 piÃ¨ces).
     * Le tableau contiendra 20 piÃ¨ces du modÃ¨le 0, 12 piÃ¨ces du modÃ¨le 1 et 18 piÃ¨ces du modÃ¨le 2.
     * L'orientation de chaque piÃ¨ce sera alÃ©atoire.
     * @return Un tableau contenant toutes les piÃ¨ces du jeu.
     */
    public static Piece[] nouvellesPieces(){
        Piece pieces[]= new Piece[50];
        int i = 0;
        int cpt0 = 0;
        int cpt1 = 0;
        int cpt2 = 0;
        // A ComplÃ©ter (A Faire après les classes PieceM0, PieceM1 et PieceM2)
        while(i < 50) {
            int alea = Utils.genererEntier(2);
            if(alea == 0) {
                if(cpt0 < 20) {
                    pieces[i] = new PieceM0();
                    pieces[i].setOrientation(Utils.genererEntier(3));
                    cpt0 += 1;
                    i += 1;
                }
            }
            else if(alea == 1) {
                if(cpt1 < 12) {
                    pieces[i] = new PieceM1();
                    pieces[i].setOrientation(Utils.genererEntier(1));
                    cpt1 += 1;
                    i += 1;
                }
            }
            else if(alea == 2) {
                if(cpt2 < 18) {
                    pieces[i] = new PieceM2();
                    pieces[i].setOrientation(Utils.genererEntier(3));
                    cpt2 += 1;
                    i += 1;
                }
            }
        }
        return pieces;
    }

    /**
     * MÃ©thode permettant de crÃ©er une copie de la piÃ¨ce (un nouvelle objet Java).
     * @return Une copie de la piÃ¨ce.
     */
    public abstract Piece copy();
}