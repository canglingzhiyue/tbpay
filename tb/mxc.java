package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.ar;
import com.taobao.android.litecreator.sdk.editor.data.Adjust;

/* loaded from: classes5.dex */
public class mxc extends hdz<Adjust> implements ar {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1262893214);
        kge.a(-1759228708);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ar
    public void a(Adjust adjust) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a33a2e", new Object[]{this, adjust});
            return;
        }
        q();
        g().a(adjust.mo940clone());
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ar
    public Adjust O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Adjust) ipChange.ipc$dispatch("2799aa5c", new Object[]{this}) : g().a().a();
    }
}
