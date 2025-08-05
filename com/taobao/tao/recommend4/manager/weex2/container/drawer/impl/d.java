package com.taobao.tao.recommend4.manager.weex2.container.drawer.impl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public c f20965a;
    private int b;
    private ValueAnimator c = new ValueAnimator();

    static {
        kge.a(-1185189796);
    }

    public static /* synthetic */ int a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8b616e7e", new Object[]{dVar})).intValue() : dVar.b;
    }

    public static /* synthetic */ int a(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0ccd5cb", new Object[]{dVar, new Integer(i)})).intValue();
        }
        dVar.b = i;
        return i;
    }

    public d(int i, int i2, long j) {
        this.b = i;
        this.c.setIntValues(i, i2);
        this.c.setInterpolator(new LinearInterpolator());
        this.c.setDuration(j);
        this.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else if (!(valueAnimator.getAnimatedValue() instanceof Integer)) {
                } else {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    d.this.f20965a.a(intValue - d.a(d.this));
                    d.a(d.this, intValue);
                }
            }
        });
        this.c.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == -2145066406) {
                    super.onAnimationEnd((Animator) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                super.onAnimationEnd(animator);
                d.this.f20965a.a();
            }
        });
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.c.isRunning()) {
        } else {
            this.c.cancel();
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        ValueAnimator valueAnimator = this.c;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c.isRunning()) {
        } else {
            this.c.start();
        }
    }
}
