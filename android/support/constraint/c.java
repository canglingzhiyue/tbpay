package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Constraints;
import android.support.constraint.solver.widgets.ConstraintWidget;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.taobao.R;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import tb.iee;
import tb.mto;

/* loaded from: classes2.dex */
public class c {
    public static final int BASELINE = 5;
    public static final int BOTTOM = 4;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static final int END = 7;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int HORIZONTAL_GUIDELINE = 0;
    public static final int INVISIBLE = 4;
    public static final int LEFT = 1;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int PARENT_ID = 0;
    public static final int RIGHT = 2;
    public static final int START = 6;
    public static final int TOP = 3;
    public static final int UNSET = -1;
    public static final int VERTICAL = 1;
    public static final int VERTICAL_GUIDELINE = 1;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 0;
    public static final int WRAP_CONTENT = -2;

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1057a = {0, 4, 8};
    private static SparseIntArray c;
    private boolean d;
    private HashMap<String, ConstraintAttribute> e = new HashMap<>();
    private boolean f = true;
    private HashMap<Integer, a> b = new HashMap<>();

    /* loaded from: classes2.dex */
    public static class a {
        int d;

        /* renamed from: a  reason: collision with root package name */
        public final d f1058a = new d();
        public final C0003c b = new C0003c();
        public final b c = new b();
        public final e e = new e();
        public HashMap<String, ConstraintAttribute> f = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.d = i;
            this.c.h = layoutParams.d;
            this.c.i = layoutParams.e;
            this.c.j = layoutParams.f;
            this.c.k = layoutParams.g;
            this.c.l = layoutParams.h;
            this.c.m = layoutParams.i;
            this.c.n = layoutParams.j;
            this.c.o = layoutParams.k;
            this.c.p = layoutParams.l;
            this.c.q = layoutParams.p;
            this.c.r = layoutParams.q;
            this.c.s = layoutParams.r;
            this.c.t = layoutParams.s;
            this.c.u = layoutParams.z;
            this.c.v = layoutParams.A;
            this.c.w = layoutParams.B;
            this.c.x = layoutParams.m;
            this.c.y = layoutParams.n;
            this.c.z = layoutParams.o;
            this.c.A = layoutParams.Q;
            this.c.B = layoutParams.R;
            this.c.C = layoutParams.S;
            this.c.g = layoutParams.c;
            this.c.e = layoutParams.f1055a;
            this.c.f = layoutParams.b;
            this.c.c = layoutParams.width;
            this.c.d = layoutParams.height;
            this.c.D = layoutParams.leftMargin;
            this.c.E = layoutParams.rightMargin;
            this.c.F = layoutParams.topMargin;
            this.c.G = layoutParams.bottomMargin;
            this.c.P = layoutParams.F;
            this.c.Q = layoutParams.E;
            this.c.S = layoutParams.H;
            this.c.R = layoutParams.G;
            this.c.ah = layoutParams.T;
            this.c.ai = layoutParams.U;
            this.c.T = layoutParams.I;
            this.c.U = layoutParams.J;
            this.c.V = layoutParams.M;
            this.c.W = layoutParams.N;
            this.c.X = layoutParams.K;
            this.c.Y = layoutParams.L;
            this.c.Z = layoutParams.O;
            this.c.aa = layoutParams.P;
            this.c.ag = layoutParams.aA;
            this.c.K = layoutParams.u;
            this.c.M = layoutParams.w;
            this.c.J = layoutParams.t;
            this.c.L = layoutParams.v;
            this.c.O = layoutParams.x;
            this.c.N = layoutParams.y;
            if (Build.VERSION.SDK_INT >= 17) {
                this.c.H = layoutParams.getMarginEnd();
                this.c.I = layoutParams.getMarginStart();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, Constraints.LayoutParams layoutParams) {
            a(i, (ConstraintLayout.LayoutParams) layoutParams);
            this.f1058a.d = layoutParams.an;
            this.e.b = layoutParams.aq;
            this.e.c = layoutParams.ar;
            this.e.d = layoutParams.as;
            this.e.e = layoutParams.at;
            this.e.f = layoutParams.au;
            this.e.g = layoutParams.av;
            this.e.h = layoutParams.aw;
            this.e.i = layoutParams.ax;
            this.e.j = layoutParams.ay;
            this.e.k = layoutParams.az;
            this.e.m = layoutParams.ap;
            this.e.l = layoutParams.ao;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            a(i, layoutParams);
            if (constraintHelper instanceof Barrier) {
                b bVar = this.c;
                bVar.ad = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.ab = barrier.getType();
                this.c.ae = barrier.getReferencedIds();
                this.c.ac = barrier.getMargin();
            }
        }

        /* renamed from: a */
        public a clone() {
            a aVar = new a();
            aVar.c.a(this.c);
            aVar.b.a(this.b);
            aVar.f1058a.a(this.f1058a);
            aVar.e.a(this.e);
            aVar.d = this.d;
            return aVar;
        }

