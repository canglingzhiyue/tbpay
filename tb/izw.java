package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes6.dex */
public class izw extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RECYCLER_SCROLL_TO_POSITION = "2378982137915074040";

    static {
        kge.a(79586307);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        DXWidgetNode a2;
        IpChange ipChange = $ipChange;
        final int i = 0;
        final boolean z = true;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        DXRuntimeContext h = lVar.h();
        if (h == null) {
            return new dkw(new dkv(30009, "rootViewContext为空"), true);
        }
        DXWidgetNode d = h.d();
        if (d == null) {
            return new dkw(new dkv(30009, "rootWidget为空"), true);
        }
        String c = dlhVar.c("userId");
        if (TextUtils.isEmpty(c)) {
            c = dlhVar.c("recyclerNodeId");
        }
        if (!TextUtils.isEmpty(c)) {
            a2 = d.queryWidgetNodeByUserId(c);
        } else {
            a2 = a(lVar.j());
        }
        if (!(a2 instanceof DXRecyclerLayout)) {
            return new dkw(new dkv(30009, "查找recycler出错"), true);
        }
        String c2 = dlhVar.c("offset");
        if (!TextUtils.isEmpty(c2)) {
            try {
                i = Integer.parseInt(c2);
            } catch (NumberFormatException unused) {
            }
        }
        String c3 = dlhVar.c("animation");
        if (!TextUtils.isEmpty(c3)) {
            z = "true".equals(c3);
        }
        final DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) a2;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.izw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                DXRecyclerLayout dXRecyclerLayout2 = dXRecyclerLayout;
                if (dXRecyclerLayout2 == null) {
                    return;
                }
                dXRecyclerLayout2.a(z, i);
            }
        });
        return new dla();
    }

    public DXRecyclerLayout a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerLayout) ipChange.ipc$dispatch("fa3670e3", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode == null) {
            return null;
        }
        if (dXWidgetNode instanceof DXRecyclerLayout) {
            return (DXRecyclerLayout) dXWidgetNode;
        }
        return a(dXWidgetNode.getParentWidget());
    }
}
