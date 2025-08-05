package com.taobao.android.detail.ttdetail.floatview.globalbarrage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.m;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.android.detail.ttdetail.widget.BarrageView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.List;
import tb.eyx;
import tb.kge;
import tb.sit;
import tb.sjg;
import tb.ski;

/* loaded from: classes4.dex */
public class BarrageFloatingView implements ski {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private BarrageView f10658a;
    private sit b;
    private eyx c;
    private DXTemplateItem d;
    private FrameLayout j;
    private RelativeLayout k;
    private int e = 0;
    private String f = "first";
    private boolean g = false;
    private List<Runnable> h = new ArrayList();
    private boolean i = false;
    public BARRAGE_TYPE m = BARRAGE_TYPE.GLOBAL;
    private BarrageView.a l = ;

    /* loaded from: classes4.dex */
    public enum BARRAGE_TYPE {
        GLOBAL,
        INSIDE;

        public BARRAGE_TYPE convert(String str) {
            String str2;
            if (str == null) {
                str2 = "BARRAGE_TYPE isEquals judge type is null";
            } else {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1183789060:
                        if (str.equals(sjg.LOCATION_INSIDE)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -906279820:
                        if (str.equals("second")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 96673:
                        if (str.equals("all")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 97440432:
                        if (str.equals("first")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    return INSIDE;
                }
                if (c == 1 || c == 2 || c == 3) {
                    return GLOBAL;
                }
                str2 = "非法的弹幕类型字符串" + str;
            }
            i.a("BarrageFloatingView", str2);
            return GLOBAL;
        }
    }

    static {
        kge.a(432945144);
        kge.a(-374107455);
    }

    public static /* synthetic */ void c(BarrageFloatingView barrageFloatingView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d3add21", new Object[]{barrageFloatingView});
        } else {
            barrageFloatingView.d();
        }
    }

    public static /* synthetic */ void d(BarrageFloatingView barrageFloatingView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5274aa2", new Object[]{barrageFloatingView});
        } else {
            barrageFloatingView.g();
        }
    }

    public BarrageFloatingView(eyx eyxVar) {
        this.c = eyxVar;
    }

