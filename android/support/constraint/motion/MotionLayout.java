package android.support.constraint.motion;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.Barrier;
import android.support.constraint.ConstraintHelper;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Constraints;
import android.support.constraint.motion.q;
import android.support.constraint.solver.widgets.ConstraintWidget;
import android.support.v4.view.NestedScrollingParent2;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.iex;
import tb.mto;
import tb.riy;

/* loaded from: classes2.dex */
public class MotionLayout extends ConstraintLayout implements NestedScrollingParent2 {
    private static final boolean DEBUG = false;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    private static final float EPSILON = 1.0E-5f;
    public static boolean IS_IN_EDIT_MODE = false;
    static final int MAX_KEY_FRAMES = 50;
    static final String TAG = "MotionLayout";
    public static final int TOUCH_UP_COMPLETE = 0;
    public static final int TOUCH_UP_COMPLETE_TO_END = 2;
    public static final int TOUCH_UP_COMPLETE_TO_START = 1;
    public static final int TOUCH_UP_DECELERATE = 4;
    public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int TOUCH_UP_STOP = 3;
    public static final int VELOCITY_LAYOUT = 1;
    public static final int VELOCITY_POST_LAYOUT = 0;
    public static final int VELOCITY_STATIC_LAYOUT = 3;
    public static final int VELOCITY_STATIC_POST_LAYOUT = 2;
    boolean firstDown;
    private float lastPos;
    private float lastY;
    private long mAnimationStartTime;
    private int mBeginState;
    private RectF mBoundsCheck;
    int mCurrentState;
    int mDebugPath;
    private a mDecelerateLogic;
    private android.support.constraint.motion.b mDesignTool;
    b mDevModeDraw;
    private int mEndState;
    int mEndWrapHeight;
    int mEndWrapWidth;
    HashMap<View, n> mFrameArrayList;
    private int mFrames;
    int mHeightMeasureMode;
    private boolean mInLayout;
    boolean mInTransition;
    boolean mIndirectTransition;
    private boolean mInteractionEnabled;
    Interpolator mInterpolator;
    boolean mIsAnimating;
    private boolean mKeepAnimating;
    private android.support.constraint.motion.e mKeyCache;
    private long mLastDrawTime;
    private float mLastFps;
    private int mLastHeightMeasureSpec;
    int mLastLayoutHeight;
    int mLastLayoutWidth;
    float mLastVelocity;
    private int mLastWidthMeasureSpec;
    private float mListenerPosition;
    private int mListenerState;
    protected boolean mMeasureDuringTransition;
    c mModel;
    private boolean mNeedsFireTransitionCompleted;
    int mOldHeight;
    int mOldWidth;
    private ArrayList<MotionHelper> mOnHideHelpers;
    private ArrayList<MotionHelper> mOnShowHelpers;
    float mPostInterpolationPosition;
    private View mRegionView;
    q mScene;
    float mScrollTargetDT;
    float mScrollTargetDX;
    float mScrollTargetDY;
    long mScrollTargetTime;
    int mStartWrapHeight;
    int mStartWrapWidth;
    private f mStateCache;
    private iex mStopLogic;
    private boolean mTemporalInterpolator;
    ArrayList<Integer> mTransitionCompleted;
    private float mTransitionDuration;
    float mTransitionGoalPosition;
    private boolean mTransitionInstantly;
    float mTransitionLastPosition;
    private long mTransitionLastTime;
    private g mTransitionListener;
    private ArrayList<g> mTransitionListeners;
    float mTransitionPosition;
    TransitionState mTransitionState;
    boolean mUndergoingMotion;
    int mWidthMeasureMode;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.constraint.motion.MotionLayout$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1070a = new int[TransitionState.values().length];

