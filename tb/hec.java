package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Cut;
import com.taobao.android.litecreator.sdk.editor.u;

/* loaded from: classes5.dex */
public class hec extends hdz<Cut> implements u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(409682313);
        kge.a(-213481649);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.u
    public void a(Cut cut) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("670a3c11", new Object[]{this, cut});
            return;
        }
        q();
        g().a(cut.mo940clone());
    }

    @Override // com.taobao.android.litecreator.sdk.editor.u
    public Cut f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Cut) ipChange.ipc$dispatch("8f5eda72", new Object[]{this}) : g().a().a();
    }
}
