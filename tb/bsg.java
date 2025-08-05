package tb;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.android.aura.service.render.widget.roundcornerlayout.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ag;
import java.util.ArrayList;
import java.util.List;
import tb.bse;

/* loaded from: classes2.dex */
public abstract class bsg implements bsh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public bse.b f26095a;
    public bse.a b;
    public ViewGroup c;
    private final String d = "AbsNUTFloatViewsAssembler";
    private View e;
    private b f;
    private List<bsi> g;

    static {
        kge.a(921441364);
        kge.a(-1631656629);
    }

    @Override // tb.bsh
    public abstract ViewGroup a(Context context);

    public abstract void a(ViewGroup viewGroup, View view, View view2, ViewGroup.MarginLayoutParams marginLayoutParams, bsq bsqVar);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public bsg() {
        l();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        List<bsi> e = e();
        if (bau.a(e)) {
            return;
        }
        for (bsi bsiVar : e) {
            a(bsiVar);
        }
    }

    @Override // tb.bsh
    public void a(bse.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a3d347", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    @Override // tb.bsh
    public void a(bse.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a447a6", new Object[]{this, bVar});
        } else {
            this.f26095a = bVar;
        }
    }

    public void a(bsi bsiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25525a0", new Object[]{this, bsiVar});
            return;
        }
        if (this.g == null) {
            this.g = new ArrayList();
        }
        if (this.g.contains(bsiVar)) {
            return;
        }
        this.g.add(bsiVar);
    }

    public List<bsi> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fd625b", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new bsj());
        return arrayList;
    }

    @Override // tb.bsh
    public final View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            return viewGroup.findViewById(k());
        }
        return null;
    }

    @Override // tb.bsh
    public final b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("fd098cb3", new Object[]{this});
        }
        if (this.f == null) {
            ViewGroup viewGroup = this.c;
            this.f = viewGroup == null ? null : (b) viewGroup.findViewById(i());
        }
        return this.f;
    }

    public final View f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8c57b8ef", new Object[]{this}) : this.e;
    }

    public ViewGroup g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("315764e7", new Object[]{this}) : (ViewGroup) this.c.findViewById(j());
    }

    @Override // tb.bsh
    public void a(View view, bsq bsqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5101d9a", new Object[]{this, view, bsqVar});
            return;
        }
        this.e = view;
        ViewGroup viewGroup = this.c;
        if (viewGroup == null) {
            viewGroup = a(view.getContext());
        }
        ViewGroup g = g();
        a(g, view);
        b(view, bsqVar);
        a(viewGroup, g, view, bsqVar);
        a(b(), bsqVar.c(), bsqVar);
        a(viewGroup);
    }

    private void b(final View view, final bsq bsqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d405d79", new Object[]{this, view, bsqVar});
        } else {
            a(new aqx<bsi, Void>() { // from class: tb.bsg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqx
                public Void a(bsi bsiVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("4199b75d", new Object[]{this, bsiVar});
                    }
                    bsiVar.a(view, bsqVar);
                    return null;
                }
            });
        }
    }

    private void a(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39d30cb", new Object[]{this, viewGroup, view});
            return;
        }
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        if (-1 != viewGroup.indexOfChild(view)) {
            return;
        }
        a(view);
        viewGroup.addView(view);
    }

    private void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        m();
        b(viewGroup);
    }

    private void b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3684528", new Object[]{this, viewGroup});
        } else {
            viewGroup.findViewById(h()).setOnClickListener(new View.OnClickListener() { // from class: tb.bsg.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        bsg.this.a(false);
                    }
                }
            });
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        View a2 = a();
        if (a2 == null) {
            return;
        }
        a2.setOnClickListener(new View.OnClickListener() { // from class: tb.bsg.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    bsg.this.a(false);
                }
            }
        });
    }

    private void a(final ViewGroup viewGroup, final ViewGroup viewGroup2, final View view, final bsq bsqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e2035c", new Object[]{this, viewGroup, viewGroup2, view, bsqVar});
        } else {
            viewGroup2.post(new Runnable() { // from class: tb.bsg.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup2.getLayoutParams();
                    bsg.this.a(viewGroup, view, viewGroup2, marginLayoutParams, bsqVar);
                    viewGroup2.setLayoutParams(marginLayoutParams);
                }
            });
        }
    }

    private void a(b bVar, String str, bsq bsqVar) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0853108", new Object[]{this, bVar, str, bsqVar});
        } else if (!(bVar instanceof View)) {
        } else {
            int i = -1;
            if (!TextUtils.isEmpty(str)) {
                try {
                    i = Color.parseColor(str);
                } catch (IllegalArgumentException e) {
                    ard a2 = arc.a();
                    a2.c("AbsNUTFloatViewsAssembler", "updateBackgroundColor", ag.ARG_TAOKE_ERROR + e.getMessage());
                }
            }
            ((View) bVar).setBackgroundColor(i);
            g().setBackgroundColor(i);
            Float f = bsqVar.f();
            if (f == null) {
                bVar.setRadius(bay.a(27.0f));
            } else {
                bVar.setRadius(f.floatValue());
            }
            if (bsqVar.i() || (viewGroup = this.c) == null) {
                return;
            }
            viewGroup.findViewById(h()).setVisibility(8);
        }
    }

    public final void a(aqx<bsi, Void> aqxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e08aef90", new Object[]{this, aqxVar});
            return;
        }
        List<bsi> list = this.g;
        if (list == null) {
            return;
        }
        for (bsi bsiVar : list) {
            aqxVar.a(bsiVar);
        }
    }

    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        bse.a aVar = this.b;
        if (aVar != null && aVar.a()) {
            return true;
        }
        b(z);
        return false;
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        bse.b bVar = this.f26095a;
        if (bVar == null) {
            return;
        }
        bVar.a(z);
    }

    @Override // tb.bsh
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : a(false);
    }

    @Override // tb.bsh
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        a((View) this.c);
        a(this.e);
    }

    public final void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) parent).removeViewInLayout(view);
        }
    }
}
