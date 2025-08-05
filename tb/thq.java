package tb;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.dinamicx.r;
import com.taobao.android.dinamicx.videoc.b;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.recycler.WaterfallLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0013"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/event/DXDxEventScrollStateChangeEventHandlerKT;", "Lcom/taobao/android/dinamicx/DXAbsEventHandler;", "()V", "handleEvent", "", "event", "Lcom/taobao/android/dinamicx/expression/event/DXEvent;", "args", "", "", "runtimeContext", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "(Lcom/taobao/android/dinamicx/expression/event/DXEvent;[Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)V", "sendScrollEndMessage", "engine", "Lcom/taobao/android/dinamicx/DinamicXEngine;", "state", "", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class thq extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_EVENT_DXEVENTSCROLLSTATECHANGE = -3683706025822114132L;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/event/DXDxEventScrollStateChangeEventHandlerKT$Companion;", "", "()V", "DX_EVENT_DXEVENTSCROLLSTATECHANGE", "", "DX_RECYCLER_LAYOUT_SCROLL_STATE_BEGIN", "", "DX_RECYCLER_LAYOUT_SCROLL_STATE_END", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent event, Object[] args, DXRuntimeContext runtimeContext) {
        b u;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, event, args, runtimeContext});
            return;
        }
        q.d(event, "event");
        q.d(args, "args");
        q.d(runtimeContext, "runtimeContext");
        if (args.length != 0) {
            z = false;
        }
        if (z || TextUtils.isEmpty(args[0].toString())) {
            return;
        }
        r C = runtimeContext.C();
        DinamicXEngine b = C != null ? C.b() : null;
        DXWidgetNode d = runtimeContext.d();
        RecyclerView recyclerView = null;
        if (d instanceof DXRecyclerLayout) {
            WaterfallLayout m = ((DXRecyclerLayout) d).m();
            q.b(m, "recyclerNode.waterfallLayout");
            recyclerView = m.b();
        }
        if (recyclerView == null) {
            return;
        }
        String obj = args[0] instanceof String ? args[0].toString() : "";
        if (!thr.INSTANCE.a()) {
            a(b, obj);
            return;
        }
        thr.INSTANCE.a(obj);
        String str = obj;
        if (!TextUtils.equals(str, thr.DX_RECYCLER_LAYOUT_SCROLL_STATE_BEGIN)) {
            TextUtils.equals(str, thr.DX_RECYCLER_LAYOUT_SCROLL_STATE_END);
        } else if (b != null && (u = b.u()) != null) {
            u.d(recyclerView);
        }
        a(b, obj);
    }

    public final void a(DinamicXEngine dinamicXEngine, String state) {
        dkt l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fce4f323", new Object[]{this, dinamicXEngine, state});
            return;
        }
        q.d(state, "state");
        if (!TextUtils.equals(state, thr.DX_RECYCLER_LAYOUT_SCROLL_STATE_END) || dinamicXEngine == null || (l = dinamicXEngine.l()) == null) {
            return;
        }
        l.a("RECYCLER_SCROLL_END", (JSONObject) null);
    }
}
