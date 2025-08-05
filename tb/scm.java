package tb;

import android.support.v4.os.TraceCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes4.dex */
public class scm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f33475a;

    static {
        kge.a(1915401101);
        f33475a = null;
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (f33475a == null) {
            f33475a = Boolean.valueOf(new File("/data/local/tmp/", ".taolive_trace_enable").exists());
        }
        return f33475a.booleanValue();
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!b()) {
        } else {
            TraceCompat.beginSection(str);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!b()) {
        } else {
            TraceCompat.endSection();
        }
    }
}
