package tb;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jjt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile jjt f29587a;
    private SQLiteDatabase b;

    static {
        kge.a(-1361299956);
    }

    public static jjt a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jjt) ipChange.ipc$dispatch("34c51172", new Object[]{context});
        }
        if (context == null && f29587a == null) {
            throw new IllegalArgumentException("context and evaluator cannot be null.");
        }
        if (f29587a == null) {
            synchronized (jjt.class) {
                if (f29587a == null) {
                    f29587a = new jjt(context.getApplicationContext());
                }
            }
        }
        return f29587a;
    }

    private jjt(Context context) {
        this.b = new jjz(context, null).getReadableDatabase();
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            Cursor rawQuery = this.b.rawQuery("SELECT " + str, null);
            rawQuery.moveToFirst();
            String string = rawQuery.getString(0);
            rawQuery.close();
            return !string.equals("0");
        } catch (Exception unused) {
            return true;
        }
    }
}
