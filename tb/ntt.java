package tb;

import android.app.Activity;
import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.msoa.h;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.util.e;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.datasource.c;
import com.taobao.taolive.room.utils.aw;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class ntt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ntt b;

    /* renamed from: a  reason: collision with root package name */
    private a f31758a;

    static {
        kge.a(-1154407837);
        b = new ntt();
    }

    public static ntt a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ntt) ipChange.ipc$dispatch("f086770", new Object[0]) : b;
    }

    private ntt() {
    }

    public boolean a(String str, c cVar, boolean z, AuctionBaseBean auctionBaseBean, Activity activity) {
        String str2;
        Map<String, String> pageProperties;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a861981", new Object[]{this, str, cVar, new Boolean(z), auctionBaseBean, activity})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        if (z) {
            a(str, cVar, auctionBaseBean);
            ArrayMap<String, String> c = c();
            if (activity != null && (pageProperties = UTAnalytics.getInstance().getDefaultTracker().getPageProperties(activity)) != null && !pageProperties.isEmpty()) {
                String str3 = pageProperties.get("spm-url");
                if (!StringUtils.isEmpty(str3)) {
                    c.put("spm-url", str3);
                }
                String str4 = pageProperties.get("spm-cnt");
                if (!StringUtils.isEmpty(str4)) {
                    c.put("spm-cnt", str4);
                }
            }
            UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder("/wxcart.list.add_to_cart");
            uTControlHitBuilder.setProperties(c);
            uTControlHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG1, "/wxcart.list.add_to_cart");
            UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("actionType", "0");
        hashMap.put("bizName", "taobao_main_search");
        String str5 = r.aD() ? "2.0" : "1.0";
        if (auctionBaseBean == null || StringUtils.isEmpty(auctionBaseBean.locType)) {
            str2 = str5;
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(noa.KEY_LOC_TYPE, (Object) auctionBaseBean.locType);
            jSONObject.put(noa.KEY_MSOA_TRANS_KEY, (Object) noa.KEY_LOC_TYPE);
            hashMap.put("sourceType", "0");
            hashMap.put("exParams", jSONObject);
            str2 = "3.0";
        }
        try {
            com.taobao.android.msoa.c.a().a(new h("msoa.taobao.search", "msoa.taobao.detail.showsku", str2, "msoa.taobao.search", hashMap), new MSOAServiceListener() { // from class: tb.ntt.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onSuccess(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    } else if (map == null || !"1".equals(map.get("resultCode"))) {
                    } else {
                        q.a("SearchAddCartUtil", "add to cart successfully");
                        ntt.this.b();
                    }
                }

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onFail(String str6, String str7, boolean z2, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str6, str7, new Boolean(z2), map});
                        return;
                    }
                    q.a("SearchAddCartUtil", "fail to add to cart: " + str6 + "::" + str7);
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

    private void a(String str, c cVar, AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6fd4e3", new Object[]{this, str, cVar, auctionBaseBean});
            return;
        }
        this.f31758a = new a();
        a.a(this.f31758a, str);
        CommonSearchResult commonSearchResult = (CommonSearchResult) cVar.getTotalSearchResult();
        if (commonSearchResult != null) {
            a.b(this.f31758a, commonSearchResult.getMainInfo().rn);
            a.c(this.f31758a, commonSearchResult.getMainInfo().abtest);
        }
        a.d(this.f31758a, cVar.getKeyword());
    }

    private ArrayMap<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("8ca214dc", new Object[]{this});
        }
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        a aVar = this.f31758a;
        if (aVar == null) {
            return arrayMap;
        }
        arrayMap.put("item_id", a.a(aVar));
        arrayMap.put(aw.PARAM_SEARCH_KEYWORD_RN, a.b(this.f31758a));
        arrayMap.put(djy.SERIALIZE_EXP_BUCKET_ID, a.c(this.f31758a));
        arrayMap.put("query", a.d(this.f31758a));
        arrayMap.put("rainbow", com.taobao.search.rainbow.a.c());
        return arrayMap;
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f31760a = "";
        private String b = "";
        private String c = "";
        private String d = "";

        static {
            kge.a(1541909968);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("12f95df3", new Object[]{aVar}) : aVar.f31760a;
        }

        public static /* synthetic */ String a(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("89bd32a9", new Object[]{aVar, str});
            }
            aVar.f31760a = str;
            return str;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9b299dd2", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ String b(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7b66d8c8", new Object[]{aVar, str});
            }
            aVar.b = str;
            return str;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2359ddb1", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ String c(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6d107ee7", new Object[]{aVar, str});
            }
            aVar.c = str;
            return str;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ab8a1d90", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ String d(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5eba2506", new Object[]{aVar, str});
            }
            aVar.d = str;
            return str;
        }
    }
}
