package com.airbnb.lottie.model.layer;

import com.airbnb.lottie.model.content.Mask;
import java.util.List;
import java.util.Locale;
import tb.aia;
import tb.aii;
import tb.aij;
import tb.aik;
import tb.aiz;
import tb.akm;

/* loaded from: classes2.dex */
public class Layer {

    /* renamed from: a  reason: collision with root package name */
    private final List<com.airbnb.lottie.model.content.c> f1774a;
    private final com.airbnb.lottie.g b;
    private final String c;
    private final long d;
    private final LayerType e;
    private final long f;
    private final String g;
    private final List<Mask> h;
    private final aik i;
    private final int j;
    private final int k;
    private final int l;
    private final float m;
    private final float n;
    private final int o;
    private final int p;
    private final aii q;
    private final aij r;
    private final aia s;
    private final List<akm<Float>> t;
    private final MatteType u;
    private final boolean v;
    private final com.airbnb.lottie.model.content.a w;
    private final aiz x;

    /* loaded from: classes2.dex */
    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* loaded from: classes2.dex */
    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<com.airbnb.lottie.model.content.c> list, com.airbnb.lottie.g gVar, String str, long j, LayerType layerType, long j2, String str2, List<Mask> list2, aik aikVar, int i, int i2, int i3, float f, float f2, int i4, int i5, aii aiiVar, aij aijVar, List<akm<Float>> list3, MatteType matteType, aia aiaVar, boolean z, com.airbnb.lottie.model.content.a aVar, aiz aizVar) {
        this.f1774a = list;
        this.b = gVar;
        this.c = str;
        this.d = j;
        this.e = layerType;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = aikVar;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = i4;
        this.p = i5;
        this.q = aiiVar;
        this.r = aijVar;
        this.t = list3;
        this.u = matteType;
        this.s = aiaVar;
        this.v = z;
        this.w = aVar;
        this.x = aizVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.airbnb.lottie.g a() {
        return this.b;
    }

    public String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(f());
        sb.append("\n");
        Layer a2 = this.b.a(m());
        if (a2 != null) {
            String str2 = "\t\tParents: ";
            while (true) {
                sb.append(str2);
                sb.append(a2.f());
                a2 = this.b.a(a2.m());
                if (a2 == null) {
                    break;
                }
                str2 = "->";
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!j().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(j().size());
            sb.append("\n");
        }
        if (r() != 0 && q() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(r()), Integer.valueOf(q()), Integer.valueOf(p())));
        }
        if (!this.f1774a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (com.airbnb.lottie.model.content.c cVar : this.f1774a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(cVar);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.n / this.b.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<akm<Float>> d() {
        return this.t;
    }

    public long e() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String g() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Mask> j() {
        return this.h;
    }

    public LayerType k() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MatteType l() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long m() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<com.airbnb.lottie.model.content.c> n() {
        return this.f1774a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aik o() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int r() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aii s() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aij t() {
        return this.r;
    }

    public String toString() {
        return a("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aia u() {
        return this.s;
    }

    public boolean v() {
        return this.v;
    }

    public com.airbnb.lottie.model.content.a w() {
        return this.w;
    }

    public aiz x() {
        return this.x;
    }
}
