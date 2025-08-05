package com.taobao.tao.flexbox.layoutmanager.core;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import tb.drd;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.oeg;
import tb.oeh;
import tb.oek;
import tb.oel;
import tb.oem;
import tb.ogg;
import tb.ogh;
import tb.ogi;
import tb.ohe;

/* loaded from: classes8.dex */
public class aa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LAYOUT_STEP_FINISH = 2;
    public static final int LAYOUT_STEP_INIT = 0;
    public static final int LAYOUT_STEP_ON_LAYOUT = 1;
    public static final int TAG_ANIMATION_BACKGROUND = 9;
    public static final int TAG_ANIMATION_BOTTOM = 16;
    public static final int TAG_ANIMATION_CORNERS = 24;
    public static final int TAG_ANIMATION_HEIGHT = 12;
    public static final int TAG_ANIMATION_LEFT = 13;
    public static final int TAG_ANIMATION_OPACITY = 10;
    public static final int TAG_ANIMATION_PADDING_LEFT = 26;
    public static final int TAG_ANIMATION_PIVOT = 25;
    public static final int TAG_ANIMATION_RIGHT = 14;
    public static final int TAG_ANIMATION_ROTATION = 17;
    public static final int TAG_ANIMATION_ROTATION_X = 18;
    public static final int TAG_ANIMATION_ROTATION_Y = 19;
    public static final int TAG_ANIMATION_SCALE_X = 20;
    public static final int TAG_ANIMATION_SCALE_Y = 21;
    public static final int TAG_ANIMATION_TOP = 15;
    public static final int TAG_ANIMATION_TRANSLATION_X = 22;
    public static final int TAG_ANIMATION_TRANSLATION_Y = 23;
    public static final int TAG_ANIMATION_WIDTH = 11;
    public static final int TAG_CONTAINER_MESSAGE_HANDLER = 202;
    public static final int TAG_CURRENT_EXPOSURE_NUM = 0;
    public static final int TAG_DRAGGABLE_LISTENER = 2;
    public static final int TAG_IN_FULL_LAYOUT = 200;
    public static final int TAG_IS_PAGE_APPEAR = 7;
    public static final int TAG_LAYOUT_STRATEGY = 100;
    public static final int TAG_PAGE_APPEAR = 3;
    public static final int TAG_PAGE_APPEAR_NUM = 5;
    public static final int TAG_PAGE_APPEAR_TIME = 6;
    public static final int TAG_PAGE_COMPANION = 101;
    public static final int TAG_PAGE_NAME = 1;
    public static final int TAG_PAGE_PROPERTY = 4;
    public static final int TAG_PENDING_FULL_LAYOUT_INFO = 201;
    public static final int TAG_TAB2_APM_FIRSTFRAME_FLAG = 203;
    public static final int TAG_TAB2_APM_FIRSTFRAME_TIME = 204;
    public static final int TAG_VIEW_APPEAR = 8;
    private static boolean s;
    private static AtomicInteger t;
    private TNodeView B;

    /* renamed from: a  reason: collision with root package name */
    public ab.h f20292a;
    public aa b;
    public af c;
    public List<aa> d;
    public HashMap<String, Object> e;
    public Component f;
    public String h;
    public Object i;
    public SparseArray<Object> j;
    public Map k;
    public String l;
    public IPage m;
    public List<ogi> n;
    public List<a> o;
    public d p;
    private HashMap<String, Object> u;
    private g w;
    private ab.e x;
    private HashMap<String, com.taobao.tao.flexbox.layoutmanager.event.b> z;
    private boolean v = false;
    private boolean A = false;
    public boolean q = true;
    public volatile int r = 0;
    private int y = 6;
    public int g = t.incrementAndGet();

    /* loaded from: classes8.dex */
    public interface a {
        void a(Component component);
    }

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f20296a;
        public String b;
        public String c;
        public String d;

        static {
            kge.a(1147016434);
        }
    }

    /* loaded from: classes8.dex */
    public interface c<T> {
        boolean a(T t);

        boolean b(T t);
    }

    /* loaded from: classes8.dex */
    public interface f {
        boolean a();
    }

    /* loaded from: classes8.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public final String f20302a;
        public final boolean b;

        static {
            kge.a(351286942);
        }

        public g(String str, boolean z) {
            this.f20302a = str;
            this.b = z;
        }
    }

    public static /* synthetic */ void c(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0336bd2", new Object[]{aaVar});
        } else {
            aaVar.ad();
        }
    }

    static {
        kge.a(1317267471);
        kge.a(-921287190);
        s = oeb.bS();
        t = new AtomicInteger(0);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.v;
    }

    public d b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("d6e0c135", new Object[]{this}) : this.p;
    }

    /* loaded from: classes8.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int DEFAULT_DURATION = 300;

        /* renamed from: a  reason: collision with root package name */
        public boolean f20297a;
        public final int b;
        public final String c;
        public final String d;
        private g.c e;
        private g.d f;
        private boolean g;
        private boolean h;
        private AnimatorSet i;
        private List<Animator> j;
        private ValueAnimator k;

        static {
            kge.a(-1837575104);
        }

        public static /* synthetic */ void a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9568b190", new Object[]{dVar});
            } else {
                dVar.c();
            }
        }

        public d(boolean z) {
            this.f20297a = z;
            this.b = z ? 300 : 0;
            this.c = null;
            this.d = "ease";
            this.h = true;
        }

        public d(g.c cVar, Map map) {
            int i = 300;
            int i2 = 0;
            if (map != null) {
                this.f20297a = oec.a(map.get("animated"), false);
                this.b = this.f20297a ? oec.a(map.get("duration"), 300) : i2;
                this.c = oec.a(map.get("mode"), (String) null);
                this.d = oec.a(map.get("type"), "ease");
            } else {
                this.f20297a = false;
                this.b = !this.f20297a ? 0 : i;
                this.c = null;
                this.d = "ease";
            }
            this.e = cVar;
            if (cVar != null) {
                this.f = cVar.c;
            }
        }

        private void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            g.d dVar = this.f;
            if (dVar == null) {
                return;
            }
            dVar.a(this.e, new JSONObject());
            this.f = null;
        }

        public oeg a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oeg) ipChange.ipc$dispatch("f08a1ed", new Object[]{this});
            }
            oeg oegVar = new oeg();
            oegVar.f31970a = this.b;
            oegVar.f = oek.a(this.d);
            oegVar.h = new oeh();
            return oegVar;
        }

        public ValueAnimator d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ValueAnimator) ipChange.ipc$dispatch("7c74b04f", new Object[]{this});
            }
            if (TextUtils.equals("shareAnimator", this.c)) {
                if (this.k == null) {
                    this.k = ValueAnimator.ofFloat(0.0f, 1.0f);
                }
                return this.k;
            }
            return ValueAnimator.ofFloat(0.0f, 1.0f);
        }

        public void a(AnimatorSet animatorSet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cafd7869", new Object[]{this, animatorSet});
            } else if (this.h || this.g) {
                animatorSet.start();
            } else if (animatorSet == null || animatorSet.getChildAnimations().isEmpty()) {
            } else {
                if (this.j == null) {
                    this.j = new ArrayList();
                }
                this.j.add(animatorSet);
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (this.g) {
            } else {
                this.g = true;
                List<Animator> list = this.j;
                if (list != null && !list.isEmpty()) {
                    this.i = new AnimatorSet();
                    this.i.playTogether(this.j);
                    new oel.b(new oel.a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.aa.d.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.oel.a
                        public void a() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            } else {
                                d.a(d.this);
                            }
                        }
                    }).a(this.i, 0);
                    this.i.start();
                    return;
                }
                oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.aa.d.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            d.a(d.this);
                        }
                    }
                }, this.b);
            }
        }
    }

    public aa(ab.h hVar, af afVar, aa aaVar) {
        hVar.g.a(this.g, this);
        this.f20292a = hVar;
        this.c = afVar;
        this.b = aaVar;
        if (afVar != null) {
            if (afVar.e == null || afVar.e != this) {
                afVar.e = this;
            }
            if (afVar.f20339a == null || afVar.f20339a != hVar.g) {
                afVar.f20339a = hVar.g;
            }
        }
        this.d = new ArrayList();
        this.e = new HashMap<>();
        if (s) {
            if (aaVar == null) {
                this.h = String.valueOf(this.g);
            } else if (afVar.g == aaVar.c.g) {
                this.h = aaVar.h;
            } else {
                this.h = aaVar.h + "." + this.g;
            }
        }
        if (aaVar != null || !oeb.ca()) {
            return;
        }
        this.x = new t();
    }

    public ab.h c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ab.h) ipChange.ipc$dispatch("4b9d06f", new Object[]{this}) : this.f20292a;
    }

    public void a(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29395e05", new Object[]{this, tNodeView});
        } else {
            this.B = tNodeView;
        }
    }

    public TNodeView am() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TNodeView) ipChange.ipc$dispatch("7cd4bb90", new Object[]{this}) : ak().B;
    }

    public af d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (af) ipChange.ipc$dispatch("d1f7a14e", new Object[]{this}) : this.c;
    }

    public Object e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d74af246", new Object[]{this}) : this.i;
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.i = obj;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.l;
    }

    public void a(int i, Object obj) {
        IPage iPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
            return;
        }
        if (this.j == null) {
            this.j = new SparseArray<>();
        }
        if (1 == i && (iPage = this.m) != null) {
            iPage.g().a("pageNameTmp", obj);
        }
        this.j.put(i, obj);
    }

    public void a(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f025d123", new Object[]{this, iPage});
        } else {
            this.m = iPage;
        }
    }

    public IPage al() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPage) ipChange.ipc$dispatch("5b8b989f", new Object[]{this}) : this.m;
    }

    public Object a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9da1ccf7", new Object[]{this, new Integer(i)});
        }
        SparseArray<Object> sparseArray = this.j;
        if (sparseArray == null) {
            return null;
        }
        return sparseArray.get(i);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        SparseArray<Object> sparseArray = this.j;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return;
        }
        for (int i = 0; i < this.j.size(); i++) {
            Object valueAt = this.j.valueAt(i);
            if (valueAt instanceof oem) {
                oem oemVar = (oem) valueAt;
                if (oemVar.a() != null) {
                    oemVar.a().cancel();
                    this.j.setValueAt(i, null);
                }
            } else if (valueAt instanceof Animator) {
                ((Animator) valueAt).cancel();
                this.j.setValueAt(i, null);
            }
        }
    }

    public void a(String str, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7463f7dd", new Object[]{this, str, bVar});
            return;
        }
        if (this.z == null) {
            this.z = new HashMap<>();
        }
        this.z.put(str, bVar);
    }

    public com.taobao.tao.flexbox.layoutmanager.event.b b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.event.b) ipChange.ipc$dispatch("9cff592e", new Object[]{this, str});
        }
        HashMap<String, com.taobao.tao.flexbox.layoutmanager.event.b> hashMap = this.z;
        if (hashMap == null) {
            return null;
        }
        return hashMap.remove(str);
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.c.g.f;
    }

    public Map i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d67b6a5", new Object[]{this}) : this.k;
    }

    public void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.k = map;
        }
    }

    public void a(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f2), new Float(f3)});
            return;
        }
        ogh.a("init Layout");
        if (this.f == null) {
            com.taobao.tao.flexbox.layoutmanager.core.e.a(this.c.l, new e.a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.aa.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.core.e.a
                public void a(Component component) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e0962223", new Object[]{this, component});
                        return;
                    }
                    aa aaVar = aa.this;
                    aaVar.f = component;
                    if (component != null) {
                        component.onCreate(aaVar);
                    }
                    aa.c(aa.this);
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.core.e.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        ogh.b();
                    }
                }
            });
        } else {
            ad();
        }
    }

    private void ad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1cc72a", new Object[]{this});
            return;
        }
        Component component = this.f;
        if (component == null) {
            ogh.b();
            return;
        }
        component.onLayout();
        Component component2 = this.f;
        if (!(component2 instanceof com.taobao.tao.flexbox.layoutmanager.core.g) && !(component2 instanceof ah) && this.d != null) {
            for (int i = 0; i < this.d.size(); i++) {
                this.d.get(i).a(Float.NaN, Float.NaN);
            }
        }
        this.f.onLayoutTreeBuilt();
        ogh.b();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.y &= -3;
        Component component = this.f;
        if (component == null) {
            return;
        }
        if (!(component instanceof com.taobao.tao.flexbox.layoutmanager.core.g) && !(component instanceof ah) && this.d != null) {
            for (int i = 0; i < this.d.size(); i++) {
                this.d.get(i).j();
            }
        }
        Component component2 = this.f;
        if (component2 instanceof ah) {
            return;
        }
        component2.onLayoutComplete();
    }

    public ab k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ab) ipChange.ipc$dispatch("6d9b2bab", new Object[]{this}) : this.f20292a.g;
    }

    public void b(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f625a9", new Object[]{this, new Float(f2), new Float(f3)});
            return;
        }
        ogh.a("layoutInternal");
        if ((f2 > 0.0f || f3 > 0.0f) && G() != null && (G().f20361a != ((int) f2) || G().b != ((int) f3))) {
            m();
        }
        a(f2, f3);
        if (this.f != null && n()) {
            ogh.a("calculateLayout");
            this.f.calculateLayout(f2, f3);
            ogh.b();
        }
        if (n()) {
            j();
        }
        ogh.b();
    }

    public void c(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5dc60ea", new Object[]{this, new Float(f2), new Float(f3)});
        } else if (com.taobao.tao.flexbox.layoutmanager.component.l.b(this)) {
        } else {
            b(f2, f3);
        }
    }

    public void a(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f2)});
        } else {
            c(Float.NaN, f2);
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            c(Float.NaN, Float.NaN);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.y |= 2;
        this.y |= 4;
        aa aaVar = this.b;
        if (aaVar == null) {
            return;
        }
        if (aaVar.ae() && !z) {
            return;
        }
        this.b.a(z);
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            a(false);
        }
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        int i = this.y;
        return ((i & 2) == 0 && (i & 8) == 0) ? false : true;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : (this.y & 16) != 0;
    }

    public boolean aj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab715434", new Object[]{this})).booleanValue() : (this.y & 128) != 0;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : (this.y & 64) != 0;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        this.y |= 64;
        aa aaVar = this.b;
        if (aaVar == null || (aaVar.y & 64) != 0) {
            return;
        }
        aaVar.q();
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : (this.y & 8) != 0;
    }

    private boolean ae() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab2adeaf", new Object[]{this})).booleanValue() : K().equals("cell") || K().equals("header") || (I() instanceof ae);
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.y |= 4;
        aa aaVar = this.b;
        if (aaVar == null) {
            return;
        }
        if (aaVar.ae() && !z) {
            return;
        }
        this.b.b(z);
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : (this.y & 4) != 0;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    private aa a(af afVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("fa332573", new Object[]{this, afVar}) : new aa(this.f20292a, afVar, this);
    }

    public aa a(Map<String, Object> map, d dVar, boolean z) {
        com.taobao.tao.flexbox.layoutmanager.core.c attributeHandler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("85caafef", new Object[]{this, map, dVar, new Boolean(z)});
        }
        if (map == null) {
            return null;
        }
        if (oeb.aH()) {
            Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> next = it.next();
                String key = next.getKey();
                Object value = next.getValue();
                Object c2 = c(key, value);
                if (z && c2 != null && c2.equals(value)) {
                    it.remove();
                } else {
                    Component component = this.f;
                    if (component != null && (attributeHandler = component.getAttributeHandler(key)) != null && attributeHandler.c()) {
                        attributeHandler.a(this, (aa) this.f.viewParams, key, value);
                        Component component2 = this.f;
                        if ((component2 instanceof com.taobao.tao.flexbox.layoutmanager.core.d) && ((com.taobao.tao.flexbox.layoutmanager.core.d) component2).isDrawable()) {
                            Component component3 = this.f;
                            attributeHandler.a((com.taobao.tao.flexbox.layoutmanager.core.f) component3, (Object[]) ((com.taobao.tao.flexbox.layoutmanager.core.d) component3).getDrawable(), (Drawable[]) this.f.viewParams, dVar);
                        } else {
                            Component component4 = this.f;
                            attributeHandler.a((com.taobao.tao.flexbox.layoutmanager.core.f) component4, (Component) component4.getView(), (View) this.f.viewParams, dVar);
                        }
                        a(key, c2, value);
                        it.remove();
                    }
                }
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return b(map, dVar, false);
    }

    public aa b(Map<String, Object> map, d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("4173de0e", new Object[]{this, map, dVar, new Boolean(z)});
        }
        if (map != null) {
            aa L = L();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                z2 |= c(entry.getKey(), entry.getValue(), z);
            }
            if (z2 && this.f != null) {
                if (!n() && s()) {
                    this.f.parseViewParams(y());
                }
                this.f.handleChildChanged(L, this);
                return L;
            }
        }
        return null;
    }

    public boolean a(String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb14d10a", new Object[]{this, str, obj, new Boolean(z)})).booleanValue();
        }
        if (!z) {
            if (this.e == null) {
                this.e = new HashMap<>();
            }
            Object put = this.e.put(str, obj);
            Component component = this.f;
            if (component != null) {
                component.parseViewParams(y());
            }
            return !oec.a(put, obj);
        }
        boolean a2 = a(str, obj);
        if (a2 && this.f != null) {
            aa L = L();
            this.f.handleChildChanged(L, this);
            L.l();
            L.b(L.N());
        }
        return a2;
    }

    public Object c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5c96bfa2", new Object[]{this, str, obj});
        }
        if (this.e == null) {
            this.e = new HashMap<>();
        }
        return this.e.put(str, obj);
    }

    public boolean a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8bb65392", new Object[]{this, str, obj})).booleanValue() : c(str, obj, oeb.ct());
    }

    public boolean c(String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9df3b48", new Object[]{this, str, obj, new Boolean(z)})).booleanValue();
        }
        Object c2 = c(str, obj);
        if (z && c2 != null && c2.equals(obj)) {
            return false;
        }
        if (this.u == null) {
            this.u = new HashMap<>();
        }
        this.u.put(str, obj);
        b(str, obj);
        a(str, c2, obj);
        return true;
    }

    private void a(String str, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1adbbea", new Object[]{this, str, obj, obj2});
        } else if (this.n == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("oldValue", obj);
            hashMap.put("value", obj2);
            hashMap.put("key", e("key"));
            a(str, (Map) hashMap);
        }
    }

    private void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18567e8f", new Object[]{this, str, obj});
        } else if (str.equals("theme-name") || str.equals("theme-enabled")) {
            ah();
            t();
        } else {
            Component component = this.f;
            if (component == null) {
                return;
            }
            component.updateNeedLayoutOrRender(str);
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        u();
        List<aa> list = this.d;
        if (list == null) {
            return;
        }
        for (aa aaVar : list) {
            aaVar.t();
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        this.y |= 8;
        this.r = 0;
    }

    public HashMap<String, Object> v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("d48dea20", new Object[]{this}) : this.u;
    }

    public void a(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7de910", new Object[]{this, obj, new Boolean(z)});
        } else {
            a(null, null, 0L, obj, null, z);
        }
    }

    public void a(g.c cVar, String str, long j, Object obj, Object obj2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24e1a339", new Object[]{this, cVar, str, new Long(j), obj, obj2, new Boolean(z)});
        } else {
            this.f20292a.g.a(cVar, str, j, this, W() != null ? W().f20296a : "", obj, obj2, z);
        }
    }

    private void af() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab38f62c", new Object[]{this});
            return;
        }
        HashMap<String, Object> hashMap = this.u;
        if (hashMap == null) {
            return;
        }
        hashMap.clear();
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        HashMap<String, Object> hashMap = this.u;
        if (hashMap == null) {
            return false;
        }
        return hashMap.containsKey(str);
    }

    public void a(final Context context) {
        drd a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!p() && G() != null) {
            ogh.a("prepare");
            if ((context instanceof Activity) && (a2 = k().a((Activity) context)) != null) {
                if (this.f != null) {
                    a2.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.aa.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            ogh.a("onPrepareComponent");
                            aa.this.f.onPrepareComponent(context);
                            ogh.b();
                        }
                    });
                }
                if (this.d != null) {
                    Component component = this.f;
                    if (!(component instanceof com.taobao.tao.flexbox.layoutmanager.core.g) && !(component instanceof ah)) {
                        for (int i = 0; i < this.d.size(); i++) {
                            this.d.get(i).a(context);
                        }
                    }
                }
            }
            ogh.b();
        }
    }

    private void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        ogh.a("renderInternal");
        Component component = this.f;
        if (component != null) {
            component.onRender(context);
        }
        q();
        if (this.d != null) {
            Component component2 = this.f;
            if (!(component2 instanceof com.taobao.tao.flexbox.layoutmanager.core.g) && !(component2 instanceof ah)) {
                for (int i = 0; i < this.d.size(); i++) {
                    aa aaVar = this.d.get(i);
                    aaVar.p = this.p;
                    aaVar.b(context);
                    aaVar.p = null;
                }
            }
        }
        af();
        this.y &= -5;
        this.y &= -9;
        if (this.f != null && this.v) {
            ogh.a("sortComponent");
            V();
            ogh.b();
        }
        Component component3 = this.f;
        if (component3 != null) {
            component3.onRenderCompleted();
        }
        this.v = false;
        ogh.b();
    }

    public void a(Context context, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5efcd988", new Object[]{this, context, dVar});
            return;
        }
        try {
            this.p = dVar;
            c(context);
            this.p = null;
            if (dVar == null) {
                return;
            }
            dVar.b();
        } catch (Throwable th) {
            ogg.b("renderWithOption " + th.getMessage());
        }
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        try {
            c(context);
        } catch (Throwable th) {
            ogg.b("render " + th.getMessage());
        }
    }

    @Deprecated
    public void a(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691da4af", new Object[]{this, abVar});
            return;
        }
        ab abVar2 = this.f20292a.g;
        if (abVar2 == abVar) {
            return;
        }
        this.f20292a.g = abVar;
        this.g = t.incrementAndGet();
        this.f20292a.g.a(this.g, this);
        if (abVar != null) {
            this.f20292a.g.a(abVar2.k());
        }
        af afVar = this.c;
        if (afVar != null) {
            afVar.f20339a = abVar;
        }
        if (this.d == null) {
            return;
        }
        for (int i = 0; i < this.d.size(); i++) {
            this.d.get(i).a(abVar);
        }
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue() : x() != null;
    }

    public View x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c3d47f81", new Object[]{this});
        }
        Component component = this.f;
        if (component == null) {
            return null;
        }
        return component.getView();
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        HashMap<String, Object> hashMap = this.e;
        if (hashMap != null) {
            Object obj = hashMap.get("attrs");
            if (((obj instanceof Map) && ((Map) obj).containsKey(str)) || this.e.containsKey(str)) {
                return true;
            }
        }
        Map map = this.c.h.c;
        if (map == null) {
            return false;
        }
        return map.containsKey(str);
    }

    public Object e(String str) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("73a838bc", new Object[]{this, str});
        }
        HashMap<String, Object> hashMap = this.e;
        if (hashMap != null) {
            Object obj = hashMap.get("attrs");
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                if (map2.containsKey(str)) {
                    return map2.get(str);
                }
            }
            if (this.e.containsKey(str)) {
                return this.e.get(str);
            }
        }
        af afVar = this.c;
        if (afVar != null && (map = afVar.h.c) != null) {
            return map.get(str);
        }
        return null;
    }

    public HashMap y() {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b322b5e3", new Object[]{this});
        }
        ogh.a("TNode getAttrs");
        HashMap hashMap = new HashMap();
        af afVar = this.c;
        if (afVar != null && (map = afVar.h.c) != null) {
            hashMap.putAll(map);
        }
        HashMap<String, Object> hashMap2 = this.e;
        if (hashMap2 != null) {
            hashMap.putAll(hashMap2);
        }
        ogh.b();
        return hashMap;
    }

    public Map z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b5b83476", new Object[]{this}) : this.e;
    }

    public Map A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("eac8707d", new Object[]{this}) : this.c.n;
    }

    public Map B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b872d23e", new Object[]{this}) : this.c.m;
    }

    public Map C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("861d33ff", new Object[]{this}) : this.f20292a.e;
    }

    public Object D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("800de3c7", new Object[]{this}) : this.c.p;
    }

    public int E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3e1da3f", new Object[]{this})).intValue() : this.g;
    }

    public String F() {
        af afVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fdc3673", new Object[]{this});
        }
        if (s) {
            return this.h;
        }
        LinkedList linkedList = new LinkedList();
        for (aa aaVar = this; aaVar != null; aaVar = afVar.e.b) {
            afVar = aaVar.c;
            while (afVar.b != null && afVar.g == afVar.b.g) {
                afVar = afVar.b;
            }
            if (!oeb.bR() || afVar.h == afVar.g) {
                linkedList.add(0, String.valueOf(afVar.e.g));
            }
        }
        ohe.a a2 = ohe.a();
        for (int i = 0; i < linkedList.size(); i++) {
            a2.a((String) linkedList.get(i));
            if (i < linkedList.size() - 1) {
                a2.a(".");
            }
        }
        return a2.toString();
    }

    public r G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("56400054", new Object[]{this});
        }
        Component component = this.f;
        if (component == null) {
            return null;
        }
        return component.measureResult;
    }

    public List<aa> H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c3a81998", new Object[]{this}) : this.d;
    }

    public aa b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("29553bc4", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.d.size()) {
            return this.d.get(i);
        }
        return null;
    }

    public int a(aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("691d3043", new Object[]{this, aaVar})).intValue() : this.d.indexOf(aaVar);
    }

    public Component I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Component) ipChange.ipc$dispatch("6f88e84b", new Object[]{this}) : this.f;
    }

    public aa J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("46bcc18d", new Object[]{this}) : this.b;
    }

    public String K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2078db8e", new Object[]{this}) : this.c.f();
    }

    public aa L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("2a100dcb", new Object[]{this});
        }
        aa aaVar = this;
        while (aaVar.J() != null && !aaVar.J().K().equals("TabBarController") && !aaVar.J().K().equals("drawer") && !aaVar.J().K().equals("viewpager") && !aaVar.J().K().equals("mediaBrowser") && !aaVar.J().K().equals("browserex") && !aaVar.J().K().equals("cell") && !aaVar.J().K().equals("header")) {
            aaVar = aaVar.J();
        }
        return aaVar;
    }

    public aa M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("1bb9b3ea", new Object[]{this});
        }
        aa aaVar = this;
        while (true) {
            aa aaVar2 = aaVar.b;
            if (aaVar2 == null) {
                return aaVar;
            }
            aaVar = aaVar2;
        }
    }

    public aa ak() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("55171ad", new Object[]{this}) : d().y.e;
    }

    public Context N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("64a61dcd", new Object[]{this}) : this.f20292a.g.h;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else if (oeb.bK()) {
            f(z);
            e(z);
        } else {
            e(z);
            f(z);
        }
    }

    private void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        Component component = this.f;
        if (component == null) {
            return;
        }
        component.detach(z);
    }

    private void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else if (this.d != null && !(this.f instanceof com.taobao.tao.flexbox.layoutmanager.core.g)) {
            for (int i = 0; i < this.d.size(); i++) {
                this.d.get(i).d(z);
            }
        }
    }

    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af458", new Object[]{this});
            return;
        }
        Component component = this.f;
        if (component == null || !component.isAttached()) {
            return;
        }
        this.f.detach(true);
    }

    public void a(int i, af afVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad823a76", new Object[]{this, new Integer(i), afVar, new Boolean(z)});
            return;
        }
        final aa a2 = a(afVar);
        if (i < 0 || i > this.d.size()) {
            return;
        }
        aa L = L();
        this.d.add(i, a2);
        a(z);
        L.b(z);
        if (I() != null) {
            I().handleChildAdded(L, i, a2);
            c(true);
            if (!o()) {
                return;
            }
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.aa.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!aa.this.I().sendViewAppearForAdd(a2)) {
                    } else {
                        a2.ac();
                    }
                }
            });
        } else if (!K().equals("cells")) {
        } else {
            com.taobao.tao.flexbox.layoutmanager.component.l.c(J().J()).a(a2, i, false);
        }
    }

    public void a(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619b90c", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (i < 0 || i >= this.d.size()) {
        } else {
            aa remove = this.d.remove(i);
            if (i > i2) {
                if (i2 >= 0 && i2 <= this.d.size()) {
                    this.d.add(i2, remove);
                    z2 = true;
                }
                a(z);
                aa L = L();
                L.b(z);
                if (I() == null || !z2) {
                }
                I().handleChildMoved(L, i, i2, remove);
                if (!oeb.cq()) {
                    return;
                }
                c(true);
                return;
            }
            int i3 = i2 - 1;
            if (i3 >= 0 && i3 <= this.d.size()) {
                this.d.add(i3, remove);
                i2 = i3;
                z2 = true;
            }
            a(z);
            aa L2 = L();
            L2.b(z);
            if (I() == null) {
            }
        }
    }

    public void b(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfae5eb", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        a(z);
        aa L = L();
        L.b(z);
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            int i4 = i + i3;
            aa remove = (i4 < 0 || i4 >= this.d.size()) ? null : this.d.remove(i4);
            if (remove != null && I() != null) {
                I().handleChildDeleted(L, i, remove);
                remove.d(true);
            }
            if (remove != null) {
                k().b(remove.g);
            }
        }
    }

    public void b(String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27a0625", new Object[]{this, str, obj, new Boolean(z)});
            return;
        }
        a(str, obj);
        b(z);
        if (I() == null) {
            return;
        }
        I().handleChildChanged(L(), this);
    }

    public int R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4990bcc", new Object[]{this})).intValue();
        }
        List<aa> list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* loaded from: classes8.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static e f;
        private static int g;

        /* renamed from: a  reason: collision with root package name */
        public aa f20300a;
        public aa b;
        public String c;
        public Map d;
        public com.taobao.tao.flexbox.layoutmanager.event.b e;
        private e h;
        private a i;

        /* loaded from: classes8.dex */
        public static class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private int f20301a;

            static {
                kge.a(-738936459);
            }

            public static /* synthetic */ boolean a(a aVar, int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2ffdef5", new Object[]{aVar, new Integer(i)})).booleanValue() : aVar.a(i);
            }

            public static /* synthetic */ void b(a aVar, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f43631d0", new Object[]{aVar, new Integer(i)});
                } else {
                    aVar.b(i);
                }
            }

            public static /* synthetic */ void c(a aVar, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f56c84af", new Object[]{aVar, new Integer(i)});
                } else {
                    aVar.c(i);
                }
            }

            public a(int i) {
                this.f20301a = i;
            }

            private boolean a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : (i & this.f20301a) != 0;
            }

            private void b(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                } else {
                    this.f20301a = i | this.f20301a;
                }
            }

            private void c(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
                } else {
                    this.f20301a = (~i) & this.f20301a;
                }
            }
        }

        public boolean a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : a.a(this.i, i);
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            } else {
                a.b(this.i, i);
            }
        }

        public void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            } else {
                a.c(this.i, i);
            }
        }

        static {
            kge.a(-1241038554);
            g = 0;
        }

        private e() {
        }

        private static e b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("d6e0c154", new Object[0]);
            }
            e eVar = f;
            if (eVar != null) {
                f = eVar.h;
                eVar.h = null;
                g--;
                return eVar;
            }
            return new e();
        }

        public static e a(aa aaVar, aa aaVar2, String str, Map map, int i, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("d58af3b2", new Object[]{aaVar, aaVar2, str, map, new Integer(i), bVar});
            }
            e b = b();
            b.f20300a = aaVar;
            b.b = aaVar2;
            b.c = str;
            if (map == null) {
                map = new HashMap();
            }
            b.d = map;
            b.i = new a(i);
            b.e = bVar;
            return b;
        }

        public static e a(e eVar, aa aaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("fd74d5e6", new Object[]{eVar, aaVar});
            }
            e b = b();
            b.f20300a = eVar.f20300a;
            b.b = aaVar;
            b.c = eVar.c;
            b.d = eVar.d;
            b.i = eVar.i;
            b.e = eVar.e;
            return b;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.f20300a = null;
            this.b = null;
            this.i = null;
            this.d = null;
            this.c = null;
            this.e = null;
            int i = g;
            if (i >= 5) {
                return;
            }
            this.h = f;
            f = this;
            g = i + 1;
        }
    }

    public ab.e S() {
        ab.e r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ab.e) ipChange.ipc$dispatch("27302a22", new Object[]{this});
        }
        if (oeb.ca()) {
            r = M().x;
        } else {
            r = k().r();
        }
        return r == null ? new t() : r;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r6.equals("onpageappear") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean d(com.taobao.tao.flexbox.layoutmanager.core.aa.e r6) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.aa.d(com.taobao.tao.flexbox.layoutmanager.core.aa$e):boolean");
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("956925ef", new Object[]{this, eVar});
        } else if (!ag() || !TextUtils.equals(eVar.c, "onpagedisappear")) {
        } else {
            e a2 = e.a(eVar.f20300a, eVar.b, "onwilldisappear", eVar.d, Component.MSG_FLAG_DISAPPEAR, eVar.e);
            c(a2);
            a2.a();
        }
    }

    public void b(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a3d770", new Object[]{this, eVar});
        } else if (!ag() || !TextUtils.equals(eVar.c, "onpageappear")) {
        } else {
            e a2 = e.a(eVar.f20300a, eVar.b, "onwillappear", eVar.d, 130, eVar.e);
            c(a2);
            a2.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0145 A[LOOP:1: B:80:0x013f->B:82:0x0145, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean e(com.taobao.tao.flexbox.layoutmanager.core.aa.e r18) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.aa.e(com.taobao.tao.flexbox.layoutmanager.core.aa$e):boolean");
    }

    private void f(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578e9d74", new Object[]{this, eVar});
            return;
        }
        t tVar = (t) S();
        if (tVar == null || eVar.a(1024)) {
            return;
        }
        tVar.onHandleMessage(eVar);
        eVar.b(1024);
    }

    public boolean c(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afde88f5", new Object[]{this, eVar})).booleanValue();
        }
        if (d(eVar)) {
            return false;
        }
        return e(eVar);
    }

    private boolean g(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4c94ef9", new Object[]{this, eVar})).booleanValue();
        }
        if (eVar.a(2)) {
            List<aa> list = this.d;
            if (list != null) {
                for (aa aaVar : list) {
                    e a2 = e.a(eVar, aaVar);
                    boolean c2 = aaVar.c(a2);
                    a2.a();
                    if (c2 && !eVar.a(128)) {
                        return true;
                    }
                }
            }
        } else if (eVar.a(16)) {
            eVar.c(16);
            aa aaVar2 = this.b;
            if (aaVar2 != null) {
                for (aa aaVar3 : aaVar2.d) {
                    if (aaVar3 != this) {
                        e a3 = e.a(eVar, aaVar3);
                        boolean c3 = aaVar3.c(a3);
                        a3.a();
                        if (c3 && !eVar.a(128)) {
                            return true;
                        }
                    }
                }
            }
        } else if (eVar.a(1)) {
            aa aaVar4 = this.b;
            if (aaVar4 == null) {
                Object obj = this.i;
                if (obj instanceof com.taobao.tao.flexbox.layoutmanager.component.p) {
                    aaVar4 = ((com.taobao.tao.flexbox.layoutmanager.component.p) obj).getNode();
                }
            }
            if (aaVar4 != null) {
                e a4 = e.a(eVar, aaVar4);
                boolean c4 = aaVar4.c(a4);
                a4.a();
                if (c4 && !eVar.a(128)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("154c93a4", new Object[]{this, map});
        }
        String str = null;
        if (map != null) {
            str = (String) map.get("page");
        }
        if (str == null && this.c.c != null) {
            str = (String) this.c.c.get("pageName");
        }
        if (str != null) {
            return str;
        }
        Object f2 = f("query");
        return f2 instanceof Map ? (String) ((Map) f2).get("utPageName") : str;
    }

    public oeg T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oeg) ipChange.ipc$dispatch("ab033c1a", new Object[]{this});
        }
        Object e2 = e("oncreateanimation");
        if (e2 != null && !(e2 instanceof JSONObject)) {
            try {
                e2 = JSONObject.parseObject(e2.toString());
            } catch (Exception e3) {
                ogg.b("getCreateAnimation:" + e3.getMessage());
            }
        }
        if (!(e2 instanceof JSONObject)) {
            return null;
        }
        return oek.a(k(), N(), this.g, (JSONObject) e2);
    }

    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            k().a(this, i, i2);
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        r G = G();
        if (G == null) {
            return;
        }
        if (G.f20361a == i && G.b == i2) {
            return;
        }
        ogg.a("relayout old:" + G + " newWidth:" + i + " newHeight:" + i2);
        if (G.f20361a == i) {
            z = false;
        }
        a(z);
        c().a(i, i2);
        c(i, i2);
        b(N());
    }

    public <T extends Component> T a(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ac4daf50", new Object[]{this, cls});
        }
        aa b2 = b(cls);
        if (b2 == null) {
            return null;
        }
        return (T) b2.I();
    }

    public aa a(Class cls, c cVar, boolean z) {
        List<aa> list;
        aa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("86a4ad88", new Object[]{this, cls, cVar, new Boolean(z)});
        }
        Component component = this.f;
        if (component != null && ((component.getClass() == cls || cls.isAssignableFrom(this.f.getClass())) && (cVar == null || cVar.a(this)))) {
            return this;
        }
        if (cVar != null && cVar.b(this)) {
            return null;
        }
        Component component2 = this.f;
        if ((component2 instanceof com.taobao.tao.flexbox.layoutmanager.component.p) && !z) {
            aa a3 = ((com.taobao.tao.flexbox.layoutmanager.component.p) component2).a(cls, cVar, z);
            if (a3 != null) {
                return a3;
            }
        } else if (z) {
            aa aaVar = this.b;
            if (aaVar != null && (a2 = aaVar.a(cls, cVar, z)) != null) {
                return a2;
            }
        } else if ((!K().equals("cell") || this.r == 2) && (list = this.d) != null) {
            for (aa aaVar2 : list) {
                aa a4 = aaVar2.a(cls, cVar, z);
                if (a4 != null) {
                    return a4;
                }
            }
        }
        return null;
    }

    public boolean b(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aca84e15", new Object[]{this, aaVar})).booleanValue();
        }
        if (this == aaVar) {
            return true;
        }
        List<aa> list = this.d;
        if (list != null) {
            for (aa aaVar2 : list) {
                if (aaVar2.b(aaVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public aa b(Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("dc5d7bca", new Object[]{this, cls}) : a(cls, (c) null, false);
    }

    public aa a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("f1f7ec4d", new Object[]{this, str, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        a(str, i, arrayList, false, true);
        if (!arrayList.isEmpty()) {
            return arrayList.get(0);
        }
        return null;
    }

    public aa a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("c86cac1c", new Object[]{this, str, new Boolean(z)});
        }
        ArrayList arrayList = new ArrayList();
        a(str, z ? 1 : 2, arrayList, true, true);
        if (!arrayList.isEmpty()) {
            return arrayList.get(0);
        }
        return null;
    }

    public void a(String str, List<aa> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
        } else {
            a(str, 2, list, true, false);
        }
    }

    public void a(c cVar, List<aa> list, int i) {
        aa aaVar;
        List<aa> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd492f21", new Object[]{this, cVar, list, new Integer(i)});
            return;
        }
        if ((i & 64) == 0) {
            if (cVar.a(this) && list != null) {
                list.add(this);
            }
            if (cVar.b(this)) {
                return;
            }
        } else {
            i &= -65;
        }
        if ((i & 2) != 0) {
            if (I() instanceof com.taobao.tao.flexbox.layoutmanager.component.p) {
                ((com.taobao.tao.flexbox.layoutmanager.component.p) I()).a(cVar, list, i);
            } else if ((!K().equals("cell") || this.r == 2) && (list2 = this.d) != null) {
                for (aa aaVar2 : list2) {
                    aaVar2.a(cVar, list, i);
                }
            }
        } else if ((i & 16) != 0) {
            int i2 = i & (-17);
            aa aaVar3 = this.b;
            if (aaVar3 == null) {
                return;
            }
            for (aa aaVar4 : aaVar3.d) {
                if (aaVar4 != this) {
                    aaVar4.a(cVar, list, i2);
                }
            }
        } else {
            if ((i & 1) == 0 || (aaVar = this.b) == null) {
                return;
            }
            aaVar.a(cVar, list, i);
        }
    }

    public void a(Object obj, int i, List<aa> list, boolean z, boolean z2) {
        aa aaVar;
        List<aa> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a48e6b0", new Object[]{this, obj, new Integer(i), list, new Boolean(z), new Boolean(z2)});
        } else if (list.size() <= 0 || !z2) {
            if ((i & 64) != 0) {
                i &= -65;
            } else if (z) {
                if (obj.equals(e("id"))) {
                    list.add(this);
                }
            } else if (obj.equals(K())) {
                list.add(this);
            }
            if ((i & 2) != 0) {
                if (I() instanceof com.taobao.tao.flexbox.layoutmanager.component.p) {
                    ((com.taobao.tao.flexbox.layoutmanager.component.p) I()).a(obj, i, list, z, z2);
                } else if ((!K().equals("cell") || this.r == 2) && (list2 = this.d) != null) {
                    for (aa aaVar2 : list2) {
                        aaVar2.a(obj, i, list, z, z2);
                    }
                }
            } else if ((i & 16) != 0) {
                int i2 = i & (-17);
                aa aaVar3 = this.b;
                if (aaVar3 == null) {
                    return;
                }
                for (aa aaVar4 : aaVar3.d) {
                    if (aaVar4 != this) {
                        aaVar4.a(obj, i2, list, z, z2);
                    }
                }
            } else {
                if ((i & 1) == 0 || (aaVar = this.b) == null) {
                    return;
                }
                aaVar.a(obj, i, list, z, z2);
            }
        }
    }

    public Object f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cac6299b", new Object[]{this, str});
        }
        Map C = C();
        if (C == null) {
            return null;
        }
        return C.get(str);
    }

    public String U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("61b225c4", new Object[]{this}) : this.c.d();
    }

    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d169dd", new Object[]{this});
        } else if (this.A && oeb.a("fixSortComponent", true)) {
        } else {
            this.A = true;
            Component component = this.f;
            if (component != null) {
                component.sortChildren();
            }
            this.A = false;
        }
    }

    public String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14a6f7e8", new Object[]{this, str});
        }
        String str2 = "$://" + str;
        Map map = this.c.h.c;
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(str2)) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    public b W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("de921ee2", new Object[]{this});
        }
        b bVar = new b();
        bVar.f20296a = this.f20292a.b;
        bVar.c = (String) f("pageName");
        bVar.b = (String) f("url");
        bVar.d = this.f20292a.j;
        return bVar;
    }

    public String X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f54355a1", new Object[]{this});
        }
        try {
            return (String) ((Map) ((Map) this.c.f.get(".")).get("ac")).get("name");
        } catch (Exception unused) {
            return "";
        }
    }

    public int Y() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fbb053", new Object[]{this})).intValue();
        }
        Component component = this.f;
        if ((component instanceof q) && !(component instanceof RichTextContainerComponent)) {
            return component.getViewParams().a();
        }
        if ((this.f instanceof com.taobao.tao.flexbox.layoutmanager.component.e) && this.d.isEmpty()) {
            i = 1;
        }
        for (aa aaVar : this.d) {
            i += aaVar.Y();
        }
        return i;
    }

    public String Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24ecadf", new Object[]{this});
        }
        HashMap y = y();
        if (this.f == null) {
            this.f = com.taobao.tao.flexbox.layoutmanager.core.e.a(this.c.l);
            Component component = this.f;
            if (component != null) {
                component.onCreate(this);
            }
        }
        Component component2 = this.f;
        if (component2 == null) {
            return null;
        }
        component2.parseViewParams(y);
        String b2 = this.f.getViewParams().b();
        return (!(this.f instanceof com.taobao.tao.flexbox.layoutmanager.component.e) || b2 != null || !this.d.isEmpty()) ? b2 : " ";
    }

    public void aa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf280a7", new Object[]{this});
            return;
        }
        List<a> list = this.o;
        if (list == null) {
            return;
        }
        for (a aVar : list) {
            aVar.a(this.f);
        }
    }

    private boolean ag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab470db1", new Object[]{this})).booleanValue();
        }
        aa aaVar = this.b;
        return aaVar == null || (aaVar.I() instanceof ai);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95675473", new Object[]{this, aVar});
            return;
        }
        if (this.o == null) {
            this.o = new ArrayList();
        }
        if (this.o.contains(aVar)) {
            return;
        }
        this.o.add(aVar);
    }

    public void a(ogi ogiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7db0ba7", new Object[]{this, ogiVar});
            return;
        }
        if (this.n == null) {
            this.n = new ArrayList();
        }
        if (this.n.contains(ogiVar)) {
            return;
        }
        this.n.add(ogiVar);
    }

    public static void a(Set<Pair<aa, d>> set, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc607f", new Object[]{set, dVar});
            return;
        }
        List<Pair<aa, d>> a2 = ad.a(set);
        if (a2 == null || a2.isEmpty()) {
            if (dVar == null) {
                return;
            }
            dVar.b();
            return;
        }
        for (Pair<aa, d> pair : a2) {
            ((aa) pair.first).l();
            ((aa) pair.first).a(((aa) pair.first).N(), (d) pair.second);
        }
    }

    public void a(String str, Map map) {
        aa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (this.n != null) {
            HashSet hashSet = new HashSet();
            for (ogi ogiVar : this.n) {
                if (str.equals(ogiVar.b()) && (a2 = ogiVar.a(this, map)) != null) {
                    hashSet.add(new Pair(a2, ogiVar.c()));
                }
            }
            a(hashSet, (d) null);
        }
    }

    public g ab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("5a1e0373", new Object[]{this});
        }
        if (this.w == null) {
            ah();
        }
        return this.w;
    }

    public void c(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
            return;
        }
        aa g2 = this.c.y.g();
        if (g2.w != null || map == null || !map.containsKey("theme-name")) {
            return;
        }
        g2.w = new g(oec.a(map.get("theme-name"), (String) null), oec.a(map.get("theme-enabled"), true));
    }

    private void ah() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab55252e", new Object[]{this});
        } else {
            this.w = new g(oec.a(e("theme-name"), (String) null), oec.a(e("theme-enabled"), true));
        }
    }

    private boolean ai() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[]{this})).booleanValue();
        }
        Object a2 = a(7);
        if (!(a2 instanceof f)) {
            return true;
        }
        return ((f) a2).a();
    }

    public void ac() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0eafa9", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", "add");
        k().b(130, this, "onwillappear", null, hashMap, null);
    }
}
