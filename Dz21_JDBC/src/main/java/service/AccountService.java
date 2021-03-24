package service;


import database.Database;
import entity.Accounts;
import entity.Clients;

import java.sql.*;
import java.util.*;

public class AccountService {
    private static final String SELECT_ALL_ACCOUNTS_QUERY = "SELECT * FROM accounts";
    private static final String SAVE_ACCOUNTS_QUERY = "INSERT INTO accounts(client_id,number,value) VALUES(?,?,?)";
    private static final String UPDATE_ACCOUNT_QUERY = "UPDATE accounts SET client_id = ?, number = ?, value = ? WHERE id = ?";
    private static final String DELETE_ACCOUNTS_QUERY = "DELETE FROM accounts WHERE id = ?";
    private static final String SELECT_NUMBER_FROM_ACCOUNTS_WHERE_VALUE_MORE = "SELECT number FROM accounts WHERE value > ?";
    private static final String SELECT_BY_ID_CLIENT_QUERY = "SELECT * FROM clients c INNER JOIN accounts a ON c.id = a.client_id";

    public static List<Accounts> getAll() {
        List<Accounts> accounts = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_ACCOUNTS_QUERY);
            while (resultSet.next()) {
                Accounts account = new Accounts();
                account.setId(resultSet.getInt("id"));
                account.setClient_Id(resultSet.getInt("client_id"));
                account.setNumber(resultSet.getString("number"));
                account.setValue(resultSet.getDouble("value"));
                accounts.add(account);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public static void save(Accounts account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SAVE_ACCOUNTS_QUERY)) {
            preparedStatement.setInt(1, account.getClient_Id());
            preparedStatement.setString(2, account.getNumber());
            preparedStatement.setDouble(3, account.getValue());
            preparedStatement.setInt(4, account.getId());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Accounts account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_ACCOUNT_QUERY)) {
            preparedStatement.setInt(1, account.getClient_Id());
            preparedStatement.setString(2, account.getNumber());
            preparedStatement.setDouble(3, account.getValue());
            preparedStatement.setInt(4, account.getId());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void delete(Accounts account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_ACCOUNTS_QUERY)) {
            preparedStatement.setInt(1, account.getId());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Accounts> selectByValue(double value) {
        List<Accounts> accountFind = new ArrayList<>();

        try (Connection connection = Database.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_NUMBER_FROM_ACCOUNTS_WHERE_VALUE_MORE);
            preparedStatement.setDouble(1, value);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Accounts account = new Accounts();
                account.setNumber(resultSet.getString("number"));
                accountFind.add(account);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accountFind;
    }

    public static Map<Accounts, Clients> getClientIdAccountId() {
        Map<Accounts, Clients> clientsMap = new HashMap<>();
        List<Accounts> accounts = new ArrayList<>();
        List<Clients> clients = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_BY_ID_CLIENT_QUERY);
            while (resultSet.next()) {
                Accounts account = new Accounts();
                Clients client = new Clients();
                account.setId(resultSet.getInt("id"));
                account.setClient_Id(resultSet.getInt("client_id"));
                account.setNumber(resultSet.getString("number"));
                account.setValue(resultSet.getDouble("value"));
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setPhone(resultSet.getLong("phone"));
                client.setAbout(resultSet.getString("about"));
                client.setAge(resultSet.getInt("age"));
                accounts.add(account);
                clients.add(client);
                clientsMap.put(account, client);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientsMap;


    }
}