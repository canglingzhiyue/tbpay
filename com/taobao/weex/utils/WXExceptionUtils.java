package com.taobao.weex.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.adapter.IWXConfigAdapter;
import com.taobao.weex.adapter.IWXJSExceptionAdapter;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.common.WXJSExceptionInfo;
import com.taobao.weex.performance.e;
import com.taobao.weex.performance.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.bao;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class WXExceptionUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Set<String> f23536a;
    public static String degradeUrl;

    static {
        kge.a(-3251140);
        f23536a = new CopyOnWriteArraySet();
        degradeUrl = "BundleUrlDefaultDegradeUrl";
    }

    private static boolean a(String str, WXErrorCode wXErrorCode, String str2) {
        Set<String> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4b35d84", new Object[]{str, wXErrorCode, str2})).booleanValue();
        }
        if (StringUtils.isEmpty(str2)) {
            return true;
        }
        if (wXErrorCode != null && wXErrorCode.getErrorGroup() != WXErrorCode.ErrorGroup.JS) {
            return true;
        }
        if (StringUtils.isEmpty(str)) {
            str = "instanceIdNull";
        }
        if (str2.length() > 200) {
            str2 = str2.substring(0, 200);
        }
        WXSDKInstance wXSDKInstance = WXSDKManager.getInstance().getAllInstanceMap().get(str);
        if (wXSDKInstance == null) {
            set = f23536a;
        } else {
            set = wXSDKInstance.ar().h;
        }
        if (set == null) {
            return true;
        }
        if (set.contains(str2)) {
            return false;
        }
        set.add(str2);
        return true;
    }

    public static void commitCriticalExceptionRT(String str, WXErrorCode wXErrorCode, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("824422a1", new Object[]{str, wXErrorCode, str2, str3, map});
            return;
        }
        try {
            WXLogUtils.e("weex", "commitCriticalExceptionRT :" + wXErrorCode + "exception" + str3);
            IWXConfigAdapter wxConfigAdapter = WXSDKManager.getInstance().getWxConfigAdapter();
            if (wxConfigAdapter != null ? "true".equalsIgnoreCase(wxConfigAdapter.getConfig("wxapm", "check_repeat_report", "true")) : true) {
                z = a(str, wXErrorCode, str3);
            }
            if (!z) {
                return;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        commitCriticalExceptionWithDefaultUrl("BundleUrlDefault", str, wXErrorCode, str2, str3, map);
    }

    public static void commitCriticalExceptionWithDefaultUrl(String str, String str2, WXErrorCode wXErrorCode, String str3, String str4, Map<String, String> map) {
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c02d25", new Object[]{str, str2, wXErrorCode, str3, str4, map});
            return;
        }
        IWXJSExceptionAdapter iWXJSExceptionAdapter = WXSDKManager.getInstance().getIWXJSExceptionAdapter();
        if (StringUtils.isEmpty(str)) {
            str = "BundleUrlDefault";
        }
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> map2 = map;
        map2.put("wxSdkInitStartTime", String.valueOf(WXEnvironment.sSDKInitStart));
        map2.put("wxSDKInitCostTime", String.valueOf(WXEnvironment.sSDKInitTime));
        map2.put("wxSDKCurExceptionTime", String.valueOf(System.currentTimeMillis()));
        map2.put("wxUseRuntimeApi", String.valueOf(WXEnvironment.sUseRunTimeApi));
        if (!StringUtils.isEmpty(str2)) {
            WXSDKInstance wXSDKInstance = WXSDKManager.getInstance().getAllInstanceMap().get(str2);
            if (wXSDKInstance != null) {
                str = wXSDKInstance.ar().e;
                Object obj = wXSDKInstance.ar().b.get(f.VALUE_BUNDLE_LOAD_LENGTH);
                map2.put(f.VALUE_BUNDLE_LOAD_LENGTH, obj instanceof Integer ? String.valueOf(obj) : "unknownLength");
                map2.put(bao.CACHE_KEY_TEMPLATE_INFO, wXSDKInstance.av());
                if (StringUtils.isEmpty(str) || str.equals("default")) {
                    if (!StringUtils.equals(degradeUrl, "BundleUrlDefaultDegradeUrl")) {
                        str = degradeUrl;
                    } else {
                        str = wXSDKInstance.ak();
                    }
                }
                for (Map.Entry<String, String> entry : wXSDKInstance.F().entrySet()) {
                    map2.put(entry.getKey(), entry.getValue());
                }
                map2.put("wxStageList", a(wXSDKInstance));
                String ax = wXSDKInstance.ax();
                map2.put("wxTemplateOfBundle", ax == null ? "has recycle by gc" : ax.substring(0, Math.min(ax.length(), 300)));
                Long l = wXSDKInstance.ar().f23517a.get("wxStartDownLoadBundle");
                if (l == null) {
                    l = wXSDKInstance.ar().f23517a.get("wxRenderTimeOrigin");
                }
                if (l != null) {
                    map2.put("wxUseTime", String.valueOf(WXUtils.getFixUnixTime() - l.longValue()));
                }
            }
            str5 = str;
            str6 = str2;
        } else {
            if (map2.size() > 0) {
                str = StringUtils.isEmpty(map2.get("weexUrl")) ? map2.get("weexUrl") : map2.get("bundleUrl");
            }
            str5 = str;
            str6 = "InstanceIdDefalut";
        }
        String str7 = map2.get("errorCode");
        if (str7 != null && str7.length() > 200) {
            map2.remove("errorCode");
        }
        WXJSExceptionInfo wXJSExceptionInfo = new WXJSExceptionInfo(str6, str5, wXErrorCode, str3, str4, map2);
        if (iWXJSExceptionAdapter != null) {
            iWXJSExceptionAdapter.onJSException(wXJSExceptionInfo);
        }
        e.a(wXJSExceptionInfo, str2);
    }

    private static String a(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("140cc0da", new Object[]{wXSDKInstance});
        }
        if (wXSDKInstance == null || wXSDKInstance.ar() == null || wXSDKInstance.ar().f23517a.isEmpty()) {
            return "noStageRecord";
        }
        ArrayList<Map.Entry> arrayList = new ArrayList(wXSDKInstance.ar().f23517a.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<String, Long>>() { // from class: com.taobao.weex.utils.WXExceptionUtils.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("51cd4c3f", new Object[]{this, entry, entry2})).intValue() : (int) (entry.getValue().longValue() - entry2.getValue().longValue());
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : arrayList) {
            sb.append((String) entry.getKey());
            sb.append(riy.CONDITION_IF_MIDDLE);
            sb.append(entry.getValue());
            sb.append("->");
        }
        return sb.toString();
    }
}
