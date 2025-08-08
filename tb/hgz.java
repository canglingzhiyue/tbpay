package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes5.dex */
public class hgz extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_JSONARRAYSTR2TEXTBYKEY = -4901210116374978365L;

    static {
        kge.a(-1917138661);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0) {
            try {
                String str = (String) objArr[0];
                if (StringUtils.isEmpty(str)) {
                    return null;
                }
                int parseInt = Integer.parseInt((String) objArr[1]);
                JSONArray c = pqj.c(str);
                if (c != null) {
                    return ((JSONObject) c.get(parseInt)).getString("text");
                }
                return null;
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
