package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ell extends aqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-711457788);
    }

    public ell() {
        emu.a("com.taobao.android.detail.core.standard.mainscreen.branch.AliSDetailAsyncModulePreloadCondition");
    }

    @Override // tb.aqn
    public boolean a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue() : eip.J;
    }
}
