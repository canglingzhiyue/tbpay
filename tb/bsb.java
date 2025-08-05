package tb;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bsb implements brz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AlphaAnimation f26082a;
    private AlphaAnimation b;

    static {
        kge.a(-1283266744);
        kge.a(257539985);
    }

    @Override // tb.brz
    public void a(View view, final bsa bsaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("508d7aa", new Object[]{this, view, bsaVar});
            return;
        }
        if (this.f26082a == null) {
            this.f26082a = new AlphaAnimation(0.0f, 1.0f);
            this.f26082a.setDuration(300L);
            this.f26082a.setAnimationListener(new Animation.AnimationListener() { // from class: tb.bsb.1
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
        }
        view.startAnimation(this.f26082a);
    }

    @Override // tb.brz
    public void b(View view, final bsa bsaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d391789", new Object[]{this, view, bsaVar});
            return;
        }
        if (this.b == null) {
            this.b = new AlphaAnimation(1.0f, 0.0f);
            this.b.setDuration(300L);
            this.b.setAnimationListener(new Animation.AnimationListener() { // from class: tb.bsb.2
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
        }
        view.startAnimation(this.b);
    }
}
