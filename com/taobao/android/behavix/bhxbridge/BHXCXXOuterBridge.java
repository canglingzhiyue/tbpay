package com.taobao.android.behavix.bhxbridge;

import android.support.v4.app.NotificationManagerCompat;
import mtopsdk.common.util.StringUtils;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.behavix.d;
import com.taobao.android.behavix.service.a;
import com.taobao.application.common.c;
import com.taobao.statistic.TBS;
import com.taobao.weex.common.WXConfig;
import com.ut.mini.UTAnalytics;
import com.ut.mini.module.trackerlistener.b;
import java.net.URLEncoder;
import java.util.HashMap;
import tb.dro;
import tb.dsb;
import tb.dsh;
import tb.dsj;
import tb.dsq;
import tb.ghi;
import tb.ghm;
import tb.kge;

/* loaded from: classes.dex */
public class BHXCXXOuterBridge extends BHXCXXBaseBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1589279226);
    }

    public static void uploadDataToCttp(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b793658", new Object[]{str, str2, str3});
        } else if (str == null || StringUtils.isEmpty(str2)) {
        } else {
            uploadDataToUT("Mobile_Intelligent", UtUtils.CHANGED_UPP_EVENT_ID, "BehaviX", str, str2, "BehaviData=" + URLEncoder.encode(str3));
        }
    }

    private static void reportErrorMsgToUmbrella(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa2589af", new Object[]{str, str2, str3, str4, str5, str6});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("userData", str6);
        dsb.a(str2, "", hashMap, str4, str5);
    }

    private static void commitCountToAppMonitor(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed12f2d", new Object[]{str, str2, str3, new Double(d)});
        } else {
            AppMonitor.Counter.commit(str, str2, str3, d);
        }
    }

    private static void uploadDataToUT(String str, int i, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e311d5", new Object[]{str, new Integer(i), str2, str3, str4, str5});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, str2, str3, str4, str5);
        } catch (Exception e) {
            dsb.a("BHXCXXOuterBridge_uploadDataToUT_error", null, null, e);
        }
    }

    private static void addCrashInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0f3b6f", new Object[]{str, str2});
        } else {
            dro.a(str, str2);
        }
    }

    public static String getPushFeature() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8357d73", new Object[0]);
        }
        try {
            if (d.b() == null) {
                return "";
            }
            if (NotificationManagerCompat.from(d.b()).areNotificationsEnabled()) {
                i = 1;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateName", (Object) "all_us_push_int");
            jSONObject.put("bizName", (Object) "BehaviX");
            jSONObject.put("result", (Object) Integer.valueOf(i));
            jSONObject.put("stateType", (Object) "DEVICE_INFO");
            jSONObject.put("userId", (Object) dsj.f26943a);
            jSONObject.put("periodSessionId", (Object) dsh.a().b());
            jSONObject.put("createTime", (Object) Long.valueOf(System.currentTimeMillis()));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("table_name", (Object) "bx_open_user_state");
            jSONObject2.put("write_table_info", (Object) jSONObject);
            return jSONObject2.toJSONString();
        } catch (Exception e) {
            dsb.a("BHXCXXOuterBridge_getPushFeature_error", null, null, e);
            return "";
        }
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        int globalNetworkQuality = NetworkQualityMonitor.getGlobalNetworkQuality();
        return globalNetworkQuality != 0 ? globalNetworkQuality != 1 ? globalNetworkQuality != 2 ? globalNetworkQuality != 3 ? "unknown" : "excellent" : "normal" : "poor" : "unknown";
    }

    public static String getDeviceInfos() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd8c2900", new Object[0]);
        }
        try {
            com.taobao.application.common.d a2 = c.a();
            int a3 = a2.a("deviceLevel", -1);
            String str2 = "high";
            if (a3 != 0) {
                if (a3 == 1) {
                    str2 = "medium";
                } else if (a3 == 2) {
                    str2 = "low";
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceLevel", (Object) str2);
            jSONObject.put(WXConfig.deviceHeight, (Object) Float.valueOf(a2.a(com.taobao.tbdeviceevaluator.c.KEY_DISPLAY_HEIGHT, 0.0f)));
            jSONObject.put(WXConfig.deviceWidth, (Object) Float.valueOf(a2.a(com.taobao.tbdeviceevaluator.c.KEY_DISPLAY_WIDTH, 0.0f)));
            jSONObject.put("netStatus", (Object) a.b());
            jSONObject.put("bandWidth", (Object) Double.valueOf(NetworkQualityMonitor.getInstance().getGlobalCurrentBandwidth()));
            jSONObject.put("predictBandWidth", (Object) Double.valueOf(NetworkQualityMonitor.getInstance().getGlobalPredictBandWidth()));
            jSONObject.put("netLevel", (Object) a());
            String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
            if (StringUtils.isEmpty(globalProperty)) {
                globalProperty = "";
            }
            jSONObject.put("afcId", (Object) globalProperty);
            try {
                str = ((ghm) ghi.a(ghm.class)).queryCurrentVersionInfo().c;
            } catch (Throwable unused) {
                str = "";
            }
            jSONObject.put("versionCode", (Object) str);
            return jSONObject.toJSONString();
        } catch (Exception e) {
            dsb.a("BHXCXXOuterBridge_getDeviceInfos_error", null, null, e);
            return "";
        }
    }

    public static void interdictReceivingEventsForMock(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ee89e1", new Object[]{new Boolean(z)});
            return;
        }
        com.taobao.android.behavix.behavixswitch.a.a(z);
        if (z) {
            dsq.b();
        } else {
            b.getInstance().registerListener(dsq.a());
        }
    }
}
