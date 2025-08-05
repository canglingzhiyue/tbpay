package com.taobao.android.order.bundle.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class a implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f14591a;
    private int b;
    private int c;
    private Animator d;

    static {
        kge.a(1618224663);
        kge.a(-1088529092);
    }

    public static /* synthetic */ Animator a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animator) ipChange.ipc$dispatch("9672a98b", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a5cb3a9", new Object[]{aVar});
        } else {
            aVar.c();
        }
    }

    @Override // com.taobao.android.order.bundle.widget.d
    public void a(int i, int i2, int i3, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a507b7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), view});
            return;
        }
        this.f14591a = i;
        this.b = i2;
        this.c = i3;
    }

    private void a(View view, float f, float f2, final Runnable runnable, final Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f150a0e6", new Object[]{this, view, new Float(f), new Float(f2), runnable, runnable2});
            return;
        }
        b();
        float translationY = view.getTranslationY();
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", translationY, f2);
        ofFloat.setDuration(Math.min(200L, Math.max(50L, (Math.abs(translationY - f2) / Math.min(8000.0f, Math.max(200.0f, f))) * 1000.0f)));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.order.bundle.widget.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == -2145066406) {
                    super.onAnimationEnd((Animator) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                super.onAnimationEnd(animator);
                if (a.a(a.this) == ofFloat) {
                    a.b(a.this);
                }
                runnable.run();
            }
        });
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.order.bundle.widget.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                Runnable runnable3 = runnable2;
                if (runnable3 == null) {
                    return;
                }
                runnable3.run();
            }
        });
        ofFloat.setInterpolator(new LinearInterpolator());
        this.d = ofFloat;
        ofFloat.start();
    }

    @Override // com.taobao.android.order.bundle.widget.d
    public void a(View view, float f, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51ccd92", new Object[]{this, view, new Float(f), runnable, runnable2});
        } else {
            a(view, f, this.c, runnable, runnable2);
        }
    }

    @Override // com.taobao.android.order.bundle.widget.d
    public void b(View view, float f, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52dc4593", new Object[]{this, view, new Float(f), runnable, runnable2});
        } else {
            a(view, f, 0.0f, runnable, runnable2);
        }
    }

    @Override // com.taobao.android.order.bundle.widget.d
    public void c(View view, float f, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a09bbd94", new Object[]{this, view, new Float(f), runnable, runnable2});
        } else {
            a(view, f, this.f14591a, runnable, runnable2);
        }
    }

    @Override // com.taobao.android.order.bundle.widget.d
    public void d(View view, float f, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee5b3595", new Object[]{this, view, new Float(f), runnable, runnable2});
            return;
        }
        view.setTranslationY(this.f14591a);
        runnable.run();
    }

    @Override // com.taobao.android.order.bundle.widget.d
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        Animator animator = this.d;
        return animator != null && animator.isStarted();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.d != null && a()) {
            this.d.cancel();
        }
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.d = null;
        }
    }
}
