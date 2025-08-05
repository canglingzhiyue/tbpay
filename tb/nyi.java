package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class nyi implements oao {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-482094869);
        kge.a(-84936886);
    }

    @Override // tb.oao
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : nyk.a();
    }
}
