package task2.AppMenu;

import java.util.Locale;

public enum LanguageSelect {

    ENGLISH (0, new Locale("en", "US")),
    RUSSIAN (1, new Locale("ru", "RU"));

    private int key;
    private Locale locale;

    LanguageSelect(int key, Locale locale){
        this.key = key;
        this.locale = locale;
    }

    public int getKey() {
        return key;
    }

    public Locale getLocale() {
        return locale;
    }

    public static void showAppMenu(){
        for(LanguageSelect value : LanguageSelect.values()){
            System.out.printf("%s. %s%n", value.key, value.locale.getDisplayLanguage(Locale.ENGLISH));
        }
    }

    public static LanguageSelect getLanguageByKey (int insertKey){
        LanguageSelect current = null;
        for(LanguageSelect value : LanguageSelect.values()){
            if(insertKey == value.key)
                current = value;
        }
        return current == null ? LanguageSelect.ENGLISH : current;
    }

    public static LanguageSelect getLanguageByLocale (Locale insertLocale){
        LanguageSelect current = null;
        for(LanguageSelect value : LanguageSelect.values()){
            if(insertLocale == value.locale)
                current = value;
        }
        return current == null ? LanguageSelect.ENGLISH : current;
    }
}
