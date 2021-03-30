import database.Database;
import entity.Accounts;
import entity.Clients;
import entity.Statuses;
import service.AccountService;
import service.ClientService;
import service.StatusService;

public class Main {
    public static void main(String[] args) {
        System.out.println(AccountService.selectByValue(20));

        Database.getConnection();
        System.out.println("We connected");

        Clients client = new Clients();
//        client.setName("Vova");
//        client.setAbout("Bla");
//        client.setPhone(380998587411l);
//        client.setEmail("Vova@meta.ua");
//        client.setAge(18);
//        client.setId(11);
//        ClientService.save(client);

//        System.out.println(ClientService.getAll());


//        client.setName("Ihor");
//        client.setId(1);
//        ClientService.update(client);


//        client.setId(9);
//        ClientService.delete(client);

//        findByPhone
//        System.out.println(ClientService.findByPhone(380958089092l));

        Accounts account = new Accounts();
//        account.setClient_Id(1);
//        account.setNumber("rm458563");
//        account.setValue(100.2);
//        AccountService.save(account);


//        account.setClient_Id(5);
//        account.setNumber("rm458545");
//        account.setValue(1000);
//        account.setId(9);
//        AccountService.update(account);

//        account.setId(8);
//        AccountService.delete(account);
//        System.out.println(AccountService.getAll());


        Statuses status = new Statuses();
//        status.setAlias("Stand");
//        status.setDescription("descrip");
//        StatusService.save(status);

//        status.setAlias("newAlias");
//        status.setDescription("newDescriotion");
//        status.setId(4);
//        StatusService.update(status);

//        status.setId(4);
//        StatusService.delete(status);


    }
}
