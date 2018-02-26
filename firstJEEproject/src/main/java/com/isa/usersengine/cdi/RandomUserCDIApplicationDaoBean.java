package com.isa.usersengine.cdi;

import com.isa.usersengine.dao.UsersRepositoryDao;
import com.isa.usersengine.domain.User;
import com.isa.usersengine.repository.UsersRepository;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Random;

@ApplicationScoped
public class RandomUserCDIApplicationDaoBean implements RandomUserCDIApplicationDao {

    int random = new Random().nextInt(3);

    @EJB
    UsersRepositoryDao usersRepositoryDao;

    @Override
    public User getRandomUser() {
        return usersRepositoryDao.getUserList().get(random);
    }
}
