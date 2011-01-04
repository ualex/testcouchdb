package test;
import org.ektorp.*;
import org.ektorp.support.CouchDbRepositorySupport;

public class FormularioRepository extends CouchDbRepositorySupport<Formulario> {

	public FormularioRepository(CouchDbConnector db) {
		super(Formulario.class, db);
	}

}
