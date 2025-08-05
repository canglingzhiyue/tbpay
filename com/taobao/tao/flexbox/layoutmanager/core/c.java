package com.taobao.tao.flexbox.layoutmanager.core;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.oeg;
import tb.oek;
import tb.oel;
import tb.oen;
import tb.oeo;
import tb.oeq;
import tb.oes;
import tb.oex;
import tb.oey;
import tb.oez;
import tb.ofa;
import tb.ofb;
import tb.ofd;
import tb.ofe;
import tb.off;
import tb.ofg;
import tb.ogl;
import tb.ogw;
import tb.tds;
import tb.tft;

/* loaded from: classes8.dex */
public abstract class c<V, D, P extends ogl> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static c A;
    public static c B;
    public static c b;
    public static c c;
    public static c d;
    public static c e;
    public static c f;
    public static c g;
    public static c h;
    public static c i;
    public static c j;
    public static c k;
    public static c l;
    public static c m;
    public static c n;
    public static c o;
    public static c p;
    public static c q;
    public static c r;
    public static c s;
    public static c t;
    public static c u;
    public static c v;
    public static c w;
    public static c x;
    public static c y;
    public static c z;

    /* loaded from: classes8.dex */
    public static abstract class a<V, P extends ogl> extends c<V, Drawable, P> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(970956610);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public /* bridge */ /* synthetic */ void a(f fVar, Drawable[] drawableArr, ogl oglVar, aa.d dVar) {
        }
    }

    public void a(aa aaVar, P p2, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8b0d9d2", new Object[]{this, aaVar, p2, str, obj});
        }
    }

    public abstract void a(f fVar, V v2, P p2, aa.d dVar);

    public abstract void a(f fVar, D[] dArr, P p2, aa.d dVar);

    public String[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("c770f637", new Object[]{this});
        }
        return null;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ aa.d a(aa.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa.d) ipChange.ipc$dispatch("36d68cae", new Object[]{dVar}) : b(dVar);
    }

    public static /* synthetic */ boolean a(Component component) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e0962227", new Object[]{component})).booleanValue() : b(component);
    }

    static {
        kge.a(-1956509707);
        b = new c<View, Drawable, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                str.hashCode();
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public boolean b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                    return;
                }
                Component component = (Component) fVar;
                a(component, view, oglVar, dVar);
                b(component, view, oglVar, dVar);
            }

            private void a(Component component, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                boolean z2 = false;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b209de53", new Object[]{this, component, view, oglVar, dVar});
                    return;
                }
                Component.a peekHostViewComponent = component.peekHostViewComponent();
                r rVar = null;
                if (peekHostViewComponent != null) {
                    rVar = peekHostViewComponent.b;
                }
                if (rVar == null) {
                    return;
                }
                if (oglVar.bs != null && c.a(component)) {
                    ogl.c a2 = ogl.c.a("left", oglVar.bs);
                    if (a2 != null && view.getLeft() != rVar.c) {
                        component.setAnimationLeft(view.getLeft());
                        AnimatorSet a3 = oel.a(component.getTNode().k(), component.getTNode().E(), a2.a(), oel.d.a(rVar.c, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
                        dVar = c.a(dVar);
                        dVar.a(a3);
                        z2 = true;
                    }
                    ogl.c a4 = ogl.c.a("right", oglVar.bs);
                    if (a4 != null && view.getRight() != rVar.c + rVar.f20361a) {
                        component.setAnimationRight(view.getRight());
                        AnimatorSet a5 = oel.a(component.getTNode().k(), component.getTNode().E(), a4.a(), oel.d.a(Integer.MIN_VALUE, Integer.MIN_VALUE, rVar.c + rVar.f20361a, Integer.MIN_VALUE));
                        dVar = c.a(dVar);
                        dVar.a(a5);
                        z2 = true;
                    }
                    ogl.c a6 = ogl.c.a("top", oglVar.bs);
                    if (a6 != null && view.getTop() != rVar.d) {
                        component.setAnimationTop(view.getTop());
                        AnimatorSet a7 = oel.a(component.getTNode().k(), component.getTNode().E(), a6.a(), oel.d.a(Integer.MIN_VALUE, rVar.d, Integer.MIN_VALUE, Integer.MIN_VALUE));
                        dVar = c.a(dVar);
                        dVar.a(a7);
                        z2 = true;
                    }
                    ogl.c a8 = ogl.c.a("bottom", oglVar.bs);
                    if (a8 != null && view.getBottom() != rVar.d + rVar.b) {
                        component.setAnimationBottom(view.getBottom());
                        AnimatorSet a9 = oel.a(component.getTNode().k(), component.getTNode().E(), a8.a(), oel.d.a(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, rVar.d + rVar.b));
                        dVar = c.a(dVar);
                        dVar.a(a9);
                        z2 = true;
                    }
                }
                if (z2 || dVar == null || !dVar.f20297a || rVar == null || peekHostViewComponent.f20278a == null || view.getParent() != peekHostViewComponent.f20278a.getView()) {
                    return;
                }
                if (view.getLeft() == rVar.c && view.getTop() == rVar.d) {
                    return;
                }
                if (view.getLeft() != rVar.c) {
                    component.setAnimationLeft(view.getLeft());
                }
                if (view.getTop() != rVar.d) {
                    component.setAnimationTop(view.getTop());
                }
                dVar.a(oel.a(component.getTNode().k(), component.getTNode().E(), dVar.a(), oel.d.a(rVar.c, rVar.d, Integer.MIN_VALUE, Integer.MIN_VALUE)));
            }

            private void b(Component component, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                boolean z2 = false;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bcdee5d4", new Object[]{this, component, view, oglVar, dVar});
                    return;
                }
                r measureResult = component.getMeasureResult();
                int i2 = measureResult.f20361a;
                int i3 = measureResult.b;
                boolean z3 = dVar != null && dVar.f20297a;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.MarginLayoutParams(i2, i3);
                } else {
                    layoutParams.width = i2;
                    layoutParams.height = i3;
                }
                if (oglVar.bs != null && c.a(component)) {
                    ogl.c a2 = ogl.c.a("width", oglVar.bs);
                    if (a2 != null) {
                        layoutParams.width = view.getWidth();
                        layoutParams.height = i3;
                        component.setAnimationWidth(layoutParams.width);
                        oeg a3 = a2.a();
                        a3.h.f31971a = i2;
                        AnimatorSet a4 = oel.a(component.getTNode().k(), component.getTNode().E(), a3);
                        dVar = c.a(dVar);
                        dVar.a(a4);
                        z2 = true;
                    }
                    ogl.c a5 = ogl.c.a("height", oglVar.bs);
                    if (a5 != null) {
                        layoutParams.width = a2 != null ? view.getWidth() : i2;
                        layoutParams.height = view.getHeight();
                        component.setAnimationHeight(layoutParams.height);
                        oeg a6 = a5.a();
                        a6.h.b = i3;
                        AnimatorSet a7 = oel.a(component.getTNode().k(), component.getTNode().E(), a6);
                        dVar = c.a(dVar);
                        dVar.a(a7);
                        z2 = true;
                    }
                }
                if (z3 && !z2) {
                    if (view.getWidth() != i2) {
                        layoutParams.width = view.getWidth();
                        component.setAnimationWidth(layoutParams.width);
                        z2 = true;
                    }
                    if (view.getHeight() != i3) {
                        layoutParams.height = view.getHeight();
                        component.setAnimationHeight(layoutParams.height);
                        z2 = true;
                    }
                    aa.d a8 = c.a(dVar);
                    oeg a9 = a8.a();
                    a9.h.f31971a = i2;
                    a9.h.b = i3;
                    a8.a(oel.a(component.getTNode().k(), component.getTNode().E(), a9));
                }
                if (!z2) {
                    off offVar = (off) component.getTNode().a(11);
                    if (offVar != null) {
                        if (offVar.d().intValue() == i2) {
                            layoutParams.width = view.getWidth();
                        } else {
                            offVar.a().cancel();
                        }
                    }
                    oes oesVar = (oes) component.getTNode().a(12);
                    if (oesVar != null) {
                        if (oesVar.d().intValue() == i3) {
                            layoutParams.height = view.getHeight();
                        } else {
                            oesVar.a().cancel();
                        }
                    }
                }
                view.setLayoutParams(layoutParams);
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, Drawable[] drawableArr, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7d5dd203", new Object[]{this, fVar, drawableArr, oglVar, dVar});
                    return;
                }
                r measureResult = fVar.getMeasureResult();
                if (drawableArr == null) {
                    return;
                }
                for (Drawable drawable : drawableArr) {
                    if (drawable != null) {
                        drawable.setBounds(0, 0, measureResult.f20361a, measureResult.b);
                    }
                }
            }
        };
        c = new c<View, Drawable, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public boolean b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                    return;
                }
                r measureResult = fVar.getMeasureResult();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.MarginLayoutParams(measureResult.f20361a, measureResult.b);
                } else {
                    layoutParams.width = measureResult.f20361a;
                    layoutParams.height = measureResult.b;
                }
                view.setLayoutParams(layoutParams);
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, Drawable[] drawableArr, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7d5dd203", new Object[]{this, fVar, drawableArr, oglVar, dVar});
                    return;
                }
                r measureResult = fVar.getMeasureResult();
                if (drawableArr == null) {
                    return;
                }
                for (Drawable drawable : drawableArr) {
                    if (drawable != null) {
                        drawable.setBounds(0, 0, measureResult.f20361a, measureResult.b);
                    }
                }
            }
        };
        d = new c<View, Drawable, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public boolean b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                    return;
                }
                r measureResult = fVar.getMeasureResult();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.MarginLayoutParams(measureResult.f20361a, measureResult.b);
                } else {
                    layoutParams.width = measureResult.f20361a;
                    layoutParams.height = measureResult.b;
                }
                view.setLayoutParams(layoutParams);
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, Drawable[] drawableArr, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7d5dd203", new Object[]{this, fVar, drawableArr, oglVar, dVar});
                    return;
                }
                r measureResult = fVar.getMeasureResult();
                if (drawableArr == null) {
                    return;
                }
                for (Drawable drawable : drawableArr) {
                    if (drawable != null) {
                        drawable.setBounds(0, 0, measureResult.f20361a, measureResult.b);
                    }
                }
            }
        };
        e = new a<View, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.19
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public boolean b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                oeg a2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                } else if ((fVar instanceof g) || (fVar instanceof q)) {
                    view.setPadding(oglVar.ag, oglVar.ai, oglVar.ah, oglVar.aj);
                } else if (!(fVar instanceof com.taobao.tao.flexbox.layoutmanager.component.u)) {
                } else {
                    if (dVar == null) {
                        dVar = new aa.d(false);
                    }
                    ogl.c cVar = null;
                    if (c.a((Component) fVar)) {
                        cVar = ogl.c.a(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_left, oglVar.bs);
                    }
                    if (cVar != null || dVar.f20297a) {
                        if (cVar != null) {
                            a2 = cVar.a();
                        } else {
                            a2 = dVar.a();
                        }
                        a2.h.i = oglVar.ag;
                        a2.h.j = oglVar.ah;
                        a2.h.k = oglVar.ai;
                        a2.h.l = oglVar.aj;
                        dVar.a(oel.a(fVar.getTNode().k(), fVar.getTNode().E(), a2));
                        return;
                    }
                    tft tftVar = (tft) fVar.getTNode().a(26);
                    if (tftVar != null) {
                        if (tftVar.d().intValue() == oglVar.ag) {
                            return;
                        }
                        tftVar.a().cancel();
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (viewGroup.getChildCount() <= 0) {
                        return;
                    }
                    viewGroup.getChildAt(0).setPadding(oglVar.ag, oglVar.ai, oglVar.ah, oglVar.aj);
                }
            }
        };
        f = new c<View, Drawable, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.20
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public boolean c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, final View view, final ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                    return;
                }
                r measureResult = fVar.getMeasureResult();
                if (oglVar.aI != null) {
                    ((Component) fVar).setBackgroundTask(ogw.a(null, fVar.getTNode().k(), oglVar.aI, measureResult.f20361a, measureResult.b, ImageLoader.a.a("background", fVar.getTNode()), oglVar.bh, false, new ogw.a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.20.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.ogw.a
                        public void a(Object obj, Drawable drawable) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("91476368", new Object[]{this, obj, drawable});
                            } else {
                                c.a(view, drawable);
                            }
                        }

                        @Override // tb.ogw.a
                        public void a(Object obj, int i2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("1e7da93f", new Object[]{this, obj, new Integer(i2)});
                            } else {
                                c.a(view, com.taobao.tao.flexbox.layoutmanager.drawable.b.a(view.getBackground(), oglVar));
                            }
                        }
                    }));
                } else if (oglVar.aI != null) {
                } else {
                    ogl.c a2 = ogl.c.a("background", oglVar.bs);
                    if (a2 != null && c.a((Component) fVar)) {
                        aa.d a3 = c.a(dVar);
                        oeg a4 = a2.a();
                        a4.h.f = oglVar.aE;
                        a3.a(oel.a(fVar.getTNode().k(), fVar.getTNode().E(), a4));
                        return;
                    }
                    oeo oeoVar = (oeo) fVar.getTNode().a(9);
                    if (oeoVar != null) {
                        if (oeoVar.d().intValue() == oglVar.aE) {
                            return;
                        }
                        oeoVar.a().cancel();
                    }
                    a(view, com.taobao.tao.flexbox.layoutmanager.drawable.b.a(view.getBackground(), oglVar));
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, Drawable[] drawableArr, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7d5dd203", new Object[]{this, fVar, drawableArr, oglVar, dVar});
                } else if (!oeb.aH() || drawableArr == null || drawableArr.length <= 0) {
                } else {
                    Drawable drawable = drawableArr[0];
                    drawableArr[0] = com.taobao.tao.flexbox.layoutmanager.drawable.b.a(drawableArr[0], oglVar);
                    if (drawable == drawableArr[0] || !(fVar instanceof d)) {
                        return;
                    }
                    ((d) fVar).updateDrawable(true);
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(aa aaVar, ogl oglVar, String str, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a8b0d9d2", new Object[]{this, aaVar, oglVar, str, obj});
                } else if (obj == null || aaVar == null) {
                } else {
                    Context N = aaVar.N();
                    char c2 = 65535;
                    int hashCode = str.hashCode();
                    if (hashCode != -1332194002) {
                        if (hashCode != 605322756) {
                            if (hashCode == 610793468 && str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_background_image)) {
                                c2 = 2;
                            }
                        } else if (str.equals("background-color")) {
                            c2 = 0;
                        }
                    } else if (str.equals("background")) {
                        c2 = 1;
                    }
                    if (c2 == 0) {
                        oglVar.m(N, obj);
                    } else if (c2 == 1) {
                        oglVar.l(N, obj);
                    } else if (c2 != 2) {
                    } else {
                        oglVar.j(N, obj);
                    }
                }
            }
        };
        g = new c<View, Drawable, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.21
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public boolean c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(aa aaVar, ogl oglVar, String str, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a8b0d9d2", new Object[]{this, aaVar, oglVar, str, obj});
                } else if (obj == null || aaVar == null) {
                } else {
                    Context N = aaVar.N();
                    char c2 = 65535;
                    if (str.hashCode() == 961048153 && str.equals("foreground-color")) {
                        c2 = 0;
                    }
                    if (c2 != 0) {
                        return;
                    }
                    oglVar.k(N, obj);
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                Drawable b2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                } else if (Build.VERSION.SDK_INT < 23 || (fVar instanceof com.taobao.tao.flexbox.layoutmanager.component.j) || (b2 = com.taobao.tao.flexbox.layoutmanager.drawable.b.b(view.getForeground(), oglVar)) == view.getForeground()) {
                } else {
                    view.setForeground(b2);
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, Drawable[] drawableArr, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7d5dd203", new Object[]{this, fVar, drawableArr, oglVar, dVar});
                } else if (!oeb.aH() || drawableArr == null || drawableArr.length <= 2) {
                } else {
                    Drawable drawable = drawableArr[2];
                    drawableArr[2] = com.taobao.tao.flexbox.layoutmanager.drawable.b.b(drawableArr[2], oglVar);
                    if (drawable == drawableArr[2] || !(fVar instanceof d)) {
                        return;
                    }
                    ((d) fVar).updateDrawable(true);
                }
            }
        };
        h = new c<View, Drawable, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.22
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public boolean c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(aa aaVar, ogl oglVar, String str, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a8b0d9d2", new Object[]{this, aaVar, oglVar, str, obj});
                } else if (obj == null || aaVar == null) {
                } else {
                    oglVar.b(aaVar.N(), str, obj);
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                oeg a2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                    return;
                }
                if (dVar == null) {
                    dVar = new aa.d(false);
                }
                ogl.c cVar = null;
                if (c.a((Component) fVar)) {
                    cVar = ogl.c.a(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_radius, oglVar.bs);
                }
                if (cVar != null || dVar.f20297a) {
                    if (cVar != null) {
                        a2 = cVar.a();
                    } else {
                        a2 = dVar.a();
                    }
                    a2.h.g = oglVar.aJ;
                    dVar.a(oel.a(fVar.getTNode().k(), fVar.getTNode().E(), a2));
                    return;
                }
                oeq oeqVar = (oeq) fVar.getTNode().a(24);
                if (oeqVar != null) {
                    if (oeqVar.d().floatValue() == oglVar.aJ) {
                        return;
                    }
                    oeqVar.a().cancel();
                }
                f.a(fVar, (f) view, (View) oglVar, dVar);
                g.a(fVar, (f) view, (View) oglVar, dVar);
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, Drawable[] drawableArr, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7d5dd203", new Object[]{this, fVar, drawableArr, oglVar, dVar});
                } else if (!oeb.aH()) {
                } else {
                    f.a(fVar, (Object[]) drawableArr, (Drawable[]) oglVar, dVar);
                    g.a(fVar, (Object[]) drawableArr, (Drawable[]) oglVar, dVar);
                }
            }
        };
        i = new c<View, Drawable, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.23
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public boolean c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(aa aaVar, ogl oglVar, String str, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a8b0d9d2", new Object[]{this, aaVar, oglVar, str, obj});
                } else if (oglVar == null || aaVar == null) {
                } else {
                    oglVar.i(aaVar.N(), obj);
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                oeg a2;
                List<aa> a3;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                    return;
                }
                float f2 = oglVar.aT;
                ogl.c cVar = null;
                if (fVar instanceof Component) {
                    Component component = (Component) fVar;
                    View.OnClickListener componentClickListener = component.getComponentClickListener();
                    View.OnTouchListener componentTouchListener = component.getComponentTouchListener();
                    if (componentTouchListener != null) {
                        if (f2 == 0.0f) {
                            componentTouchListener = null;
                        }
                        view.setOnTouchListener(componentTouchListener);
                    } else if (componentClickListener != null) {
                        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                        if (i2 == 0) {
                            componentClickListener = null;
                        }
                        view.setOnClickListener(componentClickListener);
                        view.setClickable(i2 != 0);
                    }
                }
                if (dVar == null) {
                    dVar = new aa.d(false);
                }
                Component component2 = (Component) fVar;
                if (c.a(component2)) {
                    cVar = ogl.c.a("opacity", oglVar.bs);
                }
                if (cVar != null || dVar.f20297a) {
                    if (cVar != null) {
                        a2 = cVar.a();
                    } else {
                        a2 = dVar.a();
                    }
                    a2.h.e = f2;
                    dVar.a(oel.a(fVar.getTNode().k(), fVar.getTNode().E(), a2));
                    return;
                }
                oen oenVar = (oen) fVar.getTNode().a(10);
                if (oenVar != null) {
                    if (oenVar.d().floatValue() == f2) {
                        return;
                    }
                    oenVar.a().cancel();
                }
                if (oeb.aG()) {
                    List<aa> a4 = ad.a(fVar.getTNode(), f2, true);
                    if (a4 != null && !a4.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (aa aaVar : a4) {
                            arrayList.addAll(ad.a(aaVar, component2.getNode()));
                        }
                        component2.setComponentAlpha(true, f2, arrayList);
                        return;
                    }
                    if (component2.getComponentAlpha() != 1.0f && (a3 = ad.a(fVar.getTNode(), f2, false)) != null && !a3.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        for (aa aaVar2 : a3) {
                            arrayList2.addAll(ad.a(aaVar2, component2.getNode()));
                        }
                        component2.setComponentAlpha(true, 1.0f, arrayList2);
                    }
                    view.setAlpha(f2);
                    return;
                }
                view.setAlpha(f2);
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, Drawable[] drawableArr, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7d5dd203", new Object[]{this, fVar, drawableArr, oglVar, dVar});
                } else if (drawableArr != null) {
                    int i2 = (int) (oglVar.aT * 255.0f);
                    for (Drawable drawable : drawableArr) {
                        if (drawable != null) {
                            drawable.setAlpha(i2);
                        }
                    }
                }
            }
        };
        j = new a<View, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.24
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public boolean c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(aa aaVar, ogl oglVar, String str, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a8b0d9d2", new Object[]{this, aaVar, oglVar, str, obj});
                } else if (oglVar == null || aaVar == null) {
                } else {
                    oglVar.e(aaVar.N(), obj);
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                } else if (!oglVar.aS || !oglVar.aW) {
                } else {
                    view.requestFocus();
                }
            }
        };
        k = new c<View, Drawable, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public boolean c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(aa aaVar, ogl oglVar, String str, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a8b0d9d2", new Object[]{this, aaVar, oglVar, str, obj});
                } else if (oglVar == null || aaVar == null) {
                } else {
                    oglVar.c(aaVar.N(), obj);
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                    return;
                }
                int i2 = 8;
                if (oglVar.aV != null) {
                    if (oglVar.aV.booleanValue()) {
                        i2 = 0;
                    }
                    view.setVisibility(i2);
                    return;
                }
                if (oglVar.aU) {
                    i2 = 0;
                }
                view.setVisibility(i2);
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, Drawable[] drawableArr, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7d5dd203", new Object[]{this, fVar, drawableArr, oglVar, dVar});
                } else if (drawableArr != null) {
                    for (Drawable drawable : drawableArr) {
                        if (drawable != null) {
                            drawable.setVisible(oglVar.aU, false);
                        }
                    }
                }
            }
        };
        l = new a<View, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public boolean c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(aa aaVar, ogl oglVar, String str, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a8b0d9d2", new Object[]{this, aaVar, oglVar, str, obj});
                } else if (oglVar == null || aaVar == null) {
                } else {
                    oglVar.d(aaVar.N(), obj);
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                } else {
                    view.setEnabled(oglVar.aW);
                }
            }
        };
        m = new a<View, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public boolean c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(aa aaVar, ogl oglVar, String str, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a8b0d9d2", new Object[]{this, aaVar, oglVar, str, obj});
                } else if (oglVar == null || aaVar == null) {
                } else {
                    oglVar.f(aaVar.N(), obj);
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                } else if (oglVar.bg <= 0 || Build.VERSION.SDK_INT < 21) {
                } else {
                    view.setZ(oglVar.bg);
                }
            }
        };
        n = new a<View, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                    return;
                }
                CharSequence contentDescription = ((Component) fVar).getContentDescription();
                view.setContentDescription(contentDescription);
                if (TextUtils.isEmpty(contentDescription)) {
                    return;
                }
                view.setFocusable(true);
            }
        };
        o = new a<View, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public boolean c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(aa aaVar, ogl oglVar, String str, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a8b0d9d2", new Object[]{this, aaVar, oglVar, str, obj});
                } else if (oglVar == null || aaVar == null) {
                } else {
                    oglVar.g(aaVar.N(), obj);
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                } else if (!(view instanceof ViewGroup)) {
                } else {
                    ((ViewGroup) view).setClipChildren(oglVar.ba);
                }
            }
        };
        p = new a<View, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                ofg a2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                } else if (view == null || (a2 = oek.a(fVar.getTNode(), view.getContext(), fVar.getTNode().e("transform"))) == null) {
                } else {
                    ogl.c a3 = ogl.c.a("transform", oglVar.bs);
                    if (a3 != null && c.a((Component) fVar)) {
                        aa.d a4 = c.a(dVar);
                        oeg a5 = a3.a();
                        a5.h.h = a2;
                        a4.a(oel.a(fVar.getTNode().k(), fVar.getTNode().E(), a5));
                        return;
                    }
                    if (dVar == null) {
                        dVar = new aa.d(false);
                    }
                    oeg a6 = dVar.a();
                    a6.h.h = a2;
                    dVar.a(oel.a(fVar.getTNode().k(), fVar.getTNode().E(), a6));
                }
            }
        };
        q = new a<View, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                    return;
                }
                r.a(fVar, (f) view, (View) oglVar, dVar);
                s.a(fVar, (f) view, (View) oglVar, dVar);
            }
        };
        r = new a<View, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                    return;
                }
                ogl.c a2 = ogl.c.a("translate", oglVar.bs);
                if (a2 != null && c.a((Component) fVar)) {
                    aa.d a3 = c.a(dVar);
                    oeg a4 = a2.a();
                    ofg ofgVar = new ofg();
                    ofgVar.e = new PointF(oglVar.bl, -2.14748365E9f);
                    a4.h.h = ofgVar;
                    a3.a(oel.a(fVar.getTNode().k(), fVar.getTNode().E(), a4));
                    return;
                }
                ofd ofdVar = (ofd) fVar.getTNode().a(22);
                if (ofdVar != null) {
                    if (ofdVar.d().floatValue() == oglVar.bl) {
                        return;
                    }
                    ofdVar.a().cancel();
                }
                view.setTranslationX(oglVar.bl);
            }
        };
        s = new a<View, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                    return;
                }
                ogl.c a2 = ogl.c.a("translate", oglVar.bs);
                if (a2 != null && c.a((Component) fVar)) {
                    aa.d a3 = c.a(dVar);
                    oeg a4 = a2.a();
                    ofg ofgVar = new ofg();
                    ofgVar.e = new PointF(-2.14748365E9f, oglVar.bm);
                    a4.h.h = ofgVar;
                    a3.a(oel.a(fVar.getTNode().k(), fVar.getTNode().E(), a4));
                    return;
                }
                ofe ofeVar = (ofe) fVar.getTNode().a(23);
                if (ofeVar != null) {
                    if (ofeVar.d().floatValue() == oglVar.bm) {
                        return;
                    }
                    ofeVar.a().cancel();
                }
                view.setTranslationY(oglVar.bm);
            }
        };
        t = new a<View, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                    return;
                }
                ogl.c a2 = ogl.c.a("rotate", oglVar.bs);
                if (a2 != null && c.a((Component) fVar)) {
                    aa.d a3 = c.a(dVar);
                    oeg a4 = a2.a();
                    ofg ofgVar = new ofg();
                    ofgVar.c = oglVar.bn;
                    a4.h.h = ofgVar;
                    a3.a(oel.a(fVar.getTNode().k(), fVar.getTNode().E(), a4));
                    return;
                }
                oex oexVar = (oex) fVar.getTNode().a(17);
                if (oexVar != null) {
                    if (oexVar.d().floatValue() == oglVar.bn) {
                        return;
                    }
                    oexVar.a().cancel();
                }
                view.setRotation(oglVar.bn);
            }
        };
        u = new a<View, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                    return;
                }
                ogl.c a2 = ogl.c.a("rotateX", oglVar.bs);
                if (a2 != null && c.a((Component) fVar)) {
                    aa.d a3 = c.a(dVar);
                    oeg a4 = a2.a();
                    ofg ofgVar = new ofg();
                    ofgVar.f31986a = oglVar.bo;
                    a4.h.h = ofgVar;
                    a3.a(oel.a(fVar.getTNode().k(), fVar.getTNode().E(), a4));
                    return;
                }
                oey oeyVar = (oey) fVar.getTNode().a(18);
                if (oeyVar != null) {
                    if (oeyVar.d().floatValue() == oglVar.bo) {
                        return;
                    }
                    oeyVar.a().cancel();
                }
                view.setRotationX(oglVar.bo);
            }
        };
        v = new a<View, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                    return;
                }
                ogl.c a2 = ogl.c.a("rotateY", oglVar.bs);
                if (a2 != null && c.a((Component) fVar)) {
                    aa.d a3 = c.a(dVar);
                    oeg a4 = a2.a();
                    ofg ofgVar = new ofg();
                    ofgVar.b = oglVar.bp;
                    a4.h.h = ofgVar;
                    a3.a(oel.a(fVar.getTNode().k(), fVar.getTNode().E(), a4));
                    return;
                }
                oez oezVar = (oez) fVar.getTNode().a(19);
                if (oezVar != null) {
                    if (oezVar.d().floatValue() == oglVar.bp) {
                        return;
                    }
                    oezVar.a().cancel();
                }
                view.setRotationY(oglVar.bp);
            }
        };
        w = new a<View, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                    return;
                }
                x.a(fVar, (f) view, (View) oglVar, dVar);
                y.a(fVar, (f) view, (View) oglVar, dVar);
            }
        };
        x = new a<View, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                    return;
                }
                ogl.c a2 = ogl.c.a("scale", oglVar.bs);
                if (a2 != null && c.a((Component) fVar)) {
                    aa.d a3 = c.a(dVar);
                    oeg a4 = a2.a();
                    ofg ofgVar = new ofg();
                    ofgVar.d = new PointF(oglVar.bq, -2.14748365E9f);
                    a4.h.h = ofgVar;
                    a3.a(oel.a(fVar.getTNode().k(), fVar.getTNode().E(), a4));
                    return;
                }
                ofa ofaVar = (ofa) fVar.getTNode().a(20);
                if (ofaVar != null) {
                    if (ofaVar.d().floatValue() == oglVar.bq) {
                        return;
                    }
                    ofaVar.a().cancel();
                }
                view.setScaleX(oglVar.bq);
            }
        };
        y = new a<View, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                    return;
                }
                ogl.c a2 = ogl.c.a("scale", oglVar.bs);
                if (a2 != null && c.a((Component) fVar)) {
                    aa.d a3 = c.a(dVar);
                    oeg a4 = a2.a();
                    ofg ofgVar = new ofg();
                    ofgVar.d = new PointF(-2.14748365E9f, oglVar.br);
                    a4.h.h = ofgVar;
                    a3.a(oel.a(fVar.getTNode().k(), fVar.getTNode().E(), a4));
                    return;
                }
                ofb ofbVar = (ofb) fVar.getTNode().a(21);
                if (ofbVar != null) {
                    if (ofbVar.d().floatValue() == oglVar.br) {
                        return;
                    }
                    ofbVar.a().cancel();
                }
                view.setScaleY(oglVar.br);
            }
        };
        z = new a<View, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.25
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                } else if (view == null || oglVar.bz) {
                } else {
                    view.setTag(com.taobao.monitor.procedure.v.APM_VIEW_TOKEN, com.taobao.monitor.procedure.v.APM_VIEW_IGNORE);
                }
            }
        };
        A = new a<View, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.26
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public boolean c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(aa aaVar, ogl oglVar, String str, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a8b0d9d2", new Object[]{this, aaVar, oglVar, str, obj});
                } else if (!TextUtils.equals(str, com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_box_shadow)) {
                } else {
                    oglVar.h(aaVar.N(), obj);
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                } else if (view == null) {
                } else {
                    a(view, com.taobao.tao.flexbox.layoutmanager.drawable.b.a(view.getBackground(), oglVar));
                }
            }
        };
        B = new a<View, ogl>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.c.27
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.c
            public void a(f fVar, View view, ogl oglVar, aa.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f229e1c", new Object[]{this, fVar, view, oglVar, dVar});
                } else if (oglVar.bA == null || !(view instanceof tds)) {
                } else {
                    ((tds) view).setFading(oglVar.bA);
                }
            }
        };
    }

    private static aa.d b(aa.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa.d) ipChange.ipc$dispatch("ef634d0d", new Object[]{dVar}) : dVar == null ? new aa.d(true) : dVar;
    }

    public static void a(View view, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b9198e", new Object[]{view, drawable});
        } else if (view == null) {
        } else {
            if (oec.b()) {
                view.setBackgroundDrawable(drawable);
            } else if (drawable == view.getBackground()) {
            } else {
                view.setBackground(drawable);
            }
        }
    }

    private static boolean b(Component component) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d833946", new Object[]{component})).booleanValue();
        }
        View view = component.getView();
        if (view == null || view.getParent() == null) {
            z2 = false;
        } else {
            z2 = Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : true;
        }
        Component.a peekHostViewComponent = component.peekHostViewComponent();
        return component.node.p() && !component.initRender && z2 && peekHostViewComponent != null && peekHostViewComponent.f20278a != null && peekHostViewComponent.f20278a.isTransitionChildComponent(component);
    }
}
