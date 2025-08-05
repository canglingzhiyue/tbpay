package tb;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class luj extends lua implements lkc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1361375224);
        kge.a(-1384347703);
    }

    public luj(lud ludVar) {
        super(ludVar);
    }

    @Override // tb.lkc
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : e().n();
    }

    @Override // tb.lkc
    public Context b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this}) : e().e();
    }

    @Override // tb.lkc
    public Fragment c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("3af6fccc", new Object[]{this}) : e().r();
    }
}
