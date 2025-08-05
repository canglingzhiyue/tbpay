package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public abstract class ofl implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float DEFAULT_DECELERATE_FACTOR = -2.0f;
    public static final float DEFAULT_TOUCH_DRAG_MOVE_RATIO_BCK = 1.0f;
    public static final float DEFAULT_TOUCH_DRAG_MOVE_RATIO_FWD = 3.0f;
    public static final String TAG = "OverScrollDecor";
    public final ofk b;
    public final g d;
    public final b e;
    public float g;

    /* renamed from: a  reason: collision with root package name */
    public final f f31995a = new f();
    public final d c = new d();
    public c f = this.c;

    /* loaded from: classes8.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Property<View, Float> f31996a;
        public float b;
        public float c;

        static {
            kge.a(1384287904);
        }

        public abstract void a(View view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes8.dex */
    public interface c {
        void a(c cVar);

        boolean a(MotionEvent motionEvent);

        boolean b(MotionEvent motionEvent);
    }

    /* loaded from: classes8.dex */
    public static abstract class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f31999a;
        public float b;
        public boolean c;

        static {
            kge.a(1782292776);
        }

        public abstract boolean a(View view, MotionEvent motionEvent);
    }

    /* loaded from: classes8.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public int f32000a;
        public float b;
        public boolean c;

        static {
            kge.a(-136722627);
        }
    }

    static {
        kge.a(1683203049);
        kge.a(-468432129);
    }

    public abstract e a();

    public abstract void a(View view, float f2);

    public abstract void a(View view, float f2, MotionEvent motionEvent);

    public abstract a b();

    /* loaded from: classes8.dex */
    public class d implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final e f31998a;

        static {
            kge.a(-1298532862);
            kge.a(-1432123644);
        }

        @Override // tb.ofl.c
        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c54ed64", new Object[]{this, cVar});
            }
        }

        @Override // tb.ofl.c
        public boolean b(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("74207cc2", new Object[]{this, motionEvent})).booleanValue();
            }
            return false;
        }

        public d() {
            this.f31998a = ofl.this.a();
        }

        @Override // tb.ofl.c
        public boolean a(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
            }
            if (!this.f31998a.a(ofl.this.b.a(), motionEvent)) {
                return false;
            }
            if ((!ofl.this.b.b() || !this.f31998a.c) && (!ofl.this.b.c() || this.f31998a.c)) {
                return false;
            }
            ofl.this.f31995a.f32000a = motionEvent.getPointerId(0);
            ofl.this.f31995a.b = this.f31998a.f31999a;
            ofl.this.f31995a.c = this.f31998a.c;
            ofl oflVar = ofl.this;
            oflVar.a(oflVar.d);
            return ofl.this.d.a(motionEvent);
        }
    }

    /* loaded from: classes8.dex */
    public class g implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final float f32001a;
        public final float b;
        public final e c;
        public int d;

        static {
            kge.a(1520942667);
            kge.a(-1432123644);
        }

        public g(float f, float f2) {
            this.c = ofl.this.a();
            this.f32001a = f;
            this.b = f2;
        }

        @Override // tb.ofl.c
        public boolean a(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
            }
            if (ofl.this.f31995a.f32000a != motionEvent.getPointerId(0)) {
                ofl oflVar = ofl.this;
                oflVar.a(oflVar.e);
                return true;
            }
            View a2 = ofl.this.b.a();
            if (!this.c.a(a2, motionEvent)) {
                return true;
            }
            float f = this.c.b / (this.c.c == ofl.this.f31995a.c ? this.f32001a : this.b);
            float f2 = this.c.f31999a + f;
            if ((ofl.this.f31995a.c && !this.c.c && f2 <= ofl.this.f31995a.b) || (!ofl.this.f31995a.c && this.c.c && f2 >= ofl.this.f31995a.b)) {
                ofl oflVar2 = ofl.this;
                oflVar2.a(a2, oflVar2.f31995a.b, motionEvent);
                ofl oflVar3 = ofl.this;
                oflVar3.a(oflVar3.c);
                return true;
            }
            if (a2.getParent() != null) {
                a2.getParent().requestDisallowInterceptTouchEvent(true);
            }
            long eventTime = motionEvent.getEventTime() - motionEvent.getHistoricalEventTime(0);
            if (eventTime > 0) {
                ofl.this.g = f / ((float) eventTime);
            }
            ofl.this.a(a2, f2);
            return true;
        }

        @Override // tb.ofl.c
        public boolean b(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("74207cc2", new Object[]{this, motionEvent})).booleanValue();
            }
            ofl oflVar = ofl.this;
            oflVar.a(oflVar.e);
            return false;
        }

        @Override // tb.ofl.c
        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            int i = 1;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c54ed64", new Object[]{this, cVar});
                return;
            }
            if (!ofl.this.f31995a.c) {
                i = 2;
            }
            this.d = i;
        }
    }

    /* loaded from: classes8.dex */
    public class b implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Interpolator f31997a = new DecelerateInterpolator();
        public final float b;
        public final float c;
        public final a d;

        static {
            kge.a(-813209753);
            kge.a(-1432123644);
            kge.a(1420754541);
            kge.a(1499308443);
        }

        @Override // tb.ofl.c
        public boolean a(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
            }
            return true;
        }

        @Override // tb.ofl.c
        public boolean b(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("74207cc2", new Object[]{this, motionEvent})).booleanValue();
            }
            return true;
        }

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

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            }
        }

        public b(float f) {
            this.b = f;
            this.c = f * 2.0f;
            this.d = ofl.this.b();
        }

        @Override // tb.ofl.c
        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c54ed64", new Object[]{this, cVar});
                return;
            }
            Animator a2 = a();
            a2.addListener(this);
            a2.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ofl oflVar = ofl.this;
            oflVar.a(oflVar.c);
        }

        public Animator a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Animator) ipChange.ipc$dispatch("5db56a8b", new Object[]{this});
            }
            View a2 = ofl.this.b.a();
            this.d.a(a2);
            if (ofl.this.g == 0.0f || ((ofl.this.g < 0.0f && ofl.this.f31995a.c) || (ofl.this.g > 0.0f && !ofl.this.f31995a.c))) {
                return a(this.d.b);
            }
            float f = (-ofl.this.g) / this.b;
            if (f < 0.0f) {
                f = 0.0f;
            }
            float f2 = this.d.b + (((-ofl.this.g) * ofl.this.g) / this.c);
            ObjectAnimator a3 = a(a2, (int) f, f2);
            ObjectAnimator a4 = a(f2);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(a3, a4);
            return animatorSet;
        }

        public ObjectAnimator a(View view, int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ObjectAnimator) ipChange.ipc$dispatch("e2e970d", new Object[]{this, view, new Integer(i), new Float(f)});
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, this.d.f31996a, f);
            ofFloat.setDuration(i);
            ofFloat.setInterpolator(this.f31997a);
            ofFloat.addUpdateListener(this);
            return ofFloat;
        }

        public ObjectAnimator a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ObjectAnimator) ipChange.ipc$dispatch("aa5762dc", new Object[]{this, new Float(f)});
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ofl.this.b.a(), this.d.f31996a, ofl.this.f31995a.b);
            ofFloat.setDuration(Math.max((int) ((Math.abs(f) / this.d.c) * 800.0f), 200));
            ofFloat.setInterpolator(this.f31997a);
            ofFloat.addUpdateListener(this);
            return ofFloat;
        }
    }

    public ofl(ofk ofkVar, float f2, float f3, float f4) {
        this.b = ofkVar;
        this.e = new b(f2);
        this.d = new g(f3, f4);
        d();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                return this.f.a(motionEvent);
            }
            if (action != 3) {
                return false;
            }
        }
        return this.f.b(motionEvent);
    }

    public View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.b.a();
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c54ed64", new Object[]{this, cVar});
            return;
        }
        c cVar2 = this.f;
        this.f = cVar;
        this.f.a(cVar2);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        c().setOnTouchListener(this);
        c().setOverScrollMode(2);
    }
}
