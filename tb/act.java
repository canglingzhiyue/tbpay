package tb;

import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class act {
    ViewPropertyAnimatorListener b;
    private Interpolator d;
    private boolean e;
    private long c = -1;
    private final ViewPropertyAnimatorListenerAdapter f = new ViewPropertyAnimatorListenerAdapter() { // from class: tb.act.1
        private boolean b = false;
        private int c = 0;

        void a() {
            this.c = 0;
            this.b = false;
            act.this.b();
        }

        @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            int i = this.c + 1;
            this.c = i;
            if (i == act.this.f25252a.size()) {
                if (act.this.b != null) {
                    act.this.b.onAnimationEnd(null);
                }
                a();
            }
        }

        @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
        public void onAnimationStart(View view) {
            if (this.b) {
                return;
            }
            this.b = true;
            if (act.this.b == null) {
                return;
            }
            act.this.b.onAnimationStart(null);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<ViewPropertyAnimatorCompat> f25252a = new ArrayList<>();

    public act a(long j) {
        if (!this.e) {
            this.c = j;
        }
        return this;
    }

    public act a(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        if (!this.e) {
            this.f25252a.add(viewPropertyAnimatorCompat);
        }
        return this;
    }

    public act a(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2) {
        this.f25252a.add(viewPropertyAnimatorCompat);
        viewPropertyAnimatorCompat2.setStartDelay(viewPropertyAnimatorCompat.getDuration());
        this.f25252a.add(viewPropertyAnimatorCompat2);
        return this;
    }

    public act a(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (!this.e) {
            this.b = viewPropertyAnimatorListener;
        }
        return this;
    }

    public act a(Interpolator interpolator) {
        if (!this.e) {
            this.d = interpolator;
        }
        return this;
    }

    public void a() {
        if (this.e) {
            return;
        }
        Iterator<ViewPropertyAnimatorCompat> it = this.f25252a.iterator();
        while (it.hasNext()) {
            ViewPropertyAnimatorCompat next = it.next();
            long j = this.c;
            if (j >= 0) {
                next.setDuration(j);
            }
            Interpolator interpolator = this.d;
            if (interpolator != null) {
                next.setInterpolator(interpolator);
            }
            if (this.b != null) {
                next.setListener(this.f);
            }
            next.start();
        }
        this.e = true;
    }

    void b() {
        this.e = false;
    }

    public void c() {
        if (!this.e) {
            return;
        }
        Iterator<ViewPropertyAnimatorCompat> it = this.f25252a.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.e = false;
    }
}
