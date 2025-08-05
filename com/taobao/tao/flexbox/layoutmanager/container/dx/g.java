package com.taobao.tao.flexbox.layoutmanager.container.dx;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.tao.flexbox.layoutmanager.component.ag;
import com.taobao.taobao.R;
import tb.dkx;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;
import tb.kge;

/* loaded from: classes8.dex */
public class g extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long BINDMULTITABVIDEOCONTROL = 6410613550586411439L;

    static {
        kge.a(-107716309);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        DinamicXEngine engine;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        try {
            DXRootView i = ((com.taobao.android.dinamicx.eventchain.l) dleVar).i();
            engine = i.getFlattenWidgetNode().getEngine();
            viewGroup = (ViewGroup) i.getParent();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (viewGroup != null && viewGroup.getTag(R.id.dx_video_view_control) == null) {
            viewGroup.setTag(R.id.dx_video_view_control, "true");
            if (engine != null) {
                new ag(engine, dlhVar.c("childRecyclerLayoutUserId")).a(viewGroup);
            }
            return null;
        }
        return null;
    }

    /* loaded from: classes8.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(130604290);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public g a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("96abfdd2", new Object[]{this, obj}) : new g();
        }
    }
}
