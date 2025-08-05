package com.taobao.detail.rate.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import tb.kil;
import tb.kqd;

/* loaded from: classes7.dex */
public class XRateFlowLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "XRateFlowView";
    public List<Integer> lineHeights;
    private List<List<View>> mAllLines;
    private int mDefaultLines;
    private int mDefaultSelectedIndex;
    private HashSet<Integer> mExposeSet;
    private boolean mHasInit;
    private int mHorizontalSpacing;
    private boolean mIsFold;
    private boolean mIsMeasureFakerView;
    private a mOuterListener;
    private int mShowLines;
    private int mTotalLines;
    private int mVerticalSpacing;

    /* loaded from: classes7.dex */
    public interface a {
        void a(int i, Object obj);

        void a(boolean z);

        void a(boolean z, boolean z2, boolean z3);
    }

    public static /* synthetic */ Object ipc$super(XRateFlowLayout xRateFlowLayout, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public XRateFlowLayout(Context context) {
        super(context);
        this.mHorizontalSpacing = kil.a(16.0f);
        this.mVerticalSpacing = kil.a(8.0f);
        this.mDefaultLines = Integer.MAX_VALUE;
        this.mExposeSet = new HashSet<>();
        this.mAllLines = new ArrayList();
        this.lineHeights = new ArrayList();
    }

    public XRateFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHorizontalSpacing = kil.a(16.0f);
        this.mVerticalSpacing = kil.a(8.0f);
        this.mDefaultLines = Integer.MAX_VALUE;
        this.mExposeSet = new HashSet<>();
        this.mAllLines = new ArrayList();
        this.lineHeights = new ArrayList();
    }

    public XRateFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHorizontalSpacing = kil.a(16.0f);
        this.mVerticalSpacing = kil.a(8.0f);
        this.mDefaultLines = Integer.MAX_VALUE;
        this.mExposeSet = new HashSet<>();
        this.mAllLines = new ArrayList();
        this.lineHeights = new ArrayList();
    }

    private void clearMeasureParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40d7c3e", new Object[]{this});
            return;
        }
        this.mAllLines.clear();
        this.lineHeights.clear();
        notifyOuterFoldViewVisibilityIfNeed(false, false);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = i;
        IpChange ipChange = $ipChange;
        int i6 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i5), new Integer(i2)});
            return;
        }
        clearMeasureParams();
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i7 >= childCount) {
                i3 = size2;
                break;
            }
            View childAt = getChildAt(i7);
            i3 = size2;
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i11 = childCount;
            int i12 = i7;
            if (childAt.getVisibility() != 8) {
                childAt.measure(getChildMeasureSpec(i5, paddingLeft + paddingRight, layoutParams.width), getChildMeasureSpec(i2, paddingTop + paddingBottom, layoutParams.height));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth + i8 + this.mHorizontalSpacing > size) {
                    this.mAllLines.add(arrayList);
                    this.lineHeights.add(Integer.valueOf(i9));
                    i10 = i10 + i9 + this.mVerticalSpacing;
                    i6 = Math.max(i6, i8 + this.mHorizontalSpacing);
                    arrayList = new ArrayList();
                    if (this.mIsFold && this.mAllLines.size() == this.mDefaultLines) {
                        i4 = i12;
                        if (needForceUnfoldForSelectedIndex(i4)) {
                            notifyOuterExpend();
                            notifyOuterFoldViewVisibilityIfNeed(true, true);
                        } else {
                            this.mHasInit = true;
                            this.mShowLines = this.mAllLines.size();
                            notifyOuterFoldViewVisibilityIfNeed(true, true);
                            break;
                        }
                    } else {
                        i4 = i12;
                    }
                    i8 = 0;
                    i9 = 0;
                } else {
                    i4 = i12;
                }
                arrayList.add(childAt);
                exposeItemDataIfNeed(childAt, i4);
                i8 = i8 + measuredWidth + this.mHorizontalSpacing;
                int max = Math.max(i9, measuredHeight);
                if (i4 == i11 - 1) {
                    this.mAllLines.add(arrayList);
                    this.lineHeights.add(Integer.valueOf(max));
                    i10 = i10 + max + this.mVerticalSpacing;
                    i6 = Math.max(i6, this.mHorizontalSpacing + i8);
                    int size3 = this.mAllLines.size();
                    this.mTotalLines = size3;
                    this.mShowLines = size3;
                    if (this.mAllLines.size() > this.mDefaultLines) {
                        notifyOuterFoldViewVisibilityIfNeed(true, true);
                        i9 = max;
                    }
                }
                i9 = max;
            } else {
                i4 = i12;
            }
            i7 = i4 + 1;
            i5 = i;
            size2 = i3;
            childCount = i11;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824) {
            i6 = size;
        }
        setMeasuredDimension(i6, mode2 == 1073741824 ? i3 : i10 - this.mVerticalSpacing);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int size = this.mAllLines.size();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i5 = paddingLeft;
        for (int i6 = 0; i6 < size; i6++) {
            List<View> list = this.mAllLines.get(i6);
            int intValue = this.lineHeights.get(i6).intValue();
            int i7 = i5;
            for (int i8 = 0; i8 < list.size(); i8++) {
                View view = list.get(i8);
                int measuredWidth = view.getMeasuredWidth() + i7;
                view.layout(i7, paddingTop, measuredWidth, view.getMeasuredHeight() + paddingTop);
                i7 = this.mHorizontalSpacing + measuredWidth;
            }
            paddingTop = paddingTop + intValue + this.mVerticalSpacing;
            i5 = getPaddingLeft();
        }
    }

    private boolean needForceUnfoldForSelectedIndex(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e19e1043", new Object[]{this, new Integer(i)})).booleanValue() : this.mIsMeasureFakerView && !this.mHasInit && this.mDefaultSelectedIndex >= i;
    }

    public void setHasInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b7e588f", new Object[]{this});
        } else {
            this.mHasInit = true;
        }
    }

    private void notifyOuterExpend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3573d777", new Object[]{this});
            return;
        }
        this.mHasInit = true;
        this.mIsFold = false;
        a aVar = this.mOuterListener;
        if (aVar == null) {
            return;
        }
        aVar.a(false);
    }

    private void notifyOuterFoldViewVisibilityIfNeed(boolean z, boolean z2) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26709bc4", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.mIsMeasureFakerView || (aVar = this.mOuterListener) == null) {
        } else {
            aVar.a(z, this.mIsFold, z2);
        }
    }

    public void setHorizontalSpacing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4adbaa3f", new Object[]{this, new Integer(i)});
        } else {
            this.mHorizontalSpacing = i;
        }
    }

    public void setVerticalSpacing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3176f311", new Object[]{this, new Integer(i)});
        } else {
            this.mVerticalSpacing = i;
        }
    }

    public void setDefaultLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68eae09c", new Object[]{this, new Integer(i)});
        } else {
            this.mDefaultLines = i;
        }
    }

    public void setFoldStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f042f8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsFold = z;
        requestLayout();
        invalidate();
    }

    public void setInitParams(int i, int i2, int i3, boolean z, int i4, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a36eaa81", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Integer(i4), new Boolean(z2)});
            return;
        }
        this.mHorizontalSpacing = i2;
        this.mVerticalSpacing = i;
        this.mDefaultLines = i3;
        this.mIsFold = z;
        this.mDefaultSelectedIndex = i4;
        this.mIsMeasureFakerView = z2;
    }

    public void updateUIByAdapter(kqd kqdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da17154", new Object[]{this, kqdVar});
            return;
        }
        removeAllViews();
        for (int i = 0; i < kqdVar.a(); i++) {
            View a2 = kqdVar.a(this, i, kqdVar.c(i));
            a2.setTag(R.layout.rate_ugc_association_tag_flow_view, kqdVar.c(i));
            addView(a2);
        }
    }

    public int getShowLines() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2d1149c6", new Object[]{this})).intValue() : this.mShowLines;
    }

    public int getTotalLines() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b566ba0b", new Object[]{this})).intValue() : this.mTotalLines;
    }

    private void exposeItemDataIfNeed(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6dc2f6c", new Object[]{this, view, new Integer(i)});
        } else if (this.mIsMeasureFakerView || this.mOuterListener == null || this.mExposeSet.contains(Integer.valueOf(i))) {
        } else {
            this.mExposeSet.add(Integer.valueOf(i));
            this.mOuterListener.a(i, view.getTag(R.layout.rate_ugc_association_tag_flow_view));
        }
    }

    public void setFlowViewOuterListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76da64da", new Object[]{this, aVar});
        } else {
            this.mOuterListener = aVar;
        }
    }
}
