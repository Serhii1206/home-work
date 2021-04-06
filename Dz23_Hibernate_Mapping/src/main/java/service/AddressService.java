package service;

import dao.AddressDao;
import entity.Address;

public class AddressService {
    public void save(Address address) {
        AddressDao addressDao = new AddressDao();
        addressDao.save(address);
    }
}
