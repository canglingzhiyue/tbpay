package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;
import com.taobao.homepage.pop.utils.b;
import com.taobao.homepage.pop.utils.c;
import com.taobao.homepage.pop.utils.f;

/* loaded from: classes.dex */
public class kzg extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_POPMESSAGE = -5607208732990739170L;

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 0) {
        } else {
            DXRootView s = dXRuntimeContext.s();
            if (s == null || !s.isShown()) {
                c.a("DXPopMessage ", "root view is not show, discard pop message");
                return;
            }
            kyu b = b.b(dXRuntimeContext);
            IPopData c = b.c(dXRuntimeContext);
            if (b == null || c == null) {
                c.a("DXPopMessage ", "engine or popData is null");
                return;
            }
            String obj = objArr[0] == null ? null : objArr[0].toString();
            if (TextUtils.isEmpty(obj)) {
                c.a("DXPopMessage ", "messageId is empty");
                return;
            }
            JSONObject jSONObject = objArr.length > 1 ? objArr[1] : null;
            JSONObject jSONObject2 = jSONObject instanceof JSONObject ? jSONObject : null;
            JSONObject jSONObject3 = objArr.length > 1 ? objArr[1] : null;
            if (jSONObject3 instanceof JSONObject) {
                c.getClientParams().putAll(jSONObject3);
            }
            BasePopSectionModel<?> a2 = b.a(dXRuntimeContext);
            JSONObject jSONObject4 = objArr.length > 3 ? objArr[3] : null;
            if (a2 != null && (jSONObject4 instanceof JSONObject)) {
                f.a(a2, jSONObject4, (JSONObject) null);
            }
            b.a(obj, c.getBusinessID(), jSONObject2);
        }
    }
}
