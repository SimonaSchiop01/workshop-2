package pl.coderslab.dao;

import pl.coderslab.entity.User;

public class MainDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
//        User user = new User();
//        user.setUserName("arek");
//        user.setEmail("arkadiusz.jozwiak@coderslab.pl");
//        user.setPassword("pass");
//        userDao.create(user);
//        userDao.resetId();
//
//        User read = userDao.read(1);
//        System.out.println(read);
//
//        User readNotExist = userDao.read(2);
//        System.out.println(readNotExist);

        User firstUser = new User();
        firstUser.setUserName("mark");
        firstUser.setEmail("mark@coderslab.pl");
        firstUser.setPassword("pass");
        userDao.create(firstUser);

        User userToUpdate = userDao.read(2);
        userToUpdate.setUserName("mama");
        userToUpdate.setEmail("arek@coderslab.pl");
        userToUpdate.setPassword("superPassword");
        userDao.update(userToUpdate);


        User[] all = userDao.findAll();
        for (User u : all) {
            System.out.println(u);
        }

//        userDao.delete(1);
//        userDao.delete(3);
    }
}
