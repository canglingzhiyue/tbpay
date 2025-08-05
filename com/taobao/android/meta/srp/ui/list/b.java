package com.taobao.android.meta.srp.ui.list;

import android.app.Activity;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.e;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.searchbaseframe.util.ListStyle;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.iru;
import tb.itb;
import tb.itd;
import tb.ium;
import tb.kge;

/* loaded from: classes6.dex */
public final class b extends itd<SrpStateCell, iru<? extends com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k[] f14281a;
    private static final itb.a h;
    private MetaState e;
    private SrpStateCell f;
    private final kotlin.d g;

    /* loaded from: classes6.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ SrpStateCell b;

        public c(SrpStateCell srpStateCell) {
            this.b = srpStateCell;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            com.taobao.android.meta.data.a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            SrpStateCell a2 = b.a(b.this);
            if (a2 == null || (aVar = a2.combo) == null) {
                return;
            }
            e<com.taobao.android.meta.data.a> j = aVar.j();
            if (j != null) {
                iru<? extends com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>> model = b.this.j();
                q.a((Object) model, "model");
                model.d().doNewSearch(aVar, j.d(), j.e());
                return;
            }
            iru<? extends com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>> model2 = b.this.j();
            q.a((Object) model2, "model");
            model2.d().doNewSearch(aVar, false, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ SrpStateCell b;

        public d(SrpStateCell srpStateCell) {
            this.b = srpStateCell;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            com.taobao.android.meta.data.a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            SrpStateCell a2 = b.a(b.this);
            if (a2 == null || (aVar = a2.combo) == null) {
                return;
            }
            e<com.taobao.android.meta.data.a> j = aVar.j();
            if (j != null) {
                iru<? extends com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>> model = b.this.j();
                q.a((Object) model, "model");
                model.d().doNewSearch(aVar, j.d(), j.e());
                return;
            }
            iru<? extends com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>> model2 = b.this.j();
            q.a((Object) model2, "model");
            model2.d().doNewSearch(aVar, false, null);
        }
    }

    private final com.taobao.android.meta.srp.ui.list.a c() {
        IpChange ipChange = $ipChange;
        return (com.taobao.android.meta.srp.ui.list.a) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("b03e7865", new Object[]{this}) : this.g.getValue());
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.itd
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "SrpListStateWidget";
    }

    public static final /* synthetic */ SrpStateCell a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SrpStateCell) ipChange.ipc$dispatch("adef9496", new Object[]{bVar}) : bVar.f;
    }

    public static final /* synthetic */ itb.a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itb.a) ipChange.ipc$dispatch("47d960e9", new Object[0]) : h;
    }

    /* loaded from: classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-380682823);
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

    /* renamed from: com.taobao.android.meta.srp.ui.list.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0552b implements itb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final C0552b INSTANCE = new C0552b();

        @Override // tb.ise
        public /* synthetic */ itd a(itb.b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("f42f608a", new Object[]{this, bVar}) : b(bVar);
        }

        public final b b(itb.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("bce2efe", new Object[]{this, bVar});
            }
            FrameLayout frameLayout = new FrameLayout(bVar.f29303a);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            Activity activity = bVar.f29303a;
            q.a((Object) activity, "cellWidgetParamsPack.activity");
            ium iumVar = bVar.b;
            q.a((Object) iumVar, "cellWidgetParamsPack.parent");
            ListStyle listStyle = bVar.d;
            q.a((Object) listStyle, "cellWidgetParamsPack.listStyle");
            return new b(frameLayout, activity, iumVar, listStyle, bVar.e, (iru) bVar.f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, Activity activity, ium parent, ListStyle style, int i, iru<? extends com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>> iruVar) {
        super(view, activity, parent, style, i, iruVar);
        q.c(view, "view");
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(style, "style");
        this.g = kotlin.e.a(new SrpListStateWidget$listStateView$2(iruVar, activity));
    }

    static {
        kge.a(-1342342223);
        f14281a = new k[]{t.a(new PropertyReference1Impl(t.b(b.class), "listStateView", "getListStateView()Lcom/taobao/android/meta/srp/ui/list/IMetaListStateView;"))};
        Companion = new a(null);
        h = C0552b.INSTANCE;
    }

    @Override // tb.itd
    public void a(int i, SrpStateCell bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d509d", new Object[]{this, new Integer(i), bean});
            return;
        }
        q.c(bean, "bean");
        View itemView = this.itemView;
        q.a((Object) itemView, "itemView");
        StaggeredGridLayoutManager.LayoutParams layoutParams = itemView.getLayoutParams();
        if (!(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            layoutParams = new StaggeredGridLayoutManager.LayoutParams(-1, -1);
        }
        ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        View itemView2 = this.itemView;
        q.a((Object) itemView2, "itemView");
        itemView2.setLayoutParams(layoutParams);
        com.taobao.android.meta.data.a it = bean.combo;
        if (it == null) {
            return;
        }
        View view = this.itemView;
        if (view == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        this.f = bean;
        if (this.e == it.k()) {
            return;
        }
        frameLayout.removeAllViews();
        int i2 = com.taobao.android.meta.srp.ui.list.c.$EnumSwitchMapping$0[it.k().ordinal()];
        if (i2 == 1) {
            frameLayout.addView(c().a());
        } else if (i2 == 2) {
            com.taobao.android.meta.srp.ui.list.a c2 = c();
            q.a((Object) it, "it");
            frameLayout.addView(c2.a(it, new c(bean)));
        } else if (i2 != 3) {
        } else {
            com.taobao.android.meta.srp.ui.list.a c3 = c();
            q.a((Object) it, "it");
            frameLayout.addView(c3.b(it, new d(bean)));
        }
    }
}
