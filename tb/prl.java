package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class prl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_TAOLIVE = "Page_TaobaoLive";
    public static final String POINT_VIDEOPALY_CTRNAME = "playviewtoken_reuse";

    static {
        kge.a(-848895674);
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else if (TextUtils.isEmpty(str) || pmd.a().e() == null) {
        } else {
            pmd.a().e().a("Page_TaobaoLive", 19999, str, "", "0", map);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            b(str, a(str2));
        }
    }

    public static void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{str, map});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder("Button-" + str);
            if (map != null) {
                if (!map.containsKey("deviceLevel")) {
                    map.put("deviceLevel", "" + prq.a());
                }
                uTControlHitBuilder.setProperties(map);
            }
            UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
        }
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (!pro.e(str)) {
            try {
                for (String str2 : str.split(",")) {
                    String[] split = str2.split("=");
                    if (2 == split.length) {
                        hashMap.put(split[0], split[1]);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }
}
