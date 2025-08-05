package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class ehk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ehm f27312a;
    private static ehl b;
    private static eho c;
    private static ehq d;
    private static ehp e;

    static {
        kge.a(-748894242);
        emu.a("com.taobao.android.detail.core.open.depend.DependManager");
    }

    public static void a(ehm ehmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6da7e6e", new Object[]{ehmVar});
        } else {
            f27312a = ehmVar;
        }
    }

    public static ehm a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ehm) ipChange.ipc$dispatch("f042234", new Object[0]) : f27312a;
    }

    public static void a(ehl ehlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6da0a0f", new Object[]{ehlVar});
        } else {
            b = ehlVar;
        }
    }

    public static ehl b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ehl) ipChange.ipc$dispatch("16b5c774", new Object[0]) : b;
    }

    public static void a(eho ehoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6db672c", new Object[]{ehoVar});
        } else {
            c = ehoVar;
        }
    }

    public static eho c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eho) ipChange.ipc$dispatch("1e676d30", new Object[0]) : c;
    }

    public static void a(ehq ehqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6dc4fea", new Object[]{ehqVar});
        } else {
            d = ehqVar;
        }
    }

    public static ehq d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ehq) ipChange.ipc$dispatch("261912cd", new Object[0]) : d;
    }

    public static void a(ehp ehpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6dbdb8b", new Object[]{ehpVar});
        } else {
            e = ehpVar;
        }
    }
}
