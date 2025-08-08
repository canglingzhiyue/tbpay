package com.alibaba.android.bindingx.core;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.Dimension;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APM_DIMENSION_BUNDLE_URL = "wx_bundle_url";
    public static final String APM_DIMENSION_PLUGIN_TYPE = "bindingx_plugin";
    public static final String APM_MODULE = "Triver";
    public static final String APM_POINT = "bindingx";
    public static final String CONFIG_ALLOW_BINDING_X_APM_REPORT = "wx_allow_bindingx_apm";
    public static final String CONFIG_DISABLE_BINDING_X_WEEX_PLUGIN = "wx_disable_bindingx";
    public static final String ORANGE_GROUP = "FCanvas_Android";
    public static final String PLUGIN_TYPE_NATIVE = "dx";
    public static final String PLUGIN_TYPE_WEEX = "weex";

    static {
        kge.a(1751566408);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(ORANGE_GROUP, CONFIG_DISABLE_BINDING_X_WEEX_PLUGIN, "false"));
        } catch (Throwable th) {
            Log.e(APM_POINT, "failed to get orange config(wx_disable_bindingx): " + th.getMessage());
            return false;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(ORANGE_GROUP, CONFIG_ALLOW_BINDING_X_APM_REPORT, "true"));
        } catch (Throwable th) {
            Log.e(APM_POINT, "failed to get orange config(wx_allow_bindingx_apm): " + th.getMessage());
            return true;
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (StringUtils.isEmpty(str)) {
            Log.e(APM_POINT, "invalid pluginType");
        } else if (!b()) {
            Log.e(APM_POINT, "disallow apm report! abort...");
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(APM_DIMENSION_PLUGIN_TYPE, (Object) str);
                jSONObject.put(APM_DIMENSION_BUNDLE_URL, (Object) a(str2));
                a("Triver", APM_POINT, jSONObject, new JSONObject());
            } catch (Throwable th) {
                Log.e(APM_POINT, "unexpected error when send apm:" + th.getMessage());
            }
        }
    }

    public static void a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c04f5c7c", new Object[]{str, str2, jSONObject, jSONObject2});
        } else if (jSONObject != null) {
            try {
                if (jSONObject.size() > 0 && jSONObject2 != null) {
                    DimensionSet create = DimensionSet.create();
                    DimensionValueSet create2 = DimensionValueSet.create();
                    for (String str3 : jSONObject.keySet()) {
                        create.addDimension(new Dimension(str3));
                        create2.setValue(str3, jSONObject.getString(str3));
                    }
                    MeasureSet create3 = MeasureSet.create();
                    MeasureValueSet create4 = MeasureValueSet.create();
                    for (String str4 : jSONObject2.keySet()) {
                        create3.addMeasure(new Measure(str4));
                        create4.setValue(str4, jSONObject2.getDoubleValue(str4));
                    }
                    AppMonitor.register(str, str2, create3, create, true);
                    AppMonitor.Stat.commit(str, str2, create2, create4);
                }
            } catch (Throwable th) {
                Log.e(APM_POINT, "failed to send apm because of " + th.getMessage());
            }
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return "unknown_url";
        }
        try {
            int indexOf = str.indexOf("?");
            return indexOf == -1 ? str : str.substring(0, indexOf);
        } catch (Throwable unused) {
            Log.e(APM_POINT, "unexpected error when parseUrl:" + str);
            return str;
        }
    }
}
