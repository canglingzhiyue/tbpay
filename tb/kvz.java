package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public class kvz extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HSTRTOJSON = -6150397287027100920L;

    static {
        kge.a(-866523748);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[0];
            Object obj2 = objArr.length >= 2 ? objArr[1] : null;
            if (!(obj instanceof String)) {
                return null;
            }
            String str = (String) obj;
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            try {
                if ("array".equals(obj2)) {
                    return JSONArray.parseArray(str);
                }
                return JSONObject.parseObject(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
