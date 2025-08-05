package tb;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes4.dex */
public class dat {
    public static String a() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    public static String a(int i) {
        if (i == 0) {
            return a();
        }
        return a() + "-" + i + "-" + (Calendar.getInstance().get(11) / i);
    }
}
