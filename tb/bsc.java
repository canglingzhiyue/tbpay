package tb;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bsc implements brz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TranslateAnimation f26085a;
    private TranslateAnimation b;
    private final long c = 200;

    static {
        kge.a(-433909755);
        kge.a(257539985);
    }

    private void a(Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29b8c14", new Object[]{this, animationListener});
            return;
        }
        if (this.f26085a == null) {
            this.f26085a = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            this.f26085a.setDuration(200L);
            this.f26085a.setFillAfter(true);
        }
        this.f26085a.setAnimationListener(animationListener);
    }

    private void b(Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82f9515", new Object[]{this, animationListener});
            return;
        }
        if (this.b == null) {
            this.b = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            this.b.setDuration(200L);
            this.b.setFillAfter(true);
        }
        this.b.setAnimationListener(animationListener);
    }

    @Override // tb.brz
    public void a(final View view, final bsa bsaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("508d7aa", new Object[]{this, view, bsaVar});
            return;
        }
        view.setVisibility(4);
        a(new Animation.AnimationListener() { // from class: tb.bsc.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                } else {
                    view.setVisibility(0);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    return;
                }
                bsa bsaVar2 = bsaVar;
                if (bsaVar2 == null) {
                    return;
                }
                bsaVar2.a();
            }
        });
        final AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f26085a);
        view.post(new Runnable() { // from class: tb.bsc.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    view.startAnimation(animationSet);
                }
            }
        });
    }

    @Override // tb.brz
    public void b(View view, final bsa bsaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d391789", new Object[]{this, view, bsaVar});
        } else if (this.f26085a == null) {
            if (bsaVar == null) {
                return;
            }
            bsaVar.a();
        } else {
            b(new Animation.AnimationListener() { // from class: tb.bsc.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                        return;
                    }
                    bsa bsaVar2 = bsaVar;
                    if (bsaVar2 == null) {
                        return;
                    }
                    bsaVar2.a();
                }
            });
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(this.b);
            view.startAnimation(animationSet);
        }
    }
}
