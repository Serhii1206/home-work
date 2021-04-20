package service;

import dao.AddressDao;
import emtity.Address;
import org.apache.log4j.Logger;

public class AddressService {
    Logger logger = Logger.getLogger(AddressService.class);

    public void save(Address address) {
        logger.debug(address.toString());
        AddressDao addressDao = new AddressDao();
        addressDao.save(address);
    }
}
