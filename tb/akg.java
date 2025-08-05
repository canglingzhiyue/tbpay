package tb;

import android.content.Context;
import android.os.MessageQueue;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.alibaba.ability.localization.b;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.monitor.procedure.s;
import com.taobao.tao.TBMainHost;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.bed;

/* loaded from: classes2.dex */
public final class akg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CartPerformance";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f25388a;
    private static Map<String, Boolean> b;

    public static /* synthetic */ void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
        } else {
            b(j);
        }
    }

    static {
        kge.a(497043400);
        f25388a = true;
        b = null;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : f25388a;
    }

    public static jpo a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jpo) ipChange.ipc$dispatch("837c9e53", new Object[]{context, str}) : a(context, str, System.currentTimeMillis());
    }

    public static jpo a(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jpo) ipChange.ipc$dispatch("f4f9c8a3", new Object[]{context, str, new Long(j)});
        }
        jpo b2 = jpo.b(context);
        if (!b2.l(str)) {
            return b2;
        }
        b2.a(str, j);
        String valueOf = String.valueOf(b());
        if ("mtop.trade.query.bag".equals(str)) {
            b2.b(nfc.PHA_MONITOR_IS_COLD_START, valueOf);
            b2.b("isLoadFromCache", "false");
            b2.a("d1", "是否冷启", valueOf);
            b2.b("d2", "fromPrefetch", "是否预热");
            b2.b("d3", "isLoadFromCache", "缓存");
            b2.a("d4", "主Tab", String.valueOf(TBMainHost.a().getContext() == context));
            b2.a("d5", "DXButter", String.valueOf(aad.INSTANCE.a()));
            b2.b("d6", ieu.sKeyRecommendShotAtFirstScreen, "首屏是否有信息流");
            b2.a("d7", "是否国内版", String.valueOf(!b.c()));
            b2.b("d8", "newPage", "首屏5个品");
            b2.b("d9", "isRecreateFragment", "是否重建");
            b2.a(ieu.sEnableMtopStreamJsonForQuery, "", String.valueOf(jqi.a("iCart", ieu.sEnableMtopStreamJsonForQuery, false)));
            b2.a(ieu.sCacheFirstPageWhenPreRequest, "", String.valueOf(jqi.a("iCart", ieu.sCacheFirstPageWhenPreRequest, false)));
            b2.a(ieu.sLoadImageWhenPreRequest, "", String.valueOf(jqi.a("iCart", ieu.sLoadImageWhenPreRequest, false)));
            b2.a(ieu.sResetPreRequestDataWhenAddCart, "", String.valueOf(jqi.a("iCart", ieu.sResetPreRequestDataWhenAddCart, false)));
            b2.a(ieu.sLoadCacheWhenLoadFirstPageOnCreate, "", String.valueOf(jqi.a("iCart", ieu.sLoadCacheWhenLoadFirstPageOnCreate, false)));
        } else if ("mtop.trade.update.bag".equals(str)) {
            b2.a("d1", "DXButter", String.valueOf(aad.INSTANCE.a()));
            b2.a("d2", "是否国内版", String.valueOf(!b.c()));
        }
        return b2;
    }

    public static void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{context, str, new Boolean(z)});
            return;
        }
        if (z && Login.checkSessionValid()) {
            z2 = false;
        }
        jpo.b(context).b(str, z2, (Map<String, String>) null);
    }

    public static void b(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49adbeb", new Object[]{context, str, new Boolean(z)});
            return;
        }
        jpo b2 = jpo.b(context);
        b2.b("onlyRefreshFooter", "true");
        b2.a("apmClientContainerRender", false, (Map<String, String>) null);
        a(context, str, z);
    }

    public static void a(Context context, Fragment fragment, jny jnyVar, RecyclerView recyclerView, boolean z, String str, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2deb0891", new Object[]{context, fragment, jnyVar, recyclerView, new Boolean(z), str, new Boolean(z2)});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            bpa.a(context, recyclerView);
            a(context, fragment, recyclerView);
            jpo b2 = jpo.b(context);
            if (b()) {
                b2.b("isRecreateFragment", String.valueOf(z2));
                boolean z3 = jnyVar != null && jnyVar.e();
                bed.a(bed.a.b("renderWithCacheWhenColdStart").c("c1", String.valueOf(z)).c("c2", str == null ? "" : str).a(z3 ? "命中缓存" : "未命中缓存").a(z3).a(0.01f));
            }
            b2.a("apmClientContainerRender", currentTimeMillis, false, (Map<String, String>) null);
            f25388a = false;
            jqg.a("iCart", TAG, "渲染完成，onLayoutComplete,是否重建:" + z2);
        } catch (Throwable th) {
            f25388a = false;
            jqg.a("iCart", TAG, "渲染完成，onLayoutComplete,是否重建:" + z2);
            throw th;
        }
    }

    public static void a(String str, RequestConfig requestConfig, String str2, boolean z) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6769", new Object[]{str, requestConfig, str2, new Boolean(z)});
            return;
        }
        if (b == null) {
            b = new HashMap();
        }
        String name = requestConfig.e().name();
        if (RequestConfig.RequestType.QUERY_CART_PAGE == requestConfig.e()) {
            Boolean bool = b.get(name);
            str3 = ((bool == null || !bool.booleanValue()) ? "首次" : "非首次") + name;
        } else {
            str3 = name;
        }
        b.put(name, true);
        bed.a(bed.b.a(str3, z).a(str).a(System.currentTimeMillis() - requestConfig.n()).b(str2).a(z ? 0.001f : 1.0f));
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else if (z) {
            final long currentTimeMillis = System.currentTimeMillis();
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            for (int i = 0; i < 2; i++) {
                jqh.a(new MessageQueue.IdleHandler() { // from class: tb.akg.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                        }
                        jqg.b(akg.TAG, "idleCost=" + (System.currentTimeMillis() - currentTimeMillis));
                        if (atomicInteger.incrementAndGet() < 2) {
                            return false;
                        }
                        jqg.b(akg.TAG, "report idleCost=" + (System.currentTimeMillis() - currentTimeMillis));
                        akg.a(currentTimeMillis);
                        return false;
                    }
                });
            }
        }
    }

    private static void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{new Long(j)});
        } else {
            bed.b("iCart", "fromRenderEndToIdleRun", System.currentTimeMillis() - j, 0.005f);
        }
    }

    private static void a(Context context, Fragment fragment, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb47f80", new Object[]{context, fragment, recyclerView});
            return;
        }
        if (fragment != null && recyclerView != null) {
            try {
                boolean z = recyclerView.getChildAt(((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition()) instanceof RecyclerView;
                String str = z ? "itemCountNoMoreThan3" : "itemCountMoreThan3";
                jpo.b(context).b(ieu.sKeyRecommendShotAtFirstScreen, z ? "有信息流" : "无信息流");
                s.f18233a.b(fragment).a("bizStage", str);
            } catch (Exception unused) {
            }
        }
    }
}
