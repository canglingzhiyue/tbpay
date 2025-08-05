package com.taobao.desktop.channel.desktoplinktask.trigger;

import android.text.TextUtils;
import anet.channel.session.dns.DnsNavConfigTask;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.hyq;
import tb.kge;
import tb.kgz;
import tb.suq;

/* loaded from: classes7.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FUNNEL_STEP_AFTER_REQUEST = "requested";
    public static final String FUNNEL_STEP_LAUNCH_WIDGET = "launchWidget";
    public static final String FUNNEL_STEP_START = "start";
    public static final String FUNNEL_STEP_VIEW_LOAD = "viewLoaded";

    static {
        kge.a(-1975428925);
    }

    public static void a(boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1910d8", new Object[]{new Boolean(z), new Long(j)});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("indexId", String.valueOf(j));
            String str = z ? "configUpdateSuccess" : "configUpdateFail";
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("DesktopService", 19999, "floatWindow", str, "", hashMap).build());
            kgz.a("TrackUtil.doTrack.arg2=%s.trackMap=%s", str, hashMap);
        } catch (Throwable th) {
            kgz.a("TrackUtil.doTrack.error", th);
        }
    }

    public static void a(int i, String str, JSONObject jSONObject, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27167a89", new Object[]{new Integer(i), str, jSONObject, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("closeStep", str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        hashMap.put("closeReason", str3);
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        hashMap.put("errorMessage", str4);
        a(i, str, jSONObject, hashMap, "funnel");
    }

    public static void a(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb0bf6eb", new Object[]{new Integer(i), str, jSONObject});
        } else {
            a(i, str, jSONObject, new HashMap(), hyq.UMB_FEATURE_REQUEST_SUCCESS);
        }
    }

    public static void b(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09fffec", new Object[]{new Integer(i), str, jSONObject});
        } else {
            a(i, str, jSONObject, new HashMap(), "display");
        }
    }

    public static void a(int i, String str, JSONObject jSONObject, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23b527f", new Object[]{new Integer(i), str, jSONObject, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hashMap.put("actionBehaviour", str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        hashMap.put("targetUrl", str3);
        a(i, str, jSONObject, hashMap, "action");
    }

    private static void a(int i, String str, JSONObject jSONObject, Map<String, String> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8eee084", new Object[]{new Integer(i), str, jSONObject, map, str2});
            return;
        }
        try {
            map.put(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE, String.valueOf(i));
            map.put("bizCode", String.valueOf(str));
            if (jSONObject != null) {
                map.put("abBucketId", String.valueOf(jSONObject.getString("abBucketId")));
                map.put(DnsNavConfigTask.MatchKey, String.valueOf(jSONObject.getString(DnsNavConfigTask.MatchKey)));
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("DesktopService", 19999, "floatWindow", str2, "", map).build());
            kgz.a("TrackUtil.doTrack.arg2=%s.trackMap=%s", str2, map);
        } catch (Throwable th) {
            kgz.a("TrackUtil.doTrack.error", th);
        }
    }
}
