package tb;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.b;
import com.taobao.bootimage.view.FilletLinearLayout;

/* loaded from: classes6.dex */
public class kdl implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f29980a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    private final View f;
    private final b.a g;
    private final float h;

    static {
        kge.a(-1865076151);
        kge.a(1499308443);
    }

    public kdl(View view, b.a aVar) {
        this.f = view;
        this.g = aVar;
        this.h = aVar.f;
        this.f29980a = view.getWidth();
        this.b = aVar.b;
        this.c = view.getHeight();
        this.d = aVar.c;
        this.e = keo.a(view.getContext(), 100.0f);
        kej.a("AdViewUpdateListener", "startScaleAnimator: cornerRadius:" + this.h + ",translationX:" + aVar.d + ",translationY:" + aVar.e + ",toX:" + aVar.b + ",toY:" + aVar.c + ",imageMargin:" + this.e);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        int i2;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
        float parseFloat = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
        layoutParams.width = this.b + ((int) ((this.f29980a - i) * parseFloat));
        layoutParams.height = this.d + ((int) ((this.c - i2) * parseFloat));
        this.f.setLayoutParams(layoutParams);
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.f.setX(this.g.d * animatedFraction);
        this.f.setTranslationY(this.g.e * animatedFraction);
        double d = parseFloat;
        if (d < 0.5d && (this.f.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f.getLayoutParams();
            layoutParams2.setMargins(0, 0, 0, (int) ((d - 0.5d) * 2.0d * this.e));
            this.f.setLayoutParams(layoutParams2);
        }
        View view = this.f;
        if (!(view instanceof FilletLinearLayout)) {
            return;
        }
        if (this.h <= 0.0f) {
            return;
        }
        ((FilletLinearLayout) view).setCornerSize(Math.max((int) (f * (1.0f - parseFloat)), 0));
    }
}
