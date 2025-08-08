package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;

/* loaded from: classes7.dex */
public class mfp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEEDBACK_CLICK = "feedback_clck";
    public static final String FEEDBACK_DOUDI = "feedback_doudi";
    public static final String FEEDBACK_SHOW = "feedback_show";
    public static final String LPM_BIZ_CODE = "HomePage";

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (StringUtils.isEmpty(str2)) {
        } else {
            a(str, str2, tip.a(str3));
        }
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
        } else if (StringUtils.isEmpty(str2)) {
        } else {
            UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder(str, "Button-" + str2);
            if (map != null && !map.isEmpty()) {
                uTControlHitBuilder.setProperties(map);
            }
            UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
            if (!mfm.k()) {
                return;
            }
            pcw pcwVar = pbt.a().f32558a;
            pcwVar.a("HomePage", str, "Button-" + str2, map);
        }
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
        } else if (StringUtils.isEmpty(str2)) {
        } else {
            b(str, str2, tip.a(str3));
        }
    }

    public static void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{str, str2, map});
        } else if (StringUtils.isEmpty(str2)) {
        } else {
            map.put("deviceLevel", "" + prq.a());
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, "", "0", map).build());
            if (!mfm.k()) {
                return;
            }
            pbt.a().f32558a.b("HomePage", str, str2, map);
        }
    }

    public static void c(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8682cc47", new Object[]{str, str2, map});
        } else if (StringUtils.isEmpty(str2)) {
        } else {
            map.put("deviceLevel", "" + prq.a());
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 19999, str2, "", "0", map).build());
        }
    }
}
