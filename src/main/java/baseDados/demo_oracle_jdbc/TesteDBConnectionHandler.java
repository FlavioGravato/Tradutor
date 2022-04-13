package baseDados.demo_oracle_jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TesteDBConnectionHandler {

    public static void main(String[] args) {
        
        DBConnectionHandler dbConnHandler = null;
        
        try {
            String jdbcUrl = "jdbc:oracle:thin:@vsrvbd1.dei.isep.ipp.pt:1521/pdborcl";
            String username = "UPSKILL_BD_TURMA1_08";
            String password = "qwerty";
            
            dbConnHandler = new DBConnectionHandler(jdbcUrl, username, password);
            
            System.out.println("\nEstabelecer a ligação à BD...");
            dbConnHandler.openConnection();

            System.out.println("\t... Ligação obtida.");
            
            //invocação dos métodos da classe responsável pela ligação
            dbConnHandler.createStatement();

            //String sql = "DROP TABLE Employee";
           //dbConnHandler.drop(sql);

         /*  String createTable ="CREATE TABLE Linguas ("
                    + "sigla VARCHAR (50) not null,"
                    + "descricao VARCHAR (50) not null,"
                    + "constraint pk_sigla primary key (sigla) enable)" ;
            boolean bool = dbConnHandler.create(createTable);
            System.out.println(bool);*/

            //String insertData1="INSERT INTO Linguas "
           // +"VALUES ('PT', 'Português')";

           /* String insertData2="INSERT INTO Linguas "
            +"VALUES ('ENG', 'Inglês')";

            String insertData3="INSERT INTO Linguas "
            +"VALUES ('FR', 'Francês')";

            String insertData4="INSERT INTO Linguas "
            +"VALUES ('ESP', 'Model.Espanhol')";*/

           // dbConnHandler.insert(insertData1);
//            dbConnHandler.insert(insertData2);
//            dbConnHandler.insert(insertData3);
//            dbConnHandler.insert(insertData4);

//            String createTable =" CREATE TABLE Model.Portugues ("
//                    +"sigla VARCHAR (50) not null, "
//                    +"idPalavra VARCHAR (50) not null, "
//                    +"descricao VARCHAR (50) not null, "
//                    +"constraint pk_idPalavra primary key (idPalavra) enable )" ;
//            boolean bool = dbConnHandler.create(createTable);
//            System.out.println(bool);
          //  String alter ="ALTER TABLE Model.Portugues ADD CONSTRAINT fkLinguaSigla FOREIGN KEY (sigla) REFERENCES Linguas (sigla)";
          //  dbConnHandler.create(alter);

           /* String createTable = "CREATE TABLE Model.Ingles ("
                    +"sigla VARCHAR (50) not null,"
                    +"idPalavra VARCHAR (50) not null, "
                    +"descricao VARCHAR (50) not null, "
                    +"constraint pk_idPalavraIngles primary key (idPalavra) enable)";
            boolean bool = dbConnHandler.create(createTable);
            System.out.println(bool);*/


            //String alter= "ALTER TABLE Model.Ingles ADD CONSTRAINT fkLinguaSiglaIng FOREIGN KEY (sigla) REFERENCES Linguas (sigla)";
            //dbConnHandler.create(alter);

//            String insertData1="INSERT INTO Model.Portugues "
//            +"VALUES ('PT', 'id_1', 'Olá')";
//            String insertData2= "INSERT INTO Model.Portugues "
//            +"VALUES ('PT', 'id_2', 'Hoje')";
//            String insertData3="INSERT INTO Model.Portugues "
//            +"VALUES ('PT', 'id_3', 'Amanhã')";
//            String insertData4= "INSERT INTO Model.Portugues "
//            +"VALUES ('PT', 'id_4', 'Férias')";

//            dbConnHandler.insert(insertData1);
//            dbConnHandler.insert(insertData2);
//            dbConnHandler.insert(insertData3);
//            dbConnHandler.insert(insertData4);









//            String createTable = "CREATE TABLE Employee( "
//                    + "Name VARCHAR(255), "
//                    + "Salary INT NOT NULL, "
//                    + "Location VARCHAR(255))";

           // boolean bool = dbConnHandler.create(createTable);
            //System.out.println(bool);

  /*         String insertData1 = "INSERT INTO Employee(Name, Salary, Location)"
                   + " VALUES('JOAO', 23000, 'Coimbra')" ;
           String insertData2 =  "INSERT INTO Employee(Name, Salary, Location)" +
                   " VALUES('Pedro', 45000, 'Aveiro')" ;
           String insertData3 =  "INSERT INTO Employee(Name, Salary, Location)" +
                    " VALUES('Miguel', 23000, 'Porto')";*/

           String lerData= "SELECT * FROM Model.Portugues";
            ResultSet rs=dbConnHandler.select(lerData);


//            while (rs.next()) {
//                String Name = rs.getString("Name");
//                int Salary = rs.getInt("Salary");
//                String location= rs.getString("location");
//                System.out.println(Name + " , " + Salary +" , " + location+"\n" );
//            }
            while(rs.next()){
                String sigla=rs.getString("sigla");
                String idPalavra=rs.getString("idPalavra");
                String descricao=rs.getString("descricao");
                System.out.println(sigla+","+idPalavra+","+descricao+","+"\n");
            }

           // ResultSetMetaData rsMetaData = rs.getMetaData();
         //   System.out.println("List of column names in the current table: ");
            //Retrieving the list of column names
            //int count = rsMetaData.getColumnCount();
           // for(int j = 1; j<=count; j++) {
          //      System.out.println(rsMetaData.getColumnName(j));
           // }

            // Porque não funciona
            //String insertData = "INSERT INTO Employee("
            //        + "Name, Salary, Location) VALUES "
            //        + "('Amit', 30000, 'Hyderabad'), "
            //        + "('Kalyan', 40000, 'Vishakhapatnam'), "
            //        + "('Renuka', 50000, 'Delhi'), "
            //        + "('Archana', 15000, 'Mumbai')";

        /*    int i = dbConnHandler.insert(insertData1);
            dbConnHandler.insert(insertData2);
            dbConnHandler.insert(insertData3);
           System.out.println("Rows inserted: "+i);
*/
//String query = "INSERT INTO table (id, name, value) VALUES (?, ?, ?)";
//PreparedStatement ps = connection.prepareStatement(query);
//for (Record record : records) {
//    ps.setInt(1, record.id);
//    ps.setString(2, record.name);
//    ps.setInt(3, record.value);
//    ps.addBatch();
//}
//ps.executeBatch();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            String mensagem = dbConnHandler.closeAll();
            if (!mensagem.isEmpty())
                System.out.println(mensagem);
            System.out.println("\nTerminada a ligação à BD.");
            dbConnHandler.closeAll();
        }
        
    }

}
