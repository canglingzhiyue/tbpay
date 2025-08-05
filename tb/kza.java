package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.b;
import com.taobao.homepage.pop.utils.c;

/* loaded from: classes.dex */
public class kza extends kyx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HSETPOPCLIENTPARAMS = -5468254988785752167L;

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 0) {
            c.a("setPopClientParams ", "dx args is null");
        } else {
            String str = (String) objArr[0];
            String str2 = objArr.length > 1 ? (String) objArr[1] : null;
            if (TextUtils.isEmpty(str)) {
                c.a("setPopClientParams ", "args key is null");
                return;
            }
            kyu b = b.b(dXRuntimeContext);
            IPopData c = b.c(dXRuntimeContext);
            if (b == null || c == null) {
                c.a("setPopClientParams ", "popService or popData is null");
                return;
            }
            JSONObject clientParams = c.getClientParams();
            if (str2 == null) {
                clientParams.remove(str);
            } else {
                clientParams.put(str, (Object) str2);
            }
            c.b("setPopClientParams ", "set, key=" + str + ", value=" + str2);
        }
    }
}
