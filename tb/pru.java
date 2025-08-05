package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;

/* loaded from: classes8.dex */
public class pru {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG_CARD_GOOD_ITEM_ID = "card_good_item_id=";
    public static final String ARG_CARD_SCENE_TYPE = "card_scenetype=";
    public static final String ARG_CARD_SUB_TYPE = "card_subtype=";
    public static final String ARG_CARD_TYPE = "card_type=";
    public static final String ARG_URL = "url=";
    public static final String CLICK_BANNER_PIC = "BannerActivity";
    public static final String LIVE_CARD_CLICK = "AliLiveCardClick";
    public static final String PAGE_ALI_LIVE_UIKIT = "Page_TBLiveUIKit";

    static {
        kge.a(-1246360667);
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
            return;
        }
        UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder(str, "Button-" + str2);
        if (!map.containsKey("deviceLevel")) {
            map.put("deviceLevel", "" + prq.a());
        }
        uTControlHitBuilder.setProperties(map);
        UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
    }

    public static void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{str, str2, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, "", "0", map).build());
        }
    }
}
