package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class hig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f28690a;
    private static Boolean b;

    static {
        kge.a(-81675758);
        f28690a = null;
        b = null;
    }

    public static final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (f28690a == null) {
            f28690a = Boolean.valueOf(Boolean.parseBoolean(pmd.a().d().a("tblive", "enableIntimacyDXOpt", "true")));
        }
        return f28690a.booleanValue();
    }

    public static final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (b == null) {
            b = Boolean.valueOf(Boolean.parseBoolean(pmd.a().d().a("tblive", "enableRankDXOpt", "true")));
        }
        return b.booleanValue();
    }
}
