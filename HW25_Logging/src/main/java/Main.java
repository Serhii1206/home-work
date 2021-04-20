import emtity.Address;
import emtity.Car;
import emtity.Client;
import emtity.Status;
import service.AddressService;
import service.CarService;
import service.ClientService;
import service.StatusService;

public class Main {
    public static void main(String[] args) {
        AddressService addressService = new AddressService();
        CarService carService = new CarService();
        ClientService clientService = new ClientService();
        StatusService statusService = new StatusService();


        Client client = new Client();
        client.setName("Den");
        client.setEmail("Den226622@mail.com");
        client.setPhone(380931438122l);
        client.setAge(29);

        Car ford = new Car();
        ford.setModel("mondeo");
        ford.setColor("red");
        ford.setYear(2005);

        Address address = new Address();
        address.setCity("Lviv");
        address.setStreet("Drahomanova");
        address.setNumber(10);
        address.setPostcode("4578521");


        addressService.save(address);
        carService.save(ford);
        clientService.save(client);

        Client client1 = new Client();
        client1.setName("Ihor2");
        client1.setEmail("Ihor2@mail.com");
        client1.setPhone(380971768122l);
        client1.setAge(40);

        Car ford2 = new Car();
        ford2.setModel("fiesta");
        ford2.setColor("red");
        ford2.setYear(2009);

        Address address2 = new Address();
        address2.setCity("Lviv");
        address2.setStreet("Drahomanova");
        address2.setNumber(20);
        address2.setPostcode("4578521");

        Status status = new Status();
        status.setDescriptions("Vip");

        addressService.save(address2);
        carService.save(ford2);
        clientService.save(client1);
        statusService.save(status);

    }
}
