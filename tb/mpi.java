package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class mpi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static mpj f31188a;

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c81dbf", new Object[]{str, objArr});
            return;
        }
        mpj mpjVar = f31188a;
        if (mpjVar == null) {
            return;
        }
        mpjVar.a(str, "event", objArr);
    }

    public static void b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2d52de", new Object[]{str, objArr});
            return;
        }
        mpj mpjVar = f31188a;
        if (mpjVar == null) {
            return;
        }
        mpjVar.a(str, "trend", objArr);
    }

    public static void c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919287fd", new Object[]{str, objArr});
            return;
        }
        mpj mpjVar = f31188a;
        if (mpjVar == null) {
            return;
        }
        mpjVar.a(str, null, objArr);
    }

    public static void a(mpj mpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f0a251", new Object[]{mpjVar});
        } else {
            f31188a = mpjVar;
        }
    }
}
