package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class bde extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CARTMAPUTILS = -8241795551114424091L;

    static {
        kge.a(-64459515);
    }

    public static /* synthetic */ Object ipc$super(bde bdeVar, String str, Object... objArr) {
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
            String valueOf = String.valueOf(objArr[0]);
            if ("insetToJsonInArray".equals(valueOf)) {
                return a(objArr);
            }
            if ("mergeJsonArray".equals(valueOf)) {
                return b(objArr);
            }
        }
        return null;
    }

    private JSONArray a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("8f496b55", new Object[]{this, objArr});
        }
        if (objArr.length < 4) {
            return null;
        }
        Object obj = objArr[1];
        if (!(obj instanceof JSONArray)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) obj;
        JSONObject jSONObject = new JSONObject();
        String str = null;
        for (int i = 2; i < objArr.length; i++) {
            if (str == null) {
                str = String.valueOf(objArr[i]);
            } else {
                jSONObject.put(str, objArr[i]);
                str = null;
            }
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                ((JSONObject) next).putAll(jSONObject);
            }
        }
        return jSONArray;
    }

    private JSONArray b(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b89dc096", new Object[]{this, objArr});
        }
        if (objArr.length < 2) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 1; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof JSONArray) {
                jSONArray.addAll((JSONArray) obj);
            }
        }
        return jSONArray;
    }
}
