package tb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes6.dex */
public class kfo {

    /* renamed from: a  reason: collision with root package name */
    private static int[] f30040a;
    private static final SimpleDateFormat b;
    private static final SimpleDateFormat c;

    static {
        kge.a(813977364);
        f30040a = new int[]{1, 2, 5, 11, 12, 13, 14};
        b = new SimpleDateFormat("yyyy-MM-dd");
        c = new SimpleDateFormat("yyyy.MM");
    }

    public static Calendar a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.applyPattern("yyyyMMddHHmmss");
        try {
            Date parse = simpleDateFormat.parse(str.trim());
            Calendar calendar = Calendar.getInstance();
            try {
                calendar.setTime(parse);
                return calendar;
            } catch (ParseException unused) {
                return calendar;
            }
        } catch (ParseException unused2) {
            return null;
        }
    }
}
