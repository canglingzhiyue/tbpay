package tb;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class dkp implements brz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TranslateAnimation f26814a;
    private AlphaAnimation b;
    private TranslateAnimation c;
    private AlphaAnimation d;
    private final float e = 0.2f;
    private final float f = 1.0f;
    private final long g = 300;

    static {
        kge.a(758098080);
        kge.a(257539985);
    }

    private void a(Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29b8c14", new Object[]{this, animationListener});
            return;
        }
        if (this.f26814a == null) {
            this.f26814a = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            this.f26814a.setDuration(300L);
            this.f26814a.setFillAfter(true);
        }
        this.f26814a.setAnimationListener(animationListener);
        if (this.b != null) {
            return;
        }
        this.b = new AlphaAnimation(0.2f, 1.0f);
        this.b.setDuration(300L);
        this.b.setFillAfter(true);
    }

    private void b(Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82f9515", new Object[]{this, animationListener});
            return;
        }
        if (this.c == null) {
            this.c = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
            this.c.setDuration(300L);
            this.c.setFillAfter(true);
        }
        this.c.setAnimationListener(animationListener);
        if (this.d != null) {
            return;
        }
        this.d = new AlphaAnimation(1.0f, 0.2f);
        this.d.setDuration(300L);
        this.d.setFillAfter(true);
    }

    @Override // tb.brz
    public void a(View view, final bsa bsaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("508d7aa", new Object[]{this, view, bsaVar});
            return;
        }
        a(new Animation.AnimationListener() { // from class: tb.dkp.1
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
        animationSet.addAnimation(this.f26814a);
        animationSet.addAnimation(this.b);
        view.startAnimation(animationSet);
    }

    @Override // tb.brz
    public void b(View view, final bsa bsaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d391789", new Object[]{this, view, bsaVar});
        } else if (this.f26814a == null) {
            if (bsaVar == null) {
                return;
            }
            bsaVar.a();
        } else {
            b(new Animation.AnimationListener() { // from class: tb.dkp.2
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
            animationSet.addAnimation(this.c);
            animationSet.addAnimation(this.d);
            view.startAnimation(animationSet);
        }
    }
}
