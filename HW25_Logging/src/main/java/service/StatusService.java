package service;

import dao.StatusDao;
import emtity.Status;
import org.apache.log4j.Logger;

public class StatusService {
    Logger logger = Logger.getLogger(StatusService.class);

    public void save(Status status) {
        logger.debug(status.toString());
        StatusDao statusDao = new StatusDao();
        statusDao.save(status);
    }
}
