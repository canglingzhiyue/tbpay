package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kdm;

/* loaded from: classes6.dex */
public class kdj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private kdm f29978a;

    static {
        kge.a(-229300881);
    }

    public void a(kdn kdnVar, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f51fc45", new Object[]{this, kdnVar, animatorListener, animatorUpdateListener});
        } else {
            this.f29978a = new kdm.a().a(kdnVar).a(animatorListener).a(animatorUpdateListener).a();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f29978a == null) {
        } else {
            kej.a("AdAnimationCreator", "playAnimation");
            this.f29978a.a();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f29978a == null) {
        } else {
            kej.a("AdAnimationCreator", "cancelAnimation");
            this.f29978a.b();
        }
    }
}
