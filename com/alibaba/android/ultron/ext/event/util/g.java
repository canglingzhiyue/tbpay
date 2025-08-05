package com.alibaba.android.ultron.ext.event.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.StringTokenizer;
import tb.dmp;
import tb.kge;

/* loaded from: classes2.dex */
public class g implements j<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1818826877);
        kge.a(896130799);
    }

    @Override // com.alibaba.android.ultron.ext.event.util.j
    public Object a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("abaf35f4", new Object[]{this, str, jSONObject}) : b(str, jSONObject);
    }

    public static boolean a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("638f9910", new Object[]{charSequence})).booleanValue() : charSequence == null || charSequence.length() == 0;
    }

    private static Object b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("72bb1cf5", new Object[]{str, jSONObject});
        }
        if (a(str)) {
            return jSONObject;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, dmp.DELIMITER, false);
        Object obj = jSONObject;
        while (stringTokenizer.hasMoreTokens()) {
            obj = a(obj, stringTokenizer.nextToken());
        }
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    private static Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a12221e4", new Object[]{obj, str});
        }
        if (obj != null && str != null) {
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).get(str);
            }
            if (obj instanceof JSONArray) {
                try {
                    return ((JSONArray) obj).get(Integer.parseInt(str));
                } catch (Exception e) {
                    c.a("DataParser", "getValue", "EVENT_CHAIN_TRY_EXCEPTION_ERROR", c.a(e));
                }
            }
        }
        return null;
    }
}
