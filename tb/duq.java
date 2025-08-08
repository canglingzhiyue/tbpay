package tb;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.datamodel.nextrpc.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.intf.MtopPrefetch;
import tb.arc;
import tb.ase;
import tb.ifz;

/* loaded from: classes4.dex */
public class duq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f26997a;
    private final Intent b;
    private final long c;
    private final String d;
    private final Map<String, String> e;
    private final Map<String, String> f;
    private final boolean g;
    private final ase.a h;
    private final boolean i;

    static {
        kge.a(1435087387);
        kge.a(-2094773244);
    }

    public duq(a aVar) {
        this.f26997a = aVar.f26999a;
        this.b = aVar.b;
        this.c = a.a(aVar);
        this.d = a.b(aVar);
        this.e = a.c(aVar);
        this.f = a.d(aVar);
        this.g = a.e(aVar);
        this.h = a.f(aVar);
        this.i = a.g(aVar);
    }

    private AURANextRPCEndpoint a(Context context, Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("82f50102", new Object[]{this, context, intent, new Boolean(z)});
        }
        duk dukVar = new duk(context, intent);
        Map<String, String> map = this.e;
        if (map != null) {
            dukVar.b(map);
        }
        Map<String, String> map2 = this.f;
        if (map2 != null) {
            dukVar.a(map2);
        }
        b a2 = new b.a().a(this.c).a();
        duh a3 = dukVar.a();
        if (z) {
            ifz.a(ifz.a.b("mtop_prefetchV2").c("进入预处理").a(0.01f));
            a3.d(1);
            a3.a(new MtopPrefetch.IPrefetchComparator() { // from class: tb.duq.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchComparator
                public MtopPrefetch.CompareResult compare(MtopBuilder mtopBuilder, MtopBuilder mtopBuilder2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (MtopPrefetch.CompareResult) ipChange2.ipc$dispatch("cca63c2e", new Object[]{this, mtopBuilder, mtopBuilder2});
                    }
                    MtopPrefetch.CompareResult compareResult = new MtopPrefetch.CompareResult();
                    try {
                        compareResult = a(mtopBuilder.request, mtopBuilder2.request, a());
                        ifz.a(ifz.a.b("mtop_prefetchV2").a(compareResult.getData().toString()).c(compareResult.isSame() ? "命中" : "未命中").a(0.01f));
                        ard a4 = arc.a();
                        a4.a("MTOP 预处理结束，结果 ：" + compareResult.isSame(), arc.a.a().a("AURA/performance").a("realValue", compareResult.getData().get("realValue")).a("prefetchValue", compareResult.getData().get("prefetchValue")).a("missMsg", compareResult.getData().get("missMsg")).a("missKey", compareResult.getData().get("missKey")).b());
                    } catch (Throwable th) {
                        ifz.a("RRE_FETCH_COMPARE_EXCEPTION", th.getMessage());
                    }
                    return compareResult;
                }

                private List<String> a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (List) ipChange2.ipc$dispatch("627608df", new Object[]{this});
                    }
                    String string = AliBuyPerfSwitcher.getString("prefetchCompareWhiteList", "websiteLanguage,bcflsrc,lng,ua,areaDivisionCode,lat");
                    ArrayList arrayList = new ArrayList();
                    if (!StringUtils.isEmpty(string)) {
                        arrayList = new ArrayList(Arrays.asList(string.split(",")));
                    }
                    arrayList.add("cartTraceId");
                    arrayList.add("cartIsLoading");
                    arrayList.add("cartIsLocalCalculate");
                    return arrayList;
                }

                private MtopPrefetch.CompareResult a(MtopRequest mtopRequest, MtopRequest mtopRequest2, List<String> list) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (MtopPrefetch.CompareResult) ipChange2.ipc$dispatch("d373501", new Object[]{this, mtopRequest, mtopRequest2, list});
                    }
                    MtopPrefetch.CompareResult compareResult = new MtopPrefetch.CompareResult();
                    if (StringUtils.isEmpty(mtopRequest2.getKey()) || !mtopRequest2.getKey().equals(mtopRequest.getKey())) {
                        compareResult.getData().put("missKey", "apiKey");
                        compareResult.getData().put("missMsg", "missApi");
                        compareResult.getData().put("prefetchValue", mtopRequest.getKey());
                        compareResult.getData().put("realValue", mtopRequest2.getKey());
                    } else if (a(mtopRequest.dataParams, mtopRequest2.dataParams, list, compareResult)) {
                        compareResult.setSame(true);
                    }
                    return compareResult;
                }

                private boolean a(Map<String, String> map3, Map<String, String> map4, List<String> list, MtopPrefetch.CompareResult compareResult) {
                    String key;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("8379ad41", new Object[]{this, map3, map4, list, compareResult})).booleanValue();
                    }
                    if (map3 == null && map4 == null) {
                        return true;
                    }
                    if (map3 == null) {
                        compareResult.getData().put("prefetchValue", "is null");
                        return false;
                    } else if (map4 == null) {
                        compareResult.getData().put("realValue", "is null");
                        return false;
                    } else {
                        asj asjVar = new asj();
                        for (Map.Entry<String, String> entry : map3.entrySet()) {
                            String key2 = entry.getKey();
                            if (key2 == null) {
                                return true;
                            }
                            if (!xiv.a(key2, map3.get(key2), map4.get(key2), list, asjVar)) {
                                compareResult.setSame(false);
                                compareResult.setData(asjVar.b());
                                return false;
                            }
                        }
                        Iterator<Map.Entry<String, String>> it = map4.entrySet().iterator();
                        while (it.hasNext() && (key = it.next().getKey()) != null) {
                            if (!xiv.a(key, map3.get(key), map4.get(key), list, asjVar)) {
                                compareResult.setSame(false);
                                compareResult.setData(asjVar.b());
                                return false;
                            }
                        }
                        return true;
                    }
                }
            });
        }
        return dukVar.a().a(a2, this.g, this.i);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(str, a(this.f26997a, this.b, false));
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            a(str, a(this.f26997a, this.b, true));
        }
    }

    private void a(String str, AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed590e95", new Object[]{this, str, aURANextRPCEndpoint});
            return;
        }
        if (!this.g || !AliBuyPerfSwitcher.enableForceMainThreadPerf()) {
            z = false;
        }
        ase a2 = asb.a(this.f26997a.getApplicationContext(), str, aURANextRPCEndpoint.getStreamModel(), AliBuyPerfSwitcher.enableStreamJson(), z);
        arc.a().a("startPrefetch ", arc.a.a().a("AURA/performance").a("time", System.currentTimeMillis()).b());
        a2.a(aURANextRPCEndpoint, this.h);
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f26999a;
        public Intent b;
        private long c = 5000;
        private String d;
        private Map<String, String> e;
        private Map<String, String> f;
        private boolean g;
        private ase.a h;
        private boolean i;

        static {
            kge.a(26623474);
        }

        public static /* synthetic */ long a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e7accaef", new Object[]{aVar})).longValue() : aVar.c;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8eb35ee4", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ Map c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ef652f2", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ Map d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("38463773", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ boolean e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f1a7403", new Object[]{aVar})).booleanValue() : aVar.g;
        }

        public static /* synthetic */ ase.a f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ase.a) ipChange.ipc$dispatch("27c53916", new Object[]{aVar}) : aVar.h;
        }

        public static /* synthetic */ boolean g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2d14885", new Object[]{aVar})).booleanValue() : aVar.i;
        }

        public a(Context context, Intent intent) {
            this.f26999a = context;
            this.b = intent;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("541c82bd", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }

        public a a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b6293b2c", new Object[]{this, map});
            }
            this.e = map;
            return this;
        }

        public a a(ase.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("55934b41", new Object[]{this, aVar});
            }
            this.h = aVar;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("adf7ecfe", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public duq a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (duq) ipChange.ipc$dispatch("f03df1e", new Object[]{this}) : new duq(this);
        }
    }
}
