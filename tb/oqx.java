package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class oqx extends oqt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-774501744);
    }

    @Override // tb.oqt
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public oqx(String str) {
        super(str);
    }
}
