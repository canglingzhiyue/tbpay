package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class cla {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static synchronized String a(Context context, String str) {
        synchronized (cla.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
            }
            String a2 = ckh.a(context, "openapi_file_pri", "openApi".concat(String.valueOf(str)), "");
            if (cjw.a(a2)) {
                return "";
            }
            String b = cka.b(cka.a(), a2);
            return cjw.a(b) ? "" : b;
        }
    }

    public static synchronized void a(Context context) {
        synchronized (cla.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
                return;
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("openapi_file_pri", 0).edit();
            if (edit != null) {
                edit.clear();
                edit.commit();
            }
        }
    }

    public static synchronized void a(Context context, String str, String str2) {
        synchronized (cla.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
                return;
            }
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("openapi_file_pri", 0).edit();
                if (edit != null) {
                    edit.putString("openApi".concat(String.valueOf(str)), cka.a(cka.a(), str2));
                    edit.commit();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
