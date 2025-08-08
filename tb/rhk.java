package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.home.component.utils.e;

/* loaded from: classes5.dex */
public class rhk extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HSETTOCURRENTMODEL = -5475101679954006979L;
    public static final String KEY_CLIENT_CACHE = "clientCache";

    static {
        kge.a(-1999579411);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.alibaba.fastjson.JSONObject] */
    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 0) {
            e.e("setToCurrentModel", "dx args is null");
        } else {
            String str = (String) objArr[0];
            String str2 = objArr.length > 1 ? (String) objArr[1] : null;
            if (StringUtils.isEmpty(str)) {
                e.e("setToCurrentModel", "args key is null");
                return;
            }
            JSONObject e = dXRuntimeContext.e();
            if (e == null) {
                e.e("setToCurrentModel", "sectionData == null, key=" + str);
                return;
            }
            JSONObject jSONObject = e.getJSONObject("ext");
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                e.put("ext", (Object) jSONObject);
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("clientCache");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject(16);
                jSONObject.put("clientCache", (Object) jSONObject2);
            }
            if (str2 == null) {
                jSONObject2.remove(str);
            } else {
                jSONObject2.put(str, str2);
            }
            e.e("setToCurrentModel", "set, key=" + str + ", value=" + str2);
        }
    }
}
