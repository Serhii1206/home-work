import entity.Clients;
import service.AccountService;
import service.ClientService;
import service.StatusService;
import util.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        StatusService statusService = new StatusService();
        ClientService clientService = new ClientService();
        Clients client = new Clients();

      //Add new client
//        client.setName("Anton");
//        client.setEmail("Antoha@ukr.net");
//        client.setPhone(380998574100l);
//        client.setAbout("text");
//        client.setAge(27);
//        clientService.save(client);

        Clients client2 = new Clients();
//        client2.setName("Ihor");
//        client2.setEmail("Ihor@ukr.net");
//        client2.setPhone(380998374100l);
//        client2.setAbout("text");
//        client2.setAge(22);
//        clientService.save(client2);

        // update
//        client.setAge(29);
//        client.setEmail("Antoha@ukr.com");
//        client.setAbout("Text..");
//        clientService.update(client);

     //getById
//        System.out.println(clientService.getById(58));
//        System.out.println(clientService.getById(6));
//        System.out.println(accountService.getById(3));


        //getByPhone
//        System.out.println(clientService.getByPhone(380998574100l));
//        System.out.println(clientService.getByPhone(380998374100l));

        //delete
//        clientService.delete(client);
//        clientService.delete(client2);
    }
}
