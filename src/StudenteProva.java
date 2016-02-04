
public class StudenteProva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// dichiaro che la variabile stdA è di tipo Studente:
		Studente stdA = new Studente();

		//inizializzo stdA:
		stdA.nome = "Carlo";
		stdA.voto1 = 4; 
		stdA.voto2 = 5; 
		stdA.voto3 = 7;

		// stampo la media dei voti di stdA:

		System.out.println("Media voti di " + stdA.nome +": " + stdA.mediaVoti());

		// definisco un nuovo studente:

		Studente stdB = new Studente();
		stdB.nome = "Antonio"; 
		stdB.voto1 = 1;
		stdB.voto2 = 8; 
		stdB.voto3 = 5;

		// decido chi è più bravo:
		if (stdA.mediaVoti() > stdB.mediaVoti())
		    System.out.println(stdA.nome + " e' piu' bravo di " + stdB.nome);
		else
		    System.out.println(stdB.nome + " e' piu' bravo di " + stdA.nome);
	}

}
