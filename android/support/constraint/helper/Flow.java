package android.support.constraint.helper;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.VirtualLayout;
import android.support.constraint.c;
import android.support.constraint.solver.widgets.ConstraintWidget;
import android.support.constraint.solver.widgets.a;
import android.support.constraint.solver.widgets.f;
import android.support.constraint.solver.widgets.j;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
public class Flow extends VirtualLayout {
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static final int HORIZONTAL = 0;
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    private static final String TAG = "Flow";
    public static final int VERTICAL = 1;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_NONE = 0;
    private a mFlow;

    public Flow(Context context) {
        super(context);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.constraint.VirtualLayout, android.support.constraint.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mFlow = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_android_orientation) {
                    this.mFlow.a(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_padding) {
                    this.mFlow.K(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingStart) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        this.mFlow.L(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingEnd) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        this.mFlow.M(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingLeft) {
                    this.mFlow.N(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingTop) {
                    this.mFlow.O(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingRight) {
                    this.mFlow.P(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingBottom) {
                    this.mFlow.Q(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_wrapMode) {
                    this.mFlow.F(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.mFlow.B(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.mFlow.C(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.mFlow.b(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.mFlow.v(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.mFlow.u(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.mFlow.A(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.mFlow.e(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.mFlow.g(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.mFlow.i(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.mFlow.h(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.mFlow.j(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalBias) {
                    this.mFlow.f(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.mFlow.D(obtainStyledAttributes.getInt(index, 2));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.mFlow.E(obtainStyledAttributes.getInt(index, 2));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.mFlow.G(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalGap) {
                    this.mFlow.H(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.mFlow.I(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.mFlow;
        validateParams();
    }

    @Override // android.support.constraint.ConstraintHelper
    public void loadParameters(c.a aVar, f fVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.loadParameters(aVar, fVar, layoutParams, sparseArray);
        if (fVar instanceof a) {
            a aVar2 = (a) fVar;
            if (layoutParams.S == -1) {
                return;
            }
            aVar2.a(layoutParams.S);
        }
    }

    @Override // android.support.constraint.ConstraintHelper, android.view.View
    protected void onMeasure(int i, int i2) {
        onMeasure(this.mFlow, i, i2);
    }

    @Override // android.support.constraint.VirtualLayout
    public void onMeasure(j jVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (jVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        jVar.b(mode, size, mode2, size2);
        setMeasuredDimension(jVar.L(), jVar.M());
    }

    @Override // android.support.constraint.ConstraintHelper
    public void resolveRtl(ConstraintWidget constraintWidget, boolean z) {
        this.mFlow.a(z);
    }

    public void setFirstHorizontalBias(float f) {
        this.mFlow.g(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.mFlow.b(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.mFlow.h(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.mFlow.u(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.mFlow.D(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.mFlow.e(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.mFlow.G(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.mFlow.B(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.mFlow.I(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.mFlow.a(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.mFlow.K(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.mFlow.Q(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.mFlow.N(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.mFlow.P(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.mFlow.O(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.mFlow.E(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.mFlow.f(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.mFlow.H(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.mFlow.C(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.mFlow.F(i);
        requestLayout();
    }
}
