package android.support.constraint.solver;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class SolverVariable {
    public static final int STRENGTH_BARRIER = 6;
    public static final int STRENGTH_CENTERING = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 8;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    private static int j = 1;
    private static int k = 1;
    private static int l = 1;
    private static int m = 1;
    private static int n = 1;
    public float d;
    Type f;
    private String o;
    public boolean p;

    /* renamed from: a  reason: collision with root package name */
    public int f1101a = -1;
    int b = -1;
    public int c = 0;
    public boolean q = false;
    float[] e = new float[9];
    float[] r = new float[9];
    b[] g = new b[16];
    int h = 0;
    public int i = 0;
    boolean s = false;
    int t = -1;
    float u = 0.0f;
    HashSet<b> v = null;

    /* loaded from: classes2.dex */
    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type, String str) {
        this.f = type;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a() {
        k++;
    }

    public void a(Type type, String str) {
        this.f = type;
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.h;
            if (i >= i2) {
                b[] bVarArr = this.g;
                if (i2 >= bVarArr.length) {
                    this.g = (b[]) Arrays.copyOf(bVarArr, bVarArr.length << 1);
                }
                b[] bVarArr2 = this.g;
                int i3 = this.h;
                bVarArr2[i3] = bVar;
                this.h = i3 + 1;
                return;
            } else if (this.g[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public void a(e eVar, float f) {
        this.d = f;
        this.q = true;
        this.s = false;
        this.t = -1;
        this.u = 0.0f;
        int i = this.h;
        this.b = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.g[i2].a(eVar, this, false);
        }
        this.h = 0;
    }

    public final void a(e eVar, b bVar) {
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            this.g[i2].a(eVar, bVar, false);
        }
        this.h = 0;
    }

    public void b() {
        this.o = null;
        this.f = Type.UNKNOWN;
        this.c = 0;
        this.f1101a = -1;
        this.b = -1;
        this.d = 0.0f;
        this.q = false;
        this.s = false;
        this.t = -1;
        this.u = 0.0f;
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            this.g[i2] = null;
        }
        this.h = 0;
        this.i = 0;
        this.p = false;
        Arrays.fill(this.r, 0.0f);
    }

    public final void b(b bVar) {
        int i = this.h;
        int i2 = 0;
        while (i2 < i) {
            if (this.g[i2] == bVar) {
                while (i2 < i - 1) {
                    b[] bVarArr = this.g;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.h--;
                return;
            }
            i2++;
        }
    }

    public String toString() {
        StringBuilder sb;
        if (this.o != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.o);
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f1101a);
        }
        return sb.toString();
    }
}
