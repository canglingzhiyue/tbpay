package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.business.getconfig.a;
import com.taobao.homepage.view.widgets.bgcontainer.c;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;

/* loaded from: classes7.dex */
public class ohm implements nrt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ohp f32064a;
    private final lbo b;

    static {
        kge.a(-1172854421);
        kge.a(-474408725);
    }

    public ohm(ohp ohpVar, lbo lboVar) {
        this.f32064a = ohpVar;
        this.b = lboVar;
    }

    @Override // tb.nrt
    public boolean a(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8961214", new Object[]{this, refreshState, refreshState2})).booleanValue() : refreshState == TBRefreshHeader.RefreshState.NONE;
    }

    @Override // tb.nrt
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8eef2e", new Object[]{this, aVar});
            return;
        }
        this.f32064a.a(aVar);
        c d = this.b.d();
        if (d != null) {
            d.a(4);
        }
        e.e("StartPullStatusProcessor", "开始下拉");
    }
}
