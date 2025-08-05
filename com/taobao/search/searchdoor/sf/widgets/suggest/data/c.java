package com.taobao.search.searchdoor.sf.widgets.suggest.data;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.search.common.util.i;
import com.taobao.search.common.util.o;
import com.taobao.search.common.util.r;
import com.taobao.search.mmd.util.g;
import com.taobao.search.mmd.util.j;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;
import tb.kge;
import tb.nnq;
import tb.noa;
import tb.noo;
import tb.nqa;
import tb.nrm;

/* loaded from: classes7.dex */
public class c extends nqa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, String> b;

    static {
        kge.a(-1499560484);
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("localSearch", "24883");
        b.put(nrm.CHANNEL_NAME, "29364");
    }

    private static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        if (map == null || map.isEmpty() || !r.ag()) {
            return "10650";
        }
        String a2 = noo.a(map, "channelSrp");
        if (TextUtils.isEmpty(a2)) {
            return "10650";
        }
        String str = b.get(a2);
        return TextUtils.isEmpty(str) ? "10650" : str;
    }

    public c(String str, String str2, String str3, Map<String, String> map, MethodEnum methodEnum) {
        super(a(map), "suggest", methodEnum);
        if (map != null) {
            noo.a(map);
            if ("shop_wireless".equals(map.get("area"))) {
                a("inshop-suggest", 1);
            } else {
                a("main-suggest", 1);
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    b(key, value);
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            b("q", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            b("tab", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            b("searchdoorFrom", str3);
        }
        String d = g.d();
        if (!TextUtils.isEmpty(d)) {
            b(noa.KEY_EDITION_CODE, d);
        }
        if (!this.f31631a.h.containsKey(noa.KEY_GOOD_PRICE)) {
            b(noa.KEY_GOOD_PRICE, String.valueOf(j.INSTANCE.c()));
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
        b("area", "wireless_gbdt_newoutput");
        b("src", "c2c");
        b("sversion", noa.SERVER_VERSION_VALUE);
        i.d.a().a(a().h);
    }

    public c(String str, String str2, String str3, Map<String, String> map) {
        this(str, str2, str3, map, null);
    }
}
