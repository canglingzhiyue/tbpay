package com.taobao.search.searchdoor.activate.guess;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.e;
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
public final class b extends nqj<GuessDiscoveryCellBean, e> implements ium {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final itb.a f;

    /* renamed from: a  reason: collision with root package name */
    private ius<GuessDiscoveryCellBean, View, e> f19342a;
    private GuessDiscoveryCellBean e;
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
                b bVar = b.this;
                ius iusVar = this.b;
                if (iusVar == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.widget.ViewWidget<com.taobao.search.searchdoor.activate.guess.GuessDiscoveryCellBean, android.view.View, com.taobao.search.searchdoor.sf.widgets.SearchDoorModelAdapter>");
                }
                b.a(bVar, iusVar);
                ius a2 = b.a(b.this);
                if (a2 == null) {
                    q.a();
                }
                a2.attachToContainer();
                if (b.b(b.this) == null) {
                    return;
                }
                ius a3 = b.a(b.this);
                if (a3 == null) {
                    q.a();
                }
                a3.bindWithData(b.b(b.this));
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
            b.this.getActivity().runOnUiThread(new a(widget));
        }
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
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

    public static final /* synthetic */ ius a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ius) ipChange.ipc$dispatch("c266c459", new Object[]{bVar}) : bVar.f19342a;
    }

    public static final /* synthetic */ void a(b bVar, ius iusVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a71b11cf", new Object[]{bVar, iusVar});
        } else {
            bVar.f19342a = iusVar;
        }
    }

    public static final /* synthetic */ GuessDiscoveryCellBean b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GuessDiscoveryCellBean) ipChange.ipc$dispatch("45fe8fe6", new Object[]{bVar}) : bVar.e;
    }

    public static final /* synthetic */ itb.a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itb.a) ipChange.ipc$dispatch("47d960e9", new Object[0]) : f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, Activity activity, ium parent, e eVar) {
        super(view, activity, parent, eVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1115688908);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final itb.a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (itb.a) ipChange.ipc$dispatch("65fb974a", new Object[]{this}) : b.b();
        }
    }

    /* renamed from: com.taobao.search.searchdoor.activate.guess.b$b  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0778b implements itb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final C0778b INSTANCE = new C0778b();

        @Override // tb.ise
        public /* synthetic */ itd a(itb.b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("f42f608a", new Object[]{this, bVar}) : b(bVar);
        }

        public final b b(itb.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a25cf042", new Object[]{this, bVar});
            }
            FrameLayout frameLayout = new FrameLayout(bVar.f29303a);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            FrameLayout frameLayout2 = frameLayout;
            Activity activity = bVar.f29303a;
            q.a((Object) activity, "it.activity");
            ium iumVar = bVar.b;
            q.a((Object) iumVar, "it.parent");
            Object obj = bVar.f;
            if (obj != null) {
                return new b(frameLayout2, activity, iumVar, (e) obj);
            }
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.searchdoor.sf.widgets.SearchDoorModelAdapter");
        }
    }

    static {
        kge.a(-1344734228);
        kge.a(-1747045540);
        Companion = new a(null);
        f = C0778b.INSTANCE;
    }

    @Override // tb.nqj
    public void a(int i, GuessDiscoveryCellBean guessDiscoveryCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff12b30", new Object[]{this, new Integer(i), guessDiscoveryCellBean});
        } else if (guessDiscoveryCellBean == null) {
        } else {
            Activity activity = getActivity();
            if (!(activity instanceof tqn)) {
                activity = null;
            }
            tqn tqnVar = (tqn) activity;
            if (tqnVar != null) {
                tqnVar.D();
            }
            this.e = guessDiscoveryCellBean;
            if (this.f19342a == null && !this.g) {
                this.g = true;
                Activity activity2 = getActivity();
                q.a((Object) activity2, "activity");
                b bVar = this;
                MODEL j = j();
                View view = this.itemView;
                if (view == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                com.taobao.search.sf.remote.c.INSTANCE.a("guess_discover", new com.taobao.search.sf.remote.d(activity2, bVar, j, (ViewGroup) view, new d()), new c());
                return;
            }
            ius<GuessDiscoveryCellBean, View, e> iusVar = this.f19342a;
            if (iusVar == null) {
                return;
            }
            iusVar.bindWithData(this.e);
        }
    }

    /* loaded from: classes7.dex */
    public static final class d implements iur {
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

        public d() {
        }

        @Override // tb.iur
        public void a(View componentView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, componentView});
                return;
            }
            q.c(componentView, "componentView");
            ((ViewGroup) b.this.itemView).removeAllViews();
            ((ViewGroup) b.this.itemView).addView(componentView, new ViewGroup.LayoutParams(-1, -2));
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
        ius<GuessDiscoveryCellBean, View, e> iusVar = this.f19342a;
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
        ius<GuessDiscoveryCellBean, View, e> iusVar = this.f19342a;
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
        ius<GuessDiscoveryCellBean, View, e> iusVar = this.f19342a;
        if (iusVar == null) {
            return;
        }
        iusVar.onCtxDestroyInternal();
    }
}
