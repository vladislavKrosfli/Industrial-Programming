import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class contacts {
    private String name;
    private String number;
    private String email;

    private String workNumber;
    private String homeNumber;
    private String website;
    private String address;

    public String getName(){
        return name;
    }

    public String getNumber(){
        return number;
    }

    public String getEmail(){
        return email;
    }

    contacts(String inputStr){
        String[] tmpStr = inputStr.split(" ");

        for(int i = 0; i < tmpStr.length; i++){
            Pattern pEmail = Pattern.compile("([A-Z]|[a-z]|[0-9])*@[a-z]*\\.[a-z]*");
            Pattern pNumber = Pattern.compile("\\+375(33|29|44|25)[0-9]{7}");

            Matcher m1 = pEmail.matcher(tmpStr[i]);
            Matcher m2 = pNumber.matcher(tmpStr[i]);

            if(tmpStr[i] == "") {
                continue;
            }

            else if(m1.matches()) {
                email = tmpStr[i];
            }

            else if(m2.matches()){
                number = tmpStr[i];
            }

            else{
                name = tmpStr[i];
            }
        }
    }


    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class compareName implements Comparator<contacts> {

    public int compare(contacts a, contacts b){

        return a.getName().compareTo(b.getName());
    }
}

class compareEmail implements Comparator<contacts>{

    public int compare(contacts a, contacts b) {
        return a.getName().compareTo(b.getName());
    }
}
