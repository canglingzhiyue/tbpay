package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.weex_framework.util.a;
import java.util.Collections;

/* loaded from: classes2.dex */
public class bdg extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CARTPRICESPLIT = 8125423360837218743L;

    static {
        kge.a(1003160481);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        String str = (String) objArr[0];
        if (StringUtils.isEmpty(str)) {
            return Collections.emptyMap();
        }
        int a2 = a(str);
        if (a2 < 0) {
            return Collections.emptyMap();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(a.ATOM_symbol, (Object) str.substring(0, a2));
        int indexOf = str.indexOf(46);
        if (indexOf < 0) {
            jSONObject.put(a.ATOM_integer, (Object) str.substring(a2));
            jSONObject.put("decimal", (Object) "");
        } else {
            jSONObject.put(a.ATOM_integer, (Object) str.substring(a2, indexOf));
            jSONObject.put("decimal", (Object) str.substring(indexOf + 1));
        }
        return jSONObject;
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
}