        public void a(ConstraintLayout.LayoutParams layoutParams) {
            layoutParams.d = this.c.h;
            layoutParams.e = this.c.i;
            layoutParams.f = this.c.j;
            layoutParams.g = this.c.k;
            layoutParams.h = this.c.l;
            layoutParams.i = this.c.m;
            layoutParams.j = this.c.n;
            layoutParams.k = this.c.o;
            layoutParams.l = this.c.p;
            layoutParams.p = this.c.q;
            layoutParams.q = this.c.r;
            layoutParams.r = this.c.s;
            layoutParams.s = this.c.t;
            layoutParams.leftMargin = this.c.D;
            layoutParams.rightMargin = this.c.E;
            layoutParams.topMargin = this.c.F;
            layoutParams.bottomMargin = this.c.G;
            layoutParams.x = this.c.O;
            layoutParams.y = this.c.N;
            layoutParams.u = this.c.K;
            layoutParams.w = this.c.M;
            layoutParams.z = this.c.u;
            layoutParams.A = this.c.v;
            layoutParams.m = this.c.x;
            layoutParams.n = this.c.y;
            layoutParams.o = this.c.z;
            layoutParams.B = this.c.w;
            layoutParams.Q = this.c.A;
            layoutParams.R = this.c.B;
            layoutParams.F = this.c.P;
            layoutParams.E = this.c.Q;
            layoutParams.H = this.c.S;
            layoutParams.G = this.c.R;
            layoutParams.T = this.c.ah;
            layoutParams.U = this.c.ai;
            layoutParams.I = this.c.T;
            layoutParams.J = this.c.U;
            layoutParams.M = this.c.V;
            layoutParams.N = this.c.W;
            layoutParams.K = this.c.X;
            layoutParams.L = this.c.Y;
            layoutParams.O = this.c.Z;
            layoutParams.P = this.c.aa;
            layoutParams.S = this.c.C;
            layoutParams.c = this.c.g;
            layoutParams.f1055a = this.c.e;
            layoutParams.b = this.c.f;
            layoutParams.width = this.c.c;
            layoutParams.height = this.c.d;
            if (this.c.ag != null) {
                layoutParams.aA = this.c.ag;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(this.c.I);
                layoutParams.setMarginEnd(this.c.H);
            }
            layoutParams.a();
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
        public static final int UNSET = -1;
        private static SparseIntArray ak;
        public int[] ae;
        public String af;
        public String ag;
        public int c;
        public int d;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1059a = false;
        public boolean b = false;
        public int e = -1;
        public int f = -1;
        public float g = -1.0f;
        public int h = -1;
        public int i = -1;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public float u = 0.5f;
        public float v = 0.5f;
        public String w = null;
        public int x = -1;
        public int y = 0;
        public float z = 0.0f;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public float P = -1.0f;
        public float Q = -1.0f;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = -1;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public float Z = 1.0f;
        public float aa = 1.0f;
        public int ab = -1;
        public int ac = 0;
        public int ad = -1;
        public boolean ah = false;
        public boolean ai = false;
        public boolean aj = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            ak = sparseIntArray;
            sparseIntArray.append(R.styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            ak.append(R.styleable.Layout_layout_constraintLeft_toRightOf, 25);
            ak.append(R.styleable.Layout_layout_constraintRight_toLeftOf, 28);
            ak.append(R.styleable.Layout_layout_constraintRight_toRightOf, 29);
            ak.append(R.styleable.Layout_layout_constraintTop_toTopOf, 35);
            ak.append(R.styleable.Layout_layout_constraintTop_toBottomOf, 34);
            ak.append(R.styleable.Layout_layout_constraintBottom_toTopOf, 4);
            ak.append(R.styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            ak.append(R.styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            ak.append(R.styleable.Layout_layout_editor_absoluteX, 6);
            ak.append(R.styleable.Layout_layout_editor_absoluteY, 7);
            ak.append(R.styleable.Layout_layout_constraintGuide_begin, 17);
            ak.append(R.styleable.Layout_layout_constraintGuide_end, 18);
            ak.append(R.styleable.Layout_layout_constraintGuide_percent, 19);
            ak.append(R.styleable.Layout_android_orientation, 26);
            ak.append(R.styleable.Layout_layout_constraintStart_toEndOf, 31);
            ak.append(R.styleable.Layout_layout_constraintStart_toStartOf, 32);
            ak.append(R.styleable.Layout_layout_constraintEnd_toStartOf, 10);
            ak.append(R.styleable.Layout_layout_constraintEnd_toEndOf, 9);
            ak.append(R.styleable.Layout_layout_goneMarginLeft, 13);
            ak.append(R.styleable.Layout_layout_goneMarginTop, 16);
            ak.append(R.styleable.Layout_layout_goneMarginRight, 14);
            ak.append(R.styleable.Layout_layout_goneMarginBottom, 11);
            ak.append(R.styleable.Layout_layout_goneMarginStart, 15);
            ak.append(R.styleable.Layout_layout_goneMarginEnd, 12);
            ak.append(R.styleable.Layout_layout_constraintVertical_weight, 38);
            ak.append(R.styleable.Layout_layout_constraintHorizontal_weight, 37);
            ak.append(R.styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            ak.append(R.styleable.Layout_layout_constraintVertical_chainStyle, 40);
            ak.append(R.styleable.Layout_layout_constraintHorizontal_bias, 20);
            ak.append(R.styleable.Layout_layout_constraintVertical_bias, 36);
            ak.append(R.styleable.Layout_layout_constraintDimensionRatio, 5);
            ak.append(R.styleable.Layout_layout_constraintLeft_creator, 76);
            ak.append(R.styleable.Layout_layout_constraintTop_creator, 76);
            ak.append(R.styleable.Layout_layout_constraintRight_creator, 76);
            ak.append(R.styleable.Layout_layout_constraintBottom_creator, 76);
            ak.append(R.styleable.Layout_layout_constraintBaseline_creator, 76);
            ak.append(R.styleable.Layout_android_layout_marginLeft, 23);
            ak.append(R.styleable.Layout_android_layout_marginRight, 27);
            ak.append(R.styleable.Layout_android_layout_marginStart, 30);
            ak.append(R.styleable.Layout_android_layout_marginEnd, 8);
            ak.append(R.styleable.Layout_android_layout_marginTop, 33);
            ak.append(R.styleable.Layout_android_layout_marginBottom, 2);
            ak.append(R.styleable.Layout_android_layout_width, 22);
            ak.append(R.styleable.Layout_android_layout_height, 21);
            ak.append(R.styleable.Layout_layout_constraintCircle, 61);
            ak.append(R.styleable.Layout_layout_constraintCircleRadius, 62);
            ak.append(R.styleable.Layout_layout_constraintCircleAngle, 63);
            ak.append(R.styleable.Layout_layout_constraintWidth_percent, 69);
            ak.append(R.styleable.Layout_layout_constraintHeight_percent, 70);
            ak.append(R.styleable.Layout_chainUseRtl, 71);
            ak.append(R.styleable.Layout_barrierDirection, 72);
            ak.append(R.styleable.Layout_barrierMargin, 73);
            ak.append(R.styleable.Layout_constraint_referenced_ids, 74);
            ak.append(R.styleable.Layout_barrierAllowsGoneWidgets, 75);
        }

        void a(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Layout);
            this.b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = ak.get(index);
                if (i2 == 80) {
                    this.ah = obtainStyledAttributes.getBoolean(index, this.ah);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.p = c.a(obtainStyledAttributes, index, this.p);
                            continue;
                        case 2:
                            this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            continue;
                        case 3:
                            this.o = c.a(obtainStyledAttributes, index, this.o);
                            continue;
                        case 4:
                            this.n = c.a(obtainStyledAttributes, index, this.n);
                            continue;
                        case 5:
                            this.w = obtainStyledAttributes.getString(index);
                            continue;
                        case 6:
                            this.A = obtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                            continue;
                        case 7:
                            this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            continue;
                        case 8:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            this.t = c.a(obtainStyledAttributes, index, this.t);
                            continue;
                        case 10:
                            this.s = c.a(obtainStyledAttributes, index, this.s);
                            continue;
                        case 11:
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        case 12:
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        case 13:
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            continue;
                        case 14:
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        case 15:
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            continue;
                        case 16:
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        case 17:
                            this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                            continue;
                        case 18:
                            this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                            continue;
                        case 19:
                            this.g = obtainStyledAttributes.getFloat(index, this.g);
                            continue;
                        case 20:
                            this.u = obtainStyledAttributes.getFloat(index, this.u);
                            continue;
                        case 21:
                            this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                            continue;
                        case 22:
                            this.c = obtainStyledAttributes.getLayoutDimension(index, this.c);
                            continue;
                        case 23:
                            this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            continue;
                        case 24:
                            this.h = c.a(obtainStyledAttributes, index, this.h);
                            continue;
                        case 25:
                            this.i = c.a(obtainStyledAttributes, index, this.i);
                            continue;
                        case 26:
                            this.C = obtainStyledAttributes.getInt(index, this.C);
                            continue;
                        case 27:
                            this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            continue;
                        case 28:
                            this.j = c.a(obtainStyledAttributes, index, this.j);
                            continue;
                        case 29:
                            this.k = c.a(obtainStyledAttributes, index, this.k);
                            continue;
                        case 30:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                                break;
                            } else {
                                continue;
                            }
                        case 31:
                            this.q = c.a(obtainStyledAttributes, index, this.q);
                            continue;
                        case 32:
                            this.r = c.a(obtainStyledAttributes, index, this.r);
                            continue;
                        case 33:
                            this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            continue;
                        case 34:
                            this.m = c.a(obtainStyledAttributes, index, this.m);
                            continue;
                        case 35:
                            this.l = c.a(obtainStyledAttributes, index, this.l);
                            continue;
                        case 36:
                            this.v = obtainStyledAttributes.getFloat(index, this.v);
                            continue;
                        case 37:
                            this.Q = obtainStyledAttributes.getFloat(index, this.Q);
                            continue;
                        case 38:
                            this.P = obtainStyledAttributes.getFloat(index, this.P);
                            continue;
                        case 39:
                            this.R = obtainStyledAttributes.getInt(index, this.R);
                            continue;
                        case 40:
                            this.S = obtainStyledAttributes.getInt(index, this.S);
                            continue;
                        default:
                            switch (i2) {
                                case 54:
                                    this.T = obtainStyledAttributes.getInt(index, this.T);
                                    continue;
                                case 55:
                                    this.U = obtainStyledAttributes.getInt(index, this.U);
                                    continue;
                                case 56:
                                    this.V = obtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                    continue;
                                case 57:
                                    this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    continue;
                                case 58:
                                    this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    continue;
                                case 59:
                                    this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    continue;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.x = c.a(obtainStyledAttributes, index, this.x);
                                            continue;
                                        case 62:
                                            this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                                            continue;
                                        case 63:
                                            this.z = obtainStyledAttributes.getFloat(index, this.z);
                                            continue;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.aa = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.ab = obtainStyledAttributes.getInt(index, this.ab);
                                                    break;
                                                case 73:
                                                    this.ac = obtainStyledAttributes.getDimensionPixelSize(index, this.ac);
                                                    break;
                                                case 74:
                                                    this.af = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.aj = obtainStyledAttributes.getBoolean(index, this.aj);
                                                    break;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    sb.append(str);
                                                    sb.append(Integer.toHexString(index));
                                                    sb.append("   ");
                                                    sb.append(ak.get(index));
                                                    sb.toString();
                                                    continue;
                                                    continue;
                                                    continue;
                                                case 77:
                                                    this.ag = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    sb.append(str);
                                                    sb.append(Integer.toHexString(index));
                                                    sb.append("   ");
                                                    sb.append(ak.get(index));
                                                    sb.toString();
                                                    continue;
                                                    continue;
                                                    continue;
                                            }
                                    }
                            }
                    }
                } else {
                    this.ai = obtainStyledAttributes.getBoolean(index, this.ai);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void a(b bVar) {
            this.f1059a = bVar.f1059a;
            this.c = bVar.c;
            this.b = bVar.b;
            this.d = bVar.d;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.aa = bVar.aa;
            this.ab = bVar.ab;
            this.ac = bVar.ac;
            this.ad = bVar.ad;
            this.ag = bVar.ag;
            int[] iArr = bVar.ae;
            if (iArr != null) {
                this.ae = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.ae = null;
            }
            this.af = bVar.af;
            this.ah = bVar.ah;
            this.ai = bVar.ai;
            this.aj = bVar.aj;
        }
    }

