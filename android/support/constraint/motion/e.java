package android.support.constraint.motion;

import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    HashMap<Object, HashMap<String, float[]>> f1079a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public float a(Object obj, String str, int i) {
        if (!this.f1079a.containsKey(obj)) {
            return Float.NaN;
        }
        HashMap<String, float[]> hashMap = this.f1079a.get(obj);
        if (!hashMap.containsKey(str)) {
            return Float.NaN;
        }
        float[] fArr = hashMap.get(str);
        if (fArr.length <= i) {
            return Float.NaN;
        }
        return fArr[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Object obj, String str, int i, float f) {
        if (!this.f1079a.containsKey(obj)) {
            HashMap<String, float[]> hashMap = new HashMap<>();
            float[] fArr = new float[i + 1];
            fArr[i] = f;
            hashMap.put(str, fArr);
            this.f1079a.put(obj, hashMap);
            return;
        }
        HashMap<String, float[]> hashMap2 = this.f1079a.get(obj);
        if (!hashMap2.containsKey(str)) {
            float[] fArr2 = new float[i + 1];
            fArr2[i] = f;
            hashMap2.put(str, fArr2);
            this.f1079a.put(obj, hashMap2);
            return;
        }
        float[] fArr3 = hashMap2.get(str);
        if (fArr3.length <= i) {
            fArr3 = Arrays.copyOf(fArr3, i + 1);
        }
        fArr3[i] = f;
        hashMap2.put(str, fArr3);
    }
}
