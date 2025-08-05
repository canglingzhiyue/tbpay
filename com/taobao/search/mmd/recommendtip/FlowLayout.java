package com.taobao.search.mmd.recommendtip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.t;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class FlowLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean expanded;
    private List<List<View>> mAllViews;
    private int mGravity;
    private boolean mHasHiddenArea;
    private List<Integer> mLineHeight;
    private List<Integer> mLineWidth;
    private int mMaxLines;
    private View mTailView;
    private boolean showFoldButton;

    static {
        kge.a(1913488137);
    }

    public static /* synthetic */ Object ipc$super(FlowLayout flowLayout, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAllViews = new ArrayList();
        this.mLineHeight = new ArrayList();
        this.mLineWidth = new ArrayList();
        this.mMaxLines = Integer.MAX_VALUE;
        this.mTailView = null;
        this.mHasHiddenArea = false;
        this.mGravity = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 3);
    }

    public FlowLayout(Context context) {
        super(context);
        this.mAllViews = new ArrayList();
        this.mLineHeight = new ArrayList();
        this.mLineWidth = new ArrayList();
        this.mMaxLines = Integer.MAX_VALUE;
        this.mTailView = null;
        this.mHasHiddenArea = false;
        this.mGravity = 3;
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
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("6dca2b10", new Object[]{this}) : new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int intValue;
        int i4 = i;
        int i5 = i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i4), new Integer(i5)});
            return;
        }
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        this.mLineHeight.clear();
        View view = this.mTailView;
        if (view != null) {
            measureChild(view, i4, i5);
            i3 = this.mTailView.getMeasuredWidth();
        } else {
            i3 = 0;
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            int i12 = size2;
            View view2 = this.mTailView;
            boolean z = view2 != null && view2 == childAt;
            measureChild(childAt, i4, i5);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int i13 = childCount;
            int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            if (z) {
                i6 = measuredHeight;
            } else {
                if (measuredWidth + i3 > size) {
                    int i14 = ((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin) - i3;
                    marginLayoutParams.width = i14;
                    childAt.setLayoutParams(marginLayoutParams);
                    measuredWidth = i14;
                }
                int i15 = i8 + measuredWidth;
                if (i15 > size) {
                    i10 = Math.max(i8, i10);
                    i11++;
                    i15 = measuredWidth;
                } else {
                    measuredHeight = Math.max(i9, measuredHeight);
                }
                recordLinesHeight(this.mLineHeight, i11, measuredHeight);
                i8 = i15;
                i9 = measuredHeight;
            }
            i7++;
            i4 = i;
            i5 = i2;
            size2 = i12;
            childCount = i13;
        }
        int i16 = size2;
        int min = Math.min(this.mMaxLines, this.mLineHeight.size());
        boolean z2 = (!this.showFoldButton || !this.expanded) ? this.mTailView != null && this.mMaxLines < this.mLineHeight.size() : true;
        int i17 = 0;
        for (int i18 = 0; i18 < min; i18++) {
            if (z2 && i18 == min - 1) {
                intValue = Math.max(this.mLineHeight.get(i18).intValue(), i6);
            } else {
                intValue = this.mLineHeight.get(i18).intValue();
            }
            i17 += intValue;
        }
        if (mode == 1073741824) {
            i10 = size;
        }
        if (mode2 == 1073741824) {
            i17 = i16;
        }
        setMeasuredDimension(i10, i17);
    }

    private void recordLinesHeight(List<Integer> list, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33a500d", new Object[]{this, list, new Integer(i), new Integer(i2)});
        } else if (list == null) {
        } else {
            if (i >= list.size()) {
                list.add(Integer.valueOf(i2));
            } else {
                list.set(i, Integer.valueOf(i2));
            }
        }
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
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(0, 0, 0, 0);
        }
        int width = getWidth();
        calculateLines(width, 0, 0);
        int min = Math.min(this.mAllViews.size(), this.mMaxLines);
        int i6 = 0;
        for (int i7 = 0; i7 < min; i7++) {
            int intValue = this.mLineHeight.get(i7).intValue();
            int calculateLineStart = calculateLineStart(this.mLineWidth.get(i7).intValue(), width);
            for (View view : this.mAllViews.get(i7)) {
                if (view.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int i8 = marginLayoutParams.leftMargin + calculateLineStart;
                    int i9 = marginLayoutParams.topMargin + i6;
                    view.layout(i8, i9, view.getMeasuredWidth() + i8, view.getMeasuredHeight() + i9);
                    calculateLineStart += view.getMeasuredWidth() + marginLayoutParams.rightMargin + marginLayoutParams.leftMargin;
                }
            }
            i6 += intValue;
        }
    }

    private int calculateLineStart(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5fe24522", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if ((this.mGravity & 7) != 1) {
            return 0;
        }
        return (i2 - i) / 2;
    }

    private void calculateLines(int i, int i2, int i3) {
        int i4;
        IpChange ipChange = $ipChange;
        int i5 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("364c8b63", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        ArrayList arrayList2 = arrayList;
        int i6 = i2;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt != this.mTailView) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (marginLayoutParams.leftMargin + measuredWidth + marginLayoutParams.rightMargin + i6 > i) {
                    if (this.mAllViews.size() < this.mMaxLines && arrayList2.size() > 0) {
                        this.mLineHeight.add(Integer.valueOf(i3));
                        this.mLineWidth.add(Integer.valueOf(i6));
                        this.mAllViews.add(arrayList2);
                    }
                    arrayList2 = new ArrayList();
                    i6 = 0;
                }
                i6 += measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                i3 = Math.max(i3, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                if (childAt != this.mTailView) {
                    arrayList2.add(childAt);
                }
            }
        }
        if (this.mAllViews.size() < this.mMaxLines) {
            this.mLineHeight.add(Integer.valueOf(i3));
            this.mLineWidth.add(Integer.valueOf(i6));
            this.mAllViews.add(arrayList2);
            this.mHasHiddenArea = false;
        } else {
            this.mHasHiddenArea = true;
        }
        if ((this.mHasHiddenArea || (this.expanded && this.showFoldButton)) && this.mTailView != null && this.mAllViews.size() > 0) {
            List<List<View>> list = this.mAllViews;
            List<View> list2 = list.get(list.size() - 1);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.mTailView.getLayoutParams();
            int measuredWidth2 = this.mTailView.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
            int measuredWidth3 = getMeasuredWidth();
            if (measuredWidth3 < measuredWidth2) {
                return;
            }
            List<Integer> list3 = this.mLineWidth;
            int intValue = list3.remove(list3.size() - 1).intValue();
            while (true) {
                i4 = intValue + measuredWidth2;
                if (i4 <= measuredWidth3) {
                    break;
                }
                View remove = list2.remove(list2.size() - 1);
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) remove.getLayoutParams();
                intValue -= (remove.getMeasuredWidth() + marginLayoutParams3.leftMargin) + marginLayoutParams3.rightMargin;
            }
            List<Integer> list4 = this.mLineHeight;
            this.mLineHeight.add(Integer.valueOf(Math.max(list4.remove(list4.size() - 1).intValue(), this.mTailView.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin)));
            this.mLineWidth.add(Integer.valueOf(i4));
            list2.add(this.mTailView);
        }
        View view = this.mTailView;
        if (view == null) {
            return;
        }
        if (!this.showFoldButton) {
            view.setRotation(0.0f);
            View view2 = this.mTailView;
            if (!this.mHasHiddenArea) {
                i5 = 8;
            }
            view2.setVisibility(i5);
        } else if (!this.expanded) {
            view.setRotation(0.0f);
            this.mTailView.setVisibility(0);
        } else {
            view.setRotation(180.0f);
            this.mTailView.setVisibility(0);
        }
    }

    public void setMaxLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d1eeff", new Object[]{this, new Integer(i)});
        } else {
            this.mMaxLines = i;
        }
    }

    public void setTailView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0930d74", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.mTailView = view;
            this.mTailView.setVisibility(0);
            t.a(view);
            addView(view);
        }
    }

    public boolean isExpanded() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3991f0e", new Object[]{this})).booleanValue() : this.expanded;
    }

    public void setExpanded(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e8240d2", new Object[]{this, new Boolean(z)});
        } else {
            this.expanded = z;
        }
    }

    public boolean isShowFoldButton() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a5218c5", new Object[]{this})).booleanValue() : this.showFoldButton;
    }

    public void setShowFoldButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d34287fb", new Object[]{this, new Boolean(z)});
        } else {
            this.showFoldButton = z;
        }
    }
}
