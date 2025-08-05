package com.taobao.android.tbabilitykit.dx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.video.DXVideoViewWidgetNode;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dla;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.kge;

/* loaded from: classes6.dex */
public class g extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String DXVIDEOVIEWABILITY = "-5052942527431262194";

    static {
        kge.a(408368503);
        Companion = new a(null);
    }

    /* loaded from: classes6.dex */
    public static final class a {
        static {
            kge.a(-461899777);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // tb.dlg
    public dkx<?> a(dlh dlhVar, l lVar, dll dllVar) {
        DXWidgetNode queryWidgetNodeByUserId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        if (dlhVar != null) {
            if (lVar == null) {
                return new dkw(new dkv(-1999, "DXVideoViewAbility akCtx == null"), false);
            }
            String c = dlhVar.c("userId");
            String c2 = dlhVar.c("action");
            DXWidgetNode j = lVar.j();
            if (q.a((Object) c, (Object) (j != null ? j.getUserId() : null))) {
                queryWidgetNodeByUserId = lVar.j();
            } else {
                DXWidgetNode j2 = lVar.j();
                queryWidgetNodeByUserId = j2 != null ? j2.queryWidgetNodeByUserId(c) : null;
            }
            if (!(queryWidgetNodeByUserId instanceof DXVideoViewWidgetNode)) {
                queryWidgetNodeByUserId = null;
            }
            DXVideoViewWidgetNode dXVideoViewWidgetNode = (DXVideoViewWidgetNode) queryWidgetNodeByUserId;
            if (dXVideoViewWidgetNode != null) {
                DXEvent dXEvent = new DXEvent(DXVideoViewWidgetNode.DXVIDEOVIEW_ONACTION);
                dXEvent.setArgs(ai.a(j.a("action", com.taobao.android.dinamicx.expression.expr_v2.f.a(c2))));
                dXVideoViewWidgetNode.postEvent(dXEvent);
            }
        }
        return new dla();
    }
}
