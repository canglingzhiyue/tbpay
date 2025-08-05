package com.taobao.tao.flexbox.layoutmanager.container.dx;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import com.taobao.tao.flexbox.layoutmanager.component.ag;
import com.taobao.tao.flexbox.layoutmanager.container.dx.k;
import tb.dkx;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;
import tb.kge;

/* loaded from: classes8.dex */
public class m extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long THEATERCARDANIMSTART = 8660710342251325710L;

    static {
        kge.a(-1127089034);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        k.b bVar;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        try {
            DXRootView i2 = ((com.taobao.android.dinamicx.eventchain.l) dleVar).i();
            String c = dlhVar.c("listId");
            boolean booleanValue = dlhVar.e(com.taobao.android.weex_framework.util.a.ATOM_EXT_reverse).booleanValue();
            DXRecyclerView dXRecyclerView = (DXRecyclerView) ag.a(i2.getFlattenWidgetNode().queryWidgetNodeByUserId(c).getWRView().get(), DXRecyclerView.class);
            while (true) {
                if (i >= 3) {
                    bVar = null;
                    break;
                }
                RecyclerView.ItemDecoration itemDecorationAt = dXRecyclerView.getItemDecorationAt(i);
                if (itemDecorationAt instanceof k.b) {
                    bVar = (k.b) itemDecorationAt;
                    break;
                }
                i++;
            }
            if (bVar != null) {
                bVar.a(booleanValue);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    /* loaded from: classes8.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(491257165);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public m a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("96abfe8c", new Object[]{this, obj}) : new m();
        }
    }
}
