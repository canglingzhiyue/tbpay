package com.taobao.android.megadesign.anim.lottie;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.e;
import com.airbnb.lottie.g;
import com.airbnb.lottie.h;
import com.airbnb.lottie.i;
import com.airbnb.lottie.j;
import com.airbnb.lottie.o;
import com.airbnb.lottie.s;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.megadesign.dx.view.f;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.hsq;
import tb.hsr;
import tb.hss;
import tb.hst;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001EB\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010,\u001a\u00020*H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010-\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00100\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00101\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00102\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00103\u001a\u00020*2\b\u00104\u001a\u0004\u0018\u000105H\u0014J0\u00106\u001a\u00020*2\u0006\u00107\u001a\u00020\u00132\u0006\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n2\u0006\u0010;\u001a\u00020\nH\u0014J\u0012\u0010<\u001a\u00020\u00132\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u0010\u0010?\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u001bJ\b\u0010@\u001a\u00020*H\u0016J\u0010\u0010A\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010B\u001a\u00020*2\b\u0010C\u001a\u0004\u0018\u00010DR\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0018j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010%\u001a\u0016\u0012\u0004\u0012\u00020'\u0018\u00010&j\n\u0012\u0004\u0012\u00020'\u0018\u0001`(X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/taobao/android/megadesign/anim/lottie/MALottieView;", "Lcom/airbnb/lottie/LottieAnimationView;", "Landroid/animation/Animator$AnimatorListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", RPCDataItems.SWITCH_TAG_LOG, "", "areaClickListener", "Lcom/taobao/android/megadesign/anim/lottie/MALottieView$OnAreaClickEventListener;", "fontAssetDelegate", "Lcom/taobao/android/megadesign/anim/lottie/delegate/MAFontDelegate;", com.taobao.tao.log.statistics.d.PARAM_IS_DEBUG, "", "Ljava/lang/Boolean;", "layoutHeight", "layoutWidth", "listeners", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "loadTaskListener", "Lcom/taobao/android/megadesign/anim/lottie/delegate/LottieLoadTaskListener;", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "setPaint", "(Landroid/graphics/Paint;)V", "tapAreaDebuggable", "tapAreas", "Lcom/alibaba/fastjson/JSONArray;", "tapRect", "Ljava/util/ArrayList;", "Landroid/graphics/Rect;", "Lkotlin/collections/ArrayList;", "addAnimatorListener", "", DataReceiveMonitor.CB_LISTENER, "init", "onAnimationCancel", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", "left", "top", "right", "bottom", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "registerLoadTaskListener", "removeAllAnimatorListeners", "setOnAreaClickEventListener", "setUpWithConfig", "config", "Lcom/taobao/android/megadesign/anim/lottie/LottieConfig;", "OnAreaClickEventListener", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public class MALottieView extends LottieAnimationView implements Animator.AnimatorListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG;
    private d areaClickListener;
    private hss fontAssetDelegate;
    private Boolean isDebug;
    private int layoutHeight;
    private int layoutWidth;
    private final HashSet<Animator.AnimatorListener> listeners;
    private hsr loadTaskListener;
    private Paint paint;
    private boolean tapAreaDebuggable;
    private JSONArray tapAreas;
    private ArrayList<Rect> tapRect;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/taobao/android/megadesign/anim/lottie/MALottieView$OnAreaClickEventListener;", "", "onAreaClick", "", "index", "", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public interface d {
        void a(int i);
    }

    public static /* synthetic */ Object ipc$super(MALottieView mALottieView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 1314947985:
                super.addAnimatorListener((Animator.AnimatorListener) objArr[0]);
                return null;
            case 1955789090:
                super.removeAllAnimatorListeners();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "kotlin.jvm.PlatformType", "onResult"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class b<T> implements j<g> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.taobao.android.megadesign.anim.lottie.a b;

        public b(com.taobao.android.megadesign.anim.lottie.a aVar) {
            this.b = aVar;
        }

        @Override // com.airbnb.lottie.j
        public /* synthetic */ void onResult(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8251d27f", new Object[]{this, gVar});
            } else {
                a(gVar);
            }
        }

        public final void a(g composition) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("471c924d", new Object[]{this, composition});
                return;
            }
            try {
                TLog.loge("MegaDesign", MALottieView.access$getTAG$p(MALottieView.this), "fetched lottie composition");
                q.b(composition, "composition");
                Map<String, i> l = composition.l();
                q.b(l, "composition.images");
                if (!l.isEmpty()) {
                    Iterator<Map.Entry<String, i>> it = l.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().getValue().f()) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z) {
                    MALottieView.this.setImageAssetDelegate(AnonymousClass1.INSTANCE);
                }
                MALottieView.this.setComposition(composition);
                if (this.b.n()) {
                    MALottieView.this.playAnimation();
                }
                if (MALottieView.access$getLoadTaskListener$p(MALottieView.this) != null) {
                }
            } catch (Throwable th) {
                MALottieView.access$getLoadTaskListener$p(MALottieView.this);
                AppMonitor.Counter.commit("MegaDesign", "LottieError", th.toString(), 1.0d);
                String access$getTAG$p = MALottieView.access$getTAG$p(MALottieView.this);
                TLog.loge("MegaDesign", access$getTAG$p, "init lottie error = " + th);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", AdvanceSetting.NETWORK_TYPE, "Lcom/airbnb/lottie/LottieImageAsset;", "kotlin.jvm.PlatformType", "fetchBitmap"}, k = 3, mv = {1, 4, 1})
        /* renamed from: com.taobao.android.megadesign.anim.lottie.MALottieView$b$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 implements e {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            @Override // com.airbnb.lottie.e
            public final Bitmap fetchBitmap(i it) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Bitmap) ipChange.ipc$dispatch("8a969dc1", new Object[]{this, it});
                }
                q.b(it, "it");
                return it.e();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "", "kotlin.jvm.PlatformType", "onResult"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class c<T> implements j<Throwable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.airbnb.lottie.j
        public /* synthetic */ void onResult(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8251d27f", new Object[]{this, th});
            } else {
                a(th);
            }
        }

        public final void a(Throwable it) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, it});
                return;
            }
            if (MALottieView.access$getLoadTaskListener$p(MALottieView.this) != null) {
                q.b(it, "it");
            }
            String access$getTAG$p = MALottieView.access$getTAG$p(MALottieView.this);
            TLog.loge("MegaDesign", access$getTAG$p, "load error = " + it);
        }
    }

    public static final /* synthetic */ hsr access$getLoadTaskListener$p(MALottieView mALottieView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hsr) ipChange.ipc$dispatch("2abe243e", new Object[]{mALottieView}) : mALottieView.loadTaskListener;
    }

    public static final /* synthetic */ String access$getTAG$p(MALottieView mALottieView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dfa1e990", new Object[]{mALottieView}) : mALottieView.TAG;
    }

    public static final /* synthetic */ void access$setLoadTaskListener$p(MALottieView mALottieView, hsr hsrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("344a7296", new Object[]{mALottieView, hsrVar});
        } else {
            mALottieView.loadTaskListener = hsrVar;
        }
    }

    public MALottieView(Context context) {
        super(context);
        this.TAG = "MALottieView";
        this.listeners = new HashSet<>();
        this.paint = new Paint();
        init();
    }

    public MALottieView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "MALottieView";
        this.listeners = new HashSet<>();
        this.paint = new Paint();
        init();
    }

    public MALottieView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "MALottieView";
        this.listeners = new HashSet<>();
        this.paint = new Paint();
        init();
    }

    private final void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        Context context = getContext();
        q.b(context, "context");
        this.fontAssetDelegate = new hss(context);
        super.addAnimatorListener(this);
        setFontAssetDelegate(this.fontAssetDelegate);
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e608391", new Object[]{this, animatorListener});
        } else {
            this.listeners.add(animatorListener);
        }
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void removeAllAnimatorListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7492f922", new Object[]{this});
            return;
        }
        super.removeAllAnimatorListeners();
        this.listeners.clear();
        super.addAnimatorListener(this);
    }

    public final void setUpWithConfig(com.taobao.android.megadesign.anim.lottie.a aVar) {
        o<g> a2;
        RenderMode renderMode;
        hss hssVar;
        Class<?> cls;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b06fd2", new Object[]{this, aVar});
        } else if (aVar != null) {
            f fVar = f.INSTANCE;
            Pair[] pairArr = new Pair[2];
            Context context = getContext();
            pairArr[0] = kotlin.j.a("ctxName", (context == null || (cls = context.getClass()) == null) ? null : cls.getName());
            pairArr[1] = kotlin.j.a("bizId", aVar.a());
            fVar.a("MALottieView", ai.a(pairArr));
            Float d2 = aVar.d();
            if (d2 != null) {
                setSpeed(d2.floatValue());
            }
            setRepeatCount(aVar.k());
            JSONArray h = aVar.h();
            if (!(h == null || h.isEmpty())) {
                Context context2 = getContext();
                q.b(context2, "context");
                JSONArray h2 = aVar.h();
                q.a(h2);
                Drawable drawable = getDrawable();
                if (!(drawable instanceof LottieDrawable)) {
                    drawable = null;
                }
                setImageAssetDelegate(new hst(context2, h2, (LottieDrawable) drawable));
            }
            String i = aVar.i();
            if (!(i == null || n.a((CharSequence) i)) && (hssVar = this.fontAssetDelegate) != null) {
                hssVar.a(new a(aVar));
            }
            JSONArray f = aVar.f();
            if (!(f == null || f.isEmpty())) {
                JSONArray f2 = aVar.f();
                q.a(f2);
                JSONObject jSONObject = f2.getJSONObject(0);
                if (jSONObject != null) {
                    try {
                        String string = jSONObject.getString("start");
                        q.b(string, "section.getString(\"start\")");
                        int parseInt = Integer.parseInt(string);
                        String string2 = jSONObject.getString("end");
                        q.b(string2, "section.getString(\"end\")");
                        setMinAndMaxFrame(parseInt, Integer.parseInt(string2));
                        String string3 = jSONObject.getString("loopCount");
                        q.b(string3, "section.getString(\"loopCount\")");
                        Integer d3 = n.d(string3);
                        setRepeatCount(d3 != null ? d3.intValue() : 0);
                    } catch (NumberFormatException unused) {
                    }
                    JSONArray f3 = aVar.f();
                    q.a(f3);
                    f3.remove(jSONObject);
                    setTag(R.string.tag_lottie_play_control, aVar.f());
                }
            }
            String l = aVar.l();
            if (!(l == null || n.a((CharSequence) l))) {
                String l2 = aVar.l();
                if (l2 != null) {
                    int hashCode = l2.hashCode();
                    if (hashCode == 116909544) {
                        if (l2.equals(com.taobao.downgrade.e.HARDWARE)) {
                            renderMode = RenderMode.HARDWARE;
                            setRenderMode(renderMode);
                        }
                    } else if (hashCode == 1319330215 && l2.equals("software")) {
                        renderMode = RenderMode.SOFTWARE;
                        setRenderMode(renderMode);
                    }
                }
                renderMode = RenderMode.AUTOMATIC;
                setRenderMode(renderMode);
            }
            JSONArray g = aVar.g();
            if (!(g == null || g.isEmpty())) {
                s sVar = new s(this);
                JSONArray g2 = aVar.g();
                if (g2 != null) {
                    for (Object obj : g2) {
                        boolean z2 = obj instanceof JSONObject;
                        JSONObject jSONObject2 = (JSONObject) (!z2 ? null : obj);
                        String string4 = jSONObject2 != null ? jSONObject2.getString("key") : null;
                        if (!z2) {
                            obj = null;
                        }
                        JSONObject jSONObject3 = (JSONObject) obj;
                        sVar.b(string4, jSONObject3 != null ? jSONObject3.getString("value") : null);
                    }
                }
                setTextDelegate(sVar);
            }
            if (aVar.e() != null) {
                Float e = aVar.e();
                q.a(e);
                setProgress(e.floatValue());
            }
            String j = aVar.j();
            if (!(j == null || n.a((CharSequence) j))) {
                a2 = h.a(getContext(), aVar.j(), aVar.j());
            } else {
                String c2 = aVar.c();
                if (!(c2 == null || n.a((CharSequence) c2))) {
                    a2 = h.b(getContext(), aVar.c(), (String) null);
                } else {
                    String b2 = aVar.b();
                    if (b2 == null || n.a((CharSequence) b2)) {
                        return;
                    }
                    a2 = h.a(new FileInputStream(aVar.b()), (String) null);
                }
            }
            a2.a(new b(aVar)).c(new c());
            JSONArray B = aVar.B();
            if (B != null && !B.isEmpty()) {
                z = false;
            }
            if (!z) {
                this.tapAreas = aVar.B();
            }
            this.tapAreaDebuggable = aVar.C();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/taobao/android/megadesign/anim/lottie/MALottieView$setUpWithConfig$2", "Lcom/taobao/android/megadesign/anim/lottie/delegate/IFontDelegate;", "fetchFont", "Landroid/graphics/Typeface;", "fontFamily", "", "getFontPath", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class a implements hsq {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.taobao.android.megadesign.anim.lottie.a b;

        @Override // tb.hsq
        public String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
            }
            return null;
        }

        public a(com.taobao.android.megadesign.anim.lottie.a aVar) {
            this.b = aVar;
        }

        @Override // tb.hsq
        public Typeface b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Typeface) ipChange.ipc$dispatch("79756ba9", new Object[]{this, str});
            }
            try {
                Context context = MALottieView.this.getContext();
                q.b(context, "context");
                return Typeface.createFromAsset(context.getAssets(), this.b.i());
            } catch (Throwable unused) {
                if (!this.b.m()) {
                    return null;
                }
                return Typeface.DEFAULT_BOLD;
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        if ((this.layoutWidth == measuredWidth && this.layoutHeight == measuredHeight) || (jSONArray = this.tapAreas) == null) {
            return;
        }
        ArrayList<Rect> arrayList = this.tapRect;
        if (arrayList == null) {
            this.tapRect = new ArrayList<>();
        } else if (arrayList != null) {
            arrayList.clear();
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                try {
                    float f = measuredWidth;
                    float f2 = measuredHeight;
                    Rect rect = new Rect((int) (((JSONObject) next).getFloatValue("left") * f), (int) (((JSONObject) next).getFloatValue("top") * f2), (int) (f * ((JSONObject) next).getFloatValue("right")), (int) (f2 * ((JSONObject) next).getFloatValue("bottom")));
                    ArrayList<Rect> arrayList2 = this.tapRect;
                    if (arrayList2 != null) {
                        arrayList2.add(rect);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void registerLoadTaskListener(hsr hsrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f917cf2", new Object[]{this, hsrVar});
        } else {
            this.loadTaskListener = hsrVar;
        }
    }

    public final void setOnAreaClickEventListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e3cf54", new Object[]{this, dVar});
        } else {
            this.areaClickListener = dVar;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            return;
        }
        for (Animator.AnimatorListener animatorListener : this.listeners) {
            if (animatorListener != null) {
                animatorListener.onAnimationStart(animator);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            return;
        }
        Object tag = getTag(R.string.tag_lottie_play_control);
        if (!(tag instanceof JSONArray)) {
            tag = null;
        }
        JSONArray jSONArray = (JSONArray) tag;
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray2 != null && !jSONArray2.isEmpty()) {
            z = false;
        }
        if (!z) {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            if (jSONObject == null) {
                return;
            }
            try {
                String string = jSONObject.getString("start");
                q.b(string, "config.getString(\"start\")");
                int parseInt = Integer.parseInt(string);
                String string2 = jSONObject.getString("end");
                q.b(string2, "config.getString(\"end\")");
                setMinAndMaxFrame(parseInt, Integer.parseInt(string2));
                String string3 = jSONObject.getString("loopCount");
                q.b(string3, "config.getString(\"loopCount\")");
                Integer d2 = n.d(string3);
                if (d2 != null) {
                    i = d2.intValue();
                }
                setRepeatCount(i);
            } catch (NumberFormatException unused) {
            }
            jSONArray.remove(jSONObject);
            playAnimation();
            setTag(R.string.tag_lottie_play_control, jSONArray);
            return;
        }
        for (Animator.AnimatorListener animatorListener : this.listeners) {
            if (animatorListener != null) {
                animatorListener.onAnimationEnd(animator);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            return;
        }
        for (Animator.AnimatorListener animatorListener : this.listeners) {
            if (animatorListener != null) {
                animatorListener.onAnimationCancel(animator);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            return;
        }
        for (Animator.AnimatorListener animatorListener : this.listeners) {
            if (animatorListener != null) {
                animatorListener.onAnimationRepeat(animator);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ArrayList<Rect> arrayList;
        d dVar;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        Integer num = null;
        Float valueOf = motionEvent != null ? Float.valueOf(motionEvent.getX()) : null;
        Float valueOf2 = motionEvent != null ? Float.valueOf(motionEvent.getY()) : null;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        }
        if (num != null && num.intValue() == 1 && (arrayList = this.tapRect) != null) {
            if (valueOf != null) {
                valueOf.floatValue();
                if (valueOf2 != null) {
                    valueOf2.floatValue();
                    for (Rect rect : arrayList) {
                        if (rect.contains((int) valueOf.floatValue(), (int) valueOf2.floatValue()) && (dVar = this.areaClickListener) != null) {
                            dVar.a(i);
                        }
                        i++;
                    }
                } else {
                    return super.onTouchEvent(motionEvent);
                }
            } else {
                return super.onTouchEvent(motionEvent);
            }
        }
        return true;
    }

    public final Paint getPaint() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Paint) ipChange.ipc$dispatch("daa8bf5c", new Object[]{this}) : this.paint;
    }

    public final void setPaint(Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8629deb8", new Object[]{this, paint});
            return;
        }
        q.d(paint, "<set-?>");
        this.paint = paint;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (!this.tapAreaDebuggable || !isDebug()) {
            return;
        }
        if (canvas != null) {
            canvas.save();
        }
        ArrayList<Rect> arrayList = this.tapRect;
        if (arrayList == null) {
            return;
        }
        for (Rect rect : arrayList) {
            this.paint.setColor(-16776961);
            this.paint.setStrokeWidth(10.0f);
            if (canvas != null) {
                canvas.drawRect(rect, this.paint);
            }
        }
    }

    private final boolean isDebug() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[]{this})).booleanValue();
        }
        if (this.isDebug == null) {
            Context context = getContext();
            q.b(context, "context");
            if ((context.getApplicationInfo().flags & 2) != 0) {
                z = true;
            }
            this.isDebug = Boolean.valueOf(z);
        }
        return q.a((Object) this.isDebug, (Object) true);
    }
}
