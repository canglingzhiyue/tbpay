package tb;

import android.animation.ValueAnimator;
import android.support.constraint.ConstraintLayout;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class eyt implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ eyq b;

    public eyt(eyq eyqVar) {
        this.b = eyqVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        ((Float) valueAnimator.getAnimatedValue()).floatValue();
        eyq eyqVar = this.b;
        eyq eyqVar2 = this.b;
        String str = eyq.$ipChange;
        ((ConstraintLayout.LayoutParams) eyq.$ipChange.getLayoutParams()).B = str;
        eyq eyqVar3 = this.b;
        eyq.$ipChange.requestLayout();
        eyq.a(this.b, str);
    }
}
