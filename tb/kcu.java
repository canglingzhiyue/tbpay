package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public abstract class kcu extends kcx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1526917983);
    }

    public kcu(int i) {
        super(i);
    }

    @Override // tb.kcx
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : b() && !e() && !f() && !g();
    }
}
