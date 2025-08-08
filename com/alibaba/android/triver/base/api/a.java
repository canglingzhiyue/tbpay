package com.alibaba.android.triver.base.api;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1258498666);
    }

    private static JSONArray b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("fe97466b", new Object[]{str});
        }
        JSONArray jSONArray = null;
        try {
            jSONArray = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONArray(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a(jSONArray);
    }

    private static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        try {
            String config = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig(str, String.valueOf(z));
            return StringUtils.isEmpty(config) ? z : "true".equals(config);
        } catch (Exception e) {
            e.printStackTrace();
            return z;
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : str != null && !b("jumpToTRiverBlackList").contains(str);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : a("isHandleTbOpenUrl", true);
    }

    public static JSONArray a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("b36fc2ae", new Object[]{jSONArray}) : jSONArray == null ? new JSONArray() : jSONArray;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        String config = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig("widgetPreviewPageUrl", "https://market.m.taobao.com/app/weex-canal/widget-preview/main?wh_weex=true&wx_navbar_hidden=true");
        return (StringUtils.isEmpty(config) || "null".equals(config)) ? "https://market.m.taobao.com/app/weex-canal/widget-preview/main?wh_weex=true&wx_navbar_hidden=true" : config;
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        int intValue = Integer.valueOf("5/5/5".split("/")[i]).intValue();
        try {
            return Integer.valueOf(a("trWidgetInstanceCacheSize", "5/5/5").split("/")[i]).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return intValue;
        }
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            return ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue() : b("enableFullScreenWithPadOrFold").contains(str);
    }
}
