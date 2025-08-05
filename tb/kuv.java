package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.home.component.utils.k;
import com.taobao.homepage.utils.e;
import com.taobao.tao.Globals;

/* loaded from: classes.dex */
public class kuv extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_APPEAREXPOSE = -1980042490983877383L;

    static {
        kge.a(312258623);
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 0) {
        } else {
            Object obj = objArr[0];
            if (!(obj instanceof JSONObject)) {
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            e.b(dXRuntimeContext, jSONObject);
            k.a(jSONObject, Globals.getApplication());
            lam.b(jSONObject);
        }
    }
}
