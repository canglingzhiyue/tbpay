package android.support.constraint.motion;

import android.support.constraint.ConstraintAttribute;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.c;
import android.support.constraint.motion.g;
import android.support.constraint.motion.r;
import android.support.constraint.motion.s;
import android.support.constraint.solver.widgets.ConstraintWidget;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import tb.bxj;
import tb.iee;
import tb.ifr;

/* loaded from: classes2.dex */
public class n {
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    private l[] A;

    /* renamed from: a  reason: collision with root package name */
    View f1090a;
    int b;
    String c;
    private bxj[] l;
    private bxj m;
    private int[] n;
    private double[] o;
    private double[] p;
    private String[] q;
    private int[] r;
    private HashMap<String, s> x;
    private HashMap<String, r> y;
    private HashMap<String, g> z;
    private int g = -1;
    private p h = new p();
    private p i = new p();
    private m j = new m();
    private m k = new m();
    float d = Float.NaN;
    float e = 0.0f;
    float f = 1.0f;
    private int s = 4;
    private float[] t = new float[this.s];
    private ArrayList<p> u = new ArrayList<>();
    private float[] v = new float[1];
    private ArrayList<c> w = new ArrayList<>();
    private int B = c.f1077a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(View view) {
        a(view);
    }

    private float a(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else if (this.f != 1.0d) {
            if (f < this.e) {
                f = 0.0f;
            }
            float f4 = this.e;
            if (f > f4 && f < 1.0d) {
                f = (f - f4) * this.f;
            }
        }
        iee ieeVar = this.h.b;
        float f5 = Float.NaN;
        Iterator<p> it = this.u.iterator();
        while (it.hasNext()) {
            p next = it.next();
            if (next.b != null) {
                if (next.d < f) {
                    ieeVar = next.b;
                    f2 = next.d;
                } else if (Float.isNaN(f5)) {
                    f5 = next.d;
                }
            }
        }
        if (ieeVar != null) {
            if (!Float.isNaN(f5)) {
                f3 = f5;
            }
            float f6 = f3 - f2;
            double d = (f - f2) / f6;
            f = (((float) ieeVar.a(d)) * f6) + f2;
            if (fArr != null) {
                fArr[0] = (float) ieeVar.b(d);
            }
        }
        return f;
    }

    private void a(p pVar) {
        int binarySearch = Collections.binarySearch(this.u, pVar);
        if (binarySearch == 0) {
            Log.e("MotionController", " KeyPath positon \"" + pVar.e + "\" outside of range");
        }
        this.u.add((-binarySearch) - 1, pVar);
    }

    private void b(p pVar) {
        pVar.a((int) this.f1090a.getX(), (int) this.f1090a.getY(), this.f1090a.getWidth(), this.f1090a.getHeight());
    }

