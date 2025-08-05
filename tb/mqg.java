package tb;

import android.os.Build;
import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class mqg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f31194a;

    static {
        f31194a = Build.VERSION.SDK_INT >= 18;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!f31194a) {
        } else {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!f31194a) {
        } else {
            Trace.endSection();
        }
    }
}
