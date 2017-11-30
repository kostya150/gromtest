package lesson9.Homework;

public class UserRepository {
    private User[] users;


    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }


    public String[] getUserNames() {
        if (users != null) {
            int userN = 0;

            for (int i = 0; i < users.length; i++) {
                if (users[i] != null) {
                    userN++;
                }
            }
            String[] userNames = new String[userN];

            userN = 0;
            for (int i = 0; i < users.length; i++) {
                if (users[i] != null) {
                    userNames[userN] = users[i].getName();
                    userN++;
                }
            }
            return userNames;
        }
        return null;
    }


    public long[] getUserIds() {
        if (users != null) {
            int userId = 0;
            for (int i = 0; i < users.length; i++) {
                if (users[i] != null)
                    userId++;
            }
            long[] userIds = new long[userId];
            userId = 0;
            for (int i = 0; i < users.length; i++) {
                if (users[i] != null)
                    userIds[userId] = users[i].getId();
                userId++;
            }
            return userIds;
        }
        return null;
    }

    public String getUserNameById(long id) {
        String name = null;
        if (users != null) {
            for (User user : users) {
                if (user != null)
                    if (user.getId() == id)
                        name = user.getName();
            }
        }
        return name;
    }

    // UserRepository part 3
    public User getUserByName(String name) {
        if (users != null) {
            for (User user : users) {
                if (user != null)
                    if (user.getName() == name)
                        return user;
            }
        }
        return null;
    }

    public User getUserById(long id) {
        String name = null;
        if (users != null) {
            for (User user : users) {
                if (user != null)
                    if (user.getId() == id)
                        return user;

            }
        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        if (users != null) {
            for (User user : users) {
                if (user != null)
                    if (user.getSessionId() == sessionId)
                        return user;
            }
        }
        return null;
    }

    public User save(User user) {
        if (user != null) {
            if (user.equals(findById(user.getId())))
                return null;
            for (int i = 0; i <= users.length; i++) {
                if (users[i] == null) {
                    users[i] = user;
                    return user;
                }
            }

        }
        return null;


    }

    public User findById(long id) {
        if (users != null) {
            for (User user1 : users) {
                if (user1 != null)
                    if (user1.getId() == id)
                        return user1;

            }
        }
        return null;

    }

    //UserRepository part 5
    public User update(User user) {
        if (user != null) {
            if (users != null) {
                User rdUser = findById(user.getId());
                if (rdUser != null)
                    if (user.getId() == rdUser.getId()) {
                        for (int i = 0; i < users.length; i++) {
                            if (users[i] != null)
                                if (users[i].getId() == user.getId()) {
                                    users[i] = user;
                                }
                        }
                        return user;
                    }


            }
        }
        return null;
    }

    public void delete(long id) {
        if (users != null) {
            User rdUser = findById(id);
            if (rdUser != null) {
                if (id == rdUser.getId()) {
                    for (int i = 0; i < users.length; i++) {
                        if (users[i] != null)
                            if (users[i].getId() == id) {
                                users[i] = null;
                            }
                    }
                }
            }
        }


    }
}


