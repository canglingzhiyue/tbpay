package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class kau extends kar {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final kau instance;

    @Override // tb.kar
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "atools";
    }

    static {
        kge.a(1815385419);
        instance = new kau();
    }
}
