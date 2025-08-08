package com.taobao.android.home.component.utils;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.tim;

/* loaded from: classes5.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1270534267);
    }

    public static void a(Uri uri, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8dc2cf1", new Object[]{uri, jSONObject});
        } else if (uri == null) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("passOnTrack");
            if (jSONObject2 != null && jSONObject2.size() > 0) {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties((Map) JSON.parseObject(jSONObject2.toJSONString(), new TypeReference<HashMap<String, String>>() { // from class: com.taobao.android.home.component.utils.k.1
                }, new Feature[0]));
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("nextPageUtparam");
            if (jSONObject3 != null && jSONObject3.size() > 0) {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(jSONObject3));
            }
            b(jSONObject);
        }
    }

    public static boolean a(JSONObject jSONObject, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eefc1944", new Object[]{jSONObject, context})).booleanValue();
        }
        if (jSONObject == null || jSONObject.getBooleanValue("isTracked")) {
            return false;
        }
        jSONObject.put("isTracked", (Object) true);
        JSONObject jSONObject2 = jSONObject.getJSONObject(h.TRACK_EXPOSURE_PARAM);
        if (jSONObject2 != null && jSONObject2.size() > 0 && jSONObject2.containsKey("page") && jSONObject2.containsKey("eventId")) {
            String string = jSONObject2.getString("page");
            String string2 = jSONObject2.getString("eventId");
            String string3 = jSONObject2.getString("arg1");
            String string4 = jSONObject2.getString("arg2");
            String string5 = jSONObject2.getString("arg3");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
            try {
                TBS.Ext.commitEvent(string, Integer.parseInt(string2), string3, string4, string5, a(jSONObject3));
                if (StringUtils.equals("2101", string2)) {
                    com.taobao.android.behavix.h.a(string, string3 + "_BehaviX_UT", (String) null, (String) null, com.taobao.android.behavix.j.b(jSONObject3));
                }
                return true;
            } catch (Exception e) {
                e.a("homepage_track", "commitEvent error", e);
            }
        }
        return false;
    }

    private static void b(JSONObject jSONObject) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{jSONObject});
        } else if (jSONObject == null || (a2 = a.a(jSONObject)) == null || !a2.containsKey("page") || !a2.containsKey("eventId")) {
        } else {
            String string = a2.getString("page");
            String string2 = a2.getString("eventId");
            String string3 = a2.getString("arg1");
            String string4 = a2.getString("arg2");
            String string5 = a2.getString("arg3");
            JSONObject jSONObject2 = a2.getJSONObject("args");
            TBS.Ext.commitEvent(string, Integer.parseInt(string2), string3, string4, string5, a(jSONObject2));
            try {
                if (!StringUtils.equals("2101", string2)) {
                    return;
                }
                com.taobao.android.behavix.h.a(string, string3 + "_BehaviX_UT", (String) null, (String) null, com.taobao.android.behavix.j.b(jSONObject2));
            } catch (Exception e) {
                e.a("homepage_track", "commitEvent error", e);
            }
        }
    }

    public static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(600);
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            if (!StringUtils.isEmpty(string)) {
                sb.append(str);
                sb.append("=");
                sb.append(string);
                sb.append(",");
            }
        }
        if (sb.length() <= 0) {
            return "";
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject == null || jSONObject2 == null || (jSONObject3 = jSONObject.getJSONObject("args")) == null || !StringUtils.equals("1", jSONObject3.getString(tim.S_ARGS_IS_CLIENT_CACHE)) || (jSONObject4 = jSONObject2.getJSONObject("clickParam")) == null) {
        } else {
            JSONObject jSONObject5 = jSONObject4.getJSONObject("args");
            if (jSONObject5 == null) {
                jSONObject5 = new JSONObject();
                jSONObject2.put("args", (Object) jSONObject5);
            }
            jSONObject5.put(tim.S_ARGS_IS_CLIENT_CACHE, "1");
        }
    }
}
