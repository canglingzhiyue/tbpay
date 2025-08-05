package tb;

import android.content.Context;
import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class pha {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, Class<? extends pgy>> f32647a;

    static {
        kge.a(-836960406);
        HashMap<String, Class<? extends pgy>> hashMap = new HashMap<>();
        f32647a = hashMap;
        hashMap.put("taolivegoods", phd.class);
    }

    public static void a(String str, String str2, Map<String, Object> map, Context context, pgz pgzVar) {
        try {
            Class<? extends pgy> cls = f32647a.get(str);
            if (cls != null) {
                cls.newInstance().a(str2, map, context, pgzVar);
                return;
            }
            m.e("TBLiveAbilityHub", str + " 没有注册");
        } catch (Throwable th) {
            m.e("TBLiveAbilityHub", th.toString());
        }
    }
}
