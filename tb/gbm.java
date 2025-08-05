package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes5.dex */
public class gbm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<DXWidgetNode> f28288a;
    private final List<String> b;

    static {
        kge.a(258620904);
    }

    public gbm(WeakReference<DXWidgetNode> weakReference, List<String> list) {
        this.f28288a = weakReference;
        this.b = list;
    }

    public List<String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.b;
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        DXWidgetNode dXWidgetNode = this.f28288a.get();
        if (dXWidgetNode != null && dXWidgetNode.getDXRuntimeContext() != null) {
            return dXWidgetNode.getDXRuntimeContext().v();
        }
        return null;
    }
}
