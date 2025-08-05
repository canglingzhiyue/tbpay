package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public class lff extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HSTRTOJSON = -6150397287027100920L;

    static {
        kge.a(-1366490329);
    }

    public static /* synthetic */ Object ipc$super(lff lffVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0) {
            String b = b(objArr);
            if (TextUtils.isEmpty(b)) {
                return null;
            }
            try {
                if (a(objArr)) {
                    return JSONArray.parseArray(b);
                }
                return JSONObject.parseObject(b);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private boolean a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b63135cd", new Object[]{this, objArr})).booleanValue();
        }
        Object obj = null;
        if (objArr.length >= 2) {
            obj = objArr[1];
        }
        return "array".equals(obj);
    }

    private String b(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b22414f8", new Object[]{this, objArr});
        }
        Object obj = objArr[0];
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }
}
