package android.support.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class g extends ba {

    /* renamed from: a  reason: collision with root package name */
    private float f1295a = 3.0f;

    private static float a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    @Override // android.support.transition.af
    public long a(ViewGroup viewGroup, Transition transition, ah ahVar, ah ahVar2) {
        int i;
        int round;
        int i2;
        if (ahVar == null && ahVar2 == null) {
            return 0L;
        }
        if (ahVar2 == null || b(ahVar) == 0) {
            i = -1;
        } else {
            ahVar = ahVar2;
            i = 1;
        }
        int c = c(ahVar);
        int d = d(ahVar);
        Rect epicenter = transition.getEpicenter();
        if (epicenter != null) {
            i2 = epicenter.centerX();
            round = epicenter.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int round2 = Math.round(iArr[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            round = Math.round(iArr[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            i2 = round2;
        }
        float a2 = a(c, d, i2, round) / a(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round((((float) (duration * i)) / this.f1295a) * a2);
    }
}
