package com.taobao.detail.rate.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class FlowLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FlowLayout";
    private int checkIndex;
    private int collapseIndex;
    private boolean isNeedCollapse;
    private List<View> lineViews;
    public List<List<View>> mAllViews;
    public List<Integer> mLineHeight;
    public List<Integer> mLineWidth;
    private int maxLine;
    private boolean openMaxLineFlag;
    private a updateListener;

    /* loaded from: classes7.dex */
    public interface a {
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAllViews = new ArrayList();
        this.mLineHeight = new ArrayList();
        this.mLineWidth = new ArrayList();
        this.lineViews = new ArrayList();
        this.openMaxLineFlag = true;
        this.maxLine = 2;
        this.isNeedCollapse = false;
        this.checkIndex = 0;
        this.collapseIndex = 0;
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context) {
        this(context, null);
    }

    public boolean isOpenMaxLineFlag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e0f8c5b", new Object[]{this})).booleanValue() : this.openMaxLineFlag;
    }

    public void setOpenMaxLineFlag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faac9495", new Object[]{this, new Boolean(z)});
            return;
        }
        this.openMaxLineFlag = z;
        requestLayout();
    }

    public void setCheckIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cac8c30", new Object[]{this, new Integer(i)});
        } else {
            this.checkIndex = i;
        }
    }

    public boolean isNeedReLayout() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12144a48", new Object[]{this})).booleanValue();
        }
        int i2 = this.checkIndex;
        return (i2 == 0 || (i = this.collapseIndex) == 0 || i2 < i) ? false : true;
    }

    public int getCollapseIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cd984a69", new Object[]{this})).intValue() : this.collapseIndex;
    }

    public void setOnUpdateViewListenser(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4077064", new Object[]{this, aVar});
        } else {
            this.updateListener = aVar;
        }
    }

    public void setMaxLine(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4828066", new Object[]{this, new Integer(i)});
        } else {
            this.maxLine = i;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = i;
        IpChange ipChange = $ipChange;
        int i5 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i4), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i5 >= childCount) {
                i3 = size2;
                break;
            }
            View childAt = getChildAt(i5);
            i3 = size2;
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i4, i2);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int i11 = i6 + measuredWidth;
                if (i11 > (size - getPaddingLeft()) - getPaddingRight()) {
                    if (this.openMaxLineFlag && i10 >= this.maxLine - 1) {
                        this.collapseIndex = i5;
                        i8 = Math.max(i8, i6);
                        i9 += i7;
                        this.isNeedCollapse = true;
                        if (this.updateListener != null) {
                            this.updateListener = null;
                        }
                    }
                    i8 = Math.max(i8, i6);
                    i9 += i7;
                    i10++;
                    i11 = measuredWidth;
                } else {
                    measuredHeight = Math.max(i7, measuredHeight);
                }
                if (i5 == childCount - 1) {
                    i9 += measuredHeight;
                    i7 = measuredHeight;
                    i6 = i11;
                    i8 = Math.max(i11, i8);
                } else {
                    i7 = measuredHeight;
                    i6 = i11;
                }
            } else if (i5 == childCount - 1) {
                i9 += i7;
                i8 = Math.max(i6, i8);
            }
            i5++;
            i4 = i;
            size2 = i3;
        }
        if (mode != 1073741824) {
            size = i8 + getPaddingLeft() + getPaddingRight();
        }
        setMeasuredDimension(size, mode2 == 1073741824 ? i3 : i9 + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.mAllViews.clear();
        this.mLineHeight.clear();
        this.mLineWidth.clear();
        this.lineViews.clear();
        int width = getWidth();
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth + i5 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin > (width - getPaddingLeft()) - getPaddingRight()) {
                    if (this.openMaxLineFlag && i7 >= this.maxLine - 1) {
                        break;
                    }
                    this.mLineHeight.add(Integer.valueOf(i6));
                    this.mAllViews.add(this.lineViews);
                    this.mLineWidth.add(Integer.valueOf(i5));
                    i7++;
                    i6 = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin + measuredHeight;
                    this.lineViews = new ArrayList();
                    i5 = 0;
                }
                i5 += measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                i6 = Math.max(i6, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                this.lineViews.add(childAt);
            }
        }
        this.mLineHeight.add(Integer.valueOf(i6));
        this.mLineWidth.add(Integer.valueOf(i5));
        this.mAllViews.add(this.lineViews);
        int paddingTop = getPaddingTop();
        int size = this.mAllViews.size();
        int i9 = paddingTop;
        for (int i10 = 0; i10 < size; i10++) {
            this.lineViews = this.mAllViews.get(i10);
            int intValue = this.mLineHeight.get(i10).intValue();
            int paddingLeft = getPaddingLeft();
            for (int i11 = 0; i11 < this.lineViews.size(); i11++) {
                View view = this.lineViews.get(i11);
                if (view.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int i12 = marginLayoutParams2.leftMargin + paddingLeft;
                    int i13 = marginLayoutParams2.topMargin + i9;
                    view.layout(i12, i13, view.getMeasuredWidth() + i12, view.getMeasuredHeight() + i13);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
            }
            i9 += intValue;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("84bf71af", new Object[]{this, attributeSet}) : new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("6dca2b10", new Object[]{this}) : new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("ce603fbe", new Object[]{this, layoutParams}) : new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public boolean isNeedCollapse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cb4672b8", new Object[]{this})).booleanValue() : this.isNeedCollapse;
    }
}
