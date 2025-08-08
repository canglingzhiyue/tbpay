package tb;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.page.FullPage;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.model.AfcConfigBean;
import com.taobao.flowcustoms.afc.model.RouterStrategyOrangeData;
import com.taobao.flowcustoms.afc.request.mtop.b;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.flowcustoms.afc.utils.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class kol {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ROUTER_STRATEGY_ASYNC_MTOP = 1;
    public static final int ROUTER_STRATEGY_LOCAL = 0;
    public static final int ROUTER_STRATEGY_SYNC_MTOP = 2;

    /* renamed from: a  reason: collision with root package name */
    private RouterStrategyOrangeData f30194a;
    private com.taobao.flowcustoms.afc.a b;

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final kol f30198a;

        static {
            kge.a(-145887622);
            f30198a = new kol();
        }

        public static /* synthetic */ kol a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (kol) ipChange.ipc$dispatch("f06f696", new Object[0]) : f30198a;
        }
    }

    static {
        kge.a(657224615);
    }

    public String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)}) : i == 0 ? "local" : i == 1 ? "asyncRemote" : i == 2 ? "syncRemote" : "";
    }

    public static kol a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kol) ipChange.ipc$dispatch("f06f696", new Object[0]) : a.a();
    }

    private kol() {
    }

    public int a(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc9b6d88", new Object[]{this, aVar})).intValue();
        }
        if (e(aVar) && "1".equals(aVar.p)) {
            return 0;
        }
        if (d(aVar) ? !f(aVar) : j(aVar)) {
            return 0;
        }
        return g(aVar) ? 1 : 2;
    }

    public void a(com.taobao.flowcustoms.afc.a aVar, final int i, final knv knvVar) {
        HashMap<String, String> a2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb7c2b", new Object[]{this, aVar, new Integer(i), knvVar});
            return;
        }
        final long a3 = AfcUtils.a();
        String str2 = "1.0";
        if (c(aVar)) {
            if (d(aVar) || e(aVar)) {
                str2 = "2.0";
            }
            a2 = b(aVar, i);
            str = b.LINK_INFO_API_NEW;
        } else {
            a2 = a(aVar, i);
            str = b.LINK_INFO_API;
        }
        final String str3 = str2;
        HashMap<String, String> hashMap = a2;
        final String str4 = str;
        c.b("linkx", String.format("AfcCustomSdk === executeRemote === 请求API:%s, 请求接口参数：%s", str4, hashMap));
        kog.a().a(str4, str3, hashMap, new knz() { // from class: tb.kol.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.knz
            public void a(JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32861656", new Object[]{this, jSONObject});
                    return;
                }
                long a4 = AfcUtils.a();
                c.b(AfcCustomSdk.LOG_TIME, "海关网络请求成功节点耗时：" + (a4 - a3) + "");
                StringBuilder sb = new StringBuilder();
                sb.append(a4 - a3);
                sb.append("");
                com.taobao.flowcustoms.afc.utils.b.a(com.taobao.flowcustoms.afc.utils.b.AFC_REQUEST_TIME, sb.toString(), "success", null);
                c.b("linkx", "AfcCustomSdk === executeRemote === 请求接口成功：" + jSONObject);
                Map<String, Object> a5 = e.a(jSONObject);
                knv knvVar2 = knvVar;
                if (knvVar2 == null) {
                    return;
                }
                knvVar2.a(true, i, str4, str3, a5);
            }

            @Override // tb.knz
            public void b(JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("345f6975", new Object[]{this, jSONObject});
                    return;
                }
                long a4 = AfcUtils.a();
                c.b(AfcCustomSdk.LOG_TIME, "海关网络请求失败节点耗时：" + (a4 - a3) + "");
                StringBuilder sb = new StringBuilder();
                sb.append(a4 - a3);
                sb.append("");
                com.taobao.flowcustoms.afc.utils.b.a(com.taobao.flowcustoms.afc.utils.b.AFC_REQUEST_TIME, sb.toString(), "fail", null);
                c.b("linkx", "AfcCustomSdk === executeRemote === 请求接口失败：" + jSONObject);
                knv knvVar2 = knvVar;
                if (knvVar2 == null) {
                    return;
                }
                knvVar2.a(false, i, str4, str3, new HashMap());
            }
        });
    }

    public void b(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43742d56", new Object[]{this, aVar});
            return;
        }
        final long a2 = AfcUtils.a();
        HashMap<String, String> h = h(aVar);
        c.b("linkx", "AfcCustomSdk === executeRefineInfoMTOP === 请求接口参数：" + h);
        kog.a().a(b.BACK_OPERATION_API, "1.0", h, new knz() { // from class: tb.kol.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.knz
            public void a(JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32861656", new Object[]{this, jSONObject});
                    return;
                }
                long a3 = AfcUtils.a();
                c.b(AfcCustomSdk.LOG_TIME, "海关网络请求成功节点耗时：" + (a3 - a2) + "");
                StringBuilder sb = new StringBuilder();
                sb.append("AfcCustomSdk === executeRefineInfoMTOP === 请求接口成功：");
                sb.append(jSONObject);
                c.b("linkx", sb.toString());
                try {
                    kog.a().b(jSONObject.getString("afcBackUrl"));
                } catch (JSONException e) {
                    e.printStackTrace();
                    kog.a().b("");
                }
            }

            @Override // tb.knz
            public void b(JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("345f6975", new Object[]{this, jSONObject});
                    return;
                }
                long a3 = AfcUtils.a();
                c.b(AfcCustomSdk.LOG_TIME, "海关网络请求失败节点耗时：" + (a3 - a2) + "");
                StringBuilder sb = new StringBuilder();
                sb.append("AfcCustomSdk === executeRefineInfoMTOP === 请求接口失败：");
                sb.append(jSONObject);
                c.b("linkx", sb.toString());
                kog.a().b("");
            }
        });
    }

    private HashMap<String, String> a(com.taobao.flowcustoms.afc.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("698145f1", new Object[]{this, aVar, new Integer(i)});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (aVar == null) {
            c.a("linkx", "NetRequestImp === requestApi === afcContext为空，不请求网络");
            return hashMap;
        }
        String str = "";
        if (aVar.n != null) {
            aVar.m.put("scheme", aVar.n.getScheme() == null ? str : aVar.n.getScheme());
        }
        Map<String, String> map = aVar.m;
        map.put("deviceLevel", kog.a().a(-1) + str);
        aVar.m.put("launchType", kog.a().c(mpa.COLD));
        aVar.m.put(com.taobao.flowcustoms.afc.utils.b.AFC_ID, AfcCustomSdk.a().g);
        Map<String, String> map2 = aVar.m;
        map2.put("hasLoginToken", kog.a().b() + str);
        aVar.m.put("surge_ssr", String.valueOf(i(aVar)));
        hashMap.put("imei", AfcUtils.a((Context) AfcCustomSdk.a().f17167a, false));
        hashMap.put("oaid", kog.a().d(str));
        hashMap.put("appKey", aVar.f17179a == null ? str : aVar.f17179a);
        hashMap.put("packageName", com.taobao.flowcustoms.afc.a.b == null ? str : com.taobao.flowcustoms.afc.a.b);
        hashMap.put("action", AfcUtils.a(aVar.e, aVar.f) == null ? str : AfcUtils.a(aVar.e, aVar.f));
        hashMap.put(FullPage.PARAM_BACK2Tab2URL, aVar.h == null ? str : aVar.h);
        hashMap.put("sdkVersion", aVar.d == null ? str : aVar.d);
        hashMap.put("h5Url", aVar.g == null ? str : aVar.g);
        if (aVar.n != null) {
            str = aVar.n.toString();
        }
        hashMap.put("origUrl", str);
        hashMap.put("extra", JSON.toJSONString(aVar.m));
        hashMap.put(com.taobao.tao.image.c.MODULES, "all");
        if (i == 1) {
            hashMap.put("async", "true");
        }
        return hashMap;
    }

    private HashMap<String, String> b(com.taobao.flowcustoms.afc.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("839cc490", new Object[]{this, aVar, new Integer(i)});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (aVar == null) {
            c.a("linkx", "buildParamsNew === requestApi === afcContext为空，不请求网络");
            return hashMap;
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("packageName", (Object) (com.taobao.flowcustoms.afc.a.b == null ? "" : com.taobao.flowcustoms.afc.a.b));
        jSONObject.put("imei", (Object) AfcUtils.a((Context) AfcCustomSdk.a().f17167a, false));
        jSONObject.put("oaid", (Object) kog.a().d(""));
        jSONObject.put("hasLoginToken", (Object) (kog.a().b() + ""));
        jSONObject.put("launchType", (Object) kog.a().c(mpa.COLD));
        jSONObject.put("deviceLevel", (Object) (kog.a().a(-1) + ""));
        jSONObject.put("surge_ssr", (Object) String.valueOf(i(aVar)));
        if (i == 1) {
            jSONObject.put("async", (Object) "true");
        }
        hashMap.put("afcId", AfcCustomSdk.a().g);
        hashMap.put("targetUrl", aVar.o);
        hashMap.put("extraInfo", jSONObject.toJSONString());
        hashMap.put("appKeys", aVar.I);
        if (i == 0) {
            hashMap.put("onlyQueryBackAppInfo", "true");
        }
        return hashMap;
    }

    private HashMap<String, String> h(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("75db223f", new Object[]{this, aVar});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (aVar == null) {
            c.a("linkx", "buildParamsRefine === requestApi === afcContext为空，不请求网络");
            return hashMap;
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("packageName", (Object) (com.taobao.flowcustoms.afc.a.b == null ? "" : com.taobao.flowcustoms.afc.a.b));
        jSONObject.put("imei", (Object) AfcUtils.a((Context) AfcCustomSdk.a().f17167a, false));
        jSONObject.put("oaid", (Object) kog.a().d(""));
        jSONObject.put("hasLoginToken", (Object) (kog.a().b() + ""));
        jSONObject.put("launchType", (Object) kog.a().c(mpa.COLD));
        jSONObject.put("deviceLevel", (Object) (kog.a().a(-1) + ""));
        hashMap.put("afcId", AfcCustomSdk.a().g);
        hashMap.put("url", aVar.E);
        hashMap.put("extraInfo", jSONObject.toJSONString());
        return hashMap;
    }

    public boolean c(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa4ced1b", new Object[]{this, aVar})).booleanValue() : kog.a().b(aVar);
    }

    private boolean i(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("13616ba1", new Object[]{this, aVar})).booleanValue() : kog.a().c(aVar);
    }

    public boolean d(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1125acdc", new Object[]{this, aVar})).booleanValue() : kog.a().d(aVar);
    }

    public boolean e(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("77fe6c9d", new Object[]{this, aVar})).booleanValue() : kog.a().e(aVar);
    }

    private boolean j(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a3a2b62", new Object[]{this, aVar})).booleanValue();
        }
        boolean z = !kog.a().j;
        c.a("linkx", "AfcCustomSdk === routerUrl === 是否服务端分流：" + z);
        if (StringUtils.isEmpty(aVar.g)) {
            return false;
        }
        if (!z) {
            Uri parse = Uri.parse(aVar.g);
            String path = parse.getPath();
            String str = parse.getHost() + path;
            AfcConfigBean a2 = kog.a().a("afc_config_inner");
            if (a2 != null && a2.getRouterRules() != null) {
                List<String> routerWhiteList = a2.getRouterRules().getRouterWhiteList();
                if (routerWhiteList != null && routerWhiteList.size() > 0 && routerWhiteList.contains(str)) {
                    return true;
                }
                if (aVar.s != null && aVar.s.length() > 0) {
                    List<String> bcFlsrc = a2.getRouterRules().getBcFlsrc();
                    if (bcFlsrc != null && bcFlsrc.size() != 0) {
                        for (String str2 : bcFlsrc) {
                            if (!StringUtils.isEmpty(str2) && aVar.s.startsWith(str2)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return z;
    }

    public boolean f(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded72c5e", new Object[]{this, aVar})).booleanValue();
        }
        try {
            this.b = aVar;
            this.f30194a = (RouterStrategyOrangeData) com.taobao.flowcustoms.afc.b.a().a("routerStrategy", RouterStrategyOrangeData.class);
        } catch (Exception e) {
            c.b("linkx", "AfcCustomSdk === 本地分流异常：" + e.getMessage());
            com.taobao.flowcustoms.afc.utils.b.a(com.taobao.flowcustoms.afc.utils.b.AFC_LINK_CRASH_MESSAGE, com.taobao.flowcustoms.afc.utils.b.AFC_LINK_CRASH_ROUTER_LOCAL, e.getMessage(), null);
        }
        if ((StringUtils.isEmpty(aVar.f) || "h5".equals(aVar.f)) && this.f30194a != null && !b() && !a(this.f30194a.getQuery())) {
            if (!c()) {
                return false;
            }
        }
        return true;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        List<String> bizCode = this.f30194a.getBizCode();
        if (!StringUtils.isEmpty(this.b.s) && bizCode != null && bizCode.size() != 0) {
            for (String str : bizCode) {
                if (this.b.s.startsWith(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue();
        }
        if (!StringUtils.isEmpty(this.b.g) && list != null && list.size() != 0) {
            Uri parse = Uri.parse(this.b.g);
            boolean z = false;
            for (Object obj : list) {
                for (Map.Entry entry : ((Map) JSON.parseObject(obj.toString(), new TypeReference<Map<String, String>>() { // from class: tb.kol.3
                }, new Feature[0])).entrySet()) {
                    if (StringUtils.isEmpty(parse.getQueryParameter((String) entry.getKey())) || (!((String) entry.getValue()).equals("*") && !((String) entry.getValue()).equals(parse.getQueryParameter((String) entry.getKey())))) {
                        z = false;
                        continue;
                        break;
                    }
                    z = true;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        List<RouterStrategyOrangeData.H5urlBean> h5url = this.f30194a.getH5url();
        if (!StringUtils.isEmpty(this.b.g) && h5url != null && h5url.size() != 0) {
            Uri parse = Uri.parse(this.b.g);
            String host = parse.getHost();
            String path = parse.getPath();
            for (RouterStrategyOrangeData.H5urlBean h5urlBean : h5url) {
                boolean z = !StringUtils.isEmpty(h5urlBean.getHost()) && h5urlBean.getHost().equals(host);
                boolean z2 = StringUtils.isEmpty(h5urlBean.getPath()) || (!StringUtils.isEmpty(h5urlBean.getPath()) && h5urlBean.getPath().equals(path));
                boolean z3 = h5urlBean.getQuery() == null || (h5urlBean.getQuery() != null && a(h5urlBean.getQuery()));
                if (z && z2 && z3) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean g(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45afec1f", new Object[]{this, aVar})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            c.b("linkx", "AfcCustomSdk === isAsyncMTOPRouter === error：" + th);
        }
        if (!Boolean.parseBoolean(kog.a().a("useAsyncRouter", "true")) || StringUtils.isEmpty(aVar.g)) {
            return false;
        }
        Uri parse = Uri.parse(aVar.g);
        String path = parse.getPath();
        String str = parse.getHost() + path;
        AfcConfigBean.RouterRulesBean routerRulesBean = (AfcConfigBean.RouterRulesBean) com.taobao.flowcustoms.afc.b.a().a("afc_config_inner", AfcConfigBean.RouterRulesBean.class);
        if (routerRulesBean == null) {
            return false;
        }
        List<String> asyncRequestPathWhiteList = routerRulesBean.getAsyncRequestPathWhiteList();
        List<String> asyncRequestBlackList = routerRulesBean.getAsyncRequestBlackList();
        if (asyncRequestBlackList != null && asyncRequestBlackList.size() > 0) {
            for (String str2 : asyncRequestBlackList) {
                if (str2.equalsIgnoreCase(str)) {
                    return false;
                }
            }
        }
        if (asyncRequestPathWhiteList != null && asyncRequestPathWhiteList.size() > 0) {
            for (String str3 : asyncRequestPathWhiteList) {
                if (str3.equalsIgnoreCase(str)) {
                    return kog.a().a(aVar);
                }
            }
        }
        return false;
    }
}
