package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes5.dex */
public class fzi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<AnimatorSet> f28231a;
    private AnimatorSet b;
    private boolean c;
    private boolean d;
    private int e = -1;

    static {
        kge.a(1495100888);
    }

    public static /* synthetic */ void a(fzi fziVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98b2ca3", new Object[]{fziVar});
        } else {
            fziVar.c();
        }
    }

    public fzi(List<AnimatorSet> list) {
        this.f28231a = list;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.c) {
            this.c = true;
            for (AnimatorSet animatorSet : this.f28231a) {
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: tb.fzi.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        } else {
                            fzi.a(fzi.this);
                        }
                    }
                });
            }
            c();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.d || this.e >= this.f28231a.size() - 1) {
        } else {
            List<AnimatorSet> list = this.f28231a;
            int i = this.e + 1;
            this.e = i;
            this.b = list.get(i);
            AnimatorSet animatorSet = this.b;
            if (animatorSet == null) {
                return;
            }
            animatorSet.start();
        }
    }

    public void b() {
        AnimatorSet animatorSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.d = true;
        if (!this.c || (animatorSet = this.b) == null) {
            return;
        }
        animatorSet.end();
    }
}
