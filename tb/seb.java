package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class seb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static sea f33500a;

    static {
        kge.a(1445107623);
    }

    public static void a(sea seaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8e9c29", new Object[]{seaVar});
        } else {
            f33500a = seaVar;
        }
    }

    public static void a(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f39fc7", new Object[]{str, str2, obj, strArr});
            return;
        }
        sea seaVar = f33500a;
        if (seaVar == null) {
            ldf.b("MainContainerBx", "commitEnter mMainContainerBx == null");
        } else {
            seaVar.a(str, str2, obj, strArr);
        }
    }

    public static void a(String str, String str2, String str3, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e601333d", new Object[]{str, str2, str3, obj, strArr});
            return;
        }
        sea seaVar = f33500a;
        if (seaVar == null) {
            ldf.b("MainContainerBx", "commitLeave mMainContainerBx == null");
        } else {
            seaVar.a(str, str2, str3, obj, strArr);
        }
    }

    public static void a(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50031319", new Object[]{str, str2, str3, strArr});
            return;
        }
        sea seaVar = f33500a;
        if (seaVar == null) {
            ldf.b("MainContainerBx", "commitLeave mMainContainerBx == null");
        } else {
            seaVar.a(str, str2, str3, strArr);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        sea seaVar = f33500a;
        if (seaVar == null) {
            ldf.b("MainContainerBx", "push mMainContainerBx == null");
        } else {
            seaVar.a();
        }
    }
}
