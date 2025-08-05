package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.litecreator.base.data.meta.MediaStatInfo;
import com.taobao.tao.Globals;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import tb.ios;

/* loaded from: classes5.dex */
public final class hfi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SPM_CD = "spm_cd";

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, String> f28585a;
    private static final HashMap<String, String> b;

    static {
        kge.a(1740210325);
        f28585a = new HashMap<>();
        b = new HashMap<>();
    }

    public static void a(Context context, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742d5b91", new Object[]{context, str, str2, map});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageAppear(context);
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, str);
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
            String remove = map.remove(SPM_CD);
            if (!TextUtils.isEmpty(remove)) {
                str2 = str2 + "." + remove;
            }
        }
        hashMap.put("spm-cnt", str2);
        f28585a.put("spm-cnt", str2);
        Activity activity = (Activity) context;
        String pageSpmUrl = UTAnalytics.getInstance().getDefaultTracker().getPageSpmUrl(activity);
        if (!TextUtils.isEmpty(pageSpmUrl)) {
            hashMap.put("spm-url", pageSpmUrl);
            f28585a.put("spm-url", pageSpmUrl);
        }
        String pageSpmPre = UTAnalytics.getInstance().getDefaultTracker().getPageSpmPre(activity);
        if (!TextUtils.isEmpty(pageSpmPre)) {
            f28585a.put(bip.KEY_UMBRELLA_SPM_PRE, pageSpmPre);
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("spm-url", str2);
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap2);
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
        } else if (str == null || str2 == null) {
        } else {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (!str.startsWith("Page_")) {
                str = "Page_" + str;
            }
            UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder(str, "Button-" + str2);
            uTControlHitBuilder.setProperties(hashMap);
            UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
        }
    }

    public static void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{str, str2, map});
            return;
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str + "_Show-" + str2);
        uTCustomHitBuilder.setEventPage(str);
        uTCustomHitBuilder.setProperties(hashMap);
        uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_EVENT_ID, "2201");
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    public static void c(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8682cc47", new Object[]{str, str2, map});
            return;
        }
        try {
            UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str + "_" + str2);
            uTCustomHitBuilder.setEventPage(str);
            String str3 = "";
            if (map != null) {
                for (String str4 : map.keySet()) {
                    uTCustomHitBuilder.setProperty(str4, map.get(str4));
                    str3 = str3 + riy.ARRAY_START_STR + str4 + ":" + map.get(str4) + riy.ARRAY_END_STR;
                }
            }
            UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
        } catch (Throwable unused) {
        }
    }

    public static Map<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : new HashMap(f28585a);
    }

    public static Map<String, String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[0]) : new HashMap(b);
    }

    public static void a(ios.a aVar, String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef43cdb", new Object[]{aVar, strArr, str});
        } else {
            a(b, aVar, strArr, str);
        }
    }

    public static void b(ios.a aVar, String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccccd73a", new Object[]{aVar, strArr, str});
        } else {
            a(f28585a, aVar, strArr, str);
        }
    }

    public static void a(HashMap<String, String> hashMap, ios.a aVar, String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b69698", new Object[]{hashMap, aVar, strArr, str});
            return;
        }
        String a2 = aVar.a("umi_edit_session");
        if (a2 != null) {
            str = a2;
        }
        hashMap.put("umi_pub_session", str);
        hashMap.put("is_tablet", String.valueOf(l.b(Globals.getApplication())));
        hashMap.put("is_fold_device", String.valueOf(l.d(Globals.getApplication())));
        if (strArr == null) {
            return;
        }
        for (String str2 : strArr) {
            String a3 = aVar.a(str2);
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(a3)) {
                hashMap.put(str2, a3);
            }
        }
    }

    public static Map<String, String> a(Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d7e5124c", new Object[]{map, new Boolean(z)});
        }
        if (map == null) {
            map = new HashMap<>();
        }
        String str = map.get("session_id");
        if (TextUtils.isEmpty(str)) {
            return map;
        }
        JSONObject b2 = gwt.a(str).b();
        try {
            map.put("ab_test_info", z ? URLEncoder.encode(b2.toJSONString(), "utf-8") : b2.toJSONString());
        } catch (Throwable unused) {
        }
        String str2 = MediaStatInfo.getGlobalStatInfo().get(str);
        if (!TextUtils.isEmpty(str2)) {
            if (z) {
                try {
                    str2 = URLEncoder.encode(str2, "utf-8");
                } catch (Throwable unused2) {
                }
            }
            map.put("stat_info", str2);
        }
        return map;
    }
}
