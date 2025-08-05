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
public class lev extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_RTAP = 37581716043L;
    public static final String TAG = "rTap";

    /* renamed from: a  reason: collision with root package name */
    private lds f30540a;

    static {
        kge.a(-335086328);
    }

    public static /* synthetic */ Object ipc$super(lev levVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        BaseSectionModel<?> baseSectionModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        ljs a2 = lfq.a(dXRuntimeContext);
        if (a2 == null) {
            ldf.d("rTap", "infoFlowContext == null");
            return;
        }
        BaseSectionModel<?> b = lfq.b(dXRuntimeContext);
        if (b == null) {
            ldf.d("rTap", "sectionModel == null");
            return;
        }
        BaseSubItemModel mo1095createBaseSubItemModel = b.mo1095createBaseSubItemModel(objArr[0] instanceof JSONObject ? (JSONObject) objArr[0] : null);
        if (objArr.length <= 1 || objArr[1] == null || !(objArr[1] instanceof JSONObject)) {
            baseSectionModel = b;
        } else {
            baseSectionModel = b.createBaseSectionModel((JSONObject) objArr[1]);
            if (baseSectionModel.getSectionBizCode() == null) {
                baseSectionModel.put("sectionBizCode", (Object) b.getSectionBizCode());
            }
        }
        if (mo1095createBaseSubItemModel == null) {
            ldf.d("rTap", "subItemModel == null");
            return;
        }
        ljh.a(baseSectionModel, mo1095createBaseSubItemModel);
        a(a2).a(baseSectionModel, mo1095createBaseSubItemModel, dXRuntimeContext.s());
    }

    private lds a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lds) ipChange.ipc$dispatch("ac9ca688", new Object[]{this, ljsVar});
        }
        if (this.f30540a == null) {
            this.f30540a = new ldv(ljsVar);
        }
        return this.f30540a;
    }
}
