package com.taobao.android.trade.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.jkp;
import tb.kge;

/* loaded from: classes6.dex */
public class EllipsizedView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_HORIZONTAL_SPACE = 3;
    private ContentView contentView;
    private View ellipsizeView;
    private int horizontalSpace;
    private int maxVisibleNum;

    static {
        kge.a(95395498);
    }

    public EllipsizedView(Context context) {
        this(context, null);
    }

    public EllipsizedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EllipsizedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.maxVisibleNum = -1;
        init(context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r7 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r7 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        r7.recycle();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void init(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.trade.ui.widget.EllipsizedView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            r2 = 1
            r1[r2] = r6
            r6 = 2
            r1[r6] = r7
            java.lang.String r6 = "16013b5d"
            r0.ipc$dispatch(r6, r1)
            return
        L18:
            r0 = 1077936128(0x40400000, float:3.0)
            r1 = -1
            if (r6 == 0) goto L57
            if (r7 == 0) goto L57
            int[] r3 = com.taobao.taobao.R.styleable.TradeEllipsizedView
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r3)
            int r3 = com.taobao.taobao.R.styleable.TradeEllipsizedView_trade_horizontal_space     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            int r4 = tb.jkp.a(r6, r0)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            int r3 = r7.getDimensionPixelSize(r3, r4)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r5.horizontalSpace = r3     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            int r3 = com.taobao.taobao.R.styleable.TradeEllipsizedView_trade_max_visible_num     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            int r3 = r7.getInt(r3, r1)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r5.maxVisibleNum = r3     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            if (r7 == 0) goto L5f
            goto L4d
        L3c:
            r6 = move-exception
            goto L51
        L3e:
            java.lang.Class<com.taobao.android.trade.ui.widget.EllipsizedView> r3 = com.taobao.android.trade.ui.widget.EllipsizedView.class
            r3.getSimpleName()     // Catch: java.lang.Throwable -> L3c
            int r0 = tb.jkp.a(r6, r0)     // Catch: java.lang.Throwable -> L3c
            r5.horizontalSpace = r0     // Catch: java.lang.Throwable -> L3c
            r5.maxVisibleNum = r1     // Catch: java.lang.Throwable -> L3c
            if (r7 == 0) goto L5f
        L4d:
            r7.recycle()
            goto L5f
        L51:
            if (r7 == 0) goto L56
            r7.recycle()
        L56:
            throw r6
        L57:
            int r7 = tb.jkp.a(r6, r0)
            r5.horizontalSpace = r7
            r5.maxVisibleNum = r1
        L5f:
            r5.setOrientation(r2)
            r7 = 16
            r5.setGravity(r7)
            com.taobao.android.trade.ui.widget.EllipsizedView$ContentView r7 = new com.taobao.android.trade.ui.widget.EllipsizedView$ContentView
            r7.<init>(r6, r5)
            r5.contentView = r7
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r0 = -2
            r7.<init>(r1, r0)
            r2 = 1065353216(0x3f800000, float:1.0)
            r7.weight = r2
            com.taobao.android.trade.ui.widget.EllipsizedView$ContentView r2 = r5.contentView
            r2.setLayoutParams(r7)
            com.taobao.android.trade.ui.widget.EllipsizedView$ContentView r7 = r5.contentView
            int r2 = r5.horizontalSpace
            r7.setHorizontalSpace(r2)
            com.taobao.android.trade.ui.widget.EllipsizedView$ContentView r7 = r5.contentView
            int r2 = r5.maxVisibleNum
            r7.setMaxVisibleNum(r2)
            com.taobao.android.trade.ui.widget.EllipsizedView$ContentView r7 = r5.contentView
            r5.addView(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r0, r1)
            com.taobao.android.trade.ui.widget.EllipsizedView$DefaultEllipsizeView r0 = new com.taobao.android.trade.ui.widget.EllipsizedView$DefaultEllipsizeView
            r0.<init>(r6)
            r0.setLayoutParams(r7)
            r5.setEllipsizeView(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.trade.ui.widget.EllipsizedView.init(android.content.Context, android.util.AttributeSet):void");
    }

    public void setEllipsizeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("130d015b", new Object[]{this, view});
            return;
        }
        View view2 = this.ellipsizeView;
        if (view2 != null) {
            removeView(view2);
        }
        this.ellipsizeView = view;
        this.ellipsizeView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.ellipsizeView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.ellipsizeView.setLayoutParams(layoutParams);
        }
        layoutParams.weight = 0.0f;
        layoutParams.leftMargin = this.horizontalSpace << 1;
        addView(this.ellipsizeView);
    }

    public void setMaxVisibleNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7c0dc26", new Object[]{this, new Integer(i)});
        } else {
            this.maxVisibleNum = i;
        }
    }

    public View getEllipsizeView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8d914325", new Object[]{this}) : this.ellipsizeView;
    }

    public boolean isEllipsizeViewVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe157515", new Object[]{this})).booleanValue();
        }
        View view = this.ellipsizeView;
        return view != null && view.getVisibility() == 0;
    }

    public void addItemView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd20b2", new Object[]{this, view});
        } else {
            this.contentView.addView(view);
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        View view = this.ellipsizeView;
        if (view != null) {
            view.setVisibility(8);
        }
        this.contentView.removeAllViews();
    }

    /* loaded from: classes6.dex */
    public static class ContentView extends ViewGroup {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int horizontalSpace;
        private int maxVisibleNum;
        private EllipsizedView parent;

        static {
            kge.a(-1721182300);
        }

        public ContentView(Context context, EllipsizedView ellipsizedView) {
            super(context);
            this.maxVisibleNum = -1;
            this.parent = ellipsizedView;
        }

        @Override // android.view.View
        public void onMeasure(int i, int i2) {
            int i3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < getChildCount()) {
                View childAt = getChildAt(i4);
                measureChild(childAt, i, i2);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = (i4 == 0 ? measuredWidth : this.horizontalSpace + measuredWidth) + i5;
                if (i7 > size || ((i3 = this.maxVisibleNum) >= 0 && i4 + 1 > i3)) {
                    EllipsizedView ellipsizedView = this.parent;
                    if (ellipsizedView != null && ellipsizedView.getEllipsizeView() != null && this.parent.getEllipsizeView().getVisibility() != 0) {
                        this.parent.getEllipsizeView().setVisibility(0);
                    }
                    while (i4 < getChildCount()) {
                        View childAt2 = getChildAt(i4);
                        childAt2.setVisibility(8);
                        LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
                        layoutParams.f15641a = -1;
                        layoutParams.b = -1;
                        i4++;
                    }
                    setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i5 + getPaddingLeft() + getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(i6 + getPaddingTop() + getPaddingBottom(), 1073741824));
                }
                childAt.setVisibility(0);
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                layoutParams2.f15641a = i7 - measuredWidth;
                layoutParams2.b = getPaddingTop();
                if (measuredHeight > i6) {
                    i6 = measuredHeight;
                }
                i4++;
                i5 = i7;
            }
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i5 + getPaddingLeft() + getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(i6 + getPaddingTop() + getPaddingBottom(), 1073741824));
        }

        public void setMaxVisibleNum(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7c0dc26", new Object[]{this, new Integer(i)});
            } else {
                this.maxVisibleNum = i;
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f15641a >= 0 && layoutParams.b >= 0) {
                    childAt.layout(layoutParams.f15641a, layoutParams.b, layoutParams.f15641a + childAt.getMeasuredWidth(), layoutParams.b + childAt.getMeasuredHeight());
                }
            }
        }

        public void setHorizontalSpace(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f08eb8dc", new Object[]{this, new Integer(i)});
            } else {
                this.horizontalSpace = i;
            }
        }

        @Override // android.view.ViewGroup
        public ViewGroup.LayoutParams generateDefaultLayoutParams() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("6dca2b10", new Object[]{this}) : new LayoutParams(-2, -2);
        }

        @Override // android.view.ViewGroup
        public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("ce603fbe", new Object[]{this, layoutParams}) : new LayoutParams(layoutParams.width, layoutParams.height);
        }

        @Override // android.view.ViewGroup
        public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("84bf71af", new Object[]{this, attributeSet}) : new LayoutParams(getContext(), attributeSet);
        }

        /* loaded from: classes6.dex */
        public static class LayoutParams extends ViewGroup.LayoutParams {

            /* renamed from: a  reason: collision with root package name */
            public int f15641a;
            public int b;

            static {
                kge.a(-461223312);
            }

            public LayoutParams(Context context, AttributeSet attributeSet) {
                super(context, attributeSet);
                this.f15641a = -1;
                this.b = -1;
            }

            public LayoutParams(int i, int i2) {
                super(i, i2);
                this.f15641a = -1;
                this.b = -1;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class DefaultEllipsizeView extends View {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int[] cx;
        public int cy;
        private int dotMargin;
        private int dotRadius;
        public int height;
        private Paint paint;
        public int width;

        static {
            kge.a(-756584469);
        }

        public static /* synthetic */ Object ipc$super(DefaultEllipsizeView defaultEllipsizeView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1117127205) {
                super.onDraw((Canvas) objArr[0]);
                return null;
            } else if (hashCode != 650865254) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            }
        }

        public DefaultEllipsizeView(Context context) {
            this(context, null);
        }

        public DefaultEllipsizeView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public DefaultEllipsizeView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.cx = new int[3];
            init(context);
        }

        private void init(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
                return;
            }
            this.paint = new Paint();
            this.paint.setColor(context.getResources().getColor(R.color.TC_D_D));
            this.paint.setAntiAlias(true);
            this.paint.setStyle(Paint.Style.FILL);
            this.dotMargin = jkp.a(context, 3.0f);
            this.dotRadius = jkp.a(context, 1.5f);
        }

        @Override // android.view.View
        public void onMeasure(int i, int i2) {
            IpChange ipChange = $ipChange;
            int i3 = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            super.onMeasure(i, i2);
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(((this.dotMargin * 3) << 1) + ((this.dotRadius << 1) * 3), 1073741824), i2);
            this.width = getMeasuredWidth();
            this.height = getMeasuredHeight();
            while (true) {
                int[] iArr = this.cx;
                if (i3 < iArr.length) {
                    int i4 = this.dotRadius;
                    iArr[i3] = (((i4 << 1) + this.dotMargin) * i3) + i4;
                    i3++;
                } else {
                    this.cy = this.height / 2;
                    return;
                }
            }
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
                return;
            }
            super.onDraw(canvas);
            while (true) {
                int[] iArr = this.cx;
                if (i >= iArr.length) {
                    return;
                }
                canvas.drawCircle(iArr[i], this.cy, this.dotRadius, this.paint);
                i++;
            }
        }
    }
}
