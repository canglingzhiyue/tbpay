package android.taobao.windvane.prerender;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\b0\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroid/taobao/windvane/prerender/PrerenderFactory;", "Landroid/taobao/windvane/prerender/IPrerenderFactory;", "()V", "clientPrerenderFactory", "Landroid/taobao/windvane/prerender/ClientPrerenderFactory;", "snapShotPrerenderFactory", "Landroid/taobao/windvane/prerender/SnapShotPrerenderFactory;", "createPrerenderItem", "", "params", "Landroid/taobao/windvane/export/prerender/PrerenderRequestParams;", "callback", "Lkotlin/Function1;", "Landroid/taobao/windvane/prerender/PrerenderItem;", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final f f1690a;
    private static final a b;

    static {
        kge.a(2136786187);
        kge.a(-926853536);
        INSTANCE = new d();
        f1690a = new f();
        b = new a();
    }

    private d() {
    }

    public void a(android.taobao.windvane.export.prerender.e params, rul<? super e, t> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f64b26", new Object[]{this, params, callback});
            return;
        }
        q.d(params, "params");
        q.d(callback, "callback");
        if (params.b() == 0) {
            callback.mo2421invoke(null);
        } else if (params.b() == 1) {
            b.a(params, callback);
        } else if (params.b() != 2) {
        } else {
            f1690a.a(params, callback);
        }
    }
}
