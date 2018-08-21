
public class Main {

	public static void main(String[] args) {
		System.out.println("pruebas con objeto tipo profesor");

		Profesor ap= new ProfesorArtesPlasticas();
		Profesor ed= new ProfesorEducacionFisica();
		Profesor mat= new ProfesorMatematicas();
		
		pruebaProfesor(ap);
		pruebaProfesor(ed);
		pruebaProfesor(mat);
		
		ProfesorArtesPlasticas ap01 = new ProfesorArtesPlasticas();
		pruebaProfesor (ap01);
		
	}

	public static void pruebaProfesor(Profesor p) {
		String exposicion= p.exponer();
		double califacion=p.evaluar();
		System.out.println("exposición"+ exposicion);
		System.out.println("califacion"+ califacion);
	}
}
