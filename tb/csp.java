package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class csp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f26493a;
    private final ValueAnimator b;
    private cso c;
    private final int d;
    private final int e;
    private final long f;

    static {
        kge.a(2067862113);
    }

    public csp(int i, int i2, long j) {
        this.d = i;
        this.e = i2;
        this.f = j;
        int i3 = this.d;
        this.f26493a = i3;
        this.b = ValueAnimator.ofInt(i3, this.e);
        ValueAnimator animator = this.b;
        q.a((Object) animator, "animator");
        animator.setInterpolator(new AccelerateDecelerateInterpolator());
        ValueAnimator animator2 = this.b;
        q.a((Object) animator2, "animator");
        animator2.setDuration(this.f);
        this.b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.csp.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, it});
                    return;
                }
                q.a((Object) it, "it");
                Object animatedValue = it.getAnimatedValue();
                if (!(animatedValue instanceof Integer)) {
                    return;
                }
                cso a2 = csp.this.a();
                if (a2 != null) {
                    a2.a(((Number) animatedValue).intValue() - csp.a(csp.this));
                }
                csp.a(csp.this, ((Number) animatedValue).intValue());
            }
        });
        this.b.addListener(new AnimatorListenerAdapter() { // from class: tb.csp.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator3});
                    return;
                }
                cso a2 = csp.this.a();
                if (a2 == null) {
                    return;
                }
                a2.a();
            }
        });
    }

    public static final /* synthetic */ int a(csp cspVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e40d2ccb", new Object[]{cspVar})).intValue() : cspVar.f26493a;
    }

    public static final /* synthetic */ void a(csp cspVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d98e12b", new Object[]{cspVar, new Integer(i)});
        } else {
            cspVar.f26493a = i;
        }
    }

    public final cso a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cso) ipChange.ipc$dispatch("f0362ff", new Object[]{this}) : this.c;
    }

    public final void a(cso csoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e40cb879", new Object[]{this, csoVar});
        } else {
            this.c = csoVar;
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ValueAnimator animator = this.b;
        q.a((Object) animator, "animator");
        if (!animator.isRunning()) {
            return;
        }
        this.b.cancel();
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        ValueAnimator valueAnimator = this.b;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ValueAnimator animator = this.b;
        q.a((Object) animator, "animator");
        if (animator.isRunning()) {
            return;
        }
        this.b.start();
    }
}
