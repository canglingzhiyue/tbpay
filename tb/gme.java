package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class gme {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static gme f28377a;

        static {
            kge.a(1921625293);
            f28377a = new gme();
        }
    }

    static {
        kge.a(623218883);
    }

    public static gme a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gme) ipChange.ipc$dispatch("f051cbf", new Object[0]) : a.f28377a;
    }

    public gkl a(String str, gmf gmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gkl) ipChange.ipc$dispatch("518888dc", new Object[]{this, str, gmfVar});
        }
        if (!(gmfVar.a() instanceof gjz)) {
            return null;
        }
        return ((gjz) gmfVar.a()).b().b(str);
    }
}
