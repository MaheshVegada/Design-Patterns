package Iterator;

public class Test {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        for (Iterator itrVar = namesRepository.getIterator();itrVar.hasNext();) 
        {
            String name = (String) itrVar.next();
            System.out.println("Name : " + name);
        }
    }
}
