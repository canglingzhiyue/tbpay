package com.taobao.android.order.core.dinamicX.parser;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;
import tb.fuf;
import tb.kge;

/* loaded from: classes6.dex */
public class p extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long FORMAT_MTOPDATA_PARSER = -8937873586954609487L;

    static {
        kge.a(902556366);
    }

    public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
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
            return a(objArr[0]);
        }
        return null;
    }

    private Object a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9798556e", new Object[]{this, obj});
        }
        JSONObject jSONObject = null;
        if (obj instanceof JSONObject) {
            jSONObject = new JSONObject();
            for (Map.Entry<String, Object> entry : ((JSONObject) obj).entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    jSONObject.put(entry.getKey(), (Object) value.toString());
                }
            }
        }
        return jSONObject != null ? jSONObject : obj;
    }
}
