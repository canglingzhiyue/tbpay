package tb;

import android.support.v7.widget.PagerSnapHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class esd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(720096451);
    }

    public fzp a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fzp) ipChange.ipc$dispatch("f04da82", new Object[]{this}) : new fzp();
    }

    public PagerSnapHelper b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PagerSnapHelper) ipChange.ipc$dispatch("cb3a915c", new Object[]{this}) : new PagerSnapHelper();
    }
}
