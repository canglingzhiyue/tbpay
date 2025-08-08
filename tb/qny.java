package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class qny implements cae {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(775909942);
        kge.a(-1242671482);
    }

    @Override // tb.cae
    public void a(String str, String str2, BaseConfigItem baseConfigItem, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f65485c9", new Object[]{this, str, str2, baseConfigItem, map, new Boolean(z)});
            return;
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return;
            }
            if (map == null) {
                map = new HashMap<>();
            }
            if (!qnz.a().a(str, baseConfigItem)) {
                c.a("TrackConfigManager getUTEnable == false", new Object[0]);
            } else if (!str.equals(cac.EVENT_CATEGORY_FULL_UP) && !qnz.a().a(str, baseConfigItem, z)) {
                c.a("TrackConfigManager category %s is not enable", str);
            } else {
                if (!cac.a().a(str)) {
                    if (baseConfigItem != null && !StringUtils.isEmpty(baseConfigItem.uuid)) {
                        map.put("uuid", baseConfigItem.uuid);
                    }
                    if (z) {
                        map.put("realTime", "true");
                    }
                }
                UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("PopLayer_" + str);
                if (StringUtils.isEmpty(str2)) {
                    str2 = "NonePage";
                }
                uTCustomHitBuilder.setEventPage(str2);
                uTCustomHitBuilder.setProperties(map);
                UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
            }
        } catch (Throwable th) {
            c.a("TrackAdapter track error.", th);
        }
    }

    @Override // tb.cae
    public void a(int i, String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89fc62", new Object[]{this, new Integer(i), str, str2, str3, str4, map});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str2, str3, str4, map).build());
        } catch (Throwable th) {
            c.a("TrackAdapter trackCustom error.", th);
        }
    }
}
