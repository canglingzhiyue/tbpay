package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class lum extends lua implements lkf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(761145933);
        kge.a(159430094);
    }

    public lum(lud ludVar) {
        super(ludVar);
    }

    @Override // tb.lkf
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            e().b(z);
        }
    }
}
