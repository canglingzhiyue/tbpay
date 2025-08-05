package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.component.w;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.c;
import com.taobao.tao.flexbox.layoutmanager.filter.Utils;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.odx;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogl;
import tb.ohb;
import tb.ohd;

/* loaded from: classes8.dex */
public class u extends Component<CustomTabLayout, a> implements w.a, com.taobao.tao.flexbox.layoutmanager.core.p, com.taobao.tao.flexbox.layoutmanager.core.s, com.taobao.tao.flexbox.layoutmanager.core.z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private w e;
    private b h;
    private com.taobao.tao.flexbox.layoutmanager.core.m i;
    private com.taobao.tao.flexbox.layoutmanager.core.r j;
    private HashMap<com.taobao.tao.flexbox.layoutmanager.core.aa, Boolean> m;
    private boolean o;
    private boolean p;
    private int c = 0;
    private int d = 0;
    private List<com.taobao.tao.flexbox.layoutmanager.core.aa> f = new LinkedList();
    private boolean g = true;

    /* renamed from: a  reason: collision with root package name */
    public boolean f20193a = false;
    public boolean b = false;
    private com.taobao.tao.flexbox.layoutmanager.core.c q = new c.a<CustomTabLayout, a>() { // from class: com.taobao.tao.flexbox.layoutmanager.component.u.1
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
        public void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, a aVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb5a880e", new Object[]{this, aaVar, aVar, str, obj});
            } else if (aVar == null) {
            } else {
                aVar.a(aaVar.N(), str, obj);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, CustomTabLayout customTabLayout, a aVar, aa.d dVar) {
            Drawable a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9067d4b", new Object[]{this, fVar, customTabLayout, aVar, dVar});
            } else if (aVar == null || customTabLayout == null) {
            } else {
                if (aVar.f20198a > 0) {
                    customTabLayout.setSelectedTabIndicatorHeight(aVar.f20198a);
                }
                if (aVar.b > 0) {
                    customTabLayout.setSelectedTabIndicatorWidth(aVar.b);
                }
                if (aVar.d != null) {
                    u.a(u.this, aVar);
                } else if (aVar.c != 1) {
                    customTabLayout.setSelectedTabIndicatorColor(aVar.c);
                }
                if (a.a(aVar) != null) {
                    Drawable a3 = com.taobao.tao.flexbox.layoutmanager.drawable.b.a(a.a(aVar), aVar.e);
                    if (a3 != null) {
                        customTabLayout.setSelectedTabIndicatorDrawable(a3);
                    }
                } else if (aVar.e > 0 && (a2 = com.taobao.tao.flexbox.layoutmanager.drawable.b.a(aVar.c, aVar.e)) != null) {
                    customTabLayout.setSelectedTabIndicatorDrawable(a2);
                }
                if (Build.VERSION.SDK_INT < 17 || aVar.f <= 0) {
                    return;
                }
                customTabLayout.setPaddingRelative(customTabLayout.getPaddingLeft(), customTabLayout.getPaddingTop(), customTabLayout.getPaddingRight(), aVar.f);
            }
        }
    };
    private com.taobao.tao.flexbox.layoutmanager.core.c n = new c.a<CustomTabLayout, a>() { // from class: com.taobao.tao.flexbox.layoutmanager.component.u.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, CustomTabLayout customTabLayout, a aVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9067d4b", new Object[]{this, fVar, customTabLayout, aVar, dVar});
            } else {
                customTabLayout.updateFixedOffset(aVar);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, a aVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb5a880e", new Object[]{this, aaVar, aVar, str, obj});
            } else if (aVar == null) {
            } else {
                aVar.D = oec.a(obj, false);
            }
        }
    };
    private ScrollChangeListener k = new ScrollChangeListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.u.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onNestScroll(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10a7e84b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onScroll(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9628353", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("totalX", Integer.valueOf(i));
            hashMap.put("totalY", Integer.valueOf(i2));
            hashMap.put("offsetX", Integer.valueOf(ohd.b(u.this.getNode(), ((CustomTabLayout) u.a(u.this)).getContext(), i)));
            hashMap.put("offsetY", Integer.valueOf(ohd.b(u.this.getNode(), ((CustomTabLayout) u.b(u.this)).getContext(), i2)));
            View childAt = ((CustomTabLayout) u.e(u.this)).getChildAt(0);
            hashMap.put("contentWidth", Integer.valueOf(ohd.b(u.this.getNode(), ((CustomTabLayout) u.f(u.this)).getContext(), childAt.getWidth())));
            hashMap.put("contentHeight", Integer.valueOf(ohd.b(u.this.getNode(), ((CustomTabLayout) u.g(u.this)).getContext(), childAt.getHeight())));
            hashMap.put("width", Integer.valueOf(ohd.b(u.this.getNode(), ((CustomTabLayout) u.h(u.this)).getContext(), ((CustomTabLayout) u.i(u.this)).getWidth())));
            hashMap.put("height", Integer.valueOf(ohd.b(u.this.getNode(), ((CustomTabLayout) u.c(u.this)).getContext(), ((CustomTabLayout) u.d(u.this)).getHeight())));
            u uVar = u.this;
            uVar.sendMessage(uVar.getNode(), "onscroll", null, hashMap, null);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onScrollStateChanged(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faf93876", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (i != 0) {
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("type", "item");
                u.a(u.this, false, hashMap);
            }
        }
    };
    private CustomTabLayout.b l = new CustomTabLayout.b() { // from class: com.taobao.tao.flexbox.layoutmanager.component.u.6
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.b
        public void a(CustomTabLayout.d dVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26787afb", new Object[]{this, dVar, new Boolean(z)});
                return;
            }
            if (dVar.d() != u.n(u.this) && !u.this.b) {
                ogg.c("TabBar", "onTabSelected, oldIndex:" + u.n(u.this) + " newIndex:" + dVar.d() + " group:" + ((a) u.o(u.this)).m + " userClick:" + z);
                HashMap hashMap = new HashMap();
                hashMap.put("oldIndex", Integer.valueOf(u.n(u.this)));
                hashMap.put("newIndex", Integer.valueOf(dVar.d()));
                hashMap.put("group", ((a) u.q(u.this)).m);
                u uVar = u.this;
                uVar.sendMessage(uVar.getNode(), "selectTab", null, hashMap, null);
            }
            if (dVar.d() != u.n(u.this)) {
                u.this.b = false;
            }
            u uVar2 = u.this;
            u.a(uVar2, u.n(uVar2));
            u.b(u.this, dVar.d());
            if (!z) {
                return;
            }
            ((a) u.r(u.this)).g = dVar.d();
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.b
        public void a(CustomTabLayout.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6eb16f9", new Object[]{this, dVar});
            } else if (!((a) u.p(u.this)).B) {
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("oldIndex", Integer.valueOf(dVar.d()));
                hashMap.put("newIndex", Integer.valueOf(dVar.d()));
                hashMap.put("group", ((a) u.s(u.this)).m);
                u uVar = u.this;
                uVar.sendMessage(uVar.getNode(), "ontabselected", null, hashMap, null);
            }
        }
    };

    static {
        kge.a(-1021315068);
        kge.a(-1353647536);
        kge.a(-1420926486);
        kge.a(-906966987);
        kge.a(-1699772040);
    }

    public static /* synthetic */ Object ipc$super(u uVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2141646649:
                super.applyAttrForView((View) objArr[0], (ogl) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -670057321:
                super.handleChildDeleted((com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[0], ((Number) objArr[1]).intValue(), (com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[2]);
                return null;
            case -486998538:
                super.handleChildMoved((com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), (com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[3]);
                return null;
            case 258418204:
                return new Boolean(super.invoke((g.c) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (g.d) objArr[3]));
            case 505817802:
                return super.getAttributeHandler((String) objArr[0]);
            case 1015965122:
                super.onLayoutChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Boolean) objArr[4]).booleanValue());
                return null;
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1277574414:
                super.onInitAttrs((com.taobao.tao.flexbox.layoutmanager.core.f) objArr[0], (View) objArr[1], (ogl) objArr[2], (aa.d) objArr[3]);
                return null;
            case 1964402429:
                super.onRenderCompleted();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ void applyAttrForView(CustomTabLayout customTabLayout, a aVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805910c7", new Object[]{this, customTabLayout, aVar, map, new Boolean(z)});
        } else {
            a(customTabLayout, aVar, map, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.tao.flexbox.layoutmanager.component.u$a, tb.ogl] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ a mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View, com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ CustomTabLayout onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : a(context);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ void onInitAttrs(com.taobao.tao.flexbox.layoutmanager.core.f fVar, CustomTabLayout customTabLayout, a aVar, aa.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c263d0e", new Object[]{this, fVar, customTabLayout, aVar, dVar});
        } else {
            a(fVar, customTabLayout, aVar, dVar);
        }
    }

    public static /* synthetic */ int a(u uVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c57f9a79", new Object[]{uVar, new Integer(i)})).intValue();
        }
        uVar.d = i;
        return i;
    }

    public static /* synthetic */ View a(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("80f9071f", new Object[]{uVar}) : uVar.view;
    }

    public static /* synthetic */ void a(u uVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8490b035", new Object[]{uVar, aVar});
        } else {
            uVar.a(aVar);
        }
    }

    public static /* synthetic */ void a(u uVar, boolean z, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c475284e", new Object[]{uVar, new Boolean(z), map});
        } else {
            uVar.a(z, map);
        }
    }

    public static /* synthetic */ int b(u uVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6b5ed58", new Object[]{uVar, new Integer(i)})).intValue();
        }
        uVar.c = i;
        return i;
    }

    public static /* synthetic */ View b(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("4804ee20", new Object[]{uVar}) : uVar.view;
    }

    public static /* synthetic */ View c(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f10d521", new Object[]{uVar}) : uVar.view;
    }

    public static /* synthetic */ View d(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d61cbc22", new Object[]{uVar}) : uVar.view;
    }

    public static /* synthetic */ View e(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("9d28a323", new Object[]{uVar}) : uVar.view;
    }

    public static /* synthetic */ View f(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("64348a24", new Object[]{uVar}) : uVar.view;
    }

    public static /* synthetic */ View g(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("2b407125", new Object[]{uVar}) : uVar.view;
    }

    public static /* synthetic */ View h(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f24c5826", new Object[]{uVar}) : uVar.view;
    }

    public static /* synthetic */ View i(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b9583f27", new Object[]{uVar}) : uVar.view;
    }

    public static /* synthetic */ View j(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("80642628", new Object[]{uVar}) : uVar.view;
    }

    public static /* synthetic */ View k(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("47700d29", new Object[]{uVar}) : uVar.view;
    }

    public static /* synthetic */ ogl l(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("8151608a", new Object[]{uVar}) : uVar.viewParams;
    }

    public static /* synthetic */ View m(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d587db2b", new Object[]{uVar}) : uVar.view;
    }

    public static /* synthetic */ int n(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d554b05d", new Object[]{uVar})).intValue() : uVar.c;
    }

    public static /* synthetic */ ogl o(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("3e0caf67", new Object[]{uVar}) : uVar.viewParams;
    }

    public static /* synthetic */ ogl p(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("d24b1f06", new Object[]{uVar}) : uVar.viewParams;
    }

    public static /* synthetic */ ogl q(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("66898ea5", new Object[]{uVar}) : uVar.viewParams;
    }

    public static /* synthetic */ ogl r(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("fac7fe44", new Object[]{uVar}) : uVar.viewParams;
    }

    public static /* synthetic */ ogl s(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("8f066de3", new Object[]{uVar}) : uVar.viewParams;
    }

    public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, CustomTabLayout customTabLayout, a aVar, aa.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9067d4b", new Object[]{this, fVar, customTabLayout, aVar, dVar});
            return;
        }
        super.onInitAttrs(fVar, customTabLayout, aVar, dVar);
        this.n.a(fVar, (com.taobao.tao.flexbox.layoutmanager.core.f) customTabLayout, (CustomTabLayout) aVar, dVar);
    }

    public CustomTabLayout a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomTabLayout) ipChange.ipc$dispatch("9a5defc7", new Object[]{this, context});
        }
        CustomTabLayout customTabLayout = new CustomTabLayout(context);
        customTabLayout.setTabMode(0);
        if (!TextUtils.isEmpty(((a) this.viewParams).n)) {
            customTabLayout.setTabAlign(((a) this.viewParams).n);
        }
        customTabLayout.setOnTabSelectedListener(this.l);
        customTabLayout.settNode(getNode());
        customTabLayout.addScrollChangedListener(this.k);
        if (((a) this.viewParams).A) {
            customTabLayout.enableEdgeEffect();
        }
        return customTabLayout;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onViewCreated() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6b63ab", new Object[]{this});
            return;
        }
        if (x.a(this.node, ((a) this.viewParams).m, true) != null) {
            z = true;
        }
        this.f20193a = z;
        ab.e S = this.node.S();
        if (S != null) {
            S.a("onpageselected", this);
            S.a("onpagescroll", this);
            S.a("onpagewillappear", this);
        }
        this.e = w.a(this.node.k(), this, ((a) this.viewParams).m);
        this.e.a(this);
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (this.viewParams == 0 || this.view == 0 || ((a) this.viewParams).g >= ((CustomTabLayout) this.view).getTabCount() || ((CustomTabLayout) this.view).getSelectedTabPosition() == ((a) this.viewParams).g || ((CustomTabLayout) this.view).getTabAt(((a) this.viewParams).g) == null) {
            z = false;
        } else {
            ogg.c("TabBar", "selectTabInternal, oldIndex:" + ((CustomTabLayout) this.view).getSelectedTabPosition() + " newIndex:" + ((a) this.viewParams).g);
            ((CustomTabLayout) this.view).getTabAt(((a) this.viewParams).g).e();
        }
        this.b = false;
        return z;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutChanged(int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8e65c2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        super.onLayoutChanged(i, i2, i3, i4, z);
        if (this.view == 0 || i == i3 || z) {
            return;
        }
        ((CustomTabLayout) this.view).setTranslationY(0.0f);
    }

    public void a(CustomTabLayout customTabLayout, a aVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69d4000", new Object[]{this, customTabLayout, aVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(customTabLayout, this.viewParams, map, z);
        if (aVar == null) {
            return;
        }
        this.q.a((com.taobao.tao.flexbox.layoutmanager.core.f) this, (u) customTabLayout, (CustomTabLayout) aVar, (aa.d) null);
        customTabLayout.setSelectFontSize(aVar.p, aVar.o);
        customTabLayout.setUnselectFontSize(aVar.r, aVar.q);
        customTabLayout.setSelectFontColor(aVar.t, aVar.s);
        customTabLayout.setUnselectFontColor(aVar.v, aVar.u);
        customTabLayout.setSelectFontStyle(aVar.x, aVar.w);
        customTabLayout.setUnselectFontStyle(aVar.z, aVar.y);
        customTabLayout.setDiffHeight(aVar.l);
        if (!this.g) {
            return;
        }
        this.g = false;
        int max = Math.max(b(), ((a) this.viewParams).g);
        if (((a) this.viewParams).g != max) {
            ((a) this.viewParams).g = max;
        }
        if (max <= 0) {
            return;
        }
        this.b = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
        if (r6.equals("indicator-bottom") != false) goto L12;
     */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.tao.flexbox.layoutmanager.core.c getAttributeHandler(java.lang.String r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.component.u.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r5
            r1[r2] = r6
            java.lang.String r6 = "1e262aca"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            com.taobao.tao.flexbox.layoutmanager.core.c r6 = (com.taobao.tao.flexbox.layoutmanager.core.c) r6
            return r6
        L18:
            if (r6 == 0) goto L79
            r0 = -1
            int r1 = r6.hashCode()
            switch(r1) {
                case -945332980: goto L64;
                case -887740503: goto L5a;
                case -725541211: goto L4f;
                case -443090416: goto L44;
                case 2050488869: goto L39;
                case 2055959581: goto L2e;
                case 2068773000: goto L23;
                default: goto L22;
            }
        L22:
            goto L6e
        L23:
            java.lang.String r1 = "indicator-width"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L6e
            r2 = 3
            goto L6f
        L2e:
            java.lang.String r1 = "indicator-image"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L6e
            r2 = 4
            goto L6f
        L39:
            java.lang.String r1 = "indicator-color"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L6e
            r2 = 0
            goto L6f
        L44:
            java.lang.String r1 = "indicator-radius"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L6e
            r2 = 5
            goto L6f
        L4f:
            java.lang.String r1 = "indicator-height"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L6e
            r2 = 2
            goto L6f
        L5a:
            java.lang.String r1 = "indicator-bottom"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L6e
            goto L6f
        L64:
            java.lang.String r1 = "fixed-offset"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L6e
            r2 = 6
            goto L6f
        L6e:
            r2 = -1
        L6f:
            switch(r2) {
                case 0: goto L76;
                case 1: goto L76;
                case 2: goto L76;
                case 3: goto L76;
                case 4: goto L76;
                case 5: goto L76;
                case 6: goto L73;
                default: goto L72;
            }
        L72:
            goto L79
        L73:
            com.taobao.tao.flexbox.layoutmanager.core.c r6 = r5.n
            return r6
        L76:
            com.taobao.tao.flexbox.layoutmanager.core.c r6 = r5.q
            return r6
        L79:
            com.taobao.tao.flexbox.layoutmanager.core.c r6 = super.getAttributeHandler(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.u.getAttributeHandler(java.lang.String):com.taobao.tao.flexbox.layoutmanager.core.c");
    }

    private void a(a aVar) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e93ac100", new Object[]{this, aVar});
            return;
        }
        String str = aVar.d;
        boolean startsWith = aVar.d.startsWith("./");
        ImageLoader i = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().i();
        if (startsWith) {
            a2 = oec.a(this.node.N(), str, true);
        } else {
            a2 = i.a(str, this.node.G().f20361a, this.node.G().b, ImageLoader.a.a());
        }
        String str2 = a2;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        i.a(((CustomTabLayout) this.view).getContext(), str2, -1, -1, new ImageLoader.c() { // from class: com.taobao.tao.flexbox.layoutmanager.component.u.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
            public void onImageLoadFailed() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3feabda6", new Object[]{this});
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
            public void onImageLoaded(BitmapDrawable bitmapDrawable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
                } else if (u.k(u.this) == null) {
                } else {
                    ((CustomTabLayout) u.j(u.this)).setSelectedTabIndicatorDrawable(bitmapDrawable);
                }
            }
        });
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildAdded(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc32990", new Object[]{this, aaVar, new Integer(i), aaVar2});
        } else {
            this.node.c(true);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildMoved(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, int i2, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f8fdf6", new Object[]{this, aaVar, new Integer(i), new Integer(i2), aaVar2});
            return;
        }
        this.o = true;
        super.handleChildMoved(aaVar, i, i2, aaVar2);
        this.node.c(true);
        this.o = false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildDeleted(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80fbc97", new Object[]{this, aaVar, new Integer(i), aaVar2});
            return;
        }
        if (oeb.cd()) {
            super.handleChildDeleted(aaVar, i, aaVar2);
        }
        this.node.c(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sortChildren() {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.component.u.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r7
            java.lang.String r2 = "72a97c4"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            boolean r0 = r7.o
            if (r0 == 0) goto L17
            return
        L17:
            com.taobao.tao.flexbox.layoutmanager.core.aa r0 = r7.node
            java.util.List<com.taobao.tao.flexbox.layoutmanager.core.aa> r0 = r0.d
            int r0 = r0.size()
            com.taobao.tao.flexbox.layoutmanager.core.aa r1 = r7.node
            boolean r1 = r1.a()
            if (r1 != 0) goto L5b
            if (r0 <= r3) goto L5b
            V extends android.view.View r4 = r7.view
            if (r4 == 0) goto L5b
            V extends android.view.View r4 = r7.view
            com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout r4 = (com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout) r4
            int r4 = r4.getTabCount()
            if (r0 == r4) goto L38
            goto L5c
        L38:
            r4 = 0
        L39:
            if (r4 >= r0) goto L5b
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r7.node
            java.util.List<com.taobao.tao.flexbox.layoutmanager.core.aa> r5 = r5.d
            java.lang.Object r5 = r5.get(r4)
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = (com.taobao.tao.flexbox.layoutmanager.core.aa) r5
            V extends android.view.View r6 = r7.view
            com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout r6 = (com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout) r6
            com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout$d r6 = r6.getTabAt(r4)
            android.view.View r6 = r6.b()
            android.view.View r5 = r5.x()
            if (r5 == r6) goto L58
            goto L5c
        L58:
            int r4 = r4 + 1
            goto L39
        L5b:
            r3 = r1
        L5c:
            if (r3 == 0) goto La1
            V extends android.view.View r1 = r7.view
            if (r1 == 0) goto L9e
            V extends android.view.View r1 = r7.view
            com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout r1 = (com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout) r1
            r1.removeAllTabs()
            r1 = 0
        L6a:
            if (r1 >= r0) goto L9e
            V extends android.view.View r3 = r7.view
            com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout r3 = (com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout) r3
            V extends android.view.View r4 = r7.view
            com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout r4 = (com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout) r4
            com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout$d r4 = r4.newTab()
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r7.node
            java.util.List<com.taobao.tao.flexbox.layoutmanager.core.aa> r5 = r5.d
            java.lang.Object r5 = r5.get(r1)
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = (com.taobao.tao.flexbox.layoutmanager.core.aa) r5
            android.view.View r5 = r5.x()
            com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout$d r4 = r4.a(r5)
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r7.node
            java.util.List<com.taobao.tao.flexbox.layoutmanager.core.aa> r5 = r5.d
            java.lang.Object r5 = r5.get(r1)
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = (com.taobao.tao.flexbox.layoutmanager.core.aa) r5
            com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout$d r4 = r4.a(r5)
            r3.addTab(r4, r1, r2)
            int r1 = r1 + 1
            goto L6a
        L9e:
            r7.c()
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.u.sortChildren():void");
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.e != null) {
        } else {
            this.e = w.a(this.node.k(), this, ((a) this.viewParams).m);
            this.e.a(this);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onRenderCompleted() {
        Object e;
        CustomTabLayout view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751666fd", new Object[]{this});
            return;
        }
        super.onRenderCompleted();
        boolean c = c();
        if (!this.p && oeb.a("fixTabScrollIndex", true)) {
            this.p = true;
            if (c) {
                ohb.a(this.view, new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.u.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            ((CustomTabLayout) u.m(u.this)).scrollToTab(((a) u.l(u.this)).g);
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa node = getNode();
        d();
        if (!this.e.f() && this.f.isEmpty()) {
            b(node);
        }
        if (node == null || (e = node.e("indicator-hidden")) == null || "false".equals(String.valueOf(e)) || (view = getView()) == null) {
            return;
        }
        view.setIndicatorWillNotDraw(!this.e.f());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public HashMap clickArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("16a46aef", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("oldIndex", Integer.valueOf(this.d));
        hashMap.put("newIndex", Integer.valueOf(this.c));
        return hashMap;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean invoke(g.c cVar, String str, JSONObject jSONObject, g.d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f67261c", new Object[]{this, cVar, str, jSONObject, dVar})).booleanValue();
        }
        char c = 65535;
        if (str.hashCode() == -1923828779 && str.equals("showIndex")) {
            c = 0;
        }
        if (c != 0) {
            z = false;
        } else {
            int intValue = jSONObject.getIntValue("index");
            boolean booleanValue = jSONObject.getBooleanValue("animated");
            if (this.view != 0) {
                ((CustomTabLayout) this.view).setScrollPosition(intValue, 0.0f, false, false, booleanValue);
            }
        }
        return !z ? super.invoke(cVar, str, jSONObject, dVar) : z;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        super.detach(z);
        w wVar = this.e;
        if (wVar != null) {
            wVar.b(this);
        }
        ab.e S = this.node.S();
        if (S != null) {
            S.b("onpageselected", this);
            S.b("onpagescroll", this);
            S.b("onpagewillappear", this);
        }
        com.taobao.tao.flexbox.layoutmanager.core.m mVar = this.i;
        if (mVar != null) {
            mVar.d();
        }
        this.i = null;
        this.j = null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void addOrUpdateView(boolean z, View view, com.taobao.tao.flexbox.layoutmanager.core.r rVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1854fc7", new Object[]{this, new Boolean(z), view, rVar, aaVar});
        } else if (view.getParent() != null) {
        } else {
            ((CustomTabLayout) this.view).addTab(((CustomTabLayout) this.view).newTab().a(view).a(aaVar));
        }
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e66a30c6", new Object[]{this}) : new a();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        b bVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        if (str.equals("onpageselected")) {
            if (!odx.a(oec.a(map.get("group"), (String[]) null), ((a) this.viewParams).m)) {
                return false;
            }
            int intValue = ((Integer) map.get("newIndex")).intValue();
            if (this.view != 0 && intValue != ((CustomTabLayout) this.view).getSelectedTabPosition() && ((CustomTabLayout) this.view).getTabAt(intValue) != null) {
                this.b = true;
                ((a) this.viewParams).g = intValue;
                ((CustomTabLayout) this.view).getTabAt(intValue).e();
            }
            return true;
        } else if (str.equals("onpagescroll")) {
            if (!odx.a(oec.a(map.get("group"), (String[]) null), ((a) this.viewParams).m) || !e()) {
                return false;
            }
            if (this.view != 0) {
                ((CustomTabLayout) this.view).setScrollPosition(((Integer) map.get("index")).intValue(), ((Float) map.get("positionOffset")).floatValue(), true);
            }
            return true;
        } else {
            if (str.equals("onpagewillappear") && (bVar2 = this.h) != null && odx.a(new String[]{b.a(bVar2)}, ((a) this.viewParams).m) && b.b(this.h) >= 0 && b.b(this.h) != ((a) this.viewParams).g) {
                HashMap hashMap = new HashMap();
                hashMap.put("newIndex", Integer.valueOf(b.b(this.h)));
                hashMap.put("oldIndex", Integer.valueOf(((a) this.viewParams).g));
                sendMessage(34, aaVar2, "ontabredirect", null, hashMap, null);
                a(b.b(this.h));
                a((b) null);
            }
            return false;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(final aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue();
        }
        if (eVar.c.equals("onwillappear")) {
            if (this.view != 0) {
                ((CustomTabLayout) this.view).post(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.u.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            u.a(u.this, false, eVar.d);
                        }
                    }
                });
            }
        } else if (eVar.c.equals("onwilldisappear")) {
            a(true, eVar.d);
        } else {
            return onHandleTNodeMessage(eVar.f20300a, eVar.b, eVar.c, null, eVar.d, eVar.e);
        }
        return false;
    }

    private boolean a(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7536b92c", new Object[]{this, view, view2})).booleanValue();
        }
        Rect rect = new Rect();
        view.getHitRect(rect);
        return view2.getLocalVisibleRect(rect);
    }

    private void a(boolean z, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d794299", new Object[]{this, new Boolean(z), map});
            return;
        }
        if (this.m == null) {
            this.m = new HashMap<>();
        }
        if (this.view == 0 || this.node == null) {
            return;
        }
        for (int i = 0; i < this.node.d.size(); i++) {
            com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = this.node.d.get(i);
            if (aaVar.x() != null) {
                boolean z2 = !z && a(this.view, aaVar.x());
                Boolean bool = this.m.get(aaVar);
                if (z2 && (bool == null || !bool.booleanValue())) {
                    sendMessage(130, aaVar, "onwillappear", null, map, null);
                } else if (bool != null && bool.booleanValue() && !z2) {
                    sendMessage(Component.MSG_FLAG_DISAPPEAR, aaVar, "onwilldisappear", null, map, null);
                }
                this.m.put(aaVar, Boolean.valueOf(z2));
            }
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            String str = (String) this.node.e("onfold");
            if (str == null) {
                return;
            }
            sendMessage(this.node, "onfold", str, null, null);
        } else {
            String str2 = (String) this.node.e("onunfold");
            if (str2 == null) {
                return;
            }
            sendMessage(this.node, "onunfold", str2, null, null);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.w.a
    public void a(int i, int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1660f9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
        } else if (!e()) {
        } else {
            com.taobao.tao.flexbox.layoutmanager.core.aa b2 = this.node.M().b(TabBarControllerComponent.class);
            boolean z2 = b2 != null && ((TabBarControllerComponent) b2.I()).f();
            if (this.f20193a) {
                return;
            }
            if (!z2 && this.view != 0) {
                ((CustomTabLayout) this.view).setTranslationY(i);
            }
            int i4 = -i;
            a(1.0f - (i4 / i2));
            if (!this.f.isEmpty() && this.view != 0) {
                ((CustomTabLayout) this.view).setIndicatorWillNotDraw(i4 != i2);
            }
            if (i3 == this.e.g()) {
                return;
            }
            if (this.e.g() == 1) {
                a(true);
            } else if (this.e.g() != 2) {
            } else {
                a(false);
            }
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : getViewParams() == null || getViewParams().h <= 0;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        ((a) this.viewParams).g = i;
        c();
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        if (((a) this.viewParams).j != null) {
            for (int i = 0; i < this.node.d.size(); i++) {
                if (Utils.isEqual(((a) this.viewParams).j, this.node.d.get(i).e("key"))) {
                    return i;
                }
            }
        }
        return ((a) this.viewParams).i;
    }

    private void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        for (com.taobao.tao.flexbox.layoutmanager.core.aa aaVar : this.f) {
            aaVar.x().setAlpha(f);
            aaVar.I().getViewParams().aT = f;
        }
    }

    private void b(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aca84e11", new Object[]{this, aaVar});
        } else if (aaVar != null) {
            Object e = aaVar.e("tab-scrollable");
            if (e != null && !"false".equals(String.valueOf(e))) {
                this.f.add(aaVar);
                return;
            }
            for (com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2 : aaVar.d) {
                b(aaVar2);
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public void scrollToPosition(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d225a7a", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        } else {
            scrollToPositionWithNumber(i, z, i2, 0);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public void scrollToPositionWithNumber(int i, boolean z, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb0b758", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3)});
        } else if (this.view == 0) {
        } else {
            ((CustomTabLayout) this.view).scrollToPosition(i, z);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public void scrollTo(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0b0965", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (this.view == 0) {
        } else {
            if (z) {
                ((CustomTabLayout) this.view).smoothScrollTo(i, i2);
            } else {
                ((CustomTabLayout) this.view).scrollTo(i, i2);
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public void scrollBy(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f06fc09", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (this.view == 0) {
        } else {
            if (z) {
                ((CustomTabLayout) this.view).smoothScrollBy(i, i2);
            } else {
                ((CustomTabLayout) this.view).scrollBy(i, i2);
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public int getScrollCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce801786", new Object[]{this})).intValue() : this.node.R();
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e93b355f", new Object[]{this, bVar});
        } else {
            this.h = bVar;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.p
    public void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691d3050", new Object[]{this, aaVar});
        } else if (aaVar.x() == null || aaVar.x().getParent() == null || Build.VERSION.SDK_INT < 21) {
        } else {
            ((ViewGroup) aaVar.x().getParent()).setZ(1.0f);
        }
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f20199a;
        private String b;
        private String c;
        private String d;
        private Map e;

        static {
            kge.a(-788579809);
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c3524921", new Object[]{bVar}) : bVar.d;
        }

        public static /* synthetic */ int b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ecf3e53", new Object[]{bVar})).intValue() : bVar.f20199a;
        }

        public static b a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e47e8dc5", new Object[]{jSONObject});
            }
            b bVar = new b();
            bVar.f20199a = oec.a(jSONObject.get("tabIndex"), -1);
            bVar.b = jSONObject.getString("tabName");
            bVar.c = jSONObject.getString("tabbarId");
            bVar.d = jSONObject.getString("group");
            bVar.e = jSONObject.getJSONObject("extra");
            return bVar;
        }
    }

    /* loaded from: classes8.dex */
    public static class a extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean D;
        public int e;
        public int f;
        public Object j;
        public String[] m;
        public String n;

        /* renamed from: a  reason: collision with root package name */
        public int f20198a = 4;
        public int b = 4;
        public int c = 1;
        public String d = null;
        private ogl.b C = null;
        public int g = 0;
        public int h = -1;
        public int i = 0;
        public boolean k = false;
        public int l = 0;
        public int o = -1;
        public Object p = null;
        public int q = -1;
        public Object r = null;
        public int s = 1;
        public Object t = null;
        public int u = 1;
        public Object v = null;
        public int w = -1;
        public Object x = null;
        public int y = -1;
        public Object z = null;
        public boolean A = false;
        public boolean B = false;

        static {
            kge.a(-1676456924);
        }

        public static /* synthetic */ ogl.b a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ogl.b) ipChange.ipc$dispatch("18315bb4", new Object[]{aVar}) : aVar.C;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
            if (r9.equals("indicator-width") != false) goto L10;
         */
        @Override // tb.ogl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 740
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.u.a.a(android.content.Context, java.lang.String, java.lang.Object):void");
        }
    }
}
