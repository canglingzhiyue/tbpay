package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class ixi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ShopLog";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f29395a;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        }
    }

    static {
        kge.a(-1211279297);
        f29395a = false;
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (!a()) {
        } else {
            Log.e(TAG, str);
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f29395a;
    }
}
