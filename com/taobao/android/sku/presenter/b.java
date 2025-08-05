package com.taobao.android.sku.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.pad.PadSkuFrameLayout;
import com.taobao.android.sku.presenter.c;
import com.taobao.android.sku.utils.n;
import com.taobao.android.sku.utils.o;
import com.taobao.android.sku.widget.HeightMutableFrameLayout;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends com.taobao.android.sku.presenter.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f15189a;
    public View b;
    public View c;
    public View d;
    public com.taobao.android.sku.widget.b e;
    public HeightMutableFrameLayout f;
    public TextView g;
    public TextView h;
    public View i;
    public a j;
    public boolean k;
    private List<e> l = new ArrayList();
    private View m;
    private View.OnClickListener n;
    public PadSkuFrameLayout o;
    public TextView p;
    private View.OnClickListener q;

    /* loaded from: classes6.dex */
    public interface a {
        void a(b bVar);
    }

    static {
        kge.a(549333395);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == 1514279453) {
            super.a((Map) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ View.OnClickListener b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("77e2882b", new Object[]{bVar}) : bVar.n;
    }

    public static /* synthetic */ View.OnClickListener c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("ab90b2ec", new Object[]{bVar}) : bVar.q;
    }

    public b(Context context) {
        this.f15189a = context;
        this.e = new com.taobao.android.sku.widget.b(context);
        i();
        com.taobao.android.sku.utils.e.a(context);
        s();
        v();
        t();
        u();
    }

    public b a(c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f15fc40c", new Object[]{this, aVar});
        }
        this.e.a(aVar);
        return this;
    }

    public b a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("64bf990b", new Object[]{this, aVar});
        }
        this.j = aVar;
        return this;
    }

    public b a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("71dd5d3e", new Object[]{this, onClickListener});
        }
        this.n = onClickListener;
        return this;
    }

    public void b(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04fabb0", new Object[]{this, onClickListener});
        } else {
            this.q = onClickListener;
        }
    }

    public void a(float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c10357c", new Object[]{this, new Float(f), new Boolean(z)});
            return;
        }
        HeightMutableFrameLayout heightMutableFrameLayout = this.f;
        if (heightMutableFrameLayout != null) {
            heightMutableFrameLayout.shrinkHeight(f, z);
            return;
        }
        PadSkuFrameLayout padSkuFrameLayout = this.o;
        if (padSkuFrameLayout == null) {
            return;
        }
        padSkuFrameLayout.shrinkHeight(f, z);
    }

    public void i() {
        View view;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.b = LayoutInflater.from(this.f15189a).inflate(com.taobao.android.sku.pad.b.INSTANCE.a(this.f15189a) ? R.layout.xsku_layout_pad : R.layout.xsku_layout, (ViewGroup) null);
        this.c = this.b.findViewById(R.id.alix_loading_container);
        this.d = this.b.findViewById(R.id.fm_sku_content);
        View view2 = this.c;
        if (n.a()) {
            i = 8;
        }
        view2.setVisibility(i);
        if (!com.taobao.android.sku.pad.b.INSTANCE.a(this.f15189a)) {
            this.m = this.b.findViewById(R.id.view_top_empty_holder);
            this.f = (HeightMutableFrameLayout) this.b.findViewById(R.id.content_container);
            this.f.setRelationView(this.m);
            view = this.f;
        } else {
            this.o = (PadSkuFrameLayout) this.b.findViewById(R.id.content_container);
            view = this.o;
        }
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.sku.presenter.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                } else if (b.b(b.this) == null) {
                } else {
                    b.b(b.this).onClick(view3);
                }
            }
        });
        view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.sku.presenter.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                }
            }
        });
        a(new View.OnClickListener() { // from class: com.taobao.android.sku.presenter.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                } else if (!b.this.e.a()) {
                } else {
                    b.this.e.c();
                }
            }
        });
    }

    private void s() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        this.i = this.b.findViewById(R.id.debug_container);
        View view = this.i;
        if (!com.taobao.android.sku.utils.e.a()) {
            i = 8;
        }
        view.setVisibility(i);
        this.h = (TextView) this.b.findViewById(R.id.tv_auto_test);
        this.g = (TextView) this.b.findViewById(R.id.tv_js_engine);
        this.h.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.android.sku.presenter.b.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view2})).booleanValue();
                }
                b bVar = b.this;
                bVar.k = true;
                bVar.h.setTextColor(2147418112);
                b.this.h.setText("D_Replay");
                return false;
            }
        });
        this.p = (TextView) this.b.findViewById(R.id.tv_downgrade);
        this.p.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.sku.presenter.b.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else if (b.c(b.this) == null) {
                } else {
                    b.c(b.this).onClick(view2);
                }
            }
        });
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else {
            l().setLayoutManager(new LinearLayoutManager(this.f15189a));
        }
    }

    private void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else {
            this.e.a(new e() { // from class: com.taobao.android.sku.presenter.b.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.sku.presenter.e
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        b.this.o();
                    }
                }

                @Override // com.taobao.android.sku.presenter.e
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        b.this.p();
                    }
                }

                @Override // com.taobao.android.sku.presenter.e
                public void c() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                    } else {
                        b.this.q();
                    }
                }

                @Override // com.taobao.android.sku.presenter.e
                public void d() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("596b2eb", new Object[]{this});
                    } else {
                        b.this.r();
                    }
                }
            });
        }
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.sku.presenter.b.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                }
            }
        });
        this.c.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.android.sku.presenter.b.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                return true;
            }
        });
    }

    @Override // com.taobao.android.sku.presenter.d
    public LinearLayout j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("d298cdc8", new Object[]{this}) : (LinearLayout) this.b.findViewById(R.id.header);
    }

    @Override // com.taobao.android.sku.presenter.d
    public LinearLayout k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("507089c9", new Object[]{this}) : (LinearLayout) this.b.findViewById(R.id.footer);
    }

    @Override // com.taobao.android.sku.presenter.d
    public RecyclerView l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("56522e71", new Object[]{this});
        }
        RecyclerView recyclerView = (RecyclerView) this.b.findViewById(R.id.body);
        a(recyclerView);
        return recyclerView;
    }

    public void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
            return;
        }
        try {
            recyclerView.getItemAnimator().setAddDuration(0L);
            recyclerView.getItemAnimator().setChangeDuration(0L);
            recyclerView.getItemAnimator().setMoveDuration(0L);
            recyclerView.getItemAnimator().setRemoveDuration(0L);
            ((SimpleItemAnimator) recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.android.sku.presenter.d
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        Context context = this.f15189a;
        if (context == null) {
            return;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing()) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
                return;
            }
        }
        if (this.e.a()) {
            return;
        }
        w();
        this.e.a(R.style.Alix_Sku_PopupDialog);
        this.e.a(this.b);
        this.e.a(-1, -1, 80, 0, 0, R.style.Alix_Sku_PopupDialog_Animation);
        try {
            this.e.b();
        } catch (Throwable th) {
            o.a(o.DEFAULT_BIZ_NAME, o.UM_SHOW_PRESENTER_E, "showError: " + th.toString());
        }
        this.e.a(new DialogInterface.OnDismissListener() { // from class: com.taobao.android.sku.presenter.b.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                } else if (b.this.j == null) {
                } else {
                    b.this.j.a(b.this);
                }
            }
        });
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).removeView(this.b);
    }

    @Override // com.taobao.android.sku.presenter.d
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (!this.e.a()) {
        } else {
            try {
                this.e.c();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.taobao.android.sku.presenter.a
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        super.a(map);
        if (map == null || map.isEmpty() || !map.containsKey("engineType")) {
            return;
        }
        this.g.setText(map.get("engineType"));
    }

    @Override // com.taobao.android.sku.presenter.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // com.taobao.android.sku.presenter.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.taobao.android.sku.presenter.a
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.e.a();
    }

    @Override // com.taobao.android.sku.presenter.a
    public LinearLayout e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("5d6221c3", new Object[]{this}) : (LinearLayout) this.b.findViewById(R.id.native_content_view);
    }

    @Override // com.taobao.android.sku.presenter.a
    public LinearLayout f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("db39ddc4", new Object[]{this}) : (LinearLayout) this.b.findViewById(R.id.h5_content_view);
    }

    @Override // com.taobao.android.sku.presenter.a
    public LinearLayout g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("591199c5", new Object[]{this}) : (LinearLayout) this.b.findViewById(R.id.weex_content_view);
    }

    @Override // com.taobao.android.sku.presenter.a
    public LinearLayout h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("d6e955c6", new Object[]{this}) : (LinearLayout) this.b.findViewById(R.id.sku3_content_view);
    }

    @Override // com.taobao.android.sku.presenter.a
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de48d75e", new Object[]{this, eVar});
        } else if (eVar == null) {
        } else {
            this.l.add(eVar);
        }
    }

    public void a(b bVar) {
        List<e> list;
        List<e> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de477a41", new Object[]{this, bVar});
        } else if (bVar == null || bVar == this || (list = bVar.l) == null || list.isEmpty() || (list2 = this.l) == null || !list2.isEmpty()) {
        } else {
            this.l.addAll(bVar.l);
            bVar.l.clear();
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        for (e eVar : this.l) {
            eVar.a();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        for (e eVar : this.l) {
            eVar.b();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        for (e eVar : this.l) {
            eVar.c();
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        for (e eVar : this.l) {
            eVar.d();
        }
    }
}
