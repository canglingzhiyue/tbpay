package com.taobao.tao.flexbox.layoutmanager.component;

import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ofo;
import tb.ogg;
import tb.oid;

/* loaded from: classes8.dex */
public class ac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float f20097a;
    private float b;
    private com.taobao.tao.flexbox.layoutmanager.core.aa c;
    private Component d;
    private Component e;
    private ScrollChangeListener f;
    private oid g;

    static {
        kge.a(1788217435);
    }

    public ac(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, float f, float f2, ScrollChangeListener scrollChangeListener, oid oidVar) {
        this.c = aaVar;
        this.f20097a = f;
        this.b = f2;
        boolean z = aaVar.I() instanceof z;
        this.d = c(aaVar);
        Component component = this.d;
        if (component != null && !z) {
            this.e = c(component.getNode());
        }
        this.f = scrollChangeListener;
        this.g = oidVar;
        Component component2 = this.d;
        if (component2 != null) {
            a(component2);
        }
        Component component3 = this.e;
        if (component3 != null) {
            a(component3);
        }
    }

    public Component a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Component) ipChange.ipc$dispatch("f569c063", new Object[]{this}) : this.d;
    }

    private void a(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0962223", new Object[]{this, component});
        } else if (component instanceof m) {
            m mVar = (m) component;
            mVar.a(this.f);
            oid oidVar = this.g;
            if (oidVar == null) {
                return;
            }
            mVar.a(oidVar);
        } else if (component instanceof ScrollViewComponent) {
            ((ScrollViewComponent) component).addScrollChangedListener(this.f);
        } else if (component instanceof c) {
            ((c) component).a(this.f);
        } else if (!(component instanceof aa)) {
        } else {
            ((aa) component).a(this.f);
        }
    }

    private void b(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d833942", new Object[]{this, component});
        } else if (component instanceof m) {
            m mVar = (m) component;
            mVar.b(this.f);
            oid oidVar = this.g;
            if (oidVar == null) {
                return;
            }
            mVar.b(oidVar);
        } else if (component instanceof ScrollViewComponent) {
            ((ScrollViewComponent) component).removeScrollChangedListener(this.f);
        } else if (component instanceof c) {
            ((c) component).b(this.f);
        } else if (!(component instanceof aa)) {
        } else {
            ((aa) component).b(this.f);
        }
    }

    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        try {
            View x = this.c.x();
            if (x != null && oec.c(x) && ViewCompat.isAttachedToWindow(x) && x.getVisibility() == 0 && a(this.c)) {
                if (this.d != null && ((oeb.aA() && !this.d.getNode().o()) || !c(this.d))) {
                    return false;
                }
                Rect d = d();
                boolean contains = f().contains(d);
                if (!z || contains) {
                    return contains;
                }
                int[] h = h();
                return new Rect(0, 0, h[0], h[1]).intersect(d);
            }
            return false;
        } catch (Throwable th) {
            ogg.b(th.getMessage());
            return false;
        }
    }

    private Rect d() {
        int i;
        int i2;
        int left;
        int scrollX;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("9b2bb1f4", new Object[]{this});
        }
        try {
            Pair<com.taobao.tao.flexbox.layoutmanager.core.aa, View> e = e();
            View view = (View) e.second;
            if (this.d instanceof ofo) {
                i2 = view.getTop();
                i = view.getLeft();
            } else {
                if (this.d instanceof ScrollViewComponent) {
                    i2 = view.getTop() - ((ScrollViewComponent) this.d).getScrollView().getScrollY();
                    left = view.getLeft();
                    scrollX = ((ScrollViewComponent) this.d).getScrollView().getScrollX();
                } else if (this.d instanceof c) {
                    i2 = view.getTop();
                    left = view.getLeft();
                    scrollX = this.d.getView().getScrollX();
                } else {
                    i = 0;
                    i2 = 0;
                }
                i = left - scrollX;
            }
            com.taobao.tao.flexbox.layoutmanager.core.r G = this.c.G();
            int[] b = b((com.taobao.tao.flexbox.layoutmanager.core.aa) e.first);
            int i3 = i2 + b[1];
            int i4 = i + b[0];
            return new Rect(i4, i3, G.f20361a + i4, G.b + i3);
        } catch (Exception unused) {
            return new Rect();
        }
    }

    private Pair<com.taobao.tao.flexbox.layoutmanager.core.aa, View> e() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("61579b6", new Object[]{this});
        }
        Component component = this.d;
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = null;
        if (component instanceof ofo) {
            aaVar = this.c.L();
            view = (View) aaVar.x().getParent();
        } else if (component instanceof ScrollViewComponent) {
            com.taobao.tao.flexbox.layoutmanager.core.aa node = component.getNode();
            int size = node.d.size();
            if (size == 1) {
                aaVar = node.d.get(0);
            } else if (size > 1) {
                aaVar = node;
            }
            com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2 = this.c;
            while (aaVar2.J() != null && aaVar2.J() != aaVar) {
                aaVar2 = aaVar2.J();
            }
            aaVar = aaVar2;
            view = aaVar2.x();
        } else if (component instanceof c) {
            aaVar = this.c.L();
            view = (View) aaVar.x().getParent();
        } else {
            view = null;
        }
        return new Pair<>(aaVar, view);
    }

    private Rect f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("dcdd376", new Object[]{this});
        }
        com.taobao.tao.flexbox.layoutmanager.core.r G = this.c.G();
        int[] g = g();
        return new Rect((int) ((-G.f20361a) * (1.0f - this.b)), (int) ((-G.b) * (1.0f - this.f20097a)), g[0], g[1]);
    }

    private int[] g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("b25e3536", new Object[]{this});
        }
        com.taobao.tao.flexbox.layoutmanager.core.r G = this.c.G();
        int[] h = h();
        return new int[]{h[0] + ((int) (G.f20361a * (1.0f - this.b))), h[1] + ((int) (G.b * (1.0f - this.f20097a)))};
    }

    private int[] h() {
        View x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("b4130dd5", new Object[]{this});
        }
        Component component = this.d;
        if (component != null) {
            x = component.getView();
        } else {
            x = this.c.M().x();
        }
        if (x != null) {
            Rect rect = new Rect();
            x.getGlobalVisibleRect(rect);
            return new int[]{rect.width(), rect.height()};
        }
        return new int[]{0, 0};
    }

    private int[] b(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("e86174f3", new Object[]{this, aaVar});
        }
        com.taobao.tao.flexbox.layoutmanager.core.r G = this.c.G();
        if (oeb.af()) {
            if (this.c != aaVar) {
                i = G.c;
                i2 = G.d;
            } else {
                i2 = 0;
                i = 0;
            }
        } else {
            i = G.c;
            i2 = G.d;
        }
        try {
            if (this.c != aaVar) {
                for (com.taobao.tao.flexbox.layoutmanager.core.aa J = this.c.J(); J != null && J != aaVar; J = J.J()) {
                    i2 += J.G().d;
                    i += J.G().c;
                }
            }
        } catch (Exception unused) {
        }
        return new int[]{i, i2};
    }

    public static boolean a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        int currentItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("691d3054", new Object[]{aaVar})).booleanValue();
        }
        try {
            com.taobao.tao.flexbox.layoutmanager.core.aa a2 = aaVar.a(c.class, (aa.c) null, true);
            if (a2 != null && (currentItem = ((ViewPager) a2.x()).getCurrentItem()) >= 0 && currentItem < a2.d.size()) {
                return a2.d.get(currentItem).b(aaVar);
            }
        } catch (Throwable th) {
            ogg.b(th.getMessage());
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        return r4.I();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.taobao.tao.flexbox.layoutmanager.core.Component c(com.taobao.tao.flexbox.layoutmanager.core.aa r4) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.component.ac.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            java.lang.String r4 = "1a4cbecd"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            com.taobao.tao.flexbox.layoutmanager.core.Component r4 = (com.taobao.tao.flexbox.layoutmanager.core.Component) r4
            return r4
        L18:
            com.taobao.tao.flexbox.layoutmanager.core.aa r4 = r4.J()
        L1c:
            if (r4 == 0) goto L3b
            com.taobao.tao.flexbox.layoutmanager.core.Component r0 = r4.I()
            boolean r0 = r0 instanceof tb.ofo
            if (r0 != 0) goto L3b
            com.taobao.tao.flexbox.layoutmanager.core.Component r0 = r4.I()
            boolean r0 = r0 instanceof com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent
            if (r0 != 0) goto L3b
            com.taobao.tao.flexbox.layoutmanager.core.Component r0 = r4.I()
            boolean r0 = r0 instanceof com.taobao.tao.flexbox.layoutmanager.component.c
            if (r0 != 0) goto L3b
            com.taobao.tao.flexbox.layoutmanager.core.aa r4 = r4.J()
            goto L1c
        L3b:
            if (r4 == 0) goto L42
            com.taobao.tao.flexbox.layoutmanager.core.Component r4 = r4.I()
            return r4
        L42:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.ac.c(com.taobao.tao.flexbox.layoutmanager.core.aa):com.taobao.tao.flexbox.layoutmanager.core.Component");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Component component = this.d;
        if (component != null) {
            b(component);
        }
        Component component2 = this.e;
        if (component2 == null) {
            return;
        }
        b(component2);
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        Component component = this.d;
        if (component == null) {
            return 0;
        }
        View view = component.getView();
        if (view instanceof RecyclerView) {
            return ((RecyclerView) view).getScrollState();
        }
        Component component2 = this.d;
        if (!(component2 instanceof ScrollViewComponent)) {
            return 0;
        }
        return ((ScrollViewComponent) component2).getScrollState();
    }

    private boolean c(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa705065", new Object[]{this, component})).booleanValue();
        }
        View view = component.getView();
        return view != null && oec.c(view);
    }
}
