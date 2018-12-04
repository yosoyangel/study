package helper;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static String getTranslationForDoesntMeetReq(String language) {
        Map<String,String> dictionary = new HashMap<String, String>();
        dictionary.put("en", "The password does not meet the requirements");
        dictionary.put("es", "La contraseña no coincide con los requisitos");
        dictionary.put("su", "Пароль не соответствует требованиям");
        dictionary.put("ru", "Пароль не соответствует требованиям");
    return dictionary.get(language);

    }
}
