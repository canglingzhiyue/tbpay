package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.o;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.base.f;
import com.alibaba.android.umf.datamodel.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class bqy extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f26053a = "AbsUMFDxEventHandler";

    static {
        kge.a(429949330);
    }

    public abstract boolean a(brh brhVar);

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public final void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 0) {
            bqe.a().c("AbsUMFDxEventHandler", "handleEvent#args is empty");
        } else if (dXRuntimeContext == null) {
        } else {
            Object a2 = dXRuntimeContext.a();
            if (!(a2 instanceof Map)) {
                bqe.a().c("AbsUMFDxEventHandler", "handleEvent#dxUserContext is not map type");
                return;
            }
            try {
                map = (Map) a2;
            } catch (Throwable unused) {
                map = null;
            }
            if (map == null) {
                bqe.a().c("AbsUMFDxEventHandler", "handleEvent#dxUserContextMap is null");
                return;
            }
            AURARenderComponent aURARenderComponent = (AURARenderComponent) a(o.a.KEY_USER_CONTEXT_RENDER_COMPONENT, map, AURARenderComponent.class);
            if (aURARenderComponent == null) {
                bqe.a().c("AbsUMFDxEventHandler", "handleEvent#UMFTaobaoAdapterConstant.DX.KEY_USER_CONTEXT_UMF_COMPONENT is null");
                return;
            }
            b bVar = (b) a(o.a.KEY_USER_CONTEXT_UMF_RUNTIME_CONTEXT, map, b.class);
            if (bVar == null) {
                bqe.a().c("AbsUMFDxEventHandler", "handleEvent#UMFTaobaoAdapterConstant.DX.KEY_USER_CONTEXT_UMF_RUNTIME_CONTEXT is null");
                return;
            }
            f fVar = (f) bVar.a("eventHandler", (Class<Object>) f.class);
            if (fVar == null) {
                bqe.a().c("AbsUMFDxEventHandler", "handleEvent#UMFConstants.RuntimeContext.KEY_EVENT_HANDLER is null");
                return;
            }
            brh brhVar = new brh(String.valueOf(dXEvent.getEventId()), bVar, aURARenderComponent, objArr);
            brhVar.a(dXEvent);
            brhVar.a(fVar);
            a(brhVar);
        }
    }

    public <T> T a(String str, Map<String, Object> map, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9cb9e1e8", new Object[]{this, str, map, cls});
        }
        T t = (T) map.get(str);
        if (t == null) {
            bqd a2 = bqe.a();
            a2.c("AbsUMFDxEventHandler", "handleEvent#value of " + str + " is null");
            return null;
        }
        try {
        } catch (Throwable th) {
            bqd a3 = bqe.a();
            a3.c("AbsUMFDxEventHandler", "handleEvent#exception for retrieve " + str + ",error=" + th.getMessage());
        }
        if (t.getClass() == cls) {
            return t;
        }
        bqd a4 = bqe.a();
        a4.c("AbsUMFDxEventHandler", "handleEvent#type of " + str + " is not match");
        return null;
    }

    public final void b(brh brhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0c9a041", new Object[]{this, brhVar});
            return;
        }
        f g = brhVar.g();
        if (g == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("umfEventModel", brhVar);
        e a2 = g.a();
        a2.a((Map<? extends String, ? extends Object>) hashMap);
        a2.a(brhVar.h());
        g.a(a2);
    }
}
