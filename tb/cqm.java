package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.model.d;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class cqm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TOTAL_PAGE_NAME = "Page_PhotoSearchResult";
    private static String e;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f26431a;
    private Map<String, String> b;
    private cog c;
    private IrpDatasource d;

    public cqm(cog adapter, IrpDatasource irpDatasource) {
        q.c(adapter, "adapter");
        q.c(irpDatasource, "irpDatasource");
        this.c = adapter;
        this.d = irpDatasource;
        e = com.f() ? "PhotoSearchResultY" : "PhotoSearchResult";
        if (this.d.a() == PhotoFrom.Values.PRODUCT_CODE) {
            e = "ScanProductResult";
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-612125619);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(855989061);
        Companion = new a(null);
        e = "PhotoSearchResult";
    }

    public final void a() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c.a(e);
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = this.f26431a;
        String str = "";
        if (jSONObject != null) {
            if (jSONObject == null) {
                q.a();
            }
            for (String str2 : jSONObject.keySet()) {
                hashMap.put(str2, com.taobao.android.searchbaseframe.util.a.a(this.f26431a, str2, str));
            }
        } else {
            if (!b.bj()) {
                HashMap hashMap2 = hashMap;
                hashMap2.put(d.KEY_PHOTO_FROM, this.d.a().getValue());
                hashMap2.put("pssource", this.d.r());
            }
            HashMap hashMap3 = hashMap;
            String f = this.d.f("cat");
            if (f != null) {
                str = f;
            }
            hashMap3.put("cat", str);
        }
        if (b.bj() && (map = this.b) != null) {
            if (map == null) {
                q.a();
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    hashMap.put(key, value);
                }
            }
        }
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.a((Object) uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().updatePageUtparam(this.c.a(), JSON.toJSONString(hashMap));
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.f26431a = jSONObject;
        a();
    }

    public final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            if (this.b == null) {
                this.b = new LinkedHashMap();
            }
            Map<String, String> map2 = this.b;
            if (map2 == null) {
                return;
            }
            map2.putAll(map);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            cox.b(e, "Cancel", new String[0]);
        }
    }
}
