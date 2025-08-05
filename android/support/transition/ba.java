package android.support.transition;

import android.view.View;

/* loaded from: classes2.dex */
public abstract class ba extends af {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f1291a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    private static int a(ah ahVar, int i) {
        int[] iArr;
        if (ahVar == null || (iArr = (int[]) ahVar.f1277a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // android.support.transition.af
    public void a(ah ahVar) {
        View view = ahVar.b;
        Integer num = (Integer) ahVar.f1277a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        ahVar.f1277a.put("android:visibilityPropagation:visibility", num);
        view.getLocationOnScreen(r2);
        int[] iArr = {iArr[0] + Math.round(view.getTranslationX())};
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        ahVar.f1277a.put("android:visibilityPropagation:center", iArr);
    }

    @Override // android.support.transition.af
    public String[] a() {
        return f1291a;
    }

    public int b(ah ahVar) {
        Integer num;
        if (ahVar == null || (num = (Integer) ahVar.f1277a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int c(ah ahVar) {
        return a(ahVar, 0);
    }

    public int d(ah ahVar) {
        return a(ahVar, 1);
    }
}
