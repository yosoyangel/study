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
        dictionary.put("az", "Parol tələblərə cavab vermir");
        dictionary.put("bg", "Паролата не отговаря на изискванията");
        dictionary.put("cs", "Heslo neodpovídá požadavkům");
        dictionary.put("da", "Kodeordet opfylder ikke kravene");
        dictionary.put("de", "Das Passwort entspricht nicht den Anforderungen.");
        dictionary.put("el", "Ο κωδικός πρόσβασης δεν πληροί τις απαιτήσεις");
        dictionary.put("fr", "Le mot de passe ne respecte pas les exigences");
        dictionary.put("hi", "पासवर्ड अपेक्षाओं से मेल नहीं करता है।");
        dictionary.put("hr", "Lozinka ne ispunjava uvjete.");
        dictionary.put("hu", "A jelszó nem felel meg a követelménynek.");
        dictionary.put("in", "Sandi tidak sesuai dengan ketentuan");
        dictionary.put("it", "La password non soddisfa i requisiti");
        dictionary.put("ja", "パスワードが要件と一致しません");
        dictionary.put("ka", "პაროლი არ შეესაბამება მოთხოვნებს");
        dictionary.put("ko", "비밀번호가 요구조건에 부합하지 않음");
        dictionary.put("lt", "Slaptažodis neatitinka reikalavimų");
        dictionary.put("pl", "Hasło nie spełnia wymagań");
        dictionary.put("pt", "A password não corresponde aos requisitos");
        dictionary.put("sr", "Lozinka se ne poklapa sa zahtevima");
        dictionary.put("th", "รหัสผ่านไม่ตรงกับข้อกำหนด");
        dictionary.put("tr", "Şifre gereklilikleri karşılamıyor");
        dictionary.put("uk", "Пароль не відповідає нашим вимогам");
        dictionary.put("uz", "Парол талабларга жавоб бермайди");
        dictionary.put("vi", "Mật khẩu không khớp với yêu cầu");
        dictionary.put("zh", "密碼不符合要求");
        dictionary.put("tw", "密碼不符合要求");

        return dictionary.get(language);

    }
}
