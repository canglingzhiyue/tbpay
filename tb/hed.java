package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Filter;
import com.taobao.android.litecreator.sdk.editor.w;

/* loaded from: classes5.dex */
public class hed extends hdz<Filter> implements w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(496258059);
        kge.a(-498758139);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.w
    public void a(Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb0b1a5", new Object[]{this, filter});
            return;
        }
        q();
        g().a(filter.mo940clone());
    }

    @Override // com.taobao.android.litecreator.sdk.editor.w
    public Filter a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Filter) ipChange.ipc$dispatch("6584f925", new Object[]{this}) : g().a().a();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.w
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        q();
        g().a(null);
    }
}
