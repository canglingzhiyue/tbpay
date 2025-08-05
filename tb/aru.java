package tb;

import android.util.Log;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.c;
import com.alibaba.android.aura.service.event.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import tb.arc;

/* loaded from: classes2.dex */
public abstract class aru extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f25541a = "AbsUMFDxEventHandler";

    static {
        kge.a(1381184280);
    }

    public static /* synthetic */ Object ipc$super(aru aruVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract boolean a(d dVar, s sVar);

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public final void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (a(objArr, dXRuntimeContext)) {
        } else {
            art artVar = (art) dXRuntimeContext.a();
            artVar.a(dXEvent);
            artVar.a(objArr);
            if (a(artVar.b)) {
                return;
            }
            if (baw.a()) {
                a(dXEvent, objArr, artVar.b);
            }
            a(dXEvent, objArr, dXRuntimeContext, artVar.f25540a.b(), artVar.b);
        }
    }

    private void a(DXEvent dXEvent, Object[] objArr, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("223d094", new Object[]{this, dXEvent, objArr, aURARenderComponent});
            return;
        }
        arc.a a2 = arc.a.a();
        a2.a("AURA/action").a("eventHandle", getClass().getName()).a("dxEvent", dXEvent.getEventId()).a("args", bba.b(objArr)).a("target", aURARenderComponent.key);
        arc.a().a("AbsUMFDxEventHandler", a2.b());
        Log.e("simulation", getClass().getSimpleName() + " " + a2.b());
    }

    private boolean a(AURARenderComponent aURARenderComponent) {
        AURARenderComponentData aURARenderComponentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca7f23d7", new Object[]{this, aURARenderComponent})).booleanValue();
        }
        if (aURARenderComponent != null && (aURARenderComponentData = aURARenderComponent.data) != null) {
            return aURARenderComponentData.isDisable();
        }
        return false;
    }

    private void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, s sVar, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be249afc", new Object[]{this, dXEvent, objArr, dXRuntimeContext, sVar, aURARenderComponent});
            return;
        }
        d dVar = new d();
        dVar.a(String.valueOf(dXEvent.getEventId()));
        dVar.a(aURARenderComponent);
        dVar.a(objArr);
        dVar.a(dXEvent);
        dVar.a(d.EXT_KEY_DX_RUNTIME_CONTEXT, dXRuntimeContext);
        a(dVar, sVar);
    }

    private boolean a(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad925d7e", new Object[]{this, objArr, dXRuntimeContext})).booleanValue();
        }
        if (objArr == null || objArr.length <= 0) {
            arc.a().c("AbsUMFDxEventHandler", "checkParamsInvalid", "args is empty");
            return true;
        } else if (dXRuntimeContext == null) {
            return true;
        } else {
            Object a2 = dXRuntimeContext.a();
            if (!(a2 instanceof art)) {
                arc.a().c("AbsUMFDxEventHandler", "checkParamsInvalid", "dxUserContextObj is not AURADXUserContext type");
                return true;
            }
            art artVar = (art) a2;
            if (artVar.b == null) {
                arc.a().c("AbsUMFDxEventHandler", "checkParamsInvalid", "mRenderComponent is null");
                return true;
            } else if (artVar.f25540a != null && artVar.f25540a.b() != null) {
                return false;
            } else {
                arc.a().c("AbsUMFDxEventHandler", "checkParamsInvalid", "AURAInstance is null");
                return true;
            }
        }
    }

    public final void a(String str, d dVar, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105880de", new Object[]{this, str, dVar, sVar});
        } else {
            c.a(sVar, str, dVar);
        }
    }
}
