package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.ad;
import com.taobao.android.litecreator.sdk.editor.data.Sticker;

/* loaded from: classes5.dex */
public class heh extends hdz<Sticker> implements ad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-982008380);
        kge.a(714679818);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ad
    public Sticker p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Sticker) ipChange.ipc$dispatch("2b9b600d", new Object[]{this}) : g().a().a();
    }
}
