package application;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws SQLException, IOException {
		
		DepartmentDaoJDBC depdao = (DepartmentDaoJDBC) DB.getConnection();
		
		Department department = new Department(null, "CQ");
		
		depdao.deleteById(8);
		
		List<Department> list = depdao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		
	}
}
