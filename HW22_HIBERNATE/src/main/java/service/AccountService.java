package service;

import dao.AccountDao;
import entity.Account;

public class AccountService {
    public void save(Account account) {
        AccountDao accountDao = new AccountDao();
        accountDao.save(account);
    }

    public void update(Account account) {
        AccountDao accountDao = new AccountDao();
        accountDao.update(account);
    }

    public void delete(Account account) {
        AccountDao accountDao = new AccountDao();
        accountDao.delete(account);
    }

    public Account getById(long id) {
        AccountDao accountDao = new AccountDao();
        return accountDao.getById(id);
    }
}
