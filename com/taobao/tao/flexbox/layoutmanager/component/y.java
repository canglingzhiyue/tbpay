package com.taobao.tao.flexbox.layoutmanager.component;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.odx;
import tb.oeb;
import tb.oec;
import tb.ofw;
import tb.ofx;
import tb.ogl;
import tb.ohd;

/* loaded from: classes8.dex */
public class y extends Component<View, b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f20212a;
    private boolean b;
    private g.c c;
    private Component e;
    private HashMap<Component, Integer> d = new HashMap<>();
    private boolean g = oeb.a("compareSameRenderInstance", true);
    private ofx.a f = new ofx.a() { // from class: com.taobao.tao.flexbox.layoutmanager.component.y.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.ofx.a
        public void a(Component component, int i) {
            com.taobao.tao.flexbox.layoutmanager.core.aa aaVar;
            View childAt;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("322e9540", new Object[]{this, component, new Integer(i)});
            } else if (component.getNode().d == null || i >= component.getNode().d.size() || (aaVar = component.getNode().d.get(i)) == null) {
            } else {
                y yVar = y.this;
                y.a(yVar, y.a(yVar, aaVar));
                Integer num = (Integer) y.b(y.this).get(y.a(y.this));
                if (num == null) {
                    num = 0;
                }
                int i2 = ((b) y.f(y.this)).f;
                if (i2 <= 0) {
                    return;
                }
                float intValue = (num.intValue() * 1.0f) / i2;
                if (y.g(y.this) == null || (childAt = ((ViewGroup) y.h(y.this)).getChildAt(1)) == null) {
                    return;
                }
                float alpha = childAt.getAlpha();
                if (intValue == alpha) {
                    return;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "alpha", alpha, intValue);
                ofFloat.setDuration(250L);
                ofFloat.start();
            }
        }
    };

    public static /* synthetic */ Object ipc$super(y yVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2141646649) {
            super.applyAttrForView((View) objArr[0], (ogl) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        } else if (hashCode != 1052797818) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.detach(((Boolean) objArr[0]).booleanValue());
            return null;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ void applyAttrForView(View view, b bVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805910c7", new Object[]{this, view, bVar, map, new Boolean(z)});
        } else {
            a(view, bVar, map, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.tao.flexbox.layoutmanager.component.y$b, tb.ogl] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ b mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : a();
    }

    public static /* synthetic */ Component a(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Component) ipChange.ipc$dispatch("9598fb14", new Object[]{yVar}) : yVar.e;
    }

    public static /* synthetic */ Component a(y yVar, Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("4e56308d", new Object[]{yVar, component});
        }
        yVar.e = component;
        return component;
    }

    public static /* synthetic */ Component a(y yVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Component) ipChange.ipc$dispatch("1f8e0d3c", new Object[]{yVar, aaVar}) : yVar.a(aaVar);
    }

    public static /* synthetic */ HashMap b(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("73875bd", new Object[]{yVar}) : yVar.d;
    }

    public static /* synthetic */ void b(y yVar, Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b802ef1", new Object[]{yVar, component});
        } else {
            yVar.a(component);
        }
    }

    public static /* synthetic */ ogl c(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("9eb23ef7", new Object[]{yVar}) : yVar.viewParams;
    }

    public static /* synthetic */ View d(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f033a69e", new Object[]{yVar}) : yVar.view;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa e(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("9bd3aa41", new Object[]{yVar}) : yVar.node;
    }

    public static /* synthetic */ ogl f(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("5b6d8dd4", new Object[]{yVar}) : yVar.viewParams;
    }

    public static /* synthetic */ View g(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("45575ba1", new Object[]{yVar}) : yVar.view;
    }

    public static /* synthetic */ View h(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c6342a2", new Object[]{yVar}) : yVar.view;
    }

    public static /* synthetic */ ogl i(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("1828dcb1", new Object[]{yVar}) : yVar.viewParams;
    }

    public static /* synthetic */ boolean j(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("30052ce6", new Object[]{yVar})).booleanValue() : yVar.g;
    }

    public static /* synthetic */ void k(y yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59598223", new Object[]{yVar});
        } else {
            yVar.d();
        }
    }

    public static /* synthetic */ ogl l(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("d4e42b8e", new Object[]{yVar}) : yVar.viewParams;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa m(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("6039ad39", new Object[]{yVar}) : yVar.node;
    }

    public static /* synthetic */ ogl n(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("fd610acc", new Object[]{yVar}) : yVar.viewParams;
    }

    public static /* synthetic */ ogl o(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("919f7a6b", new Object[]{yVar}) : yVar.viewParams;
    }

    static {
        kge.a(1910209263);
        f20212a = "newThemeEnabled";
    }

    /* loaded from: classes8.dex */
    public class a implements ScrollChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Component b;

        static {
            kge.a(1832808069);
            kge.a(771458270);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onNestScroll(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10a7e84b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onScrollStateChanged(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faf93876", new Object[]{this, new Integer(i), new Integer(i2)});
            }
        }

        public a(Component component) {
            this.b = component;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
            if (r9 == r10) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onScroll(int r8, int r9, int r10, int r11) {
            /*
                r7 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.component.y.a.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 1
                if (r1 == 0) goto L32
                r1 = 5
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r3 = 0
                r1[r3] = r7
                java.lang.Integer r3 = new java.lang.Integer
                r3.<init>(r8)
                r1[r2] = r3
                r8 = 2
                java.lang.Integer r2 = new java.lang.Integer
                r2.<init>(r9)
                r1[r8] = r2
                r8 = 3
                java.lang.Integer r9 = new java.lang.Integer
                r9.<init>(r10)
                r1[r8] = r9
                r8 = 4
                java.lang.Integer r9 = new java.lang.Integer
                r9.<init>(r11)
                r1[r8] = r9
                java.lang.String r8 = "e9628353"
                r0.ipc$dispatch(r8, r1)
                return
            L32:
                if (r10 != 0) goto L37
                if (r11 != 0) goto L37
                return
            L37:
                com.taobao.tao.flexbox.layoutmanager.component.y r8 = com.taobao.tao.flexbox.layoutmanager.component.y.this
                com.taobao.tao.flexbox.layoutmanager.core.Component r8 = com.taobao.tao.flexbox.layoutmanager.component.y.a(r8)
                if (r8 != 0) goto L46
                com.taobao.tao.flexbox.layoutmanager.component.y r8 = com.taobao.tao.flexbox.layoutmanager.component.y.this
                com.taobao.tao.flexbox.layoutmanager.core.Component r10 = r7.b
                com.taobao.tao.flexbox.layoutmanager.component.y.a(r8, r10)
            L46:
                com.taobao.tao.flexbox.layoutmanager.component.y r8 = com.taobao.tao.flexbox.layoutmanager.component.y.this
                java.util.HashMap r8 = com.taobao.tao.flexbox.layoutmanager.component.y.b(r8)
                com.taobao.tao.flexbox.layoutmanager.core.Component r10 = r7.b
                java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
                r8.put(r10, r11)
                com.taobao.tao.flexbox.layoutmanager.component.y r8 = com.taobao.tao.flexbox.layoutmanager.component.y.this
                tb.ogl r8 = com.taobao.tao.flexbox.layoutmanager.component.y.c(r8)
                com.taobao.tao.flexbox.layoutmanager.component.y$b r8 = (com.taobao.tao.flexbox.layoutmanager.component.y.b) r8
                int r8 = r8.f
                if (r8 > 0) goto L62
                return
            L62:
                if (r9 <= r8) goto L65
                goto L8b
            L65:
                if (r9 >= r8) goto L8c
                com.taobao.tao.flexbox.layoutmanager.component.y r10 = com.taobao.tao.flexbox.layoutmanager.component.y.this
                com.taobao.tao.flexbox.layoutmanager.core.Component r10 = com.taobao.tao.flexbox.layoutmanager.component.y.a(r10)
                boolean r10 = r10 instanceof com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent
                if (r10 == 0) goto L8c
                com.taobao.tao.flexbox.layoutmanager.component.y r10 = com.taobao.tao.flexbox.layoutmanager.component.y.this
                com.taobao.tao.flexbox.layoutmanager.core.Component r10 = com.taobao.tao.flexbox.layoutmanager.component.y.a(r10)
                com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent r10 = (com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent) r10
                android.view.View r10 = r10.getScrollView()
                boolean r11 = r10 instanceof com.taobao.tao.flexbox.layoutmanager.view.AbsTNodeScrollView
                if (r11 == 0) goto L8c
                com.taobao.tao.flexbox.layoutmanager.view.AbsTNodeScrollView r10 = (com.taobao.tao.flexbox.layoutmanager.view.AbsTNodeScrollView) r10
                int r10 = r10.getMaxScrollOffset()
                if (r10 <= 0) goto L8c
                if (r9 != r10) goto L8c
            L8b:
                r9 = r8
            L8c:
                com.taobao.tao.flexbox.layoutmanager.component.y r10 = com.taobao.tao.flexbox.layoutmanager.component.y.this
                android.view.View r10 = com.taobao.tao.flexbox.layoutmanager.component.y.d(r10)
                android.view.ViewGroup r10 = (android.view.ViewGroup) r10
                android.view.View r10 = r10.getChildAt(r2)
                if (r10 == 0) goto Lda
                float r11 = r10.getAlpha()
                float r0 = (float) r9
                r1 = 1065353216(0x3f800000, float:1.0)
                float r0 = r0 * r1
                float r8 = (float) r8
                float r0 = r0 / r8
                int r8 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                if (r8 == 0) goto Lda
                r10.setAlpha(r0)
                int r8 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r8 == 0) goto Lb4
                int r8 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                if (r8 != 0) goto Lda
            Lb4:
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.lang.Float r8 = java.lang.Float.valueOf(r0)
                java.lang.String r10 = "alpha"
                r5.put(r10, r8)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
                java.lang.String r9 = "y"
                r5.put(r9, r8)
                com.taobao.tao.flexbox.layoutmanager.component.y r1 = com.taobao.tao.flexbox.layoutmanager.component.y.this
                com.taobao.tao.flexbox.layoutmanager.core.aa r2 = com.taobao.tao.flexbox.layoutmanager.component.y.e(r1)
                r4 = 0
                r6 = 0
                java.lang.String r3 = "onthemechanged"
                r1.sendMessage(r2, r3, r4, r5, r6)
            Lda:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.y.a.onScroll(int, int, int, int):void");
        }
    }

    private Component a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("937fe04b", new Object[]{this, aaVar});
        }
        ArrayList arrayList = new ArrayList();
        aaVar.a(new aa.c<com.taobao.tao.flexbox.layoutmanager.core.aa>() { // from class: com.taobao.tao.flexbox.layoutmanager.component.y.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
            public boolean a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("691d3054", new Object[]{this, aaVar2})).booleanValue();
                }
                boolean a2 = odx.a(odx.b(aaVar2.e("group")), ((b) y.i(y.this)).g);
                if (!a2 || !y.j(y.this)) {
                    return a2;
                }
                if (aaVar2.c() != y.this.getNode().c()) {
                    z = false;
                }
                return a2 & z;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
            public boolean b(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("aca84e15", new Object[]{this, aaVar2})).booleanValue() : aaVar2.I() instanceof com.taobao.tao.flexbox.layoutmanager.core.z;
            }
        }, arrayList, 2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.get(0).I();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        View a2 = a(context);
        if (a2 == null) {
            z = false;
        }
        this.b = z;
        if (a2 == null) {
            a2 = new TNodeImageView(context);
            ((TNodeImageView) a2).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        this.c = new g.c(this.node.k(), null, new g.d() { // from class: com.taobao.tao.flexbox.layoutmanager.component.y.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.ac.g.d
            public void a(g.c cVar, g.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fed2540a", new Object[]{this, cVar, aVar});
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.ac.g.d
            public void a(g.c cVar, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb15ed33", new Object[]{this, cVar, obj});
                    return;
                }
                y.k(y.this);
                if (((b) y.l(y.this)).b == null) {
                    return;
                }
                y yVar = y.this;
                yVar.sendMessage(y.m(yVar), "onfestivalchanged", ((b) y.n(y.this)).b, com.taobao.android.layoutmanager.adapter.impl.s.b(), null);
            }
        });
        b();
        if (this.b) {
            ArrayList<com.taobao.tao.flexbox.layoutmanager.core.aa> arrayList = new ArrayList();
            this.node.M().a(new aa.c<com.taobao.tao.flexbox.layoutmanager.core.aa>() { // from class: com.taobao.tao.flexbox.layoutmanager.component.y.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                public boolean a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("691d3054", new Object[]{this, aaVar})).booleanValue() : odx.a(odx.b(aaVar.e("group")), ((b) y.o(y.this)).g);
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                public boolean b(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("aca84e15", new Object[]{this, aaVar})).booleanValue() : aaVar.I() instanceof com.taobao.tao.flexbox.layoutmanager.core.z;
                }
            }, arrayList, 2);
            if (!arrayList.isEmpty()) {
                for (com.taobao.tao.flexbox.layoutmanager.core.aa aaVar : arrayList) {
                    Component I = aaVar.I();
                    if (I == null) {
                        aaVar.a(new aa.a() { // from class: com.taobao.tao.flexbox.layoutmanager.component.y.5
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.a
                            public void a(Component component) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("e0962223", new Object[]{this, component});
                                } else {
                                    y.b(y.this, component);
                                }
                            }
                        });
                    } else {
                        a(I);
                    }
                }
            }
        }
        return a2;
    }

    private void a(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0962223", new Object[]{this, component});
        } else if (component instanceof ScrollViewComponent) {
            ((ScrollViewComponent) component).addScrollChangedListener(new a(component));
        } else if (component instanceof m) {
            ((m) component).a(new a(component));
        } else if (!(component instanceof ofw)) {
        } else {
            ((ofw) component).a().a(this.f);
        }
    }

    private View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        if (!"true".equals(OrangeConfig.getInstance().getConfig("weitao_switch", f20212a, "true"))) {
            return null;
        }
        int i = ((b) this.viewParams).e;
        if (i <= 0) {
            i = ohd.b(context, 48) + ohd.h(context);
        }
        ThemeFrameLayout a2 = com.taobao.android.tbtheme.kit.j.a().a(context, new com.taobao.android.tbtheme.kit.g(((b) this.viewParams).f20219a, 1, i));
        if (((b) this.viewParams).d != 1) {
            a2.setBackgroundColor(((b) this.viewParams).d);
        }
        com.taobao.android.tbtheme.kit.g gVar = new com.taobao.android.tbtheme.kit.g(((b) this.viewParams).f20219a, 0, this.measureResult.b);
        gVar.d = ohd.b(context, 210);
        gVar.i = true;
        gVar.j = ohd.b(context, 30);
        ThemeFrameLayout a3 = com.taobao.android.tbtheme.kit.j.a().a(context, gVar);
        if (a2 == null || a3 == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(a3, new FrameLayout.LayoutParams(-1, -1));
        a2.setAlpha(0.0f);
        frameLayout.addView(a2, new FrameLayout.LayoutParams(-1, i));
        return frameLayout;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.c == null) {
        } else {
            this.node.k().k().a("TNodeFestivalChanged", this.c);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c == null) {
        } else {
            this.node.k().k().b("TNodeFestivalChanged", this.c);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        boolean c = com.taobao.android.layoutmanager.adapter.impl.s.c();
        String h = com.taobao.android.layoutmanager.adapter.impl.s.h();
        if (c) {
            if (this.b) {
                return;
            }
            String i = com.taobao.android.layoutmanager.adapter.impl.s.i();
            if (!oec.a(i, ((TNodeImageView) this.view).getImageSrc())) {
                ((TNodeImageView) this.view).setImageSrc(this.node.k(), i, this.measureResult.f20361a, this.measureResult.b, ImageLoader.a.a("theme", this.node), null, false);
            }
            this.view.setBackgroundColor(odx.a(h));
        } else if (this.b) {
        } else {
            if (!oec.a(((b) this.viewParams).c, ((TNodeImageView) this.view).getImageSrc())) {
                ((TNodeImageView) this.view).setImageSrc(this.node.k(), ((b) this.viewParams).c, this.measureResult.f20361a, this.measureResult.b, ImageLoader.a.a("theme", this.node), null, false);
            }
            this.view.setBackgroundColor(odx.a(h));
        }
    }

    public void a(View view, b bVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa8dfcc", new Object[]{this, view, bVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(view, bVar, map, z);
        d();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        super.detach(z);
        c();
        this.c = null;
    }

    public b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("e66c0261", new Object[]{this}) : new b();
    }

    /* loaded from: classes8.dex */
    public static class b extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String b;
        public String c;
        public String[] g;

        /* renamed from: a  reason: collision with root package name */
        public String f20219a = "guangguang";
        public int d = 1;
        public int e = 0;
        public int f = 0;

        static {
            kge.a(-1257053345);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
            if (r9.equals("navi-background-color") != false) goto L11;
         */
        @Override // tb.ogl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
            /*
                r7 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.component.y.b.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                r6 = 4
                if (r1 == 0) goto L1b
                java.lang.Object[] r1 = new java.lang.Object[r6]
                r1[r5] = r7
                r1[r4] = r8
                r1[r3] = r9
                r1[r2] = r10
                java.lang.String r8 = "840caf86"
                r0.ipc$dispatch(r8, r1)
                return
            L1b:
                r0 = -1
                int r1 = r9.hashCode()
                switch(r1) {
                    case -2135934674: goto L62;
                    case -329578165: goto L58;
                    case -96848354: goto L4e;
                    case 98629247: goto L44;
                    case 678673294: goto L3a;
                    case 1245457021: goto L2f;
                    case 1597774718: goto L24;
                    default: goto L23;
                }
            L23:
                goto L6d
            L24:
                java.lang.String r1 = "max-scroll-height"
                boolean r9 = r9.equals(r1)
                if (r9 == 0) goto L6d
                r2 = 6
                goto L6e
            L2f:
                java.lang.String r1 = "onfestivalchanged"
                boolean r9 = r9.equals(r1)
                if (r9 == 0) goto L6d
                r2 = 1
                goto L6e
            L3a:
                java.lang.String r1 = "defaulturl"
                boolean r9 = r9.equals(r1)
                if (r9 == 0) goto L6d
                r2 = 2
                goto L6e
            L44:
                java.lang.String r1 = "group"
                boolean r9 = r9.equals(r1)
                if (r9 == 0) goto L6d
                r2 = 5
                goto L6e
            L4e:
                java.lang.String r1 = "bizname"
                boolean r9 = r9.equals(r1)
                if (r9 == 0) goto L6d
                r2 = 0
                goto L6e
            L58:
                java.lang.String r1 = "navi-background-color"
                boolean r9 = r9.equals(r1)
                if (r9 == 0) goto L6d
                goto L6e
            L62:
                java.lang.String r1 = "navi-height"
                boolean r9 = r9.equals(r1)
                if (r9 == 0) goto L6d
                r2 = 4
                goto L6e
            L6d:
                r2 = -1
            L6e:
                r9 = 0
                switch(r2) {
                    case 0: goto La5;
                    case 1: goto L9e;
                    case 2: goto L97;
                    case 3: goto L90;
                    case 4: goto L85;
                    case 5: goto L7e;
                    case 6: goto L73;
                    default: goto L72;
                }
            L72:
                goto Lad
            L73:
                com.taobao.tao.flexbox.layoutmanager.core.aa r9 = r7.h()
                int r8 = a(r9, r8, r10)
                r7.f = r8
                goto Lad
            L7e:
                java.lang.String[] r8 = tb.odx.b(r10)
                r7.g = r8
                return
            L85:
                com.taobao.tao.flexbox.layoutmanager.core.aa r9 = r7.h()
                int r8 = a(r9, r8, r10)
                r7.e = r8
                return
            L90:
                int r8 = tb.odx.a(r10)
                r7.d = r8
                return
            L97:
                java.lang.String r8 = tb.oec.a(r10, r9)
                r7.c = r8
                return
            L9e:
                java.lang.String r8 = tb.oec.a(r10, r9)
                r7.b = r8
                return
            La5:
                java.lang.String r8 = "guangguang"
                java.lang.String r8 = tb.oec.a(r10, r8)
                r7.f20219a = r8
            Lad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.y.b.a(android.content.Context, java.lang.String, java.lang.Object):void");
        }
    }
}
