package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;

/* loaded from: classes.dex */
public class fqa extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_BINDINGX = 1454898448112604731L;

    static {
        kge.a(1391121632);
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "bindingX";
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        DXRootView s = dXRuntimeContext.s();
        if (s == null || objArr == null || objArr.length == 0) {
            return;
        }
        DXWidgetNode d = dXRuntimeContext.d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) "BNDX");
        JSONObject jSONObject2 = new JSONObject();
        a(jSONObject2, objArr);
        jSONObject2.put("widget", (Object) d);
        jSONObject.put("params", (Object) jSONObject2);
        if (dXRuntimeContext == null || dXRuntimeContext.C() == null) {
            return;
        }
        dXRuntimeContext.C().a(s, jSONObject);
    }

    public void a(JSONObject jSONObject, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf112a9", new Object[]{this, jSONObject, objArr});
        } else if (objArr != null && jSONObject != null) {
            int length = objArr.length;
            HashMap hashMap = null;
            if (objArr.length >= 2) {
                JSONArray jSONArray = new JSONArray();
                if (objArr[0] instanceof String) {
                    if (!TextUtils.isEmpty((String) objArr[0])) {
                        jSONArray.add(objArr[0]);
                    }
                } else if (objArr[0] instanceof JSONArray) {
                    jSONArray.addAll((JSONArray) objArr[0]);
                } else if (objArr[0] != null) {
                    jSONArray.add(objArr[0]);
                }
                jSONObject.put("spec", (Object) jSONArray);
                String str = (String) objArr[1];
                if ("start".equalsIgnoreCase(str)) {
                    jSONObject.put("action", "start");
                } else if ("stop".equalsIgnoreCase(str)) {
                    jSONObject.put("action", "stop");
                }
            }
            for (int i = 2; i < length; i += 2) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                int i2 = i + 1;
                if (i2 >= length) {
                    break;
                }
                hashMap.put((String) objArr[i], objArr[i2]);
            }
            if (hashMap == null) {
                return;
            }
            jSONObject.put("args", (Object) hashMap);
        }
    }
}
