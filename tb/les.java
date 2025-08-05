package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;

/* loaded from: classes.dex */
public class les extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HTAP = 34696035233L;

    /* renamed from: a  reason: collision with root package name */
    private lds f30537a;

    static {
        kge.a(559589118);
    }

    public static /* synthetic */ Object ipc$super(les lesVar, String str, Object... objArr) {
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
        ljs a2 = lfq.a(dXRuntimeContext);
        if (a2 == null) {
            ldf.d("DXHTapEvent", "infoFlowContext == null");
            return;
        }
        BaseSectionModel<?> b = lfq.b(dXRuntimeContext);
        if (b == null) {
            ldf.d("DXHTapEvent", "sectionModel == null");
            return;
        }
        BaseSubItemModel mo1095createBaseSubItemModel = b.mo1095createBaseSubItemModel(objArr[0] instanceof JSONObject ? (JSONObject) objArr[0] : null);
        if (mo1095createBaseSubItemModel == null) {
            ldf.d("DXHTapEvent", "subItemModel == null");
            return;
        }
        ljh.a(b, mo1095createBaseSubItemModel);
        a(a2).a(b, mo1095createBaseSubItemModel, dXRuntimeContext.s());
    }

    private lds a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lds) ipChange.ipc$dispatch("ac9ca688", new Object[]{this, ljsVar});
        }
        if (this.f30537a == null) {
            this.f30537a = new ldu(ljsVar);
        }
        return this.f30537a;
    }
}
