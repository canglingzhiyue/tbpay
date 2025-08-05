package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class ika {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ijz f29107a = new ijx("rso-inner");
    private static volatile ijz b;

    public static void a(ijz ijzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcff8bf", new Object[]{ijzVar});
        } else {
            b = ijzVar;
        }
    }

    private static ijz b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijz) ipChange.ipc$dispatch("16b7a224", new Object[0]);
        }
        ijz ijzVar = b;
        return ijzVar != null ? ijzVar : f29107a;
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            b().a(runnable);
        }
    }

    public static void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{runnable, new Long(j)});
        } else {
            b().a(runnable, j);
        }
    }

    public static Thread a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d060f65f", new Object[0]) : b().a();
    }
}
