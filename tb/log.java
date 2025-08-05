package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.ArrayList;
import java.util.List;
import tb.lks;

/* loaded from: classes.dex */
public class log implements lks.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_ON_SCROLL_START = 7952648158329995189L;
    public static final long DX_ON_SCROLL_STOP = -7968002352509477560L;

    /* renamed from: a  reason: collision with root package name */
    private int f30770a = -1;
    private final IMainFeedsViewService<?> b;

    static {
        kge.a(-826092554);
        kge.a(439987723);
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : i == 1 || i == 2;
    }

    @Override // tb.lks.c
    public void a(ViewGroup viewGroup, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75913347", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.lks.c
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    public log(IMainFeedsViewService<?> iMainFeedsViewService) {
        this.b = iMainFeedsViewService;
    }

    @Override // tb.lks.c
    public void a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f4273c", new Object[]{this, viewGroup, new Integer(i)});
            return;
        }
        try {
            if (this.f30770a != -1 && a(this.f30770a) == a(i)) {
                return;
            }
            this.f30770a = i;
            List<DXRootView> a2 = a();
            if (a2 == null) {
                return;
            }
            if (i == 0) {
                a(a2, false);
            } else if (i != 1 && i != 2) {
            } else {
                a(a2, true);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ldf.a("", "onScrollStateChanged error", e);
        }
    }

    private void a(List<DXRootView> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a0b49b", new Object[]{this, list, new Boolean(z)});
            return;
        }
        ldf.d("LiveFeedsScrollListener", "post scroll start event");
        for (DXRootView dXRootView : list) {
            a(dXRootView, z);
        }
    }

    private void a(DXRootView dXRootView, boolean z) {
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

    private List<DXRootView> a() {
        DXRootView a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        if (this.b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int[] visiblePositionRange = this.b.getVisiblePositionRange();
        if (visiblePositionRange == null || visiblePositionRange.length < 2) {
            return null;
        }
        int i = visiblePositionRange[1];
        for (int i2 = visiblePositionRange[0]; i2 <= i; i2++) {
            View findItemViewByPosition = this.b.findItemViewByPosition(i2);
            if (findItemViewByPosition.getVisibility() == 0 && (a2 = a(findItemViewByPosition)) != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    private DXRootView a(View view) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("fd04df2d", new Object[]{this, view});
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return null;
            }
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DXRootView) {
                return (DXRootView) childAt;
            }
            i++;
        }
    }
}
