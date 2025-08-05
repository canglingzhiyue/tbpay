package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class aqg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f25514a;
    private static List<a> b;

    /* loaded from: classes.dex */
    public interface a {
        void d();

        void e();
    }

    static {
        kge.a(-1560786161);
        f25514a = true;
        b = Collections.synchronizedList(new ArrayList());
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb5fe124", new Object[]{aVar});
        } else if (b.contains(aVar)) {
        } else {
            b.add(aVar);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            a(false);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            a(true);
        }
    }

    private static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        apr.b("UTServerAppStatusTrigger", "postAppStatus mIsAppOnForeground", Boolean.valueOf(f25514a), "isAppOnForeground", Boolean.valueOf(z));
        f25514a = z;
        for (int i = 0; i < b.size(); i++) {
            if (z) {
                b.get(i).e();
            } else {
                b.get(i).d();
            }
        }
    }
}
