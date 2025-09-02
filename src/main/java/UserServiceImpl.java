
public class UserServiceImpl implements UserService{


    @Override
    public User createUser(String firstName,String lastName,String email,String password) {
        if (firstName==null||firstName.length()==0){
            throw new IllegalArgumentException("user first name empty");
        }

        return new User(firstName,lastName,email,password);
    }
}
