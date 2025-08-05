package com.taobao.android.dinamicx.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes5.dex */
public class DXNativePageIndicator extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int IMAGE_VIEW_TYPE;
    private int currentIndex;
    private boolean isLineDisplayType;
    private int itemMargin;
    private int itemRoundDiameter;
    private int itemSelectedBorderColor;
    private int itemSelectedBorderWidth;
    private int itemUnSelectedBorderColor;
    private int itemUnSelectedBorderWidth;
    private int lineItemHeight;
    private int lineItemWidth;
    public final a recycledPool;
    private GradientDrawable selectedDrawable;
    private GradientDrawable unselectedDrawable;

    static {
        kge.a(2118217310);
    }

    public static /* synthetic */ Object ipc$super(DXNativePageIndicator dXNativePageIndicator, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 64333381) {
            if (hashCode == 1273305472) {
                super.removeViewAt(((Number) objArr[0]).intValue());
                return null;
            } else if (hashCode != 1502719299) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Integer(super.getChildCount());
            }
        }
        return super.getChildAt(((Number) objArr[0]).intValue());
    }

    public DXNativePageIndicator(Context context) {
        super(context);
        this.currentIndex = -1;
        this.recycledPool = new a();
        this.IMAGE_VIEW_TYPE = 1;
        init();
    }

    public DXNativePageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.currentIndex = -1;
        this.recycledPool = new a();
        this.IMAGE_VIEW_TYPE = 1;
        init();
    }

    public DXNativePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.currentIndex = -1;
        this.recycledPool = new a();
        this.IMAGE_VIEW_TYPE = 1;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setOrientation(0);
        setGravity(17);
    }

    private boolean isLineDisplayTypeDrawableInValid(GradientDrawable gradientDrawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f369e35a", new Object[]{this, gradientDrawable})).booleanValue() : (!this.isLineDisplayType || gradientDrawable == null || gradientDrawable.getIntrinsicWidth() == this.lineItemWidth) ? false : true;
    }

    public void setSelectedDrawable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a6c761", new Object[]{this, new Integer(i)});
            return;
        }
        GradientDrawable gradientDrawable = this.selectedDrawable;
        if (gradientDrawable == null || isLineDisplayTypeDrawableInValid(gradientDrawable)) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(!this.isLineDisplayType ? 1 : 0);
            gradientDrawable2.setColor(i);
            gradientDrawable2.setSize(this.isLineDisplayType ? this.lineItemWidth : this.itemRoundDiameter, this.isLineDisplayType ? this.lineItemHeight : this.itemRoundDiameter);
            gradientDrawable2.setCornerRadius((this.isLineDisplayType ? this.lineItemHeight : this.itemRoundDiameter) / 2.0f);
            gradientDrawable2.setStroke(this.itemSelectedBorderWidth, this.itemSelectedBorderColor);
            this.selectedDrawable = gradientDrawable2;
            return;
        }
        this.selectedDrawable.setColor(i);
    }

    public void setUnselectedDrawable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c239cae8", new Object[]{this, new Integer(i)});
            return;
        }
        GradientDrawable gradientDrawable = this.unselectedDrawable;
        if (gradientDrawable == null || isLineDisplayTypeDrawableInValid(gradientDrawable)) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(!this.isLineDisplayType ? 1 : 0);
            gradientDrawable2.setColor(i);
            gradientDrawable2.setSize(this.isLineDisplayType ? this.lineItemWidth : this.itemRoundDiameter, this.isLineDisplayType ? this.lineItemHeight : this.itemRoundDiameter);
            gradientDrawable2.setCornerRadius((this.isLineDisplayType ? this.lineItemHeight : this.itemRoundDiameter) / 2.0f);
            gradientDrawable2.setStroke(this.itemUnSelectedBorderWidth, this.itemUnSelectedBorderColor);
            this.unselectedDrawable = gradientDrawable2;
            return;
        }
        this.unselectedDrawable.setColor(i);
    }

    public void setSelectedView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a6a33a", new Object[]{this, new Integer(i)});
        } else if (this.currentIndex == i || i >= getChildCount()) {
        } else {
            int i2 = this.currentIndex;
            if (i2 != -1) {
                ((ImageView) getChildAt(i2)).setImageDrawable(this.unselectedDrawable);
            }
            ImageView imageView = (ImageView) getChildAt(i);
            if (imageView != null) {
                imageView.setImageDrawable(this.selectedDrawable);
            } else {
                s sVar = new s("dinamicx");
                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_RENDER, DXMonitorConstant.RENDER_FLATTEN_CRASH, s.DXERROR_RENDER_PAGE_INDICATOR_CRASH_ERROR);
                aVar.e = "this.getChildCount(): " + getChildCount() + " index: " + i + " currentIndex: " + this.currentIndex;
                sVar.c.add(aVar);
                com.taobao.android.dinamicx.monitor.b.a(sVar);
            }
            this.currentIndex = i;
        }
    }

    public void addChildViews(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb9f31a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (getChildCount() > i) {
            for (int childCount = getChildCount() - 1; childCount >= i; childCount--) {
                recycleView(childCount);
            }
        }
        for (int i3 = 0; i3 < i; i3++) {
            ImageView imageView = null;
            if (i3 < getChildCount()) {
                imageView = (ImageView) getChildAt(i3);
            }
            if (imageView == null) {
                imageView = (ImageView) this.recycledPool.a(1);
                if (imageView == null) {
                    imageView = new ImageView(getContext());
                }
                addView(imageView);
            }
            if (i3 == i2) {
                imageView.setImageDrawable(this.selectedDrawable);
                this.currentIndex = i2;
            } else {
                imageView.setImageDrawable(this.unselectedDrawable);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.isLineDisplayType ? this.lineItemWidth : this.itemRoundDiameter, this.isLineDisplayType ? this.lineItemHeight : this.itemRoundDiameter);
            if (i3 != i - 1) {
                layoutParams.rightMargin = this.itemMargin;
            } else {
                layoutParams.rightMargin = 0;
            }
            imageView.setLayoutParams(layoutParams);
        }
    }

    public void setItemSmall(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a8072a", new Object[]{this, new Integer(i)});
        } else if (i >= getChildCount()) {
        } else {
            ImageView imageView = (ImageView) getChildAt(i);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "scaleY", 1.0f, 0.5f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 0.5f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.setDuration(50L);
            animatorSet.start();
        }
    }

    public void setItemNormal(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb900", new Object[]{this, new Integer(i)});
        } else if (i >= getChildCount()) {
        } else {
            ImageView imageView = (ImageView) getChildAt(i);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "scaleY", 0.5f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, "scaleX", 0.5f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.setDuration(50L);
            animatorSet.start();
        }
    }

    public void setLineDisplayType(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce8edd27", new Object[]{this, new Boolean(z)});
        } else {
            this.isLineDisplayType = z;
        }
    }

    public void setItemLineDisplayTypeSize(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3826c68", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (!this.isLineDisplayType || i <= 0 || i2 <= 0 || i3 <= 0) {
        } else {
            this.lineItemWidth = Math.max(0, (i2 - ((i - 1) * this.itemMargin)) / i);
            this.lineItemHeight = i3;
        }
    }

    public int getCurrentIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb85d649", new Object[]{this})).intValue() : this.currentIndex;
    }

    public void setItemRoundDiameter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772f7b76", new Object[]{this, new Integer(i)});
        } else {
            this.itemRoundDiameter = i;
        }
    }

    public int getItemRoundDiameter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6551eaac", new Object[]{this})).intValue() : this.itemRoundDiameter;
    }

    public void setItemMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7a5499", new Object[]{this, new Integer(i)});
        } else {
            this.itemMargin = i;
        }
    }

    public int getItemMargin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a22b91", new Object[]{this})).intValue() : this.itemMargin;
    }

    public GradientDrawable getSelectedDrawable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("3e0358d4", new Object[]{this}) : this.selectedDrawable;
    }

    public GradientDrawable getUnselectedDrawable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("e5b6909b", new Object[]{this}) : this.unselectedDrawable;
    }

    private void recycleView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3b0684", new Object[]{this, new Integer(i)});
        } else if (i >= super.getChildCount()) {
        } else {
            View childAt = super.getChildAt(i);
            super.removeViewAt(i);
            this.recycledPool.a(1, childAt);
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private SparseArray<ArrayList<View>> f11947a = new SparseArray<>();
        private SparseIntArray b = new SparseIntArray();

        static {
            kge.a(175949144);
        }

        public View a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("46aa9b1d", new Object[]{this, new Integer(i)});
            }
            ArrayList<View> arrayList = this.f11947a.get(i);
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            int size = arrayList.size() - 1;
            View view = arrayList.get(size);
            arrayList.remove(size);
            return view;
        }

        public void a(int i, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11131157", new Object[]{this, new Integer(i), view});
                return;
            }
            ArrayList<View> b = b(i);
            if (this.b.get(i) <= b.size()) {
                return;
            }
            b.add(view);
        }

        private ArrayList<View> b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("b2faef14", new Object[]{this, new Integer(i)});
            }
            ArrayList<View> arrayList = this.f11947a.get(i);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f11947a.put(i, arrayList);
                if (this.b.indexOfKey(i) < 0) {
                    this.b.put(i, 10);
                }
            }
            return arrayList;
        }
    }

    public int getItemSelectedBorderColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7815cdad", new Object[]{this})).intValue() : this.itemSelectedBorderColor;
    }

    public void setItemSelectedBorderColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858dbf95", new Object[]{this, new Integer(i)});
        } else {
            this.itemSelectedBorderColor = i;
        }
    }

    public int getItemSelectedBorderWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fef0e290", new Object[]{this})).intValue() : this.itemSelectedBorderWidth;
    }

    public void setItemSelectedBorderWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da154712", new Object[]{this, new Integer(i)});
        } else {
            this.itemSelectedBorderWidth = i;
        }
    }

    public int getItemUnSelectedBorderColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f8478914", new Object[]{this})).intValue() : this.itemUnSelectedBorderColor;
    }

    public void setItemUnSelectedBorderColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c6de0e", new Object[]{this, new Integer(i)});
        } else {
            this.itemUnSelectedBorderColor = i;
        }
    }

    public int getItemUnSelectedBorderWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7f229df7", new Object[]{this})).intValue() : this.itemUnSelectedBorderWidth;
    }

    public void setItemUnSelectedBorderWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4e658b", new Object[]{this, new Integer(i)});
        } else {
            this.itemUnSelectedBorderWidth = i;
        }
    }
}
