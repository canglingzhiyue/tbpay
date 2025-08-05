package tb;

import android.animation.Animator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.h;

/* loaded from: classes6.dex */
public class kdk implements Animator.AnimatorListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f29979a;
    private final kdr b;

    static {
        kge.a(876938535);
        kge.a(1420754541);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
        }
    }

    public kdk(String str, kdr kdrVar) {
        this.f29979a = str;
        this.b = kdrVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            return;
        }
        kej.a("AdBizAnimatorListener", "onAnimationStart running");
        h.b(this.f29979a).e();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            return;
        }
        kej.a("AdBizAnimatorListener", "onAnimationEnd running ");
        h.b(this.f29979a).f();
        h.b(this.f29979a).g();
        this.b.f();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            return;
        }
        kej.a("AdBizAnimatorListener", "onAnimationCancel running");
        h.b(this.f29979a).f();
        h.b(this.f29979a).g();
    }
}
