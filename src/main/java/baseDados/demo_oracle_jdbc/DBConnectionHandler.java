package baseDados.demo_oracle_jdbc;

import oracle.jdbc.pool.OracleDataSource;

import java.sql.*;

public class DBConnectionHandler {

    private String jdbcUrl;
    private String username;
    private String password;

    private Connection connection;
    private PreparedStatement prepStmt;
    private Statement stmt;
    private ResultSet rSet;

    public DBConnectionHandler(String jdbcUrl, String username, String password) {
        this.jdbcUrl = jdbcUrl;
        this.username = username;
        this.password = password;

        connection = null;
        prepStmt = null;
        rSet = null;
        stmt = null;
    }

    public void openConnection() throws SQLException {
        OracleDataSource ds = new OracleDataSource();
        ds.setURL(jdbcUrl);
        connection = ds.getConnection(username, password);
    }

    public void createStatement() throws SQLException {
        stmt = connection.createStatement();
        }

    public String closeAll() {

        StringBuilder message = new StringBuilder("");

        if (rSet != null) {
            try {
                rSet.close();
            } catch (SQLException ex) {
                message.append(ex.getMessage());
                message.append("\n");
            }
            rSet = null;
        }

        if (prepStmt != null) {
            try {
                prepStmt.close();
            } catch (SQLException ex) {
                message.append(ex.getMessage());
                message.append("\n");
            }
            prepStmt = null;
        }

        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                message.append(ex.getMessage());
                message.append("\n");
            }
            prepStmt = null;
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                message.append(ex.getMessage());
                message.append("\n");
            }
            connection = null;
        }
        return message.toString();
    }

    //incluir métodos para executar query

   //DDL
    public boolean create(String sqlCreate) throws SQLException{
        boolean bool = stmt.execute(sqlCreate);

        return bool;
    }
    //DML - Insert
    public int insert(String sqlInsert) throws SQLException {
        int numRecords = stmt.executeUpdate(sqlInsert);

        return numRecords;
    }

    //DQL - Select
    public ResultSet select(String sqlSelect) throws SQLException {
        return( stmt.executeQuery(sqlSelect));
    }

    public void drop(String sqlDrop) throws SQLException{
           stmt.executeUpdate(sqlDrop);
    }
}
