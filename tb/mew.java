package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes7.dex */
public class mew extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLRECYCLERDELETEARRAY = 5177303841495911651L;

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 3 || !(objArr[0] instanceof Long) || !(objArr[1] instanceof Long) || !(objArr[2] instanceof String)) {
            return null;
        }
        try {
            int longValue = (int) ((Long) objArr[0]).longValue();
            int longValue2 = (int) ((Long) objArr[1]).longValue();
            String str = (String) objArr[2];
            if (longValue2 <= longValue) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            while (longValue <= longValue2) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("offset", (Object) String.valueOf(longValue));
                    jSONObject.put("isRelative", (Object) str);
                    jSONArray.add(jSONObject);
                    longValue++;
                } catch (Exception unused) {
                }
            }
            return jSONArray;
        } catch (Exception unused2) {
            return null;
        }
    }
}
