import java.sql.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {

            connection = helper.getConnection();
            String sql = "delete from world.city  WHERE  id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4084);

            int result = statement.executeUpdate();
            System.out.println("kayıt silindi");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);

        } finally {
            statement.close();
            connection.close();
        }


    }


    public static void insertDemo() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {

            connection = helper.getConnection();
            String sql = "insert into world.city (Name,CountryCode,District,Population) values(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Sivas");
            statement.setString(2,"TUR");
            statement.setString(3,"TURKEY");
            statement.setInt(4,40000);
            int result = statement.executeUpdate();
            System.out.println("kayıt eklendi");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);

        } finally {
            statement.close();
            connection.close();
        }
    }


    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {

            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT Code,Name,Continent,Region FROM world.country");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()) {
                countries.add(new Country(resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }

            System.out.println(countries.size());
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);

        } finally {
            connection.close();
        }

    }
    public static void updateDemo() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {

            connection = helper.getConnection();
            String sql = "update world.city set Population=80000 WHERE  id=4085";
            statement = connection.prepareStatement(sql);

            int result = statement.executeUpdate();
            System.out.println("kayıt güncellendi");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);

        } finally {
            statement.close();
            connection.close();
        }
    }
}