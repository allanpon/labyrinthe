package tests;
import composants.Piece;
import composants.Plateau;
import grafix.interfaceGraphique.IG;

public class TestPlateau {
	public static void main(String[] args) {
		Object parametres[];
		parametres=IG.saisirParametres();
		int nbJoueurs=((Integer)parametres[0]).intValue();
		IG.creerFenetreJeu("D�mo Librairie IG version 1.9",nbJoueurs);
		//Changement des pieces du plateau
		for(int i =0;i< 7;i++) {
			for(int j=0;j<7;j++) {
				IG.changerPiecePlateau(i, j, 0, 0);
			}
		}
		
		//Initialisation des stats des joueurs sur le c�t�
		int numImageJoueur0=((Integer)parametres[3]).intValue();
		String nomJoueur0=(String)parametres[1];
		String categorieJoueur0=(String)parametres[2];

		int numImageJoueur1=((Integer)parametres[6]).intValue();
		String nomJoueur1=(String)parametres[4];
		String categorieJoueur1=(String)parametres[5];
		
		int numImageJoueur2=((Integer)parametres[9]).intValue();
		String nomJoueur2=(String)parametres[7];
		String categorieJoueur2=(String)parametres[8];
		
		IG.changerPieceHorsPlateau(0,0);
		
		//Affichage des stats des joueurs sur le c�t�
		IG.changerNomJoueur(0, nomJoueur0+" ("+categorieJoueur0+")");
		IG.changerImageJoueur(0,numImageJoueur0);
		IG.changerNomJoueur(1, nomJoueur1+" ("+categorieJoueur1+")");
		IG.changerImageJoueur(1,numImageJoueur1);
		IG.changerNomJoueur(2, nomJoueur2+" ("+categorieJoueur2+")");
		IG.changerImageJoueur(2,numImageJoueur2);
		IG.rendreVisibleFenetreJeu();
		IG.jouerUnSon(2); // On joue le son num�ro 2
		String message[]={
				"",
				"",
				"Cliquer pour continuer ...",
				""
		};
		IG.afficherMessage(message); // On change de message de la fen�tre de jeu
		IG.miseAJourAffichage(); // On effectue le rafraichissement de la fen�tre de jeu
		IG.attendreClic();
		//1er clic
		Plateau plateau = new Plateau();
		Piece pieceHorsPlateau = plateau.placerPiecesAleatoirement();
		for(int i =0;i< 7;i++) {
			for(int j=0;j<7;j++) {
				IG.changerPiecePlateau(i, j, plateau.getPiece(i,j).getModelePiece(), plateau.getPiece(i,j).getOrientationPiece());
			}
		}
		IG.changerPieceHorsPlateau(pieceHorsPlateau.getModelePiece(),pieceHorsPlateau.getOrientationPiece());
		IG.miseAJourAffichage(); // On effectue le rafraichissement de la fen�tre de jeu
		IG.attendreClic();
		//2eme clic
		int[][] tabTempo = new int[0][0];
		int[][] tab = tabTempo;
		for(int l =0;l<7;l++) {
			for(int m = 0;m<7;m++) {
				tabTempo = plateau.calculeChemin(3,3,l,m);
				if(tabTempo != null) {
					if(tabTempo.length > tab.length) {
						tab = tabTempo;
					}
				}
			}
		}
        for(int i = 0;i < tab.length;i++) {
            IG.placerBilleSurPlateau(tab[i][0], tab[i][1], 1, 1, 1);
        }
        IG.miseAJourAffichage();
		
		
		System.out.println("Deuxi�me clic effectu�");
	}
}
