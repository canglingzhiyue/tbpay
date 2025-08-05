package tb;

import android.content.Context;
import android.taobao.safemode.b;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class ovw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static Context f32472a = null;
    private static volatile boolean b = false;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            f32472a = context;
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (f32472a == null || b) {
        } else {
            b.a(f32472a).d();
            b = true;
        }
    }
}
