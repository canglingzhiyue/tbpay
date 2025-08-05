package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.widget.preview.b;
import com.etao.feimagesearch.regionedit.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public abstract class crt extends crw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Animator f26480a;

    static {
        kge.a(-298619768);
    }

    public crt(b bVar) {
        super(bVar);
    }

    public final void a(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2ed485", new Object[]{this, animator});
        } else {
            this.f26480a = animator;
        }
    }

    @Override // tb.crw, tb.crz
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Animator animator = this.f26480a;
        if (animator != null) {
            if (animator == null) {
                q.a();
            }
            if (animator.isRunning()) {
                return true;
            }
        }
        return false;
    }

    public float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue();
        }
        a f = f();
        if (f == null) {
            return 0.0f;
        }
        return f.getWidth();
    }

    public float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue();
        }
        a f = f();
        if (f == null) {
            return 0.0f;
        }
        return f.getHeight();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        a f = f();
        if (f == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(2);
        a(arrayList, h(), c(), j(), true, f);
        a(arrayList, i(), d(), k(), false, f);
        if (arrayList.isEmpty()) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        this.f26480a = animatorSet;
    }

    public final void a(List<Animator> animArray, float f, float f2, float f3, boolean z, a view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a1be55", new Object[]{this, animArray, new Float(f), new Float(f2), new Float(f3), new Boolean(z), view});
            return;
        }
        q.c(animArray, "animArray");
        q.c(view, "view");
        float f4 = (f2 - f) / 2.0f;
        a(animArray, f3, f3 + f, rwf.a(f4, 0.0f), rwf.b(f4 + f, f2), z, view);
    }

    public final void a(List<Animator> animArray, float f, float f2, float f3, float f4, boolean z, a view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29de09e7", new Object[]{this, animArray, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Boolean(z), view});
            return;
        }
        q.c(animArray, "animArray");
        q.c(view, "view");
        if (f > f3) {
            ValueAnimator animator = ValueAnimator.ofFloat(0.0f, f3 - f);
            animator.addUpdateListener(new cse(z, view));
            q.a((Object) animator, "animator");
            animArray.add(animator);
        } else if (f2 >= f4) {
        } else {
            ValueAnimator animator2 = ValueAnimator.ofFloat(0.0f, f4 - f2);
            animator2.addUpdateListener(new cse(z, view));
            q.a((Object) animator2, "animator");
            animArray.add(animator2);
        }
    }
}
