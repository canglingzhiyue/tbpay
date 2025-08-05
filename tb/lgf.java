package tb;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.List;

/* loaded from: classes7.dex */
public class lgf extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_ON_SCROLL_START = 7952648158329995189L;
    public static final long DX_ON_SCROLL_STOP = -7968002352509477560L;
    public static final String KEY_INFO_FLOW_SCROLL_EVENT_POST = "scrollEventPost";

    /* renamed from: a  reason: collision with root package name */
    private int f30560a;
    private a b;

    /* loaded from: classes7.dex */
    public interface a {
        List<DXRootView> a(RecyclerView recyclerView);
    }

    static {
        kge.a(-12256160);
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : i == 1 || i == 2;
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        try {
            if (this.f30560a != -1 && a(this.f30560a) == a(i)) {
                return;
            }
            this.f30560a = i;
            List<DXRootView> a2 = this.b.a(recyclerView);
            if (i == 0) {
                ldf.d("RecyclerViewScrollEventPost", "post scroll stop event");
                for (int i2 = 0; i2 < a2.size(); i2++) {
                    a(a2.get(i2), false);
                }
            } else if (i == 1 || i == 2) {
                ldf.d("RecyclerViewScrollEventPost", "post scroll start event");
                for (int i3 = 0; i3 < a2.size(); i3++) {
                    a(a2.get(i3), true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            ldf.a("RecyclerViewScrollEventPost", "onScrollStateChanged error", e);
        }
    }

    public void a(DXRootView dXRootView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebfdd60b", new Object[]{this, dXRootView, new Boolean(z)});
        } else if (dXRootView == null) {
        } else {
            DXEvent dXEvent = new DXEvent(z ? 7952648158329995189L : -7968002352509477560L);
            DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
            if (expandWidgetNode == null) {
                return;
            }
            expandWidgetNode.sendBroadcastEvent(dXEvent);
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f30560a;
    }
}
