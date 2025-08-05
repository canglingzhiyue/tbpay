package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.aa;
import com.taobao.android.litecreator.sdk.editor.data.Music;

/* loaded from: classes5.dex */
public class hef extends hdz<Music> implements aa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1539192620);
        kge.a(-1596064526);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.aa
    public void a(Music music) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd249a8e", new Object[]{this, music});
            return;
        }
        q();
        g().a(music.mo940clone());
    }

    @Override // com.taobao.android.litecreator.sdk.editor.aa
    public Music l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Music) ipChange.ipc$dispatch("91b14b69", new Object[]{this}) : g().a().a();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.aa
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        q();
        g().a(null);
    }
}