        static {
            try {
                f1070a[TransitionState.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1070a[TransitionState.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1070a[TransitionState.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1070a[TransitionState.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* loaded from: classes2.dex */
    class a extends o {

        /* renamed from: a  reason: collision with root package name */
        float f1071a = 0.0f;
        float b = 0.0f;
        float c;

        a() {
        }

        @Override // android.support.constraint.motion.o
        public float a() {
            return MotionLayout.this.mLastVelocity;
        }

        public void a(float f, float f2, float f3) {
            this.f1071a = f;
            this.b = f2;
            this.c = f3;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            float f3 = this.f1071a;
            if (f3 > 0.0f) {
                float f4 = this.c;
                if (f3 / f4 < f) {
                    f = f3 / f4;
                }
                MotionLayout motionLayout = MotionLayout.this;
                float f5 = this.f1071a;
                float f6 = this.c;
                motionLayout.mLastVelocity = f5 - (f6 * f);
                f2 = (f5 * f) - (((f6 * f) * f) / 2.0f);
            } else {
                float f7 = this.c;
                if ((-f3) / f7 < f) {
                    f = (-f3) / f7;
                }
                MotionLayout motionLayout2 = MotionLayout.this;
                float f8 = this.f1071a;
                float f9 = this.c;
                motionLayout2.mLastVelocity = (f9 * f) + f8;
                f2 = (f8 * f) + (((f9 * f) * f) / 2.0f);
            }
            return f2 + this.b;
        }
    }

    /* loaded from: classes2.dex */
    private class b {

        /* renamed from: a  reason: collision with root package name */
        float[] f1072a;
        int[] b;
        float[] c;
        Path d;
        Paint f;
        Paint g;
        Paint h;
        Paint i;
        DashPathEffect o;
        int p;
        int s;
        private float[] u;
        final int j = -21965;
        final int k = -2067046;
        final int l = -13391360;
        final int m = 1996488704;
        final int n = 10;
        Rect q = new Rect();
        boolean r = false;
        Paint e = new Paint();

        public b() {
            this.s = 1;
            this.e.setAntiAlias(true);
            this.e.setColor(-21965);
            this.e.setStrokeWidth(2.0f);
            this.e.setStyle(Paint.Style.STROKE);
            this.f = new Paint();
            this.f.setAntiAlias(true);
            this.f.setColor(-2067046);
            this.f.setStrokeWidth(2.0f);
            this.f.setStyle(Paint.Style.STROKE);
            this.g = new Paint();
            this.g.setAntiAlias(true);
            this.g.setColor(-13391360);
            this.g.setStrokeWidth(2.0f);
            this.g.setStyle(Paint.Style.STROKE);
            this.h = new Paint();
            this.h.setAntiAlias(true);
            this.h.setColor(-13391360);
            this.h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.u = new float[8];
            this.i = new Paint();
            this.i.setAntiAlias(true);
            this.o = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.g.setPathEffect(this.o);
            this.c = new float[100];
            this.b = new int[50];
            if (this.r) {
                this.e.setStrokeWidth(8.0f);
                this.i.setStrokeWidth(8.0f);
                this.f.setStrokeWidth(8.0f);
                this.s = 4;
            }
        }

        private void a(Canvas canvas) {
            canvas.drawLines(this.f1072a, this.e);
        }

        private void a(Canvas canvas, float f, float f2) {
            float[] fArr = this.f1072a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (hypot * hypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) Math.hypot(f10 - f, f11 - f2);
            String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            a(str, this.h);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.q.width() / 2), -20.0f, this.h);
            canvas.drawLine(f, f2, f10, f11, this.g);
        }

        private void a(Canvas canvas, float f, float f2, float f3, float f4) {
            canvas.drawRect(f, f2, f3, f4, this.g);
            canvas.drawLine(f, f2, f3, f4, this.g);
        }

        private void a(Canvas canvas, float f, float f2, int i, int i2) {
            String str = "" + (((int) ((((f - (i / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i)) + 0.5d)) / 100.0f);
            a(str, this.h);
            canvas.drawText(str, ((f / 2.0f) - (this.q.width() / 2)) + 0.0f, f2 - 20.0f, this.h);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.g);
            String str2 = "" + (((int) ((((f2 - (i2 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i2)) + 0.5d)) / 100.0f);
            a(str2, this.h);
            canvas.drawText(str2, f + 5.0f, 0.0f - ((f2 / 2.0f) - (this.q.height() / 2)), this.h);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.g);
        }

        private void a(Canvas canvas, n nVar) {
            this.d.reset();
            for (int i = 0; i <= 50; i++) {
                nVar.a(i / 50, this.u, 0);
                Path path = this.d;
                float[] fArr = this.u;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.d;
                float[] fArr2 = this.u;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.d;
                float[] fArr3 = this.u;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.d;
                float[] fArr4 = this.u;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.d.close();
            }
            this.e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.d, this.e);
            canvas.translate(-2.0f, -2.0f);
            this.e.setColor(-65536);
            canvas.drawPath(this.d, this.e);
        }

        private void b(Canvas canvas) {
            float[] fArr = this.f1072a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.g);
        }

        private void b(Canvas canvas, float f, float f2) {
            float[] fArr = this.f1072a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f5 - f3)) + 0.5d)) / 100.0f);
            a(str, this.h);
            canvas.drawText(str, ((min2 / 2.0f) - (this.q.width() / 2)) + min, f2 - 20.0f, this.h);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.g);
            String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f6 - f4)) + 0.5d)) / 100.0f);
            a(str2, this.h);
            canvas.drawText(str2, f + 5.0f, max - ((max2 / 2.0f) - (this.q.height() / 2)), this.h);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.g);
        }

        private void b(Canvas canvas, int i, int i2, n nVar) {
            int i3;
            int i4;
            float f;
            float f2;
            int i5;
            if (nVar.f1090a != null) {
                i3 = nVar.f1090a.getWidth();
                i4 = nVar.f1090a.getHeight();
            } else {
                i3 = 0;
                i4 = 0;
            }
            for (int i6 = 1; i6 < i2 - 1; i6++) {
                if (i != 4 || this.b[i6 - 1] != 0) {
                    float[] fArr = this.c;
                    int i7 = i6 << 1;
                    float f3 = fArr[i7];
                    float f4 = fArr[i7 + 1];
                    this.d.reset();
                    this.d.moveTo(f3, f4 + 10.0f);
                    this.d.lineTo(f3 + 10.0f, f4);
                    this.d.lineTo(f3, f4 - 10.0f);
                    this.d.lineTo(f3 - 10.0f, f4);
                    this.d.close();
                    int i8 = i6 - 1;
                    nVar.a(i8);
                    if (i == 4) {
                        int[] iArr = this.b;
                        if (iArr[i8] == 1) {
                            a(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr[i8] == 2) {
                            b(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr[i8] == 3) {
                            i5 = 3;
                            f = f4;
                            f2 = f3;
                            a(canvas, f3 - 0.0f, f4 - 0.0f, i3, i4);
                            canvas.drawPath(this.d, this.i);
                        }
                        f = f4;
                        f2 = f3;
                        i5 = 3;
                        canvas.drawPath(this.d, this.i);
                    } else {
                        f = f4;
                        f2 = f3;
                        i5 = 3;
                    }
                    if (i == 2) {
                        a(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == i5) {
                        b(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == 6) {
                        a(canvas, f2 - 0.0f, f - 0.0f, i3, i4);
                    }
                    canvas.drawPath(this.d, this.i);
                }
            }
            float[] fArr2 = this.f1072a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f);
                float[] fArr3 = this.f1072a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f);
            }
        }

        private void c(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.p; i++) {
                if (this.b[i] == 1) {
                    z = true;
                }
                if (this.b[i] == 2) {
                    z2 = true;
                }
            }
            if (z) {
                b(canvas);
            }
            if (z2) {
                d(canvas);
            }
        }

        private void d(Canvas canvas) {
            float[] fArr = this.f1072a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.g);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.g);
        }

        public void a(Canvas canvas, int i, int i2, n nVar) {
            if (i == 4) {
                c(canvas);
            }
            if (i == 2) {
                b(canvas);
            }
            if (i == 3) {
                d(canvas);
            }
            a(canvas);
            b(canvas, i, i2, nVar);
        }

        public void a(Canvas canvas, HashMap<View, n> hashMap, int i, int i2) {
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            canvas.save();
            if (!MotionLayout.this.isInEditMode() && (i2 & 1) == 2) {
                String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.mEndState) + ":" + MotionLayout.this.getProgress();
                canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.h);
                canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.e);
            }
            for (n nVar : hashMap.values()) {
                int c = nVar.c();
                if (i2 > 0 && c == 0) {
                    c = 1;
                }
                if (c != 0) {
                    this.p = nVar.a(this.c, this.b);
                    if (c > 0) {
                        int i3 = i / 16;
                        float[] fArr = this.f1072a;
                        if (fArr == null || fArr.length != (i3 << 1)) {
                            this.f1072a = new float[i3 << 1];
                            this.d = new Path();
                        }
                        int i4 = this.s;
                        canvas.translate(i4, i4);
                        this.e.setColor(1996488704);
                        this.i.setColor(1996488704);
                        this.f.setColor(1996488704);
                        this.g.setColor(1996488704);
                        nVar.a(this.f1072a, i3);
                        a(canvas, c, this.p, nVar);
                        this.e.setColor(-21965);
                        this.f.setColor(-2067046);
                        this.i.setColor(-2067046);
                        this.g.setColor(-13391360);
                        int i5 = this.s;
                        canvas.translate(-i5, -i5);
                        a(canvas, c, this.p, nVar);
                        if (c == 5) {
                            a(canvas, nVar);
                        }
                    }
                }
            }
            canvas.restore();
        }

        void a(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        android.support.constraint.solver.widgets.e f1073a = new android.support.constraint.solver.widgets.e();
        android.support.constraint.solver.widgets.e b = new android.support.constraint.solver.widgets.e();
        android.support.constraint.c c = null;
        android.support.constraint.c d = null;
        int e;
        int f;

        c() {
        }

        private void a(android.support.constraint.solver.widgets.e eVar, android.support.constraint.c cVar) {
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, eVar);
            sparseArray.put(MotionLayout.this.getId(), eVar);
            Iterator<ConstraintWidget> it = eVar.ae().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                sparseArray.put(((View) next.C()).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = eVar.ae().iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.C();
                cVar.a(view.getId(), layoutParams);
                next2.j(cVar.e(view.getId()));
                next2.k(cVar.d(view.getId()));
                if (view instanceof ConstraintHelper) {
                    cVar.a((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).validateParams();
                    }
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                } else {
                    layoutParams.resolveLayoutDirection(0);
                }
                MotionLayout.this.applyConstraintsFromLayoutParams(false, view, next2, layoutParams, sparseArray);
                next2.e(cVar.b(view.getId()) == 1 ? view.getVisibility() : cVar.c(view.getId()));
            }
            Iterator<ConstraintWidget> it3 = eVar.ae().iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof android.support.constraint.solver.widgets.j) {
                    android.support.constraint.solver.widgets.h hVar = (android.support.constraint.solver.widgets.h) next3;
                    ((ConstraintHelper) next3.C()).updatePreLayout(eVar, hVar, sparseArray);
                    ((android.support.constraint.solver.widgets.j) hVar).j();
                }
            }
        }

        ConstraintWidget a(android.support.constraint.solver.widgets.e eVar, View view) {
            if (eVar.C() == view) {
                return eVar;
            }
            ArrayList<ConstraintWidget> ae = eVar.ae();
            int size = ae.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = ae.get(i);
                if (constraintWidget.C() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        public void a() {
            a(MotionLayout.this.mLastWidthMeasureSpec, MotionLayout.this.mLastHeightMeasureSpec);
            MotionLayout.this.setupMotionViews();
        }

        public void a(int i, int i2) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.mWidthMeasureMode = mode;
            motionLayout.mHeightMeasureMode = mode2;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            if (MotionLayout.this.mCurrentState == MotionLayout.this.getStartState()) {
                MotionLayout.this.resolveSystem(this.b, optimizationLevel, i, i2);
                if (this.c != null) {
                    MotionLayout.this.resolveSystem(this.f1073a, optimizationLevel, i, i2);
                }
            } else {
                if (this.c != null) {
                    MotionLayout.this.resolveSystem(this.f1073a, optimizationLevel, i, i2);
                }
                MotionLayout.this.resolveSystem(this.b, optimizationLevel, i, i2);
            }
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                MotionLayout motionLayout2 = MotionLayout.this;
                motionLayout2.mWidthMeasureMode = mode;
                motionLayout2.mHeightMeasureMode = mode2;
                if (motionLayout2.mCurrentState == MotionLayout.this.getStartState()) {
                    MotionLayout.this.resolveSystem(this.b, optimizationLevel, i, i2);
                    if (this.c != null) {
                        MotionLayout.this.resolveSystem(this.f1073a, optimizationLevel, i, i2);
                    }
                } else {
                    if (this.c != null) {
                        MotionLayout.this.resolveSystem(this.f1073a, optimizationLevel, i, i2);
                    }
                    MotionLayout.this.resolveSystem(this.b, optimizationLevel, i, i2);
                }
                MotionLayout.this.mStartWrapWidth = this.f1073a.q();
                MotionLayout.this.mStartWrapHeight = this.f1073a.s();
                MotionLayout.this.mEndWrapWidth = this.b.q();
                MotionLayout.this.mEndWrapHeight = this.b.s();
                MotionLayout motionLayout3 = MotionLayout.this;
                motionLayout3.mMeasureDuringTransition = (motionLayout3.mStartWrapWidth == MotionLayout.this.mEndWrapWidth && MotionLayout.this.mStartWrapHeight == MotionLayout.this.mEndWrapHeight) ? false : true;
            }
            int i3 = MotionLayout.this.mStartWrapWidth;
            int i4 = MotionLayout.this.mStartWrapHeight;
            if (MotionLayout.this.mWidthMeasureMode == Integer.MIN_VALUE || MotionLayout.this.mWidthMeasureMode == 0) {
                i3 = (int) (MotionLayout.this.mStartWrapWidth + (MotionLayout.this.mPostInterpolationPosition * (MotionLayout.this.mEndWrapWidth - MotionLayout.this.mStartWrapWidth)));
            }
            int i5 = i3;
            if (MotionLayout.this.mHeightMeasureMode == Integer.MIN_VALUE || MotionLayout.this.mHeightMeasureMode == 0) {
                i4 = (int) (MotionLayout.this.mStartWrapHeight + (MotionLayout.this.mPostInterpolationPosition * (MotionLayout.this.mEndWrapHeight - MotionLayout.this.mStartWrapHeight)));
            }
            MotionLayout.this.resolveMeasuredDimension(i, i2, i5, i4, this.f1073a.K() || this.b.K(), this.f1073a.L() || this.b.L());
        }

        void a(android.support.constraint.solver.widgets.e eVar, android.support.constraint.c cVar, android.support.constraint.c cVar2) {
            this.c = cVar;
            this.d = cVar2;
            this.f1073a = new android.support.constraint.solver.widgets.e();
            this.b = new android.support.constraint.solver.widgets.e();
            this.f1073a.a(MotionLayout.this.mLayoutWidget.i());
            this.b.a(MotionLayout.this.mLayoutWidget.i());
            this.f1073a.U();
            this.b.U();
            a(MotionLayout.this.mLayoutWidget, this.f1073a);
            a(MotionLayout.this.mLayoutWidget, this.b);
            if (MotionLayout.this.mTransitionLastPosition > 0.5d) {
                if (cVar != null) {
                    a(this.f1073a, cVar);
                }
                a(this.b, cVar2);
            } else {
                a(this.b, cVar2);
                if (cVar != null) {
                    a(this.f1073a, cVar);
                }
            }
            this.f1073a.a(MotionLayout.this.isRtl());
            this.f1073a.h();
            this.b.a(MotionLayout.this.isRtl());
            this.b.h();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    this.f1073a.a(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                    this.b.a(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
                if (layoutParams.height != -2) {
                    return;
                }
                this.f1073a.b(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                this.b.b(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        }

        void a(android.support.constraint.solver.widgets.e eVar, android.support.constraint.solver.widgets.e eVar2) {
            ArrayList<ConstraintWidget> ae = eVar.ae();
            HashMap<ConstraintWidget, ConstraintWidget> hashMap = new HashMap<>();
            hashMap.put(eVar, eVar2);
            eVar2.ae().clear();
            eVar2.a(eVar, hashMap);
            Iterator<ConstraintWidget> it = ae.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                ConstraintWidget bVar = next instanceof android.support.constraint.solver.widgets.b ? new android.support.constraint.solver.widgets.b() : next instanceof android.support.constraint.solver.widgets.g ? new android.support.constraint.solver.widgets.g() : next instanceof android.support.constraint.solver.widgets.a ? new android.support.constraint.solver.widgets.a() : next instanceof android.support.constraint.solver.widgets.h ? new android.support.constraint.solver.widgets.f() : new ConstraintWidget();
                eVar2.b(bVar);
                hashMap.put(next, bVar);
            }
            Iterator<ConstraintWidget> it2 = ae.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                hashMap.get(next2).a(next2, hashMap);
            }
        }

        public void b() {
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.mFrameArrayList.clear();
            for (int i = 0; i < childCount; i++) {
                View childAt = MotionLayout.this.getChildAt(i);
                MotionLayout.this.mFrameArrayList.put(childAt, new n(childAt));
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = MotionLayout.this.getChildAt(i2);
                n nVar = MotionLayout.this.mFrameArrayList.get(childAt2);
                if (nVar != null) {
                    if (this.c != null) {
                        ConstraintWidget a2 = a(this.f1073a, childAt2);
                        if (a2 != null) {
                            nVar.a(a2, this.c);
                        } else if (MotionLayout.this.mDebugPath != 0) {
                            Log.e(MotionLayout.TAG, android.support.constraint.motion.a.a() + "no widget for  " + android.support.constraint.motion.a.a(childAt2) + " (" + childAt2.getClass().getName() + riy.BRACKET_END_STR);
                        }
                    }
                    if (this.d != null) {
                        ConstraintWidget a3 = a(this.b, childAt2);
                        if (a3 != null) {
                            nVar.b(a3, this.d);
                        } else if (MotionLayout.this.mDebugPath != 0) {
                            Log.e(MotionLayout.TAG, android.support.constraint.motion.a.a() + "no widget for  " + android.support.constraint.motion.a.a(childAt2) + " (" + childAt2.getClass().getName() + riy.BRACKET_END_STR);
                        }
                    }
                }
            }
        }

        public void b(int i, int i2) {
            this.e = i;
            this.f = i2;
        }

        public boolean c(int i, int i2) {
            return (i == this.e && i2 == this.f) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public interface d {
        void a();

        void a(int i);

        void a(MotionEvent motionEvent);

        float b();

        float c();
    }

    /* loaded from: classes2.dex */
    private static class e implements d {
        private static e b = new e();

        /* renamed from: a  reason: collision with root package name */
        VelocityTracker f1074a;

        private e() {
        }

        public static e d() {
            b.f1074a = VelocityTracker.obtain();
            return b;
        }

        @Override // android.support.constraint.motion.MotionLayout.d
        public void a() {
            VelocityTracker velocityTracker = this.f1074a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1074a = null;
            }
        }

        @Override // android.support.constraint.motion.MotionLayout.d
        public void a(int i) {
            VelocityTracker velocityTracker = this.f1074a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }

        @Override // android.support.constraint.motion.MotionLayout.d
        public void a(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f1074a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // android.support.constraint.motion.MotionLayout.d
        public float b() {
            VelocityTracker velocityTracker = this.f1074a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // android.support.constraint.motion.MotionLayout.d
        public float c() {
            VelocityTracker velocityTracker = this.f1074a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        float f1075a = Float.NaN;
        float b = Float.NaN;
        int c = -1;
        int d = -1;
        final String e = "motion.progress";
        final String f = "motion.velocity";
        final String g = "motion.StartState";
        final String h = "motion.EndState";

        f() {
        }

        void a() {
            if (this.c != -1 || this.d != -1) {
                int i = this.c;
                if (i == -1) {
                    MotionLayout.this.transitionToState(this.d);
                } else {
                    int i2 = this.d;
                    if (i2 == -1) {
                        MotionLayout.this.setState(i, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i, i2);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (Float.isNaN(this.b)) {
                if (Float.isNaN(this.f1075a)) {
                    return;
                }
                MotionLayout.this.setProgress(this.f1075a);
                return;
            }
            MotionLayout.this.setProgress(this.f1075a, this.b);
            this.f1075a = Float.NaN;
            this.b = Float.NaN;
            this.c = -1;
            this.d = -1;
        }

        public void a(float f) {
            this.f1075a = f;
        }

        public void a(int i) {
            this.d = i;
        }

        public void a(Bundle bundle) {
            this.f1075a = bundle.getFloat("motion.progress");
            this.b = bundle.getFloat("motion.velocity");
            this.c = bundle.getInt("motion.StartState");
            this.d = bundle.getInt("motion.EndState");
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f1075a);
            bundle.putFloat("motion.velocity", this.b);
            bundle.putInt("motion.StartState", this.c);
            bundle.putInt("motion.EndState", this.d);
            return bundle;
        }

        public void b(float f) {
            this.b = f;
        }

        public void b(int i) {
            this.c = i;
        }

        public void c() {
            this.d = MotionLayout.this.mEndState;
            this.c = MotionLayout.this.mBeginState;
            this.b = MotionLayout.this.getVelocity();
            this.f1075a = MotionLayout.this.getProgress();
        }
    }

    /* loaded from: classes2.dex */
    public interface g {
        void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f);

        void onTransitionCompleted(MotionLayout motionLayout, int i);

        void onTransitionStarted(MotionLayout motionLayout, int i, int i2);

        void onTransitionTrigger(MotionLayout motionLayout, int i, boolean z, float f);
    }

    public MotionLayout(Context context) {
        super(context);
        this.mLastVelocity = 0.0f;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new HashMap<>();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionGoalPosition = 0.0f;
        this.mInTransition = false;
        this.mIndirectTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new iex();
        this.mDecelerateLogic = new a();
        this.firstDown = true;
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = 0.0f;
        this.mListenerState = 0;
        this.mListenerPosition = 0.0f;
        this.mIsAnimating = false;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new android.support.constraint.motion.e();
        this.mInLayout = false;
        this.mTransitionState = TransitionState.UNDEFINED;
        this.mModel = new c();
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new RectF();
        this.mRegionView = null;
        this.mTransitionCompleted = new ArrayList<>();
        init(null);
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLastVelocity = 0.0f;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new HashMap<>();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionGoalPosition = 0.0f;
        this.mInTransition = false;
        this.mIndirectTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new iex();
        this.mDecelerateLogic = new a();
        this.firstDown = true;
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = 0.0f;
        this.mListenerState = 0;
        this.mListenerPosition = 0.0f;
        this.mIsAnimating = false;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new android.support.constraint.motion.e();
        this.mInLayout = false;
        this.mTransitionState = TransitionState.UNDEFINED;
        this.mModel = new c();
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new RectF();
        this.mRegionView = null;
        this.mTransitionCompleted = new ArrayList<>();
        init(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mLastVelocity = 0.0f;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new HashMap<>();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionGoalPosition = 0.0f;
        this.mInTransition = false;
        this.mIndirectTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new iex();
        this.mDecelerateLogic = new a();
        this.firstDown = true;
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = 0.0f;
        this.mListenerState = 0;
        this.mListenerPosition = 0.0f;
        this.mIsAnimating = false;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new android.support.constraint.motion.e();
        this.mInLayout = false;
        this.mTransitionState = TransitionState.UNDEFINED;
        this.mModel = new c();
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new RectF();
        this.mRegionView = null;
        this.mTransitionCompleted = new ArrayList<>();
        init(attributeSet);
    }

    private void checkStructure() {
        q qVar = this.mScene;
        if (qVar == null) {
            Log.e(TAG, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int d2 = qVar.d();
        q qVar2 = this.mScene;
        checkStructure(d2, qVar2.c(qVar2.d()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<q.a> it = this.mScene.a().iterator();
        while (it.hasNext()) {
            q.a next = it.next();
            checkStructure(next);
            int d3 = next.d();
            int c2 = next.c();
            String a2 = android.support.constraint.motion.a.a(getContext(), d3);
            String a3 = android.support.constraint.motion.a.a(getContext(), c2);
            if (sparseIntArray.get(d3) == c2) {
                Log.e(TAG, "CHECK: two transitions with the same start and end " + a2 + "->" + a3);
            }
            if (sparseIntArray2.get(c2) == d3) {
                Log.e(TAG, "CHECK: you can't have reverse transitions" + a2 + "->" + a3);
            }
            sparseIntArray.put(d3, c2);
            sparseIntArray2.put(c2, d3);
            if (this.mScene.c(d3) == null) {
                Log.e(TAG, " no such constraintSetStart " + a2);
            }
            if (this.mScene.c(c2) == null) {
                Log.e(TAG, " no such constraintSetEnd " + a2);
            }
        }
    }

    private void checkStructure(int i, android.support.constraint.c cVar) {
        View childAt;
        String a2 = android.support.constraint.motion.a.a(getContext(), i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int id = getChildAt(i2).getId();
            if (id == -1) {
                String str = "CHECK: " + a2 + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!";
            }
            if (cVar.f(id) == null) {
                String str2 = "CHECK: " + a2 + " NO CONSTRAINTS for " + android.support.constraint.motion.a.a(childAt);
            }
        }
        int[] a3 = cVar.a();
        for (int i3 = 0; i3 < a3.length; i3++) {
            int i4 = a3[i3];
            String a4 = android.support.constraint.motion.a.a(getContext(), i4);
            if (findViewById(a3[i3]) == null) {
                String str3 = "CHECK: " + a2 + " NO View matches id " + a4;
            }
            if (cVar.d(i4) == -1) {
                String str4 = "CHECK: " + a2 + riy.BRACKET_START_STR + a4 + ") no LAYOUT_HEIGHT";
            }
            if (cVar.e(i4) == -1) {
                String str5 = "CHECK: " + a2 + riy.BRACKET_START_STR + a4 + ") no LAYOUT_HEIGHT";
            }
        }
    }

    private void checkStructure(q.a aVar) {
        String str = "CHECK: transition = " + aVar.a(getContext());
        String str2 = "CHECK: transition.setDuration = " + aVar.e();
        if (aVar.d() == aVar.c()) {
            Log.e(TAG, "CHECK: start and end constraint set should not be the same!");
        }
    }

    private void computeCurrentPositions() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            n nVar = this.mFrameArrayList.get(childAt);
            if (nVar != null) {
                nVar.b(childAt);
            }
        }
    }

    private void debugPos() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            String str = " " + android.support.constraint.motion.a.a() + " " + android.support.constraint.motion.a.a(this) + " " + android.support.constraint.motion.a.a(getContext(), this.mCurrentState) + " " + android.support.constraint.motion.a.a(childAt) + childAt.getLeft() + " " + childAt.getTop();
        }
    }

    private void evaluateLayout() {
        boolean z;
        float signum = Math.signum(this.mTransitionGoalPosition - this.mTransitionLastPosition);
        long nanoTime = getNanoTime();
        float f2 = this.mTransitionLastPosition + (!(this.mInterpolator instanceof iex) ? ((((float) (nanoTime - this.mTransitionLastTime)) * signum) * 1.0E-9f) / this.mTransitionDuration : 0.0f);
        if (this.mTransitionInstantly) {
            f2 = this.mTransitionGoalPosition;
        }
        int i = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i <= 0 || f2 < this.mTransitionGoalPosition) && (signum > 0.0f || f2 > this.mTransitionGoalPosition)) {
            z = false;
        } else {
            f2 = this.mTransitionGoalPosition;
            z = true;
        }
        Interpolator interpolator = this.mInterpolator;
        if (interpolator != null && !z) {
            f2 = this.mTemporalInterpolator ? interpolator.getInterpolation(((float) (nanoTime - this.mAnimationStartTime)) * 1.0E-9f) : interpolator.getInterpolation(f2);
        }
        if ((i > 0 && f2 >= this.mTransitionGoalPosition) || (signum <= 0.0f && f2 <= this.mTransitionGoalPosition)) {
            f2 = this.mTransitionGoalPosition;
        }
        this.mPostInterpolationPosition = f2;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            n nVar = this.mFrameArrayList.get(childAt);
            if (nVar != null) {
                nVar.a(childAt, f2, nanoTime2, this.mKeyCache);
            }
        }
        if (this.mMeasureDuringTransition) {
            requestLayout();
        }
    }

    private void fireTransitionChange() {
        ArrayList<g> arrayList;
        if ((this.mTransitionListener != null || ((arrayList = this.mTransitionListeners) != null && !arrayList.isEmpty())) && this.mListenerPosition != this.mTransitionPosition) {
            if (this.mListenerState != -1) {
                g gVar = this.mTransitionListener;
                if (gVar != null) {
                    gVar.onTransitionStarted(this, this.mBeginState, this.mEndState);
                }
                ArrayList<g> arrayList2 = this.mTransitionListeners;
                if (arrayList2 != null) {
                    Iterator<g> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().onTransitionStarted(this, this.mBeginState, this.mEndState);
                    }
                }
                this.mIsAnimating = true;
            }
            this.mListenerState = -1;
            float f2 = this.mTransitionPosition;
            this.mListenerPosition = f2;
            g gVar2 = this.mTransitionListener;
            if (gVar2 != null) {
                gVar2.onTransitionChange(this, this.mBeginState, this.mEndState, f2);
            }
            ArrayList<g> arrayList3 = this.mTransitionListeners;
            if (arrayList3 != null) {
                Iterator<g> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().onTransitionChange(this, this.mBeginState, this.mEndState, this.mTransitionPosition);
                }
            }
            this.mIsAnimating = true;
        }
    }

    private void fireTransitionStarted(MotionLayout motionLayout, int i, int i2) {
        g gVar = this.mTransitionListener;
        if (gVar != null) {
            gVar.onTransitionStarted(this, i, i2);
        }
        ArrayList<g> arrayList = this.mTransitionListeners;
        if (arrayList != null) {
            Iterator<g> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionStarted(motionLayout, i, i2);
            }
        }
    }

    private boolean handlesTouchEvent(float f2, float f3, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (handlesTouchEvent(view.getLeft() + f2, view.getTop() + f3, viewGroup.getChildAt(i), motionEvent)) {
                    return true;
                }
            }
        }
        this.mBoundsCheck.set(view.getLeft() + f2, view.getTop() + f3, f2 + view.getRight(), f3 + view.getBottom());
        if (motionEvent.getAction() == 0) {
            if (this.mBoundsCheck.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent)) {
                return true;
            }
        } else if (view.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    private void init(AttributeSet attributeSet) {
        q qVar;
        int i;
        IS_IN_EDIT_MODE = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.MotionLayout_layoutDescription) {
                    this.mScene = new q(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == R.styleable.MotionLayout_currentState) {
                    this.mCurrentState = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == R.styleable.MotionLayout_motionProgress) {
                    this.mTransitionGoalPosition = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.mInTransition = true;
                } else if (index == R.styleable.MotionLayout_applyMotionScene) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == R.styleable.MotionLayout_showPaths) {
                    if (this.mDebugPath == 0) {
                        i = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                        this.mDebugPath = i;
                    }
                } else if (index == R.styleable.MotionLayout_motionDebug) {
                    i = obtainStyledAttributes.getInt(index, 0);
                    this.mDebugPath = i;
                }
            }
            obtainStyledAttributes.recycle();
            if (this.mScene == null) {
                Log.e(TAG, "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.mScene = null;
            }
        }
        if (this.mDebugPath != 0) {
            checkStructure();
        }
        if (this.mCurrentState != -1 || (qVar = this.mScene) == null) {
            return;
        }
        this.mCurrentState = qVar.d();
        this.mBeginState = this.mScene.d();
        this.mEndState = this.mScene.e();
    }

    private void processTransitionCompleted() {
        ArrayList<g> arrayList;
        if (this.mTransitionListener != null || ((arrayList = this.mTransitionListeners) != null && !arrayList.isEmpty())) {
            this.mIsAnimating = false;
            Iterator<Integer> it = this.mTransitionCompleted.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                g gVar = this.mTransitionListener;
                if (gVar != null) {
                    gVar.onTransitionCompleted(this, next.intValue());
                }
                ArrayList<g> arrayList2 = this.mTransitionListeners;
                if (arrayList2 != null) {
                    Iterator<g> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().onTransitionCompleted(this, next.intValue());
                    }
                }
            }
            this.mTransitionCompleted.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupMotionViews() {
        int childCount = getChildCount();
        this.mModel.b();
        boolean z = true;
        this.mInTransition = true;
        int width = getWidth();
        int height = getHeight();
        int h = this.mScene.h();
        int i = 0;
        if (h != -1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                n nVar = this.mFrameArrayList.get(getChildAt(i2));
                if (nVar != null) {
                    nVar.b(h);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            n nVar2 = this.mFrameArrayList.get(getChildAt(i3));
            if (nVar2 != null) {
                this.mScene.a(nVar2);
                nVar2.a(width, height, this.mTransitionDuration, getNanoTime());
            }
        }
        float i4 = this.mScene.i();
        if (i4 != 0.0f) {
            boolean z2 = ((double) i4) < mto.a.GEO_NOT_SUPPORT;
            float abs = Math.abs(i4);
            float f2 = -3.4028235E38f;
            float f3 = Float.MAX_VALUE;
            int i5 = 0;
            float f4 = Float.MAX_VALUE;
            float f5 = -3.4028235E38f;
            while (true) {
                if (i5 >= childCount) {
                    z = false;
                    break;
                }
                n nVar3 = this.mFrameArrayList.get(getChildAt(i5));
                if (!Float.isNaN(nVar3.d)) {
                    break;
                }
                float a2 = nVar3.a();
                float b2 = nVar3.b();
                float f6 = z2 ? b2 - a2 : b2 + a2;
                f4 = Math.min(f4, f6);
                f5 = Math.max(f5, f6);
                i5++;
            }
            if (!z) {
                while (i < childCount) {
                    n nVar4 = this.mFrameArrayList.get(getChildAt(i));
                    float a3 = nVar4.a();
                    float b3 = nVar4.b();
                    float f7 = z2 ? b3 - a3 : b3 + a3;
                    nVar4.f = 1.0f / (1.0f - abs);
                    nVar4.e = abs - (((f7 - f4) * abs) / (f5 - f4));
                    i++;
                }
                return;
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                n nVar5 = this.mFrameArrayList.get(getChildAt(i6));
                if (!Float.isNaN(nVar5.d)) {
                    f3 = Math.min(f3, nVar5.d);
                    f2 = Math.max(f2, nVar5.d);
                }
            }
            while (i < childCount) {
                n nVar6 = this.mFrameArrayList.get(getChildAt(i));
                if (!Float.isNaN(nVar6.d)) {
                    nVar6.f = 1.0f / (1.0f - abs);
                    nVar6.e = abs - (z2 ? ((f2 - nVar6.d) / (f2 - f3)) * abs : ((nVar6.d - f3) * abs) / (f2 - f3));
                }
                i++;
            }
        }
    }

    private static boolean willJump(float f2, float f3, float f4) {
        if (f2 > 0.0f) {
            float f5 = f2 / f4;
            return f3 + ((f2 * f5) - (((f4 * f5) * f5) / 2.0f)) > 1.0f;
        }
        float f6 = (-f2) / f4;
        return f3 + ((f2 * f6) + (((f4 * f6) * f6) / 2.0f)) < 0.0f;
    }

    public void addTransitionListener(g gVar) {
        if (this.mTransitionListeners == null) {
            this.mTransitionListeners = new ArrayList<>();
        }
        this.mTransitionListeners.add(gVar);
    }

    void animateTo(float f2) {
        if (this.mScene == null) {
            return;
        }
        float f3 = this.mTransitionLastPosition;
        float f4 = this.mTransitionPosition;
        if (f3 != f4 && this.mTransitionInstantly) {
            this.mTransitionLastPosition = f4;
        }
        float f5 = this.mTransitionLastPosition;
        if (f5 == f2) {
            return;
        }
        this.mTemporalInterpolator = false;
        this.mTransitionGoalPosition = f2;
        this.mTransitionDuration = this.mScene.g() / 1000.0f;
        setProgress(this.mTransitionGoalPosition);
        this.mInterpolator = this.mScene.f();
        this.mTransitionInstantly = false;
        this.mAnimationStartTime = getNanoTime();
        this.mInTransition = true;
        this.mTransitionPosition = f5;
        this.mTransitionLastPosition = f5;
        invalidate();
    }

    void disableAutoTransition(boolean z) {
        q qVar = this.mScene;
        if (qVar == null) {
            return;
        }
        qVar.b(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    @Override // android.support.constraint.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void dispatchDraw(android.graphics.Canvas r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.motion.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public void enableTransition(int i, boolean z) {
        boolean z2;
        q.a transition = getTransition(i);
        if (z) {
            z2 = true;
        } else {
            if (transition == this.mScene.b) {
                Iterator<q.a> it = this.mScene.a(this.mCurrentState).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    q.a next = it.next();
                    if (next.g()) {
                        this.mScene.b = next;
                        break;
                    }
                }
            }
            z2 = false;
        }
        transition.a(z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void evaluate(boolean z) {
        float f2;
        boolean z2;
        int i;
        int i2;
        if (this.mTransitionLastTime == -1) {
            this.mTransitionLastTime = getNanoTime();
        }
        float f3 = this.mTransitionLastPosition;
        if (f3 > 0.0f && f3 < 1.0f) {
            this.mCurrentState = -1;
        }
        boolean z3 = false;
        if (this.mKeepAnimating || (this.mInTransition && (z || this.mTransitionGoalPosition != this.mTransitionLastPosition))) {
            float signum = Math.signum(this.mTransitionGoalPosition - this.mTransitionLastPosition);
            long nanoTime = getNanoTime();
            if (!(this.mInterpolator instanceof o)) {
                f2 = ((((float) (nanoTime - this.mTransitionLastTime)) * signum) * 1.0E-9f) / this.mTransitionDuration;
                this.mLastVelocity = f2;
            } else {
                f2 = 0.0f;
            }
            float f4 = this.mTransitionLastPosition + f2;
            if (this.mTransitionInstantly) {
                f4 = this.mTransitionGoalPosition;
            }
            int i3 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i3 <= 0 || f4 < this.mTransitionGoalPosition) && (signum > 0.0f || f4 > this.mTransitionGoalPosition)) {
                z2 = false;
            } else {
                f4 = this.mTransitionGoalPosition;
                this.mInTransition = false;
                z2 = true;
            }
            this.mTransitionLastPosition = f4;
            this.mTransitionPosition = f4;
            this.mTransitionLastTime = nanoTime;
            Interpolator interpolator = this.mInterpolator;
            if (interpolator != null && !z2) {
                if (this.mTemporalInterpolator) {
                    float interpolation = interpolator.getInterpolation(((float) (nanoTime - this.mAnimationStartTime)) * 1.0E-9f);
                    this.mTransitionLastPosition = interpolation;
                    this.mTransitionLastTime = nanoTime;
                    Interpolator interpolator2 = this.mInterpolator;
                    if (interpolator2 instanceof o) {
                        float a2 = ((o) interpolator2).a();
                        this.mLastVelocity = a2;
                        if (Math.abs(a2) * this.mTransitionDuration <= EPSILON) {
                            this.mInTransition = false;
                        }
                        if (a2 > 0.0f && interpolation >= 1.0f) {
                            this.mTransitionLastPosition = 1.0f;
                            this.mInTransition = false;
                            interpolation = 1.0f;
                        }
                        if (a2 < 0.0f && interpolation <= 0.0f) {
                            this.mTransitionLastPosition = 0.0f;
                            this.mInTransition = false;
                            f4 = 0.0f;
                        }
                    }
                    f4 = interpolation;
                } else {
                    float interpolation2 = interpolator.getInterpolation(f4);
                    Interpolator interpolator3 = this.mInterpolator;
                    this.mLastVelocity = interpolator3 instanceof o ? ((o) interpolator3).a() : ((interpolator3.getInterpolation(f4 + f2) - interpolation2) * signum) / f2;
                    f4 = interpolation2;
                }
            }
            if (Math.abs(this.mLastVelocity) > EPSILON) {
                setState(TransitionState.MOVING);
            }
            if ((i3 > 0 && f4 >= this.mTransitionGoalPosition) || (signum <= 0.0f && f4 <= this.mTransitionGoalPosition)) {
                f4 = this.mTransitionGoalPosition;
                this.mInTransition = false;
            }
            int i4 = (f4 > 1.0f ? 1 : (f4 == 1.0f ? 0 : -1));
            if (i4 >= 0 || f4 <= 0.0f) {
                this.mInTransition = false;
                setState(TransitionState.FINISHED);
            }
            int childCount = getChildCount();
            this.mKeepAnimating = false;
            long nanoTime2 = getNanoTime();
            this.mPostInterpolationPosition = f4;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                n nVar = this.mFrameArrayList.get(childAt);
                if (nVar != null) {
                    this.mKeepAnimating = nVar.a(childAt, f4, nanoTime2, this.mKeyCache) | this.mKeepAnimating;
                }
            }
            boolean z4 = (i3 > 0 && f4 >= this.mTransitionGoalPosition) || (signum <= 0.0f && f4 <= this.mTransitionGoalPosition);
            if (!this.mKeepAnimating && !this.mInTransition && z4) {
                setState(TransitionState.FINISHED);
            }
            if (this.mMeasureDuringTransition) {
                requestLayout();
            }
            this.mKeepAnimating = (!z4) | this.mKeepAnimating;
            if (f4 <= 0.0f && (i = this.mBeginState) != -1 && this.mCurrentState != i) {
                this.mCurrentState = i;
                this.mScene.c(i).d(this);
                setState(TransitionState.FINISHED);
                z3 = true;
            }
            if (f4 >= 1.0d) {
                int i6 = this.mCurrentState;
                int i7 = this.mEndState;
                if (i6 != i7) {
                    this.mCurrentState = i7;
                    this.mScene.c(i7).d(this);
                    setState(TransitionState.FINISHED);
                    z3 = true;
                }
            }
            if (this.mKeepAnimating || this.mInTransition) {
                invalidate();
            } else if ((i3 > 0 && i4 == 0) || (signum < 0.0f && f4 == 0.0f)) {
                setState(TransitionState.FINISHED);
            }
            if ((!this.mKeepAnimating && this.mInTransition && i3 > 0 && i4 == 0) || (signum < 0.0f && f4 == 0.0f)) {
                onNewStateAttachHandlers();
            }
        }
        float f5 = this.mTransitionLastPosition;
        if (f5 < 1.0f) {
            if (f5 <= 0.0f) {
                if (this.mCurrentState != this.mBeginState) {
                    z3 = true;
                }
                i2 = this.mBeginState;
            }
            this.mNeedsFireTransitionCompleted |= z3;
            if (z3 && !this.mInLayout) {
                requestLayout();
            }
            this.mTransitionPosition = this.mTransitionLastPosition;
        }
        if (this.mCurrentState != this.mEndState) {
            z3 = true;
        }
        i2 = this.mEndState;
        this.mCurrentState = i2;
        this.mNeedsFireTransitionCompleted |= z3;
        if (z3) {
            requestLayout();
        }
        this.mTransitionPosition = this.mTransitionLastPosition;
    }

    protected void fireTransitionCompleted() {
        int i;
        ArrayList<g> arrayList;
        if ((this.mTransitionListener != null || ((arrayList = this.mTransitionListeners) != null && !arrayList.isEmpty())) && this.mListenerState == -1) {
            this.mListenerState = this.mCurrentState;
            if (!this.mTransitionCompleted.isEmpty()) {
                ArrayList<Integer> arrayList2 = this.mTransitionCompleted;
                i = arrayList2.get(arrayList2.size() - 1).intValue();
            } else {
                i = -1;
            }
            int i2 = this.mCurrentState;
            if (i != i2 && i2 != -1) {
                this.mTransitionCompleted.add(Integer.valueOf(i2));
            }
        }
        processTransitionCompleted();
    }

    public void fireTrigger(int i, boolean z, float f2) {
        g gVar = this.mTransitionListener;
        if (gVar != null) {
            gVar.onTransitionTrigger(this, i, z, f2);
        }
        ArrayList<g> arrayList = this.mTransitionListeners;
        if (arrayList != null) {
            Iterator<g> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionTrigger(this, i, z, f2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getAnchorDpDt(int i, float f2, float f3, float f4, float[] fArr) {
        String resourceName;
        HashMap<View, n> hashMap = this.mFrameArrayList;
        View viewById = getViewById(i);
        n nVar = hashMap.get(viewById);
        if (nVar != null) {
            nVar.a(f2, f3, f4, fArr);
            float y = viewById.getY();
            this.lastPos = f2;
            this.lastY = y;
            return;
        }
        if (viewById == null) {
            resourceName = "" + i;
        } else {
            resourceName = viewById.getContext().getResources().getResourceName(i);
        }
        String str = "WARNING could not find view id " + resourceName;
    }

    public android.support.constraint.c getConstraintSet(int i) {
        q qVar = this.mScene;
        if (qVar == null) {
            return null;
        }
        return qVar.c(i);
    }

    public int[] getConstraintSetIds() {
        q qVar = this.mScene;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    String getConstraintSetNames(int i) {
        q qVar = this.mScene;
        if (qVar == null) {
            return null;
        }
        return qVar.e(i);
    }

    public int getCurrentState() {
        return this.mCurrentState;
    }

    public void getDebugMode(boolean z) {
        this.mDebugPath = z ? 2 : 1;
        invalidate();
    }

    public ArrayList<q.a> getDefinedTransitions() {
        q qVar = this.mScene;
        if (qVar == null) {
            return null;
        }
        return qVar.a();
    }

    public android.support.constraint.motion.b getDesignTool() {
        if (this.mDesignTool == null) {
            this.mDesignTool = new android.support.constraint.motion.b(this);
        }
        return this.mDesignTool;
    }

    public int getEndState() {
        return this.mEndState;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.mTransitionLastPosition;
    }

    public int getStartState() {
        return this.mBeginState;
    }

    public float getTargetPosition() {
        return this.mTransitionGoalPosition;
    }

    public q.a getTransition(int i) {
        return this.mScene.b(i);
    }

    public Bundle getTransitionState() {
        if (this.mStateCache == null) {
            this.mStateCache = new f();
        }
        this.mStateCache.c();
        return this.mStateCache.b();
    }

    public long getTransitionTimeMs() {
        q qVar = this.mScene;
        if (qVar != null) {
            this.mTransitionDuration = qVar.g() / 1000.0f;
        }
        return this.mTransitionDuration * 1000.0f;
    }

    public float getVelocity() {
        return this.mLastVelocity;
    }

    public void getViewVelocity(View view, float f2, float f3, float[] fArr, int i) {
        float f4 = this.mLastVelocity;
        float f5 = this.mTransitionLastPosition;
        if (this.mInterpolator != null) {
            float signum = Math.signum(this.mTransitionGoalPosition - f5);
            float interpolation = this.mInterpolator.getInterpolation(this.mTransitionLastPosition + EPSILON);
            float interpolation2 = this.mInterpolator.getInterpolation(this.mTransitionLastPosition);
            f4 = (signum * ((interpolation - interpolation2) / EPSILON)) / this.mTransitionDuration;
            f5 = interpolation2;
        }
        Interpolator interpolator = this.mInterpolator;
        if (interpolator instanceof o) {
            f4 = ((o) interpolator).a();
        }
        float f6 = f4;
        n nVar = this.mFrameArrayList.get(view);
        if ((i & 1) == 0) {
            nVar.a(f5, view.getWidth(), view.getHeight(), f2, f3, fArr);
        } else {
            nVar.a(f5, f2, f3, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * f6;
            fArr[1] = fArr[1] * f6;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return Build.VERSION.SDK_INT >= 19 ? super.isAttachedToWindow() : getWindowToken() != null;
    }

    public boolean isInteractionEnabled() {
        return this.mInteractionEnabled;
    }

    @Override // android.support.constraint.ConstraintLayout
    public void loadLayoutDescription(int i) {
        if (i == 0) {
            this.mScene = null;
            return;
        }
        try {
            this.mScene = new q(getContext(), this, i);
            if (Build.VERSION.SDK_INT >= 19 && !isAttachedToWindow()) {
                return;
            }
            this.mScene.a(this);
            this.mModel.a(this.mLayoutWidget, this.mScene.c(this.mBeginState), this.mScene.c(this.mEndState));
            rebuildScene();
            this.mScene.a(isRtl());
        } catch (Exception e2) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e2);
        }
    }

    int lookUpConstraintId(String str) {
        q qVar = this.mScene;
        if (qVar == null) {
            return 0;
        }
        return qVar.b(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d obtainVelocityTracker() {
        return e.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        q qVar = this.mScene;
        if (qVar != null && (i = this.mCurrentState) != -1) {
            android.support.constraint.c c2 = qVar.c(i);
            this.mScene.a(this);
            if (c2 != null) {
                c2.c(this);
            }
            this.mBeginState = this.mCurrentState;
        }
        onNewStateAttachHandlers();
        f fVar = this.mStateCache;
        if (fVar != null) {
            fVar.a();
            return;
        }
        q qVar2 = this.mScene;
        if (qVar2 == null || qVar2.b == null || this.mScene.b.b() != 4) {
            return;
        }
        transitionToEnd();
        setState(TransitionState.SETUP);
        setState(TransitionState.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        q.a aVar;
        t f2;
        int e2;
        RectF a2;
        q qVar = this.mScene;
        if (qVar != null && this.mInteractionEnabled && (aVar = qVar.b) != null && aVar.g() && (f2 = aVar.f()) != null && ((motionEvent.getAction() != 0 || (a2 = f2.a(this, new RectF())) == null || a2.contains(motionEvent.getX(), motionEvent.getY())) && (e2 = f2.e()) != -1)) {
            View view = this.mRegionView;
            if (view == null || view.getId() != e2) {
                this.mRegionView = findViewById(e2);
            }
            View view2 = this.mRegionView;
            if (view2 != null) {
                this.mBoundsCheck.set(view2.getLeft(), this.mRegionView.getTop(), this.mRegionView.getRight(), this.mRegionView.getBottom());
                if (this.mBoundsCheck.contains(motionEvent.getX(), motionEvent.getY()) && !handlesTouchEvent(0.0f, 0.0f, this.mRegionView, motionEvent)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // android.support.constraint.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.mInLayout = true;
        try {
            if (this.mScene == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.mLastLayoutWidth != i5 || this.mLastLayoutHeight != i6) {
                rebuildScene();
                evaluate(true);
            }
            this.mLastLayoutWidth = i5;
            this.mLastLayoutHeight = i6;
            this.mOldWidth = i5;
            this.mOldHeight = i6;
        } finally {
            this.mInLayout = false;
        }
    }

    @Override // android.support.constraint.ConstraintLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.mScene == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z = false;
        boolean z2 = (this.mLastWidthMeasureSpec == i && this.mLastHeightMeasureSpec == i2) ? false : true;
        if (this.mNeedsFireTransitionCompleted) {
            this.mNeedsFireTransitionCompleted = false;
            onNewStateAttachHandlers();
            processTransitionCompleted();
            z2 = true;
        }
        if (this.mDirtyHierarchy) {
            z2 = true;
        }
        this.mLastWidthMeasureSpec = i;
        this.mLastHeightMeasureSpec = i2;
        int d2 = this.mScene.d();
        int e2 = this.mScene.e();
        if ((z2 || this.mModel.c(d2, e2)) && this.mBeginState != -1) {
            super.onMeasure(i, i2);
            this.mModel.a(this.mLayoutWidget, this.mScene.c(d2), this.mScene.c(e2));
            this.mModel.a();
            this.mModel.b(d2, e2);
        } else {
            z = true;
        }
        if (this.mMeasureDuringTransition || z) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int q = this.mLayoutWidget.q() + getPaddingLeft() + getPaddingRight();
            int s = this.mLayoutWidget.s() + paddingTop;
            int i3 = this.mWidthMeasureMode;
            if (i3 == Integer.MIN_VALUE || i3 == 0) {
                int i4 = this.mStartWrapWidth;
                q = (int) (i4 + (this.mPostInterpolationPosition * (this.mEndWrapWidth - i4)));
                requestLayout();
            }
            int i5 = this.mHeightMeasureMode;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                int i6 = this.mStartWrapHeight;
                s = (int) (i6 + (this.mPostInterpolationPosition * (this.mEndWrapHeight - i6)));
                requestLayout();
            }
            setMeasuredDimension(q, s);
        }
        evaluateLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedPreScroll(final View view, int i, int i2, int[] iArr, int i3) {
        t f2;
        int e2;
        q qVar = this.mScene;
        if (qVar == null || qVar.b == null || !this.mScene.b.g()) {
            return;
        }
        q.a aVar = this.mScene.b;
        if (aVar != null && aVar.g() && (f2 = aVar.f()) != null && (e2 = f2.e()) != -1 && view.getId() != e2) {
            return;
        }
        q qVar2 = this.mScene;
        if (qVar2 != null && qVar2.m()) {
            float f3 = this.mTransitionPosition;
            if ((f3 == 1.0f || f3 == 0.0f) && view.canScrollVertically(-1)) {
                return;
            }
        }
        if (aVar.f() != null && (this.mScene.b.f().f() & 1) != 0) {
            float c2 = this.mScene.c(i, i2);
            if ((this.mTransitionLastPosition <= 0.0f && c2 < 0.0f) || (this.mTransitionLastPosition >= 1.0f && c2 > 0.0f)) {
                if (Build.VERSION.SDK_INT < 21) {
                    return;
                }
                view.setNestedScrollingEnabled(false);
                view.post(new Runnable() { // from class: android.support.constraint.motion.MotionLayout.1
                    @Override // java.lang.Runnable
                    public void run() {
                        view.setNestedScrollingEnabled(true);
                    }
                });
                return;
            }
        }
        float f4 = this.mTransitionPosition;
        long nanoTime = getNanoTime();
        float f5 = i;
        this.mScrollTargetDX = f5;
        float f6 = i2;
        this.mScrollTargetDY = f6;
        this.mScrollTargetDT = (float) ((nanoTime - this.mScrollTargetTime) * 1.0E-9d);
        this.mScrollTargetTime = nanoTime;
        this.mScene.a(f5, f6);
        if (f4 != this.mTransitionPosition) {
            iArr[0] = i;
            iArr[1] = i2;
        }
        evaluate(false);
        if (iArr[0] == 0 && iArr[1] == 0) {
            return;
        }
        this.mUndergoingMotion = true;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onNewStateAttachHandlers() {
        q qVar = this.mScene;
        if (qVar == null) {
            return;
        }
        if (qVar.b(this, this.mCurrentState)) {
            requestLayout();
            return;
        }
        int i = this.mCurrentState;
        if (i != -1) {
            this.mScene.a(this, i);
        }
        if (!this.mScene.c()) {
            return;
        }
        this.mScene.l();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        q qVar = this.mScene;
        if (qVar != null) {
            qVar.a(isRtl());
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        q qVar = this.mScene;
        return (qVar == null || qVar.b == null || this.mScene.b.f() == null || (this.mScene.b.f().f() & 2) != 0) ? false : true;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        q qVar = this.mScene;
        if (qVar == null) {
            return;
        }
        float f2 = this.mScrollTargetDX;
        float f3 = this.mScrollTargetDT;
        qVar.b(f2 / f3, this.mScrollTargetDY / f3);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        q qVar = this.mScene;
        if (qVar == null || !this.mInteractionEnabled || !qVar.c()) {
            return super.onTouchEvent(motionEvent);
        }
        q.a aVar = this.mScene.b;
        if (aVar != null && !aVar.g()) {
            return super.onTouchEvent(motionEvent);
        }
        this.mScene.a(motionEvent, getCurrentState(), this);
        return true;
    }

    @Override // android.support.constraint.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.mTransitionListeners == null) {
                this.mTransitionListeners = new ArrayList<>();
            }
            this.mTransitionListeners.add(motionHelper);
            if (motionHelper.isUsedOnShow()) {
                if (this.mOnShowHelpers == null) {
                    this.mOnShowHelpers = new ArrayList<>();
                }
                this.mOnShowHelpers.add(motionHelper);
            }
            if (!motionHelper.isUseOnHide()) {
                return;
            }
            if (this.mOnHideHelpers == null) {
                this.mOnHideHelpers = new ArrayList<>();
            }
            this.mOnHideHelpers.add(motionHelper);
        }
    }

    @Override // android.support.constraint.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.mOnHideHelpers;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // android.support.constraint.ConstraintLayout
    protected void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    @Deprecated
    public void rebuildMotion() {
        Log.e(TAG, "This method is deprecated. Please call rebuildScene() instead.");
        rebuildScene();
    }

    public void rebuildScene() {
        this.mModel.a();
        invalidate();
    }

    public boolean removeTransitionListener(g gVar) {
        ArrayList<g> arrayList = this.mTransitionListeners;
        if (arrayList == null) {
            return false;
        }
        return arrayList.remove(gVar);
    }

    @Override // android.support.constraint.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        q qVar;
        if (this.mMeasureDuringTransition || this.mCurrentState != -1 || (qVar = this.mScene) == null || qVar.b == null || this.mScene.b.a() != 0) {
            super.requestLayout();
        }
    }

    public void setDebugMode(int i) {
        this.mDebugPath = i;
        invalidate();
    }

    public void setInteractionEnabled(boolean z) {
        this.mInteractionEnabled = z;
    }

    public void setInterpolatedProgress(float f2) {
        if (this.mScene != null) {
            setState(TransitionState.MOVING);
            Interpolator f3 = this.mScene.f();
            if (f3 != null) {
                setProgress(f3.getInterpolation(f2));
                return;
            }
        }
        setProgress(f2);
    }

    public void setOnHide(float f2) {
        ArrayList<MotionHelper> arrayList = this.mOnHideHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mOnHideHelpers.get(i).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mOnShowHelpers.get(i).setProgress(f2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r3.mTransitionLastPosition == 0.0f) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        r0 = android.support.constraint.motion.MotionLayout.TransitionState.FINISHED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r3.mTransitionLastPosition == 1.0f) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setProgress(float r4) {
        /*
            r3 = this;
            boolean r0 = r3.isAttachedToWindow()
            if (r0 != 0) goto L17
            android.support.constraint.motion.MotionLayout$f r0 = r3.mStateCache
            if (r0 != 0) goto L11
            android.support.constraint.motion.MotionLayout$f r0 = new android.support.constraint.motion.MotionLayout$f
            r0.<init>()
            r3.mStateCache = r0
        L11:
            android.support.constraint.motion.MotionLayout$f r0 = r3.mStateCache
            r0.a(r4)
            return
        L17:
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 > 0) goto L29
            int r1 = r3.mBeginState
            r3.mCurrentState = r1
            float r1 = r3.mTransitionLastPosition
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L42
        L26:
            android.support.constraint.motion.MotionLayout$TransitionState r0 = android.support.constraint.motion.MotionLayout.TransitionState.FINISHED
            goto L3f
        L29:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 < 0) goto L3a
            int r1 = r3.mEndState
            r3.mCurrentState = r1
            float r1 = r3.mTransitionLastPosition
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L42
            goto L26
        L3a:
            r0 = -1
            r3.mCurrentState = r0
            android.support.constraint.motion.MotionLayout$TransitionState r0 = android.support.constraint.motion.MotionLayout.TransitionState.MOVING
        L3f:
            r3.setState(r0)
        L42:
            android.support.constraint.motion.q r0 = r3.mScene
            if (r0 != 0) goto L47
            return
        L47:
            r0 = 1
            r3.mTransitionInstantly = r0
            r3.mTransitionGoalPosition = r4
            r3.mTransitionPosition = r4
            r1 = -1
            r3.mTransitionLastTime = r1
            r3.mAnimationStartTime = r1
            r4 = 0
            r3.mInterpolator = r4
            r3.mInTransition = r0
            r3.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.motion.MotionLayout.setProgress(float):void");
    }

    public void setProgress(float f2, float f3) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new f();
            }
            this.mStateCache.a(f2);
            this.mStateCache.b(f3);
            return;
        }
        setProgress(f2);
        setState(TransitionState.MOVING);
        this.mLastVelocity = f3;
        animateTo(1.0f);
    }

    public void setScene(q qVar) {
        this.mScene = qVar;
        this.mScene.a(isRtl());
        rebuildScene();
    }

    @Override // android.support.constraint.ConstraintLayout
    public void setState(int i, int i2, int i3) {
        setState(TransitionState.SETUP);
        this.mCurrentState = i;
        this.mBeginState = -1;
        this.mEndState = -1;
        if (this.mConstraintLayoutSpec != null) {
            this.mConstraintLayoutSpec.a(i, i2, i3);
            return;
        }
        q qVar = this.mScene;
        if (qVar == null) {
            return;
        }
        qVar.c(i).c(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setState(TransitionState transitionState) {
        if (transitionState == TransitionState.FINISHED && this.mCurrentState == -1) {
            return;
        }
        TransitionState transitionState2 = this.mTransitionState;
        this.mTransitionState = transitionState;
        if (transitionState2 == TransitionState.MOVING && transitionState == TransitionState.MOVING) {
            fireTransitionChange();
        }
        int i = AnonymousClass2.f1070a[transitionState2.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 || transitionState != TransitionState.FINISHED) {
                return;
            }
            fireTransitionCompleted();
            return;
        }
        if (transitionState == TransitionState.MOVING) {
            fireTransitionChange();
        }
        if (transitionState != TransitionState.FINISHED) {
            return;
        }
        fireTransitionCompleted();
    }

    public void setTransition(int i) {
        if (this.mScene != null) {
            q.a transition = getTransition(i);
            this.mBeginState = transition.d();
            this.mEndState = transition.c();
            if (!isAttachedToWindow()) {
                if (this.mStateCache == null) {
                    this.mStateCache = new f();
                }
                this.mStateCache.b(this.mBeginState);
                this.mStateCache.a(this.mEndState);
                return;
            }
            float f2 = Float.NaN;
            int i2 = this.mCurrentState;
            float f3 = 0.0f;
            if (i2 == this.mBeginState) {
                f2 = 0.0f;
            } else if (i2 == this.mEndState) {
                f2 = 1.0f;
            }
            this.mScene.a(transition);
            this.mModel.a(this.mLayoutWidget, this.mScene.c(this.mBeginState), this.mScene.c(this.mEndState));
            rebuildScene();
            if (!Float.isNaN(f2)) {
                f3 = f2;
            }
            this.mTransitionLastPosition = f3;
            if (!Float.isNaN(f2)) {
                setProgress(f2);
                return;
            }
            String str = android.support.constraint.motion.a.a() + " transitionToStart ";
            transitionToStart();
        }
    }

    public void setTransition(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new f();
            }
            this.mStateCache.b(i);
            this.mStateCache.a(i2);
            return;
        }
        q qVar = this.mScene;
        if (qVar == null) {
            return;
        }
        this.mBeginState = i;
        this.mEndState = i2;
        qVar.a(i, i2);
        this.mModel.a(this.mLayoutWidget, this.mScene.c(i), this.mScene.c(i2));
        rebuildScene();
        this.mTransitionLastPosition = 0.0f;
        transitionToStart();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setTransition(q.a aVar) {
        this.mScene.a(aVar);
        setState(TransitionState.SETUP);
        float f2 = this.mCurrentState == this.mScene.e() ? 1.0f : 0.0f;
        this.mTransitionLastPosition = f2;
        this.mTransitionPosition = f2;
        this.mTransitionGoalPosition = f2;
        this.mTransitionLastTime = aVar.b(1) ? -1L : getNanoTime();
        int d2 = this.mScene.d();
        int e2 = this.mScene.e();
        if (d2 == this.mBeginState && e2 == this.mEndState) {
            return;
        }
        this.mBeginState = d2;
        this.mEndState = e2;
        this.mScene.a(this.mBeginState, this.mEndState);
        this.mModel.a(this.mLayoutWidget, this.mScene.c(this.mBeginState), this.mScene.c(this.mEndState));
        this.mModel.b(this.mBeginState, this.mEndState);
        this.mModel.a();
        rebuildScene();
    }

    public void setTransitionDuration(int i) {
        q qVar = this.mScene;
        if (qVar == null) {
            Log.e(TAG, "MotionScene not defined");
        } else {
            qVar.d(i);
        }
    }

    public void setTransitionListener(g gVar) {
        this.mTransitionListener = gVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.mStateCache == null) {
            this.mStateCache = new f();
        }
        this.mStateCache.a(bundle);
        if (isAttachedToWindow()) {
            this.mStateCache.a();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return android.support.constraint.motion.a.a(context, this.mBeginState) + "->" + android.support.constraint.motion.a.a(context, this.mEndState) + " (pos:" + this.mTransitionLastPosition + " Dpos/Dt:" + this.mLastVelocity;
    }

    public void touchAnimateTo(int i, float f2, float f3) {
        Interpolator interpolator;
        if (this.mScene == null || this.mTransitionLastPosition == f2) {
            return;
        }
        this.mTemporalInterpolator = true;
        this.mAnimationStartTime = getNanoTime();
        this.mTransitionDuration = this.mScene.g() / 1000.0f;
        this.mTransitionGoalPosition = f2;
        this.mInTransition = true;
        if (i != 0 && i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        if (!willJump(f3, this.mTransitionLastPosition, this.mScene.j())) {
                            this.mStopLogic.a(this.mTransitionLastPosition, f2, f3, this.mTransitionDuration, this.mScene.j(), this.mScene.k());
                            this.mLastVelocity = 0.0f;
                        }
                    }
                }
                this.mDecelerateLogic.a(f3, this.mTransitionLastPosition, this.mScene.j());
                interpolator = this.mDecelerateLogic;
                this.mInterpolator = interpolator;
            }
            this.mTransitionInstantly = false;
            this.mAnimationStartTime = getNanoTime();
            invalidate();
        }
        if (i == 1) {
            f2 = 0.0f;
        } else if (i == 2) {
            f2 = 1.0f;
        }
        this.mStopLogic.a(this.mTransitionLastPosition, f2, f3, this.mTransitionDuration, this.mScene.j(), this.mScene.k());
        int i2 = this.mCurrentState;
        this.mTransitionGoalPosition = f2;
        this.mCurrentState = i2;
        interpolator = this.mStopLogic;
        this.mInterpolator = interpolator;
        this.mTransitionInstantly = false;
        this.mAnimationStartTime = getNanoTime();
        invalidate();
    }

    public void transitionToEnd() {
        animateTo(1.0f);
    }

    public void transitionToStart() {
        animateTo(0.0f);
    }

    public void transitionToState(int i) {
        if (isAttachedToWindow()) {
            transitionToState(i, -1, -1);
            return;
        }
        if (this.mStateCache == null) {
            this.mStateCache = new f();
        }
        this.mStateCache.a(i);
    }

    public void transitionToState(int i, int i2, int i3) {
        int a2;
        q qVar = this.mScene;
        if (qVar != null && qVar.f1092a != null && (a2 = this.mScene.f1092a.a(this.mCurrentState, i, i2, i3)) != -1) {
            i = a2;
        }
        int i4 = this.mCurrentState;
        if (i4 == i) {
            return;
        }
        if (this.mBeginState == i) {
            animateTo(0.0f);
        } else if (this.mEndState == i) {
            animateTo(1.0f);
        } else {
            this.mEndState = i;
            if (i4 != -1) {
                setTransition(i4, i);
                animateTo(1.0f);
                this.mTransitionLastPosition = 0.0f;
                transitionToEnd();
                return;
            }
            this.mTemporalInterpolator = false;
            this.mTransitionGoalPosition = 1.0f;
            this.mTransitionPosition = 0.0f;
            this.mTransitionLastPosition = 0.0f;
            this.mTransitionLastTime = getNanoTime();
            this.mAnimationStartTime = getNanoTime();
            this.mTransitionInstantly = false;
            this.mInterpolator = null;
            this.mTransitionDuration = this.mScene.g() / 1000.0f;
            this.mBeginState = -1;
            this.mScene.a(this.mBeginState, this.mEndState);
            this.mScene.d();
            int childCount = getChildCount();
            this.mFrameArrayList.clear();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                this.mFrameArrayList.put(childAt, new n(childAt));
            }
            this.mInTransition = true;
            this.mModel.a(this.mLayoutWidget, null, this.mScene.c(i));
            rebuildScene();
            this.mModel.b();
            computeCurrentPositions();
            int width = getWidth();
            int height = getHeight();
            for (int i6 = 0; i6 < childCount; i6++) {
                n nVar = this.mFrameArrayList.get(getChildAt(i6));
                this.mScene.a(nVar);
                nVar.a(width, height, this.mTransitionDuration, getNanoTime());
            }
            float i7 = this.mScene.i();
            if (i7 != 0.0f) {
                float f2 = Float.MAX_VALUE;
                float f3 = -3.4028235E38f;
                for (int i8 = 0; i8 < childCount; i8++) {
                    n nVar2 = this.mFrameArrayList.get(getChildAt(i8));
                    float b2 = nVar2.b() + nVar2.a();
                    f2 = Math.min(f2, b2);
                    f3 = Math.max(f3, b2);
                }
                for (int i9 = 0; i9 < childCount; i9++) {
                    n nVar3 = this.mFrameArrayList.get(getChildAt(i9));
                    float a3 = nVar3.a();
                    float b3 = nVar3.b();
                    nVar3.f = 1.0f / (1.0f - i7);
                    nVar3.e = i7 - ((((a3 + b3) - f2) * i7) / (f3 - f2));
                }
            }
            this.mTransitionPosition = 0.0f;
            this.mTransitionLastPosition = 0.0f;
            this.mInTransition = true;
            invalidate();
        }
    }

    public void updateState() {
        this.mModel.a(this.mLayoutWidget, this.mScene.c(this.mBeginState), this.mScene.c(this.mEndState));
        rebuildScene();
    }

    public void updateState(int i, android.support.constraint.c cVar) {
        q qVar = this.mScene;
        if (qVar != null) {
            qVar.a(i, cVar);
        }
        updateState();
        if (this.mCurrentState == i) {
            cVar.c(this);
        }
    }
}
