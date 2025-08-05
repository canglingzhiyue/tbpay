package tb;

import android.animation.ValueAnimator;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.regionedit.a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class cse implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f26487a;
    private float b;
    private final boolean c;
    private a d;

    static {
        kge.a(-215588177);
        kge.a(1499308443);
    }

    public cse(boolean z, a targetView) {
        q.c(targetView, "targetView");
        this.c = z;
        this.d = targetView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator animation) {
        float translationY;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, animation});
            return;
        }
        q.c(animation, "animation");
        if (!this.f26487a) {
            this.f26487a = true;
            if (this.c) {
                translationY = this.d.getImageView().getTranslationX();
            } else {
                translationY = this.d.getImageView().getTranslationY();
            }
            this.b = translationY;
        }
        Object animatedValue = animation.getAnimatedValue();
        if (animatedValue == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
        float floatValue = ((Float) animatedValue).floatValue();
        if (this.c) {
            this.d.setImageTranslationX(this.b + floatValue);
        } else {
            this.d.setImageTranslationY(this.b + floatValue);
        }
    }
}
