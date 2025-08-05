package com.taobao.themis.ability.basic.lifecycle;

import com.alibaba.ability.result.a$a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsLifeCycleAbility;
import com.taobao.android.abilityidl.ability.LifeCyclePageLifeCycleEventParams;
import com.taobao.android.abilityidl.ability.by;
import com.taobao.themis.kernel.page.ITMSPage;
import com.uc.webview.export.media.MessageID;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.als;
import tb.gml;
import tb.kge;
import tb.qqa;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/ability/basic/lifecycle/TMSLifeCycleAbility;", "Lcom/taobao/android/abilityidl/ability/AbsLifeCycleAbility;", "()V", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/taobao/themis/kernel/page/ITMSPage$LifeCycleListener;", "addPageLifeCycleListener", "", "context", "Lcom/alibaba/ability/env/IAbilityContext;", "callback", "Lcom/taobao/android/abilityidl/ability/ILifeCyclePageLifeCycleEvents;", MessageID.onDestroy, "removePageLifeCycleListener", "Lcom/taobao/android/abilityidl/callback/IAbilityCallback;", "themis_ability_basic_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSLifeCycleAbility extends AbsLifeCycleAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArraySet<qqa.b> f22290a = new CopyOnWriteArraySet<>();

    static {
        kge.a(-417805287);
    }

    public static /* synthetic */ Object ipc$super(TMSLifeCycleAbility tMSLifeCycleAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLifeCycleAbility
    public void addPageLifeCycleListener(als context, by callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e3315b", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        if (com.taobao.themis.kernel.utils.a.b(context) == null) {
            callback.a(a$a.f(null));
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d(null));
            return;
        }
        a aVar = new a(callback);
        this.f22290a.add(aVar);
        a2.a(aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/taobao/themis/ability/basic/lifecycle/TMSLifeCycleAbility$addPageLifeCycleListener$listener$1", "Lcom/taobao/themis/kernel/page/ITMSPage$LifeCycleListener;", "onPause", "", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "onResume", "onViewAppear", "onViewDisappear", "themis_ability_basic_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements qqa.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ by f22291a;

        public a(by byVar) {
            this.f22291a = byVar;
        }

        @Override // tb.qqa.b
        public void e(ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d79c17", new Object[]{this, page});
                return;
            }
            q.d(page, "page");
            qqa.b.a.a(this, page);
        }

        @Override // tb.qqa.b
        public void f(ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("785e98", new Object[]{this, page});
                return;
            }
            q.d(page, "page");
            qqa.b.a.b(this, page);
        }

        @Override // tb.qqa.b
        public void a(ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb549213", new Object[]{this, page});
                return;
            }
            q.d(page, "page");
            by byVar = this.f22291a;
            LifeCyclePageLifeCycleEventParams lifeCyclePageLifeCycleEventParams = new LifeCyclePageLifeCycleEventParams();
            lifeCyclePageLifeCycleEventParams.pageId = page.c().e().a();
            t tVar = t.INSTANCE;
            byVar.a(lifeCyclePageLifeCycleEventParams);
        }

        @Override // tb.qqa.b
        public void b(ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95f55494", new Object[]{this, page});
                return;
            }
            q.d(page, "page");
            by byVar = this.f22291a;
            LifeCyclePageLifeCycleEventParams lifeCyclePageLifeCycleEventParams = new LifeCyclePageLifeCycleEventParams();
            lifeCyclePageLifeCycleEventParams.pageId = page.c().e().a();
            t tVar = t.INSTANCE;
            byVar.b(lifeCyclePageLifeCycleEventParams);
        }

        @Override // tb.qqa.b
        public void c(ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30961715", new Object[]{this, page});
                return;
            }
            q.d(page, "page");
            qqa.b.a.c(this, page);
            a(page);
        }

        @Override // tb.qqa.b
        public void d(ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb36d996", new Object[]{this, page});
                return;
            }
            q.d(page, "page");
            qqa.b.a.d(this, page);
            b(page);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLifeCycleAbility
    public void removePageLifeCycleListener(als context, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57129c64", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        if (com.taobao.themis.kernel.utils.a.b(context) == null) {
            callback.a(a$a.f(null));
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d(null));
            return;
        }
        for (qqa.b listener : this.f22290a) {
            q.b(listener, "listener");
            a2.b(listener);
        }
    }

    @Override // com.taobao.android.abilityidl.b, com.taobao.android.abilityidl.c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}
