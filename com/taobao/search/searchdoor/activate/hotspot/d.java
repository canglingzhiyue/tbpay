package com.taobao.search.searchdoor.activate.hotspot;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.itb;
import tb.itd;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.kge;
import tb.nqj;
import tb.tqn;

/* loaded from: classes7.dex */
public final class d extends nqj<HotSpots, com.taobao.search.searchdoor.sf.widgets.e> implements ium {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final itb.a f;

    /* renamed from: a  reason: collision with root package name */
    private ius<HotSpots, View, com.taobao.search.searchdoor.sf.widgets.e> f19350a;
    private HotSpots e;
    private boolean g;

    /* loaded from: classes7.dex */
    public static final class c implements com.taobao.search.sf.remote.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes7.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ ius b;

            public a(ius iusVar) {
                this.b = iusVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                d dVar = d.this;
                ius iusVar = this.b;
                if (iusVar == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.widget.ViewWidget<com.taobao.search.searchdoor.activate.hotspot.HotSpots, android.view.View, com.taobao.search.searchdoor.sf.widgets.SearchDoorModelAdapter>");
                }
                d.a(dVar, iusVar);
                ius a2 = d.a(d.this);
                if (a2 == null) {
                    q.a();
                }
                a2.attachToContainer();
                if (d.b(d.this) == null) {
                    return;
                }
                ius a3 = d.a(d.this);
                if (a3 == null) {
                    q.a();
                }
                a3.bindWithData(d.b(d.this));
            }
        }

        public c() {
        }

        @Override // com.taobao.search.sf.remote.b
        public void a(ius<?, ? extends View, ?> widget) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee67ccb1", new Object[]{this, widget});
                return;
            }
            q.c(widget, "widget");
            d.this.getActivity().runOnUiThread(new a(widget));
        }
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 61439048) {
            super.A();
            return null;
        } else if (hashCode == 62362569) {
            super.B();
            return null;
        } else if (hashCode != 114079745) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.z();
            return null;
        }
    }

    public static final /* synthetic */ ius a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ius) ipChange.ipc$dispatch("6f6950d3", new Object[]{dVar}) : dVar.f19350a;
    }

    public static final /* synthetic */ void a(d dVar, ius iusVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a6a1495", new Object[]{dVar, iusVar});
        } else {
            dVar.f19350a = iusVar;
        }
    }

    public static final /* synthetic */ HotSpots b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HotSpots) ipChange.ipc$dispatch("b479c2bf", new Object[]{dVar}) : dVar.e;
    }

    public static final /* synthetic */ itb.a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itb.a) ipChange.ipc$dispatch("47d960e9", new Object[0]) : f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view, Activity activity, ium parent, com.taobao.search.searchdoor.sf.widgets.e eVar) {
        super(view, activity, parent, eVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-291469433);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final itb.a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (itb.a) ipChange.ipc$dispatch("65fb974a", new Object[]{this}) : d.b();
        }
    }

    /* loaded from: classes7.dex */
    public static final class b implements itb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // tb.ise
        public /* synthetic */ itd a(itb.b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("f42f608a", new Object[]{this, bVar}) : b(bVar);
        }

        public final d b(itb.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("e31c448", new Object[]{this, bVar});
            }
            FrameLayout frameLayout = new FrameLayout(bVar.f29303a);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            FrameLayout frameLayout2 = frameLayout;
            Activity activity = bVar.f29303a;
            q.a((Object) activity, "it.activity");
            ium iumVar = bVar.b;
            q.a((Object) iumVar, "it.parent");
            Object obj = bVar.f;
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.searchdoor.sf.widgets.SearchDoorModelAdapter");
            }
            return new d(frameLayout2, activity, iumVar, (com.taobao.search.searchdoor.sf.widgets.e) obj);
        }
    }

    static {
        kge.a(-1971581185);
        kge.a(-1747045540);
        Companion = new a(null);
        f = b.INSTANCE;
    }

    @Override // tb.nqj
    public void a(int i, HotSpots hotSpots) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7d818f", new Object[]{this, new Integer(i), hotSpots});
            return;
        }
        this.e = hotSpots;
        Activity activity = getActivity();
        if (!(activity instanceof tqn)) {
            activity = null;
        }
        tqn tqnVar = (tqn) activity;
        if (tqnVar != null) {
            tqnVar.D();
        }
        if (this.f19350a == null && !this.g) {
            this.g = true;
            Activity activity2 = getActivity();
            q.a((Object) activity2, "activity");
            d dVar = this;
            MODEL j = j();
            View view = this.itemView;
            if (view == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            com.taobao.search.sf.remote.c.INSTANCE.a("hotspot", new com.taobao.search.sf.remote.d(activity2, dVar, j, (ViewGroup) view, new C0780d()), new c());
            return;
        }
        ius<HotSpots, View, com.taobao.search.searchdoor.sf.widgets.e> iusVar = this.f19350a;
        if (iusVar == null) {
            return;
        }
        iusVar.bindWithData(this.e);
    }

    /* renamed from: com.taobao.search.searchdoor.activate.hotspot.d$d  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0780d implements iur {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.iur
        public void b(View componentView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91037249", new Object[]{this, componentView});
            } else {
                q.c(componentView, "componentView");
            }
        }

        public C0780d() {
        }

        @Override // tb.iur
        public void a(View componentView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, componentView});
                return;
            }
            q.c(componentView, "componentView");
            ((ViewGroup) d.this.itemView).removeAllViews();
            ((ViewGroup) d.this.itemView).addView(componentView, new ViewGroup.LayoutParams(-1, -2));
        }
    }

    @Override // tb.itd
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        super.A();
        ius<HotSpots, View, com.taobao.search.searchdoor.sf.widgets.e> iusVar = this.f19350a;
        if (iusVar == null) {
            return;
        }
        iusVar.onCtxResumeInternal();
    }

    @Override // tb.itd
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        super.z();
        ius<HotSpots, View, com.taobao.search.searchdoor.sf.widgets.e> iusVar = this.f19350a;
        if (iusVar == null) {
            return;
        }
        iusVar.onCtxPauseInternal();
    }

    @Override // tb.itd
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        super.B();
        ius<HotSpots, View, com.taobao.search.searchdoor.sf.widgets.e> iusVar = this.f19350a;
        if (iusVar == null) {
            return;
        }
        iusVar.onCtxDestroyInternal();
    }
}
