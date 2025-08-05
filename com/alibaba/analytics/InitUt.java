package com.alibaba.analytics;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.a;
import java.io.Serializable;
import java.util.HashMap;
import tb.rpw;
import tb.rpz;
import tb.rqd;

/* loaded from: classes.dex */
public class InitUt implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String KEY_SHOULD_FALLBACK_TO_OLD_UT = "shouldFallbackToOldUt";
    private static final String TAG = "Analytics.InitUt";
    private static final String WIDGET_PROCESS_NAME = "com.taobao.taobao:widgetProvider";
    private static boolean isNotUiSubProcess = false;

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (application == null || hashMap == null) {
            if (application == null) {
                Log.e(TAG, "ut init error: application is null");
            }
            if (hashMap != null) {
                return;
            }
            Log.e(TAG, "ut init error: params is null");
        } else {
            boolean booleanValue = hashMap.get("isDebuggable") != null ? ((Boolean) hashMap.get("isDebuggable")).booleanValue() : false;
            if (booleanValue) {
                String str = "application:" + application + ",params:" + hashMap;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(hashMap.get("appVersion"));
            String str2 = "";
            sb.append(str2);
            final String sb2 = sb.toString();
            final String str3 = hashMap.get("ttid") + str2;
            final String str4 = hashMap.get("constantAppkey") + str2;
            final boolean booleanValue2 = hashMap.get("isUserTracklogEnable") != null ? ((Boolean) hashMap.get("isUserTracklogEnable")).booleanValue() : false;
            boolean booleanValue3 = hashMap.get("isMiniPackage") != null ? ((Boolean) hashMap.get("isMiniPackage")).booleanValue() : false;
            if (booleanValue) {
                String str5 = "appVersion:" + sb2 + ",ttid:" + str3 + ",constantAppkey:" + str4 + ",isUserTracklogEnable:" + booleanValue2 + ",isMiniPackage:" + booleanValue3;
                String str6 = "ut init start. appkey:" + str4;
            }
            try {
                isNotUiSubProcess = "1".equalsIgnoreCase(hashMap.get(KEY_SHOULD_FALLBACK_TO_OLD_UT) + str2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            rqd.bJTrackExtend = true;
            rqd.bAntiCheat = true;
            rqd.bUTMtopConfig = true;
            rqd.bXmodule = true;
            if (hashMap.get("process") != null) {
                str2 = hashMap.get("process") + str2;
            }
            if ("com.taobao.taobao:widgetProvider".equals(str2)) {
                rqd.bXmodule = false;
            }
            UTAnalytics.getInstance().setAppApplicationInstance(application, new a() { // from class: com.alibaba.analytics.InitUt.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ut.mini.a
                public com.ut.mini.crashhandler.a getUTCrashCraughtListener() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (com.ut.mini.crashhandler.a) ipChange2.ipc$dispatch("ec6e49e1", new Object[]{this});
                    }
                    return null;
                }

                @Override // com.ut.mini.a
                public boolean isAliyunOsSystem() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("e9718b9c", new Object[]{this})).booleanValue();
                    }
                    return false;
                }

                @Override // com.ut.mini.a
                public boolean isUTCrashHandlerDisable() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("2fc5647", new Object[]{this})).booleanValue();
                    }
                    return true;
                }

                @Override // com.ut.mini.a
                public String getUTAppVersion() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("f5fc98ad", new Object[]{this}) : sb2;
                }

                @Override // com.ut.mini.a
                public String getUTChannel() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("738ca0eb", new Object[]{this}) : str3;
                }

                @Override // com.ut.mini.a
                public rpw getUTRequestAuthInstance() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (rpw) ipChange2.ipc$dispatch("1b8cc90f", new Object[]{this}) : new rpz(str4);
                }

                @Override // com.ut.mini.a
                public boolean isUTLogEnable() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("515bc429", new Object[]{this})).booleanValue() : booleanValue2;
                }
            });
            if (booleanValue) {
                String str7 = "ut init success. appkey:" + str4;
            }
            UTAnalytics.getInstance().turnOffAutoPageTrack();
            if (!booleanValue3) {
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("isMiniPackage", "true");
            UTAnalytics.getInstance().updateSessionProperties(hashMap2);
        }
    }
}
