package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.split.t;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.c;
import com.taobao.statistic.TBS;
import com.taobao.taolive.room.utils.ag;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class ref {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PUBLISH_SESSION = "umiPubSession";

    static {
        kge.a(-389838429);
    }

    public static void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{str, str2, map});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str + "_" + str2, null, null, map).build());
    }

    public static void a(String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d9201a", new Object[]{str, new Integer(i), obj, obj2, obj3, strArr});
        } else if (StringUtils.isEmpty(str)) {
            TBS.Ext.commitEvent(i, obj, obj2, obj3, strArr);
        } else {
            TBS.Ext.commitEvent(str, i, obj, obj2, obj3, strArr);
        }
    }

    public static final void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
            return;
        }
        try {
            UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str + "_" + str2);
            uTCustomHitBuilder.setEventPage(str);
            if (map != null) {
                for (String str3 : map.keySet()) {
                    uTCustomHitBuilder.setProperty(str3, map.get(str3));
                }
            }
            UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
        } catch (Throwable unused) {
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a(ios.a(str).a());
        }
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (jSONObject == null) {
        } else {
            a(b(jSONObject));
        }
    }

    private static Map<String, String> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("592eda1c", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            String valueOf = String.valueOf(entry.getValue());
            if (!StringUtils.isEmpty(key)) {
                hashMap.put(key, valueOf);
            }
        }
        return hashMap;
    }

    private static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        String str = map.get("biz_scene");
        if (StringUtils.equals(str, "x_rate") || StringUtils.equals(str, "x_ask_everyone")) {
            return;
        }
        a("Page_UmiPublish", 2101, "Page_UmiPublish_ContentPubStart", null, null, (String[]) b(map).toArray(new String[0]));
    }

    public static void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("biz_scene", str);
        hashMap.put("is_remote_wait", z ? "1" : "0");
        hashMap.put(ios.K_DEVICE_SCORE, String.valueOf(akt.b()));
        hashMap.put("device_level", String.valueOf(akt.a()));
        hashMap.put("tp_remote_status", t.a().a(c.TAOPAI_SDK_FEATURE, "baseline"));
        b("Page_UmiPublish", "EntryClick", hashMap);
    }

    public static void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{jSONObject, str});
        } else if (jSONObject == null) {
        } else {
            List<String> b = b(b(jSONObject));
            b.add(ag.ARG_CONTENT_ID + str);
            a("Page_UmiPublish", 2101, "Page_UmiPublish_ContentPubSuccess", null, null, (String[]) b.toArray(new String[0]));
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        List<String> b = b(ios.a(str).a());
        b.add(ag.ARG_CONTENT_ID + str2);
        a("Page_UmiPublish", 2101, "Page_UmiPublish_ContentPubSuccess", null, null, (String[]) b.toArray(new String[0]));
    }

    private static List<String> b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ffc624b", new Object[]{map});
        }
        ArrayList arrayList = new ArrayList();
        if (!map.isEmpty()) {
            String str = map.get("umi_edit_session");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!StringUtils.isEmpty(str) && StringUtils.equals("umi_pub_session", key)) {
                    arrayList.add(key + "=" + str);
                } else {
                    arrayList.add(key + "=" + entry.getValue());
                }
            }
        }
        return arrayList;
    }
}
