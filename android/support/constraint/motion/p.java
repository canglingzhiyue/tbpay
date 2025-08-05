package android.support.constraint.motion;

import android.support.constraint.ConstraintAttribute;
import android.support.constraint.c;
import java.util.LinkedHashMap;
import tb.iee;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class p implements Comparable<p> {
    public static final boolean DEBUG = false;
    public static final boolean OLD_WAY = false;
    public static final String TAG = "MotionPaths";

    /* renamed from: a  reason: collision with root package name */
    static String[] f1091a = {"position", "x", "y", "width", "height", "pathRotate"};
    iee b;
    int c;
    float d;
    float e;
    float f;
    float g;
    float h;
    float i;
    float j;
    float k;
    int l;
    LinkedHashMap<String, ConstraintAttribute> m;
    int n;
    double[] o;
    double[] p;

    public p() {
        this.c = 0;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = c.f1077a;
        this.m = new LinkedHashMap<>();
        this.n = 0;
        this.o = new double[18];
        this.p = new double[18];
    }

    public p(int i, int i2, i iVar, p pVar, p pVar2) {
        this.c = 0;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = c.f1077a;
        this.m = new LinkedHashMap<>();
        this.n = 0;
        this.o = new double[18];
        this.p = new double[18];
        int i3 = iVar.p;
        if (i3 == 1) {
            b(iVar, pVar, pVar2);
        } else if (i3 != 2) {
            a(iVar, pVar, pVar2);
        } else {
            a(i, i2, iVar, pVar, pVar2);
        }
    }

    private static final float a(float f, float f2, float f3, float f4, float f5, float f6) {
        return (((f5 - f3) * f2) - ((f6 - f4) * f)) + f3;
    }

    private boolean a(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    private static final float b(float f, float f2, float f3, float f4, float f5, float f6) {
        return ((f5 - f3) * f) + ((f6 - f4) * f2) + f4;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(p pVar) {
        return Float.compare(this.e, pVar.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(String str, double[] dArr, int i) {
        ConstraintAttribute constraintAttribute = this.m.get(str);
        if (constraintAttribute.b() == 1) {
            dArr[i] = constraintAttribute.c();
            return 1;
        }
        int b = constraintAttribute.b();
        float[] fArr = new float[b];
        constraintAttribute.a(fArr);
        int i2 = 0;
        while (i2 < b) {
            dArr[i] = fArr[i2];
            i2++;
            i++;
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f, float f2, float f3, float f4) {
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            int i2 = iArr[i];
            if (i2 != 0) {
                if (i2 == 1) {
                    f3 = f7;
                } else if (i2 == 2) {
                    f5 = f7;
                } else if (i2 == 3) {
                    f4 = f7;
                } else if (i2 == 4) {
                    f6 = f7;
                }
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + 0.0f;
    }

    void a(int i, int i2, i iVar, p pVar, p pVar2) {
        float f = iVar.b / 100.0f;
        this.d = f;
        this.c = iVar.i;
        float f2 = Float.isNaN(iVar.j) ? f : iVar.j;
        float f3 = Float.isNaN(iVar.k) ? f : iVar.k;
        float f4 = pVar2.h;
        float f5 = pVar.h;
        float f6 = pVar2.i;
        float f7 = pVar.i;
        this.e = this.d;
        float f8 = pVar.f;
        float f9 = pVar.g;
        float f10 = pVar2.f + (f4 / 2.0f);
        float f11 = pVar2.g + (f6 / 2.0f);
        float f12 = (f4 - f5) * f2;
        this.f = (int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f)) - (f12 / 2.0f));
        float f13 = (f6 - f7) * f3;
        this.g = (int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f)) - (f13 / 2.0f));
        this.h = (int) (f5 + f12);
        this.i = (int) (f7 + f13);
        this.n = 3;
        if (!Float.isNaN(iVar.l)) {
            this.f = (int) (iVar.l * ((int) (i - this.h)));
        }
        if (!Float.isNaN(iVar.m)) {
            this.g = (int) (iVar.m * ((int) (i2 - this.i)));
        }
        this.b = iee.a(iVar.g);
        this.l = iVar.h;
    }

    public void a(c.a aVar) {
        this.b = iee.a(aVar.b.c);
        this.l = aVar.b.d;
        this.j = aVar.b.g;
        this.c = aVar.b.e;
        this.k = aVar.f1058a.e;
        for (String str : aVar.f.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.f.get(str);
            if (constraintAttribute.a() != ConstraintAttribute.AttributeType.STRING_TYPE) {
                this.m.put(str, constraintAttribute);
            }
        }
    }

    void a(i iVar, p pVar, p pVar2) {
        float f = iVar.b / 100.0f;
        this.d = f;
        this.c = iVar.i;
        float f2 = Float.isNaN(iVar.j) ? f : iVar.j;
        float f3 = Float.isNaN(iVar.k) ? f : iVar.k;
        float f4 = pVar2.h;
        float f5 = pVar.h;
        float f6 = pVar2.i;
        float f7 = pVar.i;
        this.e = this.d;
        float f8 = pVar.f;
        float f9 = pVar.g;
        float f10 = (pVar2.f + (f4 / 2.0f)) - ((f5 / 2.0f) + f8);
        float f11 = (pVar2.g + (f6 / 2.0f)) - (f9 + (f7 / 2.0f));
        float f12 = (f4 - f5) * f2;
        float f13 = f12 / 2.0f;
        this.f = (int) ((f8 + (f10 * f)) - f13);
        float f14 = (f6 - f7) * f3;
        float f15 = f14 / 2.0f;
        this.g = (int) ((f9 + (f11 * f)) - f15);
        this.h = (int) (f5 + f12);
        this.i = (int) (f7 + f14);
        float f16 = Float.isNaN(iVar.l) ? f : iVar.l;
        float f17 = 0.0f;
        float f18 = Float.isNaN(iVar.o) ? 0.0f : iVar.o;
        if (!Float.isNaN(iVar.m)) {
            f = iVar.m;
        }
        if (!Float.isNaN(iVar.n)) {
            f17 = iVar.n;
        }
        this.n = 2;
        this.f = (int) (((pVar.f + (f16 * f10)) + (f17 * f11)) - f13);
        this.g = (int) (((pVar.g + (f10 * f18)) + (f11 * f)) - f15);
        this.b = iee.a(iVar.g);
        this.l = iVar.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(p pVar, boolean[] zArr, String[] strArr, boolean z) {
        zArr[0] = zArr[0] | a(this.e, pVar.e);
        zArr[1] = zArr[1] | a(this.f, pVar.f) | z;
        zArr[2] = z | a(this.g, pVar.g) | zArr[2];
        zArr[3] = zArr[3] | a(this.h, pVar.h);
        zArr[4] = a(this.i, pVar.i) | zArr[4];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
        if (java.lang.Float.isNaN(Float.NaN) == false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.view.View r22, int[] r23, double[] r24, double[] r25, double[] r26) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.motion.p.a(android.view.View, int[], double[], double[], double[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(double[] dArr, int[] iArr) {
        float[] fArr = {this.e, this.f, this.g, this.h, this.i, this.j};
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < fArr.length) {
                dArr[i] = fArr[iArr[i2]];
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f;
        float f2 = this.g;
        float f3 = this.h;
        float f4 = this.i;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        return this.m.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(String str) {
        return this.m.get(str).b();
    }

    void b(i iVar, p pVar, p pVar2) {
        float f;
        float f2;
        float f3 = iVar.b / 100.0f;
        this.d = f3;
        this.c = iVar.i;
        float f4 = Float.isNaN(iVar.j) ? f3 : iVar.j;
        float f5 = Float.isNaN(iVar.k) ? f3 : iVar.k;
        float f6 = pVar2.h - pVar.h;
        float f7 = pVar2.i - pVar.i;
        this.e = this.d;
        if (!Float.isNaN(iVar.l)) {
            f3 = iVar.l;
        }
        float f8 = pVar.f;
        float f9 = pVar.h;
        float f10 = pVar.g;
        float f11 = pVar.i;
        float f12 = (pVar2.f + (pVar2.h / 2.0f)) - ((f9 / 2.0f) + f8);
        float f13 = (pVar2.g + (pVar2.i / 2.0f)) - ((f11 / 2.0f) + f10);
        float f14 = f12 * f3;
        float f15 = (f6 * f4) / 2.0f;
        this.f = (int) ((f8 + f14) - f15);
        float f16 = f3 * f13;
        float f17 = (f7 * f5) / 2.0f;
        this.g = (int) ((f10 + f16) - f17);
        this.h = (int) (f9 + f);
        this.i = (int) (f11 + f2);
        float f18 = Float.isNaN(iVar.m) ? 0.0f : iVar.m;
        this.n = 1;
        this.f = (int) ((pVar.f + f14) - f15);
        this.g = (int) ((pVar.g + f16) - f17);
        this.f += (-f13) * f18;
        this.g += f12 * f18;
        this.b = iee.a(iVar.g);
        this.l = iVar.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f;
        float f2 = this.g;
        float f3 = this.h;
        float f4 = this.i;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 != 0) {
                if (i3 == 1) {
                    f = f5;
                } else if (i3 == 2) {
                    f2 = f5;
                } else if (i3 == 3) {
                    f3 = f5;
                } else if (i3 == 4) {
                    f4 = f5;
                }
            }
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i4 = i + 1;
        fArr[i] = f + 0.0f;
        int i5 = i4 + 1;
        fArr[i4] = f2 + 0.0f;
        int i6 = i5 + 1;
        fArr[i5] = f6 + 0.0f;
        int i7 = i6 + 1;
        fArr[i6] = f2 + 0.0f;
        int i8 = i7 + 1;
        fArr[i7] = f6 + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f7 + 0.0f;
        fArr[i9] = f + 0.0f;
        fArr[i9 + 1] = f7 + 0.0f;
    }
}
