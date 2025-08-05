package tb;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;

/* loaded from: classes4.dex */
public class dal {
    public static final String AUTH_APP_INFO = "AUTH_APP_INFO";
    private Context b;

    public dal(Context context) {
        this.b = context;
    }

    private String c(Context context) {
        try {
            return czn.a(UUID.randomUUID().toString() + czl.a(context) + czl.b(context) + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String a() {
        String str = (String) daw.a(this.b, "AUTH_APP_INFO", "uniqueId", "");
        if (TextUtils.isEmpty(str)) {
            String c = c(this.b);
            daw.b(this.b, "AUTH_APP_INFO", "uniqueId", c);
            return c;
        }
        return str;
    }
}
