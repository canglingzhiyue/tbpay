package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.view.View;
import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public abstract class dmg<InAnimation extends Animator, OutAnimation extends Animator> implements Cloneable, dlz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Object f26845a;
    public Object b;
    private InAnimation c;
    private OutAnimation d;
    public int e = ffz.d();

    static {
        kge.a(938166366);
        kge.a(-1922345080);
        kge.a(-723128125);
    }

    public abstract OutAnimation c(View view);

    public abstract InAnimation d(View view);

    public static /* synthetic */ Animator a(dmg dmgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animator) ipChange.ipc$dispatch("c971699", new Object[]{dmgVar}) : dmgVar.c;
    }

    public static /* synthetic */ Animator a(dmg dmgVar, Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("b4a6035c", new Object[]{dmgVar, animator});
        }
        dmgVar.c = animator;
        return animator;
    }

    public static /* synthetic */ Animator a(dmg dmgVar, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animator) ipChange.ipc$dispatch("27702f7b", new Object[]{dmgVar, view}) : dmgVar.a(view);
    }

    @Override // tb.dlz
    public boolean a() {
        OutAnimation outanimation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        InAnimation inanimation = this.c;
        return (inanimation != null && inanimation.isStarted()) || ((outanimation = this.d) != null && outanimation.isStarted());
    }

    public long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.e;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : ffz.c();
    }

    public Interpolator e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Interpolator) ipChange.ipc$dispatch("89606881", new Object[]{this}) : new FastOutSlowInInterpolator();
    }

    public Interpolator f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Interpolator) ipChange.ipc$dispatch("16009382", new Object[]{this}) : new FastOutSlowInInterpolator();
    }

    private InAnimation a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InAnimation) ipChange.ipc$dispatch("c50fa249", new Object[]{this, view});
        }
        this.c = d(view);
        this.c.setDuration(c());
        this.c.setInterpolator(e());
        return this.c;
    }

    private OutAnimation b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OutAnimation) ipChange.ipc$dispatch("89ac00a", new Object[]{this, view});
        }
        this.d = c(view);
        this.d.setDuration(d());
        this.d.setInterpolator(f());
        return this.d;
    }

    @Override // tb.dlz
    public void a(View view, View view2, dma dmaVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f8eb363", new Object[]{this, view, view2, dmaVar, new Integer(i)});
            return;
        }
        if (i > 0) {
            this.e = i;
        }
        a(view, view2, dmaVar);
    }

    public void a(final View view, View view2, final dma dmaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f7833a0", new Object[]{this, view, view2, dmaVar});
            return;
        }
        view.setVisibility(4);
        view.post(new Runnable() { // from class: tb.dmg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                dmg dmgVar = dmg.this;
                dmg.a(dmgVar, dmg.a(dmgVar, view));
                dmg.a(dmg.this).removeAllListeners();
                dmg.a(dmg.this).addListener(new AnimatorListenerAdapter() { // from class: tb.dmg.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(C11031 c11031, String str, Object... objArr) {
                        int hashCode = str.hashCode();
                        if (hashCode == -2145066406) {
                            super.onAnimationEnd((Animator) objArr[0]);
                            return null;
                        } else if (hashCode != 977295137) {
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                        } else {
                            super.onAnimationStart((Animator) objArr[0]);
                            return null;
                        }
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("3a405721", new Object[]{this, animator});
                            return;
                        }
                        super.onAnimationStart(animator);
                        if (dmaVar == null) {
                            return;
                        }
                        dmaVar.a(new dly(dmg.this.b(), dmg.this.f26845a, Long.valueOf(animator.getDuration()), animator));
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("8024e25a", new Object[]{this, animator});
                            return;
                        }
                        view.setVisibility(0);
                        super.onAnimationEnd(animator);
                        if (dmaVar == null) {
                            return;
                        }
                        dmaVar.b(new dly(dmg.this.b(), dmg.this.f26845a, Long.valueOf(animator.getDuration()), animator));
                    }
                });
                if (dmg.a(dmg.this) instanceof ObjectAnimator) {
                    ((ObjectAnimator) dmg.a(dmg.this)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.dmg.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                                return;
                            }
                            if (dmaVar != null && valueAnimator.getAnimatedFraction() > 0.0f) {
                                dmaVar.a();
                            }
                            if (valueAnimator.getAnimatedFraction() <= 0.1f) {
                                return;
                            }
                            view.setVisibility(0);
                        }
                    });
                }
                dmg.a(dmg.this).start();
            }
        });
    }

    @Override // tb.dlz
    public void a(View view, final dma dmaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81dfbe2", new Object[]{this, view, dmaVar});
            return;
        }
        this.d = b(view);
        this.d.removeAllListeners();
        this.d.addListener(new AnimatorListenerAdapter() { // from class: tb.dmg.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == -2145066406) {
                    super.onAnimationEnd((Animator) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    return;
                }
                dma dmaVar2 = dmaVar;
                if (dmaVar2 == null) {
                    return;
                }
                dmaVar2.a(new dly(dmg.this.b(), dmg.this.b, Long.valueOf(animator.getDuration()), animator));
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                super.onAnimationEnd(animator);
                dma dmaVar2 = dmaVar;
                if (dmaVar2 == null) {
                    return;
                }
                dmaVar2.b(new dly(dmg.this.b(), dmg.this.b, Long.valueOf(animator.getDuration()), animator));
            }
        });
        OutAnimation outanimation = this.d;
        if (outanimation instanceof ObjectAnimator) {
            ((ObjectAnimator) outanimation).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.dmg.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    } else if (dmaVar == null || valueAnimator.getAnimatedFraction() <= 0.0f) {
                    } else {
                        dmaVar.a();
                    }
                }
            });
        }
        this.d.start();
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : super.clone();
    }
}
