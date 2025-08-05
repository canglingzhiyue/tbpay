package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.Beauty;
import com.taobao.android.litecreator.sdk.editor.s;

/* loaded from: classes5.dex */
public class hea extends hdz<Beauty> implements s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-276554737);
        kge.a(226885641);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.s
    public void a(Beauty beauty) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c0de99", new Object[]{this, beauty});
            return;
        }
        q();
        g().a(beauty.mo940clone());
    }

    @Override // com.taobao.android.litecreator.sdk.editor.s
    public Beauty i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Beauty) ipChange.ipc$dispatch("2cb0fc97", new Object[]{this}) : g().a().a();
    }
}
