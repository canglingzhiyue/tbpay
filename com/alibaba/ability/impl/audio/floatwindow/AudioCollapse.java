package com.alibaba.ability.impl.audio.floatwindow;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.v4.view.GravityCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.megadesign.anim.lottie.MALottieView;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.hsy;
import tb.kge;
import tb.ruk;

/* loaded from: classes2.dex */
public final class AudioCollapse extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float CONTAINER_HEIGHT = 36.0f;
    public static final float CONTAINER_WIDTH = 36.0f;
    private static final a Companion;
    public static final float EDGE_LIMIT_MARGIN = 0.0f;
    public static final float MOVE_TRANSLATION_Y_LIMIT = 25.0f;
    public static final float STROKE_WIDTH = 2.0f;
    private int bottomLimit;
    private float[] centerRadii;
    private DisplayMetrics displayMetrics;
    private long downDelay;
    private float downX;
    private float downY;
    private GradientDrawable drawable;
    private final ruk<t> expand;
    private float interceptDownX;
    private float interceptDownY;
    private volatile boolean isMoving;
    private int leftLimit;
    private float[] leftRadii;
    private MALottieView lottieVIew;
    private final int moveSlop;
    private int rightLimit;
    private float[] rightRadii;
    private int topLimit;

    /* loaded from: classes2.dex */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref.BooleanRef b;

        public b(Ref.BooleanRef booleanRef) {
            this.b = booleanRef;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator it) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, it});
                return;
            }
            q.d(it, "it");
            AudioCollapse audioCollapse = AudioCollapse.this;
            Object animatedValue = it.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
            audioCollapse.setTranslationX(((Float) animatedValue).floatValue());
        }
    }

    static {
        kge.a(1192452734);
        Companion = new a(null);
    }

    public AudioCollapse(Context context, ruk<t> rukVar) {
        this(context, rukVar, null, 0, 12, null);
    }

    public AudioCollapse(Context context, ruk<t> rukVar, AttributeSet attributeSet) {
        this(context, rukVar, attributeSet, 0, 8, null);
    }

    public static /* synthetic */ Object ipc$super(AudioCollapse audioCollapse, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ GradientDrawable access$getDrawable$p(AudioCollapse audioCollapse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("1a176b52", new Object[]{audioCollapse}) : audioCollapse.drawable;
    }

    public static final /* synthetic */ float[] access$getLeftRadii$p(AudioCollapse audioCollapse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("d03b565", new Object[]{audioCollapse}) : audioCollapse.leftRadii;
    }

    public static final /* synthetic */ float[] access$getRightRadii$p(AudioCollapse audioCollapse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("d96e710e", new Object[]{audioCollapse}) : audioCollapse.rightRadii;
    }

    public static final /* synthetic */ void access$setDrawable$p(AudioCollapse audioCollapse, GradientDrawable gradientDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70907f8", new Object[]{audioCollapse, gradientDrawable});
        } else {
            audioCollapse.drawable = gradientDrawable;
        }
    }

    public static final /* synthetic */ void access$setLeftRadii$p(AudioCollapse audioCollapse, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf99333b", new Object[]{audioCollapse, fArr});
        } else {
            audioCollapse.leftRadii = fArr;
        }
    }

    public static final /* synthetic */ void access$setRightRadii$p(AudioCollapse audioCollapse, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa60b44a", new Object[]{audioCollapse, fArr});
        } else {
            audioCollapse.rightRadii = fArr;
        }
    }

    public /* synthetic */ AudioCollapse(Context context, ruk rukVar, AttributeSet attributeSet, int i, int i2, o oVar) {
        this(context, rukVar, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioCollapse(Context context, ruk<t> expand, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        q.d(context, "context");
        q.d(expand, "expand");
        this.expand = expand;
        this.moveSlop = hsy.a(context, 2.0f);
        this.topLimit = hsy.a(context, 25.0f);
        this.rightLimit = -hsy.a(context, 0.0f);
        this.displayMetrics = hsy.a(context);
        this.bottomLimit = this.displayMetrics.heightPixels - hsy.a(context, 61.0f);
        this.leftLimit = hsy.a(context, 36.0f) - this.displayMetrics.widthPixels;
        initLayout();
    }

    private final void initLayout() {
        Resources resources;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4adf07e1", new Object[]{this});
            return;
        }
        if (getLayoutParams() == null) {
            Context context = getContext();
            q.b(context, "context");
            int a2 = hsy.a(context, 36.0f);
            Context context2 = getContext();
            q.b(context2, "context");
            setLayoutParams(new FrameLayout.LayoutParams(a2, hsy.a(context2, 36.0f)));
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.gravity = GravityCompat.END;
        }
        Context context3 = getContext();
        q.b(context3, "context");
        setTranslationX(-hsy.a(context3, 0.0f));
        Context context4 = getContext();
        q.b(context4, "context");
        q.b(context4.getResources(), "context.resources");
        Context context5 = getContext();
        q.b(context5, "context");
        setTranslationY((resources.getDisplayMetrics().heightPixels / 2.0f) - hsy.a(context5, 18.0f));
        float f = getLayoutParams().height / 2;
        this.rightRadii = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
        this.centerRadii = new float[]{f, f, f, f, f, f, f, f};
        this.leftRadii = new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f};
        setBackground();
        Context context6 = getContext();
        q.b(context6, "context");
        int a3 = hsy.a(context6, 6.0f);
        MALottieView mALottieView = new MALottieView(getContext());
        this.lottieVIew = mALottieView;
        mALottieView.setPadding(a3, a3, a3, a3);
        mALottieView.setUpWithConfig(com.taobao.android.megadesign.anim.lottie.a.Builder.c("https://gw.alipayobjects.com/os/finxbff/lolita/9d55c508-d926-419e-a73a-e6669bb1d0a0/lottie.json").a(-1).a());
        addView(mALottieView, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        MALottieView mALottieView = this.lottieVIew;
        if (mALottieView == null) {
            return;
        }
        mALottieView.pauseAnimation();
    }

    public final void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        MALottieView mALottieView = this.lottieVIew;
        if (mALottieView == null) {
            return;
        }
        mALottieView.playAnimation();
    }

    private final void setBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b91c7b7", new Object[]{this});
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(this.rightRadii);
        Context context = getContext();
        q.b(context, "context");
        gradientDrawable.setStroke(hsy.a(context, 2.0f), Color.parseColor("#0DFFFFFF"));
        gradientDrawable.setColor(Color.parseColor("#FF363636"));
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(gradientDrawable);
        }
        this.drawable = gradientDrawable;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.isMoving = false;
            this.interceptDownY = motionEvent.getRawY();
            this.interceptDownX = motionEvent.getRawX();
        } else if (valueOf != null && valueOf.intValue() == 2) {
            this.downY = motionEvent.getRawY();
            this.downX = motionEvent.getRawX();
            this.downDelay = System.currentTimeMillis();
            boolean z2 = Math.abs(motionEvent.getRawY() - this.interceptDownY) > ((float) this.moveSlop);
            if (Math.abs(motionEvent.getRawX() - this.interceptDownX) <= this.moveSlop) {
                z = false;
            }
            boolean z3 = z2 | z;
            this.isMoving = z3;
            return z3;
        } else if (valueOf != null && valueOf.intValue() == 1) {
            if (!this.isMoving) {
                this.expand.mo2427invoke();
            }
            this.isMoving = false;
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (valueOf != null && valueOf.intValue() == 2) {
            float rawY = motionEvent.getRawY() - this.downY;
            float rawX = motionEvent.getRawX() - this.downX;
            float translationY = getTranslationY() + rawY;
            if (translationY >= this.topLimit && translationY <= this.bottomLimit) {
                setTranslationY(translationY);
            }
            float translationX = getTranslationX() + rawX;
            if (translationX >= this.leftLimit && translationX <= this.rightLimit) {
                setTranslationX(translationX);
            }
            this.downY = motionEvent.getRawY();
            this.downX = motionEvent.getRawX();
            GradientDrawable gradientDrawable = this.drawable;
            q.a(gradientDrawable);
            gradientDrawable.setCornerRadii(this.centerRadii);
        } else if (valueOf != null && valueOf.intValue() == 1) {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            float f = this.downX;
            Context context = getContext();
            q.b(context, "context");
            Resources resources = context.getResources();
            q.b(resources, "context.resources");
            booleanRef.element = f >= ((float) (resources.getDisplayMetrics().widthPixels / 2));
            if (booleanRef.element) {
                i = this.rightLimit;
            } else {
                i = this.leftLimit;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getTranslationX(), i);
            ofFloat.addUpdateListener(new b(booleanRef));
            ofFloat.addListener(new c(booleanRef));
            ofFloat.setDuration(150L);
            ofFloat.start();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* loaded from: classes2.dex */
    public static final class c implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref.BooleanRef b;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animation});
            } else {
                q.d(animation, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animation});
            } else {
                q.d(animation, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animation});
            } else {
                q.d(animation, "animation");
            }
        }

        public c(Ref.BooleanRef booleanRef) {
            this.b = booleanRef;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                return;
            }
            q.d(animation, "animation");
            if (this.b.element) {
                GradientDrawable access$getDrawable$p = AudioCollapse.access$getDrawable$p(AudioCollapse.this);
                q.a(access$getDrawable$p);
                access$getDrawable$p.setCornerRadii(AudioCollapse.access$getRightRadii$p(AudioCollapse.this));
                return;
            }
            GradientDrawable access$getDrawable$p2 = AudioCollapse.access$getDrawable$p(AudioCollapse.this);
            q.a(access$getDrawable$p2);
            access$getDrawable$p2.setCornerRadii(AudioCollapse.access$getLeftRadii$p(AudioCollapse.this));
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(501270598);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
