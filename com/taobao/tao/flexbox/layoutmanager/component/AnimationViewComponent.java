package com.taobao.tao.flexbox.layoutmanager.component;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.support.v4.util.Pools;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ad;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.odx;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogl;
import tb.ogu;

/* loaded from: classes8.dex */
public class AnimationViewComponent extends Component<TNodeLottieView, a> implements com.taobao.tao.flexbox.layoutmanager.core.q, com.taobao.tao.flexbox.layoutmanager.core.s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<Context, Pools.SimplePool<TNodeLottieView>> f19980a;
    private c b = new c();
    private b c = new b();
    private boolean d = false;
    private boolean e = false;

    static {
        kge.a(2096196975);
        kge.a(-1420926486);
        kge.a(-1371349407);
    }

    public static /* synthetic */ Object ipc$super(AnimationViewComponent animationViewComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2141646649) {
            super.applyAttrForView((View) objArr[0], (ogl) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        } else if (hashCode == 258418204) {
            return new Boolean(super.invoke((g.c) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (g.d) objArr[3]));
        } else {
            if (hashCode != 2127624665) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onDetach();
            return null;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ void applyAttrForView(TNodeLottieView tNodeLottieView, a aVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805910c7", new Object[]{this, tNodeLottieView, aVar, map, new Boolean(z)});
        } else {
            a(tNodeLottieView, aVar, map, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [tb.ogl, com.taobao.tao.flexbox.layoutmanager.component.AnimationViewComponent$a] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ a mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.tao.flexbox.layoutmanager.component.AnimationViewComponent$TNodeLottieView, android.view.View] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ TNodeLottieView onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : a(context);
    }

    public static /* synthetic */ void a(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50722bca", new Object[]{animationViewComponent});
        } else {
            animationViewComponent.i();
        }
    }

    public static /* synthetic */ void a(AnimationViewComponent animationViewComponent, TNodeLottieView tNodeLottieView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60701f12", new Object[]{animationViewComponent, tNodeLottieView});
        } else {
            animationViewComponent.b(tNodeLottieView);
        }
    }

    public static /* synthetic */ void a(AnimationViewComponent animationViewComponent, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcacbbca", new Object[]{animationViewComponent, new Boolean(z), new Boolean(z2)});
        } else {
            animationViewComponent.a(z, z2);
        }
    }

    public static /* synthetic */ ogl b(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("b08d1229", new Object[]{animationViewComponent}) : animationViewComponent.viewParams;
    }

    public static /* synthetic */ boolean c(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d4a0868c", new Object[]{animationViewComponent})).booleanValue() : animationViewComponent.c();
    }

    public static /* synthetic */ boolean d(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("16b7b3eb", new Object[]{animationViewComponent})).booleanValue() : animationViewComponent.b();
    }

    public static /* synthetic */ boolean e(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("58cee14a", new Object[]{animationViewComponent})).booleanValue() : animationViewComponent.d();
    }

    public static /* synthetic */ View f(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("760e27a7", new Object[]{animationViewComponent}) : animationViewComponent.view;
    }

    public static /* synthetic */ View g(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("45ce5b46", new Object[]{animationViewComponent}) : animationViewComponent.view;
    }

    public static /* synthetic */ View h(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("158e8ee5", new Object[]{animationViewComponent}) : animationViewComponent.view;
    }

    public static /* synthetic */ View i(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e54ec284", new Object[]{animationViewComponent}) : animationViewComponent.view;
    }

    public static /* synthetic */ View j(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b50ef623", new Object[]{animationViewComponent}) : animationViewComponent.view;
    }

    public static /* synthetic */ View k(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("84cf29c2", new Object[]{animationViewComponent}) : animationViewComponent.view;
    }

    public static /* synthetic */ void l(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27711edf", new Object[]{animationViewComponent});
        } else {
            animationViewComponent.f();
        }
    }

    public static /* synthetic */ View m(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("244f9100", new Object[]{animationViewComponent}) : animationViewComponent.view;
    }

    public static /* synthetic */ View n(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f40fc49f", new Object[]{animationViewComponent}) : animationViewComponent.view;
    }

    public static /* synthetic */ View o(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c3cff83e", new Object[]{animationViewComponent}) : animationViewComponent.view;
    }

    public static /* synthetic */ View p(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93902bdd", new Object[]{animationViewComponent}) : animationViewComponent.view;
    }

    public static /* synthetic */ View q(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("63505f7c", new Object[]{animationViewComponent}) : animationViewComponent.view;
    }

    public static /* synthetic */ View r(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("3310931b", new Object[]{animationViewComponent}) : animationViewComponent.view;
    }

    public static /* synthetic */ View s(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("2d0c6ba", new Object[]{animationViewComponent}) : animationViewComponent.view;
    }

    public static /* synthetic */ View t(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d290fa59", new Object[]{animationViewComponent}) : animationViewComponent.view;
    }

    public static /* synthetic */ View u(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a2512df8", new Object[]{animationViewComponent}) : animationViewComponent.view;
    }

    public static /* synthetic */ View v(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("72116197", new Object[]{animationViewComponent}) : animationViewComponent.view;
    }

    public static /* synthetic */ View w(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("41d19536", new Object[]{animationViewComponent}) : animationViewComponent.view;
    }

    public TNodeLottieView a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeLottieView) ipChange.ipc$dispatch("d6b7b5ec", new Object[]{this, context});
        }
        i();
        TNodeLottieView c2 = c(context);
        c2.bindComponent(this);
        this.b.a(c2);
        this.c.a(c2);
        c2.setFailureListener(new com.airbnb.lottie.j<Throwable>() { // from class: com.taobao.tao.flexbox.layoutmanager.component.AnimationViewComponent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.airbnb.lottie.j
            public /* synthetic */ void onResult(Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8251d27f", new Object[]{this, th});
                } else {
                    a(th);
                }
            }

            public void a(Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                    return;
                }
                ogg.b("lottie fail with  " + th.getMessage());
            }
        });
        c2.addLottieOnCompositionLoadedListener(new com.airbnb.lottie.l() { // from class: com.taobao.tao.flexbox.layoutmanager.component.AnimationViewComponent.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.airbnb.lottie.l
            public void onCompositionLoaded(com.airbnb.lottie.g gVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90ed5f5e", new Object[]{this, gVar});
                    return;
                }
                AnimationViewComponent.a(AnimationViewComponent.this);
                if (!((a) AnimationViewComponent.b(AnimationViewComponent.this)).b) {
                    return;
                }
                AnimationViewComponent.c(AnimationViewComponent.this);
            }
        });
        return c2;
    }

    public void a(TNodeLottieView tNodeLottieView, a aVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3800a490", new Object[]{this, tNodeLottieView, aVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(this.view, aVar, map, z);
        ((TNodeLottieView) this.view).setSrc(aVar.f19983a);
        ((TNodeLottieView) this.view).setRepeatCount(a.a((a) this.viewParams));
        TNodeLottieView tNodeLottieView2 = (TNodeLottieView) this.view;
        if (!((a) this.viewParams).d) {
            i = 1;
        }
        tNodeLottieView2.setRepeatMode(i);
        if (aVar.f != 1) {
            ((TNodeLottieView) this.view).setBackgroundColor(aVar.f);
        }
        String str = ((a) this.viewParams).e;
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1881872635) {
            if (hashCode == 94852023 && str.equals("cover")) {
                c2 = 0;
            }
        } else if (str.equals("stretch")) {
            c2 = 1;
        }
        if (c2 == 0) {
            ((TNodeLottieView) this.view).setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else if (c2 == 1) {
            ((TNodeLottieView) this.view).setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            ((TNodeLottieView) this.view).setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        ((TNodeLottieView) this.view).setApplyingOpacityToLayersEnabled(((a) this.viewParams).g);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        a(true, true);
        i();
        if (this.view != 0) {
            a((TNodeLottieView) this.view);
        }
        super.onDetach();
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("586db9ad", new Object[]{this}) : new a();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue();
        }
        if (a(eVar)) {
            if (this.d) {
                c();
            }
        } else if (b(eVar)) {
            this.d = b();
            d();
        }
        return false;
    }

    private boolean a(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("956925f3", new Object[]{this, eVar})).booleanValue();
        }
        if (oeb.a("fixLottieAppear", true)) {
            return StringUtils.equals(eVar.c, "onwillappear");
        }
        return ad.a(eVar);
    }

    private boolean b(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22a3d774", new Object[]{this, eVar})).booleanValue();
        }
        if (oeb.a("fixLottieAppear", true)) {
            return StringUtils.equals(eVar.c, "onwilldisappear");
        }
        return ad.b(eVar);
    }

    /* loaded from: classes8.dex */
    public static class a extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String MODE_CONTAIN = "contain";
        public static final String MODE_COVER = "cover";
        public static final String MODE_STRETCH = "stretch";

        /* renamed from: a  reason: collision with root package name */
        public String f19983a;
        public boolean c;
        private final String h = "src";
        @Deprecated
        private final String i = "play";
        private final String j = "auto-play";
        private final String k = "loop";
        private final String l = com.taobao.android.weex_framework.util.a.ATOM_EXT_reverse;
        private final String m = "color";
        private final String n = "apply-layer-opacity";
        public boolean b = true;
        public boolean d = false;
        public String e = "contain";
        public int f = 1;
        public boolean g = false;
        private int o = 0;

        static {
            kge.a(-537893063);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1185345197) {
                super.a((Context) objArr[0], (HashMap) objArr[1]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fb6b5960", new Object[]{aVar})).intValue() : aVar.o;
        }

        @Override // tb.ogl
        public void a(Context context, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            int i = 1;
            int i2 = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9591153", new Object[]{this, context, hashMap});
                return;
            }
            super.a(context, hashMap);
            this.f19983a = oec.a(hashMap.get("src"), "");
            String str = "auto-play";
            if (!hashMap.containsKey(str)) {
                str = "play";
            }
            this.b = oec.a(hashMap.get(str), true);
            this.c = oec.a(hashMap.get("loop"), false);
            this.d = oec.a(hashMap.get(com.taobao.android.weex_framework.util.a.ATOM_EXT_reverse), false);
            this.g = oec.a(hashMap.get("apply-layer-opacity"), false);
            if (hashMap.containsKey("color")) {
                i = odx.a(hashMap.get("color"));
            }
            this.f = i;
            this.e = oec.a(hashMap.get("content-mode"), "contain");
            if (this.c) {
                i2 = -1;
            }
            this.o = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean invoke(com.taobao.tao.flexbox.layoutmanager.ac.g.c r7, java.lang.String r8, com.alibaba.fastjson.JSONObject r9, com.taobao.tao.flexbox.layoutmanager.ac.g.d r10) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.component.AnimationViewComponent.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L25
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r4] = r7
            r1[r2] = r8
            r7 = 3
            r1[r7] = r9
            r7 = 4
            r1[r7] = r10
            java.lang.String r7 = "f67261c"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L25:
            r0 = -1
            int r1 = r8.hashCode()
            r5 = -1296995794(0xffffffffb2b16a2e, float:-2.0653797E-8)
            if (r1 == r5) goto L50
            r5 = 868223664(0x33c00ab0, float:8.942641E-8)
            if (r1 == r5) goto L45
            r5 = 988242095(0x3ae760af, float:0.0017652715)
            if (r1 == r5) goto L3a
            goto L5a
        L3a:
            java.lang.String r1 = "setProgress"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L5a
            r0 = 2
            goto L5a
        L45:
            java.lang.String r1 = "playAnimation"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L5a
            r0 = 0
            goto L5a
        L50:
            java.lang.String r1 = "pauseAnimation"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L5a
            r0 = 1
        L5a:
            if (r0 == 0) goto L71
            if (r0 == r4) goto L6d
            if (r0 == r2) goto L61
            goto L75
        L61:
            java.lang.String r0 = "progress"
            float r0 = r9.getFloatValue(r0)
            boolean r3 = r6.a(r0)
            goto L75
        L6d:
            r6.d()
            goto L74
        L71:
            r6.c()
        L74:
            r3 = 1
        L75:
            if (r3 != 0) goto L7b
            boolean r3 = super.invoke(r7, r8, r9, r10)
        L7b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.AnimationViewComponent.invoke(com.taobao.tao.flexbox.layoutmanager.ac.g$c, java.lang.String, com.alibaba.fastjson.JSONObject, com.taobao.tao.flexbox.layoutmanager.ac.g$d):boolean");
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : c.a(this.b) || b.a(this.c);
    }

    private boolean c() {
        boolean b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (h()) {
            b2 = c.b(this.b);
        } else {
            b2 = b.b(this.c);
        }
        if (b2) {
            e();
        }
        return b2;
    }

    private boolean d() {
        boolean c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (h()) {
            c2 = c.c(this.b);
        } else {
            c2 = b.c(this.c);
        }
        if (c2) {
            g();
        }
        return c2;
    }

    private boolean a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821885c", new Object[]{this, new Float(f)})).booleanValue();
        }
        if (a.a((a) this.viewParams) != 0) {
            return false;
        }
        a(true);
        if (b()) {
            a(false, false);
            c.a(this.b, f, 1.0f);
        } else {
            c.a(this.b, f);
        }
        return true;
    }

    /* loaded from: classes8.dex */
    public static class TNodeLottieView extends LottieAnimationView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private AnimationViewComponent component;
        private boolean isAnimatingWhenDetached;
        private String mSrc;

        static {
            kge.a(-1956851003);
        }

        public static /* synthetic */ Object ipc$super(TNodeLottieView tNodeLottieView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 949399698) {
                super.onDetachedFromWindow();
                return null;
            } else if (hashCode != 1626033557) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onAttachedToWindow();
                return null;
            }
        }

        public boolean setSrc(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3dbfab37", new Object[]{this, str})).booleanValue();
            }
            if (StringUtils.isEmpty(str) || str.equals(this.mSrc)) {
                return false;
            }
            AnimationViewComponent animationViewComponent = this.component;
            if (animationViewComponent != null) {
                AnimationViewComponent.a(animationViewComponent, false, getComposition() != null);
            }
            if (str.startsWith("http") || str.startsWith("https")) {
                setAnimationFromUrl(str);
            } else {
                if (str.startsWith("./")) {
                    str = str.substring(2);
                }
                if (str.lastIndexOf("/") > 0) {
                    setImageAssetsFolder(str.substring(0, str.lastIndexOf("/") + 1) + "images/");
                }
                setAnimation(str);
            }
            this.mSrc = str;
            return true;
        }

        public TNodeLottieView(Context context) {
            super(context);
            this.isAnimatingWhenDetached = false;
        }

        public TNodeLottieView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.isAnimatingWhenDetached = false;
        }

        public TNodeLottieView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.isAnimatingWhenDetached = false;
        }

        public void bindComponent(AnimationViewComponent animationViewComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b97a58b", new Object[]{this, animationViewComponent});
            } else {
                this.component = animationViewComponent;
            }
        }

        public void clean() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
                return;
            }
            this.isAnimatingWhenDetached = false;
            AnimationViewComponent animationViewComponent = this.component;
            if (animationViewComponent != null) {
                AnimationViewComponent.a(animationViewComponent, this);
                this.component = null;
            }
            this.mSrc = null;
        }

        @Override // com.airbnb.lottie.LottieAnimationView, android.widget.ImageView, android.view.View
        public void onAttachedToWindow() {
            AnimationViewComponent animationViewComponent;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
                return;
            }
            super.onAttachedToWindow();
            if (!this.isAnimatingWhenDetached || (animationViewComponent = this.component) == null) {
                return;
            }
            AnimationViewComponent.c(animationViewComponent);
        }

        @Override // android.widget.ImageView, android.view.View
        public void onDetachedFromWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3896b092", new Object[]{this});
                return;
            }
            AnimationViewComponent animationViewComponent = this.component;
            if (animationViewComponent != null) {
                this.isAnimatingWhenDetached = AnimationViewComponent.d(animationViewComponent);
                AnimationViewComponent.e(this.component);
            }
            super.onDetachedFromWindow();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.node.e("onanimstart") == null) {
        } else {
            sendMessage(getNode(), "onanimstart", null, null, null);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.node.e("onanimend") == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("finished", true);
            sendMessage(getNode(), "onanimend", null, hashMap, null);
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.node.e("onanimend") == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("finished", false);
            sendMessage(getNode(), "onanimend", null, hashMap, null);
        }
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.e;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    /* loaded from: classes8.dex */
    public class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ValueAnimator b;
        private float c;
        private float d;
        private boolean e;
        private Animator.AnimatorListener f;

        static {
            kge.a(-678042282);
        }

        private c() {
            this.b = null;
            this.c = 0.0f;
            this.d = 1.0f;
            this.e = false;
            this.f = new Animator.AnimatorListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.AnimationViewComponent.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                    } else {
                        c.a(c.this, false);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    if (AnimationViewComponent.this.getView() != null) {
                        AnimationViewComponent.this.getView().setEnabled(true);
                    }
                    if (animator.getDuration() != 0) {
                        return;
                    }
                    AnimationViewComponent.l(AnimationViewComponent.this);
                }
            };
        }

        public static /* synthetic */ void a(c cVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("721c6af5", new Object[]{cVar, new Float(f)});
            } else {
                cVar.a(f);
            }
        }

        public static /* synthetic */ boolean a(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb6c422f", new Object[]{cVar})).booleanValue() : cVar.a();
        }

        public static /* synthetic */ boolean a(c cVar, float f, float f2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1715b6f", new Object[]{cVar, new Float(f), new Float(f2)})).booleanValue() : cVar.a(f, f2);
        }

        public static /* synthetic */ boolean a(c cVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("721cb60d", new Object[]{cVar, new Boolean(z)})).booleanValue();
            }
            cVar.e = z;
            return z;
        }

        public static /* synthetic */ float b(c cVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("79454d26", new Object[]{cVar, new Float(f)})).floatValue();
            }
            cVar.c = f;
            return f;
        }

        public static /* synthetic */ boolean b(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("146d93ce", new Object[]{cVar})).booleanValue() : cVar.b();
        }

        public static /* synthetic */ boolean c(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2d6ee56d", new Object[]{cVar})).booleanValue() : cVar.d();
        }

        public static /* synthetic */ float d(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("467036f8", new Object[]{cVar})).floatValue() : cVar.c;
        }

        public static /* synthetic */ void e(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f7188a7", new Object[]{cVar});
            } else {
                cVar.e();
            }
        }

        public static /* synthetic */ boolean f(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7872da4a", new Object[]{cVar})).booleanValue() : cVar.c();
        }

        private boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            ValueAnimator valueAnimator = this.b;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (a()) {
                return false;
            }
            if (this.e) {
                return a(this.c, this.d);
            }
            return a(0.0f, 1.0f);
        }

        private boolean a(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5c0fea6c", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
            }
            if (AnimationViewComponent.f(AnimationViewComponent.this) == null || ((TNodeLottieView) AnimationViewComponent.g(AnimationViewComponent.this)).getComposition() == null) {
                return false;
            }
            this.d = f2;
            this.b = ValueAnimator.ofFloat(f, f2);
            this.b.setInterpolator(new LinearInterpolator());
            this.b.setDuration(((TNodeLottieView) AnimationViewComponent.h(AnimationViewComponent.this)).getComposition().e() * Math.abs(f2 - f));
            this.b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.AnimationViewComponent.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    c.b(c.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                    if (AnimationViewComponent.i(AnimationViewComponent.this) == null) {
                        return;
                    }
                    ((TNodeLottieView) AnimationViewComponent.j(AnimationViewComponent.this)).setProgress(c.d(c.this));
                }
            });
            this.b.addListener(this.f);
            this.b.start();
            return true;
        }

        private boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
            }
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null) {
                if (valueAnimator.isRunning()) {
                    this.b.setDuration(0L);
                    this.b.cancel();
                    return true;
                }
                this.b = null;
            }
            return false;
        }

        private boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
            }
            this.e = true;
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            this.b.cancel();
            return true;
        }

        private void a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
                return;
            }
            this.c = f;
            ((TNodeLottieView) AnimationViewComponent.k(AnimationViewComponent.this)).setProgress(f);
        }

        public void a(TNodeLottieView tNodeLottieView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc25fcb4", new Object[]{this, tNodeLottieView});
            } else if (tNodeLottieView == null) {
            } else {
                tNodeLottieView.addAnimatorListener(this.f);
            }
        }

        public void b(TNodeLottieView tNodeLottieView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb4c8c13", new Object[]{this, tNodeLottieView});
                return;
            }
            c();
            if (tNodeLottieView == null) {
                return;
            }
            tNodeLottieView.removeAnimatorListener(this.f);
        }

        private void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
                return;
            }
            this.c = 0.0f;
            this.d = 1.0f;
            this.e = false;
        }
    }

    /* loaded from: classes8.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean b;
        private Animator.AnimatorListener c;

        static {
            kge.a(-2122379479);
        }

        private b() {
            this.c = new Animator.AnimatorListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.AnimationViewComponent.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    if (AnimationViewComponent.this.getView() != null) {
                        AnimationViewComponent.this.getView().setEnabled(true);
                    }
                    AnimationViewComponent.l(AnimationViewComponent.this);
                }
            };
        }

        public static /* synthetic */ boolean a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb6bcdd0", new Object[]{bVar})).booleanValue() : bVar.a();
        }

        public static /* synthetic */ boolean b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("146d1f6f", new Object[]{bVar})).booleanValue() : bVar.b();
        }

        public static /* synthetic */ boolean c(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2d6e710e", new Object[]{bVar})).booleanValue() : bVar.c();
        }

        public static /* synthetic */ void d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("466fc2a9", new Object[]{bVar});
            } else {
                bVar.e();
            }
        }

        public static /* synthetic */ boolean e(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f71144c", new Object[]{bVar})).booleanValue() : bVar.d();
        }

        private boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : AnimationViewComponent.m(AnimationViewComponent.this) != null && ((TNodeLottieView) AnimationViewComponent.n(AnimationViewComponent.this)).isAnimating();
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (AnimationViewComponent.o(AnimationViewComponent.this) == null || a()) {
                return false;
            }
            if (this.b) {
                ((TNodeLottieView) AnimationViewComponent.p(AnimationViewComponent.this)).resumeAnimation();
            } else {
                ((TNodeLottieView) AnimationViewComponent.q(AnimationViewComponent.this)).playAnimation();
            }
            this.b = false;
            return true;
        }

        private boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
            }
            this.b = true;
            if (AnimationViewComponent.r(AnimationViewComponent.this) == null || !((TNodeLottieView) AnimationViewComponent.s(AnimationViewComponent.this)).isAnimating()) {
                return false;
            }
            ((TNodeLottieView) AnimationViewComponent.t(AnimationViewComponent.this)).pauseAnimation();
            return true;
        }

        private boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
            }
            if (AnimationViewComponent.u(AnimationViewComponent.this) == null || !((TNodeLottieView) AnimationViewComponent.v(AnimationViewComponent.this)).isAnimating()) {
                return false;
            }
            ((TNodeLottieView) AnimationViewComponent.w(AnimationViewComponent.this)).cancelAnimation();
            return true;
        }

        public void a(TNodeLottieView tNodeLottieView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc25fcb4", new Object[]{this, tNodeLottieView});
            } else {
                tNodeLottieView.addAnimatorListener(this.c);
            }
        }

        public void b(TNodeLottieView tNodeLottieView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb4c8c13", new Object[]{this, tNodeLottieView});
            } else {
                tNodeLottieView.removeAnimatorListener(this.c);
            }
        }

        private void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else {
                this.b = false;
            }
        }
    }

    public static void b(Context context) {
        HashMap<Context, Pools.SimplePool<TNodeLottieView>> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else if (context == null || (hashMap = f19980a) == null) {
        } else {
            hashMap.remove(context);
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        b.d(this.c);
        c.e(this.b);
        a(false);
    }

    private void b(TNodeLottieView tNodeLottieView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb4c8c13", new Object[]{this, tNodeLottieView});
            return;
        }
        this.b.b(tNodeLottieView);
        this.c.b(tNodeLottieView);
    }

    private void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (!c.f(this.b) && !b.e(this.c)) {
            z3 = false;
        }
        if (z && this.view != 0) {
            ((TNodeLottieView) this.view).setProgress(0.0f);
        }
        if (!z2 || !z3) {
            return;
        }
        g();
    }

    public static TNodeLottieView c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeLottieView) ipChange.ipc$dispatch("c2e3faaa", new Object[]{context});
        }
        TNodeLottieView tNodeLottieView = null;
        if (f19980a == null) {
            f19980a = new HashMap<>();
        }
        Pools.SimplePool<TNodeLottieView> simplePool = f19980a.get(context);
        if (simplePool != null) {
            tNodeLottieView = simplePool.acquire();
        }
        return tNodeLottieView == null ? new TNodeLottieView(context) : tNodeLottieView;
    }

    public static void a(TNodeLottieView tNodeLottieView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc25fcb4", new Object[]{tNodeLottieView});
        } else if (tNodeLottieView == null) {
        } else {
            tNodeLottieView.clean();
            tNodeLottieView.setProgress(0.0f);
            tNodeLottieView.setAnimation(-1);
            tNodeLottieView.setImageDrawable(null);
            tNodeLottieView.removeAllAnimatorListeners();
            tNodeLottieView.removeAllLottieOnCompositionLoadedListener();
            tNodeLottieView.removeAllUpdateListeners();
            tNodeLottieView.setFailureListener(null);
            ogu.a(tNodeLottieView);
            Context context = tNodeLottieView.getContext();
            if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                return;
            }
            if (f19980a == null) {
                f19980a = new HashMap<>();
            }
            Pools.SimplePool<TNodeLottieView> simplePool = f19980a.get(context);
            if (simplePool == null) {
                simplePool = new Pools.SynchronizedPool<>(32);
                f19980a.put(tNodeLottieView.getContext(), simplePool);
            }
            simplePool.release(tNodeLottieView);
        }
    }
}
