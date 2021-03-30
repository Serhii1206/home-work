package service;

import dao.ClientDao;
import entity.Clients;

public class ClientService {
    ClientDao clientDao = new ClientDao();
    public void save(Clients client) {

        clientDao.save(client);
    }

    public void update(Clients client) {
        clientDao.update(client);
    }

    public void delete(Clients client) {
        clientDao.delete(client);
    }

    public Clients getById(long id) {
        return clientDao.getById(id);
    }

    public Clients getByPhone(long phone) {
        return clientDao.getByPhone(phone);

    }
}
