package phonebook;
import java.util.HashMap;
import java.util.Map;

public class Phonebook{


    private static final Map<String, String> phonebook = new HashMap<>();

    public void addPhone (String contact, String number){
        phonebook.put(contact, number);
    }
    public void removePhone (String contact){
        phonebook.remove(contact);
    }

    @Override
    public String toString() {
        return "Телефонная книга : "+phonebook+"\n";
    }
}
