import java.sql.*;

public class sqlTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/test"; // url for connection
        String uname = "root"; // username
        String pass = ""; // password input
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement();
        String query = "select * from EngineeringStudents" ; // selecting
        ResultSet rs = st.executeQuery(query);
        int x = 1;
        while(rs.next()){
            System.out.println(x+")");
            for(int i = 1; i <=6;i++){
                System.out.print(rs.getString(i)+ " ");
            }
            System.out.println();
            x++;

    }
st.close();
        con.close();
    }
}
