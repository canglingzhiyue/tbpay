package com.taobao.tao.flexbox.layoutmanager.container.dx;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import com.taobao.tao.flexbox.layoutmanager.component.ag;
import tb.dkx;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;
import tb.kge;

/* loaded from: classes8.dex */
public class n extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long SCROLLTOPOSITIONTOP = 491406381362131949L;

    static {
        kge.a(-939395990);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        try {
            final DXRecyclerView dXRecyclerView = (DXRecyclerView) ag.a(((com.taobao.android.dinamicx.eventchain.l) dleVar).i().getFlattenWidgetNode().queryWidgetNodeByUserId(dlhVar.c("recyclerNodeId")).getWRView().get(), DXRecyclerView.class);
            int d = dlhVar.d("index");
            RecyclerView.LayoutManager layoutManager = dXRecyclerView.getLayoutManager();
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) layoutManager).scrollToPositionWithOffset(d, 0);
            }
            dXRecyclerView.post(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.container.dx.n.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        dXRecyclerView.scrollBy(0, 1);
                    }
                }
            });
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* loaded from: classes8.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-506805951);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public n a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("96abfeab", new Object[]{this, obj}) : new n();
        }
    }
}
