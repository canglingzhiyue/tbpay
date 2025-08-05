package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public abstract class kcv extends kcx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1526917982);
    }

    @Override // tb.kcx
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public kcv(int i) {
        super(i);
    }
}
