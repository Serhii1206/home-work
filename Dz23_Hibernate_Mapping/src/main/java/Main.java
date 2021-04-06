import entity.Address;
import entity.Car;
import entity.Client;
import entity.Status;
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


        Client client1 = new Client();
        client1.setName("Den");
        client1.setEmail("Den222@mail.com");
        client1.setPhone(380931668122l);
        client1.setAge(29);

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
        clientService.save(client1);
    }
}
