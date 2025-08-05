package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.AiQuality;
import com.taobao.android.litecreator.sdk.editor.r;

/* loaded from: classes5.dex */
public class hdy extends hdz<AiQuality> implements r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(802110782);
        kge.a(-491099900);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.r
    public void a(AiQuality aiQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e47a3c", new Object[]{this, aiQuality});
            return;
        }
        q();
        g().a(aiQuality.mo940clone());
    }

    @Override // com.taobao.android.litecreator.sdk.editor.r
    public AiQuality j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AiQuality) ipChange.ipc$dispatch("97152b59", new Object[]{this}) : g().a().a();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.r
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        q();
        g().a(null);
    }
}
