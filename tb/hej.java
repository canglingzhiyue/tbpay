package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.ah;
import com.taobao.android.litecreator.sdk.editor.data.Volume;

/* loaded from: classes5.dex */
public class hej extends hdz<Volume> implements ah {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-297155283);
        kge.a(-27727833);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ah
    public void a(Volume volume) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315e5ac3", new Object[]{this, volume});
            return;
        }
        q();
        g().a(volume.mo940clone());
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ah
    public Volume n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Volume) ipChange.ipc$dispatch("9761b790", new Object[]{this}) : g().a().a();
    }
}
