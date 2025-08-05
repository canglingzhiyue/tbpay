package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.nav.Nav;
import com.taobao.mytaobao.base.c;
import kotlin.Metadata;
import kotlin.collections.g;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\fJ \u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J-\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/taobao/mytaobao/pagev2/eventhandler/DXMtbTapEventHandler;", "Lcom/taobao/android/dinamicx/DXAbsEventHandler;", "()V", "handleEvent", "", "event", "Lcom/taobao/android/dinamicx/expression/event/DXEvent;", "args", "", "", "runtimeContext", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "(Lcom/taobao/android/dinamicx/expression/event/DXEvent;[Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)V", "performNav", "context", "Landroid/content/Context;", "key", "", "userContext", "Lcom/taobao/mytaobao/pagev2/architecture/dx/MtbDxUserContext;", "performUT", "(Ljava/lang/String;[Ljava/lang/Object;Lcom/taobao/mytaobao/pagev2/architecture/dx/MtbDxUserContext;)V", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xkt extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-442902167);
    }

    public static /* synthetic */ Object ipc$super(xkt xktVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        Object obj = null;
        ba b = dXRuntimeContext != null ? dXRuntimeContext.b() : null;
        if (!(b instanceof xod)) {
            b = null;
        }
        xod xodVar = (xod) b;
        if (xodVar == null) {
            return;
        }
        Object a2 = objArr != null ? g.a(objArr, 0) : null;
        if (a2 instanceof String) {
            obj = a2;
        }
        String str = (String) obj;
        if (str == null) {
            return;
        }
        Context m = dXRuntimeContext.m();
        q.a((Object) m, "runtimeContext.context");
        a(m, str, xodVar);
        a(str, objArr, xodVar);
    }

    private final void a(Context context, String str, xod xodVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f2072d", new Object[]{this, context, str, xodVar});
            return;
        }
        JSONObject a2 = xodVar.a().a();
        if (a2 == null || (jSONObject = a2.getJSONObject("events")) == null || (jSONObject2 = jSONObject.getJSONObject("clickEvents")) == null || (jSONObject3 = jSONObject2.getJSONObject(str)) == null || (string = jSONObject3.getString("url")) == null) {
            return;
        }
        Nav.from(context).toUri(string);
        c.x = string;
    }

    private final void a(String str, Object[] objArr, xod xodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae0189c2", new Object[]{this, str, objArr, xodVar});
            return;
        }
        JSONObject b = xodVar.b();
        if (b != null && b.getBooleanValue("disableUtForDXTabEvent")) {
            return;
        }
        xks.Companion.a(str, objArr, xodVar);
    }
}
