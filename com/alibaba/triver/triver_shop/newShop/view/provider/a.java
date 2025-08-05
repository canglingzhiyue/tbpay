package com.alibaba.triver.triver_shop.newShop.view.provider;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.data.NativeShopRenderContainerType;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.ext.l;
import com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender;
import com.alibaba.triver.triver_shop.newShop.view.NewMiniAppContentRender;
import com.alibaba.triver.triver_shop.newShop.view.Tab3LiveContentRender;
import com.alibaba.triver.triver_shop.newShop.view.n;
import com.alibaba.triver.triver_shop.newShop.view.r;
import com.alibaba.triver.triver_shop.newShop.view.s;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Result;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.cel;
import tb.kge;

/* loaded from: classes3.dex */
public class a implements cel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.alibaba.triver.triver_shop.newShop.data.g f4008a;
    private com.alibaba.triver.triver_shop.newShop.view.h b;
    private boolean c;

    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.provider.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0147a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            kge.a(1720507985);
            int[] iArr = new int[NativeShopRenderContainerType.values().length];
            iArr[NativeShopRenderContainerType.TYPE_LIVE.ordinal()] = 1;
            iArr[NativeShopRenderContainerType.TYPE_ALL_ITEMS.ordinal()] = 2;
            iArr[NativeShopRenderContainerType.TYPE_WEEX_V2.ordinal()] = 3;
            iArr[NativeShopRenderContainerType.TYPE_WEEX.ordinal()] = 4;
            iArr[NativeShopRenderContainerType.TYPE_H5.ordinal()] = 5;
            iArr[NativeShopRenderContainerType.TYPE_SUBSCRIBE.ordinal()] = 6;
            iArr[NativeShopRenderContainerType.TYPE_MINI_APP.ordinal()] = 7;
            iArr[NativeShopRenderContainerType.TYPE_WIDGET.ordinal()] = 8;
            iArr[NativeShopRenderContainerType.TYPE_WEEX_V2_WIDGET.ordinal()] = 9;
            iArr[NativeShopRenderContainerType.TYPE_UNKNOWN.ordinal()] = 10;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        kge.a(-601649166);
        kge.a(1635811568);
    }

    public a(com.alibaba.triver.triver_shop.newShop.data.g gVar) {
        this.f4008a = gVar;
    }

    @Override // tb.cel
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            cel.a.a(this, i);
        }
    }

    @Override // tb.cel
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : cel.a.a(this);
    }

    @Override // tb.cel
    public View a(Context context, Fragment outerFragment) {
        Object m2371constructorimpl;
        d.i bt;
        com.alibaba.triver.triver_shop.newShop.data.d g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1bb42014", new Object[]{this, context, outerFragment});
        }
        q.d(outerFragment, "outerFragment");
        if (context == null) {
            return null;
        }
        com.alibaba.triver.triver_shop.newShop.data.g gVar = this.f4008a;
        if (gVar == null) {
            return new FrameLayout(context);
        }
        NativeShopRenderContainerType m = gVar.m();
        if (q.a((Object) this.f4008a.f(), (Object) "dongtai")) {
            m = NativeShopRenderContainerType.TYPE_SUBSCRIBE;
        }
        switch (C0147a.$EnumSwitchMapping$0[m.ordinal()]) {
            case 1:
                this.b = new Tab3LiveContentRender(context, this.f4008a, false, 4, null);
                break;
            case 2:
                com.alibaba.triver.triver_shop.newShop.data.d g2 = this.f4008a.g();
                com.alibaba.triver.triver_shop.newShop.view.a a2 = (g2 == null || (bt = g2.bt()) == null) ? null : bt.a();
                if (a2 != null) {
                    com.alibaba.triver.triver_shop.newShop.data.d g3 = this.f4008a.g();
                    d.i bt2 = g3 == null ? null : g3.bt();
                    if (bt2 != null) {
                        bt2.a(null);
                    }
                }
                if (a2 == null) {
                    a2 = new com.alibaba.triver.triver_shop.newShop.view.a(context, this.f4008a);
                }
                this.b = a2;
                break;
            case 3:
                this.b = new r(context, this.f4008a);
                break;
            case 4:
                this.b = new com.alibaba.triver.triver_shop.newShop.view.q(this.f4008a, context);
                break;
            case 5:
                com.alibaba.triver.triver_shop.newShop.data.g gVar2 = this.f4008a;
                this.b = new com.alibaba.triver.triver_shop.newShop.view.g(gVar2, gVar2.h(), context, false, 8, null);
                break;
            case 6:
                try {
                    Result.a aVar = Result.Companion;
                    this.b = new n(this.f4008a, context);
                    m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
                } catch (Throwable th) {
                    Result.a aVar2 = Result.Companion;
                    m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
                }
                Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
                if (m2374exceptionOrNullimpl != null) {
                    ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
                } else {
                    m2374exceptionOrNullimpl = null;
                }
                if (m2374exceptionOrNullimpl != null) {
                    ceg.Companion.b("create subscribe content view failed");
                    break;
                }
                break;
            case 7:
                if (this.f4008a.p()) {
                    this.b = new d(context, this.f4008a, new DefaultFragmentViewProvider$getFragmentView$3(this, context, outerFragment), new DefaultFragmentViewProvider$getFragmentView$4(this, context));
                    break;
                } else if (!l.e()) {
                    com.alibaba.triver.triver_shop.newShop.data.g gVar3 = this.f4008a;
                    this.b = new com.alibaba.triver.triver_shop.newShop.view.g(gVar3, gVar3.l(), context, true);
                    ceg.Companion.b("mini app sdk not init ,downgrade to h5");
                    if (this.f4008a.o() && (g = this.f4008a.g()) != null) {
                        g.b("shopIndexDowngradeByRemoteTRiver", (Object) true);
                        break;
                    }
                } else {
                    this.b = a(this.f4008a, context, outerFragment);
                    break;
                }
                break;
            case 8:
                this.b = new d(context, this.f4008a, new DefaultFragmentViewProvider$getFragmentView$5(context, this), new DefaultFragmentViewProvider$getFragmentView$6(this, context));
                break;
            case 9:
                this.b = new s(context, this.f4008a);
                break;
        }
        if (this.c) {
            e();
        }
        com.alibaba.triver.triver_shop.newShop.view.h hVar = this.b;
        if (hVar != null) {
            return hVar.b();
        }
        return null;
    }

    @Override // tb.cel
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.view.h hVar = this.b;
        if (hVar != null) {
            hVar.g();
        }
        this.b = null;
    }

    @Override // tb.cel
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        cel.a.b(this);
        com.alibaba.triver.triver_shop.newShop.view.h hVar = this.b;
        if (hVar == null) {
            return;
        }
        hVar.e();
    }

    @Override // tb.cel
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        cel.a.c(this);
        com.alibaba.triver.triver_shop.newShop.view.h hVar = this.b;
        if (hVar == null) {
            return;
        }
        hVar.f();
    }

    @Override // tb.cel
    public void e() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        cel.a.d(this);
        com.alibaba.triver.triver_shop.newShop.view.h hVar = this.b;
        if (hVar != null) {
            hVar.c();
        }
        if (this.b == null) {
            z = true;
        }
        this.c = z;
    }

    @Override // tb.cel
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        cel.a.e(this);
        com.alibaba.triver.triver_shop.newShop.view.h hVar = this.b;
        if (hVar != null) {
            hVar.d();
        }
        this.c = false;
    }

    public final com.alibaba.triver.triver_shop.newShop.view.h g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.view.h) ipChange.ipc$dispatch("dc5b2ea0", new Object[]{this}) : this.b;
    }

    private final com.alibaba.triver.triver_shop.newShop.view.h a(com.alibaba.triver.triver_shop.newShop.data.g gVar, Context context, Fragment fragment) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.newShop.view.h) ipChange.ipc$dispatch("a26afc32", new Object[]{this, gVar, context, fragment});
        }
        com.alibaba.triver.triver_shop.newShop.data.d g = gVar.g();
        if (!(g != null && g.s())) {
            com.alibaba.triver.triver_shop.newShop.data.d g2 = gVar.g();
            if (g2 != null && g2.t()) {
                z = true;
            }
            if (!z) {
                return new MiniAppShopContentRender(gVar, context, fragment);
            }
        }
        return new NewMiniAppContentRender(gVar, context, fragment);
    }
}
