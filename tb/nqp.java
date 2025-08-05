package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.search.common.util.o;
import com.taobao.search.common.util.r;
import com.taobao.search.mmd.util.j;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;

/* loaded from: classes7.dex */
public class nqp extends nqa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, String> b;

    static {
        kge.a(1650247854);
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("localSearch", "24790");
    }

    public nqp(String str, String str2, String str3, String str4, String str5, Map<String, String> map, MethodEnum methodEnum) {
        super(a(map), str3, methodEnum);
        a("main-activate", 1);
        if (map != null) {
            noo.a(map);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    b(key, value);
                }
            }
        }
        b("area", "active_page");
        b("src", "c2c");
        if (!this.f31631a.h.containsKey(noa.KEY_GOOD_PRICE)) {
            b(noa.KEY_GOOD_PRICE, String.valueOf(j.INSTANCE.c()));
        }
        if (!r.b()) {
            b("searchhint", "on");
        } else {
            b("searchhint", "off");
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            b("placeholder", str);
            b("searchquery", str2);
        }
        if (!TextUtils.isEmpty(str4)) {
            b("tab", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            b("searchdoorFrom", str5);
        }
        TBLocationDTO a2 = nnq.a();
        if (a2 != null) {
            b("longitude", a2.longitude);
            b("latitude", a2.latitude);
            b(noa.KEY_CITY_CODE, a2.cityCode);
        }
        String c = o.INSTANCE.c(Globals.getApplication());
        if (!TextUtils.isEmpty(c)) {
            b(noa.KEY_GLOBAL_LBS, c);
        }
    }

    private static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        if (map == null || map.isEmpty() || !r.ag()) {
            return "10211";
        }
        String a2 = noo.a(map, "channelSrp");
        if (TextUtils.isEmpty(a2)) {
            return "10211";
        }
        String str = b.get(a2);
        return TextUtils.isEmpty(str) ? "10211" : str;
    }
}
