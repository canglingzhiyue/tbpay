package tb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.taobao.windvane.monitor.a;
import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class aeo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static PackageInfo f25292a;
    private static volatile boolean b;

    static {
        kge.a(-67575062);
        b = false;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (b) {
        } else {
            b = true;
            PackageInfo b2 = b(context);
            if (b2 == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("package", b2.packageName);
                jSONObject.put("version", b2.versionName);
                jSONObject.put("os", Build.VERSION.RELEASE);
            } catch (Exception e) {
                e.printStackTrace();
            }
            a.commitSuccess(a.MONITOR_POINT_SYS_WEBVIEW, jSONObject.toString());
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        PackageInfo packageInfo = f25292a;
        if (packageInfo == null) {
            return null;
        }
        return packageInfo.versionName;
    }

    private static PackageInfo b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PackageInfo) ipChange.ipc$dispatch("201087ce", new Object[]{context});
        }
        PackageInfo packageInfo = f25292a;
        if (packageInfo != null) {
            return packageInfo;
        }
        try {
            PackageInfo a2 = aep.a(context);
            if (a2 == null) {
                return null;
            }
            f25292a = a2;
            return a2;
        } catch (Throwable th) {
            m.b("SystemWebViewChecker", "getSystemWebViewInfo fail", th, new Object[0]);
            return null;
        }
    }
}