    /* renamed from: android.support.constraint.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0003c {
        private static SparseIntArray h;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1060a = false;
        public int b = -1;
        public String c = null;
        public int d = -1;
        public int e = 0;
        public float f = Float.NaN;
        public float g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            h = sparseIntArray;
            sparseIntArray.append(R.styleable.Motion_motionPathRotate, 1);
            h.append(R.styleable.Motion_pathMotionArc, 2);
            h.append(R.styleable.Motion_transitionEasing, 3);
            h.append(R.styleable.Motion_drawPath, 4);
            h.append(R.styleable.Motion_animate_relativeTo, 5);
            h.append(R.styleable.Motion_motionStagger, 6);
        }

        void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Motion);
            this.f1060a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (h.get(index)) {
                    case 1:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 2:
                        this.d = obtainStyledAttributes.getInt(index, this.d);
                        break;
                    case 3:
                        this.c = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : iee.c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.b = c.a(obtainStyledAttributes, index, this.b);
                        break;
                    case 6:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void a(C0003c c0003c) {
            this.f1060a = c0003c.f1060a;
            this.b = c0003c.b;
            this.c = c0003c.c;
            this.d = c0003c.d;
            this.e = c0003c.e;
            this.g = c0003c.g;
            this.f = c0003c.f;
        }
    }

    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1061a = false;
        public int b = 0;
        public int c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PropertySet);
            this.f1061a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.PropertySet_android_alpha) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                } else if (index == R.styleable.PropertySet_android_visibility) {
                    this.b = obtainStyledAttributes.getInt(index, this.b);
                    this.b = c.f1057a[this.b];
                } else if (index == R.styleable.PropertySet_visibilityMode) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                } else if (index == R.styleable.PropertySet_motionProgress) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void a(d dVar) {
            this.f1061a = dVar.f1061a;
            this.b = dVar.b;
            this.d = dVar.d;
            this.e = dVar.e;
            this.c = dVar.c;
        }
    }

    /* loaded from: classes2.dex */
    public static class e {
        private static SparseIntArray n;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1062a = false;
        public float b = 0.0f;
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = Float.NaN;
        public float h = Float.NaN;
        public float i = 0.0f;
        public float j = 0.0f;
        public float k = 0.0f;
        public boolean l = false;
        public float m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            n = sparseIntArray;
            sparseIntArray.append(R.styleable.Transform_android_rotation, 1);
            n.append(R.styleable.Transform_android_rotationX, 2);
            n.append(R.styleable.Transform_android_rotationY, 3);
            n.append(R.styleable.Transform_android_scaleX, 4);
            n.append(R.styleable.Transform_android_scaleY, 5);
            n.append(R.styleable.Transform_android_transformPivotX, 6);
            n.append(R.styleable.Transform_android_transformPivotY, 7);
            n.append(R.styleable.Transform_android_translationX, 8);
            n.append(R.styleable.Transform_android_translationY, 9);
            n.append(R.styleable.Transform_android_translationZ, 10);
            n.append(R.styleable.Transform_android_elevation, 11);
        }

