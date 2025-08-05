package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.c;
import android.support.constraint.solver.widgets.ConstraintWidget;
import android.support.constraint.solver.widgets.b;
import android.util.AttributeSet;
import android.util.SparseArray;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
public class Barrier extends ConstraintHelper {
    public static final int BOTTOM = 3;
    public static final int END = 6;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int START = 5;
    public static final int TOP = 2;
    private b mBarrier;
    private int mIndicatedType;
    private int mResolvedType;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r7 == 6) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
        if (r7 == 6) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r7 == 6) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateType(android.support.constraint.solver.widgets.ConstraintWidget r6, int r7, boolean r8) {
        /*
            r5 = this;
            r5.mResolvedType = r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 1
            r1 = 0
            r2 = 6
            r3 = 5
            r4 = 17
            if (r7 >= r4) goto L16
            int r7 = r5.mIndicatedType
            if (r7 != r3) goto L13
        L10:
            r5.mResolvedType = r1
            goto L2a
        L13:
            if (r7 != r2) goto L2a
        L15:
            goto L1c
        L16:
            if (r8 == 0) goto L22
            int r7 = r5.mIndicatedType
            if (r7 != r3) goto L1f
        L1c:
            r5.mResolvedType = r0
            goto L2a
        L1f:
            if (r7 != r2) goto L2a
            goto L10
        L22:
            int r7 = r5.mIndicatedType
            if (r7 != r3) goto L27
            goto L10
        L27:
            if (r7 != r2) goto L2a
            goto L15
        L2a:
            boolean r7 = r6 instanceof android.support.constraint.solver.widgets.b
            if (r7 == 0) goto L35
            android.support.constraint.solver.widgets.b r6 = (android.support.constraint.solver.widgets.b) r6
            int r7 = r5.mResolvedType
            r6.a(r7)
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.Barrier.updateType(android.support.constraint.solver.widgets.ConstraintWidget, int, boolean):void");
    }

    public boolean allowsGoneWidget() {
        return this.mBarrier.b();
    }

    public int getMargin() {
        return this.mBarrier.h();
    }

    public int getType() {
        return this.mIndicatedType;
    }

    @Override // android.support.constraint.ConstraintHelper
    protected void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mBarrier = new b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.mBarrier.a(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == R.styleable.ConstraintLayout_Layout_barrierMargin) {
                    this.mBarrier.b(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.mBarrier;
        validateParams();
    }

    @Override // android.support.constraint.ConstraintHelper
    public void loadParameters(c.a aVar, android.support.constraint.solver.widgets.f fVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.loadParameters(aVar, fVar, layoutParams, sparseArray);
        if (fVar instanceof b) {
            b bVar = (b) fVar;
            updateType(bVar, aVar.c.ab, ((android.support.constraint.solver.widgets.e) fVar.l()).M());
            bVar.a(aVar.c.aj);
            bVar.b(aVar.c.ac);
        }
    }

    @Override // android.support.constraint.ConstraintHelper
    public void resolveRtl(ConstraintWidget constraintWidget, boolean z) {
        updateType(constraintWidget, this.mIndicatedType, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.mBarrier.a(z);
    }

    public void setDpMargin(int i) {
        b bVar = this.mBarrier;
        bVar.b((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.mBarrier.b(i);
    }

    public void setType(int i) {
        this.mIndicatedType = i;
    }
}
