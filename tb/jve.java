package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jve implements jvt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1685950845);
        kge.a(-566043805);
    }

    @Override // tb.jvt
    public jvu a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvu) ipChange.ipc$dispatch("7c71468b", new Object[]{this, str}) : new jvf();
    }
}
