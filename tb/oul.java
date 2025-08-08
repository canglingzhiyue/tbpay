package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class oul {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMMON_TEMPLATE = "common";
    public static final String DETAIL_TEMPLATE = "detail";
    public static final String GROUP_TEMPLATE = "group";
    public static final String LIVE_TEMPLATE = "live";
    public static final String SHOP_TEMPLATE = "shop";
    public static final String WEEX_TEMPLATE = "weex";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Class<? extends ouk>> f32434a;

    static {
        kge.a(-750213418);
        HashMap hashMap = new HashMap();
        f32434a = hashMap;
        hashMap.put("common", oum.class);
    }

    public static ouk a(Context context, String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            Class<? extends ouk> cls = f32434a.get(str);
            if (cls == null) {
                return null;
            }
            return cls.getConstructor(Context.class).newInstance(context);
        } catch (Exception unused) {
            return null;
        }
    }
}
