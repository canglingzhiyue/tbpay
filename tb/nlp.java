package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;

/* loaded from: classes6.dex */
public class nlp extends nof {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public nlp(ihh ihhVar) {
        super(ihhVar);
    }

    @Override // tb.nof
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f31610a.a(AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, true);
    }
}
