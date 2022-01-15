package repository;

import java.sql.Connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import es.salesianos.connection.ConnectionManager;
import modelo.Student;

@Repository
public class H2repo {

	@Autowired
	ConnectionManager cm;

	@Value("${app.jdbcurl}")
	private String jdbcurl;

	public void insertar(Student student) {
		final String sql_de_insertar = "INSERT INTO student (edad) VALUES (" + student.getEdad() + ")";
		Connection connection = cm.open(jdbcurl);
		System.out.println("guardando en H2");
		cm.executeSql(connection, sql_de_insertar);
		cm.close(connection);
	}

}
