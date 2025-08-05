package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;

/* loaded from: classes6.dex */
public class kck {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Application f29959a;
    public static boolean b;
    public static boolean c;
    public static int d;

    static {
        kge.a(233335755);
        b = true;
        c = false;
        d = 0;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        Application application = f29959a;
        if (application == null || !b) {
            return false;
        }
        try {
            boolean z = (application.getApplicationInfo().flags & 2) != 0;
            b = z;
            return z;
        } catch (Exception e) {
            AVSDKLog.e("", e.getMessage());
            return false;
        }
    }
}
