package com.taobao.android.live.plugin.atype.flexalocal.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class TaoLiveFlowLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<View> childList;
    public List<Integer> lineNumList;
    private int lineSpacing;
    private Context mContext;
    private int usefulWidth;

    /* loaded from: classes6.dex */
    public class BlankView extends View {
        static {
            kge.a(-104562934);
        }

        public BlankView(Context context) {
            super(context);
        }
    }

    static {
        kge.a(123825909);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveFlowLayout taoLiveFlowLayout, String str, Object... objArr) {
        if (str.hashCode() == 1841965840) {
            return super.generateDefaultLayoutParams();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(TaoLiveFlowLayout taoLiveFlowLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7789e215", new Object[]{taoLiveFlowLayout});
        } else {
            taoLiveFlowLayout.compress();
        }
    }

    public static /* synthetic */ void access$100(TaoLiveFlowLayout taoLiveFlowLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557d47f4", new Object[]{taoLiveFlowLayout});
        } else {
            taoLiveFlowLayout.align();
        }
    }

    public TaoLiveFlowLayout(Context context) {
        this(context, null);
    }

    public TaoLiveFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TaoLiveFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lineSpacing = 0;
        this.childList = new ArrayList();
        this.lineNumList = new ArrayList();
        this.mContext = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TaoLiveFlowLayoutAType);
        this.lineSpacing = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TaoLiveFlowLayoutAType_lineSpacing_AType, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        View view;
        int i3;
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i6 = paddingLeft + paddingRight;
        int i7 = paddingTop;
        int i8 = i6;
        int i9 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    view = childAt;
                    measureChildWithMargins(childAt, i, 0, i2, i7);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i3 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    i4 = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    view = childAt;
                    measureChild(view, i, i2);
                    i3 = 0;
                    i4 = 0;
                }
                int measuredWidth = i3 + view.getMeasuredWidth();
                int measuredHeight = i4 + view.getMeasuredHeight();
                if (i8 + measuredWidth > size) {
                    i7 += i9 + this.lineSpacing;
                    i8 = i6;
                    i5 = 0;
                } else {
                    i5 = i9;
                }
                if (measuredHeight <= i5) {
                    measuredHeight = i5;
                }
                i8 += measuredWidth;
                i9 = measuredHeight;
            }
        }
        if (mode != 1073741824) {
            size2 = i7 + i9 + paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int i23 = i3 - i;
        this.usefulWidth = (i23 - paddingLeft) - paddingRight;
        int i24 = paddingRight + paddingLeft;
        this.lineNumList.clear();
        int i25 = paddingLeft;
        int i26 = i24;
        int i27 = paddingTop;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        while (i28 < getChildCount()) {
            View childAt = getChildAt(i28);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                boolean z2 = layoutParams instanceof ViewGroup.MarginLayoutParams;
                if (z2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = i24;
                    i5 = i28;
                    int i31 = marginLayoutParams.rightMargin + marginLayoutParams.leftMargin;
                    int i32 = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                    i10 = marginLayoutParams.topMargin + i27;
                    i7 = marginLayoutParams.leftMargin + i25 + measuredWidth;
                    i8 = marginLayoutParams.topMargin + i27 + measuredHeight;
                    i11 = i31;
                    i9 = marginLayoutParams.leftMargin + i25;
                    i12 = i32;
                } else {
                    i5 = i28;
                    i6 = i24;
                    i7 = i25 + measuredWidth;
                    i8 = i27 + measuredHeight;
                    i9 = i25;
                    i10 = i27;
                    i11 = 0;
                    i12 = 0;
                }
                int i33 = i11 + measuredWidth;
                int i34 = i12 + measuredHeight;
                int i35 = i9;
                if (i26 + i33 > i23) {
                    this.lineNumList.add(Integer.valueOf(i29));
                    i16 = i27 + i30 + this.lineSpacing;
                    if (z2) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                        i13 = marginLayoutParams2.leftMargin + paddingLeft;
                        int i36 = i16 + marginLayoutParams2.topMargin;
                        i21 = marginLayoutParams2.leftMargin + paddingLeft + measuredWidth;
                        i22 = marginLayoutParams2.topMargin + i16 + measuredHeight;
                        i15 = i6;
                        i18 = paddingLeft;
                        i14 = i16;
                        i16 = i36;
                    } else {
                        i21 = paddingLeft + measuredWidth;
                        i22 = i16 + measuredHeight;
                        i15 = i6;
                        i13 = paddingLeft;
                        i18 = i13;
                        i14 = i16;
                    }
                    i17 = i21;
                    i20 = i22;
                    i19 = 0;
                    i30 = 0;
                } else {
                    i13 = i35;
                    i14 = i27;
                    i15 = i26;
                    i16 = i10;
                    i17 = i7;
                    i18 = i25;
                    i19 = i29;
                    i20 = i8;
                }
                childAt.layout(i13, i16, i17, i20);
                int i37 = i19 + 1;
                if (i34 > i30) {
                    i30 = i34;
                }
                i29 = i37;
                i25 = i18 + i33;
                i27 = i14;
                i26 = i15 + i33;
            } else {
                i5 = i28;
                i6 = i24;
            }
            i28 = i5 + 1;
            i24 = i6;
        }
        this.lineNumList.add(Integer.valueOf(i29));
    }

    public void relayoutToCompress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea35d81", new Object[]{this});
        } else {
            post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.TaoLiveFlowLayout.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TaoLiveFlowLayout.access$000(TaoLiveFlowLayout.this);
                    }
                }
            });
        }
    }

    private void compress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d4eee9", new Object[]{this});
            return;
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (!(getChildAt(i2) instanceof BlankView)) {
                i++;
            }
        }
        View[] viewArr = new View[i];
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (!(childAt instanceof BlankView)) {
                viewArr[i3] = childAt;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iArr[i3] = marginLayoutParams.leftMargin + measuredWidth + marginLayoutParams.rightMargin;
                } else {
                    iArr[i3] = measuredWidth;
                }
                i3++;
            }
        }
        int[] iArr2 = new int[i];
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = iArr[i5];
            int i7 = this.usefulWidth;
            if (i6 <= i7) {
                i7 = iArr[i5];
            }
            iArr2[i5] = i7;
        }
        sortToCompress(viewArr, iArr2);
        removeAllViews();
        for (View view : this.childList) {
            addView(view);
        }
        this.childList.clear();
    }

    private void sortToCompress(View[] viewArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97750cad", new Object[]{this, viewArr, iArr});
            return;
        }
        int length = viewArr.length;
        int i = length + 1;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, i, this.usefulWidth + 1);
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < this.usefulWidth; i3++) {
                iArr2[i2][i3] = 0;
            }
        }
        boolean[] zArr = new boolean[length];
        for (int i4 = 0; i4 < length; i4++) {
            zArr[i4] = false;
        }
        for (int i5 = 1; i5 <= length; i5++) {
            int i6 = i5 - 1;
            for (int i7 = iArr[i6]; i7 <= this.usefulWidth; i7++) {
                iArr2[i5][i7] = iArr2[i6][i7] > iArr2[i6][i7 - iArr[i6]] + iArr[i6] ? iArr2[i6][i7] : iArr2[i6][i7 - iArr[i6]] + iArr[i6];
            }
        }
        int i8 = this.usefulWidth;
        for (int i9 = length; i9 > 0; i9--) {
            int i10 = i9 - 1;
            if (i8 < iArr[i10]) {
                break;
            }
            if (iArr2[i9][i8] == iArr2[i10][i8 - iArr[i10]] + iArr[i10]) {
                zArr[i10] = true;
                i8 -= iArr[i10];
            }
        }
        int i11 = length;
        for (int i12 = 0; i12 < zArr.length; i12++) {
            if (zArr[i12]) {
                this.childList.add(viewArr[i12]);
                i11--;
            }
        }
        if (i11 == 0) {
            return;
        }
        View[] viewArr2 = new View[i11];
        int[] iArr3 = new int[i11];
        int i13 = 0;
        for (int i14 = 0; i14 < zArr.length; i14++) {
            if (!zArr[i14]) {
                viewArr2[i13] = viewArr[i14];
                iArr3[i13] = iArr[i14];
                i13++;
            }
        }
        sortToCompress(viewArr2, iArr3);
    }

    public void relayoutToAlign() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3133e974", new Object[]{this});
        } else {
            post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.TaoLiveFlowLayout.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TaoLiveFlowLayout.access$100(TaoLiveFlowLayout.this);
                    }
                }
            });
        }
    }

    private void align() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6942110c", new Object[]{this});
            return;
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (!(getChildAt(i2) instanceof BlankView)) {
                i++;
            }
        }
        View[] viewArr = new View[i];
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (!(childAt instanceof BlankView)) {
                viewArr[i3] = childAt;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iArr[i3] = marginLayoutParams.leftMargin + measuredWidth + marginLayoutParams.rightMargin;
                } else {
                    iArr[i3] = measuredWidth;
                }
                i3++;
            }
        }
        removeAllViews();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < i) {
            int i8 = iArr[i5] + i7;
            int i9 = this.usefulWidth;
            if (i8 > i9) {
                int i10 = i9 - i7;
                int i11 = i5 - 1;
                int i12 = i11 - i6;
                if (i12 >= 0) {
                    if (i12 > 0) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(i10 / i12, 0);
                        while (i6 < i11) {
                            addView(viewArr[i6]);
                            addView(new BlankView(this.mContext), marginLayoutParams2);
                            i6++;
                        }
                    }
                    addView(viewArr[i11]);
                    i7 = 0;
                    i6 = i5;
                    i5--;
                } else {
                    addView(viewArr[i5]);
                    i6 = i5 + 1;
                    i7 = 0;
                }
            } else {
                i7 += iArr[i5];
            }
            i5++;
        }
        while (i6 < i) {
            addView(viewArr[i6]);
            i6++;
        }
    }

    public void relayoutToCompressAndAlign() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce6c0f", new Object[]{this});
        } else {
            post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.TaoLiveFlowLayout.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TaoLiveFlowLayout.access$000(TaoLiveFlowLayout.this);
                    TaoLiveFlowLayout.access$100(TaoLiveFlowLayout.this);
                }
            });
        }
    }

    public void specifyLines(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b624ffe", new Object[]{this, new Integer(i)});
        } else {
            post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.TaoLiveFlowLayout.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int i2 = i;
                    if (i2 > TaoLiveFlowLayout.this.lineNumList.size()) {
                        i2 = TaoLiveFlowLayout.this.lineNumList.size();
                    }
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        i3 += TaoLiveFlowLayout.this.lineNumList.get(i4).intValue();
                    }
                    ArrayList<View> arrayList = new ArrayList();
                    for (int i5 = 0; i5 < i3; i5++) {
                        arrayList.add(TaoLiveFlowLayout.this.getChildAt(i5));
                    }
                    TaoLiveFlowLayout.this.removeAllViews();
                    for (View view : arrayList) {
                        TaoLiveFlowLayout.this.addView(view);
                    }
                }
            });
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("ce603fbe", new Object[]{this, layoutParams}) : new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("84bf71af", new Object[]{this, attributeSet}) : new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("6dca2b10", new Object[]{this}) : new ViewGroup.MarginLayoutParams(super.generateDefaultLayoutParams());
    }
}
