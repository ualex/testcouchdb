package test;
import java.util.ArrayList;
import java.util.List;
import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;

public class FormularioCouchdb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HttpClient httpClient = new StdHttpClient.Builder()
			.host("localhost")
			.port(5984)
			.build();
		
		CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);		
        CouchDbConnector db = new StdCouchDbConnector("rad", dbInstance);
        
        FormularioRepository padRepository = new FormularioRepository(db);
        
        Formulario form = new Formulario();
        
        form.setDescricao("test");
        
        List<FormularioItem> itens = new ArrayList<FormularioItem>();
        
        FormularioItem ae = new FormularioItem();
        ae.setTipo(1);
        ae.setValor("Item 1");
        
        FormularioItem ae1 = new FormularioItem();
        ae1.setTipo(2);
        ae1.setValor("Item 2");        
        
        itens.add(ae);
        itens.add(ae1);
        
        form.setAtividadesEnsino(itens);
        
        padRepository.add(form);
        
        System.out.println("ID:"+form.getId());
        
        //db.createDatabaseIfNotExists();


	}

}
