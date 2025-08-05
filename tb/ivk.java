package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.dinamicx.widget.bq;

/* loaded from: classes5.dex */
public class ivk implements ak {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ak f29330a;
    private bq b;

    static {
        kge.a(327240936);
        kge.a(349752956);
    }

    public ivk(ak akVar, bq bqVar) {
        this.f29330a = akVar;
        this.b = bqVar;
    }

    @Override // com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        DXWidgetNode build = this.f29330a.build(obj);
        build.setEnableButter(true);
        build.setStrategy(this.b);
        return build;
    }
}
