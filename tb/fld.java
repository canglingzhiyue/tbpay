package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fld {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1365993053);
    }

    public static flb a(fjb fjbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (flb) ipChange.ipc$dispatch("32580270", new Object[]{fjbVar}) : (fjbVar == null || fjbVar.a() == null) ? new fle() : new flc(fjbVar);
    }
}
