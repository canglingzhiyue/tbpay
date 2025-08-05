package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class kdd extends kcv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1526917017);
    }

    public kdd() {
        super(1);
    }

    @Override // tb.kcv, tb.kcx
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : kdi.b(d());
    }
}