    @Override // tb.ski
    public void a(FrameLayout frameLayout, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fabbc065", new Object[]{this, frameLayout, jSONObject});
            return;
        }
        this.j = frameLayout;
        sit a2 = sjg.a(jSONObject, this.m);
        frameLayout.setVisibility(0);
        Context a3 = y.a(frameLayout);
        BarrageView barrageView = new BarrageView(a3);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, f.a(a3, 72.0f));
        layoutParams.topMargin = f.a(a3, 126.0f);
        if (this.m == BARRAGE_TYPE.INSIDE) {
            layoutParams.topMargin = frameLayout.getMeasuredHeight() - f.a(a3, 72.0f);
        }
        layoutParams.leftMargin = f.a(a3, 8.0f);
        this.k = new RelativeLayout(a3);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(12);
        this.k.addView(barrageView, layoutParams2);
        frameLayout.addView(this.k, layoutParams);
        barrageView.setMaxCount(a2.b);
        barrageView.setItemSpace(0);
        barrageView.setAnimatorDuration(300L);
        this.f10658a = barrageView;
        this.b = a2;
        this.d = a2.c;
        this.e = a(this.e);
        JSONArray jSONArray = a2.e;
        int i = this.e;
        if (i == -1) {
            i = 0;
        }
        barrageView.initDatas(jSONArray.subList(i, this.e + 1), this.l);
        if (this.e != -1) {
            d();
        } else {
            e();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e = a(this.e + 1);
        if (this.e != -1) {
            Runnable runnable = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0022: CONSTRUCTOR  (r0v5 'runnable' java.lang.Runnable) = 
                  (r4v0 'this' com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
                 call: tb.sjx.2.<init>(com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView):void type: CONSTRUCTOR in method: com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView.d():void, file: classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:287)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:371)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:272)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: tb.sjx, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:303)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:696)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:395)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:280)
                	... 27 more
                */
            /*
                this = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 1
                if (r1 == 0) goto L12
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r2 = 0
                r1[r2] = r4
                java.lang.String r2 = "596b2eb"
                r0.ipc$dispatch(r2, r1)
                return
            L12:
                int r0 = r4.e
                int r0 = r0 + r2
                int r0 = r4.a(r0)
                r4.e = r0
                int r0 = r4.e
                r1 = -1
                if (r0 == r1) goto L39
                tb.sjx$2 r0 = new tb.sjx$2
                r0.<init>(r4)
                java.util.List<java.lang.Runnable> r1 = r4.h
                r1.add(r0)
                com.taobao.android.detail.ttdetail.widget.BarrageView r1 = r4.f10658a
                tb.sit r2 = r4.b
                float r2 = r2.f33614a
                r3 = 1148846080(0x447a0000, float:1000.0)
                float r2 = r2 * r3
                long r2 = (long) r2
                r1.postDelayed(r0, r2)
                return
            L39:
                r4.e()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView.d():void");
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                return;
            }
            ((FrameLayout.LayoutParams) this.k.getLayoutParams()).topMargin = i - this.k.getMeasuredHeight();
            this.k.requestLayout();
        }

        private void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else if (!this.b.f) {
            } else {
                this.i = true;
                this.f10658a.setVisibility(8);
                this.h.remove(this);
            }
        }

        private void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            this.f = str;
            if (this.e != -1 || !this.b.f) {
                return;
            }
            this.i = false;
            this.f10658a.setVisibility(0);
            d();
        }

        private int a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
            }
            if (i >= this.b.d.size()) {
                i = 0;
            }
            for (int i2 = i; i2 < this.b.d.size(); i2++) {
                sit.a aVar = this.b.d.get(i2);
                if (this.f.equals(aVar.b) || "all".equals(aVar.b) || sjg.LOCATION_INSIDE.equals(aVar.b)) {
                    return i2;
                }
            }
            for (int i3 = 0; i3 < i; i3++) {
                sit.a aVar2 = this.b.d.get(i3);
                if (this.f.equals(aVar2.b) || "all".equals(aVar2.b) || sjg.LOCATION_INSIDE.equals(aVar2.b)) {
                    return i3;
                }
            }
            return -1;
        }

        @Override // tb.ski
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                b(false);
            }
        }

        @Override // tb.ski
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                b(true);
            }
        }

        @Override // tb.ski
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                a(z ? "second" : "first");
            }
        }

        @Override // tb.ski
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            f();
            FrameLayout frameLayout = this.j;
            if (frameLayout == null) {
                return;
            }
            frameLayout.removeView(this.k);
        }

        private void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
                return;
            }
            for (Runnable runnable : this.h) {
                this.f10658a.removeCallbacks(runnable);
            }
        }

        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            } else if (this.i) {
            } else {
                if (this.g && !z) {
                    this.g = false;
                    f();
                    g();
                    return;
                }
                this.g = z;
            }
        }

        public void a(BARRAGE_TYPE barrage_type) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98b04b34", new Object[]{this, barrage_type});
            } else if (barrage_type == null) {
                i.a("BarrageFloatingView", "BARRAGE_TYPE is null");
            } else {
                this.m = barrage_type;
            }
        }

        private void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            } else if (this.g) {
            } else {
                if (this.e >= this.b.e.size()) {
                    i.a("BarrageFloatingView", "mCurBarrageIndex 越界");
                    return;
                }
                this.f10658a.addData(this.b.e.get(this.e), true);
                sit.a aVar = this.b.d.get(this.e);
                if (aVar.c == null || aVar.d) {
                    return;
                }
                m.b(2201, "Page_Detail-Float_Barrage", aVar.c);
                aVar.d = true;
            }
        }
    }
