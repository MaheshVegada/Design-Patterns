package DAO;

public class RDBMSDAO implements CircleDAO {

    @Override
    public void insertCircle(CircleTransfer circle) {
        System.out.println("insert Circle implementation");
    }

    @Override
    public CircleTransfer findCircle(int id) {
        return null;
    }

    @Override
    public void deleteCircle(int id) {
    }
}
