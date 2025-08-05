package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes7.dex */
public class rig extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_RATEINDEXOFARRAY = 1157512128284556392L;

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 3) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof JSONArray) || (a2 = a((JSONArray) obj, objArr[1], objArr[2])) == -1) {
            return null;
        }
        return String.valueOf(a2);
    }

    public int a(JSONArray jSONArray, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fcd3e3b", new Object[]{this, jSONArray, obj, obj2})).intValue();
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            Object obj3 = jSONArray.get(i);
            if ((obj3 instanceof JSONObject) && (obj instanceof String) && (obj2 instanceof String)) {
                JSONObject jSONObject = (JSONObject) obj3;
                String str = (String) obj;
                if (jSONObject.containsKey(str) && TextUtils.equals((String) obj2, jSONObject.getString(str))) {
                    return i;
                }
            }
        }
        return -1;
    }
}
