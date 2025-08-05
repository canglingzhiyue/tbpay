package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class ecd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_EFFECT_ACTION = "action";
    public static final String K_EFFECT_AD_TYPE = "ad_type";
    public static final String K_EFFECT_BDID = "bdid";
    public static final String K_EFFECT_CARRIER = "carrier_id";
    public static final String K_EFFECT_CLICK_ID = "clickid";
    public static final String K_EFFECT_ITEM_ID = "item_id";
    public static final String K_EFFECT_LIST_PARAM = "list_param";
    public static final String K_EFFECT_LIST_TYPE = "list_type";
    public static final String K_EFFECT_OBJECT_ID = "object_id";
    public static final String K_EFFECT_OBJECT_TYPE = "object_type";
    public static final String V_EFFECT_ACTION_IPV = "ipv";
    public static final String V_EFFECT_ACTION_SECKILL = "seckill";
    public static final String V_EFFECT_AD_TYPE = "munion";
    public static final String V_EFFECT_OBJECT_TYPE = "item_id";

    static {
        kge.a(-789440198);
        emu.a("com.taobao.android.detail.core.detail.profile.TBEffectTracker");
    }

    public static void a(Activity activity, ebx ebxVar) {
        Map<String, String> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb38cf", new Object[]{activity, ebxVar});
        } else if (ebxVar == null || (c = ebxVar.c()) == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.putAll(c);
            hashMap.put("object_type", "item_id");
            hashMap.put(K_EFFECT_AD_TYPE, V_EFFECT_AD_TYPE);
            hashMap.put("item_id", ebxVar.f27180a);
            hashMap.put("object_id", ebxVar.f27180a);
            hashMap.put("clickid", ebxVar.g);
            hashMap.put("list_param", c.get("list_param"));
            hashMap.put("list_type", c.get("list_type"));
            hashMap.put(K_EFFECT_BDID, c.get(K_EFFECT_BDID));
            hashMap.put("carrier_id", c.get("carrier_id"));
            hashMap.put("action", ebxVar.k ? V_EFFECT_ACTION_SECKILL : "ipv");
            eps.a(activity, (String) null, (Map<String, String>) hashMap);
        }
    }
}
