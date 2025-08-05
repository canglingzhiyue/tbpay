package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* loaded from: classes6.dex */
public final class bxi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f26159a;
    private static Boolean b;

    static {
        kge.a(529974163);
        b = null;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        String str = f26159a;
        if (str != null) {
            return str;
        }
        try {
            Application application = Globals.getApplication();
            if (application == null) {
                return "";
            }
            f26159a = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
            return f26159a == null ? "" : f26159a;
        } catch (Exception e) {
            jpr.a(jpu.a("Ultron").c("getAppVersionException").b(e.getMessage()));
            return "";
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            b = Boolean.valueOf(a().split("\\.").length > jqi.a("Ultron", "taobaoAppReleaseVersionLength", 3));
        } catch (Exception unused) {
            b = false;
        }
        return b.booleanValue();
    }
}
