package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.e;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.performance.preload.g;
import com.taobao.android.detail.core.performance.preload.h;
import com.taobao.android.detail.core.performance.preload.i;
import com.taobao.android.detail.core.performance.preload.k;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class dyb implements dyh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static long f27093a;
    private DetailCoreActivity b;

    public static /* synthetic */ void a(dya dyaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb42a519", new Object[]{dyaVar, map});
        } else {
            c(dyaVar, map);
        }
    }

    static {
        kge.a(910173359);
        kge.a(-1434163575);
        f27093a = 0L;
    }

    public dyb(DetailCoreActivity detailCoreActivity) {
        this.b = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.detail.controller.DetailControllerPreloadHandleCallback");
    }

    @Override // tb.dyh
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.perf.c.a(this.b, oqd.MTOP_STAGE_NETWORKREQUEST);
        com.taobao.android.detail.core.perf.c.a(this.b, "cache_networkRequest", "ProductDetail_FirstScreen_Cache");
    }

    /* loaded from: classes4.dex */
    public static class c implements i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private dya f27095a;
        private Map<String, String> b;

        static {
            kge.a(-1803679369);
            kge.a(-617148499);
        }

        public c(dya dyaVar, Map<String, String> map) {
            this.f27095a = dyaVar;
            this.b = map;
        }

        @Override // com.taobao.android.detail.core.performance.preload.i
        public void a(JSONObject jSONObject, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("163ec766", new Object[]{this, jSONObject, str, str2, str3});
                return;
            }
            if (!com.taobao.android.detail.core.performance.preload.c.FINAL_ULTRON.equals(str3) && !"industry".equals(str3)) {
                z = false;
            }
            if (z) {
                dyb.a(this.f27095a, this.b);
            }
            ecg.a(str, str2, false, str3);
        }
    }

    @Override // tb.dyh
    public void a(boolean z, dya dyaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7fe3f0", new Object[]{this, new Boolean(z), dyaVar});
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        com.taobao.android.detail.core.utils.i.d(com.taobao.android.detail.core.performance.i.a("DetailControllerPreloadHandleCallback", BTags.MainRequestTag), "preload startRequest");
        if (z) {
            concurrentHashMap.put("isInit", "true");
            dyaVar.g();
            View o = this.b.o();
            if (o != null) {
                o.setVisibility(0);
            }
            ebx ebxVar = dyaVar.f;
            String str = ebxVar.q;
            boolean b2 = e.b(str);
            h a2 = a(str, ebxVar.f27180a);
            if (a2 != null) {
                c(dyaVar, concurrentHashMap);
                b(dyaVar, concurrentHashMap);
                if (!b2) {
                    return;
                }
                ecg.a(ebxVar.f27180a, str, true, a2.f);
                return;
            } else if (b2) {
                k.a().a(String.valueOf(this.b.hashCode()), new c(dyaVar, concurrentHashMap));
                b(dyaVar, concurrentHashMap);
                return;
            }
        }
        b(dyaVar, concurrentHashMap);
    }

    private void b(dya dyaVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc13ac78", new Object[]{this, dyaVar, map});
            return;
        }
        com.taobao.android.detail.core.utils.i.c(l.a("DetailControllerPreloadHandleCallback"), "controller.detailRequest");
        b bVar = new b(dyaVar, map);
        if (jqm.a()) {
            a(dyaVar, bVar, f27093a);
        } else {
            a(dyaVar, bVar);
        }
    }

    private void a(dya dyaVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e420fd6a", new Object[]{this, dyaVar, runnable});
        } else {
            a(dyaVar, runnable, 0L);
        }
    }

    private void a(dya dyaVar, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fff269a", new Object[]{this, dyaVar, runnable, new Long(j)});
        } else if (!eiq.j) {
            runnable.run();
        } else if (j > 0) {
            dyaVar.g.postDelayed(runnable, j);
        } else {
            dyaVar.g.post(runnable);
        }
    }

    private static void c(dya dyaVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce4b3d7", new Object[]{dyaVar, map});
            return;
        }
        ebx ebxVar = dyaVar.f;
        h a2 = a(ebxVar.q, ebxVar.f27180a);
        if (a2 == null) {
            com.taobao.android.detail.core.utils.i.c(l.a("DetailControllerPreloadHandleCallback"), "预缓存数据无效：为空");
        } else if (a2.a()) {
            com.taobao.android.detail.core.utils.i.c(l.a("DetailControllerPreloadHandleCallback"), "预缓存数据无效：CacheExpired");
        } else if (!a2.c()) {
            com.taobao.android.detail.core.utils.i.c(l.a("DetailControllerPreloadHandleCallback"), "预缓存数据无效：CacheDataNotCanBeUse");
        } else if (!a2.b()) {
            com.taobao.android.detail.core.utils.i.c(l.a("DetailControllerPreloadHandleCallback"), "预缓存数据无效：NotAllowableProtocol");
        } else {
            dyaVar.f27083a.f();
            String str = a2.f;
            if (!TextUtils.isEmpty(str)) {
                map.put("preload_v", str);
            }
            if (!TextUtils.isEmpty(a2.i)) {
                map.put("industryFailReason", a2.i);
            }
            if (com.taobao.android.detail.core.performance.preload.c.FINAL_ULTRON.equals(str) || "industry".equals(str)) {
                z = true;
            }
            if (!z) {
                dyaVar.f27083a.d(true);
            }
            String a3 = l.a("DetailControllerPreloadHandleCallback");
            com.taobao.android.detail.core.utils.i.c(a3, "预加载缓存获取使用协议版本：" + str);
            g.a().b(str);
            g.a().c(a2.g);
            a(dyaVar.f27083a, dyaVar, ebxVar.f27180a, a2.d);
            a(dyaVar.f27083a, ebxVar, a2);
        }
    }

    private static void a(DetailCoreActivity detailCoreActivity, ebx ebxVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77039559", new Object[]{detailCoreActivity, ebxVar, hVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", ebxVar.f27180a);
        hashMap.put("fromSource", ebxVar.q);
        hashMap.put(fky.SP_KEY_MAIN_PIC_URL, hVar.g);
        hashMap.put("detailVersion", hVar.f);
        ecf.h(detailCoreActivity, hashMap);
    }

    private static h a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("3fac816b", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            String a2 = l.a("DetailControllerPreloadHandleCallback");
            com.taobao.android.detail.core.utils.i.a(a2, "预加载缓存获取本：fromSource:" + str + "itemId:" + str2);
            return null;
        } else if (!e.b(str) && !e.a(str)) {
            String a3 = l.a("DetailControllerPreloadHandleCallback");
            com.taobao.android.detail.core.utils.i.a(a3, "预加载缓存获取本：fromSource:" + str + "预加载能力未开启");
            return null;
        } else {
            return k.a().b(str2);
        }
    }

    private static void a(DetailCoreActivity detailCoreActivity, dya dyaVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("869888f", new Object[]{detailCoreActivity, dyaVar, str, jSONObject});
            return;
        }
        dym dymVar = new dym(dyaVar);
        dymVar.a(new a());
        if (god.o) {
            dymVar.a(new kxb());
        }
        com.taobao.android.detail.core.detail.controller.callback.e eVar = new com.taobao.android.detail.core.detail.controller.callback.e(detailCoreActivity, epo.f(), dymVar);
        eVar.a(new com.taobao.android.detail.core.detail.controller.callback.c());
        HashMap hashMap = new HashMap();
        hashMap.put("mode", "preload");
        if (eip.x) {
            eVar.a(jSONObject, (String) null, hashMap);
        } else {
            eVar.a(jSONObject.toJSONString(), hashMap);
        }
        String a2 = l.a("DetailControllerPreloadHandleCallback");
        com.taobao.android.detail.core.utils.i.a(a2, "预加载缓存获取使用：" + str);
    }

    /* loaded from: classes4.dex */
    public static final class a implements dyi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1360239012);
            kge.a(1742689980);
        }

        private a() {
        }

        @Override // tb.dyi
        public Map<String, String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("isPreload", "true");
            return hashMap;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private dya f27094a;
        private Map<String, String> b;

        static {
            kge.a(107871415);
            kge.a(-1390502639);
        }

        public b(dya dyaVar, Map<String, String> map) {
            this.f27094a = dyaVar;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.taobao.android.detail.core.utils.i.c(l.a("DetailControllerPreloadHandleCallback"), "controller.detailRequest start");
            dym dymVar = new dym(this.f27094a);
            if (TextUtils.isEmpty(this.b.get("preload_v"))) {
                this.b.put("preload_v", "industry");
            }
            this.f27094a.a(dymVar, this.b);
        }
    }
}
