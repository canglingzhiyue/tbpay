package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class rqn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static rqm f33324a;

    static {
        kge.a(-458955382);
        f33324a = null;
    }

    public static void setMultiProcessAdapter(rqm rqmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e2f860", new Object[]{rqmVar});
        } else {
            f33324a = rqmVar;
        }
    }

    public static rqm getMultiProcessAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rqm) ipChange.ipc$dispatch("991993ae", new Object[0]) : f33324a;
    }
}
