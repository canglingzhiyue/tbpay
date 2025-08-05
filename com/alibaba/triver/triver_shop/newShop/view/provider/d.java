package com.alibaba.triver.triver_shop.newShop.view.provider;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.remote.LoadConfig;
import com.taobao.appbundle.remote.view.RemoteLoadingView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.kge;
import tb.ruk;
import tb.rul;
import tb.rva;

/* loaded from: classes3.dex */
public final class d extends com.alibaba.triver.triver_shop.newShop.view.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f4012a;
    private final com.alibaba.triver.triver_shop.newShop.data.g b;
    private final ruk<com.alibaba.triver.triver_shop.newShop.view.h> c;
    private final rva<ruk<t>, ruk<t>, rul<? super Integer, t>, t> d;
    private final FrameLayout e;
    private com.alibaba.triver.triver_shop.newShop.view.h f;
    private final RemoteLoadingView g;
    private final ArrayList<Runnable> h;
    private boolean i;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.alibaba.triver.triver_shop.newShop.view.h e = d.e(d.this);
            if (e == null) {
                return;
            }
            e.c();
        }
    }

    static {
        kge.a(-1419429587);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 92838762) {
            super.c();
            return null;
        } else if (hashCode == 93762283) {
            super.d();
            return null;
        } else if (hashCode != 101150455) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.l());
        }
    }

    public static final /* synthetic */ void a(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece8be7b", new Object[]{dVar, new Integer(i)});
        } else {
            dVar.a(i);
        }
    }

    public static final /* synthetic */ void a(d dVar, com.alibaba.triver.triver_shop.newShop.view.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb1b913a", new Object[]{dVar, hVar});
        } else {
            dVar.f = hVar;
        }
    }

    public static final /* synthetic */ void a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece8fe4c", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.i = z;
        }
    }

    public static final /* synthetic */ void d(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3705470b", new Object[]{dVar});
        } else {
            dVar.o();
        }
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.newShop.view.h e(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.view.h) ipChange.ipc$dispatch("8035183e", new Object[]{dVar}) : dVar.f;
    }

    public static final /* synthetic */ void h(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20dbc90f", new Object[]{dVar});
        } else {
            dVar.a();
        }
    }

    public static final /* synthetic */ void i(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db516990", new Object[]{dVar});
        } else {
            dVar.n();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Context context, com.alibaba.triver.triver_shop.newShop.data.g tabBarItemDataModel, ruk<? extends com.alibaba.triver.triver_shop.newShop.view.h> targetContentRenderGetter, rva<? super ruk<t>, ? super ruk<t>, ? super rul<? super Integer, t>, t> initRemoteClassFunction) {
        super(context, tabBarItemDataModel);
        q.d(context, "context");
        q.d(tabBarItemDataModel, "tabBarItemDataModel");
        q.d(targetContentRenderGetter, "targetContentRenderGetter");
        q.d(initRemoteClassFunction, "initRemoteClassFunction");
        this.f4012a = context;
        this.b = tabBarItemDataModel;
        this.c = targetContentRenderGetter;
        this.d = initRemoteClassFunction;
        FrameLayout frameLayout = new FrameLayout(this.f4012a);
        frameLayout.setBackgroundColor(-1);
        t tVar = t.INSTANCE;
        this.e = frameLayout;
        this.g = new RemoteLoadingView(this.f4012a, new LoadConfig.a().a());
        this.h = new ArrayList<>();
        o.a(this.e, this.g);
        this.d.invoke(new RemoteClassDelegateContentRender$1(this), new RemoteClassDelegateContentRender$2(this), new RemoteClassDelegateContentRender$3(this));
    }

    private final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.g.updateProgress(i);
        }
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ceg.Companion.b("remote class init success");
        com.alibaba.triver.triver_shop.newShop.ext.b.b(new RemoteClassDelegateContentRender$remoteClassInitFinish$1(this));
    }

    private final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        ceg.Companion.b("remote class init failed");
        com.alibaba.triver.triver_shop.newShop.ext.b.b(new RemoteClassDelegateContentRender$remoteClassInitFailed$1(this));
    }

    private final void o() {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        Iterator<Runnable> it = this.h.iterator();
        while (it.hasNext()) {
            Runnable next = it.next();
            try {
                Result.a aVar = Result.Companion;
                next.run();
                m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
            }
            Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
            if (m2374exceptionOrNullimpl != null) {
                ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
            }
        }
        this.h.clear();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.e;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b
    public boolean l() {
        com.alibaba.triver.triver_shop.newShop.view.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        Boolean bool = null;
        if (this.f != null && (bVar = e.$ipChange) != null) {
            bool = Boolean.valueOf(bVar.l());
        }
        return bool == null ? super.l() : bool.booleanValue();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.view.h hVar = this.f;
        if (hVar == null) {
            return;
        }
        hVar.g();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.view.h hVar = this.f;
        if (hVar == null) {
            return;
        }
        hVar.e();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.view.h hVar = this.f;
        if (hVar == null) {
            return;
        }
        hVar.f();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        a aVar = new a();
        if (this.i) {
            aVar.run();
        } else {
            this.h.add(aVar);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        com.alibaba.triver.triver_shop.newShop.view.h hVar = this.f;
        if (hVar == null) {
            return;
        }
        hVar.d();
    }
}
