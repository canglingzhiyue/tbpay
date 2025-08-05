package tb;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes2.dex */
public class iqg {

    /* renamed from: a  reason: collision with root package name */
    public static volatile iqg f29229a;
    public String b = "https://mobilegw.alipay.com/mgw.htm";

    public static iqg a() {
        if (f29229a == null) {
            synchronized (iqg.class) {
                if (f29229a == null) {
                    f29229a = new iqg();
                }
            }
        }
        return f29229a;
    }

    public static boolean a(Context context) {
        try {
            return (context.getPackageManager().getApplicationInfo(context.getPackageName(), 16384).flags & 2) != 0;
        } catch (Exception e) {
            String str = "isDebug exception.  " + e.toString();
            return false;
        }
    }

    public final String b(Context context) {
        String str = this.b;
        if (a(context)) {
            String str2 = this.b;
            Cursor query = context.getContentResolver().query(Uri.parse("content://com.alipay.setting/GWFServerUrl"), null, null, null, null);
            if (query == null || query.getCount() <= 0) {
                if (query == null || query.isClosed()) {
                    return str2;
                }
                query.close();
                return str2;
            }
            query.moveToFirst();
            String string = query.getString(0);
            query.close();
            String str3 = "getValue.  cursor exist.  uri=[content://com.alipay.setting/GWFServerUrl]  ret=[" + string + riy.ARRAY_END_STR;
            return string;
        }
        return str;
    }
}
