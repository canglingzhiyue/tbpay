package tb;

import android.support.v4.util.ArrayMap;
import com.alibaba.android.ultron.vfw.viewholder.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;

/* loaded from: classes5.dex */
public abstract class iot extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1627239298);
    }

    public abstract void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, c cVar);

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        c a2 = a(dXRuntimeContext, getClass().getSimpleName());
        his.b("AbstractGoodDXHandler", "handleEvent | className=" + getClass().getSimpleName());
        a(dXEvent, objArr, dXRuntimeContext, a2);
    }

    private static c a(DXRuntimeContext dXRuntimeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("be1ea63a", new Object[]{dXRuntimeContext, str});
        }
        if (dXRuntimeContext == null) {
            return null;
        }
        ba b = dXRuntimeContext.b();
        if (b instanceof iou) {
            return ((iou) b).d();
        }
        Object a2 = dXRuntimeContext.a();
        if (a2 instanceof HashMap) {
            Object obj = ((HashMap) a2).get(d.TAG_DINAMICX_VIEW_COMPONENT);
            if (obj instanceof IDMComponent) {
                ArrayMap<String, Object> extMap = ((IDMComponent) obj).getExtMap();
                if (extMap == null) {
                    his.a("AbstractGoodDXHandler", "getContextFromDX | extMap_null, className=" + str);
                    hit.a(dXRuntimeContext, "extMap_null", str);
                    return null;
                }
                Object obj2 = extMap.get("gl_ultron_context");
                if (obj2 instanceof c) {
                    return (c) obj2;
                }
                his.a("AbstractGoodDXHandler", "getContextFromDX | context_null, className=" + str);
                hit.a(dXRuntimeContext, "context_null", str);
                return null;
            }
        }
        his.a("AbstractGoodDXHandler", "getContextFromDX | no_match, className=" + str);
        hit.a(dXRuntimeContext, "no_match", str);
        return null;
    }
}
