package service;

import dao.ClientDao;
import emtity.Client;
import org.apache.log4j.Logger;

public class ClientService {
    Logger logger = Logger.getLogger(ClientService.class);

    public void save(Client client) {
        logger.debug(client.toString());
        ClientDao clientDao = new ClientDao();
        clientDao.save(client);
    }
}
