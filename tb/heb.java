package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Crop;
import com.taobao.android.litecreator.sdk.editor.t;

/* loaded from: classes5.dex */
public class heb extends hdz<Crop> implements t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(437245603);
        kge.a(1590790941);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.t
    public void a(Crop crop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f09ccd", new Object[]{this, crop});
            return;
        }
        q();
        g().a(crop);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.t
    public Crop f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Crop) ipChange.ipc$dispatch("5c7b0a92", new Object[]{this}) : g().a().a();
    }
}
