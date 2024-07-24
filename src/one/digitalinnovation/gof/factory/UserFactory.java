package one.digitalinnovation.gof.factory;

public class UserFactory {
    public static UserAdmin newAdmin(Long id, String name) {
        return new UserAdmin(id, name);
    }
    
    public static UserOperator newOperator(Long id, String name) {
        return new UserOperator(id, name);
    }

}
