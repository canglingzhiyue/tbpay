package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;

/* loaded from: classes.dex */
public class lqr extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_GATEWAYREQUEST = 1327792775266732521L;

    static {
        kge.a(-1032207508);
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        ljs a2;
        IContainerDataService iContainerDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 0 || objArr[0] == null || (a2 = lfq.a(dXRuntimeContext)) == null || (iContainerDataService = (IContainerDataService) a2.a(IContainerDataService.class)) == null) {
        } else {
            String obj = objArr[0].toString();
            JSONObject jSONObject = new JSONObject();
            if (objArr.length > 1 && (objArr[1] instanceof JSONObject)) {
                jSONObject = (JSONObject) objArr[1];
            }
            if (objArr.length > 2 && (objArr[2] instanceof JSONObject)) {
                jSONObject.putAll((JSONObject) objArr[2]);
            }
            iContainerDataService.triggerEvent(obj, jSONObject);
        }
    }
}
