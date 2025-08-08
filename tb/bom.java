package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.dinamicx.widget.calander.DXOnSelectDateEvent;
import java.util.Map;

/* loaded from: classes2.dex */
public class bom extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_DXCUSTOMEVENT = 8297186312837803622L;

    /* renamed from: a  reason: collision with root package name */
    private final String f26024a = "ODxCustomEvent";

    static {
        kge.a(-491651636);
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (dXEvent instanceof DXOnSelectDateEvent) {
            Map<String, String> data = ((DXOnSelectDateEvent) dXEvent).getData();
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : data.entrySet()) {
                jSONObject.put(entry.getKey(), (Object) entry.getValue());
            }
            if (objArr.length > 0) {
                String str = (String) objArr[0];
                if (!StringUtils.isEmpty(str)) {
                    jSONObject.put("userId", (Object) str);
                }
            }
            try {
                dXRuntimeContext.C().b().l().a("calendarViewEvent", jSONObject);
            } catch (NullPointerException e) {
                hzy.a("ODxCustomEvent", "DXOnSelectDateEvent-error", e);
            }
        }
    }
}
