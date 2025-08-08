package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;
import com.taobao.homepage.pop.utils.b;
import com.taobao.homepage.pop.utils.c;

/* loaded from: classes.dex */
public class kze extends kyx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_POPCLICK = 5584505997581213501L;

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 0) {
        } else {
            Object obj = null;
            String obj2 = objArr[0] == null ? null : objArr[0].toString();
            if (StringUtils.isEmpty(obj2)) {
                return;
            }
            BasePopSectionModel<?> a2 = b.a(dXRuntimeContext);
            if (objArr.length > 1) {
                obj = objArr[1];
            }
            if (a2 != null && (obj instanceof JSONObject)) {
                a(a2, (JSONObject) obj);
            }
            kyu b = b.b(dXRuntimeContext);
            IPopData c = b.c(dXRuntimeContext);
            if (b == null || c == null) {
                return;
            }
            try {
                int intValue = Integer.valueOf(obj2).intValue();
                c.b("PopClickEvent ", "==== popClick, type=" + intValue);
                b.a(intValue, c.getBusinessID());
            } catch (Throwable th) {
                c.a("PopClickEvent ", th);
            }
        }
    }
}
