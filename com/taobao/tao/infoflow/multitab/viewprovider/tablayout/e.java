package com.taobao.tao.infoflow.multitab.viewprovider.tablayout;

import android.graphics.Rect;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.n;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.infoflow.multitab.i;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a;
import com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a;
import tb.kge;
import tb.lmt;

/* loaded from: classes8.dex */
public class e implements a.InterfaceC0864a, a.b, a.InterfaceC0865a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f20666a;
    private View b;
    private final b c;
    private final lmt d;
    private boolean e;
    private MultiTabLayout f;
    private int g = -1;
    private boolean h;
    private FrameLayout i;
    private LinearLayout j;
    private final i k;
    private boolean l;

    static {
        kge.a(1563535610);
        kge.a(1899295032);
        kge.a(1859269034);
        kge.a(1169888983);
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.InterfaceC0864a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.InterfaceC0865a
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.b
    public void b(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1787bdf6", new Object[]{this, new Integer(i), jSONObject});
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.InterfaceC0865a
    public void n_(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa5584b", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ boolean a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7a7cbd41", new Object[]{eVar})).booleanValue() : eVar.e;
    }

    public e(lmt lmtVar, b bVar, i iVar) {
        this.c = bVar;
        this.d = lmtVar;
        this.k = iVar;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.b
    public void a(int i, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8252c2bf", new Object[]{this, new Integer(i), jSONObject, new Boolean(z)});
        } else if (!this.h) {
        } else {
            this.l = true;
            this.c.a(this.f20666a, this.b, i, this.d, d());
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.h) {
        } else {
            this.c.a(this.f20666a, this.b, this.f.getSelectedTabPosition(), this.d, d());
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.InterfaceC0864a
    public void l_(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d8e1c9", new Object[]{this, new Integer(i)});
        } else if (!this.h) {
        } else {
            b(i);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.InterfaceC0865a
    public void a(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26181c1e", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        } else if (!this.h) {
        } else {
            c();
        }
    }

    private void a(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363e3eb", new Object[]{this, frameLayout});
            return;
        }
        View view = this.f20666a;
        if (view != null) {
            frameLayout.removeView(view);
            this.f20666a = null;
        }
        View view2 = this.b;
        if (view2 == null) {
            return;
        }
        frameLayout.removeView(view2);
        this.b = null;
    }

    public void a(final MultiTabLayout multiTabLayout, FrameLayout frameLayout, LinearLayout linearLayout, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27da0187", new Object[]{this, multiTabLayout, frameLayout, linearLayout, new Integer(i)});
            return;
        }
        this.f = multiTabLayout;
        this.g = i;
        this.i = frameLayout;
        this.j = linearLayout;
        a(frameLayout);
        this.f20666a = this.c.a(multiTabLayout.getContext(), i, true);
        this.b = this.c.a(multiTabLayout);
        this.f20666a.setBackgroundColor(0);
        this.f20666a.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TabLayout.d tabAt;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (!e.a(e.this) || (tabAt = multiTabLayout.getTabAt(i)) == null) {
                } else {
                    tabAt.f();
                }
            }
        });
        this.h = true;
    }

    private void b(int i) {
        View childTabView;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        lmt.a aVar = this.d.u.get(Integer.valueOf(this.g));
        if (aVar == null || !aVar.k || (childTabView = this.f.getChildTabView(this.g)) == null) {
            return;
        }
        int left = childTabView.getLeft();
        int width = childTabView.getWidth();
        if (i < left) {
            z = false;
        }
        a(z, width);
        a(z);
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.b == null) {
        } else {
            if (!d() || !this.d.m || !z) {
                this.i.removeView(this.b);
                return;
            }
            if (this.b.getParent() != null) {
                ((ViewGroup) this.b.getParent()).removeView(this.b);
            }
            int width = (this.f.getChildTabView(this.g).getWidth() - this.f.getIndicatorConfig().b) / 2;
            ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 80;
                layoutParams2.leftMargin = width;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.f.getIndicatorConfig().c;
            }
            this.b.setLayoutParams(layoutParams);
            this.i.addView(this.b);
        }
    }

    private void a(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c190d17", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        if (n.n().e() && this.l && this.f20666a != null) {
            int a2 = f.a(this.f.getContext(), this.d.n);
            this.f20666a.setPadding(a2, e(), a2, 0);
            this.l = false;
        }
        if (z && !this.e) {
            g.a("TabStickyView", "recommendFloatView 显示:");
            if (this.f20666a.getParent() != null) {
                ((ViewGroup) this.f20666a.getParent()).removeView(this.f20666a);
            }
            int a3 = f.a(this.f.getContext(), this.d.n);
            this.f20666a.setPadding(a3, e(), a3, 0);
            this.j.setX(i);
            this.j.setScrollX(i);
            this.i.addView(this.f20666a);
            this.e = true;
        }
        if (z || !this.e) {
            return;
        }
        g.a("TabStickyView", "recommendFloatView 隐藏:");
        this.j.setX(0.0f);
        this.j.setScrollX(0);
        this.i.removeView(this.f20666a);
        this.e = false;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        lmt.a aVar = this.d.u.get(Integer.valueOf(this.g));
        if (aVar == null || !aVar.k || this.f20666a == null) {
            return;
        }
        Rect rect = new Rect();
        View childTabView = this.f.getChildTabView(this.g);
        if (childTabView == null) {
            return;
        }
        boolean localVisibleRect = childTabView.getLocalVisibleRect(rect);
        int width = childTabView.getWidth();
        int width2 = rect.width() - width;
        boolean z = width2 < 0;
        int i = -width;
        boolean z2 = (width2 >= i && width2 < i / 2) || width2 >= 0;
        if (z) {
            a(true, width);
        }
        if (!localVisibleRect || !z2) {
            return;
        }
        a(false, width);
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.k.h() == this.g;
    }

    private int e() {
        View b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        TabLayout.d tabAt = this.f.getTabAt(this.g);
        if (tabAt != null && (b = tabAt.b()) != null) {
            return b.getTop();
        }
        return 0;
    }
}
