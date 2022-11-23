package model.dao.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import db.DB;
import model.entities.Department;

public class DepartmentDaoJDBC {

	private static Properties loadProperties() throws IOException {
		FileInputStream fs = new FileInputStream("db.properties");
		Properties props = new Properties();
		props.load(fs);
		return props;

	}


	public static Connection getConnection() throws SQLException, IOException {
		if (conn == null) {

			Properties props = loadProperties();
			String url = props.getProperty("dburl");
			conn = DriverManager.getConnection(url, props);

		}
		return conn;
	}

	private static Connection conn;


	public void insert(Department obj) throws SQLException {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("INSERT INTO department (Name) " + "VALUES (?) ",
					Statement.RETURN_GENERATED_KEYS);
			st.setString(1, obj.getName());

			int rows = st.executeUpdate();
			if (rows > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
				DB.closeResultSet(rs);
			} else {
				throw new SQLException("Error");
			}
		} catch (SQLException e) {
			throw new SQLException("Error");

		} finally {
			DB.closeStatement(st);
		}

	}

	public void update(Department obj) throws SQLException {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("UPDATE department " + "SET Name = ? WHERE Id = ?");

			st.setString(1, obj.getName());
			st.setInt(2, obj.getId());
			st.executeUpdate();
		} catch (SQLException e) {
			throw new SQLException("Error");
		} finally {
			DB.closeStatement(st);
		}

	}

	public void deleteById(Integer id) throws SQLException {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("DELETE FROM department WHERE Id = ?");
			st.setInt(1, id);
			int rows = st.executeUpdate();
			if (rows > 0) {
				System.out.println("ID " + id + " deleted");
			} else {
				System.out.println("Error !! Id no exist.");
			}
		} catch (SQLException e) {
			throw new SQLException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}
	}

	public Department findById(Integer id) throws SQLException {
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			st = conn.prepareStatement("SELECT * FROM department " + "WHERE Id = ?");

			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				Department dep = instantiateDepartment(rs);

				return dep;
			}
			return null;

		} catch (SQLException e) {
			throw new SQLException("Error");
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	public List<Department> findAll() throws SQLException {

		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			st = conn.prepareStatement("SELECT * FROM department ORDER BY Name");

			rs = st.executeQuery();

			List<Department> list = new ArrayList<>();

			while (rs.next()) {
				list.add(instantiateDepartment(rs));
			}
			return list;

		} catch (SQLException e) {
			throw new SQLException("Error");
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	private Department instantiateDepartment(ResultSet rs) throws SQLException {
		Department dep = new Department();
		dep.setId(rs.getInt("Id"));
		dep.setName(rs.getString("Name"));
		return dep;
	}

}
