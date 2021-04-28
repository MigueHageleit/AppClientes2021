import java.util.List;
import java.util.ArrayList;
public class ClienteRepository {

	public List<Cliente> clientes;

	public ClienteRepository() {
		clientes = new ArrayList<>(); //Inferencia de tipos (no va "clienetes entre <>")

		clientes.add(new Cliente(1, "Diaz", "Jorgito"));
		clientes.add(new Cliente(2, "Toledo", "Lucas"));
		clientes.add(new Cliente(3, "Hageleit", "El flaco"));

	}

	public List<Cliente> getClientes() {
		return clientes;
	}


}