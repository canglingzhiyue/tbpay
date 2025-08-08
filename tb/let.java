package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* loaded from: classes.dex */
public class let extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_INSERTCARDS = 204709052093538189L;

    /* renamed from: a  reason: collision with root package name */
    private lel f30538a;

    static {
        kge.a(-1797242855);
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
            ldf.d("DXInsertCardsEventHandler", "infoFlowContext == null");
            return;
        }
        BaseSectionModel<?> b = lfq.b(dXRuntimeContext);
        if (b == null) {
            ldf.d("DXInsertCardsEventHandler", "section is null");
            return;
        }
        String sectionBizCode = b.getSectionBizCode();
        if (StringUtils.isEmpty(sectionBizCode)) {
            ldf.d("DXInsertCardsEventHandler", "sectionBizCode is null");
            return;
        }
        Object obj = objArr[0];
        if (!(obj instanceof JSONObject)) {
            ldf.d("DXInsertCardsEventHandler", "data not JSONObject : " + obj);
            return;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (this.f30538a == null) {
            this.f30538a = new lel(a2);
        }
        this.f30538a.a(a2, jSONObject, sectionBizCode);
        ljh.a(a2, dXRuntimeContext.s(), b, jSONObject, (JSONObject) null);
        liw.a(b, jSONObject);
    }
}
