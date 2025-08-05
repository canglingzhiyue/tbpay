package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.home.component.utils.e;

/* loaded from: classes5.dex */
public class rhq extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HGETFROMCURRENTMODEL = 8491394548880287236L;

    static {
        kge.a(1999098374);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object obj = null;
        if (objArr == null || objArr.length <= 0) {
            e.e("getFromCurrentModel", "operationList == null");
            return null;
        }
        if (objArr.length >= 2) {
            obj = objArr[1];
        }
        JSONObject e = dXRuntimeContext.e();
        if (e == null) {
            e.e("getFromCurrentModel", "sectionData == null");
            return obj;
        }
        String str = (String) objArr[0];
        if (TextUtils.isEmpty(str)) {
            e.e("getFromCurrentModel", "key == null");
            return obj;
        }
        JSONObject jSONObject = e.getJSONObject("ext");
        if (jSONObject == null) {
            return obj;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("clientCache");
        if (jSONObject2 == null) {
            e.e("getFromCurrentModel", "clientCache == null, key=" + str);
            return obj;
        }
        Object obj2 = jSONObject2.get(str);
        if (obj2 == null) {
            return obj == null ? "" : obj;
        }
        e.e("getFromCurrentModel", "get, key=" + str + ", value=" + obj2);
        return obj2;
    }
}
