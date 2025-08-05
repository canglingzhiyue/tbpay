package com.airbnb.lottie;

import android.graphics.Rect;
import android.support.v4.util.LongSparseArray;
import android.support.v4.util.SparseArrayCompat;
import com.airbnb.lottie.model.b;
import com.airbnb.lottie.model.layer.Layer;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.akh;
import tb.akk;

/* loaded from: classes2.dex */
public class g {
    private Map<String, List<Layer>> c;
    private Map<String, i> d;
    private Map<String, b> e;
    private List<com.airbnb.lottie.model.g> f;
    private SparseArrayCompat<com.airbnb.lottie.model.c> g;
    private LongSparseArray<Layer> h;
    private List<Layer> i;
    private Rect j;
    private float k;
    private float l;
    private float m;
    private boolean n;

    /* renamed from: a  reason: collision with root package name */
    private final q f1744a = new q();
    private final HashSet<String> b = new HashSet<>();
    private int o = 0;

    @Deprecated
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: com.airbnb.lottie.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        private static final class C0031a implements c, j<g> {

            /* renamed from: a  reason: collision with root package name */
            private final p f1745a;
            private boolean b;

            private C0031a(p pVar) {
                this.b = false;
                this.f1745a = pVar;
            }

            @Override // com.airbnb.lottie.j
            /* renamed from: a */
            public void onResult(g gVar) {
                if (this.b) {
                    return;
                }
                this.f1745a.a(gVar);
            }
        }

        @Deprecated
        public static c a(InputStream inputStream, p pVar) {
            C0031a c0031a = new C0031a(pVar);
            h.a(inputStream, (String) null).a(c0031a);
            return c0031a;
        }
    }

    public float a(float f) {
        return akk.a(this.k, this.l, f);
    }

    public Layer a(long j) {
        return this.h.get(j);
    }

    public void a(int i) {
        this.o += i;
    }

    public void a(Rect rect, float f, float f2, float f3, List<Layer> list, LongSparseArray<Layer> longSparseArray, Map<String, List<Layer>> map, Map<String, i> map2, SparseArrayCompat<com.airbnb.lottie.model.c> sparseArrayCompat, Map<String, b> map3, List<com.airbnb.lottie.model.g> list2) {
        this.j = rect;
        this.k = f;
        this.l = f2;
        this.m = f3;
        this.i = list;
        this.h = longSparseArray;
        this.c = map;
        this.d = map2;
        this.g = sparseArrayCompat;
        this.e = map3;
        this.f = list2;
    }

    public void a(String str) {
        akh.b(str);
        this.b.add(str);
    }

    public void a(boolean z) {
        this.n = z;
    }

    public boolean a() {
        return this.n;
    }

    public int b() {
        return this.o;
    }

    public List<Layer> b(String str) {
        return this.c.get(str);
    }

    public void b(boolean z) {
        this.f1744a.a(z);
    }

    public com.airbnb.lottie.model.g c(String str) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            com.airbnb.lottie.model.g gVar = this.f.get(i);
            if (gVar.a(str)) {
                return gVar;
            }
        }
        return null;
    }

    public q c() {
        return this.f1744a;
    }

    public Rect d() {
        return this.j;
    }

    public float e() {
        return (m() / this.m) * 1000.0f;
    }

    public float f() {
        return this.k;
    }

    public float g() {
        return this.l;
    }

    public float h() {
        return this.m;
    }

    public List<Layer> i() {
        return this.i;
    }

    public SparseArrayCompat<com.airbnb.lottie.model.c> j() {
        return this.g;
    }

    public Map<String, b> k() {
        return this.e;
    }

    public Map<String, i> l() {
        return this.d;
    }

    public float m() {
        return this.l - this.k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (Layer layer : this.i) {
            sb.append(layer.a("\t"));
        }
        return sb.toString();
    }
}
