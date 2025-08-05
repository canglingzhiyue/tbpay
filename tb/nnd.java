package tb;

import android.text.TextUtils;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.ali.adapt.api.AliServiceFindedCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.a;
import com.taobao.android.searchbaseframe.util.o;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.datasource.c;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class nnd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WSEARCH_TPP_API_NAME_VALUE = "mtop.relationrecommend.MtopRecommend.recommend";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f31585a;
    private static boolean b;

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    static {
        kge.a(-1041753177);
        HashMap hashMap = new HashMap();
        f31585a = hashMap;
        hashMap.put("localSearch", "24795");
        b = o.c();
    }

    public static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        if (map == null) {
            return "mtop.taobao.wsearch.appsearch";
        }
        if (!TextUtils.isEmpty(map.get("appId"))) {
            return WSEARCH_TPP_API_NAME_VALUE;
        }
        String b2 = b(map);
        if (!TextUtils.isEmpty(b2)) {
            map.put("appId", b2);
            return WSEARCH_TPP_API_NAME_VALUE;
        }
        String str = map.get("m");
        if (TextUtils.equals(map.get("m"), noa.VALUE_MODULE_INSHOP)) {
            map.put("appId", noa.VALUE_TPP_IN_SHOP_APP_ID);
            return WSEARCH_TPP_API_NAME_VALUE;
        } else if (TextUtils.equals(noa.VALUE_SHOWTYPE_SIMILAR_SHOP, str) || TextUtils.equals(noa.VALUE_SIMILAR_SHOP_NEW, str) || TextUtils.equals("shop", map.get("tab"))) {
            return "mtop.taobao.wsearch.appsearch";
        } else {
            String str2 = map.get("tab");
            if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, "all")) {
                if ("dingyue".equals(map.get("mainChannel"))) {
                    map.put("appId", noa.VALUE_TPP_SUBSCRIBE_SEARCH_APP_ID);
                } else if (TextUtils.isEmpty(str)) {
                    map.put("appId", noa.VALUE_TPP_MAIN_SEARCH_APP_ID);
                } else {
                    map.put("appId", noa.VALUE_TPP_ROUTER_APP_ID);
                }
                return WSEARCH_TPP_API_NAME_VALUE;
            }
            map.put("appId", noa.VALUE_TPP_MAIN_SEARCH_APP_ID);
            return WSEARCH_TPP_API_NAME_VALUE;
        }
    }

    private static String b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("154c93a4", new Object[]{map});
        }
        if (map == null || map.isEmpty() || !r.ag()) {
            return null;
        }
        String str = map.get("channelSrp");
        if (TextUtils.isEmpty(str)) {
            str = map.get(nde.G_CHANNELSRP);
        }
        return f31585a.get(str);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        q.a("SearchConfig", "auto play: " + b);
        return b;
    }

    public static boolean a(a aVar) {
        CommonSearchResult commonSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f24fb0d", new Object[]{aVar})).booleanValue();
        }
        return ((aVar instanceof c) && (commonSearchResult = (CommonSearchResult) aVar.getTotalSearchResult()) != null && commonSearchResult.isServerAutoPlay) || a();
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (r.I()) {
            try {
                AliAdaptServiceManager.getInstance().findAliAdaptService(nyf.class, new AliServiceFindedCallback<nyf>() { // from class: tb.nnd.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.adapt.api.AliServiceFindedCallback
                    public /* synthetic */ void onServiceFinded(nyf nyfVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9cd135b1", new Object[]{this, nyfVar});
                        } else {
                            a(nyfVar);
                        }
                    }

                    public void a(nyf nyfVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f7227cfd", new Object[]{this, nyfVar});
                        } else if (nyfVar == null) {
                        } else {
                            try {
                                nnd.a(nyfVar.isAutoPlayVideoUnderCurrentNetwork(Globals.getApplication()));
                            } catch (Throwable unused) {
                                nnd.a(o.c());
                            }
                        }
                    }
                });
            } catch (Throwable unused) {
                b = o.c();
            }
        } else {
            b = o.c();
        }
    }
}
