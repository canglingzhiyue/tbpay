package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.ultron.vfw.viewholder.h;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.icart.widget.swipe.SwipeFrameLayout;
import com.taobao.android.icart.widget.touch.DXCartWrapperFrameLayoutWidgetNode;
import com.taobao.android.icart.widget.touch.DragFloatLayer;
import com.taobao.android.icart.widget.touch.b;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* loaded from: classes5.dex */
public class gog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bbz f28407a;
    private b b;
    private DragFloatLayer<String> c;
    private List<IDMComponent> d;

    static {
        kge.a(-1081974030);
    }

    public static /* synthetic */ List a(gog gogVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("deed672e", new Object[]{gogVar}) : gogVar.d;
    }

    public static /* synthetic */ void a(gog gogVar, RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b02ff8f", new Object[]{gogVar, viewHolder, new Integer(i)});
        } else {
            gogVar.a(viewHolder, i);
        }
    }

    public static /* synthetic */ b b(gog gogVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f51c18cb", new Object[]{gogVar}) : gogVar.b;
    }

    public gog(bbz bbzVar, b bVar, DragFloatLayer<String> dragFloatLayer) {
        this.f28407a = bbzVar;
        this.b = bVar;
        this.c = dragFloatLayer;
        this.d = bbzVar.x().p().l().a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f28407a.x().a(new bey() { // from class: tb.gog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bey
                public void a(List<IDMComponent> list, h hVar, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2a187007", new Object[]{this, list, hVar, new Integer(i)});
                    } else if (!gog.b(gog.this).a((IDMComponent) gog.a(gog.this).get(i))) {
                    } else {
                        gog.a(gog.this, hVar, i);
                    }
                }
            });
        }
    }

    private void a(final RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb19487e", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        final IDMComponent iDMComponent = this.d.get(i);
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: tb.gog.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                if (!gog.b(gog.this).a(iDMComponent)) {
                    return false;
                }
                gog.b(gog.this).a(viewHolder.itemView, iDMComponent);
                return true;
            }
        };
        if (viewHolder.itemView instanceof DXRootView) {
            DXRootView dXRootView = (DXRootView) viewHolder.itemView;
            if (dXRootView.getFlattenWidgetNode() != null) {
                DXWidgetNode queryWidgetNodeByUserId = dXRootView.getFlattenWidgetNode().queryWidgetNodeByUserId("main");
                View v = (queryWidgetNodeByUserId == null || queryWidgetNodeByUserId.getDXRuntimeContext() == null) ? null : queryWidgetNodeByUserId.getDXRuntimeContext().v();
                if (v instanceof SwipeFrameLayout) {
                    ((SwipeFrameLayout) v).setOnLongClick(onLongClickListener);
                    viewHolder.itemView.setOnLongClickListener(null);
                    return;
                } else if (v instanceof DXCartWrapperFrameLayoutWidgetNode.LongClickNativeFrameLayout) {
                    ((DXCartWrapperFrameLayoutWidgetNode.LongClickNativeFrameLayout) v).setOnLongClick(onLongClickListener);
                    viewHolder.itemView.setOnLongClickListener(null);
                    return;
                }
            }
        }
        viewHolder.itemView.setOnLongClickListener(onLongClickListener);
    }
}
