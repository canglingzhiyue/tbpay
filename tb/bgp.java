package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bgp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FRAGMENT = "fragment";
    public static final String INITIAL = "Initial";
    public static final String SERVICE = "service";
    public static final String VIEW = "view";

    static {
        kge.a(1137497780);
    }

    public static bgo a(bhc bhcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bgo) ipChange.ipc$dispatch("fdcb6dc1", new Object[]{bhcVar});
        }
        if (bhcVar.c().equals(FRAGMENT)) {
            return new bgm((bhd) bhcVar);
        }
        if (bhcVar.c().equals("view")) {
            return new bgr((bhg) bhcVar);
        }
        if (bhcVar.c().equals("service")) {
            return new bgq((bhf) bhcVar);
        }
        if (!bhcVar.c().equals(INITIAL)) {
            return null;
        }
        return new bgn((bhe) bhcVar);
    }
}
