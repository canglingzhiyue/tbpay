package com.taobao.android.adam.common;

import com.alibaba.android.ultron.vfw.viewholder.d;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Map;
import java.util.StringTokenizer;
import tb.dmp;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1383004002);
    }

    private static boolean a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("638f9910", new Object[]{charSequence})).booleanValue() : charSequence == null || charSequence.length() == 0;
    }

    public static Object a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("abaf35f4", new Object[]{str, jSONObject});
        }
        if (a(str)) {
            return jSONObject;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, dmp.DELIMITER, false);
        Object obj = jSONObject;
        while (stringTokenizer.hasMoreTokens()) {
            obj = a(obj, stringTokenizer.nextToken());
        }
        return obj;
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
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public static IDMComponent a(String str, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("de692166", new Object[]{str, iDMComponent});
        }
        if (iDMComponent == null) {
            return null;
        }
        if (str.equals(iDMComponent.getTag())) {
            return iDMComponent;
        }
        IDMComponent parent = iDMComponent.getParent();
        if (parent != null) {
            return a(str, parent);
        }
        return null;
    }

    public static IDMComponent a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("f178275d", new Object[]{dXRuntimeContext});
        }
        if (dXRuntimeContext == null) {
            return null;
        }
        Object a2 = dXRuntimeContext.a();
        if (!(a2 instanceof Map)) {
            return null;
        }
        Object obj = ((Map) a2).get(d.TAG_DINAMICX_VIEW_COMPONENT);
        if (!(obj instanceof IDMComponent)) {
            return null;
        }
        return (IDMComponent) obj;
    }
}
