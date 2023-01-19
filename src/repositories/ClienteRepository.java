package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import entities.Cliente;
import factories.ConnectionFactory;

public class ClienteRepository {

	public void create(Cliente cliente) throws Exception {
		Connection connection = ConnectionFactory.createConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("insert into cliente(nome, email) values(?, ?)");
		preparedStatement.setString(1, cliente.getNome());
		preparedStatement.setString(2, cliente.getEmail());

		preparedStatement.execute();
		preparedStatement.close();
	}

	public void uptade(Cliente cliente) throws Exception {
		// TODO
	}

	public void delete(Cliente cliente) throws Exception {
		// TODO
	}

	public List<Cliente> findAll() throws Exception {
		// TODO
		return null;
	}
}
