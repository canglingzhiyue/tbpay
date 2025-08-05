package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class kdm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f29981a;
    private final boolean b;
    private final long c;
    private final long d;
    private final long e;
    private final boolean f;
    private final ValueAnimator.AnimatorUpdateListener g;
    private final Animator.AnimatorListener h;
    private final View i;
    private AnimatorSet j;
    private final View k;

    static {
        kge.a(141292588);
    }

    public kdm(a aVar) {
        this.f29981a = a.a(aVar);
        this.b = a.b(aVar);
        this.i = a.c(aVar);
        this.k = a.d(aVar);
        this.c = a.e(aVar);
        this.d = a.f(aVar);
        this.e = a.g(aVar);
        this.f = a.h(aVar);
        this.g = a.i(aVar);
        this.h = a.j(aVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.k == null) {
        } else {
            ArrayList arrayList = new ArrayList();
            this.j = new AnimatorSet();
            if (this.f29981a) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.k, "alpha", 1.0f, 0.0f);
                ofFloat.setDuration(this.c);
                ofFloat.setStartDelay(this.d);
                arrayList.add(ofFloat);
            }
            if (this.f) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat2.setDuration(this.e);
                ofFloat2.addUpdateListener(this.g);
                ofFloat2.addListener(this.h);
                ofFloat2.setInterpolator(new DecelerateInterpolator());
                arrayList.add(ofFloat2);
            }
            if (this.b) {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.i, "alpha", 0.6f, 0.0f);
                ofFloat3.setDuration(this.c);
                ofFloat3.setStartDelay(this.d);
                arrayList.add(ofFloat3);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.j.playTogether(arrayList);
            this.j.start();
            kej.a("AdAnimationCreator", "start");
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        kej.a("AdAnimationCreator", "cancel");
        this.j.cancel();
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f29982a;
        private long b;
        private long c;
        private long d;
        private boolean e;
        private boolean f;
        private ValueAnimator.AnimatorUpdateListener g;
        private Animator.AnimatorListener h;
        private View i;
        private View j;

        static {
            kge.a(-1786875946);
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("34b7b34b", new Object[]{aVar})).booleanValue() : aVar.f29982a;
        }

        public static /* synthetic */ boolean b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8e931d8c", new Object[]{aVar})).booleanValue() : aVar.f;
        }

        public static /* synthetic */ View c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e5c01fcb", new Object[]{aVar}) : aVar.i;
        }

        public static /* synthetic */ View d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6397dbcc", new Object[]{aVar}) : aVar.j;
        }

        public static /* synthetic */ long e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9c255c3f", new Object[]{aVar})).longValue() : aVar.b;
        }

        public static /* synthetic */ long f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f600c680", new Object[]{aVar})).longValue() : aVar.c;
        }

        public static /* synthetic */ long g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fdc30c1", new Object[]{aVar})).longValue() : aVar.d;
        }

        public static /* synthetic */ boolean h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9b79b12", new Object[]{aVar})).booleanValue() : aVar.e;
        }

        public static /* synthetic */ ValueAnimator.AnimatorUpdateListener i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ValueAnimator.AnimatorUpdateListener) ipChange.ipc$dispatch("68a6431b", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ Animator.AnimatorListener j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Animator.AnimatorListener) ipChange.ipc$dispatch("561a8df4", new Object[]{aVar}) : aVar.h;
        }

        public a a(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("28b928d9", new Object[]{this, animatorUpdateListener});
            }
            this.g = animatorUpdateListener;
            return this;
        }

        public a a(Animator.AnimatorListener animatorListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bace0829", new Object[]{this, animatorListener});
            }
            this.h = animatorListener;
            return this;
        }

        public a a(kdn kdnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a8b802d2", new Object[]{this, kdnVar});
            }
            this.f29982a = kdnVar.a();
            this.f = kdnVar.e();
            this.e = kdnVar.c();
            this.i = kdnVar.h();
            this.c = kdnVar.b();
            this.b = kdnVar.f();
            this.d = kdnVar.d();
            this.j = kdnVar.g();
            return this;
        }

        public kdm a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (kdm) ipChange.ipc$dispatch("f06cd6a", new Object[]{this}) : new kdm(this);
        }
    }
}
