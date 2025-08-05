package tb;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* loaded from: classes3.dex */
public final class ckn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static synchronized void a(Context context, String str, String str2, String str3) {
        synchronized (ckn.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
                return;
            }
            cki b = b(context, str, str2, str3);
            ckk.a(context.getFilesDir().getAbsolutePath() + "/log/ap", new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log", b.toString());
        }
    }

    public static synchronized void a(String str) {
        synchronized (ckn.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            } else {
                ckk.a(str);
            }
        }
    }

    public static synchronized void a(Throwable th) {
        synchronized (ckn.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{th});
            } else {
                ckk.a(th);
            }
        }
    }

    private static cki b(Context context, String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cki) ipChange.ipc$dispatch("e15d7e68", new Object[]{context, str, str2, str3});
        }
        try {
            str4 = context.getPackageName();
        } catch (Throwable unused) {
            str4 = "";
        }
        return new cki(Build.MODEL, str4, "APPSecuritySDK-TAOBAO", "3.5.0.20240702", str, str2, str3);
    }
}
