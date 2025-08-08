package com.taobao.search.mmd.util;

import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;
import tb.djy;
import tb.kge;

/* loaded from: classes7.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static f b;

    /* renamed from: a  reason: collision with root package name */
    private a f19192a;

    static {
        kge.a(1160650733);
        b = new f();
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("646aff65", new Object[0]) : b;
    }

    private f() {
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("actionType", "0");
        hashMap.put("bizName", "taobao_main_search");
        try {
            com.taobao.android.msoa.c.a().a(new com.taobao.android.msoa.h("msoa.taobao.search", "msoa.taobao.detail.showsku", r.aD() ? "2.0" : "1.0", "msoa.taobao.search", hashMap), new MSOAServiceListener() { // from class: com.taobao.search.mmd.util.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onSuccess(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    } else if (map == null || !"1".equals(map.get("resultCode"))) {
                    } else {
                        q.a("SearchAddCartUtil", "add to cart successfully: " + map);
                        f.this.b();
                    }
                }

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onFail(String str2, String str3, boolean z, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str2, str3, new Boolean(z), map});
                        return;
                    }
                    q.a("SearchAddCartUtil", "fail to add to cart: " + str2 + "::" + str3);
                }
            });
        } catch (Exception unused) {
            q.b("SearchAddCartUtil", "add to cart exception");
        }
        return true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        q.a("SearchAddCartUtil", "success");
        e.a("ClickAddToCartSuccess", c());
    }

    private ArrayMap<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("8ca214dc", new Object[]{this});
        }
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        a aVar = this.f19192a;
        if (aVar == null) {
            return arrayMap;
        }
        arrayMap.put("item_id", a.a(aVar));
        arrayMap.put(aw.PARAM_SEARCH_KEYWORD_RN, a.b(this.f19192a));
        arrayMap.put(djy.SERIALIZE_EXP_BUCKET_ID, a.c(this.f19192a));
        arrayMap.put("query", a.d(this.f19192a));
        return arrayMap;
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f19194a;
        private String b;
        private String c;
        private String d;

        static {
            kge.a(-604853158);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa4db8de", new Object[]{aVar}) : aVar.f19194a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c469377d", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de84b61c", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f8a034bb", new Object[]{aVar}) : aVar.d;
        }
    }
}
