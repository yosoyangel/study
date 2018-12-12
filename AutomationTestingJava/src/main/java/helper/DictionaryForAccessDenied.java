package helper;

import java.util.HashMap;
import java.util.Map;

public class DictionaryForAccessDenied {
    public static String getTranslationForAccsessiIsDenied(String language) {
        Map<String,String> dictionary = new HashMap<String, String>();
        dictionary.put("en", "Access is denied");
        dictionary.put("es", "Acceso denegado");
        dictionary.put("su", "Доступ запрещен");
        dictionary.put("ru", "Доступ запрещен");
        dictionary.put("az", "Çıxış rədd edildi");
        dictionary.put("bg", "Достъпът е отказан");
        dictionary.put("cs", "Přístup je odepřen");
        dictionary.put("da", "Ingen adgang");
        dictionary.put("de", "Zugriff verweigert");
        dictionary.put("el", "Απαγορεύτηκε η πρόσβαση");
        dictionary.put("fr", "Accès refusé");
        dictionary.put("hi", "पहुँच निषेध है");
        dictionary.put("hr", "Pristup nije dopušten");
        dictionary.put("hu", "Hozzáférés megtagadva");
        dictionary.put("in", "Akses ditolak");
        dictionary.put("it", "Accesso negato");
        dictionary.put("ja", "アクセスが拒否されました");
        dictionary.put("ka", "წვდომა აკრძალულია");
        dictionary.put("ko", "페이지 엑세스가 거부되었습니다.");
        dictionary.put("lt", "");
        dictionary.put("pl", "Dostęp zabroniony");
        dictionary.put("pt", "Acesso recusado");
        dictionary.put("sr", "Pristup je odbijen");
        dictionary.put("th", "การเข้าถึงถูกปฏิเสธ");
        dictionary.put("tr", "Erişim Reddedildi");
        dictionary.put("uk", "У доступі відмовлено");
        dictionary.put("uz", "Кириш рад этилди");
        dictionary.put("vi", "Truy cập bị từ chối");
        dictionary.put("zh", "访问被拒绝");
        dictionary.put("tw", "訪問被拒絕");

    return dictionary.get(language);

}
}
