package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaMeasureOutput;
import com.facebook.yoga.YogaNode;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.oec;
import tb.ogl;

/* loaded from: classes8.dex */
public class a extends Component<FrameLayout, b> implements com.taobao.tao.flexbox.layoutmanager.core.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.tao.flexbox.layoutmanager.core.aa f20094a;
    private com.taobao.tao.flexbox.layoutmanager.core.aa b;
    private boolean c;
    private com.taobao.tao.flexbox.layoutmanager.core.aa e;
    private int d = -1;
    private boolean f = true;

    static {
        kge.a(132461033);
        kge.a(328095190);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2141646649) {
            super.applyAttrForView((View) objArr[0], (ogl) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        } else if (hashCode != -613926416) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onLayout();
            return null;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ void applyAttrForView(FrameLayout frameLayout, b bVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805910c7", new Object[]{this, frameLayout, bVar, map, new Boolean(z)});
        } else {
            a(frameLayout, bVar, map, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [tb.ogl, com.taobao.tao.flexbox.layoutmanager.component.a$b] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ b mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.widget.FrameLayout, android.view.View] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ FrameLayout onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : a(context);
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c465c465", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.d = i;
        return i;
    }

    public static /* synthetic */ ogl a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("80c49da1", new Object[]{aVar}) : aVar.viewParams;
    }

    public static /* synthetic */ ogl a(a aVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("ae6e7479", new Object[]{aVar, aaVar}) : aVar.a(aaVar);
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4660447", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.f = z;
        return z;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("7d46f90c", new Object[]{aVar}) : aVar.f20094a;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa b(a aVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("abb51fa4", new Object[]{aVar, aaVar});
        }
        aVar.e = aaVar;
        return aaVar;
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c59c5726", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.c = z;
        return z;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("35d3b96b", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ ogl d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("3d7fec7e", new Object[]{aVar}) : aVar.viewParams;
    }

    public static /* synthetic */ ogl e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("d1be5c1d", new Object[]{aVar}) : aVar.viewParams;
    }

    public static /* synthetic */ ogl f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("65fccbbc", new Object[]{aVar}) : aVar.viewParams;
    }

    public static /* synthetic */ ogl g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("fa3b3b5b", new Object[]{aVar}) : aVar.viewParams;
    }

    public static /* synthetic */ ogl h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("8e79aafa", new Object[]{aVar}) : aVar.viewParams;
    }

    public static /* synthetic */ boolean i(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a5eebd", new Object[]{aVar})).booleanValue() : aVar.c;
    }

    public static /* synthetic */ ogl j(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("b6f68a38", new Object[]{aVar}) : aVar.viewParams;
    }

    public static /* synthetic */ boolean k(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("594e993f", new Object[]{aVar})).booleanValue() : aVar.f;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa l(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("b2c67cc2", new Object[]{aVar}) : aVar.e;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6839f0", new Object[]{this});
            return;
        }
        super.onLayout();
        b();
        List<com.taobao.tao.flexbox.layoutmanager.core.aa> H = this.node.H();
        if (H == null || H.size() < 2) {
            return;
        }
        this.f20094a = H.get(0);
        this.b = H.get(1);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public YogaMeasureFunction onCreateMeasureFunction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (YogaMeasureFunction) ipChange.ipc$dispatch("622da8f1", new Object[]{this}) : new c();
    }

    public FrameLayout a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("b87ee879", new Object[]{this, context}) : new FrameLayout(context);
    }

    public void a(FrameLayout frameLayout, b bVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c59ab0e5", new Object[]{this, frameLayout, bVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(frameLayout, bVar, map, z);
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = this.f20094a;
        if (aaVar == null || this.b == null) {
            return;
        }
        aaVar.b(frameLayout.getContext());
        List<com.taobao.tao.flexbox.layoutmanager.core.aa> list = this.f20094a.d;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View x = list.get(i).x();
                if (x != null) {
                    if (this.c && i > this.d) {
                        x.setVisibility(4);
                    } else {
                        x.setVisibility(0);
                    }
                }
            }
        }
        this.b.b(frameLayout.getContext());
        View x2 = this.b.x();
        if (x2 == null) {
            return;
        }
        if (this.c) {
            x2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x2.getLayoutParams();
            if (((b) this.viewParams).b || !this.f) {
                com.taobao.tao.flexbox.layoutmanager.core.r b2 = b(this.d);
                if (b2 == null) {
                    return;
                }
                layoutParams.gravity = 8388691;
                layoutParams.leftMargin = b2.c + b2.f20361a;
                return;
            }
            ogl a2 = a(this.f20094a);
            if (a2 == null) {
                return;
            }
            layoutParams.gravity = 8388691;
            layoutParams.leftMargin = a2.ag;
            return;
        }
        x2.setVisibility(4);
    }

    public b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("e6611979", new Object[]{this}) : new b();
    }

    private com.taobao.tao.flexbox.layoutmanager.core.aa a(int i) {
        List<com.taobao.tao.flexbox.layoutmanager.core.aa> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("e5ca1e03", new Object[]{this, new Integer(i)});
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = this.f20094a;
        if (aaVar == null || (list = aaVar.d) == null) {
            return null;
        }
        int size = list.size();
        if (i >= 0 && i < size) {
            return list.get(i);
        }
        return null;
    }

    private com.taobao.tao.flexbox.layoutmanager.core.r b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.r) ipChange.ipc$dispatch("aec0b140", new Object[]{this, new Integer(i)});
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa a2 = a(i);
        if (a2 != null) {
            return a2.G();
        }
        return null;
    }

    private ogl a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        Component I;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ogl) ipChange.ipc$dispatch("ce973122", new Object[]{this, aaVar});
        }
        if (aaVar != null && (I = aaVar.I()) != null) {
            return I.getViewParams();
        }
        return null;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c();
        this.f20094a = null;
        this.b = null;
        this.c = false;
        this.d = -1;
        this.e = null;
        this.f = true;
    }

    private void c() {
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.c || !((b) this.viewParams).b || !this.f || (aaVar = this.e) == null || aaVar.I() == null) {
        } else {
            this.e.I().clearCacheSize();
        }
    }

    /* loaded from: classes8.dex */
    public class c implements YogaMeasureFunction {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(975086999);
            kge.a(1007340194);
        }

        public c() {
        }

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            com.taobao.tao.flexbox.layoutmanager.core.r G;
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("15b3ebfa", new Object[]{this, yogaNode, new Float(f), yogaMeasureMode, new Float(f2), yogaMeasureMode2})).longValue();
            }
            if (a.a(a.this) == null || a.b(a.this) == null || a.c(a.this) == null) {
                return YogaMeasureOutput.make(f, f2);
            }
            a.b(a.this).c(f, f2);
            a.c(a.this).l();
            com.taobao.tao.flexbox.layoutmanager.core.r G2 = a.b(a.this).G();
            com.taobao.tao.flexbox.layoutmanager.core.r G3 = a.c(a.this).G();
            if (G2 == null || G3 == null) {
                return YogaMeasureOutput.make(f, f2);
            }
            List<com.taobao.tao.flexbox.layoutmanager.core.aa> list = a.b(a.this).d;
            if (list == null) {
                return YogaMeasureOutput.make(f, f2);
            }
            int size = list.size();
            int i = 0;
            int i2 = -1;
            boolean z2 = true;
            for (int i3 = 0; i3 < size; i3++) {
                com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = list.get(i3);
                com.taobao.tao.flexbox.layoutmanager.core.r G4 = aaVar.G();
                if (G4 != null) {
                    if (i3 == 0 || ((G = list.get(i3 - 1).G()) != null && G.d + G.b <= G4.d)) {
                        i++;
                    }
                    if (i <= ((b) a.d(a.this)).f20095a) {
                        a aVar = a.this;
                        ogl a2 = a.a(aVar, a.b(aVar));
                        if (i < ((b) a.e(a.this)).f20095a) {
                            a.a(a.this, i3);
                            a.b(a.this, aaVar);
                        } else if (i == ((b) a.f(a.this)).f20095a) {
                            int i4 = G4.c + G4.f20361a + G3.f20361a;
                            if (a2 != null) {
                                i4 += a2.ah;
                            }
                            if (i4 <= G2.f20361a) {
                                a.a(a.this, i3);
                                a.b(a.this, aaVar);
                                a.a(a.this, false);
                            }
                            if (z2) {
                                if (((b) a.g(a.this)).b) {
                                    a.a(a.this, i3);
                                    a.b(a.this, aaVar);
                                }
                                z2 = false;
                            }
                        }
                        int i5 = G4.d + G4.b;
                        if (a2 != null) {
                            i5 += a2.aj;
                        }
                        i2 = Math.max(i2, i5);
                    }
                }
            }
            a aVar2 = a.this;
            if (i > ((b) a.h(aVar2)).f20095a) {
                z = true;
            }
            a.b(aVar2, z);
            if (a.i(a.this) && ((b) a.j(a.this)).b && a.k(a.this)) {
                a(G2, G3, a.l(a.this));
            }
            return YogaMeasureOutput.make(G2.f20361a, i2);
        }

        private void a(com.taobao.tao.flexbox.layoutmanager.core.r rVar, com.taobao.tao.flexbox.layoutmanager.core.r rVar2, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
            com.taobao.tao.flexbox.layoutmanager.core.r G;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e73210", new Object[]{this, rVar, rVar2, aaVar});
            } else if (rVar == null || rVar2 == null || aaVar == null || (G = aaVar.G()) == null) {
            } else {
                int i = G.c;
                int i2 = G.d;
                int i3 = ((G.f20361a + i) + rVar2.f20361a) - rVar.f20361a;
                a aVar = a.this;
                ogl a2 = a.a(aVar, a.b(aVar));
                if (a2 != null) {
                    i3 += a2.ah;
                }
                aaVar.c(G.f20361a - i3, G.b);
                com.taobao.tao.flexbox.layoutmanager.core.r G2 = aaVar.G();
                if (G2 == null) {
                    return;
                }
                G2.c = i;
                G2.d = i2;
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class b extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f20095a;
        public boolean b;

        static {
            kge.a(1715742362);
        }

        @Override // tb.ogl
        public void a(Context context, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("840caf86", new Object[]{this, context, str, obj});
                return;
            }
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -765107922) {
                if (hashCode == 102977279 && str.equals("lines")) {
                    c = 0;
                }
            } else if (str.equals("max-line-keep-one")) {
                c = 1;
            }
            if (c != 0) {
                if (c != 1) {
                    return;
                }
                this.b = oec.a(obj, true);
                return;
            }
            this.f20095a = oec.a(obj, Integer.MAX_VALUE);
            if (this.f20095a >= 0) {
                return;
            }
            this.f20095a = Integer.MAX_VALUE;
        }
    }
}