    private float d() {
        float f;
        float[] fArr = new float[2];
        float f2 = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        float f3 = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f4 = i * f2;
            double d3 = f4;
            iee ieeVar = this.h.b;
            float f5 = Float.NaN;
            Iterator<p> it = this.u.iterator();
            float f6 = 0.0f;
            while (it.hasNext()) {
                p next = it.next();
                if (next.b != null) {
                    if (next.d < f4) {
                        ieeVar = next.b;
                        f6 = next.d;
                    } else if (Float.isNaN(f5)) {
                        f5 = next.d;
                    }
                }
            }
            if (ieeVar != null) {
                if (Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                d3 = (((float) ieeVar.a((f4 - f6) / f)) * (f5 - f6)) + f6;
            }
            this.l[0].a(d3, this.o);
            this.h.a(this.n, this.o, fArr, 0);
            if (i > 0) {
                f3 = (float) (f3 + Math.hypot(d2 - fArr[1], d - fArr[0]));
            }
            d = fArr[0];
            d2 = fArr[1];
        }
        return f3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float a() {
        return this.i.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(float[] fArr, int[] iArr) {
        if (fArr != null) {
            double[] a2 = this.l[0].a();
            if (iArr != null) {
                Iterator<p> it = this.u.iterator();
                int i = 0;
                while (it.hasNext()) {
                    iArr[i] = it.next().n;
                    i++;
                }
            }
            int i2 = 0;
            for (double d : a2) {
                this.l[0].a(d, this.o);
                this.h.a(this.n, this.o, fArr, i2);
                i2 += 2;
            }
            return i2 / 2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p a(int i) {
        return this.u.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float a2 = a(f, this.v);
        bxj[] bxjVarArr = this.l;
        int i = 0;
        if (bxjVarArr == null) {
            float f4 = this.i.f - this.h.f;
            float f5 = this.i.g - this.h.g;
            float f6 = (this.i.i - this.h.i) + f5;
            fArr[0] = (f4 * (1.0f - f2)) + (((this.i.h - this.h.h) + f4) * f2);
            fArr[1] = (f5 * (1.0f - f3)) + (f6 * f3);
            return;
        }
        double d = a2;
        bxjVarArr[0].b(d, this.p);
        this.l[0].a(d, this.o);
        float f7 = this.v[0];
        while (true) {
            dArr = this.p;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = dArr[i] * f7;
            i++;
        }
        bxj bxjVar = this.m;
        if (bxjVar == null) {
            this.h.a(f2, f3, fArr, this.n, dArr, this.o);
            return;
        }
        double[] dArr2 = this.o;
        if (dArr2.length <= 0) {
            return;
        }
        bxjVar.a(d, dArr2);
        this.m.b(d, this.p);
        this.h.a(f2, f3, fArr, this.n, this.p, this.o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f, int i, int i2, float f2, float f3, float[] fArr) {
        float a2 = a(f, this.v);
        HashMap<String, r> hashMap = this.y;
        g gVar = null;
        r rVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, r> hashMap2 = this.y;
        r rVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, r> hashMap3 = this.y;
        r rVar3 = hashMap3 == null ? null : hashMap3.get("rotation");
        HashMap<String, r> hashMap4 = this.y;
        r rVar4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, r> hashMap5 = this.y;
        r rVar5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, g> hashMap6 = this.z;
        g gVar2 = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, g> hashMap7 = this.z;
        g gVar3 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, g> hashMap8 = this.z;
        g gVar4 = hashMap8 == null ? null : hashMap8.get("rotation");
        HashMap<String, g> hashMap9 = this.z;
        g gVar5 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, g> hashMap10 = this.z;
        if (hashMap10 != null) {
            gVar = hashMap10.get("scaleY");
        }
        ifr ifrVar = new ifr();
        ifrVar.a();
        ifrVar.a(rVar3, a2);
        ifrVar.a(rVar, rVar2, a2);
        ifrVar.b(rVar4, rVar5, a2);
        ifrVar.a(gVar4, a2);
        ifrVar.a(gVar2, gVar3, a2);
        ifrVar.b(gVar5, gVar, a2);
        bxj bxjVar = this.m;
        if (bxjVar != null) {
            double[] dArr = this.o;
            if (dArr.length > 0) {
                double d = a2;
                bxjVar.a(d, dArr);
                this.m.b(d, this.p);
                this.h.a(f2, f3, fArr, this.n, this.p, this.o);
            }
            ifrVar.a(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.l == null) {
            float f4 = this.i.f - this.h.f;
            float f5 = this.i.g - this.h.g;
            g gVar6 = gVar;
            float f6 = (this.i.i - this.h.i) + f5;
            fArr[0] = (f4 * (1.0f - f2)) + (((this.i.h - this.h.h) + f4) * f2);
            fArr[1] = (f5 * (1.0f - f3)) + (f6 * f3);
            ifrVar.a();
            ifrVar.a(rVar3, a2);
            ifrVar.a(rVar, rVar2, a2);
            ifrVar.b(rVar4, rVar5, a2);
            ifrVar.a(gVar4, a2);
            ifrVar.a(gVar2, gVar3, a2);
            ifrVar.b(gVar5, gVar6, a2);
            ifrVar.a(f2, f3, i, i2, fArr);
            return;
        }
        double a3 = a(a2, this.v);
        this.l[0].b(a3, this.p);
        this.l[0].a(a3, this.o);
        float f7 = this.v[0];
        while (true) {
            double[] dArr2 = this.p;
            if (i3 >= dArr2.length) {
                this.h.a(f2, f3, fArr, this.n, dArr2, this.o);
                ifrVar.a(f2, f3, i, i2, fArr);
                return;
            }
            dArr2[i3] = dArr2[i3] * f7;
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f, float[] fArr, int i) {
        this.l[0].a(a(f, (float[]) null), this.o);
        this.h.b(this.n, this.o, fArr, i);
    }

    public void a(int i, int i2, float f, long j) {
        ArrayList arrayList;
        s a2;
        ConstraintAttribute constraintAttribute;
        r b;
        ConstraintAttribute constraintAttribute2;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        if (this.B != c.f1077a) {
            this.h.l = this.B;
        }
        this.j.a(this.k, hashSet2);
        ArrayList<c> arrayList2 = this.w;
        if (arrayList2 != null) {
            Iterator<c> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                c next = it.next();
                if (next instanceof i) {
                    i iVar = (i) next;
                    a(new p(i, i2, iVar, this.h, this.i));
                    if (iVar.q != c.f1077a) {
                        this.g = iVar.q;
                    }
                } else if (next instanceof f) {
                    next.a(hashSet3);
                } else if (next instanceof k) {
                    next.a(hashSet);
                } else if (next instanceof l) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((l) next);
                } else {
                    next.b(hashMap);
                    next.a(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.A = (l[]) arrayList.toArray(new l[0]);
        }
        if (!hashSet2.isEmpty()) {
            this.y = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(",")[1];
                    Iterator<c> it3 = this.w.iterator();
                    while (it3.hasNext()) {
                        c next3 = it3.next();
                        if (next3.f != null && (constraintAttribute2 = next3.f.get(str)) != null) {
                            sparseArray.append(next3.b, constraintAttribute2);
                        }
                    }
                    b = r.a(next2, sparseArray);
                } else {
                    b = r.b(next2);
                }
                if (b != null) {
                    b.a(next2);
                    this.y.put(next2, b);
                }
            }
            ArrayList<c> arrayList3 = this.w;
            if (arrayList3 != null) {
                Iterator<c> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    c next4 = it4.next();
                    if (next4 instanceof d) {
                        next4.a(this.y);
                    }
                }
            }
            this.j.a(this.y, 0);
            this.k.a(this.y, 100);
            for (String str2 : this.y.keySet()) {
                this.y.get(str2).a(hashMap.containsKey(str2) ? hashMap.get(str2).intValue() : 0);
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.x == null) {
                this.x = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.x.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(",")[1];
                        Iterator<c> it6 = this.w.iterator();
                        while (it6.hasNext()) {
                            c next6 = it6.next();
                            if (next6.f != null && (constraintAttribute = next6.f.get(str3)) != null) {
                                sparseArray2.append(next6.b, constraintAttribute);
                            }
                        }
                        a2 = s.a(next5, sparseArray2);
                    } else {
                        a2 = s.a(next5, j);
                    }
                    if (a2 != null) {
                        a2.a(next5);
                        this.x.put(next5, a2);
                    }
                }
            }
            ArrayList<c> arrayList4 = this.w;
            if (arrayList4 != null) {
                Iterator<c> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    c next7 = it7.next();
                    if (next7 instanceof k) {
                        ((k) next7).c(this.x);
                    }
                }
            }
            for (String str4 : this.x.keySet()) {
                this.x.get(str4).a(hashMap.containsKey(str4) ? hashMap.get(str4).intValue() : 0);
            }
        }
        p[] pVarArr = new p[this.u.size() + 2];
        pVarArr[0] = this.h;
        pVarArr[pVarArr.length - 1] = this.i;
        if (this.u.size() > 0 && this.g == -1) {
            this.g = 0;
        }
        Iterator<p> it8 = this.u.iterator();
        int i3 = 1;
        while (it8.hasNext()) {
            pVarArr[i3] = it8.next();
            i3++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.i.m.keySet()) {
            if (this.h.m.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        this.q = (String[]) hashSet4.toArray(new String[0]);
        this.r = new int[this.q.length];
        int i4 = 0;
        while (true) {
            String[] strArr = this.q;
            if (i4 >= strArr.length) {
                break;
            }
            String str6 = strArr[i4];
            this.r[i4] = 0;
            int i5 = 0;
            while (true) {
                if (i5 >= pVarArr.length) {
                    break;
                } else if (pVarArr[i5].m.containsKey(str6)) {
                    int[] iArr = this.r;
                    iArr[i4] = iArr[i4] + pVarArr[i5].m.get(str6).b();
                    break;
                } else {
                    i5++;
                }
            }
            i4++;
        }
        boolean z = pVarArr[0].l != c.f1077a;
        boolean[] zArr = new boolean[18 + this.q.length];
        for (int i6 = 1; i6 < pVarArr.length; i6++) {
            pVarArr[i6].a(pVarArr[i6 - 1], zArr, this.q, z);
        }
        int i7 = 0;
        for (int i8 = 1; i8 < zArr.length; i8++) {
            if (zArr[i8]) {
                i7++;
            }
        }
        this.n = new int[i7];
        int[] iArr2 = this.n;
        this.o = new double[iArr2.length];
        this.p = new double[iArr2.length];
        int i9 = 0;
        for (int i10 = 1; i10 < zArr.length; i10++) {
            if (zArr[i10]) {
                this.n[i9] = i10;
                i9++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance(double.class, pVarArr.length, this.n.length);
        double[] dArr2 = new double[pVarArr.length];
        for (int i11 = 0; i11 < pVarArr.length; i11++) {
            pVarArr[i11].a(dArr[i11], this.n);
            dArr2[i11] = pVarArr[i11].d;
        }
        int i12 = 0;
        while (true) {
            int[] iArr3 = this.n;
            if (i12 >= iArr3.length) {
                break;
            }
            if (iArr3[i12] < p.f1091a.length) {
                String str7 = p.f1091a[this.n[i12]] + " [";
                for (int i13 = 0; i13 < pVarArr.length; i13++) {
                    str7 = str7 + dArr[i13][i12];
                }
            }
            i12++;
        }
        this.l = new bxj[this.q.length + 1];
        int i14 = 0;
        while (true) {
            String[] strArr2 = this.q;
            if (i14 >= strArr2.length) {
                break;
            }
            String str8 = strArr2[i14];
            double[] dArr3 = null;
            double[][] dArr4 = null;
            int i15 = 0;
            for (int i16 = 0; i16 < pVarArr.length; i16++) {
                if (pVarArr[i16].a(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[pVarArr.length];
                        dArr4 = (double[][]) Array.newInstance(double.class, pVarArr.length, pVarArr[i16].b(str8));
                    }
                    dArr3[i15] = pVarArr[i16].d;
                    pVarArr[i16].a(str8, dArr4[i15], 0);
                    i15++;
                }
            }
            i14++;
            this.l[i14] = bxj.a(this.g, Arrays.copyOf(dArr3, i15), (double[][]) Arrays.copyOf(dArr4, i15));
        }
        this.l[0] = bxj.a(this.g, dArr2, dArr);
        if (pVarArr[0].l != c.f1077a) {
            int length = pVarArr.length;
            int[] iArr4 = new int[length];
            double[] dArr5 = new double[length];
            double[][] dArr6 = (double[][]) Array.newInstance(double.class, length, 2);
            for (int i17 = 0; i17 < length; i17++) {
                iArr4[i17] = pVarArr[i17].l;
                dArr5[i17] = pVarArr[i17].d;
                dArr6[i17][0] = pVarArr[i17].f;
                dArr6[i17][1] = pVarArr[i17].g;
            }
            this.m = bxj.a(iArr4, dArr5, dArr6);
        }
        float f2 = Float.NaN;
        this.z = new HashMap<>();
        if (this.w != null) {
            Iterator<String> it9 = hashSet3.iterator();
            while (it9.hasNext()) {
                String next8 = it9.next();
                g b2 = g.b(next8);
                if (b2 != null) {
                    if (b2.a() && Float.isNaN(f2)) {
                        f2 = d();
                    }
                    b2.a(next8);
                    this.z.put(next8, b2);
                }
            }
            Iterator<c> it10 = this.w.iterator();
            while (it10.hasNext()) {
                c next9 = it10.next();
                if (next9 instanceof f) {
                    ((f) next9).c(this.z);
                }
            }
            for (g gVar : this.z.values()) {
                gVar.c(f2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(c cVar) {
        this.w.add(cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ConstraintWidget constraintWidget, android.support.constraint.c cVar) {
        p pVar = this.h;
        pVar.d = 0.0f;
        pVar.e = 0.0f;
        b(pVar);
        this.h.a(constraintWidget.o(), constraintWidget.p(), constraintWidget.q(), constraintWidget.s());
        c.a a2 = cVar.a(this.b);
        this.h.a(a2);
        this.d = a2.b.f;
        this.j.a(constraintWidget, cVar, this.b);
    }

    public void a(View view) {
        this.f1090a = view;
        this.b = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.c = ((ConstraintLayout.LayoutParams) layoutParams).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ArrayList<c> arrayList) {
        this.w.addAll(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float[] fArr, int i) {
        float f;
        int i2 = i;
        float f2 = 1.0f;
        float f3 = 1.0f / (i2 - 1);
        HashMap<String, r> hashMap = this.y;
        g gVar = null;
        r rVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, r> hashMap2 = this.y;
        r rVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, g> hashMap3 = this.z;
        g gVar2 = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, g> hashMap4 = this.z;
        if (hashMap4 != null) {
            gVar = hashMap4.get("translationY");
        }
        int i3 = 0;
        while (i3 < i2) {
            float f4 = i3 * f3;
            float f5 = 0.0f;
            if (this.f != f2) {
                if (f4 < this.e) {
                    f4 = 0.0f;
                }
                float f6 = this.e;
                if (f4 > f6 && f4 < 1.0d) {
                    f4 = (f4 - f6) * this.f;
                }
            }
            double d = f4;
            iee ieeVar = this.h.b;
            float f7 = Float.NaN;
            Iterator<p> it = this.u.iterator();
            while (it.hasNext()) {
                p next = it.next();
                if (next.b != null) {
                    if (next.d < f4) {
                        ieeVar = next.b;
                        f5 = next.d;
                    } else if (Float.isNaN(f7)) {
                        f7 = next.d;
                    }
                }
            }
            if (ieeVar != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                d = (((float) ieeVar.a((f4 - f5) / f)) * (f7 - f5)) + f5;
            }
            this.l[0].a(d, this.o);
            bxj bxjVar = this.m;
            if (bxjVar != null) {
                double[] dArr = this.o;
                if (dArr.length > 0) {
                    bxjVar.a(d, dArr);
                }
            }
            int i4 = i3 << 1;
            this.h.a(this.n, this.o, fArr, i4);
            if (gVar2 != null) {
                fArr[i4] = fArr[i4] + gVar2.a(f4);
            } else if (rVar != null) {
                fArr[i4] = fArr[i4] + rVar.a(f4);
            }
            if (gVar != null) {
                int i5 = i4 + 1;
                fArr[i5] = fArr[i5] + gVar.a(f4);
            } else if (rVar2 != null) {
                int i6 = i4 + 1;
                fArr[i6] = fArr[i6] + rVar2.a(f4);
            }
            i3++;
            i2 = i;
            f2 = 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(View view, float f, long j, e eVar) {
        s.d dVar;
        boolean z;
        m mVar;
        double d;
        float a2 = a(f, (float[]) null);
        HashMap<String, r> hashMap = this.y;
        if (hashMap != null) {
            for (r rVar : hashMap.values()) {
                rVar.a(view, a2);
            }
        }
        HashMap<String, s> hashMap2 = this.x;
        if (hashMap2 != null) {
            dVar = null;
            boolean z2 = false;
            for (s sVar : hashMap2.values()) {
                if (sVar instanceof s.d) {
                    dVar = (s.d) sVar;
                } else {
                    z2 |= sVar.a(view, a2, j, eVar);
                }
            }
            z = z2;
        } else {
            dVar = null;
            z = false;
        }
        bxj[] bxjVarArr = this.l;
        if (bxjVarArr != null) {
            double d2 = a2;
            bxjVarArr[0].a(d2, this.o);
            this.l[0].b(d2, this.p);
            bxj bxjVar = this.m;
            if (bxjVar != null) {
                double[] dArr = this.o;
                if (dArr.length > 0) {
                    bxjVar.a(d2, dArr);
                    this.m.b(d2, this.p);
                }
            }
            this.h.a(view, this.n, this.o, this.p, (double[]) null);
            HashMap<String, r> hashMap3 = this.y;
            if (hashMap3 != null) {
                for (r rVar2 : hashMap3.values()) {
                    if (rVar2 instanceof r.d) {
                        double[] dArr2 = this.p;
                        d = d2;
                        ((r.d) rVar2).a(view, a2, dArr2[0], dArr2[1]);
                    } else {
                        d = d2;
                    }
                    d2 = d;
                }
            }
            double d3 = d2;
            if (dVar != null) {
                double[] dArr3 = this.p;
                z = dVar.a(view, eVar, a2, j, dArr3[0], dArr3[1]) | z;
            }
            int i = 1;
            while (true) {
                bxj[] bxjVarArr2 = this.l;
                if (i >= bxjVarArr2.length) {
                    break;
                }
                bxjVarArr2[i].a(d3, this.t);
                this.h.m.get(this.q[i - 1]).a(view, this.t);
                i++;
            }
            if (this.j.f1089a == 0) {
                if (a2 <= 0.0f) {
                    mVar = this.j;
                } else if (a2 >= 1.0f) {
                    mVar = this.k;
                } else if (this.k.b != this.j.b) {
                    view.setVisibility(0);
                }
                view.setVisibility(mVar.b);
            }
            if (this.A != null) {
                int i2 = 0;
                while (true) {
                    l[] lVarArr = this.A;
                    if (i2 >= lVarArr.length) {
                        break;
                    }
                    lVarArr[i2].a(a2, view);
                    i2++;
                }
            }
        } else {
            float f2 = this.h.f + ((this.i.f - this.h.f) * a2);
            float f3 = this.h.g + ((this.i.g - this.h.g) * a2);
            float f4 = f2 + 0.5f;
            int i3 = (int) f4;
            float f5 = f3 + 0.5f;
            int i4 = (int) f5;
            int i5 = (int) (f4 + this.h.h + ((this.i.h - this.h.h) * a2));
            int i6 = (int) (f5 + this.h.i + ((this.i.i - this.h.i) * a2));
            int i7 = i5 - i3;
            int i8 = i6 - i4;
            if (this.i.h != this.h.h || this.i.i != this.h.i) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i8, 1073741824));
            }
            view.layout(i3, i4, i5, i6);
        }
        HashMap<String, g> hashMap4 = this.z;
        if (hashMap4 != null) {
            for (g gVar : hashMap4.values()) {
                if (gVar instanceof g.e) {
                    double[] dArr4 = this.p;
                    ((g.e) gVar).a(view, a2, dArr4[0], dArr4[1]);
                } else {
                    gVar.a(view, a2);
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b() {
        return this.i.g;
    }

    public void b(int i) {
        this.B = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(ConstraintWidget constraintWidget, android.support.constraint.c cVar) {
        p pVar = this.i;
        pVar.d = 1.0f;
        pVar.e = 1.0f;
        b(pVar);
        this.i.a(constraintWidget.o(), constraintWidget.p(), constraintWidget.q(), constraintWidget.s());
        this.i.a(cVar.a(this.b));
        this.k.a(constraintWidget, cVar, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(View view) {
        p pVar = this.h;
        pVar.d = 0.0f;
        pVar.e = 0.0f;
        pVar.a(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.j.b(view);
    }

    public int c() {
        int i = this.h.c;
        Iterator<p> it = this.u.iterator();
        while (it.hasNext()) {
            i = Math.max(i, it.next().c);
        }
        return Math.max(i, this.i.c);
    }

    public String toString() {
        return " start: x: " + this.h.f + " y: " + this.h.g + " end: x: " + this.i.f + " y: " + this.i.g;
    }
}
