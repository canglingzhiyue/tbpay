package android.support.transition;

import android.animation.TypeEvaluator;

/* loaded from: classes2.dex */
class h implements TypeEvaluator<float[]> {

    /* renamed from: a  reason: collision with root package name */
    private float[] f1296a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(float[] fArr) {
        this.f1296a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a */
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f1296a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
