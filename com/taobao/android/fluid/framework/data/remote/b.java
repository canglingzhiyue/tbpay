package com.taobao.android.fluid.framework.data.remote;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.f;
import com.taobao.android.layoutmanager.module.MtopModule;
import java.util.Map;
import tb.kge;
import tb.oeb;

/* loaded from: classes5.dex */
public class b implements MtopModule.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String[] f12535a;
    private static String[] b;

    static {
        kge.a(759549099);
        kge.a(1244289183);
        f12535a = null;
        b = null;
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (b != null) {
        } else {
            String a2 = oeb.a("ShortVideo.IgnoreDetailParamsKeys", (String) null);
            if (TextUtils.isEmpty(a2)) {
                b = new String[]{c.KEY_DATA_SOURCE, c.KEY_CLOSE_WANNA_SEE, c.KEY_SWITCH_MODE};
            } else {
                b = a2.split(",");
            }
        }
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (f12535a != null) {
        } else {
            String a2 = oeb.a("ShortVideo.IgnoreExtendParametersKey", (String) null);
            if (TextUtils.isEmpty(a2)) {
                f12535a = new String[]{"bxFeature", c.KEY_LBS_DATA, c.KEY_REFRESH_TYPE, "page", c.KEY_FROMLAUNCHER, c.KEY_ISSIMPLEPAGE, c.KEY_ISGGPICKPRELOAD, c.KEY_TAB3COMPONENTSOURCE, c.KEY_ENABLE_SERVER_ABR, c.KEY_IS_PRELOAD_FILL, c.KEY_NETWORK_SPEED, c.KEY_DATA_SOURCE, c.KEY_CLOSE_WANNA_SEE, c.KEY_SWITCH_MODE, "spm-url", c.KEY_ISAUTOSLIDE, c.KEY_VERTICAL_LAYOUT, FluidSDK.FLUID_SDK_FLAG, f.FLUID_SDK_REMOTE_VERSION};
            } else {
                f12535a = a2.split(",");
            }
        }
    }

    @Override // com.taobao.android.layoutmanager.module.MtopModule.b
    public boolean a(String str, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1adbbee", new Object[]{this, str, obj, obj2})).booleanValue();
        }
        if ("params".equals(str)) {
            JSONObject a2 = com.taobao.android.fluid.framework.data.remote.newmodel.b.a(obj);
            JSONObject a3 = com.taobao.android.fluid.framework.data.remote.newmodel.b.a(obj2);
            if (a2 != null && a3 != null) {
                return b(a.KEY_EXTEND_PARAMETERS, com.taobao.android.fluid.framework.data.remote.newmodel.b.b(a2), com.taobao.android.fluid.framework.data.remote.newmodel.b.b(a3)) && b(a.KEY_DETAIL_PARAMETERS, com.taobao.android.fluid.framework.data.remote.newmodel.b.a(a2), com.taobao.android.fluid.framework.data.remote.newmodel.b.a(a3)) && TextUtils.equals(com.taobao.android.fluid.framework.data.remote.newmodel.b.c(a2), com.taobao.android.fluid.framework.data.remote.newmodel.b.c(a3));
            }
        }
        if (TextUtils.equals("asac", str)) {
            return true;
        }
        if (a.KEY_EXTEND_PARAMETERS.equals(str)) {
            return b(a.KEY_EXTEND_PARAMETERS, obj, obj2);
        }
        if (a.KEY_DETAIL_PARAMETERS.equals(str)) {
            return b(a.KEY_DETAIL_PARAMETERS, obj, obj2);
        }
        return obj.equals(obj2);
    }

    @Override // com.taobao.android.layoutmanager.module.MtopModule.b
    public boolean a(Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0efabcc", new Object[]{this, map, map2})).booleanValue();
        }
        if (map == null && map2 == null) {
            return true;
        }
        if (map == null || map2 == null) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                if (map2.get(str) != null || !map2.containsKey(str)) {
                    return false;
                }
            } else {
                Object obj = map2.get(str);
                if (!value.equals(obj) && (!str.equals("params") || !(value instanceof String) || !(obj instanceof String) || !JSON.parseObject((String) value).equals(JSON.parseObject((String) obj)))) {
                    if (!a(str, value, obj)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean b(String str, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e26388af", new Object[]{this, str, obj, obj2})).booleanValue();
        }
        a();
        b();
        String[] strArr = null;
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1720990556) {
            if (hashCode == -751680229 && str.equals(a.KEY_DETAIL_PARAMETERS)) {
                c = 1;
            }
        } else if (str.equals(a.KEY_EXTEND_PARAMETERS)) {
            c = 0;
        }
        if (c == 0) {
            strArr = f12535a;
        } else if (c == 1) {
            strArr = b;
        }
        if (!(obj instanceof String) || !(obj2 instanceof String)) {
            return false;
        }
        JSONObject parseObject = JSON.parseObject((String) obj);
        JSONObject parseObject2 = JSON.parseObject((String) obj2);
        if (strArr != null) {
            for (String str2 : strArr) {
                parseObject.remove(str2);
                parseObject2.remove(str2);
            }
        }
        return parseObject.equals(parseObject2);
    }
}
