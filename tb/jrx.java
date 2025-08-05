package tb;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jrx {

    /* renamed from: a  reason: collision with root package name */
    public final Animation f29746a;
    public final Animation b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    static {
        kge.a(259738665);
    }

    private jrx(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, int i6, Animation animation, Animation animation2) {
        this.d = z2;
        this.f = z3;
        this.e = z;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.c = i6;
        this.f29746a = animation;
        this.b = animation2;
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int e;
        private int f;
        private int g;
        private int h;
        private Animation j;
        private Animation k;

        /* renamed from: a  reason: collision with root package name */
        private boolean f29747a = false;
        private boolean b = false;
        private boolean c = false;
        private int d = 81;
        private int i = -1;

        static {
            kge.a(-2129925632);
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5e327e8d", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b80de8ce", new Object[]{this, new Boolean(z)});
            }
            this.f29747a = z;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("11e9530f", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("db66833e", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3541ed7f", new Object[]{this, new Integer(i)});
            }
            this.h = i;
            return this;
        }

        public jrx a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jrx) ipChange.ipc$dispatch("f068eee", new Object[]{this});
            }
            if (this.j == null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setInterpolator(new DecelerateInterpolator());
                alphaAnimation.setDuration(500L);
                this.j = alphaAnimation;
            }
            if (this.k == null) {
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setInterpolator(new AccelerateInterpolator());
                alphaAnimation2.setDuration(500L);
                this.k = alphaAnimation2;
            }
            boolean z = this.f29747a;
            boolean z2 = this.c;
            boolean z3 = this.b;
            int i = this.d;
            int i2 = this.e;
            int i3 = this.f;
            int i4 = this.g;
            int i5 = this.h;
            int i6 = this.i;
            return new jrx(z, z2, z3, i, i2, i3, i4, i5, i6 <= 0 ? 4000 : i6, this.j, this.k);
        }
    }
}
