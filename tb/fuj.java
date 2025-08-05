package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.model.DXJSONObjectForVM;
import java.util.List;

/* loaded from: classes.dex */
public class fuj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-447308532);
    }

    public static Object a(DXRuntimeContext dXRuntimeContext, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f5243d13", new Object[]{dXRuntimeContext, obj, str});
        }
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (obj instanceof DXJSONObjectForVM) {
            return a(dXRuntimeContext, ((DXJSONObjectForVM) obj).getData(), str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).get(str);
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt >= jSONArray.size()) {
                    return null;
                }
                return jSONArray.get(parseInt);
            } catch (Exception unused) {
                fuw.b("DXExpressionParser list index is not number" + str);
                return null;
            }
        }
        if (dXRuntimeContext != null && dXRuntimeContext.O()) {
            return dXRuntimeContext.M().getValue(obj, str);
        }
        return null;
    }

    public static boolean a(DXRuntimeContext dXRuntimeContext, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ef826179", new Object[]{dXRuntimeContext, obj})).booleanValue() : dXRuntimeContext != null && dXRuntimeContext.O() && !(obj instanceof JSONArray) && (obj instanceof List);
    }

    public static boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{obj})).booleanValue() : (!(obj instanceof JSONObject) || (obj instanceof DXJSONObjectForVM)) && !(obj instanceof JSONArray);
    }
}
