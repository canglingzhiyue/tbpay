package com.taobao.live.home.widget.tab;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.widget.tab.d;
import tb.kge;

/* loaded from: classes7.dex */
public class e extends d.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ValueAnimator f17779a = new ValueAnimator();

    static {
        kge.a(-84766555);
    }

    @Override // com.taobao.live.home.widget.tab.d.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f17779a.start();
        }
    }

    @Override // com.taobao.live.home.widget.tab.d.e
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f17779a.isRunning();
    }

    @Override // com.taobao.live.home.widget.tab.d.e
    public void a(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ade445bd", new Object[]{this, interpolator});
        } else {
            this.f17779a.setInterpolator(interpolator);
        }
    }

    @Override // com.taobao.live.home.widget.tab.d.e
    public void a(final d.e.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5127d17b", new Object[]{this, bVar});
        } else {
            this.f17779a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.live.home.widget.tab.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    } else {
                        bVar.a();
                    }
                }
            });
        }
    }

    @Override // com.taobao.live.home.widget.tab.d.e
    public void a(final d.e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51275d1c", new Object[]{this, aVar});
        } else {
            this.f17779a.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.live.home.widget.tab.e.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else {
                        aVar.a();
                    }
                }
            });
        }
    }

    @Override // com.taobao.live.home.widget.tab.d.e
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.f17779a.setIntValues(i, i2);
        }
    }

    @Override // com.taobao.live.home.widget.tab.d.e
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : ((Integer) this.f17779a.getAnimatedValue()).intValue();
    }

    @Override // com.taobao.live.home.widget.tab.d.e
    public void a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.f17779a.setFloatValues(f, f2);
        }
    }

    @Override // com.taobao.live.home.widget.tab.d.e
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f17779a.setDuration(i);
        }
    }

    @Override // com.taobao.live.home.widget.tab.d.e
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f17779a.cancel();
        }
    }

    @Override // com.taobao.live.home.widget.tab.d.e
    public float e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue() : this.f17779a.getAnimatedFraction();
    }

    @Override // com.taobao.live.home.widget.tab.d.e
    public long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue() : this.f17779a.getDuration();
    }
}
