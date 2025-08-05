package com.etao.feimagesearch.videosearch;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float f7043a;
    private float b;
    private boolean c;
    private ValueAnimator d;
    private Set<View> e;

    static {
        kge.a(-480334207);
        kge.a(1499308443);
    }

    public a(float f, float f2, boolean z) {
        this.f7043a = f;
        this.b = f2;
        this.c = z;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        ValueAnimator valueAnimator = this.d;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (a()) {
            this.d.cancel();
        }
        Set<View> set = this.e;
        if (set == null || set.isEmpty()) {
            return;
        }
        float f = this.f7043a;
        if (f < 0.0f) {
            Iterator<View> it = this.e.iterator();
            if (it.hasNext()) {
                f = it.next().getAlpha();
            }
        }
        this.d = ValueAnimator.ofFloat(f, this.b);
        this.d.setDuration(300L);
        this.d.addUpdateListener(this);
        this.d.addListener(this);
        this.d.start();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.d.cancel();
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        if (this.e == null) {
            this.e = new HashSet();
        }
        this.e.add(view);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        Set<View> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        Float f = (Float) valueAnimator.getAnimatedValue();
        if (f == null || (set = this.e) == null) {
            return;
        }
        for (View view : set) {
            view.setAlpha(f.floatValue());
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            return;
        }
        Set<View> set = this.e;
        if (set == null || this.c) {
            return;
        }
        for (View view : set) {
            if (view.getTag() != "2") {
                view.setVisibility(0);
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            return;
        }
        Set<View> set = this.e;
        if (set == null || !this.c) {
            return;
        }
        for (View view : set) {
            view.setVisibility(8);
        }
    }
}
