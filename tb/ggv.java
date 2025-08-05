package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.exception.a;
import com.taobao.android.dinamicx.u;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.ggz;

/* loaded from: classes5.dex */
public class ggv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2013663931);
    }

    public static ggz.a a(DXWidgetNode dXWidgetNode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggz.a) ipChange.ipc$dispatch("d5defc33", new Object[]{dXWidgetNode, new Integer(i)});
        }
        ggz x = dXWidgetNode.getDXRuntimeContext().C().b().x();
        if (x == null) {
            return null;
        }
        try {
            return x.a(dXWidgetNode.getDXRuntimeContext(), i, u.g().d(), null);
        } catch (Exception e) {
            a.b(e);
            return new ggz.a(false, e.getMessage(), gfx.e());
        }
    }

    public static ggz.a a(DXRuntimeContext dXRuntimeContext, int i) {
        ggz x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggz.a) ipChange.ipc$dispatch("b01efc5", new Object[]{dXRuntimeContext, new Integer(i)});
        }
        if (dXRuntimeContext == null || (x = dXRuntimeContext.C().b().x()) == null) {
            return null;
        }
        try {
            return x.a(dXRuntimeContext, i, u.g().d(), null);
        } catch (Throwable th) {
            a.b(th);
            return new ggz.a(false, th.getMessage(), gfx.e());
        }
    }
}
