package com.taobao.android.detail.ttdetail.behavior;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.ao;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.detail.ttdetail.utils.m;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.odg;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f10499a;
    private static final Set<String> b;
    private static final Map<Integer, JSONObject> c;

    static {
        kge.a(-58841231);
        f10499a = new HashSet<String>() { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker$1
            {
                add("disappear");
                add("userTrack");
                add("user_track");
                add("ut_exposure");
            }
        };
        b = new HashSet<String>() { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker$2
            {
                add("user_id");
                add("unique_id");
                add("start_time");
                add("report_time");
            }
        };
        c = new ConcurrentHashMap();
    }

    public static void a(Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (Boolean.FALSE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sEnableNewUserBehavior)) && !j.Y()) {
        } else {
            c.put(Integer.valueOf(context.hashCode()), new JSONObject(10) { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker$3
                {
                    put("user_id", (Object) ao.a());
                    put("unique_id", (Object) str);
                    put("start_time", (Object) String.valueOf(System.currentTimeMillis()));
                }
            });
        }
    }

    private static JSONObject a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("58b28f80", new Object[]{context}) : c.get(Integer.valueOf(context.hashCode()));
    }

    private static JSONObject a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("173dc50a", new Object[]{context, str, new Boolean(z)});
        }
        JSONObject a2 = a(context);
        if (a2 == null) {
            return null;
        }
        JSONObject jSONObject = a2.getJSONObject("components");
        if (jSONObject == null) {
            jSONObject = new JSONObject(10, true);
            a2.put("components", (Object) jSONObject);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        if (jSONObject2 != null || z) {
            return jSONObject2;
        }
        JSONObject jSONObject3 = new JSONObject(2);
        jSONObject.put(str, (Object) jSONObject3);
        return jSONObject3;
    }

    public static void a(Context context, String str, String str2) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else if (b.contains(str) || (a2 = a(context)) == null) {
        } else {
            a2.put(str, (Object) str2);
        }
    }

    public static void b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbd7193", new Object[]{context, str, str2});
            return;
        }
        JSONObject a2 = a(context);
        if (a2 == null) {
            return;
        }
        JSONObject jSONObject = a2.getJSONObject("global_info");
        if (jSONObject == null) {
            jSONObject = new JSONObject(2);
            a2.put("global_info", (Object) jSONObject);
        }
        jSONObject.put(str, (Object) str2);
    }

    public static void a(Context context, String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1bde450", new Object[]{context, str, str2, obj});
            return;
        }
        JSONObject a2 = a(context, str, false);
        if (a2 == null) {
            return;
        }
        JSONObject jSONObject = a2.getJSONObject("content_info");
        if (jSONObject == null) {
            jSONObject = new JSONObject(2);
            a2.put("content_info", (Object) jSONObject);
        }
        jSONObject.put(str2, obj);
    }

    public static void a(Context context, final String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5110219", new Object[]{context, str, new Integer(i)});
            return;
        }
        boolean a2 = a.a(i);
        JSONObject a3 = a(context, str, a2);
        if (a3 == null) {
            return;
        }
        JSONArray jSONArray = a3.getJSONArray("behavior_chain");
        if ((jSONArray == null || jSONArray.isEmpty()) && a2) {
            return;
        }
        if (jSONArray == null) {
            jSONArray = new JSONArray(2);
            a3.put("behavior_chain", (Object) jSONArray);
        }
        if (c.a(jSONArray, i)) {
            return;
        }
        jSONArray.add(a.b(i));
        if (i == 1) {
            odg.l().a("Page_Detail", a.c(i), null, null, m.a(new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker$4
                {
                    put("_cName", str);
                }
            }));
        } else if (i != 2) {
        } else {
            odg.l().b("Page_Detail", a.c(i), null, null, m.a(new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker$5
                {
                    put("_cName", str);
                }
            }));
        }
    }

    public static void a(Context context, String str, String str2, Map<String, String> map) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742d5b91", new Object[]{context, str, str2, map});
        } else if (f10499a.contains(str2) || (a2 = a(context)) == null) {
        } else {
            JSONArray jSONArray = a2.getJSONArray("event_chain");
            if (jSONArray == null) {
                jSONArray = new JSONArray(2);
                a2.put("event_chain", (Object) jSONArray);
            }
            jSONArray.add(a.a(str, str2, map));
        }
    }

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
            return;
        }
        final JSONObject remove = c.remove(Integer.valueOf(context.hashCode()));
        if (!z || remove == null || remove.isEmpty()) {
            return;
        }
        remove.put("report_time", (Object) String.valueOf(System.currentTimeMillis()));
        m.b(19999, "Page_Detail_NewUserBehavior", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker$6
            {
                put("new_user_behavior", (Object) URLEncoder.encode(JSONObject.this.toJSONString()));
            }
        });
    }
}
