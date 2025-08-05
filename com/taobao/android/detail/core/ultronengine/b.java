package com.taobao.android.detail.core.ultronengine;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BIZ_DATA = "bizData";
    public static final String KEY_VERSION = "version";

    static {
        kge.a(-1444058217);
        emu.a("com.taobao.android.detail.core.ultronengine.NodeBundleAdapter");
    }

    public static JSONObject a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("59e78622", new Object[]{bVar});
        }
        if (bVar == null) {
            return null;
        }
        if (bVar.b() != null) {
            jSONObject = bVar.a();
        } else {
            jSONObject = bVar.a().getJSONObject("bizData");
        }
        if (jSONObject != null) {
            return jSONObject.getJSONObject("template");
        }
        return null;
    }

    public static boolean b(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fd4e747", new Object[]{bVar})).booleanValue();
        }
        if (bVar != null && (b = bVar.b()) != null) {
            return b.getString("version").equals("v7");
        }
        return false;
    }

    public static boolean c(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33646b88", new Object[]{bVar})).booleanValue();
        }
        if (bVar == null) {
            return false;
        }
        try {
            JSONObject c = bVar.c();
            if (c == null) {
                c = bVar.a();
            }
            if (c.getJSONObject(com.taobao.android.fluid.framework.data.remote.newmodel.a.MATCH_IGNORE) != null) {
                return c.getJSONObject(com.taobao.android.fluid.framework.data.remote.newmodel.a.MATCH_IGNORE).getBoolean("ignoreAll").booleanValue();
            }
        } catch (Throwable th) {
            i.a("NodeBundleAdapter", "needIgnoreAll", th);
        }
        return false;
    }

    public static String d(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd04e77b", new Object[]{bVar});
        }
        if (bVar == null) {
            return null;
        }
        try {
            JSONObject b = bVar.b();
            if (b != null) {
                return b.getString("version");
            }
        } catch (Throwable th) {
            i.a("NodeBundleAdapter", "getVersion", th);
        }
        return null;
    }
}
