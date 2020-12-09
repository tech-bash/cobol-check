package com.neopragma.cobolcheck;

import java.util.Locale;
import java.util.ResourceBundle;

public class Messages {

    private ResourceBundle messageBundle;

    public Messages() {
        loadResourceBundle();
    }

    public String get(String messageId, String... substitutionValues) {
        return String.format(messageBundle.getString(messageId), substitutionValues);
    }

    public void setLocale(Locale locale) {
        Locale.setDefault(locale);
    }

    public void loadResourceBundle() {
        messageBundle = ResourceBundle.getBundle(this.getClass().getPackageName() + ".messages.messages",
                Locale.getDefault());
    }
}
