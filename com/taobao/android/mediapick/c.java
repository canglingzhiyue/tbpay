package com.taobao.android.mediapick;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.IMediaPickClient;
import com.taobao.android.mediapick.media.Media;
import tb.hse;
import tb.hsh;
import tb.hsm;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class c<T extends Media> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View.OnClickListener f14228a = new View.OnClickListener() { // from class: com.taobao.android.mediapick.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            c cVar = c.this;
            c.a(cVar, cVar.i, c.this.j);
        }
    };
    private View.OnClickListener b = new View.OnClickListener() { // from class: com.taobao.android.mediapick.c.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            c cVar = c.this;
            c.b(cVar, cVar.i, c.this.j);
        }
    };
    private hsh c = new hsh(this.b);
    private hsh d = new hsh(this.f14228a);
    public T i;
    public int j;
    public View k;
    public g l;
    public hse m;
    public hsm n;

    static {
        kge.a(-1890259051);
    }

    @Deprecated
    public View a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ee74837c", new Object[]{this, activity});
        }
        return null;
    }

    public View a(Activity activity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d922471a", new Object[]{this, activity, view});
        }
        return null;
    }

    public abstract void a(T t, boolean z);

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean aa_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b612c54a", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ void a(c cVar, Media media, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("287ad8ff", new Object[]{cVar, media, new Integer(i)});
        } else {
            cVar.b(media, i);
        }
    }

    public static /* synthetic */ void b(c cVar, Media media, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66e3ede", new Object[]{cVar, media, new Integer(i)});
        } else {
            cVar.a((c) media, i);
        }
    }

    public void a(g gVar, hse hseVar, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a6aca62", new Object[]{this, gVar, hseVar, viewGroup});
            return;
        }
        this.l = gVar;
        this.m = hseVar;
        this.k = a(this.l.e(), viewGroup);
        if (this.k == null) {
            this.k = a(this.l.e());
        }
        this.k.setOnClickListener(this.d);
        this.n = new hsm(this.l.e());
        View b = b();
        if (b == null) {
            return;
        }
        b.setOnClickListener(this.c);
    }

    public Activity h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("2e540519", new Object[]{this}) : this.l.e();
    }

    private void a(T t, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59c3cf68", new Object[]{this, t, new Integer(i)});
            return;
        }
        if (this.l.d().indexOf(t) == -1) {
            z = false;
        }
        if (z && this.l.g() == IMediaPickClient.PickMode.SINGLE && !aa_()) {
            return;
        }
        if (z && this.l.g() != IMediaPickClient.PickMode.MULTIP_REPEAT) {
            this.l.b(t, i);
        } else if (!this.l.a(t, i) || !a()) {
        } else {
            ag_();
        }
    }

    private void b(T t, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938e7147", new Object[]{this, t, new Integer(i)});
        } else {
            this.l.i().c(t, i);
        }
    }

    public void ag_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c04fd900", new Object[]{this});
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.3f, 1.1f, 0.8f, 1.0f);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(500L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.mediapick.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c.this.b().setScaleX(floatValue);
                c.this.b().setScaleY(floatValue);
            }
        });
        ofFloat.start();
    }
}
