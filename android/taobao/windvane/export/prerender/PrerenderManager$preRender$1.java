package android.taobao.windvane.export.prerender;

import android.taobao.windvane.config.j;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class PrerenderManager$preRender$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ rul $callback;
    public final /* synthetic */ e $params;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrerenderManager$preRender$1(rul rulVar, e eVar) {
        super(0);
        this.$callback = rulVar;
        this.$params = eVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "prerenderItem", "Landroid/taobao/windvane/prerender/PrerenderItem;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: android.taobao.windvane.export.prerender.PrerenderManager$preRender$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements rul<android.taobao.windvane.prerender.e, t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass1() {
            super(1);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
        /* renamed from: android.taobao.windvane.export.prerender.PrerenderManager$preRender$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C00151 extends Lambda implements ruk<t> {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ android.taobao.windvane.prerender.e $prerenderItem;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00151(android.taobao.windvane.prerender.e eVar) {
                super(0);
                this.$prerenderItem = eVar;
            }

            @Override // tb.ruk
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ t mo2427invoke() {
                mo2427invoke();
                return t.INSTANCE;
            }

            @Override // tb.ruk
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void mo2427invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                    return;
                }
                d dVar = d.INSTANCE;
                d.$ipChange.add(this.$prerenderItem);
                com.taobao.themis.kernel.utils.a.a(new Runnable() { // from class: android.taobao.windvane.export.prerender.PrerenderManager.preRender.1.1.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        d dVar2 = d.INSTANCE;
                        if (!d.$ipChange.remove(C00151.this.$prerenderItem)) {
                            return;
                        }
                        com.taobao.android.riverlogger.e.a(RVLLevel.Info, "Themis/Performance/Prerender", "prerender webview expired");
                    }
                }, PrerenderManager$preRender$1.this.$params.e());
                RVLLevel rVLLevel = RVLLevel.Error;
                com.taobao.android.riverlogger.e.a(rVLLevel, "Themis/Performance/Prerender", "start preRendering, url: " + PrerenderManager$preRender$1.this.$params.a() + ", preRenderType: " + PrerenderManager$preRender$1.this.$params.b());
                PrerenderManager$preRender$1.this.$callback.mo2421invoke(true);
            }
        }

        @Override // tb.rul
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ t mo2421invoke(android.taobao.windvane.prerender.e eVar) {
            invoke2(eVar);
            return t.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(android.taobao.windvane.prerender.e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9986a37", new Object[]{this, eVar});
            } else if (eVar == null) {
                com.taobao.android.riverlogger.e.a(RVLLevel.Error, "Themis/Performance/Prerender", "failed to create prerender webview");
                PrerenderManager$preRender$1.this.$callback.mo2421invoke(false);
            } else {
                com.taobao.themis.kernel.utils.a.a(new C00151(eVar));
            }
        }
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void mo2427invoke() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        int i = j.commonConfig.f1565de;
        d dVar = d.INSTANCE;
        if (d.$ipChange.size() >= i) {
            com.taobao.android.riverlogger.e.a(RVLLevel.Error, "Themis/Performance/Prerender", "exceed prerender size limit");
            this.$callback.mo2421invoke(false);
            return;
        }
        d dVar2 = d.INSTANCE;
        Iterator it = d.$ipChange.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            e b = ((android.taobao.windvane.prerender.e) obj).b();
            if (b.c().a(b.a(), this.$params.a())) {
                break;
            }
        }
        if (((android.taobao.windvane.prerender.e) obj) != null) {
            com.taobao.android.riverlogger.e.a(RVLLevel.Info, "Themis/Performance/Prerender", "found existing prerender webview");
            this.$callback.mo2421invoke(false);
            return;
        }
        android.taobao.windvane.prerender.d.INSTANCE.a(this.$params, new AnonymousClass1());
    }
}
