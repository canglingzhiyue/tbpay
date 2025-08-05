package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.assets.a;

/* loaded from: classes6.dex */
public class nhn implements nhq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.nhq
    public iia bz_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iia) ipChange.ipc$dispatch("20faf397", new Object[]{this}) : ihn.f29030a;
    }

    @Override // tb.nhq
    public ihx b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihx) ipChange.ipc$dispatch("16b79a64", new Object[]{this}) : ihm.f29029a;
    }

    @Override // tb.nhq
    public a bA_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7e4c8ba", new Object[]{this}) : nho.INSTANCE;
    }
}
