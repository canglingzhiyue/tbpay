package com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.a;
import com.alibaba.android.aura.service.render.widget.roundcornerlayout.UMFRoundCornerLayout;
import com.alibaba.android.aura.service.render.widget.roundcornerlayout.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.ami;
import tb.atq;
import tb.bay;
import tb.bqd;
import tb.bqe;
import tb.bqw;
import tb.bse;
import tb.bsh;
import tb.bsq;
import tb.bsr;
import tb.dkq;
import tb.kge;

@Deprecated
/* loaded from: classes2.dex */
public class a implements bsh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f2875a = "NUTFloatViewsAssembler";
    private bse.b b;
    private bse.a c;
    private View d;
    private UMFRoundCornerLayout e;
    private FrameLayout f;
    private View g;
    private FrameLayout h;
    private View i;
    private Context j;

    static {
        kge.a(-1435785775);
        kge.a(-1631656629);
    }

    @Override // tb.bsh
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac1c3048", new Object[]{aVar});
        } else {
            aVar.g();
        }
    }

    public static /* synthetic */ bse.a b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bse.a) ipChange.ipc$dispatch("bd01f7ee", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ bse.b c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bse.b) ipChange.ipc$dispatch("68674e", new Object[]{aVar}) : aVar.b;
    }

    @Override // tb.bsh
    public void a(bse.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a3d347", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    @Override // tb.bsh
    public void a(bse.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a447a6", new Object[]{this, bVar});
        } else {
            this.b = bVar;
        }
    }

    @Override // tb.bsh
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.d;
    }

    @Override // tb.bsh
    public b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("fd098cb3", new Object[]{this}) : this.e;
    }

    @Override // tb.bsh
    public ViewGroup a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("d01cc9b5", new Object[]{this, context});
        }
        this.j = context;
        FrameLayout frameLayout = this.f;
        if (frameLayout == null) {
            this.f = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.umf_float_view_layout, (ViewGroup) null);
            this.d = this.f.findViewById(R.id.umfFloatViewLayoutBackgroundMask);
            this.e = (UMFRoundCornerLayout) this.f.findViewById(R.id.umfFloatViewLayoutContentWrapper);
            this.g = this.f.findViewById(R.id.umfFloatViewLayoutClose);
            this.h = (FrameLayout) this.f.findViewById(R.id.umfFloatViewLayoutContentPlaceholder);
            this.f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            a(frameLayout);
        }
        return this.f;
    }

    @Override // tb.bsh
    public void a(View view, bsq bsqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5101d9a", new Object[]{this, view, bsqVar});
            return;
        }
        this.i = view;
        b(view, bsqVar);
        if (this.f == null) {
            a(view.getContext());
        }
        c(view, bsqVar);
        a(bsqVar);
        f();
        e();
    }

    @Override // tb.bsh
    public void b(bsq bsqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0dbcf19", new Object[]{this, bsqVar});
        } else {
            a(bsqVar);
        }
    }

    private void b(View view, bsq bsqVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d405d79", new Object[]{this, view, bsqVar});
        } else if (!(view instanceof RecyclerView)) {
        } else {
            RecyclerView.Adapter adapter = ((RecyclerView) view).getAdapter();
            AURARenderComponent aURARenderComponent = null;
            if (adapter instanceof bqw) {
                aURARenderComponent = ((bqw) adapter).a(0);
            } else if (adapter instanceof atq) {
                aURARenderComponent = ((atq) adapter).a(0);
            }
            if (aURARenderComponent != null && aURARenderComponent.data != null && aURARenderComponent.data.container != null && a.b.b.equals(aURARenderComponent.data.container.containerType)) {
                z = true;
            }
            if (1 != adapter.getItemCount() || !z) {
                return;
            }
            bsqVar.c(0.0f);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.g.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        a.a(a.this);
                    }
                }
            });
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        a.a(a.this);
                    }
                }
            });
        }
    }

    private void a(bsq bsqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e258c898", new Object[]{this, bsqVar});
            return;
        }
        Float f = bsqVar.f();
        if (f == null) {
            this.e.setRadius(bay.a(27.0f));
        } else {
            this.e.setRadius(f.floatValue());
        }
        a(this.e, bsqVar.d());
        a(this.e);
        a(this.e, bsqVar.c(), -1);
        a(bsqVar.i());
    }

    private void a(UMFRoundCornerLayout uMFRoundCornerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd153281", new Object[]{this, uMFRoundCornerLayout});
        } else if (!ami.b(this.j) || ami.c(this.j)) {
            uMFRoundCornerLayout.setGestureHandler(null);
        } else {
            dkq dkqVar = new dkq();
            final int i = uMFRoundCornerLayout.getLayoutParams().width;
            dkqVar.a(i, i);
            dkqVar.a(new dkq.a() { // from class: com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dkq.a
                public void a(float f) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
                    } else {
                        a(i, f);
                    }
                }

                @Override // tb.dkq.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if ((a.b(a.this) != null && a.b(a.this).a()) || a.c(a.this) == null) {
                    } else {
                        a.c(a.this).a(true);
                    }
                }

                private void a(float f, float f2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
                        return;
                    }
                    View a2 = a.this.a();
                    if (a2 == null) {
                        return;
                    }
                    Drawable background = a2.getBackground();
                    background.mutate();
                    if (f2 == 0.0f) {
                        background.setAlpha(255);
                    } else {
                        background.setAlpha(Math.min(255, Math.max(0, (int) ((1.0f - Math.abs(f2 / f)) * 255))));
                    }
                }
            });
            uMFRoundCornerLayout.setGestureHandler(dkqVar);
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.g.setVisibility(0);
        } else {
            this.g.setVisibility(8);
        }
    }

    private void a(View view, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("615882cf", new Object[]{this, view, str, new Integer(i)});
        } else if (view == null) {
        } else {
            if (!TextUtils.isEmpty(str)) {
                try {
                    i = Color.parseColor(str);
                } catch (IllegalArgumentException e) {
                    bqd a2 = bqe.a();
                    a2.c("NUTFloatViewsAssembler", "updateBackgroundColor#error=" + e.getMessage());
                }
            }
            view.setBackgroundColor(i);
        }
    }

    private void a(View view, bsr bsrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51091f9", new Object[]{this, view, bsrVar});
        } else if (bsrVar == null || view == null) {
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                bqd a2 = bqe.a();
                a2.c("NUTFloatViewsAssembler", "updateLayoutParamsMargins#layoutParams of view[" + view.getClass().getSimpleName() + "]is not ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (bsrVar.e() != 0) {
                marginLayoutParams.width = bsrVar.e();
            }
            if (marginLayoutParams.topMargin == bsrVar.b() && marginLayoutParams.leftMargin == bsrVar.a() && marginLayoutParams.bottomMargin == bsrVar.d() && marginLayoutParams.rightMargin == bsrVar.c()) {
                return;
            }
            marginLayoutParams.topMargin = bsrVar.b();
            marginLayoutParams.bottomMargin = bsrVar.d();
            marginLayoutParams.leftMargin = bsrVar.a();
            marginLayoutParams.rightMargin = bsrVar.c();
        }
    }

    private void c(View view, bsq bsqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15709d58", new Object[]{this, view, bsqVar});
            return;
        }
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        FrameLayout frameLayout = this.h;
        if (frameLayout == null || -1 != frameLayout.indexOfChild(view)) {
            return;
        }
        a(view);
        this.h.addView(view);
    }

    @Override // tb.bsh
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        a(this.f);
        a(this.i);
    }

    private void a(View view) {
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

    private void g() {
        bse.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        bse.a aVar = this.c;
        if ((aVar != null && aVar.a()) || (bVar = this.b) == null) {
            return;
        }
        bVar.a(false);
    }
}
