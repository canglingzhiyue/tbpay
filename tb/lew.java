package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* loaded from: classes.dex */
public class lew extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_RUTCLICKTRACKEVENT = 5560765727008152586L;

    static {
        kge.a(-571861257);
    }

    public static /* synthetic */ Object ipc$super(lew lewVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else {
            a(objArr, dXRuntimeContext);
        }
    }

    private void a(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad925d7a", new Object[]{this, objArr, dXRuntimeContext});
            return;
        }
        ljs a2 = lfq.a(dXRuntimeContext);
        BaseSectionModel<?> b = lfq.b(dXRuntimeContext);
        JSONObject jSONObject = (JSONObject) lfq.a(objArr, 0, JSONObject.class);
        if (a2 == null || jSONObject == null || b == null) {
            return;
        }
        ljh.a(a2, dXRuntimeContext.s(), b, jSONObject, (JSONObject) null);
        liw.a(a2, b, jSONObject);
    }
}