        void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Transform);
            this.f1062a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (n.get(index)) {
                    case 1:
                        this.b = obtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = obtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = obtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.i = obtainStyledAttributes.getDimension(index, this.i);
                        break;
                    case 9:
                        this.j = obtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.k = obtainStyledAttributes.getDimension(index, this.k);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.l = true;
                            this.m = obtainStyledAttributes.getDimension(index, this.m);
                            break;
                        } else {
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void a(e eVar) {
            this.f1062a = eVar.f1062a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.l = eVar.l;
            this.m = eVar.m;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.append(R.styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        c.append(R.styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        c.append(R.styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        c.append(R.styleable.Constraint_layout_constraintRight_toRightOf, 30);
        c.append(R.styleable.Constraint_layout_constraintTop_toTopOf, 36);
        c.append(R.styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        c.append(R.styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        c.append(R.styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        c.append(R.styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        c.append(R.styleable.Constraint_layout_editor_absoluteX, 6);
        c.append(R.styleable.Constraint_layout_editor_absoluteY, 7);
        c.append(R.styleable.Constraint_layout_constraintGuide_begin, 17);
        c.append(R.styleable.Constraint_layout_constraintGuide_end, 18);
        c.append(R.styleable.Constraint_layout_constraintGuide_percent, 19);
        c.append(R.styleable.Constraint_android_orientation, 27);
        c.append(R.styleable.Constraint_layout_constraintStart_toEndOf, 32);
        c.append(R.styleable.Constraint_layout_constraintStart_toStartOf, 33);
        c.append(R.styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        c.append(R.styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        c.append(R.styleable.Constraint_layout_goneMarginLeft, 13);
        c.append(R.styleable.Constraint_layout_goneMarginTop, 16);
        c.append(R.styleable.Constraint_layout_goneMarginRight, 14);
        c.append(R.styleable.Constraint_layout_goneMarginBottom, 11);
        c.append(R.styleable.Constraint_layout_goneMarginStart, 15);
        c.append(R.styleable.Constraint_layout_goneMarginEnd, 12);
        c.append(R.styleable.Constraint_layout_constraintVertical_weight, 40);
        c.append(R.styleable.Constraint_layout_constraintHorizontal_weight, 39);
        c.append(R.styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        c.append(R.styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        c.append(R.styleable.Constraint_layout_constraintHorizontal_bias, 20);
        c.append(R.styleable.Constraint_layout_constraintVertical_bias, 37);
        c.append(R.styleable.Constraint_layout_constraintDimensionRatio, 5);
        c.append(R.styleable.Constraint_layout_constraintLeft_creator, 82);
        c.append(R.styleable.Constraint_layout_constraintTop_creator, 82);
        c.append(R.styleable.Constraint_layout_constraintRight_creator, 82);
        c.append(R.styleable.Constraint_layout_constraintBottom_creator, 82);
        c.append(R.styleable.Constraint_layout_constraintBaseline_creator, 82);
        c.append(R.styleable.Constraint_android_layout_marginLeft, 24);
        c.append(R.styleable.Constraint_android_layout_marginRight, 28);
        c.append(R.styleable.Constraint_android_layout_marginStart, 31);
        c.append(R.styleable.Constraint_android_layout_marginEnd, 8);
        c.append(R.styleable.Constraint_android_layout_marginTop, 34);
        c.append(R.styleable.Constraint_android_layout_marginBottom, 2);
        c.append(R.styleable.Constraint_android_layout_width, 23);
        c.append(R.styleable.Constraint_android_layout_height, 21);
        c.append(R.styleable.Constraint_android_visibility, 22);
        c.append(R.styleable.Constraint_android_alpha, 43);
        c.append(R.styleable.Constraint_android_elevation, 44);
        c.append(R.styleable.Constraint_android_rotationX, 45);
        c.append(R.styleable.Constraint_android_rotationY, 46);
        c.append(R.styleable.Constraint_android_rotation, 60);
        c.append(R.styleable.Constraint_android_scaleX, 47);
        c.append(R.styleable.Constraint_android_scaleY, 48);
        c.append(R.styleable.Constraint_android_transformPivotX, 49);
        c.append(R.styleable.Constraint_android_transformPivotY, 50);
        c.append(R.styleable.Constraint_android_translationX, 51);
        c.append(R.styleable.Constraint_android_translationY, 52);
        c.append(R.styleable.Constraint_android_translationZ, 53);
        c.append(R.styleable.Constraint_layout_constraintWidth_default, 54);
        c.append(R.styleable.Constraint_layout_constraintHeight_default, 55);
        c.append(R.styleable.Constraint_layout_constraintWidth_max, 56);
        c.append(R.styleable.Constraint_layout_constraintHeight_max, 57);
        c.append(R.styleable.Constraint_layout_constraintWidth_min, 58);
        c.append(R.styleable.Constraint_layout_constraintHeight_min, 59);
        c.append(R.styleable.Constraint_layout_constraintCircle, 61);
        c.append(R.styleable.Constraint_layout_constraintCircleRadius, 62);
        c.append(R.styleable.Constraint_layout_constraintCircleAngle, 63);
        c.append(R.styleable.Constraint_animate_relativeTo, 64);
        c.append(R.styleable.Constraint_transitionEasing, 65);
        c.append(R.styleable.Constraint_drawPath, 66);
        c.append(R.styleable.Constraint_transitionPathRotate, 67);
        c.append(R.styleable.Constraint_motionStagger, 79);
        c.append(R.styleable.Constraint_android_id, 38);
        c.append(R.styleable.Constraint_motionProgress, 68);
        c.append(R.styleable.Constraint_layout_constraintWidth_percent, 69);
        c.append(R.styleable.Constraint_layout_constraintHeight_percent, 70);
        c.append(R.styleable.Constraint_chainUseRtl, 71);
        c.append(R.styleable.Constraint_barrierDirection, 72);
        c.append(R.styleable.Constraint_barrierMargin, 73);
        c.append(R.styleable.Constraint_constraint_referenced_ids, 74);
        c.append(R.styleable.Constraint_barrierAllowsGoneWidgets, 75);
        c.append(R.styleable.Constraint_pathMotionArc, 76);
        c.append(R.styleable.Constraint_layout_constraintTag, 77);
        c.append(R.styleable.Constraint_visibilityMode, 78);
        c.append(R.styleable.Constraint_layout_constrainedWidth, 80);
        c.append(R.styleable.Constraint_layout_constrainedHeight, 81);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    private a a(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Constraint);
        a(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private void a(Context context, a aVar, TypedArray typedArray) {
        C0003c c0003c;
        String str;
        StringBuilder sb;
        String str2;
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != R.styleable.Constraint_android_id && R.styleable.Constraint_android_layout_marginStart != index && R.styleable.Constraint_android_layout_marginEnd != index) {
                aVar.b.f1060a = true;
                aVar.c.b = true;
                aVar.f1058a.f1061a = true;
                aVar.e.f1062a = true;
            }
            switch (c.get(index)) {
                case 1:
                    aVar.c.p = a(typedArray, index, aVar.c.p);
                    continue;
                case 2:
                    aVar.c.G = typedArray.getDimensionPixelSize(index, aVar.c.G);
                    continue;
                case 3:
                    aVar.c.o = a(typedArray, index, aVar.c.o);
                    continue;
                case 4:
                    aVar.c.n = a(typedArray, index, aVar.c.n);
                    continue;
                case 5:
                    aVar.c.w = typedArray.getString(index);
                    continue;
                case 6:
                    aVar.c.A = typedArray.getDimensionPixelOffset(index, aVar.c.A);
                    continue;
                case 7:
                    aVar.c.B = typedArray.getDimensionPixelOffset(index, aVar.c.B);
                    continue;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        aVar.c.H = typedArray.getDimensionPixelSize(index, aVar.c.H);
                    } else {
                        continue;
                    }
                case 9:
                    aVar.c.t = a(typedArray, index, aVar.c.t);
                    continue;
                case 10:
                    aVar.c.s = a(typedArray, index, aVar.c.s);
                    continue;
                case 11:
                    aVar.c.M = typedArray.getDimensionPixelSize(index, aVar.c.M);
                    continue;
                case 12:
                    aVar.c.N = typedArray.getDimensionPixelSize(index, aVar.c.N);
                    continue;
                case 13:
                    aVar.c.J = typedArray.getDimensionPixelSize(index, aVar.c.J);
                    continue;
                case 14:
                    aVar.c.L = typedArray.getDimensionPixelSize(index, aVar.c.L);
                    continue;
                case 15:
                    aVar.c.O = typedArray.getDimensionPixelSize(index, aVar.c.O);
                    continue;
                case 16:
                    aVar.c.K = typedArray.getDimensionPixelSize(index, aVar.c.K);
                    continue;
                case 17:
                    aVar.c.e = typedArray.getDimensionPixelOffset(index, aVar.c.e);
                    continue;
                case 18:
                    aVar.c.f = typedArray.getDimensionPixelOffset(index, aVar.c.f);
                    continue;
                case 19:
                    aVar.c.g = typedArray.getFloat(index, aVar.c.g);
                    continue;
                case 20:
                    aVar.c.u = typedArray.getFloat(index, aVar.c.u);
                    continue;
                case 21:
                    aVar.c.d = typedArray.getLayoutDimension(index, aVar.c.d);
                    continue;
                case 22:
                    aVar.f1058a.b = typedArray.getInt(index, aVar.f1058a.b);
                    aVar.f1058a.b = f1057a[aVar.f1058a.b];
                    continue;
                case 23:
                    aVar.c.c = typedArray.getLayoutDimension(index, aVar.c.c);
                    continue;
                case 24:
                    aVar.c.D = typedArray.getDimensionPixelSize(index, aVar.c.D);
                    continue;
                case 25:
                    aVar.c.h = a(typedArray, index, aVar.c.h);
                    continue;
                case 26:
                    aVar.c.i = a(typedArray, index, aVar.c.i);
                    continue;
                case 27:
                    aVar.c.C = typedArray.getInt(index, aVar.c.C);
                    continue;
                case 28:
                    aVar.c.E = typedArray.getDimensionPixelSize(index, aVar.c.E);
                    continue;
                case 29:
                    aVar.c.j = a(typedArray, index, aVar.c.j);
                    continue;
                case 30:
                    aVar.c.k = a(typedArray, index, aVar.c.k);
                    continue;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        aVar.c.I = typedArray.getDimensionPixelSize(index, aVar.c.I);
                    } else {
                        continue;
                    }
                case 32:
                    aVar.c.q = a(typedArray, index, aVar.c.q);
                    continue;
                case 33:
                    aVar.c.r = a(typedArray, index, aVar.c.r);
                    continue;
                case 34:
                    aVar.c.F = typedArray.getDimensionPixelSize(index, aVar.c.F);
                    continue;
                case 35:
                    aVar.c.m = a(typedArray, index, aVar.c.m);
                    continue;
                case 36:
                    aVar.c.l = a(typedArray, index, aVar.c.l);
                    continue;
                case 37:
                    aVar.c.v = typedArray.getFloat(index, aVar.c.v);
                    continue;
                case 38:
                    aVar.d = typedArray.getResourceId(index, aVar.d);
                    continue;
                case 39:
                    aVar.c.Q = typedArray.getFloat(index, aVar.c.Q);
                    continue;
                case 40:
                    aVar.c.P = typedArray.getFloat(index, aVar.c.P);
                    continue;
                case 41:
                    aVar.c.R = typedArray.getInt(index, aVar.c.R);
                    continue;
                case 42:
                    aVar.c.S = typedArray.getInt(index, aVar.c.S);
                    continue;
                case 43:
                    aVar.f1058a.d = typedArray.getFloat(index, aVar.f1058a.d);
                    continue;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        aVar.e.l = true;
                        aVar.e.m = typedArray.getDimension(index, aVar.e.m);
                    } else {
                        continue;
                    }
                case 45:
                    aVar.e.c = typedArray.getFloat(index, aVar.e.c);
                    continue;
                case 46:
                    aVar.e.d = typedArray.getFloat(index, aVar.e.d);
                    continue;
                case 47:
                    aVar.e.e = typedArray.getFloat(index, aVar.e.e);
                    continue;
                case 48:
                    aVar.e.f = typedArray.getFloat(index, aVar.e.f);
                    continue;
                case 49:
                    aVar.e.g = typedArray.getDimension(index, aVar.e.g);
                    continue;
                case 50:
                    aVar.e.h = typedArray.getDimension(index, aVar.e.h);
                    continue;
                case 51:
                    aVar.e.i = typedArray.getDimension(index, aVar.e.i);
                    continue;
                case 52:
                    aVar.e.j = typedArray.getDimension(index, aVar.e.j);
                    continue;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        aVar.e.k = typedArray.getDimension(index, aVar.e.k);
                    } else {
                        continue;
                    }
                case 54:
                    aVar.c.T = typedArray.getInt(index, aVar.c.T);
                    continue;
                case 55:
                    aVar.c.U = typedArray.getInt(index, aVar.c.U);
                    continue;
                case 56:
                    aVar.c.V = typedArray.getDimensionPixelSize(index, aVar.c.V);
                    continue;
                case 57:
                    aVar.c.W = typedArray.getDimensionPixelSize(index, aVar.c.W);
                    continue;
                case 58:
                    aVar.c.X = typedArray.getDimensionPixelSize(index, aVar.c.X);
                    continue;
                case 59:
                    aVar.c.Y = typedArray.getDimensionPixelSize(index, aVar.c.Y);
                    continue;
                case 60:
                    aVar.e.b = typedArray.getFloat(index, aVar.e.b);
                    continue;
                case 61:
                    aVar.c.x = a(typedArray, index, aVar.c.x);
                    continue;
                case 62:
                    aVar.c.y = typedArray.getDimensionPixelSize(index, aVar.c.y);
                    continue;
                case 63:
                    aVar.c.z = typedArray.getFloat(index, aVar.c.z);
                    continue;
                case 64:
                    aVar.b.b = a(typedArray, index, aVar.b.b);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0003c = aVar.b;
                        str = typedArray.getString(index);
                    } else {
                        c0003c = aVar.b;
                        str = iee.c[typedArray.getInteger(index, 0)];
                    }
                    c0003c.c = str;
                    continue;
                case 66:
                    aVar.b.e = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    aVar.b.g = typedArray.getFloat(index, aVar.b.g);
                    continue;
                case 68:
                    aVar.f1058a.e = typedArray.getFloat(index, aVar.f1058a.e);
                    continue;
                case 69:
                    aVar.c.Z = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.c.aa = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    aVar.c.ab = typedArray.getInt(index, aVar.c.ab);
                    continue;
                case 73:
                    aVar.c.ac = typedArray.getDimensionPixelSize(index, aVar.c.ac);
                    continue;
                case 74:
                    aVar.c.af = typedArray.getString(index);
                    continue;
                case 75:
                    aVar.c.aj = typedArray.getBoolean(index, aVar.c.aj);
                    continue;
                case 76:
                    aVar.b.d = typedArray.getInt(index, aVar.b.d);
                    continue;
                case 77:
                    aVar.c.ag = typedArray.getString(index);
                    continue;
                case 78:
                    aVar.f1058a.c = typedArray.getInt(index, aVar.f1058a.c);
                    continue;
                case 79:
                    aVar.b.f = typedArray.getFloat(index, aVar.b.f);
                    continue;
                case 80:
                    aVar.c.ah = typedArray.getBoolean(index, aVar.c.ah);
                    continue;
                case 81:
                    aVar.c.ai = typedArray.getBoolean(index, aVar.c.ai);
                    continue;
                case 82:
                    sb = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
            }
            sb.append(str2);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(c.get(index));
            sb.toString();
        }
    }

    private int[] a(View view, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = R.id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    private a g(int i) {
        if (!this.b.containsKey(Integer.valueOf(i))) {
            this.b.put(Integer.valueOf(i), new a());
        }
        return this.b.get(Integer.valueOf(i));
    }

    private String h(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public a a(int i) {
        return g(i);
    }

    public void a(int i, int i2) {
        if (this.b.containsKey(Integer.valueOf(i))) {
            a aVar = this.b.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    aVar.c.i = -1;
                    aVar.c.h = -1;
                    aVar.c.D = -1;
                    aVar.c.J = -1;
                    return;
                case 2:
                    aVar.c.k = -1;
                    aVar.c.j = -1;
                    aVar.c.E = -1;
                    aVar.c.L = -1;
                    return;
                case 3:
                    aVar.c.m = -1;
                    aVar.c.l = -1;
                    aVar.c.F = -1;
                    aVar.c.K = -1;
                    return;
                case 4:
                    aVar.c.n = -1;
                    aVar.c.o = -1;
                    aVar.c.G = -1;
                    aVar.c.M = -1;
                    return;
                case 5:
                    aVar.c.p = -1;
                    return;
                case 6:
                    aVar.c.q = -1;
                    aVar.c.r = -1;
                    aVar.c.I = -1;
                    aVar.c.O = -1;
                    return;
                case 7:
                    aVar.c.s = -1;
                    aVar.c.t = -1;
                    aVar.c.H = -1;
                    aVar.c.N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void a(int i, int i2, int i3, int i4, int i5) {
        if (!this.b.containsKey(Integer.valueOf(i))) {
            this.b.put(Integer.valueOf(i), new a());
        }
        a aVar = this.b.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    aVar.c.h = i3;
                    aVar.c.i = -1;
                } else if (i4 != 2) {
                    throw new IllegalArgumentException("Left to " + h(i4) + " undefined");
                } else {
                    aVar.c.i = i3;
                    aVar.c.h = -1;
                }
                aVar.c.D = i5;
                return;
            case 2:
                if (i4 == 1) {
                    aVar.c.j = i3;
                    aVar.c.k = -1;
                } else if (i4 != 2) {
                    throw new IllegalArgumentException("right to " + h(i4) + " undefined");
                } else {
                    aVar.c.k = i3;
                    aVar.c.j = -1;
                }
                aVar.c.E = i5;
                return;
            case 3:
                if (i4 == 3) {
                    aVar.c.l = i3;
                    aVar.c.m = -1;
                } else if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + h(i4) + " undefined");
                } else {
                    aVar.c.m = i3;
                    aVar.c.l = -1;
                }
                aVar.c.p = -1;
                aVar.c.F = i5;
                return;
            case 4:
                if (i4 == 4) {
                    aVar.c.o = i3;
                    aVar.c.n = -1;
                } else if (i4 != 3) {
                    throw new IllegalArgumentException("right to " + h(i4) + " undefined");
                } else {
                    aVar.c.n = i3;
                    aVar.c.o = -1;
                }
                aVar.c.p = -1;
                aVar.c.G = i5;
                return;
            case 5:
                if (i4 != 5) {
                    throw new IllegalArgumentException("right to " + h(i4) + " undefined");
                }
                aVar.c.p = i3;
                aVar.c.o = -1;
                aVar.c.n = -1;
                aVar.c.l = -1;
                aVar.c.m = -1;
                return;
            case 6:
                if (i4 == 6) {
                    aVar.c.r = i3;
                    aVar.c.q = -1;
                } else if (i4 != 7) {
                    throw new IllegalArgumentException("right to " + h(i4) + " undefined");
                } else {
                    aVar.c.q = i3;
                    aVar.c.r = -1;
                }
                aVar.c.I = i5;
                return;
            case 7:
                if (i4 == 7) {
                    aVar.c.t = i3;
                    aVar.c.s = -1;
                } else if (i4 != 6) {
                    throw new IllegalArgumentException("right to " + h(i4) + " undefined");
                } else {
                    aVar.c.s = i3;
                    aVar.c.t = -1;
                }
                aVar.c.H = i5;
                return;
            default:
                throw new IllegalArgumentException(h(i2) + " to " + h(i4) + " unknown");
        }
    }

    public void a(int i, ConstraintLayout.LayoutParams layoutParams) {
        if (this.b.containsKey(Integer.valueOf(i))) {
            this.b.get(Integer.valueOf(i)).a(layoutParams);
        }
    }

    public void a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    a a2 = a(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        a2.c.f1059a = true;
                    }
                    this.b.put(Integer.valueOf(a2.d), a2);
                    continue;
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017c, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.c.a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void a(ConstraintHelper constraintHelper, ConstraintWidget constraintWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        int id = constraintHelper.getId();
        if (this.b.containsKey(Integer.valueOf(id))) {
            a aVar = this.b.get(Integer.valueOf(id));
            if (!(constraintWidget instanceof android.support.constraint.solver.widgets.f)) {
                return;
            }
            constraintHelper.loadParameters(aVar, (android.support.constraint.solver.widgets.f) constraintWidget, layoutParams, sparseArray);
        }
    }

    public void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.b.containsKey(Integer.valueOf(id))) {
                this.b.put(Integer.valueOf(id), new a());
            }
            a aVar = this.b.get(Integer.valueOf(id));
            if (!aVar.c.b) {
                aVar.a(id, layoutParams);
                if (childAt instanceof ConstraintHelper) {
                    aVar.c.ae = ((ConstraintHelper) childAt).getReferencedIds();
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar.c.aj = barrier.allowsGoneWidget();
                        aVar.c.ab = barrier.getType();
                        aVar.c.ac = barrier.getMargin();
                    }
                }
                aVar.c.b = true;
            }
            if (!aVar.f1058a.f1061a) {
                aVar.f1058a.b = childAt.getVisibility();
                aVar.f1058a.d = childAt.getAlpha();
                aVar.f1058a.f1061a = true;
            }
            if (Build.VERSION.SDK_INT >= 17 && !aVar.e.f1062a) {
                aVar.e.f1062a = true;
                aVar.e.b = childAt.getRotation();
                aVar.e.c = childAt.getRotationX();
                aVar.e.d = childAt.getRotationY();
                aVar.e.e = childAt.getScaleX();
                aVar.e.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != mto.a.GEO_NOT_SUPPORT || pivotY != mto.a.GEO_NOT_SUPPORT) {
                    aVar.e.g = pivotX;
                    aVar.e.h = pivotY;
                }
                aVar.e.i = childAt.getTranslationX();
                aVar.e.j = childAt.getTranslationY();
                if (Build.VERSION.SDK_INT >= 21) {
                    aVar.e.k = childAt.getTranslationZ();
                    if (aVar.e.l) {
                        aVar.e.m = childAt.getElevation();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ConstraintLayout constraintLayout, boolean z) {
        StringBuilder sb;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.b.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.b.containsKey(Integer.valueOf(id))) {
                sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(android.support.constraint.motion.a.a(childAt));
            } else if (this.f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1) {
                    if (this.b.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.b.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            aVar.c.ad = 1;
                        }
                        if (aVar.c.ad != -1 && aVar.c.ad == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.c.ab);
                            barrier.setMargin(aVar.c.ac);
                            barrier.setAllowsGoneWidget(aVar.c.aj);
                            if (aVar.c.ae != null) {
                                barrier.setReferencedIds(aVar.c.ae);
                            } else if (aVar.c.af != null) {
                                aVar.c.ae = a(barrier, aVar.c.af);
                                barrier.setReferencedIds(aVar.c.ae);
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.a();
                        aVar.a(layoutParams);
                        if (z) {
                            ConstraintAttribute.a(childAt, aVar.f);
                        }
                        childAt.setLayoutParams(layoutParams);
                        if (aVar.f1058a.c == 0) {
                            childAt.setVisibility(aVar.f1058a.b);
                        }
                        if (Build.VERSION.SDK_INT >= 17) {
                            childAt.setAlpha(aVar.f1058a.d);
                            childAt.setRotation(aVar.e.b);
                            childAt.setRotationX(aVar.e.c);
                            childAt.setRotationY(aVar.e.d);
                            childAt.setScaleX(aVar.e.e);
                            childAt.setScaleY(aVar.e.f);
                            if (!Float.isNaN(aVar.e.g)) {
                                childAt.setPivotX(aVar.e.g);
                            }
                            if (!Float.isNaN(aVar.e.h)) {
                                childAt.setPivotY(aVar.e.h);
                            }
                            childAt.setTranslationX(aVar.e.i);
                            childAt.setTranslationY(aVar.e.j);
                            if (Build.VERSION.SDK_INT >= 21) {
                                childAt.setTranslationZ(aVar.e.k);
                                if (aVar.e.l) {
                                    childAt.setElevation(aVar.e.m);
                                }
                            }
                        }
                    } else {
                        sb = new StringBuilder();
                        sb.append("WARNING NO CONSTRAINTS for view ");
                        sb.append(id);
                    }
                }
            }
            sb.toString();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.b.get(num);
            if (aVar2.c.ad != -1 && aVar2.c.ad == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                if (aVar2.c.ae != null) {
                    barrier2.setReferencedIds(aVar2.c.ae);
                } else if (aVar2.c.af != null) {
                    aVar2.c.ae = a(barrier2, aVar2.c.af);
                    barrier2.setReferencedIds(aVar2.c.ae);
                }
                barrier2.setType(aVar2.c.ab);
                barrier2.setMargin(aVar2.c.ac);
                ConstraintLayout.LayoutParams mo0generateDefaultLayoutParams = constraintLayout.mo0generateDefaultLayoutParams();
                barrier2.validateParams();
                aVar2.a(mo0generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, mo0generateDefaultLayoutParams);
            }
            if (aVar2.c.f1059a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams mo0generateDefaultLayoutParams2 = constraintLayout.mo0generateDefaultLayoutParams();
                aVar2.a(mo0generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, mo0generateDefaultLayoutParams2);
            }
        }
    }

    public void a(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.b.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraints.getChildAt(i);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.b.containsKey(Integer.valueOf(id))) {
                this.b.put(Integer.valueOf(id), new a());
            }
            a aVar = this.b.get(Integer.valueOf(id));
            if (childAt instanceof ConstraintHelper) {
                aVar.a((ConstraintHelper) childAt, id, layoutParams);
            }
            aVar.a(id, layoutParams);
        }
    }

    public void a(c cVar) {
        for (Integer num : cVar.b.keySet()) {
            int intValue = num.intValue();
            a aVar = cVar.b.get(num);
            if (!this.b.containsKey(Integer.valueOf(intValue))) {
                this.b.put(Integer.valueOf(intValue), new a());
            }
            a aVar2 = this.b.get(Integer.valueOf(intValue));
            if (!aVar2.c.b) {
                aVar2.c.a(aVar.c);
            }
            if (!aVar2.f1058a.f1061a) {
                aVar2.f1058a.a(aVar.f1058a);
            }
            if (!aVar2.e.f1062a) {
                aVar2.e.a(aVar.e);
            }
            if (!aVar2.b.f1060a) {
                aVar2.b.a(aVar.b);
            }
            for (String str : aVar.f.keySet()) {
                if (!aVar2.f.containsKey(str)) {
                    aVar2.f.put(str, aVar.f.get(str));
                }
            }
        }
    }

    public void a(boolean z) {
        this.f = z;
    }

    public int[] a() {
        Integer[] numArr = (Integer[]) this.b.keySet().toArray(new Integer[0]);
        int[] iArr = new int[numArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public int b(int i) {
        return g(i).f1058a.c;
    }

    public void b(Context context, int i) {
        b((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public void b(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.b.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.b.containsKey(Integer.valueOf(id))) {
                this.b.put(Integer.valueOf(id), new a());
            }
            a aVar = this.b.get(Integer.valueOf(id));
            aVar.f = ConstraintAttribute.a(this.e, childAt);
            aVar.a(id, layoutParams);
            aVar.f1058a.b = childAt.getVisibility();
            if (Build.VERSION.SDK_INT >= 17) {
                aVar.f1058a.d = childAt.getAlpha();
                aVar.e.b = childAt.getRotation();
                aVar.e.c = childAt.getRotationX();
                aVar.e.d = childAt.getRotationY();
                aVar.e.e = childAt.getScaleX();
                aVar.e.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != mto.a.GEO_NOT_SUPPORT || pivotY != mto.a.GEO_NOT_SUPPORT) {
                    aVar.e.g = pivotX;
                    aVar.e.h = pivotY;
                }
                aVar.e.i = childAt.getTranslationX();
                aVar.e.j = childAt.getTranslationY();
                if (Build.VERSION.SDK_INT >= 21) {
                    aVar.e.k = childAt.getTranslationZ();
                    if (aVar.e.l) {
                        aVar.e.m = childAt.getElevation();
                    }
                }
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.c.aj = barrier.allowsGoneWidget();
                aVar.c.ae = barrier.getReferencedIds();
                aVar.c.ab = barrier.getType();
                aVar.c.ac = barrier.getMargin();
            }
        }
    }

    public void b(boolean z) {
        this.d = z;
    }

    public int c(int i) {
        return g(i).f1058a.b;
    }

    public void c(ConstraintLayout constraintLayout) {
        a(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public int d(int i) {
        return g(i).c.d;
    }

    public void d(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.b.containsKey(Integer.valueOf(id))) {
                String str = "id unknown " + android.support.constraint.motion.a.a(childAt);
            } else if (this.f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (this.b.containsKey(Integer.valueOf(id))) {
                    ConstraintAttribute.a(childAt, this.b.get(Integer.valueOf(id)).f);
                }
            }
        }
    }

    public int e(int i) {
        return g(i).c.c;
    }

    public a f(int i) {
        if (this.b.containsKey(Integer.valueOf(i))) {
            return this.b.get(Integer.valueOf(i));
        }
        return null;
    }
}
