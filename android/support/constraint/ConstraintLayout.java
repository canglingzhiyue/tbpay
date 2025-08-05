package android.support.constraint;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.constraint.solver.widgets.ConstraintWidget;
import android.support.constraint.solver.widgets.analyzer.b;
import android.support.constraint.solver.widgets.g;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.0.4";
    SparseArray<View> mChildrenByIds;
    private ArrayList<ConstraintHelper> mConstraintHelpers;
    protected d mConstraintLayoutSpec;
    private c mConstraintSet;
    private int mConstraintSetId;
    private e mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected android.support.constraint.solver.widgets.e mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    a mMeasurer;
    private android.support.constraint.solver.f mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget;

    /* renamed from: android.support.constraint.ConstraintLayout$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1054a = new int[ConstraintWidget.DimensionBehaviour.values().length];

        static {
            try {
                f1054a[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1054a[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1054a[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1054a[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int BASELINE = 5;
        public static final int BOTTOM = 4;
        public static final int CHAIN_PACKED = 2;
        public static final int CHAIN_SPREAD = 0;
        public static final int CHAIN_SPREAD_INSIDE = 1;
        public static final int END = 7;
        public static final int HORIZONTAL = 0;
        public static final int LEFT = 1;
        public static final int MATCH_CONSTRAINT = 0;
        public static final int MATCH_CONSTRAINT_PERCENT = 2;
        public static final int MATCH_CONSTRAINT_SPREAD = 0;
        public static final int MATCH_CONSTRAINT_WRAP = 1;
        public static final int PARENT_ID = 0;
        public static final int RIGHT = 2;
        public static final int START = 6;
        public static final int TOP = 3;
        public static final int UNSET = -1;
        public static final int VERTICAL = 1;
        public float A;
        public String B;
        float C;
        int D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public float O;
        public float P;
        public int Q;
        public int R;
        public int S;
        public boolean T;
        public boolean U;
        boolean V;
        boolean W;
        boolean X;
        boolean Y;
        boolean Z;

        /* renamed from: a  reason: collision with root package name */
        public int f1055a;
        public String aA;
        boolean aB;
        boolean aa;
        int ab;
        int ac;
        int ad;
        int ae;
        int af;
        int ag;
        float ah;
        int ai;
        int aj;
        float ak;
        ConstraintWidget al;
        public boolean am;
        public int b;
        public float c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public float o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public float z;

        /* loaded from: classes2.dex */
        private static class a {
            public static final int ANDROID_ORIENTATION = 1;
            public static final int LAYOUT_CONSTRAINED_HEIGHT = 28;
            public static final int LAYOUT_CONSTRAINED_WIDTH = 27;
            public static final int LAYOUT_CONSTRAINT_BASELINE_CREATOR = 43;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BASELINE_OF = 16;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_CREATOR = 42;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_BOTTOM_OF = 15;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_TOP_OF = 14;
            public static final int LAYOUT_CONSTRAINT_CIRCLE = 2;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_ANGLE = 4;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_RADIUS = 3;
            public static final int LAYOUT_CONSTRAINT_DIMENSION_RATIO = 44;
            public static final int LAYOUT_CONSTRAINT_END_TO_END_OF = 20;
            public static final int LAYOUT_CONSTRAINT_END_TO_START_OF = 19;
            public static final int LAYOUT_CONSTRAINT_GUIDE_BEGIN = 5;
            public static final int LAYOUT_CONSTRAINT_GUIDE_END = 6;
            public static final int LAYOUT_CONSTRAINT_GUIDE_PERCENT = 7;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_DEFAULT = 32;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MAX = 37;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MIN = 36;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_PERCENT = 38;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_BIAS = 29;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_CHAINSTYLE = 47;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_WEIGHT = 45;
            public static final int LAYOUT_CONSTRAINT_LEFT_CREATOR = 39;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_LEFT_OF = 8;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_RIGHT_OF = 9;
            public static final int LAYOUT_CONSTRAINT_RIGHT_CREATOR = 41;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_LEFT_OF = 10;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_RIGHT_OF = 11;
            public static final int LAYOUT_CONSTRAINT_START_TO_END_OF = 17;
            public static final int LAYOUT_CONSTRAINT_START_TO_START_OF = 18;
            public static final int LAYOUT_CONSTRAINT_TAG = 51;
            public static final int LAYOUT_CONSTRAINT_TOP_CREATOR = 40;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_BOTTOM_OF = 13;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_TOP_OF = 12;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_BIAS = 30;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE = 48;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_WEIGHT = 46;
            public static final int LAYOUT_CONSTRAINT_WIDTH_DEFAULT = 31;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MAX = 34;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MIN = 33;
            public static final int LAYOUT_CONSTRAINT_WIDTH_PERCENT = 35;
            public static final int LAYOUT_EDITOR_ABSOLUTEX = 49;
            public static final int LAYOUT_EDITOR_ABSOLUTEY = 50;
            public static final int LAYOUT_GONE_MARGIN_BOTTOM = 24;
            public static final int LAYOUT_GONE_MARGIN_END = 26;
            public static final int LAYOUT_GONE_MARGIN_LEFT = 21;
            public static final int LAYOUT_GONE_MARGIN_RIGHT = 23;
            public static final int LAYOUT_GONE_MARGIN_START = 25;
            public static final int LAYOUT_GONE_MARGIN_TOP = 22;
            public static final int UNUSED = 0;
            public static final SparseIntArray map;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                map = sparseIntArray;
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                map.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                map.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                map.append(R.styleable.ConstraintLayout_Layout_android_orientation, 1);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                map.append(R.styleable.ConstraintLayout_Layout_layout_constraintTag, 51);
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f1055a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.aA = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.aa = false;
            this.aB = false;
            this.ab = -1;
            this.ac = -1;
            this.ad = -1;
            this.ae = -1;
            this.af = -1;
            this.ag = -1;
            this.ah = 0.5f;
            this.al = new ConstraintWidget();
            this.am = false;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            int i;
            float parseFloat;
            this.f1055a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.aA = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.aa = false;
            this.aB = false;
            this.ab = -1;
            this.ac = -1;
            this.ad = -1;
            this.ae = -1;
            this.af = -1;
            this.ag = -1;
            this.ah = 0.5f;
            this.al = new ConstraintWidget();
            this.am = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = a.map.get(index);
                switch (i3) {
                    case 0:
                    case 1:
                        this.S = obtainStyledAttributes.getInt(index, this.S);
                        continue;
                    case 2:
                        this.m = obtainStyledAttributes.getResourceId(index, this.m);
                        if (this.m == -1) {
                            this.m = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.n = obtainStyledAttributes.getDimensionPixelSize(index, this.n);
                        continue;
                    case 4:
                        this.o = obtainStyledAttributes.getFloat(index, this.o) % 360.0f;
                        float f = this.o;
                        if (f < 0.0f) {
                            this.o = (360.0f - f) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f1055a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1055a);
                        continue;
                    case 6:
                        this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        continue;
                    case 7:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        continue;
                    case 8:
                        this.d = obtainStyledAttributes.getResourceId(index, this.d);
                        if (this.d == -1) {
                            this.d = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        this.e = obtainStyledAttributes.getResourceId(index, this.e);
                        if (this.e == -1) {
                            this.e = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        this.f = obtainStyledAttributes.getResourceId(index, this.f);
                        if (this.f == -1) {
                            this.f = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        this.g = obtainStyledAttributes.getResourceId(index, this.g);
                        if (this.g == -1) {
                            this.g = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        this.h = obtainStyledAttributes.getResourceId(index, this.h);
                        if (this.h == -1) {
                            this.h = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        this.i = obtainStyledAttributes.getResourceId(index, this.i);
                        if (this.i == -1) {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        this.j = obtainStyledAttributes.getResourceId(index, this.j);
                        if (this.j == -1) {
                            this.j = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        this.k = obtainStyledAttributes.getResourceId(index, this.k);
                        if (this.k == -1) {
                            this.k = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        this.l = obtainStyledAttributes.getResourceId(index, this.l);
                        if (this.l == -1) {
                            this.l = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        this.p = obtainStyledAttributes.getResourceId(index, this.p);
                        if (this.p == -1) {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        this.q = obtainStyledAttributes.getResourceId(index, this.q);
                        if (this.q == -1) {
                            this.q = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        this.r = obtainStyledAttributes.getResourceId(index, this.r);
                        if (this.r == -1) {
                            this.r = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        this.s = obtainStyledAttributes.getResourceId(index, this.s);
                        if (this.s == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.t = obtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        continue;
                    case 22:
                        this.u = obtainStyledAttributes.getDimensionPixelSize(index, this.u);
                        continue;
                    case 23:
                        this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        continue;
                    case 24:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        continue;
                    case 25:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        continue;
                    case 26:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        continue;
                    case 27:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        continue;
                    case 28:
                        this.U = obtainStyledAttributes.getBoolean(index, this.U);
                        continue;
                    case 29:
                        this.z = obtainStyledAttributes.getFloat(index, this.z);
                        continue;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        continue;
                    case 31:
                        this.I = obtainStyledAttributes.getInt(index, 0);
                        if (this.I == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 32:
                        this.J = obtainStyledAttributes.getInt(index, 0);
                        if (this.J == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 33:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                            }
                        }
                    case 34:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                            }
                        }
                    case 35:
                        this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        continue;
                    case 36:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                            }
                        }
                    case 37:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                    case 38:
                        this.P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.P));
                        this.J = 2;
                        continue;
                    default:
                        switch (i3) {
                            case 44:
                                this.B = obtainStyledAttributes.getString(index);
                                this.C = Float.NaN;
                                this.D = -1;
                                String str2 = this.B;
                                if (str2 != null) {
                                    int length = str2.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.D = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.B.substring(i, indexOf2);
                                        String substring3 = this.B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat2 = Float.parseFloat(substring2);
                                                float parseFloat3 = Float.parseFloat(substring3);
                                                parseFloat = (parseFloat2 > 0.0f && parseFloat3 > 0.0f) ? this.D == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3) : parseFloat;
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.B.substring(i);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            parseFloat = Float.parseFloat(substring4);
                                        }
                                    }
                                    this.C = parseFloat;
                                    break;
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                continue;
                            case 46:
                                this.F = obtainStyledAttributes.getFloat(index, this.F);
                                continue;
                            case 47:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.H = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                continue;
                            case 50:
                                this.R = obtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                                continue;
                            case 51:
                                this.aA = obtainStyledAttributes.getString(index);
                                continue;
                                continue;
                        }
                        break;
                }
                Log.e(ConstraintLayout.TAG, str);
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1055a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.aA = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.aa = false;
            this.aB = false;
            this.ab = -1;
            this.ac = -1;
            this.ad = -1;
            this.ae = -1;
            this.af = -1;
            this.ag = -1;
            this.ah = 0.5f;
            this.al = new ConstraintWidget();
            this.am = false;
        }

        public void a() {
            this.Y = false;
            this.V = true;
            this.W = true;
            if (this.width == -2 && this.T) {
                this.V = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            if (this.height == -2 && this.U) {
                this.W = false;
                if (this.J == 0) {
                    this.J = 1;
                }
            }
            if (this.width == 0 || this.width == -1) {
                this.V = false;
                if (this.width == 0 && this.I == 1) {
                    this.width = -2;
                    this.T = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.W = false;
                if (this.height == 0 && this.J == 1) {
                    this.height = -2;
                    this.U = true;
                }
            }
            if (this.c == -1.0f && this.f1055a == -1 && this.b == -1) {
                return;
            }
            this.Y = true;
            this.V = true;
            this.W = true;
            if (!(this.al instanceof g)) {
                this.al = new g();
            }
            ((g) this.al).a(this.S);
        }

        public ConstraintWidget b() {
            return this.al;
        }

        public String c() {
            return this.aA;
        }

        /* JADX WARN: Code restructure failed: missing block: B:76:0x00dc, code lost:
            if (r1 > 0) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x00de, code lost:
            r6.rightMargin = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x00eb, code lost:
            if (r1 > 0) goto L54;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x00fd  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r7) {
            /*
                Method dump skipped, instructions count: 268
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements b.InterfaceC0007b {

        /* renamed from: a  reason: collision with root package name */
        ConstraintLayout f1056a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;

        public a(ConstraintLayout constraintLayout) {
            this.f1056a = constraintLayout;
        }

        private boolean a(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                return false;
            }
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }

        @Override // android.support.constraint.solver.widgets.analyzer.b.InterfaceC0007b
        public final void a() {
            int childCount = this.f1056a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f1056a.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).updatePostMeasure(this.f1056a);
                }
            }
            int size = this.f1056a.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((ConstraintHelper) this.f1056a.mConstraintHelpers.get(i2)).updatePostMeasure(this.f1056a);
                }
            }
        }

        public void a(int i, int i2, int i3, int i4, int i5, int i6) {
            this.b = i3;
            this.c = i4;
            this.d = i5;
            this.e = i6;
            this.f = i;
            this.g = i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:109:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x01f1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:146:0x01f2  */
        /* JADX WARN: Removed duplicated region for block: B:193:0x029c  */
        /* JADX WARN: Removed duplicated region for block: B:194:0x02a3  */
        /* JADX WARN: Removed duplicated region for block: B:196:0x02a7  */
        /* JADX WARN: Removed duplicated region for block: B:197:0x02ac  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0129  */
        @Override // android.support.constraint.solver.widgets.analyzer.b.InterfaceC0007b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(android.support.constraint.solver.widgets.ConstraintWidget r18, android.support.constraint.solver.widgets.analyzer.b.a r19) {
            /*
                Method dump skipped, instructions count: 754
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.a.a(android.support.constraint.solver.widgets.ConstraintWidget, android.support.constraint.solver.widgets.analyzer.b$a):void");
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new android.support.constraint.solver.widgets.e();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new a(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new android.support.constraint.solver.widgets.e();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new a(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new android.support.constraint.solver.widgets.e();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new a(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new android.support.constraint.solver.widgets.e();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new a(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, i2);
    }

    private int getPaddingWidth() {
        int i = 0;
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        if (Build.VERSION.SDK_INT >= 17) {
            i = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        }
        return i > 0 ? i : max;
    }

    private final ConstraintWidget getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view != null) {
            return ((LayoutParams) view.getLayoutParams()).al;
        }
        return null;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.a(this);
        this.mLayoutWidget.a((b.InterfaceC0007b) this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == R.styleable.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.mConstraintSet = new c();
                        this.mConstraintSet.a(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.a(this.mOptimizationLevel);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ConstraintWidget viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.g();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).a(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                    this.mConstraintSet = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        c cVar = this.mConstraintSet;
        if (cVar != null) {
            cVar.a(this, true);
        }
        this.mLayoutWidget.U();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.mConstraintHelpers.get(i4).updatePreLayout(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).updatePreLayout(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            ConstraintWidget viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                this.mLayoutWidget.b(viewWidget2);
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, layoutParams, this.mTempMapIdToWidget);
            }
        }
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void applyConstraintsFromLayoutParams(boolean r20, android.view.View r21, android.support.constraint.solver.widgets.ConstraintWidget r22, android.support.constraint.ConstraintLayout.LayoutParams r23, android.util.SparseArray<android.support.constraint.solver.widgets.ConstraintWidget> r24) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.applyConstraintsFromLayoutParams(boolean, android.view.View, android.support.constraint.solver.widgets.ConstraintWidget, android.support.constraint.ConstraintLayout$LayoutParams, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).updatePreDraw(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(android.support.constraint.solver.f fVar) {
        this.mMetrics = fVar;
        this.mLayoutWidget.a(fVar);
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams */
    public LayoutParams mo0generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: generateLayoutParams */
    public LayoutParams mo1generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.mDesignIds;
        if (hashMap != null && hashMap.containsKey(str)) {
            return this.mDesignIds.get(str);
        }
        return null;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.b();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view != null) {
            return ((LayoutParams) view.getLayoutParams()).al;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isRtl() {
        if (Build.VERSION.SDK_INT >= 17) {
            if (((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection()) {
                return true;
            }
        }
        return false;
    }

    public void loadLayoutDescription(int i) {
        if (i == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new d(getContext(), this, i);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.al;
            if ((childAt.getVisibility() != 8 || layoutParams.Y || layoutParams.Z || layoutParams.aB || isInEditMode) && !layoutParams.aa) {
                int o = constraintWidget.o();
                int p = constraintWidget.p();
                int q = constraintWidget.q() + o;
                int s = constraintWidget.s() + p;
                childAt.layout(o, p, q, s);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(o, p, q, s);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).updatePostLayout(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                } else if (getChildAt(i3).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (!this.mDirtyHierarchy) {
            if (this.mOnMeasureWidthMeasureSpec != i || this.mOnMeasureHeightMeasureSpec != i2) {
                if (this.mOnMeasureWidthMeasureSpec == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.mOnMeasureHeightMeasureSpec) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= this.mLayoutWidget.s()) {
                    this.mOnMeasureWidthMeasureSpec = i;
                    this.mOnMeasureHeightMeasureSpec = i2;
                }
            }
            resolveMeasuredDimension(i, i2, this.mLayoutWidget.q(), this.mLayoutWidget.s(), this.mLayoutWidget.K(), this.mLayoutWidget.L());
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.a(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                this.mLayoutWidget.h();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.q(), this.mLayoutWidget.s(), this.mLayoutWidget.K(), this.mLayoutWidget.L());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof g)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.al = new g();
            layoutParams.Y = true;
            ((g) layoutParams.al).a(layoutParams.S);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.validateParams();
            ((LayoutParams) view.getLayoutParams()).Z = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.c(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    protected void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new d(getContext(), this, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5 = this.mMeasurer.e;
        int i6 = i3 + this.mMeasurer.d;
        int i7 = i4 + i5;
        if (Build.VERSION.SDK_INT < 11) {
            setMeasuredDimension(i6, i7);
            this.mLastMeasureWidth = i6;
            this.mLastMeasureHeight = i7;
            return;
        }
        int resolveSizeAndState = resolveSizeAndState(i6, i, 0);
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, resolveSizeAndState(i7, i2, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void resolveSystem(android.support.constraint.solver.widgets.e eVar, int i, int i2, int i3) {
        int max;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max2 = Math.max(0, getPaddingTop());
        int max3 = Math.max(0, getPaddingBottom());
        int i4 = max2 + max3;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.a(i2, i3, max2, max3, paddingWidth, i4);
        if (Build.VERSION.SDK_INT >= 17) {
            int max4 = Math.max(0, getPaddingStart());
            int max5 = Math.max(0, getPaddingEnd());
            if (max4 > 0 || max5 > 0) {
                max = isRtl() ? max5 : max4;
                int i5 = size - paddingWidth;
                int i6 = size2 - i4;
                setSelfDimensionBehaviour(eVar, mode, i5, mode2, i6);
                eVar.a(i, mode, i5, mode2, i6, this.mLastMeasureWidth, this.mLastMeasureHeight, max, max2);
            }
        }
        max = Math.max(0, getPaddingLeft());
        int i52 = size - paddingWidth;
        int i62 = size2 - i4;
        setSelfDimensionBehaviour(eVar, mode, i52, mode2, i62);
        eVar.a(i, mode, i52, mode2, i62, this.mLastMeasureWidth, this.mLastMeasureHeight, max, max2);
    }

    public void setConstraintSet(c cVar) {
        this.mConstraintSet = cVar;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i != 0 || !(obj instanceof String) || !(obj2 instanceof Integer)) {
            return;
        }
        if (this.mDesignIds == null) {
            this.mDesignIds = new HashMap<>();
        }
        String str = (String) obj;
        int indexOf = str.indexOf("/");
        if (indexOf != -1) {
            str = str.substring(indexOf + 1);
        }
        this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(e eVar) {
        this.mConstraintsChangedListener = eVar;
        d dVar = this.mConstraintLayoutSpec;
        if (dVar != null) {
            dVar.a(eVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.a(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r4 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        r11 = java.lang.Math.max(0, r8.mMinWidth);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r4 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r4 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        r13 = java.lang.Math.max(0, r8.mMinHeight);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r4 == 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void setSelfDimensionBehaviour(android.support.constraint.solver.widgets.e r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            android.support.constraint.ConstraintLayout$a r0 = r8.mMeasurer
            int r0 = r0.e
            android.support.constraint.ConstraintLayout$a r1 = r8.mMeasurer
            int r1 = r1.d
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            int r4 = r8.getChildCount()
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 0
            if (r10 == r6) goto L2a
            if (r10 == 0) goto L25
            if (r10 == r5) goto L1d
        L1b:
            r11 = 0
            goto L34
        L1d:
            int r10 = r8.mMaxWidth
            int r10 = r10 - r1
            int r11 = java.lang.Math.min(r10, r11)
            goto L34
        L25:
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 != 0) goto L1b
            goto L2e
        L2a:
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 != 0) goto L34
        L2e:
            int r10 = r8.mMinWidth
            int r11 = java.lang.Math.max(r7, r10)
        L34:
            if (r12 == r6) goto L49
            if (r12 == 0) goto L44
            if (r12 == r5) goto L3c
        L3a:
            r13 = 0
            goto L53
        L3c:
            int r10 = r8.mMaxHeight
            int r10 = r10 - r0
            int r13 = java.lang.Math.min(r10, r13)
            goto L53
        L44:
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 != 0) goto L3a
            goto L4d
        L49:
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 != 0) goto L53
        L4d:
            int r10 = r8.mMinHeight
            int r13 = java.lang.Math.max(r7, r10)
        L53:
            int r10 = r9.q()
            if (r11 != r10) goto L5f
            int r10 = r9.s()
            if (r13 == r10) goto L62
        L5f:
            r9.f()
        L62:
            r9.h(r7)
            r9.i(r7)
            int r10 = r8.mMaxWidth
            int r10 = r10 - r1
            r9.c(r10)
            int r10 = r8.mMaxHeight
            int r10 = r10 - r0
            r9.d(r10)
            r9.l(r7)
            r9.m(r7)
            r9.a(r2)
            r9.j(r11)
            r9.b(r3)
            r9.k(r13)
            int r10 = r8.mMinWidth
            int r10 = r10 - r1
            r9.l(r10)
            int r10 = r8.mMinHeight
            int r10 = r10 - r0
            r9.m(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.setSelfDimensionBehaviour(android.support.constraint.solver.widgets.e, int, int, int, int):void");
    }

    public void setState(int i, int i2, int i3) {
        d dVar = this.mConstraintLayoutSpec;
        if (dVar != null) {
            dVar.a(i, i2, i3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
