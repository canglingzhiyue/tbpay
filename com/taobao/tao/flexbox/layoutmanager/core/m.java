package com.taobao.tao.flexbox.layoutmanager.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaConstants;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.kge;
import tb.oeb;
import tb.ogg;
import tb.ogh;
import tb.ogl;
import tb.ogu;
import tb.ohd;

/* loaded from: classes8.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static a A;
    private static a B;
    private static a C;
    private static a D;
    private static a E;
    private static a F;
    private static a G;
    private static a H;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, a> f20360a;
    private static a b;
    private static a c;
    private static a d;
    private static a e;
    private static a f;
    private static a g;
    private static a h;
    private static a i;
    private static a j;
    private static a k;
    private static a l;
    private static a m;
    private static a n;
    private static a o;
    private static a p;
    private static a q;
    private static a r;
    private static a s;
    private static a t;
    private static a u;
    private static a v;
    private static a w;
    private static a x;
    private static a y;
    private static a z;
    private YogaNode I;
    private Component J;
    private float K = Float.NaN;
    private float L = Float.NaN;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes8.dex */
    public interface a {
        void a(Component component, YogaNode yogaNode, ogl oglVar);
    }

    public static /* synthetic */ float a(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f2e4cc83", new Object[]{mVar})).floatValue() : mVar.K;
    }

    public static /* synthetic */ float a(m mVar, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69b52d7d", new Object[]{mVar, new Float(f2)})).floatValue();
        }
        mVar.K = f2;
        return f2;
    }

    public static /* synthetic */ float b(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e48e72a2", new Object[]{mVar})).floatValue() : mVar.L;
    }

    public static /* synthetic */ float b(m mVar, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad404b3e", new Object[]{mVar, new Float(f2)})).floatValue();
        }
        mVar.L = f2;
        return f2;
    }

    public static /* synthetic */ a q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("db118cc6", new Object[0]) : t;
    }

    public static /* synthetic */ a r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1e9caa87", new Object[0]) : u;
    }

    public static /* synthetic */ a s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6227c848", new Object[0]) : v;
    }

    public static /* synthetic */ a t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("a5b2e609", new Object[0]) : w;
    }

    public static /* synthetic */ a u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e93e03ca", new Object[0]) : D;
    }

    public static /* synthetic */ a v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2cc9218b", new Object[0]) : E;
    }

    public static /* synthetic */ a w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("70543f4c", new Object[0]) : F;
    }

    public static /* synthetic */ a x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b3df5d0d", new Object[0]) : G;
    }

    static {
        kge.a(925368557);
        f20360a = new HashMap<>();
        b = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (oglVar.ax == null) {
                } else {
                    yogaNode.setWrap(oglVar.ax);
                }
            }
        };
        c = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else {
                    yogaNode.setFlexDirection(oglVar.av);
                }
            }
        };
        d = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.23
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (oglVar.aY != null && oglVar.aY.equals("hidden")) {
                    yogaNode.setOverflow(YogaOverflow.HIDDEN);
                } else if (!(component instanceof z)) {
                } else {
                    yogaNode.setOverflow(YogaOverflow.SCROLL);
                }
            }
        };
        e = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.28
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (oglVar.aw == null) {
                } else {
                    yogaNode.setJustifyContent(oglVar.aw);
                }
            }
        };
        f = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.29
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (oglVar.ap == null) {
                } else {
                    yogaNode.setAlignItems(oglVar.ap);
                }
            }
        };
        g = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.30
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (oglVar.ao == null) {
                } else {
                    yogaNode.setAlignContent(oglVar.ao);
                }
            }
        };
        h = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.31
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (oglVar.aa >= 0) {
                    if (!oeb.bN() && oglVar.ae > 0 && oglVar.aa > oglVar.ae) {
                        oglVar.aa = oglVar.ae;
                    }
                    yogaNode.setWidth(oglVar.aa);
                    m.a(component.getFlexBoxNode(), oglVar.aa);
                } else if (component.node.b == null && oglVar.ar == 1.0f) {
                    float b2 = ohd.b(component.node.N());
                    yogaNode.setWidth(b2);
                    m.a(component.getFlexBoxNode(), b2);
                } else if (m.a(component.getFlexBoxNode()) <= 0.0f) {
                } else {
                    yogaNode.setWidth(m.a(component.getFlexBoxNode()));
                }
            }
        };
        i = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.32
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (oglVar.ab < 0) {
                    if (m.b(component.getFlexBoxNode()) <= 0.0f) {
                        return;
                    }
                    yogaNode.setHeight(m.b(component.getFlexBoxNode()));
                } else {
                    if (!oeb.bN() && oglVar.af > 0 && oglVar.ab > oglVar.af) {
                        oglVar.ab = oglVar.af;
                    }
                    yogaNode.setHeight(oglVar.ab);
                    m.b(component.getFlexBoxNode(), oglVar.ab);
                }
            }
        };
        j = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.33
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (oglVar.aq == null) {
                } else {
                    yogaNode.setAlignSelf(oglVar.aq);
                }
            }
        };
        k = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                    return;
                }
                boolean z2 = oglVar.ac > 0;
                if (oeb.cC()) {
                    z2 = oglVar.ac >= 0;
                }
                if (!z2) {
                    return;
                }
                yogaNode.setMinWidth(oglVar.ac);
            }
        };
        l = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                    return;
                }
                boolean z2 = oglVar.ad > 0;
                if (oeb.cC()) {
                    z2 = oglVar.ad >= 0;
                }
                if (!z2) {
                    return;
                }
                yogaNode.setMinHeight(oglVar.ad);
            }
        };
        m = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (oglVar.ae <= 0) {
                } else {
                    yogaNode.setMaxWidth(oglVar.ae);
                }
            }
        };
        n = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (oglVar.af <= 0) {
                } else {
                    yogaNode.setMaxHeight(oglVar.af);
                }
            }
        };
        o = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (oglVar.ar <= 0.0f) {
                } else {
                    yogaNode.setFlex(oglVar.ar);
                }
            }
        };
        p = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (oglVar.as <= 0.0f) {
                } else {
                    yogaNode.setFlexGrow(oglVar.as);
                }
            }
        };
        q = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (oglVar.at <= 0.0f) {
                } else {
                    yogaNode.setFlexShrink(oglVar.at);
                }
            }
        };
        r = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (oglVar.au <= 0.0f) {
                } else {
                    yogaNode.setAspectRatio(oglVar.au);
                }
            }
        };
        s = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (oglVar.ay == null) {
                } else {
                    yogaNode.setDisplay(oglVar.ay);
                }
            }
        };
        t = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else {
                    yogaNode.setMargin(YogaEdge.LEFT, oglVar.ak);
                }
            }
        };
        u = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else {
                    yogaNode.setMargin(YogaEdge.TOP, oglVar.am);
                }
            }
        };
        v = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else {
                    yogaNode.setMargin(YogaEdge.RIGHT, oglVar.al);
                }
            }
        };
        w = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else {
                    yogaNode.setMargin(YogaEdge.BOTTOM, oglVar.an);
                }
            }
        };
        x = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                    return;
                }
                m.q().a(component, yogaNode, oglVar);
                m.r().a(component, yogaNode, oglVar);
                m.s().a(component, yogaNode, oglVar);
                m.t().a(component, yogaNode, oglVar);
            }
        };
        y = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (oglVar.az == null) {
                } else {
                    yogaNode.setPositionType(oglVar.az);
                }
            }
        };
        z = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (oglVar.aA == -1) {
                } else {
                    yogaNode.setPosition(YogaEdge.LEFT, oglVar.aA);
                }
            }
        };
        A = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.19
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (oglVar.aC == -1) {
                } else {
                    yogaNode.setPosition(YogaEdge.TOP, oglVar.aC);
                }
            }
        };
        B = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.20
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (oglVar.aB == -1) {
                } else {
                    yogaNode.setPosition(YogaEdge.RIGHT, oglVar.aB);
                }
            }
        };
        C = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.21
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (oglVar.aD == -1) {
                } else {
                    yogaNode.setPosition(YogaEdge.BOTTOM, oglVar.aD);
                }
            }
        };
        D = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.22
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (component instanceof g) {
                } else {
                    yogaNode.setPadding(YogaEdge.LEFT, oglVar.ag);
                }
            }
        };
        E = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.24
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (component instanceof g) {
                } else {
                    yogaNode.setPadding(YogaEdge.TOP, oglVar.ai);
                }
            }
        };
        F = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.25
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (component instanceof g) {
                } else {
                    yogaNode.setPadding(YogaEdge.RIGHT, oglVar.ah);
                }
            }
        };
        G = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.26
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (component instanceof g) {
                } else {
                    yogaNode.setPadding(YogaEdge.BOTTOM, oglVar.aj);
                }
            }
        };
        H = new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.m.27
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.m.a
            public void a(Component component, YogaNode yogaNode, ogl oglVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dccc5038", new Object[]{this, component, yogaNode, oglVar});
                } else if (component instanceof g) {
                } else {
                    m.u().a(component, yogaNode, oglVar);
                    m.v().a(component, yogaNode, oglVar);
                    m.w().a(component, yogaNode, oglVar);
                    m.x().a(component, yogaNode, oglVar);
                }
            }
        };
        f20360a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_flex_wrap, b);
        f20360a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_flex_direction, c);
        f20360a.put("overflow", d);
        f20360a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_justify_content, e);
        f20360a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_align_items, f);
        f20360a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_align_content, g);
        f20360a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_align_self, j);
        f20360a.put("width", h);
        f20360a.put("height", i);
        f20360a.put("flex", o);
        f20360a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_flex_grow, p);
        f20360a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_flex_shrink, q);
        f20360a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_max_width, m);
        f20360a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_max_height, n);
        f20360a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_min_width, k);
        f20360a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_min_height, l);
        f20360a.put("padding", H);
        f20360a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_left, D);
        f20360a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_top, E);
        f20360a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_right, F);
        f20360a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_bottom, G);
        f20360a.put("margin", x);
        f20360a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_left, t);
        f20360a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_top, u);
        f20360a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_right, v);
        f20360a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_bottom, w);
        f20360a.put("aspect-ratio", r);
        f20360a.put("position", y);
        f20360a.put("left", z);
        f20360a.put("top", A);
        f20360a.put("right", B);
        f20360a.put("bottom", C);
        f20360a.put("display", s);
    }

    public static m a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("4a39a3d3", new Object[0]);
        }
        m mVar = new m();
        mVar.c();
        return mVar;
    }

    public static m a(Component component) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("68d5ed0e", new Object[]{component}) : new m(component);
    }

    private m() {
    }

    private m(Component component) {
        this.J = component;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.I == null;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.I != null) {
        } else {
            this.I = ogu.a();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ogu.a(this.I);
        this.I = null;
    }

    public void a(YogaMeasureFunction yogaMeasureFunction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("208661b7", new Object[]{this, yogaMeasureFunction});
            return;
        }
        YogaNode yogaNode = this.I;
        if (yogaNode == null) {
            return;
        }
        yogaNode.setMeasureFunction(yogaMeasureFunction);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        YogaNode yogaNode = this.I;
        if (yogaNode == null || !yogaNode.isMeasureDefined()) {
            return;
        }
        this.I.dirty();
    }

    public void a(String str) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.J == null || this.I == null || (aVar = f20360a.get(str)) == null) {
        } else {
            Component component = this.J;
            aVar.a(component, this.I, component.getViewParams());
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        Component component = this.J;
        if (component == null || this.I == null) {
            return;
        }
        ogl viewParams = component.getViewParams();
        ogh.a("applyStyleForYogaNode");
        b.a(this.J, this.I, viewParams);
        c.a(this.J, this.I, viewParams);
        d.a(this.J, this.I, viewParams);
        e.a(this.J, this.I, viewParams);
        f.a(this.J, this.I, viewParams);
        g.a(this.J, this.I, viewParams);
        j.a(this.J, this.I, viewParams);
        h.a(this.J, this.I, viewParams);
        i.a(this.J, this.I, viewParams);
        k.a(this.J, this.I, viewParams);
        l.a(this.J, this.I, viewParams);
        m.a(this.J, this.I, viewParams);
        n.a(this.J, this.I, viewParams);
        o.a(this.J, this.I, viewParams);
        p.a(this.J, this.I, viewParams);
        q.a(this.J, this.I, viewParams);
        r.a(this.J, this.I, viewParams);
        s.a(this.J, this.I, viewParams);
        x.a(this.J, this.I, viewParams);
        H.a(this.J, this.I, viewParams);
        y.a(this.J, this.I, viewParams);
        z.a(this.J, this.I, viewParams);
        A.a(this.J, this.I, viewParams);
        B.a(this.J, this.I, viewParams);
        C.a(this.J, this.I, viewParams);
        ogh.b();
    }

    private boolean z() {
        Component component;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : (this.I == null || (component = this.J) == null || component.node.b == null || this.J.node.b.f == null || b(this.J.node.b.f) || this.J.node.b.f.getFlexBoxNode() == null) ? false : true;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        if (!z()) {
            return false;
        }
        this.J.node.b.f.getFlexBoxNode().a(this.I, y());
        return true;
    }

    public void a(int i2, int i3) {
        YogaNode yogaNode;
        YogaNode yogaNode2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else if (!z() || !oeb.a("fixYogaMove", true) || (yogaNode = this.J.node.b.f.getFlexBoxNode().I) == null || (yogaNode2 = this.I) == null || yogaNode.indexOf(yogaNode2) != i2) {
        } else {
            yogaNode.mo645removeChildAt(i2);
            if (i3 < 0 || i3 > yogaNode.getChildCount()) {
                return;
            }
            yogaNode.addChildAt(this.I, i3);
        }
    }

    private boolean b(Component component) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6d833946", new Object[]{this, component})).booleanValue() : component instanceof g;
    }

    public void a(m mVar, int i2) {
        YogaNode yogaNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b538d0", new Object[]{this, mVar, new Integer(i2)});
        } else if (mVar == null || (yogaNode = this.I) == null) {
        } else {
            mVar.a(yogaNode, i2);
        }
    }

    private int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bea073", new Object[]{this})).intValue();
        }
        int i2 = -1;
        List<aa> list = this.J.node.b.d;
        for (int i3 = 0; i3 < list.size(); i3++) {
            aa aaVar = list.get(i3);
            if (aaVar == this.J.node) {
                return i2 + 1;
            }
            if (aaVar.f != null && !(aaVar.f instanceof ah)) {
                i2++;
            }
        }
        return i2;
    }

    private void a(YogaNode yogaNode, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb8c9e82", new Object[]{this, yogaNode, new Integer(i2)});
        } else if (this.I == null || yogaNode.mo644getParent() != null) {
        } else {
            if (!this.I.isMeasureDefined()) {
                int childCount = this.I.getChildCount();
                if (i2 >= 0 && i2 <= childCount) {
                    this.I.addChildAt(yogaNode, i2);
                    return;
                } else {
                    ogg.a("TNode", "Cannot add child: insertIndex <= 0");
                    return;
                }
            }
            ogg.a("TNode", "Cannot add child: Nodes with measure functions cannot have children.");
        }
    }

    public void a(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f2), new Float(f3)});
        } else if (this.I == null) {
        } else {
            if (!YogaConstants.isUndefined(f2)) {
                this.K = f2;
                this.I.setWidth(f2);
            }
            if (!YogaConstants.isUndefined(f3)) {
                this.L = f3;
                this.I.setHeight(f3);
            }
            this.I.calculateLayout(this.K, this.L);
        }
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        Component component = this.J;
        if (component == null) {
            return;
        }
        if (component.getViewParams().aa < 0) {
            this.K = Float.NaN;
            YogaNode yogaNode = this.I;
            if (yogaNode != null) {
                yogaNode.setWidth(Float.NaN);
            }
        }
        if (this.J.getViewParams().ab >= 0) {
            return;
        }
        this.L = Float.NaN;
        YogaNode yogaNode2 = this.I;
        if (yogaNode2 == null) {
            return;
        }
        yogaNode2.setHeight(Float.NaN);
    }

    public float h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10df", new Object[]{this})).floatValue();
        }
        YogaNode yogaNode = this.I;
        if (yogaNode == null) {
            return 0.0f;
        }
        return yogaNode.getLayoutX();
    }

    public float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2860", new Object[]{this})).floatValue();
        }
        YogaNode yogaNode = this.I;
        if (yogaNode == null) {
            return 0.0f;
        }
        return yogaNode.getLayoutY();
    }

    public float j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe1", new Object[]{this})).floatValue();
        }
        YogaNode yogaNode = this.I;
        if (yogaNode == null) {
            return 0.0f;
        }
        return yogaNode.getLayoutWidth();
    }

    public float k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95762", new Object[]{this})).floatValue();
        }
        YogaNode yogaNode = this.I;
        if (yogaNode == null) {
            return 0.0f;
        }
        return yogaNode.getLayoutHeight();
    }

    public YogaPositionType l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaPositionType) ipChange.ipc$dispatch("745a2f5b", new Object[]{this});
        }
        YogaNode yogaNode = this.I;
        return yogaNode != null ? yogaNode.getPositionType() : YogaPositionType.RELATIVE;
    }

    public void a(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f2)});
        } else if (this.I == null) {
        } else {
            if (!YogaConstants.isUndefined(f2)) {
                this.K = f2;
            }
            this.I.setWidth(f2);
        }
    }

    public void b(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f2)});
        } else if (this.I == null) {
        } else {
            if (!YogaConstants.isUndefined(f2)) {
                this.L = f2;
            }
            this.I.setHeight(f2);
        }
    }

    public void a(YogaFlexDirection yogaFlexDirection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf120c7", new Object[]{this, yogaFlexDirection});
            return;
        }
        YogaNode yogaNode = this.I;
        if (yogaNode == null) {
            return;
        }
        yogaNode.setFlexDirection(yogaFlexDirection);
    }

    public void c(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b3996", new Object[]{this, new Float(f2)});
            return;
        }
        YogaNode yogaNode = this.I;
        if (yogaNode == null) {
            return;
        }
        yogaNode.setFlex(f2);
    }

    public void a(YogaEdge yogaEdge, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfd7a", new Object[]{this, yogaEdge, new Float(f2)});
            return;
        }
        YogaNode yogaNode = this.I;
        if (yogaNode == null) {
            return;
        }
        yogaNode.setPadding(yogaEdge, f2);
    }

    public YogaNode m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (YogaNode) ipChange.ipc$dispatch("dc8d41b", new Object[]{this}) : this.I;
    }

    public List<m> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("25adebb2", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        Component component = this.J;
        if (component != null) {
            for (aa aaVar : component.getTNode().d) {
                if (aaVar.I() != null) {
                    arrayList.add(aaVar.I().getFlexBoxNode());
                }
            }
        }
        return arrayList;
    }

    public void o() {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        YogaNode yogaNode = this.I;
        if (yogaNode == null || yogaNode.mo644getParent() == null || (indexOf = this.I.mo644getParent().indexOf(this.I)) < 0) {
            return;
        }
        this.I.mo644getParent().mo645removeChildAt(indexOf);
    }

    public List<m> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f4f19870", new Object[]{this});
        }
        List<m> n2 = n();
        for (m mVar : n2) {
            mVar.o();
        }
        return n2;
    }
}
