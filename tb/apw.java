package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.util.Random;

/* loaded from: classes.dex */
public class apw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Random f25510a;
    private static String b;
    private static String c;

    static {
        kge.a(1232978013);
        f25510a = new Random();
        b = "";
        c = "";
    }

    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int nanoTime = (int) System.nanoTime();
        int nextInt = f25510a.nextInt();
        int nextInt2 = f25510a.nextInt();
        byte[] a2 = app.a(currentTimeMillis);
        byte[] a3 = app.a(nanoTime);
        byte[] a4 = app.a(nextInt);
        byte[] a5 = app.a(nextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(a2, 0, bArr, 0, 4);
        System.arraycopy(a3, 0, bArr, 4, 4);
        System.arraycopy(a4, 0, bArr, 8, 4);
        System.arraycopy(a5, 0, bArr, 12, 4);
        return aph.b(bArr, 2);
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        String str = null;
        if (context != null) {
            try {
                String string = context.getSharedPreferences("UTCommon", 0).getString("_ie", "");
                if (!aqc.e(string)) {
                    String str2 = new String(aph.a(string.getBytes(), 2), "UTF-8");
                    if (!aqc.e(str2)) {
                        return str2;
                    }
                }
            } catch (Exception unused) {
            }
            str = c(context);
        }
        if (aqc.e(str)) {
            str = a();
        }
        if (context != null) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("UTCommon", 0).edit();
                edit.putString("_ie", new String(aph.c(str.getBytes("UTF-8"), 2)));
                edit.commit();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        String str = null;
        if (context != null) {
            try {
                String string = context.getSharedPreferences("UTCommon", 0).getString("_is", "");
                if (!aqc.e(string)) {
                    String str2 = new String(aph.a(string.getBytes(), 2), "UTF-8");
                    if (!aqc.e(str2)) {
                        return str2;
                    }
                }
            } catch (Exception unused) {
            }
            str = d(context);
        }
        if (aqc.e(str)) {
            str = a();
        }
        if (context != null) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("UTCommon", 0).edit();
                edit.putString("_is", new String(aph.c(str.getBytes("UTF-8"), 2)));
                edit.commit();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    public static synchronized String c(Context context) {
        synchronized (apw.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context});
            }
            return b;
        }
    }

    public static synchronized String d(Context context) {
        synchronized (apw.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context});
            }
            return c;
        }
    }
}
