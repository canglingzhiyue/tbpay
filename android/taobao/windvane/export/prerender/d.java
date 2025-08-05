package android.taobao.windvane.export.prerender;

import android.taobao.windvane.extra.uc.WVUCWebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.rul;
import tb.tbt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J3\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b0\u000eH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroid/taobao/windvane/export/prerender/PrerenderManager;", "Landroid/taobao/windvane/export/prerender/IPrerenderManager;", "()V", "mPrerenderItems", "", "Landroid/taobao/windvane/prerender/PrerenderItem;", "acquirePrerenderWebView", "Landroid/taobao/windvane/extra/uc/WVUCWebView;", "params", "Landroid/taobao/windvane/export/prerender/PrerenderAcquireParams;", tbt.PRE_RENDER, "", "Landroid/taobao/windvane/export/prerender/PrerenderRequestParams;", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final List<android.taobao.windvane.prerender.e> f1608a;

    static {
        kge.a(1833736417);
        kge.a(583788080);
        INSTANCE = new d();
        f1608a = new ArrayList();
    }

    private d() {
    }

    public void a(e params, rul<? super Boolean, t> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f64b26", new Object[]{this, params, callback});
            return;
        }
        q.d(params, "params");
        q.d(callback, "callback");
        com.taobao.themis.kernel.utils.a.a(new PrerenderManager$preRender$1(callback, params));
    }

    public WVUCWebView a(c params) {
        Object obj;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("171f17f6", new Object[]{this, params});
        }
        q.d(params, "params");
        Iterator<T> it = f1608a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            android.taobao.windvane.prerender.e eVar = (android.taobao.windvane.prerender.e) obj;
            e b = eVar.b();
            if (!eVar.c() || params.c() != b.b() || !b.c().a(b.a(), params.b())) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        android.taobao.windvane.prerender.e eVar2 = (android.taobao.windvane.prerender.e) obj;
        if (eVar2 == null) {
            return null;
        }
        com.taobao.android.riverlogger.e.a(RVLLevel.Info, "Themis/Performance/Prerender", "hit prerender webview");
        f1608a.remove(eVar2);
        eVar2.a().setOuterContext(params.a());
        if (eVar2.b().d() > 0) {
            com.taobao.themis.kernel.utils.a.a(a.INSTANCE, eVar2.b().d());
        }
        return eVar2.a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                f.INSTANCE.a(PrerenderManager$acquirePrerenderWebView$1$1.INSTANCE);
            }
        }
    }
}
