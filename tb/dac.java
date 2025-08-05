package tb;

/* loaded from: classes4.dex */
public class dac {
    public static final String TABLE_NAME_LOGGER = "alitx_logger";
    public static final String TABLE_NAME_MONITOR = "alitx_monitor";

    public static String a(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,timestamp NUMERIC,urgency INTEGER,strategy INTEGER,upload_flag INTEGER,upload_count INTEGER,content TEXT)";
    }

    public static String b(String str) {
        return "CREATE INDEX log_index ON " + str + " (urgency,upload_flag,strategy" + riy.BRACKET_END_STR;
    }

    public static String e(String str) {
        return "DROP TABLE IF EXISTS " + str;
    }
}
