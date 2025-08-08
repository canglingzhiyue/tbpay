package com.etao.feimagesearch.intelli.realtime;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.intelli.realtime.a;
import com.etao.feimagesearch.mnn.realtime.k;
import com.etao.feimagesearch.mnn.realtime.l;
import com.etao.feimagesearch.util.s;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.p;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.com;
import tb.cot;
import tb.coy;
import tb.cuk;
import tb.fjp;
import tb.kge;

/* loaded from: classes3.dex */
public final class ObjectCardWrapper implements com.taobao.android.weex_framework.g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long CHECK_EXPIRED_PERIOD = 400;
    public static final a Companion;
    public static final int MSG_BEGIN_COUNT_DOWN = 11001;
    public static final int MSG_CHECK_EXPIRED = 10001;
    public static final int MSG_CHECK_TRACK_ANIMATOR = 10002;
    public static final int MSG_GO_IRP = 11002;
    public static final long PLAY_ANIMATOR_PERIOD = 350;
    public static final String TAG = "realtime_ObjectCardWrapper";
    private Bitmap A;
    private RectF B;
    private int C;
    private long D;
    private Point E;
    private final d F;
    private final Context G;
    private final ViewGroup H;
    private l I;
    private com.etao.feimagesearch.intelli.realtime.c J;
    private String K;

    /* renamed from: a  reason: collision with root package name */
    private CardStatus f6705a;
    private ValueAnimator b;
    private ValueAnimator c;
    private ValueAnimator d;
    private View e;
    private final FrameLayout f;
    private final FrameLayout g;
    private final View h;
    private final View i;
    private final View j;
    private p k;
    private final AtomicBoolean l;
    private final AtomicBoolean m;
    private a.d n;
    private final AtomicBoolean o;
    private final long p;
    private final String q;
    private final long r;
    private final float s;
    private final float t;
    private final float u;
    private final boolean v;
    private final boolean w;
    private final float x;
    private final boolean y;
    private final float z;

    /* loaded from: classes3.dex */
    public enum CardPositionType {
        UP(1, false, 2, null),
        DOWN(2, false, 2, null),
        LEFT(3, false, 2, null),
        RIGHT(4, false, 2, null);
        
        private final int type;
        private final boolean usable;

        CardPositionType(int i, boolean z) {
            this.type = i;
            this.usable = z;
        }

        /* synthetic */ CardPositionType(int i, boolean z, int i2, o oVar) {
            this(i, (i2 & 2) != 0 ? true : z);
        }

        public final int getType() {
            return this.type;
        }

        public final boolean getUsable() {
            return this.usable;
        }
    }

    /* loaded from: classes3.dex */
    public enum CardStatus {
        IDLE_CARD("idleCard"),
        NATIVE_CARD("nativeCard"),
        SMALL_MUISE_CARD("smallCard"),
        BIG_MUISE_CARD("bigCard"),
        INTERACTIVE_CARD("bigCard");
        
        private final String content;

        CardStatus(String str) {
            this.content = str;
        }

        public final String getContent() {
            return this.content;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;
        public final /* synthetic */ float f;
        public final /* synthetic */ float g;
        public final /* synthetic */ float h;
        public final /* synthetic */ float i;

        public b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = f5;
            this.g = f6;
            this.h = f7;
            this.i = f8;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, animator});
                return;
            }
            q.c(animator, "animator");
            Float f = (Float) animator.getAnimatedValue();
            if (f == null) {
                return;
            }
            f.floatValue();
            ObjectCardWrapper.d(ObjectCardWrapper.this).setX((f.floatValue() * this.b) + this.c);
            ObjectCardWrapper.d(ObjectCardWrapper.this).setY((f.floatValue() * this.d) + this.e);
            ObjectCardWrapper.e(ObjectCardWrapper.this).setX((f.floatValue() * this.f) + this.g);
            ObjectCardWrapper.e(ObjectCardWrapper.this).setY((f.floatValue() * this.h) + this.i);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, msg});
                return;
            }
            q.c(msg, "msg");
            super.handleMessage(msg);
            cot.c(ObjectCardWrapper.TAG, "receive msg " + msg.what);
            if (ObjectCardWrapper.f(ObjectCardWrapper.this).get()) {
                return;
            }
            int i = msg.what;
            if (i == 10001) {
                ObjectCardWrapper.j(ObjectCardWrapper.this);
            } else if (i == 10002) {
                ObjectCardWrapper.k(ObjectCardWrapper.this);
            } else if (i == 11001) {
                ObjectCardWrapper.l(ObjectCardWrapper.this);
            } else if (i != 11002) {
            } else {
                ObjectCardWrapper.m(ObjectCardWrapper.this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ p b;

        public e(p pVar) {
            this.b = pVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator tmpAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, tmpAnimator});
                return;
            }
            q.c(tmpAnimator, "tmpAnimator");
            final Float f = (Float) tmpAnimator.getAnimatedValue();
            if (f == null) {
                return;
            }
            f.floatValue();
            float f2 = 1;
            if (f.floatValue() < f2) {
                ObjectCardWrapper.g(ObjectCardWrapper.this).setAlpha(f2 - f.floatValue());
                return;
            }
            if (q.a(ObjectCardWrapper.a(ObjectCardWrapper.this), ObjectCardWrapper.g(ObjectCardWrapper.this))) {
                ObjectCardWrapper.g(ObjectCardWrapper.this).setAlpha(0.0f);
                cot.c(ObjectCardWrapper.TAG, "switch card...");
                ((FrameLayout) ObjectCardWrapper.h(ObjectCardWrapper.this).findViewById(R.id.rt_muise_card_container)).addView(this.b.getRenderRoot());
                ObjectCardWrapper.e(ObjectCardWrapper.this).addView(ObjectCardWrapper.h(ObjectCardWrapper.this), new ViewGroup.LayoutParams(-2, -2));
                ObjectCardWrapper objectCardWrapper = ObjectCardWrapper.this;
                ObjectCardWrapper.a(objectCardWrapper, ObjectCardWrapper.h(objectCardWrapper));
                ObjectCardWrapper.i(ObjectCardWrapper.this).set(true);
            }
            ObjectCardWrapper.h(ObjectCardWrapper.this).setAlpha(f.floatValue() - f2);
            ObjectCardWrapper.h(ObjectCardWrapper.this).setOnClickListener(new View.OnClickListener() { // from class: com.etao.feimagesearch.intelli.realtime.ObjectCardWrapper.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        ObjectCardWrapper.this.a(true);
                    }
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6712a;

        public f(p pVar) {
            this.f6712a = pVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            cot.c(ObjectCardWrapper.TAG, "onLayoutChange: width = " + (i3 - i) + ", height = " + (i4 - i2));
            this.f6712a.getRenderRoot().requestLayout();
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public g(boolean z) {
            this.b = z;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, animator});
                return;
            }
            q.c(animator, "animator");
            Float f = (Float) animator.getAnimatedValue();
            if (f == null) {
                return;
            }
            f.floatValue();
            float floatValue = this.b ? 1 - f.floatValue() : f.floatValue();
            ObjectCardWrapper.a(ObjectCardWrapper.this).setAlpha(floatValue);
            ObjectCardWrapper.b(ObjectCardWrapper.this).setAlpha(floatValue);
        }
    }

    /* loaded from: classes3.dex */
    public static final class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ a.d b;

        public i(a.d dVar) {
            this.b = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ObjectCardWrapper.a(ObjectCardWrapper.this, this.b);
            }
        }
    }

    static {
        kge.a(1334519691);
        kge.a(-311268728);
        Companion = new a(null);
    }

    public ObjectCardWrapper(Context context, ViewGroup parentView, l objectData, com.etao.feimagesearch.intelli.realtime.c detector, String mssid) {
        q.c(context, "context");
        q.c(parentView, "parentView");
        q.c(objectData, "objectData");
        q.c(detector, "detector");
        q.c(mssid, "mssid");
        this.G = context;
        this.H = parentView;
        this.I = objectData;
        this.J = detector;
        this.K = mssid;
        this.f6705a = CardStatus.IDLE_CARD;
        this.f = new FrameLayout(this.G);
        this.g = new FrameLayout(this.G);
        View inflate = LayoutInflater.from(this.G).inflate(R.layout.feis_realtime_card_anchor_view, (ViewGroup) null, false);
        q.a((Object) inflate, "LayoutInflater.from(cont…anchor_view, null, false)");
        this.h = inflate;
        View inflate2 = LayoutInflater.from(this.G).inflate(R.layout.feis_realtime_native_card, (ViewGroup) null, false);
        q.a((Object) inflate2, "LayoutInflater.from(cont…native_card, null, false)");
        this.i = inflate2;
        View inflate3 = LayoutInflater.from(this.G).inflate(R.layout.feis_realtime_muise_card, (ViewGroup) null, false);
        q.a((Object) inflate3, "LayoutInflater.from(cont…_muise_card, null, false)");
        this.j = inflate3;
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.o = new AtomicBoolean(false);
        this.p = com.etao.feimagesearch.config.b.aC();
        this.q = com.etao.feimagesearch.config.b.aD();
        this.r = com.etao.feimagesearch.config.b.aF();
        this.s = com.etao.feimagesearch.config.b.aJ();
        this.t = com.etao.feimagesearch.config.b.aK();
        this.u = com.etao.feimagesearch.config.b.aL();
        this.v = com.etao.feimagesearch.config.b.aX();
        this.w = com.etao.feimagesearch.config.b.bC();
        this.x = com.etao.feimagesearch.config.b.bF();
        this.y = com.etao.feimagesearch.config.b.bD();
        this.z = com.etao.feimagesearch.config.b.bE();
        this.E = new Point(0, 0);
        this.F = new d(Looper.getMainLooper());
        cot.c(TAG, "create card " + this.I.f());
        this.e = this.i;
        d();
        f();
        e();
        this.b = n();
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        this.F.sendEmptyMessageDelayed(10001, 400L);
    }

    public static final /* synthetic */ View a(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6478a670", new Object[]{objectCardWrapper}) : objectCardWrapper.e;
    }

    public static final /* synthetic */ void a(ObjectCardWrapper objectCardWrapper, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad067064", new Object[]{objectCardWrapper, view});
        } else {
            objectCardWrapper.e = view;
        }
    }

    public static final /* synthetic */ void a(ObjectCardWrapper objectCardWrapper, a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab38442b", new Object[]{objectCardWrapper, dVar});
        } else {
            objectCardWrapper.b(dVar);
        }
    }

    public static final /* synthetic */ View b(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("932a108f", new Object[]{objectCardWrapper}) : objectCardWrapper.h;
    }

    public static final /* synthetic */ d c(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("6bb41272", new Object[]{objectCardWrapper}) : objectCardWrapper.F;
    }

    public static final /* synthetic */ FrameLayout d(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("a49fa8ae", new Object[]{objectCardWrapper}) : objectCardWrapper.f;
    }

    public static final /* synthetic */ FrameLayout e(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("6aca316f", new Object[]{objectCardWrapper}) : objectCardWrapper.g;
    }

    public static final /* synthetic */ AtomicBoolean f(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("84350b09", new Object[]{objectCardWrapper}) : objectCardWrapper.o;
    }

    public static final /* synthetic */ View g(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("7ca1232a", new Object[]{objectCardWrapper}) : objectCardWrapper.i;
    }

    public static final /* synthetic */ View h(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ab528d49", new Object[]{objectCardWrapper}) : objectCardWrapper.j;
    }

    public static final /* synthetic */ AtomicBoolean i(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("cc7b4266", new Object[]{objectCardWrapper}) : objectCardWrapper.m;
    }

    public static final /* synthetic */ void j(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f320085", new Object[]{objectCardWrapper});
        } else {
            objectCardWrapper.h();
        }
    }

    public static final /* synthetic */ void k(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad930464", new Object[]{objectCardWrapper});
        } else {
            objectCardWrapper.g();
        }
    }

    public static final /* synthetic */ void l(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf40843", new Object[]{objectCardWrapper});
        } else {
            objectCardWrapper.i();
        }
    }

    public static final /* synthetic */ void m(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa550c22", new Object[]{objectCardWrapper});
        } else {
            objectCardWrapper.j();
        }
    }

    public final l c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("1cb06e22", new Object[]{this}) : this.I;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-893165293);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        /* renamed from: com.etao.feimagesearch.intelli.realtime.ObjectCardWrapper$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0226a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private Point f6706a;
            private float b;

            static {
                kge.a(-904922316);
            }

            public C0226a(Point beginPoint, float f) {
                q.c(beginPoint, "beginPoint");
                this.f6706a = beginPoint;
                this.b = f;
            }

            public final Point a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Point) ipChange.ipc$dispatch("f4fd5b11", new Object[]{this}) : this.f6706a;
            }

            public final void a(float f) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
                } else {
                    this.b = f;
                }
            }

            public final float b() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : this.b;
            }
        }
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        TUrlImageView anchorDotView = (TUrlImageView) this.h.findViewById(R.id.realtime_anchor_iv);
        q.a((Object) anchorDotView, "anchorDotView");
        anchorDotView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01YgUuLA1hVf80e48Dz_!!6000000004283-2-tps-32-32.png");
        this.f.addView(this.h, new FrameLayout.LayoutParams(com.etao.feimagesearch.util.g.a(18.0f), com.etao.feimagesearch.util.g.a(18.0f)));
        this.f.setX(this.I.a());
        this.f.setY(this.I.b());
        this.H.addView(this.f, new ViewGroup.LayoutParams(-2, -2));
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.E = t();
        this.g.setX(this.E.x);
        this.g.setY(this.E.y);
        this.H.addView(this.g, new ViewGroup.LayoutParams(-2, -2));
        a(CardStatus.NATIVE_CARD);
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.g.addView(this.i, new FrameLayout.LayoutParams(-2, -2));
        TextView guessTv = (TextView) this.i.findViewById(R.id.native_card_guess_tv);
        q.a((Object) guessTv, "guessTv");
        guessTv.setText(this.G.getResources().getString(R.string.feis_rt_native_card_guess, this.I.g()));
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "metasightNativeCardExpose", 2101, "number", String.valueOf(this.I.f()), "category", this.I.g(), "mssid", this.K);
    }

    private final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.F.removeMessages(10002);
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
        }
        if (this.I.a() == this.f.getX() && this.I.b() == this.f.getY()) {
            cot.c(TAG, "no need to move container");
            this.F.sendEmptyMessageDelayed(10002, 350L);
        } else if (this.w && m()) {
            this.F.sendEmptyMessageDelayed(10002, 350L);
        } else {
            cot.c(TAG, "anchorView.width = " + this.h.getWidth() + " anchorView.height = " + this.h.getHeight());
            cot.c(TAG, "anchorContainer.width: " + this.f.getWidth() + ", anchorContainer.height: " + this.f.getHeight());
            this.b = n();
            ValueAnimator valueAnimator2 = this.b;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
            k();
        }
    }

    private final void h() {
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.F.removeMessages(10001);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.I.j() > this.r) {
            z = true;
        }
        if (z == this.l.get()) {
            this.F.sendEmptyMessageDelayed(10001, 400L);
            return;
        }
        ValueAnimator valueAnimator2 = this.c;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) || ((valueAnimator = this.d) != null && valueAnimator.isRunning())) {
            cot.c(TAG, "animator is running, skip");
            this.F.sendEmptyMessageDelayed(10001, 400L);
            return;
        }
        this.l.set(z);
        cot.c(TAG, "processCheckExpiredMsg: curTime: " + currentTimeMillis + ", timestamp: " + this.I.j() + " expired: " + this.l.get());
        ValueAnimator valueAnimator3 = this.c;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            valueAnimator3.removeAllUpdateListeners();
            valueAnimator3.removeAllListeners();
        }
        this.c = ValueAnimator.ofFloat(0.0f, 1.0f);
        ValueAnimator valueAnimator4 = this.c;
        if (valueAnimator4 == null) {
            q.a();
        }
        valueAnimator4.addUpdateListener(new g(z));
        valueAnimator4.addListener(new h(z));
        valueAnimator4.setDuration(400L);
        valueAnimator4.start();
        cot.c(TAG, "start expiredFadeInAndOutAnimator " + z);
    }

    /* loaded from: classes3.dex */
    public static final class h implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public h(boolean z) {
            this.b = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animation});
                return;
            }
            q.c(animation, "animation");
            cot.c(ObjectCardWrapper.TAG, "expiredFadeInAndOutAnimator: onAnimationStart");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                return;
            }
            q.c(animation, "animation");
            cot.c(ObjectCardWrapper.TAG, "expiredFadeInAndOutAnimator: onAnimationEnd");
            ObjectCardWrapper.c(ObjectCardWrapper.this).sendEmptyMessageDelayed(10001, 400L);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animation});
                return;
            }
            q.c(animation, "animation");
            cot.c(ObjectCardWrapper.TAG, "expiredFadeInAndOutAnimator: onAnimationCancel");
            ObjectCardWrapper.c(ObjectCardWrapper.this).sendEmptyMessageDelayed(10001, 400L);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animation});
                return;
            }
            q.c(animation, "animation");
            cot.c(ObjectCardWrapper.TAG, "expiredFadeInAndOutAnimator: onAnimationRepeat");
        }
    }

    private final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.f6705a == CardStatus.INTERACTIVE_CARD) {
            cuk.a(this.G, this.q, 0);
            this.F.sendEmptyMessageDelayed(11002, this.p * 1000);
        } else {
            cot.c(TAG, "processBeginCountMsg cardStatus is " + this.f6705a);
            q();
        }
    }

    private final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.l.get()) {
            cot.c(TAG, "processGoIrpMsg card is expired");
        } else if (this.f6705a == CardStatus.INTERACTIVE_CARD) {
            a(false);
        } else {
            cot.c(TAG, "processGoIrpMsg cardStatus is " + this.f6705a);
            q();
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z) {
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "metasightAutoPullUp", 2101, new String[0]);
        }
        ArrayList arrayList = new ArrayList(1);
        RectF rectF = this.B;
        if (rectF != null) {
            arrayList.add(rectF);
        }
        Bitmap bitmap = this.A;
        if (bitmap == null) {
            return;
        }
        this.J.a(bitmap, arrayList, "");
    }

    public final void a(l newData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135e9c60", new Object[]{this, newData});
            return;
        }
        q.c(newData, "newData");
        cot.c(TAG, "updateObjectData: " + newData.f() + " areaRate: " + newData.k());
        this.I = newData;
        l();
    }

    public final void a(a.d cloudMsgModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e05bb1", new Object[]{this, cloudMsgModel});
            return;
        }
        q.c(cloudMsgModel, "cloudMsgModel");
        this.C++;
        cot.c(TAG, "updateCloudMsg-- " + this.C);
        this.A = cloudMsgModel.c();
        this.B = cloudMsgModel.d();
        this.K = cloudMsgModel.e();
        l();
        this.F.post(new i(cloudMsgModel));
    }

    private final void b(a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f38a01d0", new Object[]{this, dVar});
            return;
        }
        CardStatus o = o();
        cot.c(TAG, "renderOrRefreshData nextStatus: " + o + ", cardStatus: " + this.f6705a);
        JSONObject a2 = a(dVar.a(), o);
        p pVar = this.k;
        if (pVar != null) {
            pVar.refresh(a2, null);
            return;
        }
        String c2 = c(dVar);
        if (c2 == null) {
            return;
        }
        p a3 = com.taobao.android.weex_framework.q.a().a(this.G);
        a3.registerRenderListener(this);
        this.D = System.currentTimeMillis();
        s.Companion.a(a3, c2, c2, a2, null);
        this.k = a3;
        a(o);
    }

    private final void k() {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        a.d dVar = this.n;
        if (dVar != null) {
            cot.c(TAG, "renderOrRefreshData is not null");
            b(dVar);
        } else if (this.f6705a == CardStatus.IDLE_CARD || this.f6705a == CardStatus.NATIVE_CARD) {
            cot.c(TAG, this.f6705a + " and not cloud cache, skip");
        } else {
            CardStatus o = o();
            if (o == this.f6705a || (pVar = this.k) == null) {
                return;
            }
            cot.c(TAG, "changeMuiseCardStatus cardStatus: " + this.f6705a + ", nextStatus: " + o);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) fjp.BIZ_CONTEXT_KEY_CARD_TYPE, o.getContent());
            pVar.sendInstanceMessage("MUISE", "MetaSightCardChange", jSONObject);
            a(o);
        }
    }

    private final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (!this.m.get()) {
        } else {
            this.I.c();
        }
    }

    private final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        float f2 = this.x;
        float f3 = f2 + 0.5f;
        float f4 = f2 + 0.5f;
        return this.I.a() > ((float) this.H.getWidth()) * f3 && this.I.a() < ((float) this.H.getWidth()) * f4 && this.I.b() > ((float) this.H.getHeight()) * f3 && this.I.b() < ((float) this.H.getHeight()) * f4;
    }

    private final ValueAnimator n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("4102f359", new Object[]{this});
        }
        float x = this.f.getX();
        float y = this.f.getY();
        float a2 = this.I.a() - x;
        float b2 = this.I.b() - y;
        float x2 = this.g.getX();
        float y2 = this.g.getY();
        this.E = t();
        float f2 = this.E.x - x2;
        float f3 = this.E.y - y2;
        ValueAnimator newValueAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
        q.a((Object) newValueAnimator, "newValueAnimator");
        newValueAnimator.setDuration(350L);
        newValueAnimator.addUpdateListener(new b(a2, x, b2, y, f2, x2, f3, y2));
        newValueAnimator.addListener(new c());
        return newValueAnimator;
    }

    /* loaded from: classes3.dex */
    public static final class c implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animation});
                return;
            }
            q.c(animation, "animation");
            cot.c(ObjectCardWrapper.TAG, "trackAnimator onAnimationStart");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                return;
            }
            q.c(animation, "animation");
            if (ObjectCardWrapper.f(ObjectCardWrapper.this).get()) {
                return;
            }
            cot.c(ObjectCardWrapper.TAG, "trackAnimator onAnimationEnd");
            ObjectCardWrapper.c(ObjectCardWrapper.this).sendEmptyMessage(10002);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animation});
                return;
            }
            q.c(animation, "animation");
            cot.c(ObjectCardWrapper.TAG, "trackAnimator onAnimationCancel");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animation});
                return;
            }
            q.c(animation, "animation");
            cot.c(ObjectCardWrapper.TAG, "trackAnimator onAnimationRepeat");
        }
    }

    private final CardStatus o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CardStatus) ipChange.ipc$dispatch("d2d2ffb4", new Object[]{this});
        }
        float k = this.I.k();
        cot.c(TAG, "getNextCardStatus areaRate:" + k);
        CardStatus a2 = a(k);
        if (this.f6705a == CardStatus.IDLE_CARD || this.f6705a == CardStatus.NATIVE_CARD || a2 == this.f6705a) {
            return a2;
        }
        CardStatus a3 = a(k - this.s);
        return a3 != this.f6705a ? a3 : a(k + this.s);
    }

    private final CardStatus a(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CardStatus) ipChange.ipc$dispatch("4b9bba12", new Object[]{this, new Float(f2)});
        }
        if (f2 < this.t) {
            return CardStatus.SMALL_MUISE_CARD;
        }
        if (f2 < this.u) {
            return CardStatus.BIG_MUISE_CARD;
        }
        return CardStatus.INTERACTIVE_CARD;
    }

    private final JSONObject a(JSONObject jSONObject, CardStatus cardStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f9dea23c", new Object[]{this, jSONObject, cardStatus});
        }
        Object obj = jSONObject.get("showCardInfo");
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "model", (String) ((JSONObject) obj));
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = jSONObject4;
        jSONObject5.put((JSONObject) fjp.BIZ_CONTEXT_KEY_CARD_TYPE, cardStatus.getContent());
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = jSONObject6;
        jSONObject7.put((JSONObject) "updateCount", (String) Integer.valueOf(this.C));
        jSONObject7.put((JSONObject) "category", this.I.g());
        jSONObject5.put((JSONObject) "traceInfo", (String) jSONObject6);
        jSONObject5.put((JSONObject) "spm", "a2141.7631739");
        jSONObject3.put((JSONObject) "status", (String) jSONObject4);
        return jSONObject2;
    }

    private final String c(a.d dVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf1b4891", new Object[]{this, dVar});
        }
        Object obj = dVar.a().get("showCardInfo");
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
        }
        Object obj2 = ((JSONObject) obj).get("tItemType");
        if (obj2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
        String str2 = (String) obj2;
        Iterator<Object> it = dVar.b().iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) next;
                if (q.a((Object) str2, (Object) com.taobao.android.searchbaseframe.util.a.a(jSONObject, "templateName", str))) {
                    str = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "url", str);
                    q.a((Object) str, "FastJsonParseUtil.parseString(template, \"url\", \"\")");
                    break;
                }
            }
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        cot.c(TAG, "url = " + str);
        return str;
    }

    private final void a(CardStatus cardStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e551affc", new Object[]{this, cardStatus});
        } else if (this.f6705a == cardStatus) {
        } else {
            cot.c(TAG, "changeCardStatus preCardStatus:" + this.f6705a + ", nextStatus: " + cardStatus);
            if (cardStatus == CardStatus.INTERACTIVE_CARD) {
                p();
            }
            this.f6705a = cardStatus;
        }
    }

    private final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (this.l.get()) {
        } else {
            this.F.sendEmptyMessageDelayed(11001, 2000L);
        }
    }

    private final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        this.F.removeMessages(11001);
        this.F.removeMessages(11002);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        cot.c(TAG, "destroy begin " + this.I.f());
        this.o.set(true);
        this.l.set(false);
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
            valueAnimator2.removeAllListeners();
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.b;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllListeners();
            valueAnimator3.removeAllUpdateListeners();
            valueAnimator3.cancel();
        }
        this.F.removeCallbacksAndMessages(null);
        this.g.removeView(this.j);
        this.g.removeView(this.i);
        this.f.removeAllViews();
        p pVar = this.k;
        if (pVar != null) {
            pVar.destroy();
        }
        this.I.c();
        cot.c(TAG, "destroy finish " + this.I.f());
    }

    @Override // com.taobao.android.weex_framework.g
    public void onForeground(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
        } else {
            cot.d(TAG, "onForeground");
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onPrepareSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
        } else {
            cot.d(TAG, "onPrepareSuccess");
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        cot.d(TAG, "onRenderSuccess ");
        this.n = null;
        if (pVar == null) {
            return;
        }
        k.Companion.a(true, System.currentTimeMillis() - this.D);
        pVar.getRenderRoot().addOnLayoutChangeListener(new f(pVar));
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.d = ValueAnimator.ofFloat(0.0f, 2.0f);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 == null) {
            q.a();
        }
        valueAnimator2.setDuration(800L);
        valueAnimator2.addUpdateListener(new e(pVar));
        valueAnimator2.start();
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(p pVar, int i2, String errorMsg, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i2), errorMsg, new Boolean(z)});
            return;
        }
        q.c(errorMsg, "errorMsg");
        cot.b(TAG, "onRenderFailed type:" + i2 + ", errorMsg:" + errorMsg);
        k.Companion.a(false, System.currentTimeMillis() - this.D);
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "metasightCardRenderFailed", 2101, "errorCode", String.valueOf(i2), "errorMsg", errorMsg);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
            return;
        }
        cot.d(TAG, "onRefreshSuccess");
        this.n = null;
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshFailed(p pVar, int i2, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i2), str, new Boolean(z)});
            return;
        }
        cot.b(TAG, "onRefreshFailed " + i2 + ' ' + str + ' ' + z);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onJSException(p pVar, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i2), str});
            return;
        }
        cot.b(TAG, "onJSException " + i2 + ' ' + str);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onFatalException(p pVar, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i2), str});
            return;
        }
        cot.b(TAG, "onFatalException " + i2 + ' ' + str);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        } else {
            cot.c(TAG, "onDestroyed");
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.l.get();
    }

    private final Point a(CardPositionType cardPositionType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("a5ac724e", new Object[]{this, cardPositionType});
        }
        int width = this.f.getWidth();
        int height = this.f.getHeight();
        if (width == 0 && height == 0) {
            int a2 = com.etao.feimagesearch.util.g.a(18.0f);
            height = com.etao.feimagesearch.util.g.a(18.0f);
            width = a2;
        }
        int width2 = this.g.getWidth();
        int height2 = this.g.getHeight();
        if (width2 == 0 && height2 == 0) {
            width2 = com.etao.feimagesearch.util.g.a(132.0f);
            height2 = com.etao.feimagesearch.util.g.a(52.0f);
        }
        int i2 = com.etao.feimagesearch.intelli.realtime.b.$EnumSwitchMapping$0[cardPositionType.ordinal()];
        if (i2 == 1) {
            this.E = new Point((int) ((this.I.a() + (width / 2)) - (width2 / 2)), (int) (this.I.b() - (height2 + com.etao.feimagesearch.util.g.a(6.0f))));
        } else if (i2 == 2) {
            this.E = new Point((int) ((this.I.a() + (width / 2)) - (width2 / 2)), (int) (this.I.b() + height + com.etao.feimagesearch.util.g.a(6.0f)));
        } else if (i2 == 3) {
            this.E = new Point((int) (this.I.a() - (width2 + com.etao.feimagesearch.util.g.a(6.0f))), (int) ((this.I.b() + (height / 2)) - (height2 / 2)));
        } else if (i2 == 4) {
            this.E = new Point((int) (this.I.a() + width + com.etao.feimagesearch.util.g.a(6.0f)), (int) ((this.I.b() + (height / 2)) - (height2 / 2)));
        }
        return this.E;
    }

    private final int r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65bfbec", new Object[]{this})).intValue() : this.g.getWidth();
    }

    private final int s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66a136d", new Object[]{this})).intValue() : this.g.getHeight();
    }

    private final Point t() {
        Point a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("d480e71e", new Object[]{this});
        }
        if (!this.v) {
            return a(CardPositionType.RIGHT);
        }
        HashMap<CardPositionType, a.C0226a> hashMap = new HashMap<>(4);
        HashMap<CardPositionType, a.C0226a> hashMap2 = hashMap;
        hashMap2.put(CardPositionType.LEFT, new a.C0226a(a(CardPositionType.LEFT), 0.0f));
        hashMap2.put(CardPositionType.RIGHT, new a.C0226a(a(CardPositionType.RIGHT), 0.1f));
        hashMap2.put(CardPositionType.UP, new a.C0226a(a(CardPositionType.UP), 0.0f));
        hashMap2.put(CardPositionType.DOWN, new a.C0226a(a(CardPositionType.DOWN), 0.0f));
        b(hashMap, this.g);
        if (this.y) {
            a(hashMap, this.g);
        }
        float f2 = -100000.0f;
        CardPositionType cardPositionType = CardPositionType.RIGHT;
        for (Map.Entry<CardPositionType, a.C0226a> entry : hashMap.entrySet()) {
            cot.c(TAG, entry.getKey() + " -> " + entry.getValue().b());
            if (entry.getValue().b() > f2) {
                f2 = entry.getValue().b();
                CardPositionType key = entry.getKey();
                q.a((Object) key, "entry.key");
                cardPositionType = key;
                z = true;
            }
        }
        cot.c(TAG, z + " -> tmpType " + cardPositionType);
        a.C0226a c0226a = hashMap.get(cardPositionType);
        return (c0226a == null || (a2 = c0226a.a()) == null) ? a(cardPositionType) : a2;
    }

    private final HashMap<CardPositionType, a.C0226a> a(HashMap<CardPositionType, a.C0226a> hashMap, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("45310f31", new Object[]{this, hashMap, frameLayout});
        }
        int p = com.p();
        int o = com.o();
        for (Map.Entry<CardPositionType, a.C0226a> entry : hashMap.entrySet()) {
            float b2 = entry.getValue().b();
            Point a2 = entry.getValue().a();
            int width = this.e.getWidth();
            int height = this.e.getHeight();
            Point point = new Point(a2.x + frameLayout.getWidth(), a2.y + frameLayout.getHeight());
            float f2 = width;
            float f3 = 0;
            if (a2.x + (this.z * f2) < f3 || a2.y + (height * this.z) < f3) {
                b2 -= 1.0f;
            }
            if (point.x - (f2 * this.z) > p || point.y - (height * this.z) > o) {
                b2 -= 1.0f;
            }
            if (b2 != entry.getValue().b()) {
                cot.c(TAG, "resign score, before " + entry.getValue().b() + ", after " + b2 + ' ' + entry.getKey());
                entry.getValue().a(b2);
            }
        }
        return hashMap;
    }

    private final HashMap<CardPositionType, a.C0226a> b(HashMap<CardPositionType, a.C0226a> hashMap, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("7e116fd0", new Object[]{this, hashMap, frameLayout});
        }
        for (Map.Entry<CardPositionType, a.C0226a> entry : hashMap.entrySet()) {
            float b2 = entry.getValue().b();
            Point a2 = entry.getValue().a();
            Point point = new Point(a2.x + frameLayout.getWidth(), a2.y + frameLayout.getHeight());
            for (ObjectCardWrapper objectCardWrapper : com.etao.feimagesearch.intelli.realtime.a.Companion.a().b()) {
                if (!objectCardWrapper.b() && objectCardWrapper.I.f() != this.I.f()) {
                    Point point2 = objectCardWrapper.E;
                    Point point3 = new Point(point2.x + objectCardWrapper.r(), point2.y + objectCardWrapper.s());
                    if ((a2.x > point2.x && a2.x < point3.x) || ((a2.y > point2.y && a2.y < point3.y) || ((point.x > point2.x && point.x < point3.x) || (point.y > point2.y && point.y < point3.y)))) {
                        b2 -= 1.0f;
                        cot.c(TAG, this.I.f() + ' ' + entry.getKey() + " overlap with " + objectCardWrapper.I.f());
                    }
                }
            }
            if (b2 != entry.getValue().b()) {
                cot.c(TAG, "resign score, before " + entry.getValue().b() + ", after " + b2);
                entry.getValue().a(b2);
            }
        }
        return hashMap;
    }
}
